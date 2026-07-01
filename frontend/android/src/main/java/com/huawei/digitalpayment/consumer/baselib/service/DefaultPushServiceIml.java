package com.huawei.digitalpayment.consumer.baselib.service;

import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u001e\u0010\u0006\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tH\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/baselib/service/DefaultPushServiceIml;", "Lcom/huawei/digitalpayment/consumer/baselib/service/IPushService;", "<init>", "()V", "getFirebaseToken", "", "onMessageReceived", "", "data", "", "unsubscribeToTopic", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DefaultPushServiceIml implements IPushService {
    private static int component3 = 1;
    private static int copydefault;

    @Override
    public String getFirebaseToken() {
        int i = 2 % 2;
        int i2 = copydefault + 43;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 85;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return "";
    }

    @Override
    public void onMessageReceived(Map<String, String> data) {
        int i = 2 % 2;
        int i2 = copydefault + 49;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void unsubscribeToTopic() {
        int i = 2 % 2;
        int i2 = copydefault + 89;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
