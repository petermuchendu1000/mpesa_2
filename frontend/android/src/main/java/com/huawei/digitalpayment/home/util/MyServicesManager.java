package com.huawei.digitalpayment.home.util;

import com.alibaba.griver.api.ui.splash.SplashEntryInfo;
import com.huawei.digitalpayment.home.data.source.locaL.LocalHomeFunction;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0014\u001a\u00020\u00152\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0006\u0010\u0017\u001a\u00020\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/huawei/digitalpayment/home/util/MyServicesManager;", "", "<init>", "()V", "DEFAULT_MAX_COUNT", "", "myServices", "", "Lcom/huawei/digitalpayment/home/data/source/locaL/LocalHomeFunction;", SplashEntryInfo.NEED_REFRESH, "", "getNeedRefresh", "()Z", "setNeedRefresh", "(Z)V", "maxCount", "getMaxCount", "()I", "setMaxCount", "(I)V", "updateMyServices", "", "getMyServices", "reset", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MyServicesManager {
    private static final int ShareDataUIState = 7;
    private static int component3 = 0;
    private static int component4 = 1;
    private static int equals = 1;
    private static int getRequestBeneficiariesState;
    public static final MyServicesManager INSTANCE = new MyServicesManager();
    private static List<LocalHomeFunction> component1 = CollectionsKt.emptyList();
    private static boolean component2 = true;
    private static int copydefault = 7;

    private MyServicesManager() {
    }

    static {
        int i = component3 + 117;
        equals = i % 128;
        int i2 = i % 2;
    }

    public final boolean getNeedRefresh() {
        int i = 2 % 2;
        int i2 = component4 + 83;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        boolean z = component2;
        if (i3 != 0) {
            int i4 = 35 / 0;
        }
        return z;
    }

    public final void setNeedRefresh(boolean z) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 13;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        component2 = z;
        int i5 = i2 + 95;
        component4 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final int getMaxCount() {
        int i;
        int i2 = 2 % 2;
        int i3 = component4;
        int i4 = i3 + 7;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            i = copydefault;
            int i5 = 36 / 0;
        } else {
            i = copydefault;
        }
        int i6 = i3 + 23;
        getRequestBeneficiariesState = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 43 / 0;
        }
        return i;
    }

    public final void setMaxCount(int i) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 121;
        int i4 = i3 % 128;
        component4 = i4;
        int i5 = i3 % 2;
        copydefault = i;
        int i6 = i4 + 41;
        getRequestBeneficiariesState = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public final void updateMyServices(List<LocalHomeFunction> myServices) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        Object obj = null;
        if (myServices != null) {
            int i2 = getRequestBeneficiariesState + 21;
            component4 = i2 % 128;
            if (i2 % 2 != 0) {
                arrayList.addAll(myServices);
            } else {
                arrayList.addAll(myServices);
                obj.hashCode();
                throw null;
            }
        }
        component1 = arrayList;
        int i3 = getRequestBeneficiariesState + 13;
        component4 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public final List<LocalHomeFunction> getMyServices() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 31;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        List<LocalHomeFunction> list = component1;
        int i5 = i2 + 111;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 77 / 0;
        }
        return list;
    }

    public final void reset() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 75;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        component2 = true;
        copydefault = 7;
        Object obj = null;
        updateMyServices(null);
        int i4 = getRequestBeneficiariesState + 5;
        component4 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
