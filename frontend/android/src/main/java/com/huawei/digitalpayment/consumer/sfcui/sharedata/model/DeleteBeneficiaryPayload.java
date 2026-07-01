package com.huawei.digitalpayment.consumer.sfcui.sharedata.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\b\u0010\r\u001a\u00020\u000eH\u0007J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u000eH×\u0001J\t\u0010\u0014\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/model/DeleteBeneficiaryPayload;", "Landroid/os/Parcelable;", "beneficiaryMsisdn", "", "sponsorMsisdn", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getBeneficiaryMsisdn", "()Ljava/lang/String;", "getSponsorMsisdn", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeleteBeneficiaryPayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<DeleteBeneficiaryPayload> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 1;
    private static int component2;
    private static int component3;

    @SerializedName("beneficiaryMsisdn")
    private final String beneficiaryMsisdn;

    @SerializedName("sponsorMsisdn")
    private final String sponsorMsisdn;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DeleteBeneficiaryPayload> {
        private static int component3 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final DeleteBeneficiaryPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            DeleteBeneficiaryPayload deleteBeneficiaryPayload = new DeleteBeneficiaryPayload(parcel.readString(), parcel.readString());
            int i2 = component3 + 43;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return deleteBeneficiaryPayload;
        }

        @Override
        public DeleteBeneficiaryPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 51;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            DeleteBeneficiaryPayload deleteBeneficiaryPayloadCreateFromParcel = createFromParcel(parcel);
            int i4 = copydefault + 17;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return deleteBeneficiaryPayloadCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final DeleteBeneficiaryPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 3;
            int i4 = i3 % 128;
            copydefault = i4;
            int i5 = i3 % 2;
            DeleteBeneficiaryPayload[] deleteBeneficiaryPayloadArr = new DeleteBeneficiaryPayload[i];
            int i6 = i4 + 59;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            return deleteBeneficiaryPayloadArr;
        }

        @Override
        public DeleteBeneficiaryPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 11;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            DeleteBeneficiaryPayload[] deleteBeneficiaryPayloadArrNewArray = newArray(i);
            int i5 = component3 + 27;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return deleteBeneficiaryPayloadArrNewArray;
        }
    }

    public DeleteBeneficiaryPayload(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.beneficiaryMsisdn = str;
        this.sponsorMsisdn = str2;
    }

    public final String getBeneficiaryMsisdn() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 71;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.beneficiaryMsisdn;
        int i5 = i2 + 3;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getSponsorMsisdn() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 15;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.sponsorMsisdn;
        int i4 = i2 + 85;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    static {
        int i = ShareDataUIState + 79;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public static DeleteBeneficiaryPayload copy$default(DeleteBeneficiaryPayload deleteBeneficiaryPayload, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1 + 105;
        int i4 = i3 % 128;
        component2 = i4;
        if (i3 % 2 == 0 && (i & 1) != 0) {
            str = deleteBeneficiaryPayload.beneficiaryMsisdn;
        }
        if ((i & 2) != 0) {
            int i5 = i4 + 89;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            str2 = deleteBeneficiaryPayload.sponsorMsisdn;
        }
        return deleteBeneficiaryPayload.copy(str, str2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 13;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.beneficiaryMsisdn;
        int i5 = i2 + 21;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 21 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 97;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.sponsorMsisdn;
        int i4 = i2 + 117;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final DeleteBeneficiaryPayload copy(String beneficiaryMsisdn, String sponsorMsisdn) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(beneficiaryMsisdn, "");
        Intrinsics.checkNotNullParameter(sponsorMsisdn, "");
        DeleteBeneficiaryPayload deleteBeneficiaryPayload = new DeleteBeneficiaryPayload(beneficiaryMsisdn, sponsorMsisdn);
        int i2 = component1 + 37;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 9 / 0;
        }
        return deleteBeneficiaryPayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2 + 29;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 49;
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
        int i2 = component2 + 63;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        if (this == other) {
            int i5 = i3 + 111;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof DeleteBeneficiaryPayload)) {
            return false;
        }
        DeleteBeneficiaryPayload deleteBeneficiaryPayload = (DeleteBeneficiaryPayload) other;
        if (!Intrinsics.areEqual(this.beneficiaryMsisdn, deleteBeneficiaryPayload.beneficiaryMsisdn)) {
            return false;
        }
        if (Intrinsics.areEqual(this.sponsorMsisdn, deleteBeneficiaryPayload.sponsorMsisdn)) {
            int i7 = component1 + 125;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            return true;
        }
        int i9 = component2 + 113;
        component1 = i9 % 128;
        if (i9 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 29;
        component1 = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (this.beneficiaryMsisdn.hashCode() / 3) / this.sponsorMsisdn.hashCode() : (this.beneficiaryMsisdn.hashCode() * 31) + this.sponsorMsisdn.hashCode();
        int i3 = component2 + 19;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DeleteBeneficiaryPayload(beneficiaryMsisdn=" + this.beneficiaryMsisdn + ", sponsorMsisdn=" + this.sponsorMsisdn + ")";
        int i2 = component1 + 53;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component1 + 31;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.beneficiaryMsisdn);
        dest.writeString(this.sponsorMsisdn);
        int i4 = component1 + 7;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }
}
