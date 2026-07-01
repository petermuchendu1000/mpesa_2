package com.mpesa.qrcode.model.dynamic;

import com.google.gson.annotations.SerializedName;

public class ValueMap {

    @SerializedName(alternate = {"MapValue"}, value = "mapValue")
    String mapValue;

    @SerializedName(alternate = {"MpaValue"}, value = "mpaValue")
    String mpaValue;

    public String getMpaValue() {
        return this.mpaValue;
    }

    public void setMpaValue(String str) {
        this.mpaValue = str;
    }

    public String getMapValue() {
        return this.mapValue;
    }

    public void setMapValue(String str) {
        this.mapValue = str;
    }
}
