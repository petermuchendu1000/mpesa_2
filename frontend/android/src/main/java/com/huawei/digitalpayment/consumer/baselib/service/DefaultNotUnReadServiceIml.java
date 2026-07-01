package com.huawei.digitalpayment.consumer.baselib.service;

import androidx.lifecycle.MutableLiveData;
import kotlin.Deprecated;
import kotlin.Metadata;

@Deprecated(message = "使用 INotificationService")
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/baselib/service/DefaultNotUnReadServiceIml;", "Lcom/huawei/digitalpayment/consumer/baselib/service/INotificationUnReadService;", "<init>", "()V", "getNotificationUnRead", "", "notificationIsUnRead", "Landroidx/lifecycle/MutableLiveData;", "", "refreshNotificationUnread", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DefaultNotUnReadServiceIml implements INotificationUnReadService {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;

    @Override
    public MutableLiveData<Boolean> notificationIsUnRead() {
        int i = 2 % 2;
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(false);
        int i2 = component3 + 45;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return mutableLiveData;
    }

    @Override
    public void getNotificationUnRead() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 5;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void refreshNotificationUnread() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 69;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
