package com.huawei.digitalpayment.consumer.fixeddata.data.model.home4g5g;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\b\u0010\r\u001a\u00020\u000eH\u0007J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u000eH×\u0001J\t\u0010\u0014\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/home4g5g/Home4G5GGetAccountsPayload;", "Landroid/os/Parcelable;", "sponsorMsisdn", "", "technology", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getSponsorMsisdn", "()Ljava/lang/String;", "getTechnology", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Home4G5GGetAccountsPayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<Home4G5GGetAccountsPayload> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("sponsorMsisdn")
    private final String sponsorMsisdn;

    @SerializedName("technology")
    private final String technology;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Home4G5GGetAccountsPayload> {
        private static int ShareDataUIState = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Home4G5GGetAccountsPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            Home4G5GGetAccountsPayload home4G5GGetAccountsPayload = new Home4G5GGetAccountsPayload(parcel.readString(), parcel.readString());
            int i2 = copydefault + 31;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 14 / 0;
            }
            return home4G5GGetAccountsPayload;
        }

        @Override
        public Home4G5GGetAccountsPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 17;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Home4G5GGetAccountsPayload home4G5GGetAccountsPayloadCreateFromParcel = createFromParcel(parcel);
            int i4 = copydefault + 99;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return home4G5GGetAccountsPayloadCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Home4G5GGetAccountsPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 81;
            ShareDataUIState = i3 % 128;
            Home4G5GGetAccountsPayload[] home4G5GGetAccountsPayloadArr = new Home4G5GGetAccountsPayload[i];
            if (i3 % 2 == 0) {
                return home4G5GGetAccountsPayloadArr;
            }
            throw null;
        }

        @Override
        public Home4G5GGetAccountsPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 67;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            Home4G5GGetAccountsPayload[] home4G5GGetAccountsPayloadArrNewArray = newArray(i);
            if (i4 == 0) {
                int i5 = 70 / 0;
            }
            int i6 = ShareDataUIState + 101;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            return home4G5GGetAccountsPayloadArrNewArray;
        }
    }

    public Home4G5GGetAccountsPayload(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.sponsorMsisdn = str;
        this.technology = str2;
    }

    public final String getSponsorMsisdn() {
        int i = 2 % 2;
        int i2 = component3 + 17;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.sponsorMsisdn;
        }
        throw null;
    }

    public final String getTechnology() {
        int i = 2 % 2;
        int i2 = copydefault + 111;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.technology;
        int i5 = i3 + 97;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = component1 + 111;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    public static Home4G5GGetAccountsPayload copy$default(Home4G5GGetAccountsPayload home4G5GGetAccountsPayload, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault + 1;
        int i4 = i3 % 128;
        component3 = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            str = home4G5GGetAccountsPayload.sponsorMsisdn;
        }
        if ((i & 2) != 0) {
            int i6 = i4 + 95;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            str2 = home4G5GGetAccountsPayload.technology;
        }
        return home4G5GGetAccountsPayload.copy(str, str2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 85;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.sponsorMsisdn;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 103;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.technology;
        int i5 = i2 + 89;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Home4G5GGetAccountsPayload copy(String sponsorMsisdn, String technology) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sponsorMsisdn, "");
        Intrinsics.checkNotNullParameter(technology, "");
        Home4G5GGetAccountsPayload home4G5GGetAccountsPayload = new Home4G5GGetAccountsPayload(sponsorMsisdn, technology);
        int i2 = copydefault + 89;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return home4G5GGetAccountsPayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3 + 31;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copydefault + 93;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof Home4G5GGetAccountsPayload)) {
            int i4 = copydefault + 99;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        Home4G5GGetAccountsPayload home4G5GGetAccountsPayload = (Home4G5GGetAccountsPayload) other;
        if (Intrinsics.areEqual(this.sponsorMsisdn, home4G5GGetAccountsPayload.sponsorMsisdn)) {
            return Intrinsics.areEqual(this.technology, home4G5GGetAccountsPayload.technology);
        }
        int i6 = copydefault + 109;
        component3 = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 95;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.sponsorMsisdn.hashCode() * 31) + this.technology.hashCode();
        int i4 = component3 + 101;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Home4G5GGetAccountsPayload(sponsorMsisdn=" + this.sponsorMsisdn + ", technology=" + this.technology + ")";
        int i2 = component3 + 61;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component3 + 107;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.sponsorMsisdn);
        dest.writeString(this.technology);
        int i4 = component3 + 23;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
