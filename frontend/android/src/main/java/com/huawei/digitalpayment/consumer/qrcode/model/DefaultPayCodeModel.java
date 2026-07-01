package com.huawei.digitalpayment.consumer.qrcode.model;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.qrcode.bean.AuthNoticeResp;
import com.huawei.digitalpayment.consumer.qrcode.bean.PaymentQrResp;
import com.huawei.digitalpayment.consumer.qrcode.request.EnablePaymentCodeRequest;
import com.huawei.http.BaseRequestParams;
import com.huawei.http.BaseResp;
import javax.inject.Inject;

public class DefaultPayCodeModel implements PayCodeModel {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;

    @Inject
    public DefaultPayCodeModel() {
    }

    @Override
    public void getPaymentCodeList(BaseRequestParams baseRequestParams, ApiCallback<PaymentQrResp> apiCallback) {
        int i = 2 % 2;
        PaymentRequest<PaymentQrResp> paymentRequest = new PaymentRequest<PaymentQrResp>(this) {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 55;
                int i4 = i3 % 128;
                copydefault = i4;
                if (i3 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i5 = i4 + 59;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 89 / 0;
                }
                return "getPaymentCodeList";
            }
        };
        paymentRequest.addParams(baseRequestParams);
        sendRequest(paymentRequest, apiCallback);
        int i2 = copydefault + 25;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override
    public void queryAuthNotice(BaseRequestParams baseRequestParams, ApiCallback<AuthNoticeResp> apiCallback) {
        int i = 2 % 2;
        PaymentRequest<AuthNoticeResp> paymentRequest = new PaymentRequest<AuthNoticeResp>(this) {
            private static int component1 = 0;
            private static int component2 = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component1;
                int i4 = i3 + 65;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 93;
                component2 = i6 % 128;
                if (i6 % 2 != 0) {
                    return "queryAuthNotice";
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        paymentRequest.addParams(baseRequestParams);
        sendRequest(paymentRequest, apiCallback);
        int i2 = ShareDataUIState + 17;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 0 / 0;
        }
    }

    @Override
    public void enablePaymentCode(EnablePaymentCodeRequest enablePaymentCodeRequest, ApiCallback<BaseResp> apiCallback) {
        int i = 2 % 2;
        PaymentRequest<BaseResp> paymentRequest = new PaymentRequest<BaseResp>(this) {
            private static int component2 = 1;
            private static int component3;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component3 + 71;
                int i4 = i3 % 128;
                component2 = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 3;
                component3 = i6 % 128;
                int i7 = i6 % 2;
                return "enablePaymentCode";
            }
        };
        paymentRequest.addParams(enablePaymentCodeRequest);
        sendRequest(paymentRequest, apiCallback);
        int i2 = copydefault + 43;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
