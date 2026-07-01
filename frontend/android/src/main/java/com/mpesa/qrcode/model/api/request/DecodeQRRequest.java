package com.mpesa.qrcode.model.api.request;

import com.google.gson.annotations.SerializedName;

public class DecodeQRRequest {

    @SerializedName("market")
    private String market;

    @SerializedName("qrString")
    private String qrString;

    public DecodeQRRequest(String str, String str2) {
        this.qrString = str;
        this.market = str2;
    }

    public String getQrString() {
        return this.qrString;
    }

    public void setQrString(String str) {
        this.qrString = str;
    }

    public String getMarket() {
        return this.market;
    }

    public void setMarket(String str) {
        this.market = str;
    }
}
