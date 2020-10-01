package com.diogomoreno.orama.ui.funds;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.diogomoreno.orama.R;
import com.diogomoreno.orama.entities.FundResource;
import com.diogomoreno.orama.handler.RealmHandler;
import com.diogomoreno.orama.handler.RetrofitHandler;
import com.diogomoreno.orama.ui.adapter.FundsFilterButtonAdapter;
import com.diogomoreno.orama.ui.adapter.FundsItemAdapter;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DefaultObserver;
import io.reactivex.schedulers.Schedulers;
import io.realm.Realm;

public class ListaDeFundosFragment extends Fragment {

    @BindView(R.id.funds_filter_button_list)
    RecyclerView fundsFilterButtonList;

    @BindView(R.id.funds_renda_fixa_global_list)
    RecyclerView rendaFixaGlobalList;

    @BindView(R.id.funds_swipe_refresh_layout)
    SwipeRefreshLayout swipeRefreshLayout;

    @BindView(R.id.funds_minimum_application_bar)
    SeekBar minimumApplicationSeekBar;

    @BindView(R.id.minimum_application_value)
    TextView minimumApplicationValueTv;


    Realm realm;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        realm = RealmHandler.singleton().getRealmInstance();
    }

    List<FundResource> fundResourceList = new ArrayList<>();
    List<String> filterButtonList = new ArrayList<>();
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_lista_de_fundos, container, false);
        ButterKnife.bind(this, view);

        loadCachedData();

        setupAdapters();

        formatApplicationLimit(0);
        minimumApplicationSeekBar.setEnabled(false);
        minimumApplicationSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                formatApplicationLimit(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                loadApiData();
            }
        });

        if(fundsItemAdapter != null && fundsItemAdapter.getData().isEmpty()) {
            swipeRefreshLayout.setRefreshing(true);
            loadApiData();
        }
        return view;
    }

    public void formatApplicationLimit(int progress){
        double value = 1000.00 * progress;
        Resources res = getResources();
        NumberFormat format = NumberFormat.getCurrencyInstance();
        String text = String.format(res.getString(R.string.minimum_application_placeholder), format.format(value));
        minimumApplicationValueTv.setText(progress == 0 ? "Nenhuma aplicação mínima definida" : text);
    }
    private static final String TAG = "ListaDeFundosFragment";

    private void loadApiData() {
        RetrofitHandler.getSingleton().getOramaService().getFundResource()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new DefaultObserver<List<FundResource>>() {
            @Override
            public void onNext(@NonNull List<FundResource> fundResources) {
                Log.d(TAG, "onNext: Got data");
                loadNewData(fundResources);
            }

            @Override
            public void onError(@NonNull Throwable e) {
                Log.e(TAG, "onError: ", e);
            }

            @Override
            public void onComplete() {
                Log.d(TAG, "onComplete: completed");
            }
        });
    }

    private void loadNewData(List<FundResource> fundResources){
        realm.executeTransaction(new Realm.Transaction() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void execute(Realm realm) {
//                fundResources.stream().forEach(f->f.getProfitabilities().setFundResourceId(f.getId()));
//                fundResources.stream().forEach(f->f.getOperability().setFundResourceId(f.getId()));
                realm.copyToRealmOrUpdate(fundResources);

            }
        });
        loadCachedData();
    }
    private void loadCachedData() {
        realm.executeTransaction(r->{
            List<FundResource> fundResources = r.where(FundResource.class).findAll();
            if(fundResources!= null && !fundResources.isEmpty()) {
                fundResourceList = fundResources;
                if(fundsItemAdapter != null){
                    fundsItemAdapter.setNewData(fundResourceList);
                    swipeRefreshLayout.setRefreshing(false);
                }
            }
        });

        filterButtonList.add("Todos");
        filterButtonList.add("Renda Fixa");
        filterButtonList.add("Estratégias DIferenciadas");
    }
    FundsItemAdapter fundsItemAdapter;
    private void setupAdapters() {

        FundsFilterButtonAdapter fundsFilterButtonAdapter = new FundsFilterButtonAdapter(filterButtonList);
        fundsFilterButtonList.setAdapter(fundsFilterButtonAdapter);

        fundsItemAdapter = new FundsItemAdapter(fundResourceList);
        fundsItemAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                FundResource fundResource = fundsItemAdapter.getItem(position);
                Toast.makeText(getContext(), "Detalhes do fundo "+fundResource.getSlug(), Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(getActivity(), FundItemActivity.class);
                            intent.putExtra("fund_resource_id", fundResource.getId());
                            startActivity(intent);
            }
        });
        rendaFixaGlobalList.setAdapter(fundsItemAdapter);

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



    }
}