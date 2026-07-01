package com.huawei.digitalpayment.consumer.sfcui.buybundles.favouritebundles;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/favouritebundles/BundleNavigation;", "", "route", "", "args", "Landroid/os/Bundle;", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;)V", "getRoute", "()Ljava/lang/String;", "getArgs", "()Landroid/os/Bundle;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BundleNavigation {
    public static final int $stable = 8;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int component4 = 1;
    private static int copydefault;
    private final Bundle ShareDataUIState;
    private final String component2;

    public BundleNavigation(String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        this.component2 = str;
        this.ShareDataUIState = bundle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BundleNavigation(String str, Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = copydefault + 51;
            component4 = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i3 = 2 % 2;
            bundle = null;
        }
        this(str, bundle);
    }

    public final String getRoute() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 17;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component2;
        int i5 = i2 + 93;
        component4 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Bundle getArgs() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 125;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        Bundle bundle = this.ShareDataUIState;
        int i5 = i2 + 43;
        component4 = i5 % 128;
        if (i5 % 2 != 0) {
            return bundle;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = 1 + 1;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public static BundleNavigation copy$default(BundleNavigation bundleNavigation, String str, Bundle bundle, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component4 + 87;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            str = bundleNavigation.component2;
        }
        if ((i & 2) != 0) {
            int i5 = component4 + 49;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                Bundle bundle2 = bundleNavigation.ShareDataUIState;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            bundle = bundleNavigation.ShareDataUIState;
        }
        return bundleNavigation.copy(str, bundle);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component4 + 97;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.component2;
        int i5 = i3 + 81;
        component4 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final Bundle component2() {
        int i = 2 % 2;
        int i2 = component4 + 15;
        int i3 = i2 % 128;
        copydefault = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        Bundle bundle = this.ShareDataUIState;
        int i4 = i3 + 59;
        component4 = i4 % 128;
        if (i4 % 2 != 0) {
            return bundle;
        }
        obj.hashCode();
        throw null;
    }

    public final BundleNavigation copy(String route, Bundle args) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(route, "");
        BundleNavigation bundleNavigation = new BundleNavigation(route, args);
        int i2 = copydefault + 73;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 1 / 0;
        }
        return bundleNavigation;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault + 63;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        if (this == other) {
            int i5 = i3 + 25;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof BundleNavigation)) {
            int i7 = i3 + 7;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        BundleNavigation bundleNavigation = (BundleNavigation) other;
        if (!Intrinsics.areEqual(this.component2, bundleNavigation.component2)) {
            int i9 = component4 + 93;
            copydefault = i9 % 128;
            return i9 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.ShareDataUIState, bundleNavigation.ShareDataUIState)) {
            return true;
        }
        int i10 = component4 + 55;
        copydefault = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.component2.hashCode();
        Bundle bundle = this.ShareDataUIState;
        if (bundle == null) {
            int i2 = copydefault + 17;
            int i3 = i2 % 128;
            component4 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 101;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 3 % 5;
            }
            iHashCode = 0;
        } else {
            iHashCode = bundle.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BundleNavigation(route=" + this.component2 + ", args=" + this.ShareDataUIState + ")";
        int i2 = component4 + 107;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
