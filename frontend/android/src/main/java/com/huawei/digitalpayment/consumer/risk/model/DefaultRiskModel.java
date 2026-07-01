package com.huawei.digitalpayment.consumer.risk.model;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.risk.bean.ProcessVerifyParams;
import com.huawei.digitalpayment.consumer.risk.bean.ProcessVerifyResp;
import com.huawei.digitalpayment.consumer.risk.bean.SendOtpParams;
import com.huawei.http.BaseResp;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u001e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\r0\tH\u0016¨\u0006\u000e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/risk/model/DefaultRiskModel;", "Lcom/huawei/digitalpayment/consumer/risk/model/IRiskModel;", "<init>", "()V", "processVerify", "", "params", "Lcom/huawei/digitalpayment/consumer/risk/bean/ProcessVerifyParams;", "callback", "Lcom/huawei/common/listener/ApiCallback;", "Lcom/huawei/digitalpayment/consumer/risk/bean/ProcessVerifyResp;", "sendOtp", "Lcom/huawei/digitalpayment/consumer/risk/bean/SendOtpParams;", "Lcom/huawei/http/BaseResp;", "ConsumerRiskModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class DefaultRiskModel implements IRiskModel {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;

    @Inject
    public DefaultRiskModel() {
    }

    @Override
    public void processVerify(ProcessVerifyParams params, ApiCallback<ProcessVerifyResp> callback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(params, "");
        Intrinsics.checkNotNullParameter(callback, "");
        PaymentRequest<ProcessVerifyResp> paymentRequest = new PaymentRequest<ProcessVerifyResp>() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component3 + 13;
                int i4 = i3 % 128;
                ShareDataUIState = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 93;
                component3 = i6 % 128;
                if (i6 % 2 != 0) {
                    return "processVerify";
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        paymentRequest.addParams(params);
        sendRequest(paymentRequest, callback);
        int i2 = ShareDataUIState + 45;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 77 / 0;
        }
    }

    @Override
    public void sendOtp(SendOtpParams params, ApiCallback<BaseResp> callback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(params, "");
        Intrinsics.checkNotNullParameter(callback, "");
        PaymentRequest<BaseResp> paymentRequest = new PaymentRequest<BaseResp>() {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 67;
                copydefault = i3 % 128;
                if (i3 % 2 != 0) {
                    return "sendOtpSms";
                }
                throw null;
            }
        };
        paymentRequest.addParams(params);
        sendRequest(paymentRequest, callback);
        int i2 = component1 + 29;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
    }
}
