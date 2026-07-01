package com.mpesa.qrcode.model.api.response;

import com.google.gson.annotations.SerializedName;

public class AuthResponse {

    @SerializedName("access_token")
    String accessToken;

    public AuthResponse(String str) {
        this.accessToken = str;
    }

    public String getAccessToken() {
        return this.accessToken;
    }
}
