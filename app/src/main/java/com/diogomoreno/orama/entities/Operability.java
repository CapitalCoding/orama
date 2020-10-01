package com.diogomoreno.orama.entities;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Operability extends RealmObject {

    @SerializedName("has_operations_on_thursdays")
    boolean operationsOnThursdays;

    @SerializedName("retrieval_liquidation_days_type")
    String retrievalLiquidationDaysType;

    @SerializedName("application_quotation_days_type")
    String applicationQuotationDaysType;

    @SerializedName("retrieval_quotation_days")
    int retrievalQuotationDays;

    @SerializedName("anticipated_retrieval_quotation_days_type")
    String antecipatedRetrivalQuotationDaysType;

    @SerializedName("anticipated_retrieval_quotation_days_str")
    String antecipatedRetrivalQuotationDaysStr;


    @SerializedName("retrieval_quotation_days_type")
    String retrievalQuotationDaysType;

    @SerializedName("ancipated_retrieval_quotation_days")
    int antecipatedRetrievalQuotationDays;

    @SerializedName("has_oprations_onwednesdays")
    boolean operationOnWednesdays;

    @SerializedName("minimum_balance_permanence")
    double minimumBalancePermanence;

    @SerializedName("has_operations_on_mondays")
    boolean operationsOnMondays;

    @SerializedName("has_grace_period")
    boolean gracePeriod;

    @SerializedName("application_time_limit")
    String applicationTimeLimit;

    @SerializedName("retrieval_time_limit")
    String retrievalTimeLimit;

    @SerializedName("has_operations_on_fridays")
    boolean operationsOnFridays;

    @SerializedName("anticipate_retrieval_liquidation_days")
    int anticipateRetrievalLiquidationDays;

    @SerializedName("minimum_initial_application_amount")
    double minimumInicialApplicationAmount;

    @SerializedName("anticipate_retrieval_liquidation_days_type")
    String anticipateRetrievalLiquidationDaysType;


    @SerializedName("retrieval_space_type")
    String retrievalSpaceType;

    @SerializedName("anticipate_retrieval_liquidation_days_str")
    String anticipateRetrievalLiquidationDaysStr;

    @SerializedName("grace_period_days_str")
    String gracePeriodDaysStr;

    @SerializedName("application_quotation_days_str")
    String applicationQuotationDaysStr;

    @SerializedName("grace_period_in_days")
    int gracePeriodInDays;

    @SerializedName("retrieval_liquidation_days_str")
    String retrievalLiquidationDaysStr;

    @SerializedName("minimum_subsequent_retrieval_amount")
    double minimumSubsequenteRetrievalAmount;

    @SerializedName("retrieval_direct")
    boolean retrievalDirect;

    @SerializedName("retrieval_liquidation_days")
    int retrievalLiquidationDays;

    @SerializedName("application_quotation_days")
    int applicationQuotationDays;

    @SerializedName("max_balance_permanence")
    double maxBalancePermanence;

    @SerializedName("maximum_initial_application_amount")
    double maximumInitialApplicationAmount;

    @SerializedName("has_operations_on_tuesdays")
    boolean operationOnTuesdays;

    @SerializedName("minimum_subsequent_application_amount")
    double minimumSubsequentApplicationAmount;

    public boolean isOperationsOnThursdays() {
        return operationsOnThursdays;
    }

    public void setOperationsOnThursdays(boolean operationsOnThursdays) {
        this.operationsOnThursdays = operationsOnThursdays;
    }

    public String getRetrievalLiquidationDaysType() {
        return retrievalLiquidationDaysType;
    }

    public void setRetrievalLiquidationDaysType(String retrievalLiquidationDaysType) {
        this.retrievalLiquidationDaysType = retrievalLiquidationDaysType;
    }

    public String getApplicationQuotationDaysType() {
        return applicationQuotationDaysType;
    }

    public void setApplicationQuotationDaysType(String applicationQuotationDaysType) {
        this.applicationQuotationDaysType = applicationQuotationDaysType;
    }

    public int getRetrievalQuotationDays() {
        return retrievalQuotationDays;
    }

    public void setRetrievalQuotationDays(int retrievalQuotationDays) {
        this.retrievalQuotationDays = retrievalQuotationDays;
    }

    public String getAntecipatedRetrivalQuotationDaysType() {
        return antecipatedRetrivalQuotationDaysType;
    }

    public void setAntecipatedRetrivalQuotationDaysType(String antecipatedRetrivalQuotationDaysType) {
        this.antecipatedRetrivalQuotationDaysType = antecipatedRetrivalQuotationDaysType;
    }

    public String getAntecipatedRetrivalQuotationDaysStr() {
        return antecipatedRetrivalQuotationDaysStr;
    }

    public void setAntecipatedRetrivalQuotationDaysStr(String antecipatedRetrivalQuotationDaysStr) {
        this.antecipatedRetrivalQuotationDaysStr = antecipatedRetrivalQuotationDaysStr;
    }

    public String getRetrievalQuotationDaysType() {
        return retrievalQuotationDaysType;
    }

    public void setRetrievalQuotationDaysType(String retrievalQuotationDaysType) {
        this.retrievalQuotationDaysType = retrievalQuotationDaysType;
    }

    public int getAntecipatedRetrievalQuotationDays() {
        return antecipatedRetrievalQuotationDays;
    }

    public void setAntecipatedRetrievalQuotationDays(int antecipatedRetrievalQuotationDays) {
        this.antecipatedRetrievalQuotationDays = antecipatedRetrievalQuotationDays;
    }

    public boolean isOperationOnWednesdays() {
        return operationOnWednesdays;
    }

    public void setOperationOnWednesdays(boolean operationOnWednesdays) {
        this.operationOnWednesdays = operationOnWednesdays;
    }

    public double getMinimumBalancePermanence() {
        return minimumBalancePermanence;
    }

    public void setMinimumBalancePermanence(double minimumBalancePermanence) {
        this.minimumBalancePermanence = minimumBalancePermanence;
    }

    public boolean isOperationsOnMondays() {
        return operationsOnMondays;
    }

    public void setOperationsOnMondays(boolean operationsOnMondays) {
        this.operationsOnMondays = operationsOnMondays;
    }

    public boolean isGracePeriod() {
        return gracePeriod;
    }

    public void setGracePeriod(boolean gracePeriod) {
        this.gracePeriod = gracePeriod;
    }

    public String getApplicationTimeLimit() {
        return applicationTimeLimit;
    }

    public void setApplicationTimeLimit(String applicationTimeLimit) {
        this.applicationTimeLimit = applicationTimeLimit;
    }

    public String getRetrievalTimeLimit() {
        return retrievalTimeLimit;
    }

    public void setRetrievalTimeLimit(String retrievalTimeLimit) {
        this.retrievalTimeLimit = retrievalTimeLimit;
    }

    public boolean isOperationsOnFridays() {
        return operationsOnFridays;
    }

    public void setOperationsOnFridays(boolean operationsOnFridays) {
        this.operationsOnFridays = operationsOnFridays;
    }

    public int getAnticipateRetrievalLiquidationDays() {
        return anticipateRetrievalLiquidationDays;
    }

    public void setAnticipateRetrievalLiquidationDays(int anticipateRetrievalLiquidationDays) {
        this.anticipateRetrievalLiquidationDays = anticipateRetrievalLiquidationDays;
    }

    public double getMinimumInicialApplicationAmount() {
        return minimumInicialApplicationAmount;
    }

    public void setMinimumInicialApplicationAmount(double minimumInicialApplicationAmount) {
        this.minimumInicialApplicationAmount = minimumInicialApplicationAmount;
    }

    public String getAnticipateRetrievalLiquidationDaysType() {
        return anticipateRetrievalLiquidationDaysType;
    }

    public void setAnticipateRetrievalLiquidationDaysType(String anticipateRetrievalLiquidationDaysType) {
        this.anticipateRetrievalLiquidationDaysType = anticipateRetrievalLiquidationDaysType;
    }

    public String getRetrievalSpaceType() {
        return retrievalSpaceType;
    }

    public void setRetrievalSpaceType(String retrievalSpaceType) {
        this.retrievalSpaceType = retrievalSpaceType;
    }

    public String getAnticipateRetrievalLiquidationDaysStr() {
        return anticipateRetrievalLiquidationDaysStr;
    }

    public void setAnticipateRetrievalLiquidationDaysStr(String anticipateRetrievalLiquidationDaysStr) {
        this.anticipateRetrievalLiquidationDaysStr = anticipateRetrievalLiquidationDaysStr;
    }

    public String getGracePeriodDaysStr() {
        return gracePeriodDaysStr;
    }

    public void setGracePeriodDaysStr(String gracePeriodDaysStr) {
        this.gracePeriodDaysStr = gracePeriodDaysStr;
    }

    public String getApplicationQuotationDaysStr() {
        return applicationQuotationDaysStr;
    }

    public void setApplicationQuotationDaysStr(String applicationQuotationDaysStr) {
        this.applicationQuotationDaysStr = applicationQuotationDaysStr;
    }

    public int getGracePeriodInDays() {
        return gracePeriodInDays;
    }

    public void setGracePeriodInDays(int gracePeriodInDays) {
        this.gracePeriodInDays = gracePeriodInDays;
    }

    public String getRetrievalLiquidationDaysStr() {
        return retrievalLiquidationDaysStr;
    }

    public void setRetrievalLiquidationDaysStr(String retrievalLiquidationDaysStr) {
        this.retrievalLiquidationDaysStr = retrievalLiquidationDaysStr;
    }

    public double getMinimumSubsequenteRetrievalAmount() {
        return minimumSubsequenteRetrievalAmount;
    }

    public void setMinimumSubsequenteRetrievalAmount(double minimumSubsequenteRetrievalAmount) {
        this.minimumSubsequenteRetrievalAmount = minimumSubsequenteRetrievalAmount;
    }

    public boolean isRetrievalDirect() {
        return retrievalDirect;
    }

    public void setRetrievalDirect(boolean retrievalDirect) {
        this.retrievalDirect = retrievalDirect;
    }

    public int getRetrievalLiquidationDays() {
        return retrievalLiquidationDays;
    }

    public void setRetrievalLiquidationDays(int retrievalLiquidationDays) {
        this.retrievalLiquidationDays = retrievalLiquidationDays;
    }

    public int getApplicationQuotationDays() {
        return applicationQuotationDays;
    }

    public void setApplicationQuotationDays(int applicationQuotationDays) {
        this.applicationQuotationDays = applicationQuotationDays;
    }

    public double getMaxBalancePermanence() {
        return maxBalancePermanence;
    }

    public void setMaxBalancePermanence(double maxBalancePermanence) {
        this.maxBalancePermanence = maxBalancePermanence;
    }

    public double getMaximumInitialApplicationAmount() {
        return maximumInitialApplicationAmount;
    }

    public void setMaximumInitialApplicationAmount(double maximumInitialApplicationAmount) {
        this.maximumInitialApplicationAmount = maximumInitialApplicationAmount;
    }

    public boolean isOperationOnTuesdays() {
        return operationOnTuesdays;
    }

    public void setOperationOnTuesdays(boolean operationOnTuesdays) {
        this.operationOnTuesdays = operationOnTuesdays;
    }

    public double getMinimumSubsequentApplicationAmount() {
        return minimumSubsequentApplicationAmount;
    }

    public void setMinimumSubsequentApplicationAmount(double minimumSubsequentApplicationAmount) {
        this.minimumSubsequentApplicationAmount = minimumSubsequentApplicationAmount;
    }
}
