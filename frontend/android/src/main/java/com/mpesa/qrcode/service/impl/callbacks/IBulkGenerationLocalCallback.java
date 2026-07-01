package com.mpesa.qrcode.service.impl.callbacks;

import com.mpesa.qrcode.exception.ApiException;
import java.util.List;

public interface IBulkGenerationLocalCallback {
    void onError(String str) throws ApiException;

    void onSuccess(List<String> list);
}
