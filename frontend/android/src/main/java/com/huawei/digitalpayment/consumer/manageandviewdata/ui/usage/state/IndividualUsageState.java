package com.huawei.digitalpayment.consumer.manageandviewdata.ui.usage.state;

import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JU\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bHÇ\u0001J\u0013\u0010\u001f\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010!\u001a\u00020\"H×\u0001J\t\u0010#\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0016R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0016¨\u0006$"}, d2 = {"Lcom/huawei/digitalpayment/consumer/manageandviewdata/ui/usage/state/IndividualUsageState;", "", "balanceName", "", "periodLabel", "selectedDateRange", "usageItems", "", "Lcom/huawei/digitalpayment/consumer/manageandviewdata/ui/usage/state/IndividualUsageItemData;", "totalAmount", GriverMonitorConstants.KEY_IS_LOADING, "", "isError", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZZ)V", "getBalanceName", "()Ljava/lang/String;", "getPeriodLabel", "getSelectedDateRange", "getUsageItems", "()Ljava/util/List;", "getTotalAmount", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "ConsumerSfcManageAndViewData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IndividualUsageState {
    public static final int $stable = 8;
    private static int equals = 73 % 128;
    private static int getAsAtTimestamp = 0;
    private static int getRequestBeneficiariesState = 0;
    private static int toString = 1;
    private final boolean ShareDataUIState;
    private final String component1;
    private final String component2;
    private final boolean component3;
    private final List<IndividualUsageItemData> component4;
    private final String copy;
    private final String copydefault;

    public IndividualUsageState(String str, String str2, String str3, List<IndividualUsageItemData> list, String str4, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.copydefault = str;
        this.component1 = str2;
        this.component2 = str3;
        this.component4 = list;
        this.copy = str4;
        this.component3 = z;
        this.ShareDataUIState = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IndividualUsageState(String str, String str2, String str3, List list, String str4, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z3;
        String str5 = "";
        if ((i & 1) != 0) {
            int i2 = getAsAtTimestamp + 73;
            toString = i2 % 128;
            int i3 = i2 % 2;
            str = "";
        }
        String str6 = (i & 2) != 0 ? "Period" : str2;
        if ((i & 4) != 0) {
            int i4 = 2 % 2;
        } else {
            str5 = str3;
        }
        if ((i & 8) != 0) {
            list = CollectionsKt.emptyList();
            int i5 = toString + 21;
            getAsAtTimestamp = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        }
        List list2 = list;
        String str7 = (i & 16) != 0 ? "0.00" : str4;
        if ((i & 32) != 0) {
            int i8 = getAsAtTimestamp + 65;
            toString = i8 % 128;
            int i9 = i8 % 2;
            z3 = false;
        } else {
            z3 = z;
        }
        this(str, str6, str5, list2, str7, z3, (i & 64) != 0 ? false : z2);
    }

    public final String getBalanceName() {
        int i = 2 % 2;
        int i2 = toString + 57;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        String str = this.copydefault;
        int i5 = i3 + 13;
        toString = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getPeriodLabel() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 53;
        toString = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component1;
        int i5 = i2 + 31;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getSelectedDateRange() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 71;
        int i3 = i2 % 128;
        toString = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.component2;
        int i4 = i3 + 17;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final List<IndividualUsageItemData> getUsageItems() {
        List<IndividualUsageItemData> list;
        int i = 2 % 2;
        int i2 = toString + 99;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        if (i2 % 2 != 0) {
            list = this.component4;
            int i4 = 96 / 0;
        } else {
            list = this.component4;
        }
        int i5 = i3 + 29;
        toString = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 7 / 0;
        }
        return list;
    }

    public final String getTotalAmount() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 19;
        toString = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copy;
        int i5 = i2 + 81;
        toString = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final boolean isLoading() {
        int i = 2 % 2;
        int i2 = toString + 95;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean isError() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 23;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.ShareDataUIState;
        int i5 = i2 + 15;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    static {
        if (73 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public IndividualUsageState() {
        this(null, null, null, null, null, false, false, 127, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static IndividualUsageState copy$default(IndividualUsageState individualUsageState, String str, String str2, String str3, List list, String str4, boolean z, boolean z2, int i, Object obj) {
        boolean z3;
        boolean z4;
        int i2 = 2 % 2;
        String str5 = (i & 1) != 0 ? individualUsageState.copydefault : str;
        String str6 = (i & 2) != 0 ? individualUsageState.component1 : str2;
        String str7 = (i & 4) != 0 ? individualUsageState.component2 : str3;
        List list2 = (i & 8) != 0 ? individualUsageState.component4 : list;
        String str8 = (i & 16) != 0 ? individualUsageState.copy : str4;
        if ((i & 32) != 0) {
            int i3 = getAsAtTimestamp;
            int i4 = i3 + 37;
            toString = i4 % 128;
            if (i4 % 2 == 0) {
                z3 = individualUsageState.component3;
                int i5 = 39 / 0;
            } else {
                z3 = individualUsageState.component3;
            }
            int i6 = i3 + 119;
            toString = i6 % 128;
            int i7 = i6 % 2;
        } else {
            z3 = z;
        }
        if ((i & 64) != 0) {
            z4 = individualUsageState.ShareDataUIState;
            int i8 = toString + 111;
            getAsAtTimestamp = i8 % 128;
            int i9 = i8 % 2;
        } else {
            z4 = z2;
        }
        return individualUsageState.copy(str5, str6, str7, list2, str8, z3, z4);
    }

    public final String component1() {
        String str;
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 91;
        getAsAtTimestamp = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.copydefault;
            int i4 = 72 / 0;
        } else {
            str = this.copydefault;
        }
        int i5 = i2 + 29;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 4 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 99;
        toString = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component1;
        int i5 = i2 + 75;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 5;
        toString = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<IndividualUsageItemData> component4() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 91;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        List<IndividualUsageItemData> list = this.component4;
        int i5 = i2 + 121;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 89;
        toString = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copy;
        int i5 = i2 + 107;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean component6() {
        int i = 2 % 2;
        int i2 = toString + 121;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean component7() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 103;
        int i3 = i2 % 128;
        toString = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.ShareDataUIState;
        int i4 = i3 + 15;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final IndividualUsageState copy(String balanceName, String periodLabel, String selectedDateRange, List<IndividualUsageItemData> usageItems, String totalAmount, boolean isLoading, boolean isError) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(balanceName, "");
        Intrinsics.checkNotNullParameter(periodLabel, "");
        Intrinsics.checkNotNullParameter(selectedDateRange, "");
        Intrinsics.checkNotNullParameter(usageItems, "");
        Intrinsics.checkNotNullParameter(totalAmount, "");
        IndividualUsageState individualUsageState = new IndividualUsageState(balanceName, periodLabel, selectedDateRange, usageItems, totalAmount, isLoading, isError);
        int i2 = getAsAtTimestamp + 111;
        toString = i2 % 128;
        if (i2 % 2 != 0) {
            return individualUsageState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndividualUsageState)) {
            return false;
        }
        IndividualUsageState individualUsageState = (IndividualUsageState) other;
        if (!Intrinsics.areEqual(this.copydefault, individualUsageState.copydefault) || !Intrinsics.areEqual(this.component1, individualUsageState.component1) || (!Intrinsics.areEqual(this.component2, individualUsageState.component2))) {
            return false;
        }
        if (!Intrinsics.areEqual(this.component4, individualUsageState.component4)) {
            int i2 = toString + 29;
            int i3 = i2 % 128;
            getAsAtTimestamp = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 25;
            toString = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 44 / 0;
            }
            return false;
        }
        if (!Intrinsics.areEqual(this.copy, individualUsageState.copy)) {
            return false;
        }
        if (this.component3 != individualUsageState.component3) {
            int i7 = getAsAtTimestamp + 27;
            toString = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (this.ShareDataUIState == individualUsageState.ShareDataUIState) {
            return true;
        }
        int i9 = toString + 23;
        getAsAtTimestamp = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = toString + 41;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((this.copydefault.hashCode() * 31) + this.component1.hashCode()) * 31) + this.component2.hashCode()) * 31) + this.component4.hashCode()) * 31) + this.copy.hashCode()) * 31) + Boolean.hashCode(this.component3)) * 31) + Boolean.hashCode(this.ShareDataUIState);
        int i4 = getAsAtTimestamp + 79;
        toString = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 88 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "IndividualUsageState(balanceName=" + this.copydefault + ", periodLabel=" + this.component1 + ", selectedDateRange=" + this.component2 + ", usageItems=" + this.component4 + ", totalAmount=" + this.copy + ", isLoading=" + this.component3 + ", isError=" + this.ShareDataUIState + ")";
        int i2 = getAsAtTimestamp + 79;
        toString = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
