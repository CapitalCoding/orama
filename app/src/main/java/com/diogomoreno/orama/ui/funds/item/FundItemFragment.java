package com.diogomoreno.orama.ui.funds.item;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.diogomoreno.orama.R;
import com.diogomoreno.orama.entities.FundResource;
import com.diogomoreno.orama.handler.RealmHandler;

import java.text.NumberFormat;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.realm.Realm;


public class FundItemFragment extends Fragment {

    private FundItemViewModel mViewModel;

    @BindView(R.id.fund_item_detail_title)
    TextView fundTitleTv;

    @BindView(R.id.fund_item_detail_type)
    TextView fundTypeTv;

    @BindView(R.id.fund_item_detail_category)
    TextView fundCategoryTv;

    @BindView(R.id.fund_item_detail_month_profit)
    TextView fundMonthProfit;

    @BindView(R.id.fund_item_detail_year_profit)
    TextView fundYearProfit;

    @BindView(R.id.fund_item_detail_twelve_months_profit)
    TextView fundTwelveMonthsProfit;

    @BindView(R.id.fund_item_detail_colors_risk_box)
    LinearLayout colorBox;

    @BindView(R.id.fund_item_detail_min_application)
    TextView fundMinimumApplication;

    @BindView(R.id.fund_item_detail_aditional_application)
    TextView fundAditionalApplication;

    long fundResourceId = -1;
    public FundItemFragment(long fundResourceId) {
        this.fundResourceId = fundResourceId;
    }

    public static FundItemFragment newInstance(long fundResourceId) {
        return new FundItemFragment(fundResourceId);
    }

    Realm realm;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fund_item_fragment, container, false);
        ButterKnife.bind(this,view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(FundItemViewModel.class);

        realm = RealmHandler.singleton().getRealmInstance();
        
        Bundle bundle = getArguments();
        if(fundResourceId == -1){
            Toast.makeText(getContext(), "Houve um erro.", Toast.LENGTH_SHORT).show();
            return;
        }
        realm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                FundResource fundResource = realm.where(FundResource.class).equalTo("id",fundResourceId).findFirst();
                if(fundResource != null){
                    mViewModel.setmFundResource(fundResource);
                    setupView();
                }
            }
        });
    }

    private void setupView() {
        fundTitleTv.setText(mViewModel.mFundResource.getFullName());
        fundTypeTv.setText(mViewModel.getmFundResource().getSpecification().getFundMacroStrategy().getName());
        fundCategoryTv.setText(mViewModel.getmFundResource().getSpecification().getFundMainStrategy().getName());
        fundMonthProfit.setText(String.valueOf(mViewModel.getmFundResource().getProfitabilities().getMonth()));
        fundYearProfit.setText(String.valueOf(mViewModel.getmFundResource().getProfitabilities().getYear()));
        fundTwelveMonthsProfit.setText(String.valueOf(mViewModel.getmFundResource().getProfitabilities().getTwelveMonths()));
        inflateCircleForRisk(mViewModel.getmFundResource().getSpecification().getFundRiskProfile().getScoreRangeOrder());
        NumberFormat format = NumberFormat.getCurrencyInstance();

        fundMinimumApplication.setText(format.format(mViewModel.getmFundResource().getOperability().getMinimumInicialApplicationAmount()));
        fundAditionalApplication.setText(format.format(mViewModel.getmFundResource().getOperability().getMinimumSubsequentApplicationAmount()));


    }

    private static final String TAG = "FundItemFragment";
    public void inflateCircleForRisk(int riskLevel){

        final int childCount = colorBox.getChildCount();
        Log.d(TAG, "inflateCircleForRisk: childcount:"+childCount);
        Log.d(TAG, "inflateCircleForRisk: risk level:"+riskLevel);
        for (int i = 0; i < childCount; i++) {
            ImageView imageView = (ImageView) colorBox.getChildAt(i);
            if((i + 1) == riskLevel){


            }else{
                imageView.setAlpha(0.1f);
            }


        }
    }

}