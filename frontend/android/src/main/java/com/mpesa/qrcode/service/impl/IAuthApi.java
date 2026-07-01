package com.mpesa.qrcode.service.impl;

import com.alibaba.exthub.config.ExtHubMetaInfoParser;
import com.mpesa.qrcode.model.api.response.AuthResponse;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

interface IAuthApi {
    @FormUrlEncoded
    @POST("token")
    Call<AuthResponse> getAuthToken(@Field("client_id") String str, @Field("client_secret") String str2, @Field("grant_type") String str3, @Field(ExtHubMetaInfoParser.KEY_EXTENSION_SCOPE_CLASS_NAME) String str4);
}
