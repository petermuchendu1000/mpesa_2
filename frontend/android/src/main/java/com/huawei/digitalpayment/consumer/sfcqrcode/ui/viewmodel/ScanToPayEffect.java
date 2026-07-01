package com.huawei.digitalpayment.consumer.sfcqrcode.ui.viewmodel;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcqrcode/ui/viewmodel/ScanToPayEffect;", "", "<init>", "()V", "NavigateToRoute", "ShowError", "Lcom/huawei/digitalpayment/consumer/sfcqrcode/ui/viewmodel/ScanToPayEffect$NavigateToRoute;", "Lcom/huawei/digitalpayment/consumer/sfcqrcode/ui/viewmodel/ScanToPayEffect$ShowError;", "ConsumerSfcQrCodeUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ScanToPayEffect {
    public static final int $stable = 0;
    private static int component3 = 1;
    private static int copydefault;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcqrcode/ui/viewmodel/ScanToPayEffect$NavigateToRoute;", "Lcom/huawei/digitalpayment/consumer/sfcqrcode/ui/viewmodel/ScanToPayEffect;", "route", "", "params", "", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getRoute", "()Ljava/lang/String;", "getParams", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcQrCodeUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NavigateToRoute extends ScanToPayEffect {
        public static final int $stable = 8;
        private static int ShareDataUIState = 0;
        private static int component1 = 0;
        private static int component3 = 115 % 128;
        private static int equals = 1;
        private final Map<String, String> component2;
        private final String copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToRoute(String str, Map<String, String> map) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(map, "");
            this.copydefault = str;
            this.component2 = map;
        }

        public final Map<String, String> getParams() {
            Map<String, String> map;
            int i = 2 % 2;
            int i2 = equals + 107;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            if (i2 % 2 != 0) {
                map = this.component2;
                int i4 = 45 / 0;
            } else {
                map = this.component2;
            }
            int i5 = i3 + 41;
            equals = i5 % 128;
            int i6 = i5 % 2;
            return map;
        }

        public final String getRoute() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 7;
            equals = i3 % 128;
            int i4 = i3 % 2;
            String str = this.copydefault;
            int i5 = i2 + 17;
            equals = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        static {
            int i = 115 % 2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static NavigateToRoute copy$default(NavigateToRoute navigateToRoute, String str, Map map, int i, Object obj) {
            int i2 = 2 % 2;
            if ((i & 1) != 0) {
                int i3 = ShareDataUIState + 35;
                equals = i3 % 128;
                int i4 = i3 % 2;
                str = navigateToRoute.copydefault;
            }
            if ((i & 2) != 0) {
                int i5 = ShareDataUIState;
                int i6 = i5 + 97;
                equals = i6 % 128;
                if (i6 % 2 == 0) {
                    Map<String, String> map2 = navigateToRoute.component2;
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Map<String, String> map3 = navigateToRoute.component2;
                int i7 = i5 + 93;
                equals = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 2 / 2;
                }
                map = map3;
            }
            return navigateToRoute.copy(str, map);
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = equals;
            int i3 = i2 + 45;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            String str = this.copydefault;
            int i5 = i2 + 121;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final Map<String, String> component2() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 63;
            int i3 = i2 % 128;
            equals = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Map<String, String> map = this.component2;
            int i4 = i3 + 107;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return map;
        }

        public final NavigateToRoute copy(String route, Map<String, String> params) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(route, "");
            Intrinsics.checkNotNullParameter(params, "");
            NavigateToRoute navigateToRoute = new NavigateToRoute(route, params);
            int i2 = equals + 119;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return navigateToRoute;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                return true;
            }
            if (!(other instanceof NavigateToRoute)) {
                int i2 = ShareDataUIState + 91;
                equals = i2 % 128;
                return i2 % 2 == 0;
            }
            NavigateToRoute navigateToRoute = (NavigateToRoute) other;
            if (!Intrinsics.areEqual(this.copydefault, navigateToRoute.copydefault)) {
                return false;
            }
            if (Intrinsics.areEqual(this.component2, navigateToRoute.component2)) {
                return true;
            }
            int i3 = ShareDataUIState + 119;
            equals = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = equals + 89;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (this.copydefault.hashCode() * 31) + this.component2.hashCode();
            int i4 = equals + 103;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 75 / 0;
            }
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "NavigateToRoute(route=" + this.copydefault + ", params=" + this.component2 + ")";
            int i2 = ShareDataUIState + 55;
            equals = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 23 / 0;
            }
            return str;
        }
    }

    private ScanToPayEffect() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcqrcode/ui/viewmodel/ScanToPayEffect$ShowError;", "Lcom/huawei/digitalpayment/consumer/sfcqrcode/ui/viewmodel/ScanToPayEffect;", "<init>", "()V", "ConsumerSfcQrCodeUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ShowError extends ScanToPayEffect {
        public static final int $stable = 0;
        public static final ShowError INSTANCE = new ShowError();
        private static int ShareDataUIState = 1;
        private static int copydefault;

        private ShowError() {
            super(null);
        }

        static {
            int i = ShareDataUIState + 29;
            copydefault = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = 1 + 7;
        copydefault = i % 128;
        if (i % 2 != 0) {
            int i2 = 43 / 0;
        }
    }

    public ScanToPayEffect(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
