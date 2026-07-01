package com.huawei.digitalpayment.consumer.sfcui.sharedata.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0017J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÇ\u0001J\b\u0010 \u001a\u00020!H\u0007J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H×\u0003J\t\u0010&\u001a\u00020!H×\u0001J\t\u0010'\u001a\u00020\u0003H×\u0001J\u0018\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020!H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006-"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/model/SponsorResponse;", "Landroid/os/Parcelable;", "msisdn", "", "limitValue", "remainderValue", "usageValue", "bundleType", "startTime", "endTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMsisdn", "()Ljava/lang/String;", "getLimitValue", "getRemainderValue", "getUsageValue", "getBundleType", "getStartTime", "getEndTime", "usage", "", "toShareDataBeneficiary", "Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/model/ShareDataBeneficiary;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SponsorResponse implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<SponsorResponse> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 1;
    private static int copydefault;

    @SerializedName("bundleType")
    private final String bundleType;

    @SerializedName("endTime")
    private final String endTime;

    @SerializedName("limitValue")
    private final String limitValue;

    @SerializedName("msisdn")
    private final String msisdn;

    @SerializedName("remainderValue")
    private final String remainderValue;

    @SerializedName("startTime")
    private final String startTime;

    @SerializedName("usageValue")
    private final String usageValue;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SponsorResponse> {
        private static int component1 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final SponsorResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            SponsorResponse sponsorResponse = new SponsorResponse(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = copydefault + 45;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return sponsorResponse;
        }

        @Override
        public SponsorResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 27;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            SponsorResponse sponsorResponseCreateFromParcel = createFromParcel(parcel);
            if (i3 != 0) {
                int i4 = 55 / 0;
            }
            int i5 = component1 + 111;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return sponsorResponseCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final SponsorResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 83;
            int i4 = i3 % 128;
            component1 = i4;
            int i5 = i3 % 2;
            SponsorResponse[] sponsorResponseArr = new SponsorResponse[i];
            int i6 = i4 + 103;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            return sponsorResponseArr;
        }

        @Override
        public SponsorResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 49;
            copydefault = i3 % 128;
            if (i3 % 2 == 0) {
                return newArray(i);
            }
            newArray(i);
            throw null;
        }
    }

    public SponsorResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.msisdn = str;
        this.limitValue = str2;
        this.remainderValue = str3;
        this.usageValue = str4;
        this.bundleType = str5;
        this.startTime = str6;
        this.endTime = str7;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 1;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.msisdn;
        int i5 = i2 + 103;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getLimitValue() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 75;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.limitValue;
        int i5 = i3 + 79;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getRemainderValue() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 71;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.remainderValue;
        int i4 = i2 + 23;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getUsageValue() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 71;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.usageValue;
        int i5 = i3 + 113;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getBundleType() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 39;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.bundleType;
        }
        throw null;
    }

    public final String getStartTime() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 75;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.startTime;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getEndTime() {
        int i = 2 % 2;
        int i2 = component2 + 67;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.endTime;
        int i5 = i3 + 35;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final double usage() {
        double dDoubleValue;
        double dDoubleValue2;
        int i = 2 % 2;
        try {
            Double doubleOrNull = StringsKt.toDoubleOrNull(StringsKt.replace$default(this.usageValue, " MB", "", false, 4, (Object) null));
            if (doubleOrNull != null) {
                dDoubleValue = doubleOrNull.doubleValue();
                int i2 = ShareDataUIState + 41;
                component2 = i2 % 128;
                int i3 = i2 % 2;
            } else {
                int i4 = ShareDataUIState + 27;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                dDoubleValue = 0.0d;
            }
            Double doubleOrNull2 = StringsKt.toDoubleOrNull(StringsKt.replace$default(this.limitValue, " MB", "", false, 4, (Object) null));
            if (doubleOrNull2 != null) {
                dDoubleValue2 = doubleOrNull2.doubleValue();
                int i6 = ShareDataUIState + 101;
                component2 = i6 % 128;
                int i7 = i6 % 2;
            } else {
                dDoubleValue2 = 1.0d;
            }
            double d2 = dDoubleValue / dDoubleValue2;
            double d3 = 100;
            return Math.rint((d2 * d3) * d3) / d3;
        } catch (Exception unused) {
            return 0.0d;
        }
    }

    public final ShareDataBeneficiary toShareDataBeneficiary() {
        int i = 2 % 2;
        ShareDataBeneficiary shareDataBeneficiary = new ShareDataBeneficiary(this.msisdn, this.limitValue, this.remainderValue, this.usageValue, this.startTime, this.endTime, this.bundleType);
        int i2 = ShareDataUIState + 53;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return shareDataBeneficiary;
    }

    static {
        int i = copydefault + 97;
        component1 = i % 128;
        if (i % 2 == 0) {
            int i2 = 10 / 0;
        }
    }

    public static SponsorResponse copy$default(SponsorResponse sponsorResponse, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        String str8;
        String str9;
        String str10;
        String str11;
        int i2 = 2 % 2;
        int i3 = ShareDataUIState;
        int i4 = i3 + 101;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 111;
            component2 = i6 % 128;
            if (i6 % 2 == 0) {
                str8 = sponsorResponse.msisdn;
                int i7 = 86 / 0;
            } else {
                str8 = sponsorResponse.msisdn;
            }
        } else {
            str8 = str;
        }
        if ((i & 2) != 0) {
            int i8 = component2 + 21;
            ShareDataUIState = i8 % 128;
            if (i8 % 2 != 0) {
                String str12 = sponsorResponse.limitValue;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str9 = sponsorResponse.limitValue;
        } else {
            str9 = str2;
        }
        String str13 = (i & 4) != 0 ? sponsorResponse.remainderValue : str3;
        if ((i & 8) != 0) {
            int i9 = ShareDataUIState + 73;
            component2 = i9 % 128;
            int i10 = i9 % 2;
            str10 = sponsorResponse.usageValue;
        } else {
            str10 = str4;
        }
        String str14 = (i & 16) != 0 ? sponsorResponse.bundleType : str5;
        String str15 = (i & 32) != 0 ? sponsorResponse.startTime : str6;
        if ((i & 64) != 0) {
            int i11 = component2 + 69;
            ShareDataUIState = i11 % 128;
            int i12 = i11 % 2;
            str11 = sponsorResponse.endTime;
        } else {
            str11 = str7;
        }
        return sponsorResponse.copy(str8, str9, str13, str10, str14, str15, str11);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 33;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.msisdn;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2 + 109;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.limitValue;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component2 + 73;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.remainderValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component2 + 23;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.usageValue;
        int i5 = i3 + 1;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component2 + 7;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.bundleType;
        int i4 = i3 + 37;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 69 / 0;
        }
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component2 + 119;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.startTime;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 121;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.endTime;
        int i4 = i2 + 55;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 79 / 0;
        }
        return str;
    }

    public final SponsorResponse copy(String msisdn, String limitValue, String remainderValue, String usageValue, String bundleType, String startTime, String endTime) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(msisdn, "");
        Intrinsics.checkNotNullParameter(limitValue, "");
        Intrinsics.checkNotNullParameter(remainderValue, "");
        Intrinsics.checkNotNullParameter(usageValue, "");
        Intrinsics.checkNotNullParameter(bundleType, "");
        Intrinsics.checkNotNullParameter(startTime, "");
        Intrinsics.checkNotNullParameter(endTime, "");
        SponsorResponse sponsorResponse = new SponsorResponse(msisdn, limitValue, remainderValue, usageValue, bundleType, startTime, endTime);
        int i2 = ShareDataUIState + 55;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return sponsorResponse;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2 + 95;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 67;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof SponsorResponse)) {
            int i2 = component2 + 61;
            ShareDataUIState = i2 % 128;
            return i2 % 2 != 0;
        }
        SponsorResponse sponsorResponse = (SponsorResponse) other;
        if (!Intrinsics.areEqual(this.msisdn, sponsorResponse.msisdn)) {
            int i3 = component2 + 119;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.limitValue, sponsorResponse.limitValue)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.remainderValue, sponsorResponse.remainderValue)) {
            int i4 = component2 + 123;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.usageValue, sponsorResponse.usageValue)) {
            return false;
        }
        if (Intrinsics.areEqual(this.bundleType, sponsorResponse.bundleType)) {
            return Intrinsics.areEqual(this.startTime, sponsorResponse.startTime) && Intrinsics.areEqual(this.endTime, sponsorResponse.endTime);
        }
        int i6 = component2 + 55;
        ShareDataUIState = i6 % 128;
        return i6 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 65;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((this.msisdn.hashCode() * 31) + this.limitValue.hashCode()) * 31) + this.remainderValue.hashCode()) * 31) + this.usageValue.hashCode()) * 31) + this.bundleType.hashCode()) * 31) + this.startTime.hashCode()) * 31) + this.endTime.hashCode();
        int i4 = component2 + 101;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SponsorResponse(msisdn=" + this.msisdn + ", limitValue=" + this.limitValue + ", remainderValue=" + this.remainderValue + ", usageValue=" + this.usageValue + ", bundleType=" + this.bundleType + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ")";
        int i2 = component2 + 23;
        ShareDataUIState = i2 % 128;
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
        int i2 = ShareDataUIState + 115;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.msisdn);
        dest.writeString(this.limitValue);
        dest.writeString(this.remainderValue);
        dest.writeString(this.usageValue);
        dest.writeString(this.bundleType);
        dest.writeString(this.startTime);
        dest.writeString(this.endTime);
        int i4 = ShareDataUIState + 99;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 37 / 0;
        }
    }
}
