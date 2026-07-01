package com.huawei.digitalpayment.checkout.model;

import com.google.gson.JsonObject;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.SecureGsonUtils;
import com.huawei.digitalpayment.checkout.model.response.CheckoutResp;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/huawei/digitalpayment/checkout/model/IEasyCheckoutModel;", "Lcom/huawei/digitalpayment/consumer/baselib/model/BaseModel;", "createPreOrder", "", "params", "", "", "", "callback", "Lcom/huawei/common/listener/ApiCallback;", "Lcom/huawei/digitalpayment/checkout/model/response/CheckoutResp;", "CustomerCheckOutModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface IEasyCheckoutModel extends BaseModel {
    void createPreOrder(Map<String, ? extends Object> params, ApiCallback<CheckoutResp> callback);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        private static int component1 = 0;
        private static int component2 = 1;

        public static void createPreOrder(IEasyCheckoutModel iEasyCheckoutModel, Map<String, ? extends Object> map, ApiCallback<CheckoutResp> apiCallback) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(apiCallback, "");
            PaymentRequest<CheckoutResp> paymentRequest = new PaymentRequest<CheckoutResp>() {
                private static int ShareDataUIState = 0;
                private static int component2 = 1;

                @Override
                public Object convert(JsonObject jsonObject) {
                    int i2 = 2 % 2;
                    int i3 = component2 + 59;
                    ShareDataUIState = i3 % 128;
                    int i4 = i3 % 2;
                    CheckoutResp checkoutRespConvert = convert(jsonObject);
                    int i5 = ShareDataUIState + 111;
                    component2 = i5 % 128;
                    if (i5 % 2 != 0) {
                        return checkoutRespConvert;
                    }
                    throw null;
                }

                @Override
                public String getApiPath() {
                    int i2 = 2 % 2;
                    int i3 = ShareDataUIState + 59;
                    component2 = i3 % 128;
                    if (i3 % 2 != 0) {
                        return "createPreOrder";
                    }
                    throw null;
                }

                @Override
                public CheckoutResp convert(JsonObject origin) {
                    int i2 = 2 % 2;
                    int i3 = component2 + 67;
                    ShareDataUIState = i3 % 128;
                    int i4 = i3 % 2;
                    Intrinsics.checkNotNullParameter(origin, "");
                    CheckoutResp checkoutResp = (CheckoutResp) SecureGsonUtils.fromJson(origin.toString(), CheckoutResp.class);
                    if (checkoutResp == null) {
                        checkoutResp = new CheckoutResp();
                    }
                    int i5 = ShareDataUIState + 63;
                    component2 = i5 % 128;
                    int i6 = i5 % 2;
                    return checkoutResp;
                }
            };
            paymentRequest.addParams((Map<String, Object>) map);
            iEasyCheckoutModel.sendRequest(paymentRequest, apiCallback);
            int i2 = component1 + 43;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 78 / 0;
            }
        }
    }
}
