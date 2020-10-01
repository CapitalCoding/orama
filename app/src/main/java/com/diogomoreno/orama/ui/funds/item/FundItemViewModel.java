package com.diogomoreno.orama.ui.funds.item;

import androidx.lifecycle.ViewModel;

import com.diogomoreno.orama.entities.FundResource;

public class FundItemViewModel extends ViewModel {
    // TODO: Implement the ViewModel

    FundResource mFundResource;

    public FundResource getmFundResource() {
        return mFundResource;
    }

    public void setmFundResource(FundResource mFundResource) {
        this.mFundResource = mFundResource;
    }
}