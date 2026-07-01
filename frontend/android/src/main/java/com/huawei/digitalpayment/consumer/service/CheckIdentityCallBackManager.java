package com.huawei.digitalpayment.consumer.service;

import com.huawei.common.listener.ApiCallback;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\b\u001a\u00020\t2\u001a\u0010\u0004\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0005J\u001a\u0010\n\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0005R\"\u0010\u0004\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/service/CheckIdentityCallBackManager;", "", "<init>", "()V", "callback", "Lcom/huawei/common/listener/ApiCallback;", "", "", "setCallback", "", "getCallBack", "ConsumerLoginUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CheckIdentityCallBackManager {
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3;
    private static ApiCallback<Map<String, String>> copydefault;
    public static final CheckIdentityCallBackManager INSTANCE = new CheckIdentityCallBackManager();
    public static final int $stable = 8;

    private CheckIdentityCallBackManager() {
    }

    public final void setCallback(ApiCallback<Map<String, String>> callback) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 99;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        copydefault = callback;
        int i5 = i2 + 85;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ApiCallback<Map<String, String>> getCallBack() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 49;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        ApiCallback<Map<String, String>> apiCallback = copydefault;
        int i5 = i3 + 47;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return apiCallback;
        }
        throw null;
    }

    static {
        int i = component3 + 41;
        component2 = i % 128;
        if (i % 2 == 0) {
            int i2 = 60 / 0;
        }
    }
}
