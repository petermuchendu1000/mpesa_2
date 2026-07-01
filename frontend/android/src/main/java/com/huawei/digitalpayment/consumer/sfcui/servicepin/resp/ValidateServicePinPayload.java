package com.huawei.digitalpayment.consumer.sfcui.servicepin.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\r\u001a\u00020\u000eH\u0007J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u000eH×\u0001J\t\u0010\u0014\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/servicepin/resp/ValidateServicePinPayload;", "Landroid/os/Parcelable;", "msisdn", "", "pin", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getMsisdn", "()Ljava/lang/String;", "getPin", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ValidateServicePinPayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ValidateServicePinPayload> CREATOR = new Creator();
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("msisdn")
    private final String msisdn;

    @SerializedName("pin")
    private final String pin;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ValidateServicePinPayload> {
        private static int ShareDataUIState = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ValidateServicePinPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            ValidateServicePinPayload validateServicePinPayload = new ValidateServicePinPayload(parcel.readString(), parcel.readString());
            int i2 = component3 + 85;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return validateServicePinPayload;
        }

        @Override
        public ValidateServicePinPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 27;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            ValidateServicePinPayload validateServicePinPayloadCreateFromParcel = createFromParcel(parcel);
            int i4 = ShareDataUIState + 83;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                return validateServicePinPayloadCreateFromParcel;
            }
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ValidateServicePinPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3;
            int i4 = i3 + 119;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            ValidateServicePinPayload[] validateServicePinPayloadArr = new ValidateServicePinPayload[i];
            int i6 = i3 + 1;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            return validateServicePinPayloadArr;
        }

        @Override
        public ValidateServicePinPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 7;
            component3 = i3 % 128;
            if (i3 % 2 != 0) {
                newArray(i);
                throw null;
            }
            ValidateServicePinPayload[] validateServicePinPayloadArrNewArray = newArray(i);
            int i4 = component3 + 61;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return validateServicePinPayloadArrNewArray;
        }
    }

    public ValidateServicePinPayload(String str, String str2) {
        this.msisdn = str;
        this.pin = str2;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = component3 + 57;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.msisdn;
        int i5 = i3 + 115;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getPin() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 47;
        copydefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.pin;
        int i4 = i2 + 21;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    static {
        int i = component1 + 19;
        component2 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ValidateServicePinPayload copy$default(ValidateServicePinPayload validateServicePinPayload, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = validateServicePinPayload.msisdn;
        }
        if ((i & 2) != 0) {
            int i3 = copydefault + 51;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            str2 = validateServicePinPayload.pin;
        }
        ValidateServicePinPayload validateServicePinPayloadCopy = validateServicePinPayload.copy(str, str2);
        int i5 = component3 + 33;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return validateServicePinPayloadCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 91;
        component3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.msisdn;
        int i4 = i2 + 21;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3 + 109;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.pin;
        }
        throw null;
    }

    public final ValidateServicePinPayload copy(String msisdn, String pin) {
        int i = 2 % 2;
        ValidateServicePinPayload validateServicePinPayload = new ValidateServicePinPayload(msisdn, pin);
        int i2 = copydefault + 55;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return validateServicePinPayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 71;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 47;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copydefault + 1;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (other instanceof ValidateServicePinPayload) {
            ValidateServicePinPayload validateServicePinPayload = (ValidateServicePinPayload) other;
            return Intrinsics.areEqual(this.msisdn, validateServicePinPayload.msisdn) && Intrinsics.areEqual(this.pin, validateServicePinPayload.pin);
        }
        int i4 = copydefault + 103;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        String str;
        int iHashCode;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 39;
        component3 = i3 % 128;
        int iHashCode2 = 0;
        if (i3 % 2 != 0) {
            str = this.msisdn;
            iHashCode = 1;
            if (str != null) {
                iHashCode2 = 1;
                iHashCode = iHashCode2;
                iHashCode2 = str.hashCode();
            }
            int i4 = i2 + 41;
            component3 = i4 % 128;
            int i5 = i4 % 2;
        } else {
            str = this.msisdn;
            if (str == null) {
                iHashCode = 0;
                int i42 = i2 + 41;
                component3 = i42 % 128;
                int i52 = i42 % 2;
            }
            iHashCode = iHashCode2;
            iHashCode2 = str.hashCode();
        }
        String str2 = this.pin;
        if (str2 != null) {
            iHashCode = str2.hashCode();
            int i6 = copydefault + 113;
            component3 = i6 % 128;
            int i7 = i6 % 2;
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ValidateServicePinPayload(msisdn=" + this.msisdn + ", pin=" + this.pin + ")";
        int i2 = component3 + 117;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 23;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.msisdn);
        dest.writeString(this.pin);
        int i4 = copydefault + 25;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 82 / 0;
        }
    }
}
