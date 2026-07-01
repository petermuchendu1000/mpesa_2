package com.huawei.digitalpayment.home.theme.data.remote;

import com.huawei.digitalpayment.home.data.source.remote.RemoteHomeFunction;
import com.huawei.http.BaseResp;
import java.util.List;

public class MyServicesResp extends BaseResp {
    private static int component2 = 1;
    private static int component3;
    private List<RemoteHomeFunction> myServices;
    private boolean setBySelf;

    public boolean isSetBySelf() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 99;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        boolean z = this.setBySelf;
        int i4 = i2 + 79;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public void setSetBySelf(boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 87;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        this.setBySelf = z;
        if (i4 != 0) {
            int i5 = 23 / 0;
        }
        int i6 = i3 + 49;
        component2 = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public List<RemoteHomeFunction> getMyServices() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 5;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        List<RemoteHomeFunction> list = this.myServices;
        int i5 = i2 + 75;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public void setMyServices(List<RemoteHomeFunction> list) {
        int i = 2 % 2;
        int i2 = component3 + 35;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.myServices = list;
        if (i4 == 0) {
            int i5 = 72 / 0;
        }
        int i6 = i3 + 31;
        component3 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 3 / 0;
        }
    }
}
