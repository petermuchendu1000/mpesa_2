package com.huawei.digitalpayment.consumer.sfcui.statement.resp;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0003H×\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/DateRange;", "", "startDate", "", "endDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getStartDate", "()Ljava/lang/String;", "setStartDate", "(Ljava/lang/String;)V", "getEndDate", "setEndDate", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DateRange {
    public static final int $stable = 8;
    private static int component1 = 0;
    private static int component3 = 105 % 128;
    private static int component4 = 1;
    private static int copydefault;
    private String ShareDataUIState;
    private String component2;

    public DateRange(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.component2 = str;
        this.ShareDataUIState = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DateRange(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = copydefault + 43;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            int i4 = copydefault + 25;
            component4 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            str2 = "";
        }
        this(str, str2);
    }

    public final String getStartDate() {
        int i = 2 % 2;
        int i2 = copydefault + 109;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        String str = this.component2;
        int i5 = i3 + 123;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setStartDate(String str) {
        int i = 2 % 2;
        int i2 = component4 + 103;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.component2 = str;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.component2 = str;
            int i3 = 19 / 0;
        }
    }

    public final String getEndDate() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 9;
        component4 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.ShareDataUIState;
        int i4 = i2 + 15;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final void setEndDate(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 103;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.ShareDataUIState = str;
        int i4 = copydefault + 115;
        component4 = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        if (105 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DateRange() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static DateRange copy$default(DateRange dateRange, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component4;
        int i4 = i3 + 71;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            str = dateRange.component2;
        }
        if ((i & 2) != 0) {
            int i6 = i3 + 81;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            str2 = dateRange.ShareDataUIState;
        }
        DateRange dateRangeCopy = dateRange.copy(str, str2);
        int i8 = component4 + 105;
        copydefault = i8 % 128;
        if (i8 % 2 == 0) {
            return dateRangeCopy;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 7;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component2;
        int i5 = i2 + 47;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault + 95;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        String str = this.ShareDataUIState;
        int i5 = i3 + 21;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final DateRange copy(String startDate, String endDate) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(startDate, "");
        Intrinsics.checkNotNullParameter(endDate, "");
        DateRange dateRange = new DateRange(startDate, endDate);
        int i2 = component4 + 121;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return dateRange;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 9;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            int i5 = i2 + 1;
            copydefault = i5 % 128;
            return i5 % 2 == 0;
        }
        if (!(other instanceof DateRange)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.component2, ((DateRange) other).component2)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.ShareDataUIState, r6.ShareDataUIState))) {
            return true;
        }
        int i6 = copydefault + 91;
        component4 = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 45;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.component2.hashCode() * 31) + this.ShareDataUIState.hashCode();
        int i4 = copydefault + 95;
        component4 = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DateRange(startDate=" + this.component2 + ", endDate=" + this.ShareDataUIState + ")";
        int i2 = component4 + 59;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
