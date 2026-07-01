package com.mpesa.qrcode.model.api.response;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class GeneratedBulkResponse {

    @SerializedName("qrList")
    List<GeneratedQRItem> qrList;

    @SerializedName("referenceID")
    String referenceID;

    @SerializedName("responseCode")
    String responseCode;

    @SerializedName("responseMsg")
    String responseMsg;

    public GeneratedBulkResponse(List<GeneratedQRItem> list, String str, String str2, String str3) {
        this.qrList = list;
        this.responseCode = str;
        this.responseMsg = str2;
        this.referenceID = str3;
    }

    public List<GeneratedQRItem> getQrList() {
        return this.qrList;
    }

    public String getResponseCode() {
        return this.responseCode;
    }

    public String getResponseMsg() {
        return this.responseMsg;
    }

    public String getReferenceID() {
        return this.referenceID;
    }
}
