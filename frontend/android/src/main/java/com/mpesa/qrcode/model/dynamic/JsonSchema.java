package com.mpesa.qrcode.model.dynamic;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class JsonSchema {

    @SerializedName(alternate = {"CRCFormat"}, value = "crcFormat")
    String crcFormat;

    @SerializedName(alternate = {"DeepLinkURI"}, value = "deepLinkURI")
    String deepLinkURI;

    @SerializedName(alternate = {"DraftStep"}, value = "draftStep")
    String draftStep;

    @SerializedName(alternate = {"Fields"}, value = "fields")
    List<SchemaField> fields;

    @SerializedName(alternate = {"IsDeepLink"}, value = "isDeepLink")
    Boolean isDeepLink;

    @SerializedName(alternate = {"IsLegacy"}, value = "isLegacy")
    Boolean isLegacy;

    @SerializedName(alternate = {"Market"}, value = "market")
    String market;

    @SerializedName(alternate = {"MpaBaseVersion"}, value = "mpaBaseVersion")
    String mpaBaseVersion;

    @SerializedName(alternate = {"Network"}, value = "network")
    String network;

    @SerializedName(alternate = {"QRFormatType"}, value = "qrFormatType")
    String qrFormatType;

    @SerializedName(alternate = {"Rank"}, value = "rank")
    String rank;

    @SerializedName(alternate = {"SpecificationFieldRegex"}, value = "specificationFieldRegex")
    String regex;

    @SerializedName(alternate = {"Stage"}, value = "stage")
    String stage;

    @SerializedName(alternate = {"Template"}, value = "template")
    String template;

    public String getTemplate() {
        return this.template;
    }

    public void setTemplate(String str) {
        this.template = str;
    }

    public String getMarket() {
        return this.market;
    }

    public void setMarket(String str) {
        this.market = str;
    }

    public String getNetwork() {
        return this.network;
    }

    public void setNetwork(String str) {
        this.network = str;
    }

    public String getMpaBaseVersion() {
        return this.mpaBaseVersion;
    }

    public void setMpaBaseVersion(String str) {
        this.mpaBaseVersion = str;
    }

    public String getRegex() {
        return this.regex;
    }

    public void setRegex(String str) {
        this.regex = str;
    }

    public String getRank() {
        return this.rank;
    }

    public void setRank(String str) {
        this.rank = str;
    }

    public String getStage() {
        return this.stage;
    }

    public void setStage(String str) {
        this.stage = str;
    }

    public String getDraftStep() {
        return this.draftStep;
    }

    public void setDraftStep(String str) {
        this.draftStep = str;
    }

    public List<SchemaField> getFields() {
        return this.fields;
    }

    public void setFields(List<SchemaField> list) {
        this.fields = list;
    }

    public String getQrFormatType() {
        return this.qrFormatType;
    }

    public void setQrFormatType(String str) {
        this.qrFormatType = str;
    }

    public String getCrcFormat() {
        return this.crcFormat;
    }

    public void setCrcFormat(String str) {
        this.crcFormat = str;
    }

    public Boolean getLegacy() {
        return this.isLegacy;
    }

    public void setLegacy(Boolean bool) {
        this.isLegacy = bool;
    }

    public void setIsDeepLink(Boolean bool) {
        this.isDeepLink = bool;
    }

    public Boolean getIsDeepLink() {
        return this.isDeepLink;
    }

    public void setDeepLinkURI(String str) {
        this.deepLinkURI = str;
    }

    public String getDeepLinkURI() {
        return this.deepLinkURI;
    }
}
