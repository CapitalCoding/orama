package com.diogomoreno.orama.ui.adapter;

import androidx.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.diogomoreno.orama.R;
import com.diogomoreno.orama.entities.FundResource;

import java.text.DecimalFormat;
import java.util.List;

public class FundsItemAdapter extends BaseQuickAdapter<FundResource, BaseViewHolder> {
    public FundsItemAdapter( @Nullable List<FundResource> data) {
        super(R.layout.fund_item, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, FundResource item) {
        helper.setText(R.id.fund_item_full_name, item.getSimpleName());

        DecimalFormat format = new DecimalFormat("#.##");
        String formatedDouble = format.format((item.getProfitabilities().getTwelveMonths() * 100));
        helper.setText(R.id.fund_item_percentage_amount_twelve_months,
                formatedDouble+"%"
                );
        helper.setText(R.id.fund_item_aplication_amount, "R$ "+item.getOperability().getMinimumInicialApplicationAmount());

    }
}
