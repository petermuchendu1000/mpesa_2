package com.mpesa.qrcode.service.impl;

import com.mpesa.qrcode.model.api.response.DecodedQRResponse;
import com.mpesa.qrcode.model.api.response.EncodedQRResponse;
import com.mpesa.qrcode.model.api.response.GeneratedBulkResponse;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

interface IQRApi {
    @POST("/qr/v1/qr-codes/decode")
    Call<DecodedQRResponse> decodeQR(@Body RequestBody requestBody);

    @POST("/qr/v1/qr-codes/encode")
    Call<EncodedQRResponse> encodeQR(@Body RequestBody requestBody);

    @POST("/qr/v1/qr-codes/generate-bulk")
    Call<GeneratedBulkResponse> generateBulk(@Body RequestBody requestBody);
}
