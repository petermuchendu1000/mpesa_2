package com.huawei.digitalpayment.consumer.sfcui.components.bundles;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0001\u0012\b\b\u0001\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0001HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0003\u0010\t\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001f\u001a\u00020\u0005H×\u0001J\t\u0010 \u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006!"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/components/bundles/BundleMenu;", "", "title", "", "titleRes", "", "subtitle", "subtitleRes", FirebaseAnalytics.Param.DESTINATION, "icon", "<init>", "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;I)V", "getTitle", "()Ljava/lang/String;", "getTitleRes", "()I", "getSubtitle", "getSubtitleRes", "getDestination", "()Ljava/lang/Object;", "getIcon", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BundleMenu {
    public static final int $stable = 8;
    private static int copy = 0;
    private static int equals = 1;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState;
    private final int ShareDataUIState;
    private final Object component1;
    private final int component2;
    private final String component3;
    private final int component4;
    private final String copydefault;

    public BundleMenu(String str, int i, String str2, int i2, Object obj, int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(obj, "");
        this.component3 = str;
        this.component4 = i;
        this.copydefault = str2;
        this.ShareDataUIState = i2;
        this.component1 = obj;
        this.component2 = i3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BundleMenu(String str, int i, String str2, int i2, Object obj, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        String str3;
        String str4;
        int i5;
        if ((i4 & 1) != 0) {
            int i6 = copy + 49;
            getAsAtTimestamp = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            str3 = "";
        } else {
            str3 = str;
        }
        int i9 = (i4 & 2) != 0 ? -1 : i;
        if ((i4 & 4) != 0) {
            int i10 = 2 % 2;
            str4 = "";
        } else {
            str4 = str2;
        }
        if ((i4 & 8) != 0) {
            int i11 = getAsAtTimestamp + 47;
            copy = i11 % 128;
            int i12 = i11 % 2;
            i5 = -1;
        } else {
            i5 = i2;
        }
        this(str3, i9, str4, i5, (i4 & 16) != 0 ? new Object() : obj, i3);
    }

    public final String getTitle() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 19;
        copy = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component3;
        int i5 = i2 + 3;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int getTitleRes() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 59;
        copy = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.component4;
        int i6 = i2 + 95;
        copy = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String getSubtitle() {
        int i = 2 % 2;
        int i2 = copy + 47;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return this.copydefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getSubtitleRes() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 121;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.ShareDataUIState;
        int i6 = i2 + 49;
        getAsAtTimestamp = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final Object getDestination() {
        int i = 2 % 2;
        int i2 = copy + 71;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        Object obj = this.component1;
        int i4 = i3 + 115;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return obj;
    }

    public final int getIcon() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 73;
        copy = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = this.component2;
        int i5 = i2 + 7;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    static {
        int i = 1 + 9;
        getRequestBeneficiariesState = i % 128;
        if (i % 2 != 0) {
            int i2 = 23 / 0;
        }
    }

    public static BundleMenu copy$default(BundleMenu bundleMenu, String str, int i, String str2, int i2, Object obj, int i3, int i4, Object obj2) {
        int i5 = 2 % 2;
        int i6 = copy;
        int i7 = i6 + 109;
        getAsAtTimestamp = i7 % 128;
        int i8 = i7 % 2;
        if ((i4 & 1) != 0) {
            int i9 = i6 + 3;
            getAsAtTimestamp = i9 % 128;
            if (i9 % 2 == 0) {
                String str3 = bundleMenu.component3;
                throw null;
            }
            str = bundleMenu.component3;
        }
        String str4 = str;
        if ((i4 & 2) != 0) {
            i = bundleMenu.component4;
        }
        int i10 = i;
        if ((i4 & 4) != 0) {
            str2 = bundleMenu.copydefault;
        }
        String str5 = str2;
        if ((i4 & 8) != 0) {
            int i11 = i6 + 73;
            getAsAtTimestamp = i11 % 128;
            int i12 = i11 % 2;
            i2 = bundleMenu.ShareDataUIState;
            if (i12 == 0) {
                int i13 = 5 / 0;
            }
        }
        int i14 = i2;
        if ((i4 & 16) != 0) {
            int i15 = i6 + 5;
            getAsAtTimestamp = i15 % 128;
            int i16 = i15 % 2;
            obj = bundleMenu.component1;
        }
        Object obj3 = obj;
        if ((i4 & 32) != 0) {
            int i17 = i6 + 43;
            getAsAtTimestamp = i17 % 128;
            int i18 = i17 % 2;
            i3 = bundleMenu.component2;
            if (i18 == 0) {
                int i19 = 60 / 0;
            }
        }
        return bundleMenu.copy(str4, i10, str5, i14, obj3, i3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 57;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component3;
        }
        throw null;
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = copy + 43;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copy + 95;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.copydefault;
        int i4 = i3 + 91;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final int component4() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 3;
        copy = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.ShareDataUIState;
        int i6 = i2 + 43;
        copy = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    public final Object component5() {
        Object obj;
        int i = 2 % 2;
        int i2 = copy + 81;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        if (i2 % 2 == 0) {
            obj = this.component1;
            int i4 = 9 / 0;
        } else {
            obj = this.component1;
        }
        int i5 = i3 + 59;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return obj;
    }

    public final int component6() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 39;
        copy = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = this.component2;
        int i5 = i2 + 23;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final BundleMenu copy(String title, int titleRes, String subtitle, int subtitleRes, Object destination, int icon) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(title, "");
        Intrinsics.checkNotNullParameter(subtitle, "");
        Intrinsics.checkNotNullParameter(destination, "");
        BundleMenu bundleMenu = new BundleMenu(title, titleRes, subtitle, subtitleRes, destination, icon);
        int i2 = copy + 111;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 24 / 0;
        }
        return bundleMenu;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof BundleMenu)) {
            return false;
        }
        BundleMenu bundleMenu = (BundleMenu) other;
        if (!Intrinsics.areEqual(this.component3, bundleMenu.component3)) {
            int i2 = getAsAtTimestamp + 71;
            int i3 = i2 % 128;
            copy = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 23;
            getAsAtTimestamp = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 71 / 0;
            }
            return false;
        }
        if (this.component4 != bundleMenu.component4 || !Intrinsics.areEqual(this.copydefault, bundleMenu.copydefault)) {
            return false;
        }
        if (this.ShareDataUIState != bundleMenu.ShareDataUIState) {
            int i7 = copy + 69;
            getAsAtTimestamp = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.component1, bundleMenu.component1)) {
            int i9 = copy + 109;
            getAsAtTimestamp = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (this.component2 == bundleMenu.component2) {
            return true;
        }
        int i11 = copy + 23;
        getAsAtTimestamp = i11 % 128;
        return i11 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 1;
        copy = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((this.component3.hashCode() * 31) + Integer.hashCode(this.component4)) * 31) + this.copydefault.hashCode()) * 31) + Integer.hashCode(this.ShareDataUIState)) * 31) + this.component1.hashCode()) * 31) + Integer.hashCode(this.component2);
        int i4 = getAsAtTimestamp + 61;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BundleMenu(title=" + this.component3 + ", titleRes=" + this.component4 + ", subtitle=" + this.copydefault + ", subtitleRes=" + this.ShareDataUIState + ", destination=" + this.component1 + ", icon=" + this.component2 + ")";
        int i2 = copy + 41;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
