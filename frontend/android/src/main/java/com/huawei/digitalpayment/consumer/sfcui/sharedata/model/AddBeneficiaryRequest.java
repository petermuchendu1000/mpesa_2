package com.huawei.digitalpayment.consumer.sfcui.sharedata.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÇ\u0001J\b\u0010\u0013\u001a\u00020\u0014H\u0007J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H×\u0003J\t\u0010\u0019\u001a\u00020\u0014H×\u0001J\t\u0010\u001a\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/model/AddBeneficiaryRequest;", "Landroid/os/Parcelable;", "beneficiaryMsisdn", "", "sponsorMsisdn", "bundleType", "limitValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBeneficiaryMsisdn", "()Ljava/lang/String;", "getSponsorMsisdn", "getBundleType", "getLimitValue", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AddBeneficiaryRequest implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<AddBeneficiaryRequest> CREATOR = new Creator();
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    @SerializedName("beneficiaryMsisdn")
    private final String beneficiaryMsisdn;

    @SerializedName("bundleType")
    private final String bundleType;

    @SerializedName("limitValue")
    private final String limitValue;

    @SerializedName("sponsorMsisdn")
    private final String sponsorMsisdn;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AddBeneficiaryRequest> {
        private static int ShareDataUIState = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final AddBeneficiaryRequest createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            AddBeneficiaryRequest addBeneficiaryRequest = new AddBeneficiaryRequest(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = ShareDataUIState + 3;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                return addBeneficiaryRequest;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public AddBeneficiaryRequest createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 39;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            AddBeneficiaryRequest addBeneficiaryRequestCreateFromParcel = createFromParcel(parcel);
            int i4 = copydefault + 75;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                return addBeneficiaryRequestCreateFromParcel;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final AddBeneficiaryRequest[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 11;
            copydefault = i3 % 128;
            AddBeneficiaryRequest[] addBeneficiaryRequestArr = new AddBeneficiaryRequest[i];
            if (i3 % 2 == 0) {
                return addBeneficiaryRequestArr;
            }
            throw null;
        }

        @Override
        public AddBeneficiaryRequest[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 39;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            AddBeneficiaryRequest[] addBeneficiaryRequestArrNewArray = newArray(i);
            if (i4 != 0) {
                int i5 = 42 / 0;
            }
            int i6 = copydefault + 51;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            return addBeneficiaryRequestArrNewArray;
        }
    }

    public AddBeneficiaryRequest(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.beneficiaryMsisdn = str;
        this.sponsorMsisdn = str2;
        this.bundleType = str3;
        this.limitValue = str4;
    }

    public final String getBeneficiaryMsisdn() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 119;
        component2 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.beneficiaryMsisdn;
        int i4 = i2 + 109;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getSponsorMsisdn() {
        int i = 2 % 2;
        int i2 = component3 + 1;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.sponsorMsisdn;
        int i5 = i3 + 25;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 44 / 0;
        }
        return str;
    }

    public final String getBundleType() {
        int i = 2 % 2;
        int i2 = component3 + 69;
        int i3 = i2 % 128;
        component2 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.bundleType;
        int i4 = i3 + 7;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getLimitValue() {
        int i = 2 % 2;
        int i2 = component2 + 115;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.limitValue;
        if (i3 == 0) {
            int i4 = 91 / 0;
        }
        return str;
    }

    static {
        int i = copydefault + 35;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public static AddBeneficiaryRequest copy$default(AddBeneficiaryRequest addBeneficiaryRequest, String str, String str2, String str3, String str4, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component3;
        int i4 = i3 + 27;
        component2 = i4 % 128;
        if (i4 % 2 == 0 && (i & 1) != 0) {
            str = addBeneficiaryRequest.beneficiaryMsisdn;
        }
        if ((i & 2) != 0) {
            str2 = addBeneficiaryRequest.sponsorMsisdn;
        }
        if ((i & 4) != 0) {
            str3 = addBeneficiaryRequest.bundleType;
            int i5 = i3 + 107;
            component2 = i5 % 128;
            int i6 = i5 % 2;
        }
        if ((i & 8) != 0) {
            int i7 = component2 + 13;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            str4 = addBeneficiaryRequest.limitValue;
        }
        return addBeneficiaryRequest.copy(str, str2, str3, str4);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 39;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.beneficiaryMsisdn;
        int i5 = i2 + 25;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2 + 123;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.sponsorMsisdn;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 73;
        component2 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.bundleType;
        int i4 = i2 + 107;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component3 + 107;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.limitValue;
        if (i3 != 0) {
            int i4 = 31 / 0;
        }
        return str;
    }

    public final AddBeneficiaryRequest copy(String beneficiaryMsisdn, String sponsorMsisdn, String bundleType, String limitValue) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(beneficiaryMsisdn, "");
        Intrinsics.checkNotNullParameter(sponsorMsisdn, "");
        Intrinsics.checkNotNullParameter(bundleType, "");
        Intrinsics.checkNotNullParameter(limitValue, "");
        AddBeneficiaryRequest addBeneficiaryRequest = new AddBeneficiaryRequest(beneficiaryMsisdn, sponsorMsisdn, bundleType, limitValue);
        int i2 = component3 + 3;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return addBeneficiaryRequest;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 97;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 81;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 123;
        component3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            int i4 = i2 + 99;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                return true;
            }
            throw null;
        }
        if (!(other instanceof AddBeneficiaryRequest)) {
            int i5 = i2 + 47;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        AddBeneficiaryRequest addBeneficiaryRequest = (AddBeneficiaryRequest) other;
        if (!Intrinsics.areEqual(this.beneficiaryMsisdn, addBeneficiaryRequest.beneficiaryMsisdn)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.sponsorMsisdn, addBeneficiaryRequest.sponsorMsisdn)) {
            int i7 = component2 + 39;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.bundleType, addBeneficiaryRequest.bundleType)) {
            int i9 = component2 + 31;
            component3 = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.limitValue, addBeneficiaryRequest.limitValue)) {
            return false;
        }
        int i11 = component2 + 65;
        component3 = i11 % 128;
        int i12 = i11 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 55;
        component2 = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (((((this.beneficiaryMsisdn.hashCode() * 72) % this.sponsorMsisdn.hashCode()) - 42) - this.bundleType.hashCode()) - 54) / this.limitValue.hashCode() : (((((this.beneficiaryMsisdn.hashCode() * 31) + this.sponsorMsisdn.hashCode()) * 31) + this.bundleType.hashCode()) * 31) + this.limitValue.hashCode();
        int i3 = component3 + 57;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AddBeneficiaryRequest(beneficiaryMsisdn=" + this.beneficiaryMsisdn + ", sponsorMsisdn=" + this.sponsorMsisdn + ", bundleType=" + this.bundleType + ", limitValue=" + this.limitValue + ")";
        int i2 = component3 + 109;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component3 + 63;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.beneficiaryMsisdn);
        dest.writeString(this.sponsorMsisdn);
        dest.writeString(this.bundleType);
        dest.writeString(this.limitValue);
        int i4 = component3 + 95;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 45 / 0;
        }
    }
}
