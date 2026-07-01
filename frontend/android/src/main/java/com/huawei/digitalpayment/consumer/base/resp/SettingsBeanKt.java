package com.huawei.digitalpayment.consumer.base.resp;

import com.huawei.biometric.util.BiometricHelper2;
import com.huawei.digitalpayment.home.data.source.locaL.LocalHomeFunction;
import com.iap.ac.android.region.cdp.util.CdpConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0004\u001a(\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0001\u001a\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n*\b\u0012\u0004\u0012\u00020\u00040\n\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"FIND_SAFARICOM_SHOP_URL", "", "toSettingBean", "Lcom/huawei/digitalpayment/consumer/base/resp/SettingsBean;", "Lcom/huawei/digitalpayment/home/data/source/locaL/LocalHomeFunction;", "isToggleEnabled", "", "isSettingEnabled", CdpConstants.CONTENT_URL_MODEL, "toSettingBeanList", "", "ConsumerBaseUi_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SettingsBeanKt {
    private static final String FIND_SAFARICOM_SHOP_URL = "https://myaccount.safaricom.co.ke/discover/locate-shop";
    private static int component2 = 1;
    private static int component3;

    public static final SettingsBean toSettingBean(LocalHomeFunction localHomeFunction) {
        String str;
        int i = 2 % 2;
        int i2 = component3 + 19;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(localHomeFunction, "");
        String funcId = localHomeFunction.getFuncId();
        if (funcId == null) {
            int i4 = component3 + 13;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 78 / 0;
            }
            str = "";
        } else {
            str = funcId;
        }
        String funcName = localHomeFunction.getFuncName();
        String str2 = funcName == null ? "" : funcName;
        String funIcon = localHomeFunction.getFunIcon();
        String str3 = funIcon == null ? "" : funIcon;
        String execute = localHomeFunction.getExecute();
        return new SettingsBean(str, 0, str2, str3, execute == null ? "" : execute, false, false, null, 226, null);
    }

    public static SettingsBean toSettingBean$default(LocalHomeFunction localHomeFunction, boolean z, boolean z2, String str, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component2 + 23;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            z = false;
        }
        if ((i & 2) != 0) {
            int i5 = component2 + 79;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            z2 = false;
        }
        if ((i & 4) != 0) {
            int i7 = component3 + 85;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            str = "";
        }
        SettingsBean settingBean = toSettingBean(localHomeFunction, z, z2, str);
        int i9 = component3 + 9;
        component2 = i9 % 128;
        int i10 = i9 % 2;
        return settingBean;
    }

    public static final SettingsBean toSettingBean(LocalHomeFunction localHomeFunction, boolean z, boolean z2, String str) {
        String str2;
        String str3;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(localHomeFunction, "");
        Intrinsics.checkNotNullParameter(str, "");
        String funcId = localHomeFunction.getFuncId();
        if (funcId == null) {
            int i2 = component2 + 81;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            funcId = "";
        }
        String funcName = localHomeFunction.getFuncName();
        if (funcName == null) {
            int i4 = component3 + 91;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            str2 = "";
        } else {
            str2 = funcName;
        }
        String funIcon = localHomeFunction.getFunIcon();
        if (funIcon == null) {
            int i6 = component3 + 115;
            component2 = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
            str3 = "";
        } else {
            str3 = funIcon;
        }
        String execute = localHomeFunction.getExecute();
        return new SettingsBean(funcId, 0, str2, str3, execute == null ? "" : execute, z2, z, str, 2, null);
    }

    public static final List<SettingsBean> toSettingBeanList(List<LocalHomeFunction> list) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList arrayList = new ArrayList();
        for (LocalHomeFunction localHomeFunction : list) {
            int i2 = component3 + 13;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            if (Intrinsics.areEqual(localHomeFunction.getFuncId(), SettingItems.INSTANCE.getBIOMETRICS().getFirst())) {
                int i4 = component2 + 69;
                component3 = i4 % 128;
                arrayList.add(toSettingBean$default(localHomeFunction, false, i4 % 2 != 0 ? BiometricHelper2.getInstance().isOpenBiometricLogin() : BiometricHelper2.getInstance().isOpenBiometricLogin(), null, 4, null));
            } else if (Intrinsics.areEqual(localHomeFunction.getFuncId(), SettingItems.INSTANCE.getFIND_SHOP().getFirst())) {
                arrayList.add(toSettingBean$default(localHomeFunction, false, false, FIND_SAFARICOM_SHOP_URL, 3, null));
                int i5 = component2 + 41;
                component3 = i5 % 128;
                int i6 = i5 % 2;
            } else {
                arrayList.add(toSettingBean(localHomeFunction));
            }
        }
        return arrayList;
    }
}
