package com.huawei.digitalpayment.consumer.sfcui.bonga;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0011H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/BongaHistoryPayload;", "Landroid/os/Parcelable;", "msisdn", "", "startDate", "endDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMsisdn", "()Ljava/lang/String;", "getStartDate", "getEndDate", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BongaHistoryPayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<BongaHistoryPayload> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("endDate")
    private final String endDate;

    @SerializedName("msisdn")
    private final String msisdn;

    @SerializedName("startDate")
    private final String startDate;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BongaHistoryPayload> {
        private static int ShareDataUIState = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BongaHistoryPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            BongaHistoryPayload bongaHistoryPayload = new BongaHistoryPayload(parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component3 + 89;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                return bongaHistoryPayload;
            }
            throw null;
        }

        @Override
        public BongaHistoryPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 27;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BongaHistoryPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 89;
            component3 = i3 % 128;
            BongaHistoryPayload[] bongaHistoryPayloadArr = new BongaHistoryPayload[i];
            if (i3 % 2 != 0) {
                int i4 = 71 / 0;
            }
            return bongaHistoryPayloadArr;
        }

        @Override
        public BongaHistoryPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 23;
            ShareDataUIState = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                newArray(i);
                obj.hashCode();
                throw null;
            }
            BongaHistoryPayload[] bongaHistoryPayloadArrNewArray = newArray(i);
            int i4 = component3 + 113;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                return bongaHistoryPayloadArrNewArray;
            }
            obj.hashCode();
            throw null;
        }
    }

    public BongaHistoryPayload(String str, String str2, String str3) {
        this.msisdn = str;
        this.startDate = str2;
        this.endDate = str3;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 93;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.msisdn;
        int i5 = i3 + 83;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getStartDate() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 73;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.startDate;
        int i5 = i2 + 51;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getEndDate() {
        int i = 2 % 2;
        int i2 = copydefault + 85;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.endDate;
        }
        throw null;
    }

    static {
        int i = component1 + 81;
        component3 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static BongaHistoryPayload copy$default(BongaHistoryPayload bongaHistoryPayload, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = copydefault + 43;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            str = bongaHistoryPayload.msisdn;
        }
        if ((i & 2) != 0) {
            int i5 = ShareDataUIState + 53;
            int i6 = i5 % 128;
            copydefault = i6;
            int i7 = i5 % 2;
            str2 = bongaHistoryPayload.startDate;
            int i8 = i6 + 17;
            ShareDataUIState = i8 % 128;
            int i9 = i8 % 2;
        }
        if ((i & 4) != 0) {
            str3 = bongaHistoryPayload.endDate;
            int i10 = ShareDataUIState + 97;
            copydefault = i10 % 128;
            int i11 = i10 % 2;
        }
        return bongaHistoryPayload.copy(str, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 35;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.msisdn;
        int i4 = i2 + 21;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 91;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.startDate;
        int i4 = i2 + 7;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 27;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.endDate;
        int i5 = i2 + 53;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 30 / 0;
        }
        return str;
    }

    public final BongaHistoryPayload copy(String msisdn, String startDate, String endDate) {
        int i = 2 % 2;
        BongaHistoryPayload bongaHistoryPayload = new BongaHistoryPayload(msisdn, startDate, endDate);
        int i2 = copydefault + 71;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return bongaHistoryPayload;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 89;
        copydefault = i3 % 128;
        int i4 = i3 % 2 == 0 ? 1 : 0;
        int i5 = i2 + 115;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault + 31;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof BongaHistoryPayload)) {
            return false;
        }
        BongaHistoryPayload bongaHistoryPayload = (BongaHistoryPayload) other;
        if (!Intrinsics.areEqual(this.msisdn, bongaHistoryPayload.msisdn)) {
            int i3 = copydefault + 29;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.startDate, bongaHistoryPayload.startDate)) {
            return false;
        }
        if (Intrinsics.areEqual(this.endDate, bongaHistoryPayload.endDate)) {
            int i5 = ShareDataUIState + 7;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        int i7 = ShareDataUIState + 85;
        copydefault = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.msisdn;
        int iHashCode2 = 0;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.startDate;
        if (str2 == null) {
            int i2 = copydefault + 51;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        String str3 = this.endDate;
        if (str3 == null) {
            int i4 = copydefault + 25;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
        } else {
            iHashCode2 = str3.hashCode();
            int i6 = copydefault + 81;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 3 / 3;
            }
        }
        return (((iHashCode3 * 31) + iHashCode) * 31) + iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BongaHistoryPayload(msisdn=" + this.msisdn + ", startDate=" + this.startDate + ", endDate=" + this.endDate + ")";
        int i2 = ShareDataUIState + 17;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 17;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.msisdn);
        dest.writeString(this.startDate);
        dest.writeString(this.endDate);
        if (i3 == 0) {
            throw null;
        }
    }
}
