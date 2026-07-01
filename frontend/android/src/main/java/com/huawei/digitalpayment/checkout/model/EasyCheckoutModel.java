package com.huawei.digitalpayment.checkout.model;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.checkout.model.IEasyCheckoutModel;
import com.huawei.digitalpayment.checkout.model.response.CheckoutResp;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/checkout/model/EasyCheckoutModel;", "Lcom/huawei/digitalpayment/checkout/model/IEasyCheckoutModel;", "<init>", "()V", "CustomerCheckOutModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EasyCheckoutModel implements IEasyCheckoutModel {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;

    @Inject
    public EasyCheckoutModel() {
    }

    @Override
    public void createPreOrder(Map<String, ? extends Object> map, ApiCallback<CheckoutResp> apiCallback) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 35;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        IEasyCheckoutModel.DefaultImpls.createPreOrder(this, map, apiCallback);
        if (i3 == 0) {
            throw null;
        }
        int i4 = ShareDataUIState + 11;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }
}
