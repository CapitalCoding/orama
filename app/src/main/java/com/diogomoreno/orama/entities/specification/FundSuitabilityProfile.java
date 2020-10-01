package com.diogomoreno.orama.entities.specification;

import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class FundSuitabilityProfile extends RealmObject {
    @SerializedName("score_range_order")
    int scoreRangeOrder;
    @PrimaryKey
    String name;

    public int getScoreRangeOrder() {
        return scoreRangeOrder;
    }

    public void setScoreRangeOrder(int scoreRangeOrder) {
        this.scoreRangeOrder = scoreRangeOrder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
