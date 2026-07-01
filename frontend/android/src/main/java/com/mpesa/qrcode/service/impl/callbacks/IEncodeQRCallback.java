package com.mpesa.qrcode.service.impl.callbacks;

import com.mpesa.qrcode.exception.ApiException;
import com.mpesa.qrcode.exception.FieldValidationException;

public interface IEncodeQRCallback {
    void onError(ApiException apiException);

    void onSuccess(String str) throws FieldValidationException;
}
