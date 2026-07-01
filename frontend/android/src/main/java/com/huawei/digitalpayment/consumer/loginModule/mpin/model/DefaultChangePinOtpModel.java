package com.huawei.digitalpayment.consumer.loginModule.mpin.model;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifyChangePinSmsResp;
import com.huawei.digitalpayment.consumer.loginModule.mpin.request.SendOtpParams;
import com.huawei.digitalpayment.consumer.loginModule.mpin.request.VerifyChangePinSmsParams;
import com.huawei.http.BaseResp;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u001e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\r0\tH\u0016¨\u0006\u000e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/mpin/model/DefaultChangePinOtpModel;", "Lcom/huawei/digitalpayment/consumer/loginModule/mpin/model/IChangePinOtpModel;", "<init>", "()V", "sendSms", "", "params", "Lcom/huawei/digitalpayment/consumer/loginModule/mpin/request/SendOtpParams;", "callback", "Lcom/huawei/common/listener/ApiCallback;", "Lcom/huawei/http/BaseResp;", "verifySms", "Lcom/huawei/digitalpayment/consumer/loginModule/mpin/request/VerifyChangePinSmsParams;", "Lcom/huawei/digitalpayment/consumer/loginModule/mpin/data/VerifyChangePinSmsResp;", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DefaultChangePinOtpModel implements IChangePinOtpModel {
    private static int component1 = 1;
    private static int component2;

    @Inject
    public DefaultChangePinOtpModel() {
    }

    @Override
    public void sendSms(SendOtpParams params, ApiCallback<BaseResp> callback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(params, "");
        Intrinsics.checkNotNullParameter(callback, "");
        PaymentRequest<BaseResp> paymentRequest = new PaymentRequest<BaseResp>() {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState;
                int i4 = i3 + 91;
                component3 = i4 % 128;
                Object obj = null;
                if (i4 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                int i5 = i3 + 109;
                component3 = i5 % 128;
                if (i5 % 2 == 0) {
                    return "sendOtpSms";
                }
                throw null;
            }
        };
        paymentRequest.addParams(params);
        sendRequest(paymentRequest, callback);
        int i2 = component1 + 59;
        component2 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void verifySms(VerifyChangePinSmsParams params, ApiCallback<VerifyChangePinSmsResp> callback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(params, "");
        Intrinsics.checkNotNullParameter(callback, "");
        PaymentRequest<VerifyChangePinSmsResp> paymentRequest = new PaymentRequest<VerifyChangePinSmsResp>() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component1 + 105;
                component3 = i3 % 128;
                if (i3 % 2 != 0) {
                    return "verifyChangePinSms";
                }
                int i4 = 16 / 0;
                return "verifyChangePinSms";
            }
        };
        paymentRequest.addParams(params);
        sendRequest(paymentRequest, callback);
        int i2 = component1 + 59;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }
}
