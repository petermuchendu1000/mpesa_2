package com.huawei.digitalpayment.consumer.sfcui.sambaza.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\u0019\u001a\u00020\u001aH\u0007J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH×\u0003J\t\u0010\u001f\u001a\u00020\u001aH×\u0001J\t\u0010 \u001a\u00020\u0003H×\u0001J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aH\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006&"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/resp/SambazaPayload;", "Landroid/os/Parcelable;", "partyA", "", "partyB", "resourceType", "resourceAmount", "accountType", "transferMode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPartyA", "()Ljava/lang/String;", "getPartyB", "getResourceType", "getResourceAmount", "getAccountType", "getTransferMode", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SambazaPayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<SambazaPayload> CREATOR = new Creator();
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 1;
    private static int copydefault;

    @SerializedName("accountType")
    private final String accountType;

    @SerializedName("partyA")
    private final String partyA;

    @SerializedName("partyB")
    private final String partyB;

    @SerializedName("resourceAmount")
    private final String resourceAmount;

    @SerializedName("resourceType")
    private final String resourceType;

    @SerializedName("transferMode")
    private final String transferMode;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SambazaPayload> {
        private static int component1 = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final SambazaPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            SambazaPayload sambazaPayload = new SambazaPayload(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component3 + 45;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return sambazaPayload;
        }

        @Override
        public SambazaPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 55;
            component1 = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                createFromParcel(parcel);
                obj.hashCode();
                throw null;
            }
            SambazaPayload sambazaPayloadCreateFromParcel = createFromParcel(parcel);
            int i3 = component3 + 85;
            component1 = i3 % 128;
            if (i3 % 2 != 0) {
                return sambazaPayloadCreateFromParcel;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final SambazaPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1;
            int i4 = i3 + 125;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            SambazaPayload[] sambazaPayloadArr = new SambazaPayload[i];
            int i6 = i3 + 53;
            component3 = i6 % 128;
            if (i6 % 2 == 0) {
                return sambazaPayloadArr;
            }
            throw null;
        }

        @Override
        public SambazaPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 41;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            SambazaPayload[] sambazaPayloadArrNewArray = newArray(i);
            int i5 = component3 + 31;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 1 / 0;
            }
            return sambazaPayloadArrNewArray;
        }
    }

    public SambazaPayload(String str, String str2, String str3, String str4, String str5, String str6) {
        this.partyA = str;
        this.partyB = str2;
        this.resourceType = str3;
        this.resourceAmount = str4;
        this.accountType = str5;
        this.transferMode = str6;
    }

    public final String getPartyA() {
        int i = 2 % 2;
        int i2 = component1 + 25;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.partyA;
        if (i3 == 0) {
            int i4 = 95 / 0;
        }
        return str;
    }

    public final String getPartyB() {
        int i = 2 % 2;
        int i2 = component3 + 121;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.partyB;
        int i5 = i3 + 43;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getResourceType() {
        int i = 2 % 2;
        int i2 = component3 + 19;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.resourceType;
        int i5 = i3 + 5;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getResourceAmount() {
        int i = 2 % 2;
        int i2 = component1 + 53;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.resourceAmount;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getAccountType() {
        int i = 2 % 2;
        int i2 = component1 + 31;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.accountType;
        }
        throw null;
    }

    public final String getTransferMode() {
        int i = 2 % 2;
        int i2 = component3 + 47;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.transferMode;
        int i5 = i3 + 9;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = copydefault + 123;
        component2 = i % 128;
        if (i % 2 == 0) {
            int i2 = 12 / 0;
        }
    }

    public static SambazaPayload copy$default(SambazaPayload sambazaPayload, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        String str7;
        String str8;
        int i2 = 2 % 2;
        String str9 = (i & 1) != 0 ? sambazaPayload.partyA : str;
        if ((i & 2) != 0) {
            int i3 = component1 + 83;
            component3 = i3 % 128;
            if (i3 % 2 == 0) {
                String str10 = sambazaPayload.partyB;
                throw null;
            }
            str7 = sambazaPayload.partyB;
        } else {
            str7 = str2;
        }
        if ((i & 4) != 0) {
            int i4 = component3 + 5;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            str8 = sambazaPayload.resourceType;
        } else {
            str8 = str3;
        }
        SambazaPayload sambazaPayloadCopy = sambazaPayload.copy(str9, str7, str8, (i & 8) != 0 ? sambazaPayload.resourceAmount : str4, (i & 16) != 0 ? sambazaPayload.accountType : str5, (i & 32) != 0 ? sambazaPayload.transferMode : str6);
        int i6 = component1 + 25;
        component3 = i6 % 128;
        if (i6 % 2 != 0) {
            return sambazaPayloadCopy;
        }
        throw null;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1 + 1;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.partyA;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3 + 93;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.partyB;
        int i5 = i3 + 119;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component1 + 25;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.resourceType;
        int i4 = i3 + 107;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 67;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.resourceAmount;
        int i5 = i2 + 123;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 67;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.accountType;
        int i5 = i2 + 9;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 11;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.transferMode;
        int i5 = i2 + 81;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final SambazaPayload copy(String partyA, String partyB, String resourceType, String resourceAmount, String accountType, String transferMode) {
        int i = 2 % 2;
        SambazaPayload sambazaPayload = new SambazaPayload(partyA, partyB, resourceType, resourceAmount, accountType, transferMode);
        int i2 = component1 + 27;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 96 / 0;
        }
        return sambazaPayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3 + 21;
        component1 = i2 % 128;
        return i2 % 2 != 0 ? 1 : 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof SambazaPayload)) {
            return false;
        }
        SambazaPayload sambazaPayload = (SambazaPayload) other;
        if (!Intrinsics.areEqual(this.partyA, sambazaPayload.partyA)) {
            int i2 = component1 + 87;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.partyB, sambazaPayload.partyB)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.resourceType, sambazaPayload.resourceType)) {
            int i4 = component3 + 33;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.resourceAmount, sambazaPayload.resourceAmount)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.accountType, sambazaPayload.accountType)) {
            int i6 = component1 + 103;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.transferMode, sambazaPayload.transferMode)) {
            return true;
        }
        int i8 = component1 + 25;
        component3 = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.partyA;
        int iHashCode3 = 0;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.partyB;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.resourceType;
        if (str3 == null) {
            int i2 = component3 + 107;
            component1 = i2 % 128;
            iHashCode = i2 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = str3.hashCode();
        }
        String str4 = this.resourceAmount;
        if (str4 == null) {
            int i3 = component1 + 19;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str4.hashCode();
        }
        String str5 = this.accountType;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.transferMode;
        if (str6 != null) {
            iHashCode3 = str6.hashCode();
            int i5 = component3 + 53;
            component1 = i5 % 128;
            int i6 = i5 % 2;
        }
        return (((((((((iHashCode4 * 31) + iHashCode5) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode6) * 31) + iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SambazaPayload(partyA=" + this.partyA + ", partyB=" + this.partyB + ", resourceType=" + this.resourceType + ", resourceAmount=" + this.resourceAmount + ", accountType=" + this.accountType + ", transferMode=" + this.transferMode + ")";
        int i2 = component3 + 89;
        component1 = i2 % 128;
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
        int i2 = component1 + 77;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.partyA);
        dest.writeString(this.partyB);
        dest.writeString(this.resourceType);
        dest.writeString(this.resourceAmount);
        dest.writeString(this.accountType);
        dest.writeString(this.transferMode);
        int i4 = component1 + 29;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }
}
