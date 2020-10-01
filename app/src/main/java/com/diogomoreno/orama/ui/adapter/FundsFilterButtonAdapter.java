package com.diogomoreno.orama.ui.adapter;

import androidx.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.diogomoreno.orama.R;

import java.util.List;

public class FundsFilterButtonAdapter extends BaseQuickAdapter<String, BaseViewHolder> {

    public FundsFilterButtonAdapter(@Nullable List<String> data) {
        super(R.layout.funds_filter_button_item, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {
        helper.setText(R.id.funds_filter_button_item_btn, item);
    }
}
