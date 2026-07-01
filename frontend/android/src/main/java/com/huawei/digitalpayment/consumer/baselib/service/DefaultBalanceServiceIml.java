package com.huawei.digitalpayment.consumer.baselib.service;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/huawei/digitalpayment/consumer/baselib/service/DefaultBalanceServiceIml;", "Lcom/huawei/digitalpayment/consumer/baselib/service/IBalanceService;", "<init>", "()V", "getBalance", "Landroidx/lifecycle/LiveData;", "", "reFreshBalance", "", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DefaultBalanceServiceIml implements IBalanceService {
    private static int component2 = 1;
    private static int component3;

    @Override
    public LiveData<String> getBalance() {
        int i = 2 % 2;
        MutableLiveData mutableLiveData = new MutableLiveData();
        int i2 = component3 + 63;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return mutableLiveData;
    }

    @Override
    public void reFreshBalance() {
        int i = 2 % 2;
        int i2 = component2 + 79;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }
}
