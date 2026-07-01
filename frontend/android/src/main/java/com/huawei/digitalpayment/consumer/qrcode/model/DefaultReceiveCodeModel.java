package com.huawei.digitalpayment.consumer.qrcode.model;

import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.SecureGsonUtils;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.qrcode.bean.GetQrCodeResp;
import com.huawei.digitalpayment.consumer.qrcode.bean.ScanQrResultResp;
import com.huawei.digitalpayment.consumer.qrcode.request.GetQrCodeListRequest;
import com.huawei.digitalpayment.consumer.qrcode.request.GetQrCodeRequest;
import com.huawei.http.BaseRequestParams;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.UByte$$ExternalSyntheticBackport0;

public class DefaultReceiveCodeModel implements ReceiveCodeModel {
    private static int component1 = 0;
    private static int component2 = 1;

    @Inject
    public DefaultReceiveCodeModel() {
    }

    @Override
    public void getQrCodeList(GetQrCodeListRequest getQrCodeListRequest, ApiCallback<GetQrCodeResp> apiCallback) {
        int i = 2 % 2;
        PaymentRequest<GetQrCodeResp> paymentRequest = new PaymentRequest<GetQrCodeResp>(this) {
            private static int component3 = 0;
            private static int copydefault = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component3 + 13;
                int i4 = i3 % 128;
                copydefault = i4;
                if (i3 % 2 == 0) {
                    throw null;
                }
                int i5 = i4 + 123;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                return "getQrCodeList";
            }
        };
        paymentRequest.addParams(getQrCodeListRequest);
        sendRequest(paymentRequest, apiCallback);
        int i2 = component1 + 61;
        component2 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void getQrCode(GetQrCodeRequest getQrCodeRequest, ApiCallback<GetQrCodeResp> apiCallback) {
        int i = 2 % 2;
        PaymentRequest<GetQrCodeResp> paymentRequest = new PaymentRequest<GetQrCodeResp>(this) {
            private static int component2 = 0;
            private static int copydefault = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = copydefault + 83;
                component2 = i3 % 128;
                if (i3 % 2 == 0) {
                    return "getQrCode";
                }
                int i4 = 0 / 0;
                return "getQrCode";
            }
        };
        paymentRequest.addParams(getQrCodeRequest);
        sendRequest(paymentRequest, apiCallback);
        int i2 = component1 + 83;
        component2 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void queryScanQrCollect(BaseRequestParams baseRequestParams, ApiCallback<List<ScanQrResultResp>> apiCallback) {
        int i = 2 % 2;
        PaymentRequest<List<ScanQrResultResp>> paymentRequest = new PaymentRequest<List<ScanQrResultResp>>(this) {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;

            @Override
            public Object convert(JsonObject jsonObject) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 53;
                component2 = i3 % 128;
                if (i3 % 2 == 0) {
                    component3(jsonObject);
                    throw null;
                }
                List<ScanQrResultResp> listComponent3 = component3(jsonObject);
                int i4 = component2 + 65;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return listComponent3;
            }

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 53;
                int i4 = i3 % 128;
                component2 = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 73;
                ShareDataUIState = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 45 / 0;
                }
                return "queryScanQrCollect";
            }

            protected List<ScanQrResultResp> component3(JsonObject jsonObject) {
                int i2 = 2 % 2;
                int i3 = component2 + 37;
                ShareDataUIState = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    if (jsonObject.get("results") == null) {
                        int i4 = ShareDataUIState + 29;
                        component2 = i4 % 128;
                        if (i4 % 2 != 0) {
                            return Collections.emptyList();
                        }
                        Collections.emptyList();
                        obj.hashCode();
                        throw null;
                    }
                    List<ScanQrResultResp> list = (List) UByte$$ExternalSyntheticBackport0.m(SecureGsonUtils.fromJson(r5.toString(), new TypeToken<List<ScanQrResultResp>>(this) {
                    }.getType()), (Object) Collections.emptyList());
                    int i5 = ShareDataUIState + 59;
                    component2 = i5 % 128;
                    int i6 = i5 % 2;
                    return list;
                }
                jsonObject.get("results");
                obj.hashCode();
                throw null;
            }
        };
        paymentRequest.addParams(baseRequestParams);
        sendRequest(paymentRequest, apiCallback);
        int i2 = component1 + 11;
        component2 = i2 % 128;
        int i3 = i2 % 2;
    }
}
