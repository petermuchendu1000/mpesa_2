package com.huawei.digitalpayment.consumer.base.sim;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/sim/SIMInfo;", "", "isDualSim", "", "lsSimCards", "", "Lcom/huawei/digitalpayment/consumer/base/sim/SIMCard;", "isPhonePermissionGranted", "<init>", "(ZLjava/util/List;Z)V", "()Z", "getLsSimCards", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SIMInfo {
    private static int component2 = 0;
    private static int component3 = 1;
    private final boolean ShareDataUIState;
    private final List<SIMCard> component1;
    private final boolean copydefault;

    public SIMInfo(boolean z, List<SIMCard> list, boolean z2) {
        Intrinsics.checkNotNullParameter(list, "");
        this.ShareDataUIState = z;
        this.component1 = list;
        this.copydefault = z2;
    }

    public final boolean isDualSim() {
        int i = 2 % 2;
        int i2 = component2 + 13;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        boolean z = this.ShareDataUIState;
        int i5 = i3 + 9;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SIMInfo(boolean z, List list, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component2 + 91;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            z = false;
        }
        if ((i & 2) != 0) {
            int i4 = component3 + 3;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                list = CollectionsKt.emptyList();
                int i5 = 2 % 2;
            } else {
                CollectionsKt.emptyList();
                throw null;
            }
        }
        this(z, list, (i & 4) != 0 ? false : z2);
    }

    public final List<SIMCard> getLsSimCards() {
        int i = 2 % 2;
        int i2 = component2 + 37;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        List<SIMCard> list = this.component1;
        int i5 = i3 + 115;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final boolean isPhonePermissionGranted() {
        int i = 2 % 2;
        int i2 = component3 + 87;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        boolean z = this.copydefault;
        int i5 = i3 + 17;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public SIMInfo() {
        this(false, null, false, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static SIMInfo copy$default(SIMInfo sIMInfo, boolean z, List list, boolean z2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2;
        int i4 = i3 + 79;
        component3 = i4 % 128;
        if (i4 % 2 != 0 && (i & 1) != 0) {
            z = sIMInfo.ShareDataUIState;
        }
        if ((i & 2) != 0) {
            int i5 = i3 + 123;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                List<SIMCard> list2 = sIMInfo.component1;
                throw null;
            }
            list = sIMInfo.component1;
        }
        if ((i & 4) != 0) {
            z2 = sIMInfo.copydefault;
        }
        SIMInfo sIMInfoCopy = sIMInfo.copy(z, list, z2);
        int i6 = component3 + 15;
        component2 = i6 % 128;
        int i7 = i6 % 2;
        return sIMInfoCopy;
    }

    public final boolean component1() {
        int i = 2 % 2;
        int i2 = component2 + 5;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        boolean z = this.ShareDataUIState;
        int i5 = i3 + 63;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final List<SIMCard> component2() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 39;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        List<SIMCard> list = this.component1;
        int i5 = i2 + 107;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final boolean component3() {
        int i = 2 % 2;
        int i2 = component3 + 95;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.copydefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final SIMInfo copy(boolean isDualSim, List<SIMCard> lsSimCards, boolean isPhonePermissionGranted) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(lsSimCards, "");
        SIMInfo sIMInfo = new SIMInfo(isDualSim, lsSimCards, isPhonePermissionGranted);
        int i2 = component2 + 53;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return sIMInfo;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 25;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            int i5 = i2 + 17;
            component2 = i5 % 128;
            return i5 % 2 == 0;
        }
        if (!(other instanceof SIMInfo)) {
            return false;
        }
        SIMInfo sIMInfo = (SIMInfo) other;
        if (this.ShareDataUIState != sIMInfo.ShareDataUIState) {
            int i6 = i2 + 81;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.component1, sIMInfo.component1)) {
            return this.copydefault == sIMInfo.copydefault;
        }
        int i8 = component3;
        int i9 = i8 + 63;
        component2 = i9 % 128;
        int i10 = i9 % 2;
        int i11 = i8 + 89;
        component2 = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 67;
        component2 = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (((Boolean.hashCode(this.ShareDataUIState) * 79) >> this.component1.hashCode()) * 31) / Boolean.hashCode(this.copydefault) : (((Boolean.hashCode(this.ShareDataUIState) * 31) + this.component1.hashCode()) * 31) + Boolean.hashCode(this.copydefault);
        int i3 = component2 + 43;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SIMInfo(isDualSim=" + this.ShareDataUIState + ", lsSimCards=" + this.component1 + ", isPhonePermissionGranted=" + this.copydefault + ")";
        int i2 = component3 + 49;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
