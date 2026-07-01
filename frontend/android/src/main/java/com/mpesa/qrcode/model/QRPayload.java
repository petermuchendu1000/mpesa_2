package com.mpesa.qrcode.model;

import androidx.autofill.HintConstants;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;

public class QRPayload {

    @SerializedName("additionalParameters")
    private AdditionalParameters additionalParameters;

    @SerializedName("amount")
    private BigDecimal amount;

    @SerializedName("countryCode")
    private String countryCode;

    @SerializedName("crc")
    private String crc;

    @SerializedName("creditPartyIdentifier")
    private String creditPartyIdentifier;

    @SerializedName("creditPartyName")
    private String creditPartyName;

    @SerializedName("currencyCode")
    private String currencyCode;
    private LanguageTemplate languageTemplate;

    @SerializedName("merchantCCode")
    private String merchantCCode;

    @SerializedName("merchantLoc")
    private String merchantLoc;

    @SerializedName(HintConstants.AUTOFILL_HINT_POSTAL_CODE)
    private String postalCode;

    @SerializedName("format")
    private String qrFormat;

    @SerializedName("refNo")
    private String refNo;

    @SerializedName("size")
    int size;

    @SerializedName("trxCode")
    private String trxCode;

    @SerializedName("qrVersion")
    private String qrVersion = "02";

    @SerializedName("qrType")
    private String qrType = "02";

    @SerializedName("channelID")
    private String channelID = "00000";

    @SerializedName("networkID")
    private String networkID = "00000";
    private Boolean enableDeepLink = false;

    public String getQrFormat() {
        return this.qrFormat;
    }

    public void setQrFormat(String str) {
        this.qrFormat = str;
    }

    public String getQrVersion() {
        return this.qrVersion;
    }

    public void setQrVersion(String str) {
        this.qrVersion = str;
    }

    public String getQrType() {
        return this.qrType;
    }

    public void setQrType(String str) {
        this.qrType = "02";
    }

    public String getMerchantCCode() {
        return this.merchantCCode;
    }

    public void setMerchantCCode(String str) {
        this.merchantCCode = str;
    }

    public String getChannelID() {
        return this.channelID;
    }

    public void setChannelID(String str) {
        this.channelID = str;
    }

    public String getNetworkID() {
        return this.networkID;
    }

    public void setNetworkID(String str) {
        this.networkID = str;
    }

    public String getTrxCode() {
        return this.trxCode;
    }

    public void setTrxCode(String str) {
        this.trxCode = str;
    }

    public String getCreditPartyIdentifier() {
        return this.creditPartyIdentifier;
    }

    public void setCreditPartyIdentifier(String str) {
        this.creditPartyIdentifier = str;
    }

    public String getCreditPartyName() {
        return this.creditPartyName;
    }

    public void setCreditPartyName(String str) {
        this.creditPartyName = str;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(BigDecimal bigDecimal) {
        this.amount = bigDecimal;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public void setCurrencyCode(String str) {
        this.currencyCode = str;
    }

    public String getRefNo() {
        return this.refNo;
    }

    public void setRefNo(String str) {
        this.refNo = str;
    }

    public String getMerchantLoc() {
        return this.merchantLoc;
    }

    public void setMerchantLoc(String str) {
        this.merchantLoc = str;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public void setPostalCode(String str) {
        this.postalCode = str;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public void setCountryCode(String str) {
        this.countryCode = str;
    }

    public AdditionalParameters getAdditionalParameters() {
        return this.additionalParameters;
    }

    public void setAdditionalParameters(AdditionalParameters additionalParameters) {
        this.additionalParameters = additionalParameters;
    }

    public LanguageTemplate getLanguageTemplate() {
        return this.languageTemplate;
    }

    public void setLanguageTemplate(LanguageTemplate languageTemplate) {
        this.languageTemplate = languageTemplate;
    }

    public String getCrc() {
        return this.crc;
    }

    public void setCrc(String str) {
        this.crc = str;
    }

    public void setSize(int i) {
        this.size = i;
    }

    public Boolean getEnableDeepLink() {
        return this.enableDeepLink;
    }

    public void setEnableDeepLink(Boolean bool) {
        this.enableDeepLink = bool;
    }
}
