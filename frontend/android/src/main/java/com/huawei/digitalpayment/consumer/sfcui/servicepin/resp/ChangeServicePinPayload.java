package com.huawei.digitalpayment.consumer.sfcui.servicepin.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.identity.ui.activity.CheckIdentityActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0011H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/servicepin/resp/ChangeServicePinPayload;", "Landroid/os/Parcelable;", "msisdn", "", "pin", CheckIdentityActivity.ID_NUMBER, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMsisdn", "()Ljava/lang/String;", "getPin", "getIdNumber", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChangeServicePinPayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ChangeServicePinPayload> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int copydefault = 1;

    @SerializedName(CheckIdentityActivity.ID_NUMBER)
    private final String idNumber;

    @SerializedName("msisdn")
    private final String msisdn;

    @SerializedName("pin")
    private final String pin;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ChangeServicePinPayload> {
        private static int component3 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ChangeServicePinPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            ChangeServicePinPayload changeServicePinPayload = new ChangeServicePinPayload(parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component3 + 93;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                return changeServicePinPayload;
            }
            throw null;
        }

        @Override
        public ChangeServicePinPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 17;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            ChangeServicePinPayload changeServicePinPayloadCreateFromParcel = createFromParcel(parcel);
            if (i3 != 0) {
                int i4 = 73 / 0;
            }
            int i5 = component3 + 65;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return changeServicePinPayloadCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ChangeServicePinPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3;
            int i4 = i3 + 81;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            ChangeServicePinPayload[] changeServicePinPayloadArr = new ChangeServicePinPayload[i];
            int i6 = i3 + 97;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            return changeServicePinPayloadArr;
        }

        @Override
        public ChangeServicePinPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 15;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            ChangeServicePinPayload[] changeServicePinPayloadArrNewArray = newArray(i);
            int i5 = component3 + 61;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                return changeServicePinPayloadArrNewArray;
            }
            throw null;
        }
    }

    public ChangeServicePinPayload(String str, String str2, String str3) {
        this.msisdn = str;
        this.pin = str2;
        this.idNumber = str3;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 29;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.msisdn;
        int i4 = i2 + 3;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getPin() {
        int i = 2 % 2;
        int i2 = component1 + 99;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.pin;
        int i5 = i3 + 25;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getIdNumber() {
        int i = 2 % 2;
        int i2 = component1 + 97;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.idNumber;
        int i4 = i3 + 53;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    static {
        int i = copydefault + 57;
        component2 = i % 128;
        if (i % 2 != 0) {
            int i2 = 9 / 0;
        }
    }

    public static ChangeServicePinPayload copy$default(ChangeServicePinPayload changeServicePinPayload, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = changeServicePinPayload.msisdn;
        }
        if ((i & 2) != 0) {
            str2 = changeServicePinPayload.pin;
        }
        if ((i & 4) != 0) {
            int i3 = component1 + 11;
            int i4 = i3 % 128;
            ShareDataUIState = i4;
            int i5 = i3 % 2;
            str3 = changeServicePinPayload.idNumber;
            int i6 = i4 + 59;
            component1 = i6 % 128;
            int i7 = i6 % 2;
        }
        return changeServicePinPayload.copy(str, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 31;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.msisdn;
        int i4 = i2 + 57;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 89 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 95;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.pin;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 67;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.idNumber;
        int i4 = i2 + 37;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 0 / 0;
        }
        return str;
    }

    public final ChangeServicePinPayload copy(String msisdn, String pin, String idNumber) {
        int i = 2 % 2;
        ChangeServicePinPayload changeServicePinPayload = new ChangeServicePinPayload(msisdn, pin, idNumber);
        int i2 = ShareDataUIState + 33;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return changeServicePinPayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1 + 35;
        ShareDataUIState = i2 % 128;
        return i2 % 2 == 0 ? 1 : 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component1 + 113;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChangeServicePinPayload)) {
            return false;
        }
        ChangeServicePinPayload changeServicePinPayload = (ChangeServicePinPayload) other;
        if (!Intrinsics.areEqual(this.msisdn, changeServicePinPayload.msisdn)) {
            return false;
        }
        if (Intrinsics.areEqual(this.pin, changeServicePinPayload.pin)) {
            return Intrinsics.areEqual(this.idNumber, changeServicePinPayload.idNumber);
        }
        int i3 = ShareDataUIState + 17;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        String str;
        int i = 2 % 2;
        int i2 = component1 + 73;
        ShareDataUIState = i2 % 128;
        int iHashCode = 0;
        int iHashCode2 = (i2 % 2 != 0 ? (str = this.msisdn) != null : (str = this.msisdn) != null) ? str.hashCode() : 0;
        String str2 = this.pin;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.idNumber;
        if (str3 != null) {
            iHashCode = str3.hashCode();
            int i3 = component1 + 25;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
        }
        return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ChangeServicePinPayload(msisdn=" + this.msisdn + ", pin=" + this.pin + ", idNumber=" + this.idNumber + ")";
        int i2 = component1 + 9;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component1 + 21;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.msisdn);
        dest.writeString(this.pin);
        dest.writeString(this.idNumber);
        int i4 = ShareDataUIState + 95;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 7 / 0;
        }
    }
}
