package com.huawei.digitalpayment.consumer.webview.model;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.webview.model.resp.AaRecordResp;
import com.huawei.digitalpayment.consumer.webview.model.resp.GetH5AccessTokenResp;
import com.huawei.digitalpayment.consumer.webview.model.resp.ScanQrResp;
import com.huawei.digitalpayment.consumer.webview.model.resp.VerifyNumberResp;
import com.huawei.http.BaseResp;
import java.util.Map;
import javax.inject.Inject;

public class WebDispatcherModel implements IWebViewModel {
    private static int component1 = 1;
    private static int component2;

    @Inject
    public WebDispatcherModel() {
    }

    @Override
    public void getH5AccessToken(String str, ApiCallback<GetH5AccessTokenResp> apiCallback) {
        int i = 2 % 2;
        PaymentRequest<GetH5AccessTokenResp> paymentRequest = new PaymentRequest<GetH5AccessTokenResp>(this) {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component3;
                int i4 = i3 + 73;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 115;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
                return "h5GetAccessToken";
            }
        };
        paymentRequest.addParams("appId", str);
        sendRequest(paymentRequest, apiCallback);
        int i2 = component2 + 117;
        component1 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void createAaPaidRecord(Map<String, Object> map, ApiCallback<AaRecordResp> apiCallback) {
        int i = 2 % 2;
        PaymentRequest<AaRecordResp> paymentRequest = new PaymentRequest<AaRecordResp>(this) {
            private static int component1 = 0;
            private static int copydefault = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component1 + 55;
                int i4 = i3 % 128;
                copydefault = i4;
                if (i3 % 2 == 0) {
                    throw null;
                }
                int i5 = i4 + 115;
                component1 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 75 / 0;
                }
                return "createAaPaidRecord";
            }
        };
        paymentRequest.addParams(map);
        sendRequest(paymentRequest, apiCallback);
        int i2 = component2 + 59;
        component1 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void aaPaidVerify(Map<String, Object> map, ApiCallback<BaseResp> apiCallback) {
        int i = 2 % 2;
        PaymentRequest<BaseResp> paymentRequest = new PaymentRequest<BaseResp>(this) {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component2 + 107;
                int i4 = i3 % 128;
                copydefault = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 107;
                component2 = i6 % 128;
                int i7 = i6 % 2;
                return "aaPaidVerify";
            }
        };
        paymentRequest.addParams(map);
        sendRequest(paymentRequest, apiCallback);
        int i2 = component1 + 51;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void verifyP2pTransfer(String str, ApiCallback<VerifyNumberResp> apiCallback) {
        int i = 2 % 2;
        PaymentRequest<VerifyNumberResp> paymentRequest = new PaymentRequest<VerifyNumberResp>(this) {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component2;
                int i4 = i3 + 55;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 15;
                ShareDataUIState = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 91 / 0;
                }
                return "verifyP2PTransfer";
            }
        };
        paymentRequest.addParams("receiverMsisdn", str);
        sendRequest(paymentRequest, apiCallback);
        int i2 = component1 + 51;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 75 / 0;
        }
    }

    @Override
    public void analysisResult(String str, String str2, ApiCallback<ScanQrResp> apiCallback) {
        int i = 2 % 2;
        PaymentRequest<ScanQrResp> paymentRequest = new PaymentRequest<ScanQrResp>(this) {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 3;
                component3 = i3 % 128;
                if (i3 % 2 == 0) {
                    return "scanQrCode";
                }
                int i4 = 56 / 0;
                return "scanQrCode";
            }
        };
        paymentRequest.addParams("qrCode", str);
        paymentRequest.addParams("scanPurpose", str2);
        sendRequest(paymentRequest, apiCallback);
        int i2 = component1 + 13;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 38 / 0;
        }
    }
}
