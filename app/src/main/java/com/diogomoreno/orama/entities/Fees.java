package com.diogomoreno.orama.entities;

import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Fees extends RealmObject {

    @SerializedName("maximum_administration_fee")
    String maximumAdministrationFee;

    @SerializedName("anticipated_retrieval_fee_value")
    double anticipatedRetrievalFeeValue;

    @SerializedName("administration_fee")
    String administrationFee;

    @SerializedName("anticipated_retrieval_fee")
    String anticipatedRetrievalFee;

    @SerializedName("has_anticipated_retrieval")
    boolean anticipatedRetrieval;

    public String getMaximumAdministrationFee() {
        return maximumAdministrationFee;
    }

    public void setMaximumAdministrationFee(String maximumAdministrationFee) {
        this.maximumAdministrationFee = maximumAdministrationFee;
    }

    public double getAnticipatedRetrievalFeeValue() {
        return anticipatedRetrievalFeeValue;
    }

    public void setAnticipatedRetrievalFeeValue(double anticipatedRetrievalFeeValue) {
        this.anticipatedRetrievalFeeValue = anticipatedRetrievalFeeValue;
    }

    public String getAdministrationFee() {
        return administrationFee;
    }

    public void setAdministrationFee(String administrationFee) {
        this.administrationFee = administrationFee;
    }

    public String getAnticipatedRetrievalFee() {
        return anticipatedRetrievalFee;
    }

    public void setAnticipatedRetrievalFee(String anticipatedRetrievalFee) {
        this.anticipatedRetrievalFee = anticipatedRetrievalFee;
    }

    public boolean isAnticipatedRetrieval() {
        return anticipatedRetrieval;
    }

    public void setAnticipatedRetrieval(boolean anticipatedRetrieval) {
        this.anticipatedRetrieval = anticipatedRetrieval;
    }
}
