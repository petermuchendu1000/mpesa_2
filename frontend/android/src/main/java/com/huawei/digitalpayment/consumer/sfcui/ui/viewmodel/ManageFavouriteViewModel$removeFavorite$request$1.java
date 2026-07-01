package com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel;

import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.getLifecycle;
import kotlin.getSavedStateRegistry;

@Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0014¨\u0006\u0005"}, d2 = {"com/huawei/digitalpayment/consumer/sfcui/ui/viewmodel/ManageFavouriteViewModel$removeFavorite$request$1", "Lcom/huawei/digitalpayment/consumer/baselib/http/PaymentRequest;", "Lcom/huawei/http/BaseResp;", "getApiPath", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ManageFavouriteViewModel$removeFavorite$request$1 extends PaymentRequest<BaseResp> {
    private static int component2 = 1;
    private static int component3;

    ManageFavouriteViewModel$removeFavorite$request$1() {
    }

    @Override
    public String getApiPath() {
        int i = 2 % 2;
        int i2 = component2 + 19;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 85;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return "deleteFavorite";
    }

    public static void component1() {
        getLifecycle.component2[0] = getSavedStateRegistry.copydefault[0];
    }
}
