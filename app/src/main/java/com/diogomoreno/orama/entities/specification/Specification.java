package com.diogomoreno.orama.entities.specification;

import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;

public class Specification extends RealmObject {

    @SerializedName("fund_suitability_profile")
    FundSuitabilityProfile fundSuitabilityProfile;
    @SerializedName("fund_risk_profile")
    FundRiskProfile fundRiskProfile;

    @SerializedName("is_qualified")
    boolean qualified;

    @SerializedName("fund_type")
    String fundType;

    @SerializedName("fund_class")
    String fundClass;

    @SerializedName("fund_macro_strategy")
    FundMacroStrategy fundMacroStrategy;

    @SerializedName("fund_class_anbima")
    String fundClassAnbima;

    @SerializedName("fund_main_strategy")
    FundMainStrategy fundMainStrategy;

    public FundSuitabilityProfile getFundSuitabilityProfile() {
        return fundSuitabilityProfile;
    }

    public void setFundSuitabilityProfile(FundSuitabilityProfile fundSuitabilityProfile) {
        this.fundSuitabilityProfile = fundSuitabilityProfile;
    }

    public FundRiskProfile getFundRiskProfile() {
        return fundRiskProfile;
    }

    public void setFundRiskProfile(FundRiskProfile fundRiskProfile) {
        this.fundRiskProfile = fundRiskProfile;
    }

    public boolean isQualified() {
        return qualified;
    }

    public void setQualified(boolean qualified) {
        this.qualified = qualified;
    }

    public String getFundType() {
        return fundType;
    }

    public void setFundType(String fundType) {
        this.fundType = fundType;
    }

    public String getFundClass() {
        return fundClass;
    }

    public void setFundClass(String fundClass) {
        this.fundClass = fundClass;
    }

    public FundMacroStrategy getFundMacroStrategy() {
        return fundMacroStrategy;
    }

    public void setFundMacroStrategy(FundMacroStrategy fundMacroStrategy) {
        this.fundMacroStrategy = fundMacroStrategy;
    }

    public String getFundClassAnbima() {
        return fundClassAnbima;
    }

    public void setFundClassAnbima(String fundClassAnbima) {
        this.fundClassAnbima = fundClassAnbima;
    }

    public FundMainStrategy getFundMainStrategy() {
        return fundMainStrategy;
    }

    public void setFundMainStrategy(FundMainStrategy fundMainStrategy) {
        this.fundMainStrategy = fundMainStrategy;
    }
}
