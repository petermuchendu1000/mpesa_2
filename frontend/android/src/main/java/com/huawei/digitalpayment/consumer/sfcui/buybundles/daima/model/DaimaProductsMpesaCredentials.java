package com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÇ\u0001J\b\u0010\u0019\u001a\u00020\u001aH\u0007J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH×\u0003J\t\u0010\u001f\u001a\u00020\u001aH×\u0001J\t\u0010 \u001a\u00020\u0003H×\u0001J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006&"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/model/DaimaProductsMpesaCredentials;", "Landroid/os/Parcelable;", "key", "", "pin", "securityCredential", "fulizaAmount", "useOD", "channelSessionID", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getPin", "getSecurityCredential", "getFulizaAmount", "getUseOD", "getChannelSessionID", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DaimaProductsMpesaCredentials implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<DaimaProductsMpesaCredentials> CREATOR = new Creator();
    private static int component1 = 1;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;

    @SerializedName("channelSessionID")
    private final String channelSessionID;

    @SerializedName("fulizaAmount")
    private final String fulizaAmount;

    @SerializedName("Key")
    private final String key;

    @SerializedName("Pin")
    private final String pin;

    @SerializedName("securityCredential")
    private final String securityCredential;

    @SerializedName("useOD")
    private final String useOD;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DaimaProductsMpesaCredentials> {
        private static int ShareDataUIState = 0;
        private static int component3 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final DaimaProductsMpesaCredentials createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            DaimaProductsMpesaCredentials daimaProductsMpesaCredentials = new DaimaProductsMpesaCredentials(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component3 + 75;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                return daimaProductsMpesaCredentials;
            }
            throw null;
        }

        @Override
        public DaimaProductsMpesaCredentials createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 25;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final DaimaProductsMpesaCredentials[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState;
            int i4 = i3 + 85;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            DaimaProductsMpesaCredentials[] daimaProductsMpesaCredentialsArr = new DaimaProductsMpesaCredentials[i];
            int i6 = i3 + 115;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            return daimaProductsMpesaCredentialsArr;
        }

        @Override
        public DaimaProductsMpesaCredentials[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 111;
            component3 = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                newArray(i);
                obj.hashCode();
                throw null;
            }
            DaimaProductsMpesaCredentials[] daimaProductsMpesaCredentialsArrNewArray = newArray(i);
            int i4 = component3 + 113;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                return daimaProductsMpesaCredentialsArrNewArray;
            }
            obj.hashCode();
            throw null;
        }
    }

    public DaimaProductsMpesaCredentials(String str, String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.key = str;
        this.pin = str2;
        this.securityCredential = str3;
        this.fulizaAmount = str4;
        this.useOD = str5;
        this.channelSessionID = str6;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DaimaProductsMpesaCredentials(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str7;
        String str8;
        String str9;
        String str10;
        if ((i & 1) != 0) {
            int i2 = copydefault + 111;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str7 = "";
        } else {
            str7 = str;
        }
        Object obj = null;
        if ((i & 2) != 0) {
            int i5 = component1 + 107;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            str8 = "";
        } else {
            str8 = str2;
        }
        if ((i & 8) != 0) {
            int i6 = 2 % 2;
            str9 = "0";
        } else {
            str9 = str4;
        }
        if ((i & 16) != 0) {
            int i7 = component1 + 17;
            copydefault = i7 % 128;
            if (i7 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            str10 = "0";
        } else {
            str10 = str5;
        }
        this(str7, str8, str3, str9, str10, (i & 32) != 0 ? "" : str6);
    }

    public final String getKey() {
        int i = 2 % 2;
        int i2 = copydefault + 25;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.key;
        if (i3 == 0) {
            int i4 = 66 / 0;
        }
        return str;
    }

    public final String getPin() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 9;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.pin;
        int i5 = i2 + 21;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getSecurityCredential() {
        int i = 2 % 2;
        int i2 = copydefault + 5;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.securityCredential;
        int i5 = i3 + 17;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getFulizaAmount() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 53;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.fulizaAmount;
        int i5 = i2 + 13;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getUseOD() {
        int i = 2 % 2;
        int i2 = component1 + 61;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.useOD;
        int i5 = i3 + 109;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getChannelSessionID() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 9;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.channelSessionID;
        int i5 = i2 + 21;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    static {
        int i = component3 + 29;
        component2 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static DaimaProductsMpesaCredentials copy$default(DaimaProductsMpesaCredentials daimaProductsMpesaCredentials, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component1 + 27;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                String str7 = daimaProductsMpesaCredentials.key;
                throw null;
            }
            str = daimaProductsMpesaCredentials.key;
        }
        String str8 = str;
        if ((i & 2) != 0) {
            str2 = daimaProductsMpesaCredentials.pin;
        }
        String str9 = str2;
        if ((i & 4) != 0) {
            str3 = daimaProductsMpesaCredentials.securityCredential;
        }
        String str10 = str3;
        if ((i & 8) != 0) {
            int i4 = component1 + 15;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            str4 = daimaProductsMpesaCredentials.fulizaAmount;
        }
        String str11 = str4;
        if ((i & 16) != 0) {
            str5 = daimaProductsMpesaCredentials.useOD;
            int i6 = copydefault + 25;
            component1 = i6 % 128;
            int i7 = i6 % 2;
        }
        String str12 = str5;
        if ((i & 32) != 0) {
            str6 = daimaProductsMpesaCredentials.channelSessionID;
        }
        return daimaProductsMpesaCredentials.copy(str8, str9, str10, str11, str12, str6);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 105;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.key;
        int i5 = i2 + 69;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 54 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 23;
        component1 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.pin;
        int i4 = i2 + 41;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component1 + 87;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.securityCredential;
        int i5 = i3 + 105;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component1 + 123;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.fulizaAmount;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = copydefault + 11;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.useOD;
        int i4 = i3 + 101;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = copydefault + 81;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.channelSessionID;
        int i4 = i3 + 107;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final DaimaProductsMpesaCredentials copy(String key, String pin, String securityCredential, String fulizaAmount, String useOD, String channelSessionID) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(key, "");
        Intrinsics.checkNotNullParameter(pin, "");
        Intrinsics.checkNotNullParameter(securityCredential, "");
        Intrinsics.checkNotNullParameter(fulizaAmount, "");
        Intrinsics.checkNotNullParameter(useOD, "");
        Intrinsics.checkNotNullParameter(channelSessionID, "");
        DaimaProductsMpesaCredentials daimaProductsMpesaCredentials = new DaimaProductsMpesaCredentials(key, pin, securityCredential, fulizaAmount, useOD, channelSessionID);
        int i2 = copydefault + 27;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return daimaProductsMpesaCredentials;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault + 121;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2 == 0 ? 1 : 0;
        int i5 = i3 + 21;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 71 / 0;
        }
        return i4;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copydefault + 109;
            component1 = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(other instanceof DaimaProductsMpesaCredentials)) {
            int i3 = component1 + 37;
            copydefault = i3 % 128;
            return i3 % 2 != 0;
        }
        DaimaProductsMpesaCredentials daimaProductsMpesaCredentials = (DaimaProductsMpesaCredentials) other;
        if (!Intrinsics.areEqual(this.key, daimaProductsMpesaCredentials.key) || !Intrinsics.areEqual(this.pin, daimaProductsMpesaCredentials.pin)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.securityCredential, daimaProductsMpesaCredentials.securityCredential)) {
            int i4 = copydefault + 53;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (Intrinsics.areEqual(this.fulizaAmount, daimaProductsMpesaCredentials.fulizaAmount)) {
            return Intrinsics.areEqual(this.useOD, daimaProductsMpesaCredentials.useOD) && Intrinsics.areEqual(this.channelSessionID, daimaProductsMpesaCredentials.channelSessionID);
        }
        int i5 = copydefault + 87;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 21;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((this.key.hashCode() * 31) + this.pin.hashCode()) * 31) + this.securityCredential.hashCode()) * 31) + this.fulizaAmount.hashCode()) * 31) + this.useOD.hashCode()) * 31) + this.channelSessionID.hashCode();
        int i4 = component1 + 49;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DaimaProductsMpesaCredentials(key=" + this.key + ", pin=" + this.pin + ", securityCredential=" + this.securityCredential + ", fulizaAmount=" + this.fulizaAmount + ", useOD=" + this.useOD + ", channelSessionID=" + this.channelSessionID + ")";
        int i2 = component1 + 63;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component1 + 121;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.key);
        dest.writeString(this.pin);
        dest.writeString(this.securityCredential);
        dest.writeString(this.fulizaAmount);
        dest.writeString(this.useOD);
        dest.writeString(this.channelSessionID);
        int i4 = copydefault + 93;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
