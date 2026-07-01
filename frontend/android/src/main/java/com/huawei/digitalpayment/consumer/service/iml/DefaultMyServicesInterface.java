package com.huawei.digitalpayment.consumer.service.iml;

import com.huawei.digitalpayment.consumer.service.MyServicesInterface;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/service/iml/DefaultMyServicesInterface;", "Lcom/huawei/digitalpayment/consumer/service/MyServicesInterface;", "<init>", "()V", "ServiceModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DefaultMyServicesInterface implements MyServicesInterface {
    private static int component1 = 0;
    private static int component3 = 1;

    @Override
    public int getMaxCount() {
        int i = 2 % 2;
        int i2 = component3 + 45;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int maxCount = MyServicesInterface.DefaultImpls.getMaxCount(this);
        int i4 = component3 + 55;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return maxCount;
    }

    @Override
    public String getMyServices() {
        int i = 2 % 2;
        int i2 = component1 + 87;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String myServices = MyServicesInterface.DefaultImpls.getMyServices(this);
        int i4 = component1 + 117;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return myServices;
    }

    @Override
    public boolean getNeedRefresh() {
        int i = 2 % 2;
        int i2 = component1 + 15;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        boolean needRefresh = MyServicesInterface.DefaultImpls.getNeedRefresh(this);
        int i4 = component3 + 45;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return needRefresh;
    }

    @Override
    public void setMaxCount(int i) {
        int i2 = 2 % 2;
        int i3 = component3 + 119;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        MyServicesInterface.DefaultImpls.setMaxCount(this, i);
        int i5 = component3 + 45;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override
    public void setNeedRefresh(boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 61;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        MyServicesInterface.DefaultImpls.setNeedRefresh(this, z);
        int i4 = component3 + 13;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void updateMyServices(String str) {
        int i = 2 % 2;
        int i2 = component1 + 117;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        MyServicesInterface.DefaultImpls.updateMyServices(this, str);
        int i4 = component1 + 5;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }
}
