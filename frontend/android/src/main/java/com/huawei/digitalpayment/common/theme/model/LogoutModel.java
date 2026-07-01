package com.huawei.digitalpayment.common.theme.model;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.http.BaseRequestParams;
import com.huawei.http.BaseResp;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/model/LogoutModel;", "Lcom/huawei/digitalpayment/common/theme/model/ILogoutModel;", "<init>", "()V", "logout", "", "params", "Lcom/huawei/http/BaseRequestParams;", "callback", "Lcom/huawei/common/listener/ApiCallback;", "Lcom/huawei/http/BaseResp;", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class LogoutModel implements ILogoutModel {
    private static int component3 = 0;
    private static int copydefault = 1;

    @Inject
    public LogoutModel() {
    }

    @Override
    public void logout(BaseRequestParams params, ApiCallback<BaseResp> callback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(params, "");
        sendRequest(new PaymentRequest<BaseResp>(params) {
        }, callback);
        int i2 = copydefault + 103;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 62 / 0;
        }
    }
}
