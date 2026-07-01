package com.huawei.digitalpayment.consumer.sfcui.profile.manageline.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0011H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/manageline/resp/RegisteredMsisdn;", "Landroid/os/Parcelable;", "kycStatus", "", "masked", "msisdn", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getKycStatus", "()Ljava/lang/String;", "getMasked", "getMsisdn", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RegisteredMsisdn implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<RegisteredMsisdn> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    @SerializedName("kycStatus")
    private final String kycStatus;

    @SerializedName("masked")
    private final String masked;

    @SerializedName("msisdn")
    private final String msisdn;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RegisteredMsisdn> {
        private static int component1 = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final RegisteredMsisdn createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            RegisteredMsisdn registeredMsisdn = new RegisteredMsisdn(parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = copydefault + 37;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 14 / 0;
            }
            return registeredMsisdn;
        }

        @Override
        public RegisteredMsisdn createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 21;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            RegisteredMsisdn registeredMsisdnCreateFromParcel = createFromParcel(parcel);
            int i4 = component1 + 67;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 33 / 0;
            }
            return registeredMsisdnCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final RegisteredMsisdn[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 105;
            component1 = i3 % 128;
            RegisteredMsisdn[] registeredMsisdnArr = new RegisteredMsisdn[i];
            if (i3 % 2 == 0) {
                return registeredMsisdnArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public RegisteredMsisdn[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 85;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            RegisteredMsisdn[] registeredMsisdnArrNewArray = newArray(i);
            int i5 = component1 + 57;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return registeredMsisdnArrNewArray;
        }
    }

    public RegisteredMsisdn(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.kycStatus = str;
        this.masked = str2;
        this.msisdn = str3;
    }

    public final String getKycStatus() {
        int i = 2 % 2;
        int i2 = component2 + 115;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.kycStatus;
        int i5 = i3 + 29;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getMasked() {
        int i = 2 % 2;
        int i2 = component2 + 101;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.masked;
        if (i3 == 0) {
            int i4 = 44 / 0;
        }
        return str;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = copydefault + 103;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.msisdn;
        int i5 = i3 + 37;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = component3 + 105;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    public static RegisteredMsisdn copy$default(RegisteredMsisdn registeredMsisdn, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = registeredMsisdn.kycStatus;
            int i3 = copydefault + 23;
            component2 = i3 % 128;
            int i4 = i3 % 2;
        }
        if ((i & 2) != 0) {
            str2 = registeredMsisdn.masked;
        }
        if ((i & 4) != 0) {
            int i5 = component2 + 23;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                String str4 = registeredMsisdn.msisdn;
                throw null;
            }
            str3 = registeredMsisdn.msisdn;
        }
        RegisteredMsisdn registeredMsisdnCopy = registeredMsisdn.copy(str, str2, str3);
        int i6 = copydefault + 119;
        component2 = i6 % 128;
        int i7 = i6 % 2;
        return registeredMsisdnCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 73;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.kycStatus;
        int i5 = i3 + 103;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault + 25;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.masked;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 89;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.msisdn;
        int i5 = i2 + 89;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final RegisteredMsisdn copy(String kycStatus, String masked, String msisdn) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(kycStatus, "");
        Intrinsics.checkNotNullParameter(masked, "");
        Intrinsics.checkNotNullParameter(msisdn, "");
        RegisteredMsisdn registeredMsisdn = new RegisteredMsisdn(kycStatus, masked, msisdn);
        int i2 = copydefault + 79;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 31 / 0;
        }
        return registeredMsisdn;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 5;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 33;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component2 + 61;
            copydefault = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(other instanceof RegisteredMsisdn)) {
            return false;
        }
        RegisteredMsisdn registeredMsisdn = (RegisteredMsisdn) other;
        if (!Intrinsics.areEqual(this.kycStatus, registeredMsisdn.kycStatus)) {
            return false;
        }
        if (Intrinsics.areEqual(this.masked, registeredMsisdn.masked)) {
            return Intrinsics.areEqual(this.msisdn, registeredMsisdn.msisdn);
        }
        int i3 = copydefault + 35;
        component2 = i3 % 128;
        return i3 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 107;
        component2 = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (((this.kycStatus.hashCode() - 96) % this.masked.hashCode()) << 14) >> this.msisdn.hashCode() : (((this.kycStatus.hashCode() * 31) + this.masked.hashCode()) * 31) + this.msisdn.hashCode();
        int i3 = copydefault + 5;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RegisteredMsisdn(kycStatus=" + this.kycStatus + ", masked=" + this.masked + ", msisdn=" + this.msisdn + ")";
        int i2 = copydefault + 89;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 109;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.kycStatus);
        dest.writeString(this.masked);
        dest.writeString(this.msisdn);
        int i4 = component2 + 93;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
