package com.safaricom.designsystem.components.datepicker;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0003H×\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/safaricom/designsystem/components/datepicker/DatePickerState;", "", "startDate", "", "endDate", "isSelectingEndDate", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getStartDate", "()Ljava/lang/String;", "getEndDate", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DatePickerState {
    public static final int $stable = 0;
    private final String component1;
    private final String component2;
    private final boolean component3;

    public DatePickerState(String str, String str2, boolean z) {
        this.component1 = str;
        this.component2 = str2;
        this.component3 = z;
    }

    public DatePickerState(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z);
    }

    public final String getStartDate() {
        return this.component1;
    }

    public final String getEndDate() {
        return this.component2;
    }

    public final boolean isSelectingEndDate() {
        return this.component3;
    }

    public DatePickerState() {
        this(null, null, false, 7, null);
    }

    public static DatePickerState copy$default(DatePickerState datePickerState, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = datePickerState.component1;
        }
        if ((i & 2) != 0) {
            str2 = datePickerState.component2;
        }
        if ((i & 4) != 0) {
            z = datePickerState.component3;
        }
        return datePickerState.copy(str, str2, z);
    }

    public final String getComponent1() {
        return this.component1;
    }

    public final String getComponent2() {
        return this.component2;
    }

    public final boolean getComponent3() {
        return this.component3;
    }

    public final DatePickerState copy(String startDate, String endDate, boolean isSelectingEndDate) {
        return new DatePickerState(startDate, endDate, isSelectingEndDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DatePickerState)) {
            return false;
        }
        DatePickerState datePickerState = (DatePickerState) other;
        return Intrinsics.areEqual(this.component1, datePickerState.component1) && Intrinsics.areEqual(this.component2, datePickerState.component2) && this.component3 == datePickerState.component3;
    }

    public int hashCode() {
        String str = this.component1;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.component2;
        return (((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.component3);
    }

    public String toString() {
        return "DatePickerState(startDate=" + this.component1 + ", endDate=" + this.component2 + ", isSelectingEndDate=" + this.component3 + ")";
    }
}
