package com.huawei.digitalpayment.consumer.manageandviewdata.ui.usage.state;

import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.huawei.digitalpayment.consumer.manageandviewdata.dataManager.models.TimeInterval;
import com.huawei.digitalpayment.consumer.manageandviewdata.dataManager.utils.Intervals;
import com.huawei.digitalpayment.consumer.manageandviewdata.resp.AccountUsage;
import com.huawei.digitalpayment.consumer.manageandviewdata.resp.Percentage;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\fHÆ\u0003J\t\u0010#\u001a\u00020\u000eHÆ\u0003J\t\u0010$\u001a\u00020\u0010HÆ\u0003Je\u0010%\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÇ\u0001J\u0013\u0010&\u001a\u00020\b2\b\u0010'\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010(\u001a\u00020)H×\u0001J\t\u0010*\u001a\u00020\u000eH×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0016R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0016R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006+"}, d2 = {"Lcom/huawei/digitalpayment/consumer/manageandviewdata/ui/usage/state/AirtimeUsageState;", "", "percentageList", "", "Lcom/huawei/digitalpayment/consumer/manageandviewdata/resp/Percentage;", "usageList", "Lcom/huawei/digitalpayment/consumer/manageandviewdata/resp/AccountUsage;", GriverMonitorConstants.KEY_IS_LOADING, "", "isError", "isEmpty", "total", "", "selectedLabel", "", "selectedInterval", "Lcom/huawei/digitalpayment/consumer/manageandviewdata/dataManager/models/TimeInterval;", "<init>", "(Ljava/util/List;Ljava/util/List;ZZZDLjava/lang/String;Lcom/huawei/digitalpayment/consumer/manageandviewdata/dataManager/models/TimeInterval;)V", "getPercentageList", "()Ljava/util/List;", "getUsageList", "()Z", "getTotal", "()D", "getSelectedLabel", "()Ljava/lang/String;", "getSelectedInterval", "()Lcom/huawei/digitalpayment/consumer/manageandviewdata/dataManager/models/TimeInterval;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "ConsumerSfcManageAndViewData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AirtimeUsageState {
    public static final int $stable = 8;
    private static int ArtificialStackFrames = 0;
    private static int getAsAtTimestamp = 0;
    private static int getRequestBeneficiariesState = 103 % 128;
    private static int hashCode = 1;
    private final List<Percentage> ShareDataUIState;
    private final boolean component1;
    private final TimeInterval component2;
    private final boolean component3;
    private final List<AccountUsage> component4;
    private final String copy;
    private final boolean copydefault;
    private final double equals;

    public AirtimeUsageState(List<Percentage> list, List<AccountUsage> list2, boolean z, boolean z2, boolean z3, double d2, String str, TimeInterval timeInterval) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(timeInterval, "");
        this.ShareDataUIState = list;
        this.component4 = list2;
        this.component1 = z;
        this.copydefault = z2;
        this.component3 = z3;
        this.equals = d2;
        this.copy = str;
        this.component2 = timeInterval;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AirtimeUsageState(List list, List list2, boolean z, boolean z2, boolean z3, double d2, String str, TimeInterval timeInterval, int i, DefaultConstructorMarker defaultConstructorMarker) {
        List listEmptyList;
        boolean z4;
        double d3;
        String str2;
        TimeInterval currentPeriod;
        List listEmptyList2 = (i & 1) != 0 ? CollectionsKt.emptyList() : list;
        if ((i & 2) != 0) {
            int i2 = ArtificialStackFrames + 31;
            hashCode = i2 % 128;
            int i3 = i2 % 2;
            listEmptyList = CollectionsKt.emptyList();
        } else {
            listEmptyList = list2;
        }
        boolean z5 = false;
        if ((i & 4) != 0) {
            int i4 = hashCode + 23;
            ArtificialStackFrames = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            z4 = false;
        } else {
            z4 = z;
        }
        boolean z6 = (i & 8) != 0 ? false : z2;
        if ((i & 16) != 0) {
            int i7 = ArtificialStackFrames + 19;
            int i8 = i7 % 128;
            hashCode = i8;
            int i9 = i7 % 2;
            int i10 = i8 + 5;
            ArtificialStackFrames = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 2 % 2;
        } else {
            z5 = z3;
        }
        if ((i & 32) != 0) {
            int i13 = hashCode + 5;
            ArtificialStackFrames = i13 % 128;
            int i14 = i13 % 2;
            d3 = 0.0d;
        } else {
            d3 = d2;
        }
        if ((i & 64) != 0) {
            str2 = "";
            int i15 = 2 % 2;
        } else {
            str2 = str;
        }
        if ((i & 128) != 0) {
            int i16 = ArtificialStackFrames + 1;
            hashCode = i16 % 128;
            if (i16 % 2 == 0) {
                Intervals.INSTANCE.getCurrentPeriod();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            currentPeriod = Intervals.INSTANCE.getCurrentPeriod();
        } else {
            currentPeriod = timeInterval;
        }
        this(listEmptyList2, listEmptyList, z4, z6, z5, d3, str2, currentPeriod);
    }

    public final List<Percentage> getPercentageList() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 61;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        List<Percentage> list = this.ShareDataUIState;
        if (i3 == 0) {
            int i4 = 5 / 0;
        }
        return list;
    }

    public final List<AccountUsage> getUsageList() {
        int i = 2 % 2;
        int i2 = hashCode + 69;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        int i4 = i2 % 2;
        List<AccountUsage> list = this.component4;
        int i5 = i3 + 3;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final boolean isLoading() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 43;
        ArtificialStackFrames = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.component1;
        int i4 = i2 + 85;
        ArtificialStackFrames = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final boolean isError() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 95;
        hashCode = i2 % 128;
        if (i2 % 2 != 0) {
            return this.copydefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean isEmpty() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 37;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.component3;
        int i5 = i2 + 47;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final double getTotal() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 71;
        ArtificialStackFrames = i3 % 128;
        int i4 = i3 % 2;
        double d2 = this.equals;
        int i5 = i2 + 35;
        ArtificialStackFrames = i5 % 128;
        if (i5 % 2 == 0) {
            return d2;
        }
        throw null;
    }

    public final String getSelectedLabel() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 57;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copy;
        int i5 = i2 + 23;
        hashCode = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 88 / 0;
        }
        return str;
    }

    public final TimeInterval getSelectedInterval() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 1;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        TimeInterval timeInterval = this.component2;
        int i5 = i2 + 101;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
        return timeInterval;
    }

    static {
        int i = 103 % 2;
    }

    public AirtimeUsageState() {
        this(null, null, false, false, false, 0.0d, null, null, 255, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static AirtimeUsageState copy$default(AirtimeUsageState airtimeUsageState, List list, List list2, boolean z, boolean z2, boolean z3, double d2, String str, TimeInterval timeInterval, int i, Object obj) {
        List list3;
        boolean z4;
        double d3;
        String str2;
        TimeInterval timeInterval2;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            list3 = airtimeUsageState.ShareDataUIState;
            int i3 = ArtificialStackFrames + 125;
            hashCode = i3 % 128;
            int i4 = i3 % 2;
        } else {
            list3 = list;
        }
        List list4 = (i & 2) != 0 ? airtimeUsageState.component4 : list2;
        boolean z5 = (i & 4) != 0 ? airtimeUsageState.component1 : z;
        boolean z6 = (i & 8) != 0 ? airtimeUsageState.copydefault : z2;
        if ((i & 16) != 0) {
            int i5 = ArtificialStackFrames;
            int i6 = i5 + 35;
            hashCode = i6 % 128;
            int i7 = i6 % 2;
            z4 = airtimeUsageState.component3;
            int i8 = i5 + 65;
            hashCode = i8 % 128;
            int i9 = i8 % 2;
        } else {
            z4 = z3;
        }
        if ((i & 32) != 0) {
            int i10 = hashCode + 43;
            ArtificialStackFrames = i10 % 128;
            int i11 = i10 % 2;
            d3 = airtimeUsageState.equals;
        } else {
            d3 = d2;
        }
        if ((i & 64) != 0) {
            int i12 = hashCode + 107;
            ArtificialStackFrames = i12 % 128;
            if (i12 % 2 != 0) {
                String str3 = airtimeUsageState.copy;
                throw null;
            }
            str2 = airtimeUsageState.copy;
        } else {
            str2 = str;
        }
        if ((i & 128) != 0) {
            timeInterval2 = airtimeUsageState.component2;
            int i13 = hashCode + 1;
            ArtificialStackFrames = i13 % 128;
            int i14 = i13 % 2;
        } else {
            timeInterval2 = timeInterval;
        }
        return airtimeUsageState.copy(list3, list4, z5, z6, z4, d3, str2, timeInterval2);
    }

    public final List<Percentage> component1() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 51;
        int i3 = i2 % 128;
        hashCode = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        List<Percentage> list = this.ShareDataUIState;
        int i4 = i3 + 41;
        ArtificialStackFrames = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final List<AccountUsage> component2() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 41;
        hashCode = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean component3() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 29;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        boolean z = this.component1;
        int i5 = i3 + 59;
        ArtificialStackFrames = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean component4() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 123;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        boolean z = this.copydefault;
        int i5 = i3 + 19;
        ArtificialStackFrames = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean component5() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 19;
        ArtificialStackFrames = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        boolean z = this.component3;
        int i4 = i2 + 13;
        ArtificialStackFrames = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public final double component6() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 101;
        hashCode = i2 % 128;
        if (i2 % 2 != 0) {
            return this.equals;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component7() {
        String str;
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 49;
        hashCode = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.copy;
            int i4 = 34 / 0;
        } else {
            str = this.copy;
        }
        int i5 = i2 + 19;
        hashCode = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 42 / 0;
        }
        return str;
    }

    public final TimeInterval component8() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 109;
        ArtificialStackFrames = i3 % 128;
        int i4 = i3 % 2;
        TimeInterval timeInterval = this.component2;
        int i5 = i2 + 17;
        ArtificialStackFrames = i5 % 128;
        if (i5 % 2 == 0) {
            return timeInterval;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final AirtimeUsageState copy(List<Percentage> percentageList, List<AccountUsage> usageList, boolean isLoading, boolean isError, boolean isEmpty, double total, String selectedLabel, TimeInterval selectedInterval) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(percentageList, "");
        Intrinsics.checkNotNullParameter(usageList, "");
        Intrinsics.checkNotNullParameter(selectedLabel, "");
        Intrinsics.checkNotNullParameter(selectedInterval, "");
        AirtimeUsageState airtimeUsageState = new AirtimeUsageState(percentageList, usageList, isLoading, isError, isEmpty, total, selectedLabel, selectedInterval);
        int i2 = ArtificialStackFrames + 33;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        return airtimeUsageState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof AirtimeUsageState)) {
            int i2 = ArtificialStackFrames + 35;
            hashCode = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        AirtimeUsageState airtimeUsageState = (AirtimeUsageState) other;
        if (!Intrinsics.areEqual(this.ShareDataUIState, airtimeUsageState.ShareDataUIState)) {
            int i4 = ArtificialStackFrames + 93;
            hashCode = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.component4, airtimeUsageState.component4)) {
            return false;
        }
        if (this.component1 != airtimeUsageState.component1) {
            int i6 = ArtificialStackFrames + 49;
            hashCode = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.copydefault != airtimeUsageState.copydefault) {
            return false;
        }
        if (this.component3 != airtimeUsageState.component3) {
            int i8 = ArtificialStackFrames + 41;
            hashCode = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (Double.compare(this.equals, airtimeUsageState.equals) != 0) {
            int i10 = ArtificialStackFrames + 41;
            hashCode = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.copy, airtimeUsageState.copy)) {
            return Intrinsics.areEqual(this.component2, airtimeUsageState.component2);
        }
        int i12 = ArtificialStackFrames + 63;
        hashCode = i12 % 128;
        int i13 = i12 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = hashCode + 73;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((this.ShareDataUIState.hashCode() * 31) + this.component4.hashCode()) * 31) + Boolean.hashCode(this.component1)) * 31) + Boolean.hashCode(this.copydefault)) * 31) + Boolean.hashCode(this.component3)) * 31) + Double.hashCode(this.equals)) * 31) + this.copy.hashCode()) * 31) + this.component2.hashCode();
        int i4 = hashCode + 65;
        ArtificialStackFrames = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AirtimeUsageState(percentageList=" + this.ShareDataUIState + ", usageList=" + this.component4 + ", isLoading=" + this.component1 + ", isError=" + this.copydefault + ", isEmpty=" + this.component3 + ", total=" + this.equals + ", selectedLabel=" + this.copy + ", selectedInterval=" + this.component2 + ")";
        int i2 = hashCode + 1;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
