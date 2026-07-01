package com.mpesa.qrcode.model.api.response;

import com.google.gson.annotations.SerializedName;

public class GeneratedQRItem {

    @SerializedName("code")
    String code;

    @SerializedName("format")
    String format;

    public GeneratedQRItem(String str, String str2) {
        this.format = str;
        this.code = str2;
    }

    public String getFormat() {
        return this.format;
    }

    public String getCode() {
        return this.code;
    }
}
