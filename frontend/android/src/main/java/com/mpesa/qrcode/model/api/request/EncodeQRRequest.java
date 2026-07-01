package com.mpesa.qrcode.model.api.request;

import com.google.gson.annotations.SerializedName;
import com.mpesa.qrcode.model.QRPayload;

public class EncodeQRRequest {

    @SerializedName("market")
    private String market;

    @SerializedName("qrData")
    private QRPayload qrData;

    public EncodeQRRequest(QRPayload qRPayload, String str) {
        this.qrData = qRPayload;
        this.market = str;
    }

    public QRPayload getQrData() {
        return this.qrData;
    }

    public void setQrData(QRPayload qRPayload) {
        this.qrData = qRPayload;
    }

    public String getMarket() {
        return this.market;
    }

    public void setMarket(String str) {
        this.market = str;
    }
}
