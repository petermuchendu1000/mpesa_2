package com.huawei.digitalpayment.consumer.service;

import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H\u0016J \u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/huawei/digitalpayment/consumer/service/IHomeModule2Service;", "", "refreshTheme", "", KeysConstants.KEY_LOGIN_INFO, "", "refreshBalance", "getMiniAppNameById", "appId", "defaultValue", "getMiniAppIconById", "isLightIcon", "", "ServiceModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface IHomeModule2Service {
    String getMiniAppIconById(String appId, String defaultValue, boolean isLightIcon);

    String getMiniAppNameById(String appId, String defaultValue);

    void refreshBalance();

    void refreshTheme(String loginInfo);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        private static int ShareDataUIState = 1;
        private static int copydefault;

        public static String getMiniAppNameById$default(IHomeModule2Service iHomeModule2Service, String str, String str2, int i, Object obj) {
            int i2 = 2 % 2;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMiniAppNameById");
            }
            Object obj2 = null;
            if ((i & 2) != 0) {
                int i3 = copydefault + 45;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
                str2 = "";
            }
            String miniAppNameById = iHomeModule2Service.getMiniAppNameById(str, str2);
            int i4 = ShareDataUIState + 103;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                return miniAppNameById;
            }
            obj2.hashCode();
            throw null;
        }

        public static String getMiniAppIconById$default(IHomeModule2Service iHomeModule2Service, String str, String str2, boolean z, int i, Object obj) {
            int i2 = 2 % 2;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMiniAppIconById");
            }
            int i3 = ShareDataUIState + 33;
            int i4 = i3 % 128;
            copydefault = i4;
            int i5 = i3 % 2;
            if ((i & 2) != 0) {
                int i6 = i4 + 27;
                ShareDataUIState = i6 % 128;
                if (i6 % 2 == 0) {
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                str2 = "";
            }
            if ((i & 4) != 0) {
                int i7 = i4 + 103;
                ShareDataUIState = i7 % 128;
                int i8 = i7 % 2;
                z = true;
            }
            return iHomeModule2Service.getMiniAppIconById(str, str2, z);
        }

        public static String getMiniAppIconById(IHomeModule2Service iHomeModule2Service, String str, String str2, boolean z) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 59;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                return str2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static String getMiniAppNameById(IHomeModule2Service iHomeModule2Service, String str, String str2) {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 119;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 43;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                return str2;
            }
            throw null;
        }

        public static void refreshBalance(IHomeModule2Service iHomeModule2Service) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 65;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }
    }
}
