package com.mpesa.qrcode.service.impl.callbacks;

import com.mpesa.qrcode.exception.ApiException;
import java.util.List;

public interface IBulkGenerationCallback {
    void onError(ApiException apiException);

    void onSuccess(List<String> list);
}
