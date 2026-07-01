package com.huawei.digitalpayment.consumer.fixeddata.data.model.home4g5g;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\b\u0010\r\u001a\u00020\u000eH\u0007J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u000eH×\u0001J\t\u0010\u0014\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/home4g5g/Home4G5GAutoRenewOptOutPayload;", "Landroid/os/Parcelable;", "sponsorMsisdn", "", "beneficiaryMsisdn", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getSponsorMsisdn", "()Ljava/lang/String;", "getBeneficiaryMsisdn", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Home4G5GAutoRenewOptOutPayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<Home4G5GAutoRenewOptOutPayload> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private static int component3 = 1;
    private static int copydefault;

    @SerializedName("beneficiaryMsisdn")
    private final String beneficiaryMsisdn;

    @SerializedName("sponsorMsisdn")
    private final String sponsorMsisdn;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Home4G5GAutoRenewOptOutPayload> {
        private static int component1 = 0;
        private static int component2 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Home4G5GAutoRenewOptOutPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            Home4G5GAutoRenewOptOutPayload home4G5GAutoRenewOptOutPayload = new Home4G5GAutoRenewOptOutPayload(parcel.readString(), parcel.readString());
            int i2 = component1 + 65;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                return home4G5GAutoRenewOptOutPayload;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public Home4G5GAutoRenewOptOutPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 111;
            component2 = i2 % 128;
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
        public final Home4G5GAutoRenewOptOutPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 27;
            component2 = i3 % 128;
            Home4G5GAutoRenewOptOutPayload[] home4G5GAutoRenewOptOutPayloadArr = new Home4G5GAutoRenewOptOutPayload[i];
            if (i3 % 2 != 0) {
                return home4G5GAutoRenewOptOutPayloadArr;
            }
            throw null;
        }

        @Override
        public Home4G5GAutoRenewOptOutPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 35;
            component1 = i3 % 128;
            if (i3 % 2 == 0) {
                return newArray(i);
            }
            newArray(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public Home4G5GAutoRenewOptOutPayload(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.sponsorMsisdn = str;
        this.beneficiaryMsisdn = str2;
    }

    public final String getSponsorMsisdn() {
        int i = 2 % 2;
        int i2 = copydefault + 9;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.sponsorMsisdn;
        }
        throw null;
    }

    public final String getBeneficiaryMsisdn() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 35;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.beneficiaryMsisdn;
        int i4 = i2 + 21;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 71 / 0;
        }
        return str;
    }

    static {
        int i = ShareDataUIState + 111;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public static Home4G5GAutoRenewOptOutPayload copy$default(Home4G5GAutoRenewOptOutPayload home4G5GAutoRenewOptOutPayload, String str, String str2, int i, Object obj) {
        String str3;
        int i2 = 2 % 2;
        int i3 = copydefault;
        int i4 = i3 + 27;
        component2 = i4 % 128;
        if (i4 % 2 != 0 && (i & 1) != 0) {
            int i5 = i3 + 121;
            int i6 = i5 % 128;
            component2 = i6;
            if (i5 % 2 == 0) {
                str3 = home4G5GAutoRenewOptOutPayload.sponsorMsisdn;
                int i7 = 45 / 0;
            } else {
                str3 = home4G5GAutoRenewOptOutPayload.sponsorMsisdn;
            }
            int i8 = i6 + 35;
            copydefault = i8 % 128;
            int i9 = i8 % 2;
            str = str3;
        }
        if ((i & 2) != 0) {
            str2 = home4G5GAutoRenewOptOutPayload.beneficiaryMsisdn;
        }
        return home4G5GAutoRenewOptOutPayload.copy(str, str2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 43;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.sponsorMsisdn;
        int i5 = i2 + 113;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault + 123;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.beneficiaryMsisdn;
        int i5 = i3 + 49;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 13 / 0;
        }
        return str;
    }

    public final Home4G5GAutoRenewOptOutPayload copy(String sponsorMsisdn, String beneficiaryMsisdn) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sponsorMsisdn, "");
        Intrinsics.checkNotNullParameter(beneficiaryMsisdn, "");
        Home4G5GAutoRenewOptOutPayload home4G5GAutoRenewOptOutPayload = new Home4G5GAutoRenewOptOutPayload(sponsorMsisdn, beneficiaryMsisdn);
        int i2 = copydefault + 45;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return home4G5GAutoRenewOptOutPayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 109;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 59;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 14 / 0;
        }
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copydefault + 111;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof Home4G5GAutoRenewOptOutPayload)) {
            return false;
        }
        Home4G5GAutoRenewOptOutPayload home4G5GAutoRenewOptOutPayload = (Home4G5GAutoRenewOptOutPayload) other;
        if (!Intrinsics.areEqual(this.sponsorMsisdn, home4G5GAutoRenewOptOutPayload.sponsorMsisdn)) {
            int i4 = copydefault + 3;
            component2 = i4 % 128;
            return i4 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.beneficiaryMsisdn, home4G5GAutoRenewOptOutPayload.beneficiaryMsisdn)) {
            return false;
        }
        int i5 = component2 + 65;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 95;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.sponsorMsisdn.hashCode();
        return i3 == 0 ? (iHashCode >> 7) << this.beneficiaryMsisdn.hashCode() : (iHashCode * 31) + this.beneficiaryMsisdn.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Home4G5GAutoRenewOptOutPayload(sponsorMsisdn=" + this.sponsorMsisdn + ", beneficiaryMsisdn=" + this.beneficiaryMsisdn + ")";
        int i2 = component2 + 11;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 49;
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
            int i4 = 16 / 0;
        }
    }
}
