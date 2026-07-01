package com.mpesa.qrcode.model;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.ImtConstants;
import java.math.BigDecimal;

public class AdditionalParameters {

    @SerializedName("additionalConsumerDataRequest")
    private String additionalConsumerDataRequest;

    @SerializedName("cashierID")
    private String cashierID;

    @SerializedName("consumerLabel")
    private String consumerLabel;

    @SerializedName(FirebaseAnalytics.Param.DISCOUNT)
    private BigDecimal discount;

    @SerializedName("discountIndicator")
    private String discountIndicator;

    @SerializedName("email")
    private String email;

    @SerializedName("expiryDateTime")
    private String expiryDateTime;

    @SerializedName("generatedDateTime")
    private String generatedDateTime;

    @SerializedName("loyaltyNo")
    private String loyaltyNo;

    @SerializedName("mobileNumber")
    private String mobileNumber;

    @SerializedName("orgShortCode")
    private String orgShortCode;

    @SerializedName(ImtConstants.KEY_PURPOSE)
    private String purpose;

    @SerializedName("status")
    private String status;

    @SerializedName("storeID")
    private String storeID;

    @SerializedName(FirebaseAnalytics.Param.TAX)
    private BigDecimal tax;

    @SerializedName("terminalID")
    private String terminalID;

    @SerializedName("tipConvenienceFeeIndicator")
    private String tipConvenienceFeeIndicator;

    @SerializedName("valueOfConvenienceFeeFixed")
    private BigDecimal valueOfConvenienceFeeFixed;

    @SerializedName("valueOfConvenienceFeePercentage")
    private String valueOfConvenienceFeePercentage;

    public String getTerminalID() {
        return this.terminalID;
    }

    public void setTerminalID(String str) {
        this.terminalID = str;
    }

    public String getCashierID() {
        return this.cashierID;
    }

    public void setCashierID(String str) {
        this.cashierID = str;
    }

    public String getStoreID() {
        return this.storeID;
    }

    public void setStoreID(String str) {
        this.storeID = str;
    }

    public String getMobileNumber() {
        return this.mobileNumber;
    }

    public void setMobileNumber(String str) {
        this.mobileNumber = str;
    }

    public String getPurpose() {
        return this.purpose;
    }

    public void setPurpose(String str) {
        this.purpose = str;
    }

    public String getLoyaltyNo() {
        return this.loyaltyNo;
    }

    public void setLoyaltyNo(String str) {
        this.loyaltyNo = str;
    }

    public BigDecimal getValueOfConvenienceFeeFixed() {
        return this.valueOfConvenienceFeeFixed;
    }

    public void setValueOfConvenienceFeeFixed(BigDecimal bigDecimal) {
        this.valueOfConvenienceFeeFixed = bigDecimal;
    }

    public BigDecimal getDiscount() {
        return this.discount;
    }

    public void setDiscount(BigDecimal bigDecimal) {
        this.discount = bigDecimal;
    }

    public String getGeneratedDateTime() {
        return this.generatedDateTime;
    }

    public void setGeneratedDateTime(String str) {
        this.generatedDateTime = str;
    }

    public String getExpiryDateTime() {
        return this.expiryDateTime;
    }

    public void setExpiryDateTime(String str) {
        this.expiryDateTime = str;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public BigDecimal getTax() {
        return this.tax;
    }

    public void setTax(BigDecimal bigDecimal) {
        this.tax = bigDecimal;
    }

    public String getOrgShortCode() {
        return this.orgShortCode;
    }

    public void setOrgShortCode(String str) {
        this.orgShortCode = str;
    }

    public String getTipConvenienceFeeIndicator() {
        return this.tipConvenienceFeeIndicator;
    }

    public void setTipConvenienceFeeIndicator(String str) {
        this.tipConvenienceFeeIndicator = str;
    }

    public String getValueOfConvenienceFeePercentage() {
        return this.valueOfConvenienceFeePercentage;
    }

    public void setValueOfConvenienceFeePercentage(String str) {
        this.valueOfConvenienceFeePercentage = str;
    }

    public String getDiscountIndicator() {
        return this.discountIndicator;
    }

    public void setDiscountIndicator(String str) {
        this.discountIndicator = str;
    }

    public String getConsumerLabel() {
        return this.consumerLabel;
    }

    public void setConsumerLabel(String str) {
        this.consumerLabel = str;
    }

    public String getAdditionalConsumerDataRequest() {
        return this.additionalConsumerDataRequest;
    }

    public void setAdditionalConsumerDataRequest(String str) {
        this.additionalConsumerDataRequest = str;
    }
}
