package com.huawei.digitalpayment.common.theme.util;

import com.blankj.utilcode.util.GsonUtils;
import com.google.gson.reflect.TypeToken;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.util.SecureGsonUtils;
import com.huawei.digitalpayment.common.theme.data.FunctionResp;
import com.huawei.digitalpayment.consumer.service.MyServicesInterface;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/util/MyServicesManager;", "", "<init>", "()V", "updateMyServices", "", "myServices", "", "Lcom/huawei/digitalpayment/common/theme/data/FunctionResp;", "getMyServices", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MyServicesManager {
    public static final MyServicesManager INSTANCE = new MyServicesManager();
    private static int component1 = 1;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;

    private MyServicesManager() {
    }

    public final void updateMyServices(List<? extends FunctionResp> myServices) {
        int i = 2 % 2;
        int i2 = component3 + 97;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ((MyServicesInterface) RouteUtils.getService(MyServicesInterface.class)).updateMyServices(GsonUtils.toJson(myServices));
        int i4 = component3 + 25;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 87 / 0;
        }
    }

    public final List<FunctionResp> getMyServices() {
        int i = 2 % 2;
        List<FunctionResp> listEmptyList = (List) SecureGsonUtils.fromJson(((MyServicesInterface) RouteUtils.getService(MyServicesInterface.class)).getMyServices(), new TypeToken<List<? extends FunctionResp>>() {
        }.getType());
        if (listEmptyList == null) {
            int i2 = component3 + 65;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            listEmptyList = Collections.emptyList();
            Intrinsics.checkNotNullExpressionValue(listEmptyList, "");
            int i4 = component2 + 79;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 % 3;
            }
        }
        return listEmptyList;
    }

    static {
        int i = component1 + 57;
        copydefault = i % 128;
        int i2 = i % 2;
    }
}
