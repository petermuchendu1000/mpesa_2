package com.huawei.digitalpayment.consumer.manageandviewdata.ui.usage.state;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0010\u001a\u00020\u0011H×\u0001J\t\u0010\u0012\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/consumer/manageandviewdata/ui/usage/state/IndividualUsageItemData;", "", "description", "", "charge", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getCharge", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcManageAndViewData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IndividualUsageItemData {
    public static final int $stable = 0;
    private static int component1 = 0;
    private static int component3 = 69 % 128;
    private static int copy = 1;
    private static int copydefault;
    private final String ShareDataUIState;
    private final String component2;

    public IndividualUsageItemData(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.component2 = str;
        this.ShareDataUIState = str2;
    }

    public final String getDescription() {
        int i = 2 % 2;
        int i2 = component1 + 31;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getCharge() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 69;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.ShareDataUIState;
        int i5 = i2 + 53;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = 69 % 2;
    }

    public static IndividualUsageItemData copy$default(IndividualUsageItemData individualUsageItemData, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1;
        int i4 = i3 + 91;
        copy = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 21;
            copy = i6 % 128;
            int i7 = i6 % 2;
            str = individualUsageItemData.component2;
        }
        if ((i & 2) != 0) {
            str2 = individualUsageItemData.ShareDataUIState;
        }
        return individualUsageItemData.copy(str, str2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 37;
        copy = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component2;
        int i5 = i2 + 1;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 58 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 9;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.ShareDataUIState;
        int i5 = i2 + 93;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final IndividualUsageItemData copy(String description, String charge) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(description, "");
        Intrinsics.checkNotNullParameter(charge, "");
        IndividualUsageItemData individualUsageItemData = new IndividualUsageItemData(description, charge);
        int i2 = component1 + 63;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return individualUsageItemData;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (other instanceof IndividualUsageItemData) {
            IndividualUsageItemData individualUsageItemData = (IndividualUsageItemData) other;
            if (Intrinsics.areEqual(this.component2, individualUsageItemData.component2)) {
                return Intrinsics.areEqual(this.ShareDataUIState, individualUsageItemData.ShareDataUIState);
            }
            int i2 = copy + 49;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = component1;
        int i5 = i4 + 25;
        copy = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 111;
        copy = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copy + 105;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.component2.hashCode() * 31) + this.ShareDataUIState.hashCode();
        int i4 = component1 + 11;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "IndividualUsageItemData(description=" + this.component2 + ", charge=" + this.ShareDataUIState + ")";
        int i2 = component1 + 3;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
