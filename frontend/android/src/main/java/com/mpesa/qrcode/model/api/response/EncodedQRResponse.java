package com.mpesa.qrcode.model.api.response;

import com.google.gson.annotations.SerializedName;

public class EncodedQRResponse {

    @SerializedName("qrData")
    GeneratedQRItem qrData;

    @SerializedName("referenceID")
    String referenceID;

    @SerializedName("responseCode")
    String responseCode;

    @SerializedName("responseMsg")
    String responseMsg;

    public GeneratedQRItem getQrData() {
        return this.qrData;
    }

    public void setQrData(GeneratedQRItem generatedQRItem) {
        this.qrData = generatedQRItem;
    }

    public String getResponseCode() {
        return this.responseCode;
    }

    public void setResponseCode(String str) {
        this.responseCode = str;
    }

    public String getResponseMsg() {
        return this.responseMsg;
    }

    public void setResponseMsg(String str) {
        this.responseMsg = str;
    }

    public String getReferenceID() {
        return this.referenceID;
    }

    public void setReferenceID(String str) {
        this.referenceID = str;
    }
}
