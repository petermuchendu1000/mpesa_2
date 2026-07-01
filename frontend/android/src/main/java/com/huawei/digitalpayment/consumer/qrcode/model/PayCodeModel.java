package com.huawei.digitalpayment.consumer.qrcode.model;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.qrcode.bean.AuthNoticeResp;
import com.huawei.digitalpayment.consumer.qrcode.bean.PaymentQrResp;
import com.huawei.digitalpayment.consumer.qrcode.request.EnablePaymentCodeRequest;
import com.huawei.http.BaseRequestParams;
import com.huawei.http.BaseResp;
import javax.annotation.Nullable;

public interface PayCodeModel extends BaseModel {
    void enablePaymentCode(EnablePaymentCodeRequest enablePaymentCodeRequest, ApiCallback<BaseResp> apiCallback);

    void getPaymentCodeList(@Nullable BaseRequestParams baseRequestParams, ApiCallback<PaymentQrResp> apiCallback);

    void queryAuthNotice(@Nullable BaseRequestParams baseRequestParams, ApiCallback<AuthNoticeResp> apiCallback);
}
