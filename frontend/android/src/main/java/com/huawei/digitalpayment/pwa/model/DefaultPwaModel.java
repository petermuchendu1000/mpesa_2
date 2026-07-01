package com.huawei.digitalpayment.pwa.model;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.pwa.model.response.GetH5AccessTokenResp;
import com.huawei.digitalpayment.pwa.model.response.ScanQrResp;
import com.huawei.digitalpayment.pwa.model.resquest.AnalysisResultRequest;
import com.huawei.digitalpayment.pwa.model.resquest.H5AccessTokenRequest;
import javax.inject.Inject;

public class DefaultPwaModel implements IPwaModel {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;

    @Inject
    public DefaultPwaModel() {
    }

    @Override
    public void analysisResult(AnalysisResultRequest analysisResultRequest, ApiCallback<ScanQrResp> apiCallback) {
        int i = 2 % 2;
        PaymentRequest<ScanQrResp> paymentRequest = new PaymentRequest<ScanQrResp>(this) {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState;
                int i4 = i3 + 123;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 109;
                copydefault = i6 % 128;
                if (i6 % 2 != 0) {
                    return "scanQrCode";
                }
                throw null;
            }
        };
        paymentRequest.addParams(analysisResultRequest);
        paymentRequest.sendRequest(apiCallback);
        int i2 = ShareDataUIState + 79;
        component2 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void getH5AccessToken(H5AccessTokenRequest h5AccessTokenRequest, ApiCallback<GetH5AccessTokenResp> apiCallback) {
        int i = 2 % 2;
        PaymentRequest<GetH5AccessTokenResp> paymentRequest = new PaymentRequest<GetH5AccessTokenResp>(this) {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 41;
                int i4 = i3 % 128;
                component3 = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 41;
                ShareDataUIState = i6 % 128;
                if (i6 % 2 == 0) {
                    return "h5GetAccessToken";
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        paymentRequest.addParams(h5AccessTokenRequest);
        paymentRequest.sendRequest(apiCallback);
        int i2 = ShareDataUIState + 67;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
