package com.safaricom.designsystem.components.datepicker;

import java.sql.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/safaricom/designsystem/components/datepicker/DatePickerScreenEvent;", "", "OnStartDate", "OnEndDate", "Lcom/safaricom/designsystem/components/datepicker/DatePickerScreenEvent$OnEndDate;", "Lcom/safaricom/designsystem/components/datepicker/DatePickerScreenEvent$OnStartDate;", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DatePickerScreenEvent {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/safaricom/designsystem/components/datepicker/DatePickerScreenEvent$OnStartDate;", "Lcom/safaricom/designsystem/components/datepicker/DatePickerScreenEvent;", "date", "Ljava/sql/Date;", "<init>", "(Ljava/sql/Date;)V", "getDate", "()Ljava/sql/Date;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnStartDate implements DatePickerScreenEvent {
        public static final int $stable = 8;
        private final Date component1;

        public OnStartDate(Date date) {
            Intrinsics.checkNotNullParameter(date, "");
            this.component1 = date;
        }

        public final Date getDate() {
            return this.component1;
        }

        public static OnStartDate copy$default(OnStartDate onStartDate, Date date, int i, Object obj) {
            if ((i & 1) != 0) {
                date = onStartDate.component1;
            }
            return onStartDate.copy(date);
        }

        public final Date getComponent1() {
            return this.component1;
        }

        public final OnStartDate copy(Date date) {
            Intrinsics.checkNotNullParameter(date, "");
            return new OnStartDate(date);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnStartDate) && Intrinsics.areEqual(this.component1, ((OnStartDate) other).component1);
        }

        public int hashCode() {
            return this.component1.hashCode();
        }

        public String toString() {
            return "OnStartDate(date=" + this.component1 + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/safaricom/designsystem/components/datepicker/DatePickerScreenEvent$OnEndDate;", "Lcom/safaricom/designsystem/components/datepicker/DatePickerScreenEvent;", "date", "Ljava/sql/Date;", "<init>", "(Ljava/sql/Date;)V", "getDate", "()Ljava/sql/Date;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnEndDate implements DatePickerScreenEvent {
        public static final int $stable = 8;
        private final Date component3;

        public OnEndDate(Date date) {
            Intrinsics.checkNotNullParameter(date, "");
            this.component3 = date;
        }

        public final Date getDate() {
            return this.component3;
        }

        public static OnEndDate copy$default(OnEndDate onEndDate, Date date, int i, Object obj) {
            if ((i & 1) != 0) {
                date = onEndDate.component3;
            }
            return onEndDate.copy(date);
        }

        public final Date getComponent3() {
            return this.component3;
        }

        public final OnEndDate copy(Date date) {
            Intrinsics.checkNotNullParameter(date, "");
            return new OnEndDate(date);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnEndDate) && Intrinsics.areEqual(this.component3, ((OnEndDate) other).component3);
        }

        public int hashCode() {
            return this.component3.hashCode();
        }

        public String toString() {
            return "OnEndDate(date=" + this.component3 + ")";
        }
    }
}
