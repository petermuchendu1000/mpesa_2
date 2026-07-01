package com.huawei.digitalpayment.consumer.sfcui.sharedata.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001b\u001a\u00020\u0005H×\u0001J\t\u0010\u001c\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/model/BundleType;", "", "name", "", "activeIcon", "", "inactiveIcon", "balance", "typeName", "<init>", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getActiveIcon", "()I", "getInactiveIcon", "getBalance", "getTypeName", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BundleType {
    public static final int $stable = 0;
    private static int component4 = 0;
    private static int copy = 1;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState;
    private final int ShareDataUIState;
    private final String component1;
    private final String component2;
    private final int component3;
    private final String copydefault;

    public BundleType(String str, int i, int i2, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.component2 = str;
        this.component3 = i;
        this.ShareDataUIState = i2;
        this.copydefault = str2;
        this.component1 = str3;
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 99;
        copy = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component2;
        int i5 = i2 + 63;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int getActiveIcon() {
        int i = 2 % 2;
        int i2 = component4 + 25;
        int i3 = i2 % 128;
        copy = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = this.component3;
        int i5 = i3 + 105;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final int getInactiveIcon() {
        int i = 2 % 2;
        int i2 = component4 + 83;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        int i5 = this.ShareDataUIState;
        int i6 = i3 + 79;
        component4 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String getBalance() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 77;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copydefault;
        int i5 = i2 + 31;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getTypeName() {
        int i = 2 % 2;
        int i2 = component4 + 47;
        int i3 = i2 % 128;
        copy = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.component1;
        int i4 = i3 + 1;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    static {
        int i = 1 + 33;
        getRequestBeneficiariesState = i % 128;
        int i2 = i % 2;
    }

    public static BundleType copy$default(BundleType bundleType, String str, int i, int i2, String str2, String str3, int i3, Object obj) {
        int i4 = 2 % 2;
        int i5 = component4 + 53;
        int i6 = i5 % 128;
        copy = i6;
        if (i5 % 2 != 0 && (i3 & 1) != 0) {
            str = bundleType.component2;
        }
        String str4 = str;
        Object obj2 = null;
        if ((i3 & 2) != 0) {
            int i7 = i6 + 53;
            component4 = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = bundleType.component3;
                obj2.hashCode();
                throw null;
            }
            i = bundleType.component3;
        }
        int i9 = i;
        if ((i3 & 4) != 0) {
            int i10 = i6 + 51;
            component4 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = bundleType.ShareDataUIState;
                throw null;
            }
            i2 = bundleType.ShareDataUIState;
        }
        int i12 = i2;
        if ((i3 & 8) != 0) {
            str2 = bundleType.copydefault;
        }
        String str5 = str2;
        if ((i3 & 16) != 0) {
            int i13 = component4 + 63;
            copy = i13 % 128;
            int i14 = i13 % 2;
            str3 = bundleType.component1;
        }
        return bundleType.copy(str4, i9, i12, str5, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copy + 37;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        String str = this.component2;
        int i5 = i3 + 85;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 43;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.component3;
        int i6 = i2 + 61;
        component4 = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    public final int component3() {
        int i = 2 % 2;
        int i2 = copy + 35;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ShareDataUIState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component4 + 61;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return this.copydefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component5() {
        String str;
        int i = 2 % 2;
        int i2 = copy + 103;
        int i3 = i2 % 128;
        component4 = i3;
        if (i2 % 2 != 0) {
            str = this.component1;
            int i4 = 50 / 0;
        } else {
            str = this.component1;
        }
        int i5 = i3 + 49;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final BundleType copy(String name, int activeIcon, int inactiveIcon, String balance, String typeName) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(name, "");
        Intrinsics.checkNotNullParameter(balance, "");
        Intrinsics.checkNotNullParameter(typeName, "");
        BundleType bundleType = new BundleType(name, activeIcon, inactiveIcon, balance, typeName);
        int i2 = component4 + 95;
        copy = i2 % 128;
        int i3 = i2 % 2;
        return bundleType;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copy;
            int i3 = i2 + 65;
            component4 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 57;
            component4 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof BundleType)) {
            int i7 = component4 + 61;
            copy = i7 % 128;
            return i7 % 2 == 0;
        }
        BundleType bundleType = (BundleType) other;
        if ((!Intrinsics.areEqual(this.component2, bundleType.component2)) || this.component3 != bundleType.component3 || this.ShareDataUIState != bundleType.ShareDataUIState) {
            return false;
        }
        if (Intrinsics.areEqual(this.copydefault, bundleType.copydefault)) {
            return Intrinsics.areEqual(this.component1, bundleType.component1);
        }
        int i8 = component4 + 77;
        copy = i8 % 128;
        return i8 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component4 + 121;
        copy = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.component2.hashCode() * 31) + Integer.hashCode(this.component3)) * 31) + Integer.hashCode(this.ShareDataUIState)) * 31) + this.copydefault.hashCode()) * 31) + this.component1.hashCode();
        int i4 = copy + 101;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BundleType(name=" + this.component2 + ", activeIcon=" + this.component3 + ", inactiveIcon=" + this.ShareDataUIState + ", balance=" + this.copydefault + ", typeName=" + this.component1 + ")";
        int i2 = component4 + 19;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
