package com.huawei.digitalpayment.consumer.manageandviewdata.dataManager.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0015\u001a\u00020\u0016H×\u0001J\t\u0010\u0017\u001a\u00020\u0018H×\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/consumer/manageandviewdata/dataManager/models/Usage;", "", "downloads", "", "uploads", "<init>", "(JJ)V", "getDownloads", "()J", "setDownloads", "(J)V", "getUploads", "setUploads", "totalUsage", "getTotalUsage", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ConsumerSfcManageAndViewData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Usage {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int getAsAtTimestamp = 1;
    private long component3;
    private long copydefault;

    public Usage(long j, long j2) {
        this.copydefault = j;
        this.component3 = j2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Usage(long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = getAsAtTimestamp + 117;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            j = 0;
        }
        if ((i & 2) != 0) {
            int i5 = component1 + 3;
            getAsAtTimestamp = i5 % 128;
            int i6 = i5 % 2;
            j2 = 0;
        }
        this(j, j2);
    }

    public final long getDownloads() {
        int i = 2 % 2;
        int i2 = component1 + 75;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return this.copydefault;
        }
        int i3 = 30 / 0;
        return this.copydefault;
    }

    public final void setDownloads(long j) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 51;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        this.copydefault = j;
        if (i3 != 0) {
            int i4 = 96 / 0;
        }
    }

    public final long getUploads() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 17;
        getAsAtTimestamp = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        long j = this.component3;
        int i4 = i2 + 41;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 != 0) {
            return j;
        }
        obj.hashCode();
        throw null;
    }

    public final void setUploads(long j) {
        int i = 2 % 2;
        int i2 = component1 + 45;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        this.component3 = j;
        if (i3 == 0) {
            int i4 = 25 / 0;
        }
    }

    public final long getTotalUsage() {
        int i = 2 % 2;
        int i2 = component1 + 57;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        long j = this.copydefault;
        long j2 = this.component3;
        long j3 = i4 == 0 ? j ^ j2 : j + j2;
        int i5 = i3 + 125;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return j3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = 1 + 57;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    public Usage() {
        this(0L, 0L, 3, null);
    }

    public static Usage copy$default(Usage usage, long j, long j2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            j = usage.copydefault;
        }
        if ((i & 2) != 0) {
            int i3 = component1;
            int i4 = i3 + 69;
            getAsAtTimestamp = i4 % 128;
            if (i4 % 2 == 0) {
                long j3 = usage.component3;
                throw null;
            }
            long j4 = usage.component3;
            int i5 = i3 + 115;
            getAsAtTimestamp = i5 % 128;
            int i6 = i5 % 2;
            j2 = j4;
        }
        return usage.copy(j, j2);
    }

    public final long component1() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 103;
        getAsAtTimestamp = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = this.copydefault;
        int i4 = i2 + 45;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final long component2() {
        int i = 2 % 2;
        int i2 = component1 + 87;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Usage copy(long downloads, long uploads) {
        int i = 2 % 2;
        Usage usage = new Usage(downloads, uploads);
        int i2 = component1 + 9;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 30 / 0;
        }
        return usage;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 85;
        int i4 = i3 % 128;
        component1 = i4;
        int i5 = i3 % 2;
        if (this == other) {
            int i6 = i4 + 83;
            getAsAtTimestamp = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (!(other instanceof Usage)) {
            return false;
        }
        Usage usage = (Usage) other;
        if (this.copydefault != usage.copydefault) {
            int i8 = i2 + 37;
            component1 = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (this.component3 == usage.component3) {
            return true;
        }
        int i10 = i4 + 69;
        getAsAtTimestamp = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 49;
        component1 = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (Long.hashCode(this.copydefault) + 52) >> Long.hashCode(this.component3) : (Long.hashCode(this.copydefault) * 31) + Long.hashCode(this.component3);
        int i3 = component1 + 71;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Usage(downloads=" + this.copydefault + ", uploads=" + this.component3 + ")";
        int i2 = getAsAtTimestamp + 45;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
