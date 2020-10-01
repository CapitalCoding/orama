package com.diogomoreno.orama.entities.specification;

import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class FundMainStrategy extends RealmObject {
    String explanation;
    @SerializedName("fund_macro_strategy")
    int fundMacroStrategy;
    @PrimaryKey
    long id;
    String name;

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public int getFundMacroStrategy() {
        return fundMacroStrategy;
    }

    public void setFundMacroStrategy(int fundMacroStrategy) {
        this.fundMacroStrategy = fundMacroStrategy;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
