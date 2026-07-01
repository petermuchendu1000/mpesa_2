package com.mpesa.qrcode.model.api.response;

import com.google.gson.annotations.SerializedName;
import com.mpesa.qrcode.model.QRPayload;

public class DecodedQRResponse {

    @SerializedName(alternate = {"Description"}, value = "description")
    private String description;

    @SerializedName(alternate = {"QrData"}, value = "qrData")
    private QRPayload qrData;

    @SerializedName(alternate = {"ReferenceID"}, value = "referenceID")
    private String referenceID;

    @SerializedName(alternate = {"ResponseCode"}, value = "responseCode")
    private String responseCode;

    @SerializedName(alternate = {"ResponseMsg"}, value = "responseMsg")
    private String responseMsg;

    public QRPayload getQrData() {
        return this.qrData;
    }

    public void setQrData(QRPayload qRPayload) {
        this.qrData = qRPayload;
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

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String str) {
        this.description = str;
    }
}
