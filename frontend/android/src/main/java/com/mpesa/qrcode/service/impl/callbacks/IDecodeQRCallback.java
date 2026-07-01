package com.mpesa.qrcode.service.impl.callbacks;

import com.mpesa.qrcode.exception.ApiException;
import com.mpesa.qrcode.model.QRPayload;

public interface IDecodeQRCallback {
    void onError(ApiException apiException);

    void onSuccess(QRPayload qRPayload);
}
