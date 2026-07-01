package com.mpesa.qrcode.model;

import com.google.gson.annotations.SerializedName;

public class LanguageTemplate {

    @SerializedName("languagePreference")
    private String languagePreference;

    @SerializedName("merchantCityAlternateLanguage")
    private String merchantCityAlternateLanguage;

    @SerializedName("merchantNameAlternateLanguage")
    private String merchantNameAlternateLanguage;

    public String getLanguagePreference() {
        return this.languagePreference;
    }

    public void setLanguagePreference(String str) {
        this.languagePreference = str;
    }

    public String getMerchantNameAlternateLanguage() {
        return this.merchantNameAlternateLanguage;
    }

    public void setMerchantNameAlternateLanguage(String str) {
        this.merchantNameAlternateLanguage = str;
    }

    public String getMerchantCityAlternateLanguage() {
        return this.merchantCityAlternateLanguage;
    }

    public void setMerchantCityAlternateLanguage(String str) {
        this.merchantCityAlternateLanguage = str;
    }
}
