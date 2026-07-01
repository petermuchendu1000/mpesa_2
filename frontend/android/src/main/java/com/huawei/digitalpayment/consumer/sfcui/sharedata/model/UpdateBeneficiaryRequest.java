package com.huawei.digitalpayment.consumer.sfcui.sharedata.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÇ\u0001J\b\u0010\u0016\u001a\u00020\u0017H\u0007J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH×\u0003J\t\u0010\u001c\u001a\u00020\u0017H×\u0001J\t\u0010\u001d\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006#"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/model/UpdateBeneficiaryRequest;", "Landroid/os/Parcelable;", "beneficiaryMsisdn", "", "limitValue", "newBundleType", "oldBundleType", "sponsorMsisdn", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBeneficiaryMsisdn", "()Ljava/lang/String;", "getLimitValue", "getNewBundleType", "getOldBundleType", "getSponsorMsisdn", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UpdateBeneficiaryRequest implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<UpdateBeneficiaryRequest> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copydefault;

    @SerializedName("beneficiaryMsisdn")
    private final String beneficiaryMsisdn;

    @SerializedName("limitValue")
    private final String limitValue;

    @SerializedName("newBundleType")
    private final String newBundleType;

    @SerializedName("oldBundleType")
    private final String oldBundleType;

    @SerializedName("sponsorMsisdn")
    private final String sponsorMsisdn;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UpdateBeneficiaryRequest> {
        private static int ShareDataUIState = 0;
        private static int component3 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final UpdateBeneficiaryRequest createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            UpdateBeneficiaryRequest updateBeneficiaryRequest = new UpdateBeneficiaryRequest(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component3 + 9;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return updateBeneficiaryRequest;
        }

        @Override
        public UpdateBeneficiaryRequest createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 125;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final UpdateBeneficiaryRequest[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 19;
            int i4 = i3 % 128;
            ShareDataUIState = i4;
            UpdateBeneficiaryRequest[] updateBeneficiaryRequestArr = new UpdateBeneficiaryRequest[i];
            if (i3 % 2 != 0) {
                throw null;
            }
            int i5 = i4 + 89;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                return updateBeneficiaryRequestArr;
            }
            throw null;
        }

        @Override
        public UpdateBeneficiaryRequest[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 79;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            UpdateBeneficiaryRequest[] updateBeneficiaryRequestArrNewArray = newArray(i);
            int i5 = ShareDataUIState + 35;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return updateBeneficiaryRequestArrNewArray;
        }
    }

    public UpdateBeneficiaryRequest(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.beneficiaryMsisdn = str;
        this.limitValue = str2;
        this.newBundleType = str3;
        this.oldBundleType = str4;
        this.sponsorMsisdn = str5;
    }

    public final String getBeneficiaryMsisdn() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 119;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.beneficiaryMsisdn;
        int i5 = i2 + 119;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getLimitValue() {
        int i = 2 % 2;
        int i2 = copydefault + 103;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.limitValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getNewBundleType() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault + 25;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            str = this.newBundleType;
            int i4 = 99 / 0;
        } else {
            str = this.newBundleType;
        }
        int i5 = i3 + 11;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 37 / 0;
        }
        return str;
    }

    public final String getOldBundleType() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 107;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.oldBundleType;
        int i4 = i2 + 51;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getSponsorMsisdn() {
        int i = 2 % 2;
        int i2 = component3 + 47;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.sponsorMsisdn;
        if (i3 != 0) {
            int i4 = 80 / 0;
        }
        return str;
    }

    static {
        int i = component1 + 17;
        ShareDataUIState = i % 128;
        if (i % 2 == 0) {
            int i2 = 96 / 0;
        }
    }

    public static UpdateBeneficiaryRequest copy$default(UpdateBeneficiaryRequest updateBeneficiaryRequest, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component3 + 45;
        int i4 = i3 % 128;
        copydefault = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 33;
            component3 = i6 % 128;
            if (i6 % 2 == 0) {
                String str6 = updateBeneficiaryRequest.beneficiaryMsisdn;
                throw null;
            }
            str = updateBeneficiaryRequest.beneficiaryMsisdn;
        }
        String str7 = str;
        if ((i & 2) != 0) {
            str2 = updateBeneficiaryRequest.limitValue;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            int i7 = i4 + 117;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            str3 = updateBeneficiaryRequest.newBundleType;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = updateBeneficiaryRequest.oldBundleType;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = updateBeneficiaryRequest.sponsorMsisdn;
            int i9 = component3 + 73;
            copydefault = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 2 / 5;
            }
        }
        return updateBeneficiaryRequest.copy(str7, str8, str9, str10, str5);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 65;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.beneficiaryMsisdn;
        int i5 = i2 + 123;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault + 35;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.limitValue;
        int i5 = i3 + 47;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component3 + 87;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.newBundleType;
        if (i3 != 0) {
            int i4 = 25 / 0;
        }
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 91;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.oldBundleType;
        int i5 = i2 + 41;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 15;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.sponsorMsisdn;
        int i5 = i2 + 95;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 69 / 0;
        }
        return str;
    }

    public final UpdateBeneficiaryRequest copy(String beneficiaryMsisdn, String limitValue, String newBundleType, String oldBundleType, String sponsorMsisdn) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(beneficiaryMsisdn, "");
        Intrinsics.checkNotNullParameter(limitValue, "");
        Intrinsics.checkNotNullParameter(newBundleType, "");
        Intrinsics.checkNotNullParameter(oldBundleType, "");
        Intrinsics.checkNotNullParameter(sponsorMsisdn, "");
        UpdateBeneficiaryRequest updateBeneficiaryRequest = new UpdateBeneficiaryRequest(beneficiaryMsisdn, limitValue, newBundleType, oldBundleType, sponsorMsisdn);
        int i2 = copydefault + 49;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return updateBeneficiaryRequest;
        }
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 89;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 109;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component3 + 115;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 58 / 0;
            }
            return true;
        }
        if (!(other instanceof UpdateBeneficiaryRequest)) {
            int i4 = component3 + 101;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        UpdateBeneficiaryRequest updateBeneficiaryRequest = (UpdateBeneficiaryRequest) other;
        if (!Intrinsics.areEqual(this.beneficiaryMsisdn, updateBeneficiaryRequest.beneficiaryMsisdn)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.limitValue, updateBeneficiaryRequest.limitValue)) {
            int i6 = copydefault + 49;
            component3 = i6 % 128;
            return i6 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.newBundleType, updateBeneficiaryRequest.newBundleType)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.oldBundleType, updateBeneficiaryRequest.oldBundleType)) {
            int i7 = component3 + 125;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.sponsorMsisdn, updateBeneficiaryRequest.sponsorMsisdn)) {
            return true;
        }
        int i9 = copydefault + 91;
        component3 = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 55;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.beneficiaryMsisdn.hashCode() * 31) + this.limitValue.hashCode()) * 31) + this.newBundleType.hashCode()) * 31) + this.oldBundleType.hashCode()) * 31) + this.sponsorMsisdn.hashCode();
        int i4 = component3 + 99;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "UpdateBeneficiaryRequest(beneficiaryMsisdn=" + this.beneficiaryMsisdn + ", limitValue=" + this.limitValue + ", newBundleType=" + this.newBundleType + ", oldBundleType=" + this.oldBundleType + ", sponsorMsisdn=" + this.sponsorMsisdn + ")";
        int i2 = component3 + 93;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component3 + 25;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.beneficiaryMsisdn);
        dest.writeString(this.limitValue);
        dest.writeString(this.newBundleType);
        dest.writeString(this.oldBundleType);
        dest.writeString(this.sponsorMsisdn);
        int i4 = component3 + 57;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }
}
