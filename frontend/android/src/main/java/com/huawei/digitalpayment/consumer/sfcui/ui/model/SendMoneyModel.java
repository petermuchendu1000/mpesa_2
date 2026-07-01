package com.huawei.digitalpayment.consumer.sfcui.ui.model;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.checkout.model.response.CheckoutResp;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.sfcui.ui.resp.PreSendMoneyParams;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/model/SendMoneyModel;", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/model/ISendMoneyModel;", "<init>", "()V", "preSendMoney", "", "params", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/resp/PreSendMoneyParams;", "callback", "Lcom/huawei/common/listener/ApiCallback;", "Lcom/huawei/digitalpayment/checkout/model/response/CheckoutResp;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SendMoneyModel implements ISendMoneyModel {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 33 % 128;
    private static int component3;

    @Inject
    public SendMoneyModel() {
    }

    @Override
    public void preSendMoney(PreSendMoneyParams params, ApiCallback<CheckoutResp> callback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(params, "");
        Intrinsics.checkNotNullParameter(callback, "");
        PaymentRequest<CheckoutResp> paymentRequest = new PaymentRequest<CheckoutResp>() {
            private static int component2 = 0;
            private static int copydefault = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = copydefault + 51;
                component2 = i3 % 128;
                if (i3 % 2 == 0) {
                    return "preP2PTransfer";
                }
                int i4 = 61 / 0;
                return "preP2PTransfer";
            }
        };
        paymentRequest.addParams(params);
        sendRequest(paymentRequest, callback);
        int i2 = component1 + 13;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    static {
        int i = 33 % 2;
    }
}
