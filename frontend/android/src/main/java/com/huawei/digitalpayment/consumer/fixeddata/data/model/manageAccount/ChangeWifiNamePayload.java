package com.huawei.digitalpayment.consumer.fixeddata.data.model.manageAccount;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÇ\u0001J\b\u0010\u0016\u001a\u00020\u0017H\u0007J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH×\u0003J\t\u0010\u001c\u001a\u00020\u0017H×\u0001J\t\u0010\u001d\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006#"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/manageAccount/ChangeWifiNamePayload;", "Landroid/os/Parcelable;", "msisdn", "", "ci", "serialNumber", "profileName", "newSSIDName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMsisdn", "()Ljava/lang/String;", "getCi", "getSerialNumber", "getProfileName", "getNewSSIDName", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChangeWifiNamePayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ChangeWifiNamePayload> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 1;

    @SerializedName("ci")
    private final String ci;

    @SerializedName("msisdn")
    private final String msisdn;

    @SerializedName("newSSIDName")
    private final String newSSIDName;

    @SerializedName("profileName")
    private final String profileName;

    @SerializedName("serialNumber")
    private final String serialNumber;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ChangeWifiNamePayload> {
        private static int component2 = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ChangeWifiNamePayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            ChangeWifiNamePayload changeWifiNamePayload = new ChangeWifiNamePayload(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component2 + 39;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return changeWifiNamePayload;
        }

        @Override
        public ChangeWifiNamePayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 33;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                createFromParcel(parcel);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ChangeWifiNamePayload changeWifiNamePayloadCreateFromParcel = createFromParcel(parcel);
            int i3 = component2 + 95;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            return changeWifiNamePayloadCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ChangeWifiNamePayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 85;
            copydefault = i3 % 128;
            ChangeWifiNamePayload[] changeWifiNamePayloadArr = new ChangeWifiNamePayload[i];
            if (i3 % 2 != 0) {
                return changeWifiNamePayloadArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public ChangeWifiNamePayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 53;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            ChangeWifiNamePayload[] changeWifiNamePayloadArrNewArray = newArray(i);
            int i5 = copydefault + 69;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 99 / 0;
            }
            return changeWifiNamePayloadArrNewArray;
        }
    }

    public ChangeWifiNamePayload(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.msisdn = str;
        this.ci = str2;
        this.serialNumber = str3;
        this.profileName = str4;
        this.newSSIDName = str5;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = component3 + 43;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.msisdn;
        int i4 = i3 + 9;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getCi() {
        int i = 2 % 2;
        int i2 = component2 + 21;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ci;
        }
        throw null;
    }

    public final String getSerialNumber() {
        int i = 2 % 2;
        int i2 = component3 + 57;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.serialNumber;
        int i5 = i3 + 119;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getProfileName() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 125;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.profileName;
        int i5 = i2 + 43;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getNewSSIDName() {
        int i = 2 % 2;
        int i2 = component3 + 5;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.newSSIDName;
        int i5 = i3 + 13;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = component1 + 31;
        ShareDataUIState = i % 128;
        if (i % 2 != 0) {
            int i2 = 24 / 0;
        }
    }

    public static ChangeWifiNamePayload copy$default(ChangeWifiNamePayload changeWifiNamePayload, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        String str6;
        String str7;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = changeWifiNamePayload.msisdn;
        }
        String str8 = str;
        if ((i & 2) != 0) {
            int i3 = component2 + 3;
            component3 = i3 % 128;
            if (i3 % 2 == 0) {
                str7 = changeWifiNamePayload.ci;
                int i4 = 55 / 0;
            } else {
                str7 = changeWifiNamePayload.ci;
            }
            str2 = str7;
        }
        String str9 = str2;
        if ((i & 4) != 0) {
            str3 = changeWifiNamePayload.serialNumber;
        }
        String str10 = str3;
        if ((i & 8) != 0) {
            int i5 = component3 + 97;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            str4 = changeWifiNamePayload.profileName;
        }
        String str11 = str4;
        if ((i & 16) != 0) {
            int i7 = component3 + 97;
            component2 = i7 % 128;
            if (i7 % 2 != 0) {
                str6 = changeWifiNamePayload.newSSIDName;
                int i8 = 79 / 0;
            } else {
                str6 = changeWifiNamePayload.newSSIDName;
            }
            str5 = str6;
        }
        return changeWifiNamePayload.copy(str8, str9, str10, str11, str5);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 85;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.msisdn;
        int i5 = i3 + 97;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 73 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2 + 55;
        int i3 = i2 % 128;
        component3 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.ci;
        int i4 = i3 + 77;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component3 + 13;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.serialNumber;
        int i5 = i3 + 31;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component2 + 77;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.profileName;
        int i5 = i3 + 37;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 12 / 0;
        }
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 59;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.newSSIDName;
        int i5 = i2 + 57;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final ChangeWifiNamePayload copy(String msisdn, String ci, String serialNumber, String profileName, String newSSIDName) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(msisdn, "");
        Intrinsics.checkNotNullParameter(ci, "");
        Intrinsics.checkNotNullParameter(serialNumber, "");
        Intrinsics.checkNotNullParameter(profileName, "");
        Intrinsics.checkNotNullParameter(newSSIDName, "");
        ChangeWifiNamePayload changeWifiNamePayload = new ChangeWifiNamePayload(msisdn, ci, serialNumber, profileName, newSSIDName);
        int i2 = component3 + 79;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 48 / 0;
        }
        return changeWifiNamePayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2 + 7;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 107;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChangeWifiNamePayload)) {
            int i2 = component2 + 31;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        ChangeWifiNamePayload changeWifiNamePayload = (ChangeWifiNamePayload) other;
        if (!Intrinsics.areEqual(this.msisdn, changeWifiNamePayload.msisdn)) {
            int i4 = component3 + 55;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.ci, changeWifiNamePayload.ci)) {
            int i6 = component2 + 51;
            component3 = i6 % 128;
            return i6 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.serialNumber, changeWifiNamePayload.serialNumber) || !Intrinsics.areEqual(this.profileName, changeWifiNamePayload.profileName)) {
            return false;
        }
        if (Intrinsics.areEqual(this.newSSIDName, changeWifiNamePayload.newSSIDName)) {
            return true;
        }
        int i7 = component2 + 25;
        component3 = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 33;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.msisdn.hashCode() * 31) + this.ci.hashCode()) * 31) + this.serialNumber.hashCode()) * 31) + this.profileName.hashCode()) * 31) + this.newSSIDName.hashCode();
        int i4 = component2 + 39;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ChangeWifiNamePayload(msisdn=" + this.msisdn + ", ci=" + this.ci + ", serialNumber=" + this.serialNumber + ", profileName=" + this.profileName + ", newSSIDName=" + this.newSSIDName + ")";
        int i2 = component3 + 45;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 69;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 == 0) {
            dest.writeString(this.msisdn);
            dest.writeString(this.ci);
            dest.writeString(this.serialNumber);
            dest.writeString(this.profileName);
            dest.writeString(this.newSSIDName);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        dest.writeString(this.msisdn);
        dest.writeString(this.ci);
        dest.writeString(this.serialNumber);
        dest.writeString(this.profileName);
        dest.writeString(this.newSSIDName);
        int i4 = component2 + 3;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 30 / 0;
        }
    }
}
