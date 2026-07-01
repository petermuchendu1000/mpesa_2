package com.huawei.digitalpayment.consumer.manageandviewdata.dataManager.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÇ\u0001J\b\u0010\u0016\u001a\u00020\u0017H\u0007J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH×\u0003J\t\u0010\u001c\u001a\u00020\u0017H×\u0001J\t\u0010\u001d\u001a\u00020\u001eH×\u0001J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0017H\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006$"}, d2 = {"Lcom/huawei/digitalpayment/consumer/manageandviewdata/dataManager/models/TimeInterval;", "Landroid/os/Parcelable;", "startDate", "Ljava/util/Date;", "endDate", "start", "", "end", "<init>", "(Ljava/util/Date;Ljava/util/Date;JJ)V", "(JJ)V", "getStartDate", "()Ljava/util/Date;", "getEndDate", "getStart", "()J", "getEnd", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcManageAndViewData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TimeInterval implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<TimeInterval> CREATOR = new Creator();
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 1;
    private static int copydefault;
    private final long end;
    private final Date endDate;
    private final long start;
    private final Date startDate;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TimeInterval> {
        private static int ShareDataUIState = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final TimeInterval createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            TimeInterval timeInterval = new TimeInterval((Date) parcel.readSerializable(), (Date) parcel.readSerializable(), parcel.readLong(), parcel.readLong());
            int i2 = ShareDataUIState + 73;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                return timeInterval;
            }
            throw null;
        }

        @Override
        public TimeInterval createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 23;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            TimeInterval timeIntervalCreateFromParcel = createFromParcel(parcel);
            int i4 = ShareDataUIState + 9;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return timeIntervalCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final TimeInterval[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 73;
            copydefault = i3 % 128;
            TimeInterval[] timeIntervalArr = new TimeInterval[i];
            if (i3 % 2 != 0) {
                return timeIntervalArr;
            }
            throw null;
        }

        @Override
        public TimeInterval[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 77;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            TimeInterval[] timeIntervalArrNewArray = newArray(i);
            int i5 = copydefault + 83;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return timeIntervalArrNewArray;
        }
    }

    public TimeInterval(Date date, Date date2, long j, long j2) {
        this.startDate = date;
        this.endDate = date2;
        this.start = j;
        this.end = j2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TimeInterval(Date date, Date date2, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Date date3;
        Date date4;
        Object obj = null;
        if ((i & 1) != 0) {
            int i2 = copydefault + 85;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            date3 = null;
        } else {
            date3 = date;
        }
        if ((i & 2) != 0) {
            int i3 = component3;
            int i4 = i3 + 29;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            int i5 = i3 + 123;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            date4 = null;
        } else {
            date4 = date2;
        }
        this(date3, date4, j, j2);
    }

    public final Date getStartDate() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 117;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        Date date = this.startDate;
        int i4 = i2 + 99;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return date;
    }

    public final Date getEndDate() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 27;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        Date date = this.endDate;
        int i5 = i2 + 21;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return date;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long getStart() {
        int i = 2 % 2;
        int i2 = copydefault + 53;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = this.start;
        int i4 = i3 + 71;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 80 / 0;
        }
        return j;
    }

    public final long getEnd() {
        int i = 2 % 2;
        int i2 = component3 + 117;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        long j = this.end;
        int i5 = i3 + 59;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public TimeInterval(long j, long j2) {
        this(null, null, j, j2);
    }

    static {
        int i = component2 + 95;
        component1 = i % 128;
        if (i % 2 != 0) {
            int i2 = 40 / 0;
        }
    }

    public static TimeInterval copy$default(TimeInterval timeInterval, Date date, Date date2, long j, long j2, int i, Object obj) {
        Date date3;
        long j3;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            date3 = timeInterval.startDate;
            int i3 = component3 + 105;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
        } else {
            date3 = date;
        }
        Date date4 = (i & 2) != 0 ? timeInterval.endDate : date2;
        if ((i & 4) != 0) {
            int i5 = component3;
            int i6 = i5 + 11;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            j3 = timeInterval.start;
            int i8 = i5 + 27;
            copydefault = i8 % 128;
            int i9 = i8 % 2;
        } else {
            j3 = j;
        }
        return timeInterval.copy(date3, date4, j3, (i & 8) != 0 ? timeInterval.end : j2);
    }

    public final Date component1() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 11;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        Date date = this.startDate;
        int i5 = i2 + 117;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return date;
    }

    public final Date component2() {
        int i = 2 % 2;
        int i2 = copydefault + 109;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        Date date = this.endDate;
        int i5 = i3 + 99;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return date;
    }

    public final long component3() {
        int i = 2 % 2;
        int i2 = copydefault + 21;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        long j = this.start;
        int i5 = i3 + 55;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long component4() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 65;
        component3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        long j = this.end;
        int i4 = i2 + 93;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public final TimeInterval copy(Date startDate, Date endDate, long start, long end) {
        int i = 2 % 2;
        TimeInterval timeInterval = new TimeInterval(startDate, endDate, start, end);
        int i2 = component3 + 57;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return timeInterval;
        }
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 117;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 125;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 5;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            int i4 = i2 + 103;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (!(other instanceof TimeInterval)) {
            return false;
        }
        TimeInterval timeInterval = (TimeInterval) other;
        if (Intrinsics.areEqual(this.startDate, timeInterval.startDate)) {
            return !(Intrinsics.areEqual(this.endDate, timeInterval.endDate) ^ true) && this.start == timeInterval.start && this.end == timeInterval.end;
        }
        int i6 = component3 + 125;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        Date date;
        int i = 2 % 2;
        int i2 = copydefault + 1;
        component3 = i2 % 128;
        int iHashCode = 0;
        int iHashCode2 = (i2 % 2 != 0 ? (date = this.startDate) != null : (date = this.startDate) != null) ? date.hashCode() : 0;
        Date date2 = this.endDate;
        if (date2 != null) {
            iHashCode = date2.hashCode();
            int i3 = component3 + 63;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
        }
        return (((((iHashCode2 * 31) + iHashCode) * 31) + Long.hashCode(this.start)) * 31) + Long.hashCode(this.end);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TimeInterval(startDate=" + this.startDate + ", endDate=" + this.endDate + ", start=" + this.start + ", end=" + this.end + ")";
        int i2 = copydefault + 29;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component3 + 89;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeSerializable(this.startDate);
        dest.writeSerializable(this.endDate);
        dest.writeLong(this.start);
        dest.writeLong(this.end);
        int i4 = component3 + 45;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }
}
