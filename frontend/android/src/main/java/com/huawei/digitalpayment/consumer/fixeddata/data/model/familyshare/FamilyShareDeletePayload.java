package com.huawei.digitalpayment.consumer.fixeddata.data.model.familyshare;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\b\u0010\r\u001a\u00020\u000eH\u0007J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u000eH×\u0001J\t\u0010\u0014\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/familyshare/FamilyShareDeletePayload;", "Landroid/os/Parcelable;", "sponsorMsisdn", "", "beneficiaryMsisdn", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getSponsorMsisdn", "()Ljava/lang/String;", "getBeneficiaryMsisdn", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FamilyShareDeletePayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<FamilyShareDeletePayload> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 1;
    private static int component3;
    private static int copydefault;

    @SerializedName("beneficiaryMsisdn")
    private final String beneficiaryMsisdn;

    @SerializedName("sponsorMsisdn")
    private final String sponsorMsisdn;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FamilyShareDeletePayload> {
        private static int component1 = 1;
        private static int component2;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FamilyShareDeletePayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            FamilyShareDeletePayload familyShareDeletePayload = new FamilyShareDeletePayload(parcel.readString(), parcel.readString());
            int i2 = component1 + 83;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return familyShareDeletePayload;
        }

        @Override
        public FamilyShareDeletePayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 21;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FamilyShareDeletePayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 95;
            int i4 = i3 % 128;
            component1 = i4;
            int i5 = i3 % 2;
            FamilyShareDeletePayload[] familyShareDeletePayloadArr = new FamilyShareDeletePayload[i];
            int i6 = i4 + 3;
            component2 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 42 / 0;
            }
            return familyShareDeletePayloadArr;
        }

        @Override
        public FamilyShareDeletePayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 79;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            FamilyShareDeletePayload[] familyShareDeletePayloadArrNewArray = newArray(i);
            if (i4 == 0) {
                int i5 = 65 / 0;
            }
            return familyShareDeletePayloadArrNewArray;
        }
    }

    public FamilyShareDeletePayload(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.sponsorMsisdn = str;
        this.beneficiaryMsisdn = str2;
    }

    public final String getSponsorMsisdn() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 59;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.sponsorMsisdn;
        int i5 = i2 + 25;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getBeneficiaryMsisdn() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 103;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.beneficiaryMsisdn;
        int i5 = i2 + 69;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = component1 + 65;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public static FamilyShareDeletePayload copy$default(FamilyShareDeletePayload familyShareDeletePayload, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = copydefault + 109;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            str = familyShareDeletePayload.sponsorMsisdn;
        }
        if ((i & 2) != 0) {
            str2 = familyShareDeletePayload.beneficiaryMsisdn;
        }
        FamilyShareDeletePayload familyShareDeletePayloadCopy = familyShareDeletePayload.copy(str, str2);
        int i5 = ShareDataUIState + 99;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return familyShareDeletePayloadCopy;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 25;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.sponsorMsisdn;
        int i4 = i2 + 115;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 13;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.beneficiaryMsisdn;
        int i5 = i2 + 5;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final FamilyShareDeletePayload copy(String sponsorMsisdn, String beneficiaryMsisdn) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sponsorMsisdn, "");
        Intrinsics.checkNotNullParameter(beneficiaryMsisdn, "");
        FamilyShareDeletePayload familyShareDeletePayload = new FamilyShareDeletePayload(sponsorMsisdn, beneficiaryMsisdn);
        int i2 = copydefault + 21;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return familyShareDeletePayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 93;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 79;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault + 61;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof FamilyShareDeletePayload)) {
            int i5 = i3 + 35;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        FamilyShareDeletePayload familyShareDeletePayload = (FamilyShareDeletePayload) other;
        if (Intrinsics.areEqual(this.sponsorMsisdn, familyShareDeletePayload.sponsorMsisdn)) {
            return Intrinsics.areEqual(this.beneficiaryMsisdn, familyShareDeletePayload.beneficiaryMsisdn);
        }
        int i7 = copydefault + 27;
        ShareDataUIState = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 39;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.sponsorMsisdn.hashCode() * 31) + this.beneficiaryMsisdn.hashCode();
        int i4 = copydefault + 61;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FamilyShareDeletePayload(sponsorMsisdn=" + this.sponsorMsisdn + ", beneficiaryMsisdn=" + this.beneficiaryMsisdn + ")";
        int i2 = copydefault + 65;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 7;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        String str = this.sponsorMsisdn;
        if (i3 == 0) {
            dest.writeString(str);
            dest.writeString(this.beneficiaryMsisdn);
        } else {
            dest.writeString(str);
            dest.writeString(this.beneficiaryMsisdn);
            throw null;
        }
    }
}
