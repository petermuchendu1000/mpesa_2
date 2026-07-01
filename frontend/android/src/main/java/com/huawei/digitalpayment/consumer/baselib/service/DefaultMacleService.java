package com.huawei.digitalpayment.consumer.baselib.service;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J(\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/baselib/service/DefaultMacleService;", "Lcom/huawei/digitalpayment/consumer/baselib/service/IMacleService;", "<init>", "()V", "queryRecentUseMiniApps", "Landroidx/lifecycle/LiveData;", "", "limit", "", "searchMiniApps", "page", "pageSize", "endPoint", "mappName", "isShowMiniApp", "", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DefaultMacleService implements IMacleService {
    private static int component2 = 1;
    private static int copydefault;

    @Override
    public LiveData<String> queryRecentUseMiniApps(int limit) {
        int i = 2 % 2;
        Object obj = null;
        MutableLiveData mutableLiveData = new MutableLiveData(null);
        int i2 = component2 + 119;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return mutableLiveData;
        }
        obj.hashCode();
        throw null;
    }

    @Override
    public String searchMiniApps(int page, int pageSize, int endPoint, String mappName) {
        int i = 2 % 2;
        int i2 = copydefault + 15;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(mappName, "");
        int i4 = component2 + 107;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return "";
    }

    @Override
    public boolean isShowMiniApp() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 75;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 81;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 93 / 0;
        }
        return false;
    }
}
