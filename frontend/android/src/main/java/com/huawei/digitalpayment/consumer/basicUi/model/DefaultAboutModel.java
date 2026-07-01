package com.huawei.digitalpayment.consumer.basicUi.model;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.baselib.util.update.UpdateBean;
import com.huawei.digitalpayment.consumer.basicUi.request.VersionVerifyRequest;
import javax.inject.Inject;

public class DefaultAboutModel implements AboutModel {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;

    @Inject
    public DefaultAboutModel() {
    }

    @Override
    public void versionVerify(VersionVerifyRequest versionVerifyRequest, ApiCallback<UpdateBean> apiCallback) {
        int i = 2 % 2;
        PaymentRequest<UpdateBean> paymentRequest = new PaymentRequest<UpdateBean>(this) {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = copydefault + 63;
                int i4 = i3 % 128;
                component3 = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 21;
                copydefault = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 30 / 0;
                }
                return "versionVerify";
            }
        };
        paymentRequest.addParams(versionVerifyRequest);
        sendRequest(paymentRequest, apiCallback);
        int i2 = copydefault + 1;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
    }
}
