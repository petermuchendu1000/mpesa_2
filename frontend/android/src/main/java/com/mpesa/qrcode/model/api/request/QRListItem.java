package com.mpesa.qrcode.model.api.request;

import com.google.gson.annotations.SerializedName;

public class QRListItem {

    @SerializedName("creditPartyIdentifier")
    String creditPartyIdentifier;

    @SerializedName("creditPartyName")
    String creditPartyName;

    @SerializedName("trxCode")
    String trxCode;

    public QRListItem() {
    }

    public QRListItem(String str, String str2, String str3) {
        this.trxCode = str;
        this.creditPartyIdentifier = str2;
        this.creditPartyName = str3;
    }

    public void setTrxCode(String str) {
        this.trxCode = str;
    }

    public void setCreditPartyIdentifier(String str) {
        this.creditPartyIdentifier = str;
    }

    public void setCreditPartyName(String str) {
        this.creditPartyName = str;
    }

    public String getTrxCode() {
        return this.trxCode;
    }

    public String getCreditPartyIdentifier() {
        return this.creditPartyIdentifier;
    }

    public String getCreditPartyName() {
        return this.creditPartyName;
    }
}
