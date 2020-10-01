package com.diogomoreno.orama.entities;

import com.diogomoreno.orama.entities.specification.Specification;
import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class FundResource extends RealmObject {

    @SerializedName("initial_date")
    Date initialDate;

    Fees fees;

    @SerializedName("is_simple")
    boolean simple;

    @SerializedName("description_seo")
    String descriptionSeo;

    Operability operability;

    @SerializedName("full_name")
    String fullName;

    @SerializedName("opening_date")
    Date openingDate;

    @PrimaryKey
    long id;

    @SerializedName("is_closed")
    boolean isClosed;

    @SerializedName("simple_name")
    String simpleName;


    @SerializedName("target_fund")
    String targetFund;

    @SerializedName("documents")
    RealmList<Document> documents;

    @SerializedName("specification")
    Specification specification;

    @SerializedName("quota_date")
    Date quotaDate;

    @SerializedName("tax_classification")
    String taxClassification;

    @SerializedName("cnpj")
    String cnpj;

    Description description;

//    PerformanceVideos performanceVideos;

    @SerializedName("is_active")
    boolean active;

    Benchmark benchmark;

    @SerializedName("orama_standard")
    boolean oramaStandard;

    String slug;

    FundSituation fundSituation;

    @SerializedName("volatility_12m")
    String volatility12M;

//    @SerializedName("strategy_video")
//    String strategyVideo;

//    @SerializedName("insurance_company_code")
//    String insuranceCompanyCode;

    Profitabilities profitabilities;


//    @SerializedName("closed_to_capture_explanation")
//    String closedToCaptureExplanation;


    @SerializedName("closing_date")
    Date closingDate;

    @SerializedName("net_patrimony_12m")
    double netPatrimonyTwelveMonths;

    @SerializedName("is_closed_to_capture")
    boolean closedToCapture;

    @SerializedName("fund_manager")
    FundManager fundManager;

    public Date getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(Date initialDate) {
        this.initialDate = initialDate;
    }

    public Fees getFees() {
        return fees;
    }

    public void setFees(Fees fees) {
        this.fees = fees;
    }

    public boolean isSimple() {
        return simple;
    }

    public void setSimple(boolean simple) {
        this.simple = simple;
    }

    public String getDescriptionSeo() {
        return descriptionSeo;
    }

    public void setDescriptionSeo(String descriptionSeo) {
        this.descriptionSeo = descriptionSeo;
    }

    public Operability getOperability() {
        return operability;
    }

    public void setOperability(Operability operability) {
        this.operability = operability;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(Date openingDate) {
        this.openingDate = openingDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed(boolean closed) {
        isClosed = closed;
    }

    public String getSimpleName() {
        return simpleName;
    }

    public void setSimpleName(String simpleName) {
        this.simpleName = simpleName;
    }

    public String getTargetFund() {
        return targetFund;
    }

    public void setTargetFund(String targetFund) {
        this.targetFund = targetFund;
    }

    public RealmList<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(RealmList<Document> documents) {
        this.documents = documents;
    }

    public Specification getSpecification() {
        return specification;
    }

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public Date getQuotaDate() {
        return quotaDate;
    }

    public void setQuotaDate(Date quotaDate) {
        this.quotaDate = quotaDate;
    }

    public String getTaxClassification() {
        return taxClassification;
    }

    public void setTaxClassification(String taxClassification) {
        this.taxClassification = taxClassification;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Benchmark getBenchmark() {
        return benchmark;
    }

    public void setBenchmark(Benchmark benchmark) {
        this.benchmark = benchmark;
    }

    public boolean isOramaStandard() {
        return oramaStandard;
    }

    public void setOramaStandard(boolean oramaStandard) {
        this.oramaStandard = oramaStandard;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public FundSituation getFundSituation() {
        return fundSituation;
    }

    public void setFundSituation(FundSituation fundSituation) {
        this.fundSituation = fundSituation;
    }

    public String getVolatility12M() {
        return volatility12M;
    }

    public void setVolatility12M(String volatility12M) {
        this.volatility12M = volatility12M;
    }

    public Profitabilities getProfitabilities() {
        return profitabilities;
    }

    public void setProfitabilities(Profitabilities profitabilities) {
        this.profitabilities = profitabilities;
    }

    public Date getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(Date closingDate) {
        this.closingDate = closingDate;
    }

    public double getNetPatrimonyTwelveMonths() {
        return netPatrimonyTwelveMonths;
    }

    public void setNetPatrimonyTwelveMonths(double netPatrimonyTwelveMonths) {
        this.netPatrimonyTwelveMonths = netPatrimonyTwelveMonths;
    }

    public boolean isClosedToCapture() {
        return closedToCapture;
    }

    public void setClosedToCapture(boolean closedToCapture) {
        this.closedToCapture = closedToCapture;
    }

    public FundManager getFundManager() {
        return fundManager;
    }

    public void setFundManager(FundManager fundManager) {
        this.fundManager = fundManager;
    }
}
