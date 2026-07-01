package com.huawei.digitalpayment.consumer.fixeddata.data.model.manageAccount;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÇ\u0001J\b\u0010\u0016\u001a\u00020\u0017H\u0007J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH×\u0003J\t\u0010\u001c\u001a\u00020\u0017H×\u0001J\t\u0010\u001d\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006#"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/manageAccount/ChangeWifiPasswordPayload;", "Landroid/os/Parcelable;", "msisdn", "", "ci", "serialNumber", "profileName", "newPassphrase", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMsisdn", "()Ljava/lang/String;", "getCi", "getSerialNumber", "getProfileName", "getNewPassphrase", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChangeWifiPasswordPayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ChangeWifiPasswordPayload> CREATOR = new Creator();
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("ci")
    private final String ci;

    @SerializedName("msisdn")
    private final String msisdn;

    @SerializedName("newPassphrase")
    private final String newPassphrase;

    @SerializedName("profileName")
    private final String profileName;

    @SerializedName("serialNumber")
    private final String serialNumber;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ChangeWifiPasswordPayload> {
        private static int ShareDataUIState = 1;
        private static int component2;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ChangeWifiPasswordPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            ChangeWifiPasswordPayload changeWifiPasswordPayload = new ChangeWifiPasswordPayload(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component2 + 107;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                return changeWifiPasswordPayload;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public ChangeWifiPasswordPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 87;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                createFromParcel(parcel);
                throw null;
            }
            ChangeWifiPasswordPayload changeWifiPasswordPayloadCreateFromParcel = createFromParcel(parcel);
            int i3 = ShareDataUIState + 107;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            return changeWifiPasswordPayloadCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ChangeWifiPasswordPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState;
            int i4 = i3 + 59;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            ChangeWifiPasswordPayload[] changeWifiPasswordPayloadArr = new ChangeWifiPasswordPayload[i];
            int i6 = i3 + 51;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            return changeWifiPasswordPayloadArr;
        }

        @Override
        public ChangeWifiPasswordPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 65;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                return newArray(i);
            }
            newArray(i);
            throw null;
        }
    }

    public ChangeWifiPasswordPayload(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.msisdn = str;
        this.ci = str2;
        this.serialNumber = str3;
        this.profileName = str4;
        this.newPassphrase = str5;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = component2 + 25;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.msisdn;
        if (i3 != 0) {
            int i4 = 92 / 0;
        }
        return str;
    }

    public final String getCi() {
        int i = 2 % 2;
        int i2 = component2 + 99;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.ci;
        int i5 = i3 + 117;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getSerialNumber() {
        int i = 2 % 2;
        int i2 = component3 + 45;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.serialNumber;
        int i5 = i3 + 103;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getProfileName() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 117;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.profileName;
        int i5 = i2 + 97;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getNewPassphrase() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 65;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.newPassphrase;
        int i5 = i2 + 121;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    static {
        int i = copydefault + 41;
        component1 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ChangeWifiPasswordPayload copy$default(ChangeWifiPasswordPayload changeWifiPasswordPayload, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = changeWifiPasswordPayload.msisdn;
        }
        String str6 = str;
        if ((i & 2) != 0) {
            int i3 = component3;
            int i4 = i3 + 91;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            str2 = changeWifiPasswordPayload.ci;
            int i6 = i3 + 35;
            component2 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 3 / 3;
            }
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = changeWifiPasswordPayload.serialNumber;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            int i8 = component2 + 87;
            component3 = i8 % 128;
            int i9 = i8 % 2;
            str4 = changeWifiPasswordPayload.profileName;
            if (i9 != 0) {
                int i10 = 28 / 0;
            }
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = changeWifiPasswordPayload.newPassphrase;
        }
        return changeWifiPasswordPayload.copy(str6, str7, str8, str9, str5);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 41;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.msisdn;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 9;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.ci;
        int i5 = i2 + 105;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 37;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.serialNumber;
        int i5 = i2 + 51;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 59 / 0;
        }
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component2 + 119;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.profileName;
        }
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component2 + 69;
        int i3 = i2 % 128;
        component3 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.newPassphrase;
        int i4 = i3 + 53;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final ChangeWifiPasswordPayload copy(String msisdn, String ci, String serialNumber, String profileName, String newPassphrase) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(msisdn, "");
        Intrinsics.checkNotNullParameter(ci, "");
        Intrinsics.checkNotNullParameter(serialNumber, "");
        Intrinsics.checkNotNullParameter(profileName, "");
        Intrinsics.checkNotNullParameter(newPassphrase, "");
        ChangeWifiPasswordPayload changeWifiPasswordPayload = new ChangeWifiPasswordPayload(msisdn, ci, serialNumber, profileName, newPassphrase);
        int i2 = component2 + 33;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return changeWifiPasswordPayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3 + 1;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 95;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component2 + 45;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        if (this == other) {
            int i5 = i3 + 55;
            component2 = i5 % 128;
            return i5 % 2 != 0;
        }
        if (!(other instanceof ChangeWifiPasswordPayload)) {
            return false;
        }
        ChangeWifiPasswordPayload changeWifiPasswordPayload = (ChangeWifiPasswordPayload) other;
        if (!Intrinsics.areEqual(this.msisdn, changeWifiPasswordPayload.msisdn)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.ci, changeWifiPasswordPayload.ci)) {
            int i6 = component3 + 87;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.serialNumber, changeWifiPasswordPayload.serialNumber)) {
            int i8 = component3 + 67;
            component2 = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.profileName, changeWifiPasswordPayload.profileName)) {
            return false;
        }
        if (Intrinsics.areEqual(this.newPassphrase, changeWifiPasswordPayload.newPassphrase)) {
            return true;
        }
        int i10 = component3 + 39;
        component2 = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 29;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.msisdn.hashCode() * 31) + this.ci.hashCode()) * 31) + this.serialNumber.hashCode()) * 31) + this.profileName.hashCode()) * 31) + this.newPassphrase.hashCode();
        int i4 = component3 + 91;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ChangeWifiPasswordPayload(msisdn=" + this.msisdn + ", ci=" + this.ci + ", serialNumber=" + this.serialNumber + ", profileName=" + this.profileName + ", newPassphrase=" + this.newPassphrase + ")";
        int i2 = component3 + 41;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 92 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component3 + 23;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.msisdn);
        dest.writeString(this.ci);
        dest.writeString(this.serialNumber);
        dest.writeString(this.profileName);
        dest.writeString(this.newPassphrase);
        int i4 = component2 + 19;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 90 / 0;
        }
    }
}
