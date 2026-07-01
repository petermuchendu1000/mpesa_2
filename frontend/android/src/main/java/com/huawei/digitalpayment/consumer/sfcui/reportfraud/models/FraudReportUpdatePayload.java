package com.huawei.digitalpayment.consumer.sfcui.reportfraud.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÇ\u0001J\b\u0010\u0016\u001a\u00020\u0017H\u0007J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH×\u0003J\t\u0010\u001c\u001a\u00020\u0017H×\u0001J\t\u0010\u001d\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006#"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/reportfraud/models/FraudReportUpdatePayload;", "Landroid/os/Parcelable;", "amountLost", "", "obNumber", "reportedNumber", "reportingNumber", "ticketNo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmountLost", "()Ljava/lang/String;", "getObNumber", "getReportedNumber", "getReportingNumber", "getTicketNo", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FraudReportUpdatePayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<FraudReportUpdatePayload> CREATOR = new Creator();
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("amountLost")
    private final String amountLost;

    @SerializedName("obNumber")
    private final String obNumber;

    @SerializedName("reportedNumber")
    private final String reportedNumber;

    @SerializedName("reportingNumber")
    private final String reportingNumber;

    @SerializedName("ticketNo")
    private final String ticketNo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FraudReportUpdatePayload> {
        private static int component1 = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FraudReportUpdatePayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            FraudReportUpdatePayload fraudReportUpdatePayload = new FraudReportUpdatePayload(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component3 + 55;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return fraudReportUpdatePayload;
        }

        @Override
        public FraudReportUpdatePayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 91;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            FraudReportUpdatePayload fraudReportUpdatePayloadCreateFromParcel = createFromParcel(parcel);
            int i4 = component1 + 109;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                return fraudReportUpdatePayloadCreateFromParcel;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FraudReportUpdatePayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1;
            int i4 = i3 + 85;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            FraudReportUpdatePayload[] fraudReportUpdatePayloadArr = new FraudReportUpdatePayload[i];
            int i6 = i3 + 35;
            component3 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 68 / 0;
            }
            return fraudReportUpdatePayloadArr;
        }

        @Override
        public FraudReportUpdatePayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 51;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            FraudReportUpdatePayload[] fraudReportUpdatePayloadArrNewArray = newArray(i);
            int i5 = component1 + 59;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return fraudReportUpdatePayloadArrNewArray;
        }
    }

    public FraudReportUpdatePayload(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.amountLost = str;
        this.obNumber = str2;
        this.reportedNumber = str3;
        this.reportingNumber = str4;
        this.ticketNo = str5;
    }

    public final String getAmountLost() {
        int i = 2 % 2;
        int i2 = copydefault + 105;
        int i3 = i2 % 128;
        component3 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.amountLost;
        int i4 = i3 + 49;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getObNumber() {
        int i = 2 % 2;
        int i2 = component3 + 47;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.obNumber;
        }
        throw null;
    }

    public final String getReportedNumber() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 21;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.reportedNumber;
        int i4 = i2 + 95;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getReportingNumber() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 83;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.reportingNumber;
        int i5 = i2 + 93;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 92 / 0;
        }
        return str;
    }

    public final String getTicketNo() {
        int i = 2 % 2;
        int i2 = copydefault + 101;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.ticketNo;
        int i5 = i3 + 53;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = component1 + 3;
        component2 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static FraudReportUpdatePayload copy$default(FraudReportUpdatePayload fraudReportUpdatePayload, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component3 + 79;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            str = fraudReportUpdatePayload.amountLost;
        }
        String str6 = str;
        if ((i & 2) != 0) {
            str2 = fraudReportUpdatePayload.obNumber;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = fraudReportUpdatePayload.reportedNumber;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = fraudReportUpdatePayload.reportingNumber;
            int i5 = copydefault + 23;
            component3 = i5 % 128;
            int i6 = i5 % 2;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = fraudReportUpdatePayload.ticketNo;
        }
        return fraudReportUpdatePayload.copy(str6, str7, str8, str9, str5);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 13;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.amountLost;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3 + 65;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.obNumber;
        int i5 = i3 + 21;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault + 85;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.reportedNumber;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = copydefault + 43;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.reportingNumber;
        int i5 = i3 + 25;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 119;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.ticketNo;
        int i5 = i2 + 37;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final FraudReportUpdatePayload copy(String amountLost, String obNumber, String reportedNumber, String reportingNumber, String ticketNo) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(amountLost, "");
        Intrinsics.checkNotNullParameter(obNumber, "");
        Intrinsics.checkNotNullParameter(reportedNumber, "");
        Intrinsics.checkNotNullParameter(reportingNumber, "");
        Intrinsics.checkNotNullParameter(ticketNo, "");
        FraudReportUpdatePayload fraudReportUpdatePayload = new FraudReportUpdatePayload(amountLost, obNumber, reportedNumber, reportingNumber, ticketNo);
        int i2 = copydefault + 7;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return fraudReportUpdatePayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3 + 43;
        copydefault = i2 % 128;
        return i2 % 2 == 0 ? 1 : 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copydefault + 101;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof FraudReportUpdatePayload)) {
            return false;
        }
        FraudReportUpdatePayload fraudReportUpdatePayload = (FraudReportUpdatePayload) other;
        if (!Intrinsics.areEqual(this.amountLost, fraudReportUpdatePayload.amountLost)) {
            int i4 = copydefault + 67;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.obNumber, fraudReportUpdatePayload.obNumber) || (!Intrinsics.areEqual(this.reportedNumber, fraudReportUpdatePayload.reportedNumber))) {
            return false;
        }
        if (Intrinsics.areEqual(this.reportingNumber, fraudReportUpdatePayload.reportingNumber)) {
            return Intrinsics.areEqual(this.ticketNo, fraudReportUpdatePayload.ticketNo);
        }
        int i6 = copydefault + 113;
        component3 = i6 % 128;
        return i6 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 73;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.amountLost.hashCode() * 31) + this.obNumber.hashCode()) * 31) + this.reportedNumber.hashCode()) * 31) + this.reportingNumber.hashCode()) * 31) + this.ticketNo.hashCode();
        int i4 = component3 + 9;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FraudReportUpdatePayload(amountLost=" + this.amountLost + ", obNumber=" + this.obNumber + ", reportedNumber=" + this.reportedNumber + ", reportingNumber=" + this.reportingNumber + ", ticketNo=" + this.ticketNo + ")";
        int i2 = component3 + 51;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 39;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.amountLost);
        dest.writeString(this.obNumber);
        dest.writeString(this.reportedNumber);
        dest.writeString(this.reportingNumber);
        dest.writeString(this.ticketNo);
        int i4 = copydefault + 117;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
