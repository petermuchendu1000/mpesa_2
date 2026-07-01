package com.huawei.digitalpayment.consumer.sfcui.postpay.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0011H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/postpay/models/EmeraldPostpayPayload;", "Landroid/os/Parcelable;", "msisdn", "", "amount", "planApplication", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMsisdn", "()Ljava/lang/String;", "getAmount", "getPlanApplication", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EmeraldPostpayPayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<EmeraldPostpayPayload> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;

    @SerializedName("amount")
    private final String amount;

    @SerializedName("msisdn")
    private final String msisdn;

    @SerializedName("planApplication")
    private final String planApplication;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EmeraldPostpayPayload> {
        private static int component2 = 0;
        private static int component3 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final EmeraldPostpayPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            EmeraldPostpayPayload emeraldPostpayPayload = new EmeraldPostpayPayload(parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component3 + 71;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 24 / 0;
            }
            return emeraldPostpayPayload;
        }

        @Override
        public EmeraldPostpayPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 95;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            EmeraldPostpayPayload emeraldPostpayPayloadCreateFromParcel = createFromParcel(parcel);
            int i4 = component3 + 53;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return emeraldPostpayPayloadCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final EmeraldPostpayPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 87;
            int i4 = i3 % 128;
            component3 = i4;
            int i5 = i3 % 2;
            EmeraldPostpayPayload[] emeraldPostpayPayloadArr = new EmeraldPostpayPayload[i];
            int i6 = i4 + 111;
            component2 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 96 / 0;
            }
            return emeraldPostpayPayloadArr;
        }

        @Override
        public EmeraldPostpayPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 47;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            EmeraldPostpayPayload[] emeraldPostpayPayloadArrNewArray = newArray(i);
            if (i4 != 0) {
                int i5 = 75 / 0;
            }
            int i6 = component3 + 119;
            component2 = i6 % 128;
            if (i6 % 2 == 0) {
                return emeraldPostpayPayloadArrNewArray;
            }
            throw null;
        }
    }

    public EmeraldPostpayPayload(String str, String str2, String str3) {
        this.msisdn = str;
        this.amount = str2;
        this.planApplication = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EmeraldPostpayPayload(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            int i2 = copydefault;
            int i3 = i2 + 63;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            int i4 = i2 + 107;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            str3 = null;
        }
        this(str, str2, str3);
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 95;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.msisdn;
        if (i3 != 0) {
            int i4 = 58 / 0;
        }
        return str;
    }

    public final String getAmount() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 31;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.amount;
        int i5 = i3 + 69;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getPlanApplication() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 67;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.planApplication;
        int i5 = i3 + 65;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    static {
        int i = component2 + 35;
        component3 = i % 128;
        if (i % 2 != 0) {
            int i2 = 63 / 0;
        }
    }

    public static EmeraldPostpayPayload copy$default(EmeraldPostpayPayload emeraldPostpayPayload, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState;
        int i4 = i3 + 123;
        copydefault = i4 % 128;
        if (i4 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
            int i5 = i3 + 95;
            int i6 = i5 % 128;
            copydefault = i6;
            int i7 = i5 % 2;
            String str4 = emeraldPostpayPayload.msisdn;
            int i8 = i6 + 61;
            ShareDataUIState = i8 % 128;
            int i9 = i8 % 2;
            str = str4;
        }
        if ((i & 2) != 0) {
            int i10 = ShareDataUIState + 51;
            copydefault = i10 % 128;
            if (i10 % 2 != 0) {
                String str5 = emeraldPostpayPayload.amount;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str2 = emeraldPostpayPayload.amount;
        }
        if ((i & 4) != 0) {
            str3 = emeraldPostpayPayload.planApplication;
        }
        return emeraldPostpayPayload.copy(str, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 101;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.msisdn;
        int i4 = i2 + 123;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 11 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 83;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.amount;
        int i5 = i2 + 89;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault + 49;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.planApplication;
        int i5 = i3 + 81;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final EmeraldPostpayPayload copy(String msisdn, String amount, String planApplication) {
        int i = 2 % 2;
        EmeraldPostpayPayload emeraldPostpayPayload = new EmeraldPostpayPayload(msisdn, amount, planApplication);
        int i2 = copydefault + 85;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return emeraldPostpayPayload;
        }
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault + 59;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 81;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 54 / 0;
        }
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 55;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmeraldPostpayPayload)) {
            return false;
        }
        EmeraldPostpayPayload emeraldPostpayPayload = (EmeraldPostpayPayload) other;
        if (!Intrinsics.areEqual(this.msisdn, emeraldPostpayPayload.msisdn)) {
            int i4 = ShareDataUIState + 113;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if ((!Intrinsics.areEqual(this.amount, emeraldPostpayPayload.amount)) || !Intrinsics.areEqual(this.planApplication, emeraldPostpayPayload.planApplication)) {
            return false;
        }
        int i6 = copydefault + 23;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 55 / 0;
        }
        return true;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.msisdn;
        if (str == null) {
            int i2 = copydefault + 41;
            ShareDataUIState = i2 % 128;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.amount;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.planApplication;
        int iHashCode3 = (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
        int i3 = copydefault + 19;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "EmeraldPostpayPayload(msisdn=" + this.msisdn + ", amount=" + this.amount + ", planApplication=" + this.planApplication + ")";
        int i2 = ShareDataUIState + 7;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 35;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 != 0) {
            dest.writeString(this.msisdn);
            dest.writeString(this.amount);
            dest.writeString(this.planApplication);
            throw null;
        }
        dest.writeString(this.msisdn);
        dest.writeString(this.amount);
        dest.writeString(this.planApplication);
        int i4 = copydefault + 17;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
