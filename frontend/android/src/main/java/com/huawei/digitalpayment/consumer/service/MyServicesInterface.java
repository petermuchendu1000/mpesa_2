package com.huawei.digitalpayment.consumer.service;

import com.alibaba.griver.api.ui.splash.SplashEntryInfo;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016¨\u0006\u000f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/service/MyServicesInterface;", "", "setNeedRefresh", "", SplashEntryInfo.NEED_REFRESH, "", "getNeedRefresh", "setMaxCount", "maxCount", "", "getMaxCount", "updateMyServices", "myServices", "", "getMyServices", "ServiceModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface MyServicesInterface {
    int getMaxCount();

    String getMyServices();

    boolean getNeedRefresh();

    void setMaxCount(int maxCount);

    void setNeedRefresh(boolean needRefresh);

    void updateMyServices(String myServices);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        private static int ShareDataUIState = 1;
        private static int component1;

        public static String getMyServices(MyServicesInterface myServicesInterface) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 59;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                return "";
            }
            throw null;
        }

        public static int getMaxCount(MyServicesInterface myServicesInterface) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 85;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 125;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 90 / 0;
            }
            return 7;
        }

        public static boolean getNeedRefresh(MyServicesInterface myServicesInterface) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 101;
            int i3 = i2 % 128;
            component1 = i3;
            boolean z = i2 % 2 != 0;
            int i4 = i3 + 61;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                return z;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static void setMaxCount(MyServicesInterface myServicesInterface, int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 33;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static void setNeedRefresh(MyServicesInterface myServicesInterface, boolean z) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 23;
            component1 = i2 % 128;
            int i3 = i2 % 2;
        }

        public static void updateMyServices(MyServicesInterface myServicesInterface, String str) {
            int i = 2 % 2;
            int i2 = component1 + 113;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }
    }
}
