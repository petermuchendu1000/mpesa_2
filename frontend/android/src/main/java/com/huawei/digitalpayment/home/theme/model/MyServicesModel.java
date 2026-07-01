package com.huawei.digitalpayment.home.theme.model;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.home.theme.data.remote.MyServicesResp;
import com.huawei.http.BaseRequestParams;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0016¨\u0006\u000f"}, d2 = {"Lcom/huawei/digitalpayment/home/theme/model/MyServicesModel;", "Lcom/huawei/digitalpayment/home/theme/model/IMyServicesModel;", "<init>", "()V", "getMyServices", "", "maxCount", "", "isLightIcon", "", "params", "Lcom/huawei/http/BaseRequestParams;", "callback", "Lcom/huawei/common/listener/ApiCallback;", "Lcom/huawei/digitalpayment/home/theme/data/remote/MyServicesResp;", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class MyServicesModel implements IMyServicesModel {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;

    @Inject
    public MyServicesModel() {
    }

    @Override
    public void getMyServices(int maxCount, boolean isLightIcon, BaseRequestParams params, ApiCallback<MyServicesResp> callback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(params, "");
        sendRequest(new PaymentRequest<MyServicesResp>(params) {
        }, callback);
        int i2 = ShareDataUIState + 87;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
