package com.mpesa.qrcode.model.dynamic;

import com.google.gson.annotations.SerializedName;

public class SchemaValidation {

    @SerializedName(alternate = {"Format"}, value = "format")
    String format;

    @SerializedName(alternate = {"Required"}, value = "required")
    Boolean isRequired;

    @SerializedName(alternate = {"LengthMax"}, value = "lengthMax")
    int lengthMax;

    @SerializedName(alternate = {"LengthMin"}, value = "lengthMin")
    int lengthMin;

    @SerializedName(alternate = {"LengthType"}, value = "lengthType")
    String lengthType;

    public Boolean getIsRequired() {
        return this.isRequired;
    }

    public void setIsRequired(Boolean bool) {
        this.isRequired = bool;
    }

    public String getFormat() {
        return this.format;
    }

    public void setFormat(String str) {
        this.format = str;
    }

    public String getLengthType() {
        return this.lengthType;
    }

    public void setLengthType(String str) {
        this.lengthType = str;
    }

    public int getLengthMax() {
        return this.lengthMax;
    }

    public void setLengthMax(int i) {
        this.lengthMax = i;
    }

    public int getLengthMin() {
        return this.lengthMin;
    }

    public void setLengthMin(int i) {
        this.lengthMin = i;
    }
}
