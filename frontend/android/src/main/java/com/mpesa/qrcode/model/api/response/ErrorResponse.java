package com.mpesa.qrcode.model.api.response;

import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.List;

public class ErrorResponse {

    @SerializedName("Description")
    String description;

    @SerializedName("errors")
    HashMap<String, List<String>> errors;

    @SerializedName("title")
    String title;

    public ErrorResponse(String str, HashMap<String, List<String>> map) {
        this.title = str;
        this.errors = map;
    }

    public String getTitle() {
        return this.title;
    }

    public HashMap<String, List<String>> getErrors() {
        return this.errors;
    }

    public String getDescription() {
        return this.description;
    }
}
