package com.huawei.digitalpayment.consumer.baselib.service;

import com.huawei.digitalpayment.consumer.baselib.service.IKMMHttpService;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/baselib/service/DefaultKMMHttpServiceImpl;", "Lcom/huawei/digitalpayment/consumer/baselib/service/IKMMHttpService;", "<init>", "()V", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class DefaultKMMHttpServiceImpl implements IKMMHttpService {
    private static int component1 = 1;
    private static int copydefault;

    @Override
    public void dealSessionOut(String str) {
        int i = 2 % 2;
        int i2 = component1 + 91;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        IKMMHttpService.DefaultImpls.dealSessionOut(this, str);
        int i4 = copydefault + 63;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void dealUpdate(String str) {
        int i = 2 % 2;
        int i2 = component1 + 41;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        IKMMHttpService.DefaultImpls.dealUpdate(this, str);
        int i4 = copydefault + 73;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void onResponse(String str, String str2) {
        int i = 2 % 2;
        int i2 = copydefault + 45;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        IKMMHttpService.DefaultImpls.onResponse(this, str, str2);
        int i4 = component1 + 19;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void showTokenInvalidDialog(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 15;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        IKMMHttpService.DefaultImpls.showTokenInvalidDialog(this, str);
        int i4 = component1 + 5;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 86 / 0;
        }
    }
}
