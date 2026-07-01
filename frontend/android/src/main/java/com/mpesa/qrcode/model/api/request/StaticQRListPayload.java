package com.mpesa.qrcode.model.api.request;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class StaticQRListPayload {

    @SerializedName("countryCode")
    String countryCode;

    @SerializedName("format")
    int format;

    @SerializedName("qrList")
    List<QRListItem> qrList;

    @SerializedName("size")
    int size = 100;

    @SerializedName("channelID")
    String channelID = "00000";

    @SerializedName("networkID")
    String networkID = "00000";

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

    public int getFormat() {
        return this.format;
    }

    public void setFormat(int i) {
        this.format = i;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int i) {
        this.size = i;
    }

    public List<QRListItem> getQrList() {
        return this.qrList;
    }

    public void setQrList(List<QRListItem> list) {
        this.qrList = list;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public void setCountryCode(String str) {
        this.countryCode = str;
    }
}
