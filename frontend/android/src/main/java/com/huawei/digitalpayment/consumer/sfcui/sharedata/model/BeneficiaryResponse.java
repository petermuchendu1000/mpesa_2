package com.huawei.digitalpayment.consumer.sfcui.sharedata.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0017J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÇ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H×\u0003J\t\u0010$\u001a\u00020%H×\u0001J\t\u0010&\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006'"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/model/BeneficiaryResponse;", "Ljava/io/Serializable;", "msisdn", "", "limitValue", "remainderValue", "usageValue", "bundleType", "startTime", "endTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMsisdn", "()Ljava/lang/String;", "getLimitValue", "getRemainderValue", "getUsageValue", "getBundleType", "getStartTime", "getEndTime", "usage", "", "toShareDataBeneficiary", "Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/model/ShareDataBeneficiary;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BeneficiaryResponse implements Serializable {
    public static final int $stable = 0;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 1;
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

    public BeneficiaryResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
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
        int i2 = component3 + 27;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.msisdn;
        int i5 = i3 + 31;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getLimitValue() {
        int i = 2 % 2;
        int i2 = copydefault + 31;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.limitValue;
        int i5 = i3 + 21;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 47 / 0;
        }
        return str;
    }

    public final String getRemainderValue() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 3;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.remainderValue;
        int i5 = i2 + 71;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getUsageValue() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 39;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.usageValue;
        int i4 = i2 + 63;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getBundleType() {
        int i = 2 % 2;
        int i2 = component3 + 61;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.bundleType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getStartTime() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 59;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.startTime;
        int i5 = i2 + 29;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getEndTime() {
        int i = 2 % 2;
        int i2 = copydefault + 101;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.endTime;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final double usage() {
        double dRint;
        int i = 2 % 2;
        int i2 = component3 + 29;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        try {
            double d2 = 100;
            dRint = Math.rint(((BeneficiaryResponseKt.access$safeToDouble(this.usageValue) / BeneficiaryResponseKt.access$safeToDouble(this.limitValue)) * d2) * d2) / d2;
        } catch (Exception unused) {
            dRint = 0.0d;
        }
        int i4 = copydefault + 1;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return dRint;
    }

    public final ShareDataBeneficiary toShareDataBeneficiary() {
        int i = 2 % 2;
        ShareDataBeneficiary shareDataBeneficiary = new ShareDataBeneficiary(this.msisdn, this.limitValue, this.remainderValue, this.usageValue, this.startTime, this.endTime, this.bundleType);
        int i2 = component3 + 61;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return shareDataBeneficiary;
    }

    static {
        int i = 1 + 19;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public static BeneficiaryResponse copy$default(BeneficiaryResponse beneficiaryResponse, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        int i2 = 2 % 2;
        Object obj2 = null;
        if ((i & 1) != 0) {
            int i3 = copydefault + 25;
            component3 = i3 % 128;
            if (i3 % 2 == 0) {
                String str8 = beneficiaryResponse.msisdn;
                obj2.hashCode();
                throw null;
            }
            str = beneficiaryResponse.msisdn;
        }
        String str9 = str;
        if ((i & 2) != 0) {
            int i4 = copydefault + 37;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            str2 = beneficiaryResponse.limitValue;
            if (i5 == 0) {
                int i6 = 67 / 0;
            }
        }
        String str10 = str2;
        if ((i & 4) != 0) {
            int i7 = copydefault + 79;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            str3 = beneficiaryResponse.remainderValue;
        }
        String str11 = str3;
        if ((i & 8) != 0) {
            str4 = beneficiaryResponse.usageValue;
        }
        String str12 = str4;
        if ((i & 16) != 0) {
            str5 = beneficiaryResponse.bundleType;
        }
        String str13 = str5;
        if ((i & 32) != 0) {
            int i9 = copydefault + 113;
            component3 = i9 % 128;
            if (i9 % 2 == 0) {
                String str14 = beneficiaryResponse.startTime;
                throw null;
            }
            str6 = beneficiaryResponse.startTime;
        }
        String str15 = str6;
        if ((i & 64) != 0) {
            str7 = beneficiaryResponse.endTime;
        }
        return beneficiaryResponse.copy(str9, str10, str11, str12, str13, str15, str7);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 95;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.msisdn;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        String str;
        int i = 2 % 2;
        int i2 = component3 + 99;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            str = this.limitValue;
            int i4 = 82 / 0;
        } else {
            str = this.limitValue;
        }
        int i5 = i3 + 59;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 87;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.remainderValue;
        int i5 = i2 + 25;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = copydefault + 125;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.usageValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 45;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.bundleType;
        int i5 = i2 + 63;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 79;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.startTime;
        int i5 = i2 + 33;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = copydefault + 41;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.endTime;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final BeneficiaryResponse copy(String msisdn, String limitValue, String remainderValue, String usageValue, String bundleType, String startTime, String endTime) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(msisdn, "");
        Intrinsics.checkNotNullParameter(limitValue, "");
        Intrinsics.checkNotNullParameter(remainderValue, "");
        Intrinsics.checkNotNullParameter(usageValue, "");
        Intrinsics.checkNotNullParameter(bundleType, "");
        Intrinsics.checkNotNullParameter(startTime, "");
        Intrinsics.checkNotNullParameter(endTime, "");
        BeneficiaryResponse beneficiaryResponse = new BeneficiaryResponse(msisdn, limitValue, remainderValue, usageValue, bundleType, startTime, endTime);
        int i2 = copydefault + 23;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return beneficiaryResponse;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault + 11;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeneficiaryResponse)) {
            return false;
        }
        BeneficiaryResponse beneficiaryResponse = (BeneficiaryResponse) other;
        if (Intrinsics.areEqual(this.msisdn, beneficiaryResponse.msisdn)) {
            return Intrinsics.areEqual(this.limitValue, beneficiaryResponse.limitValue) && Intrinsics.areEqual(this.remainderValue, beneficiaryResponse.remainderValue) && Intrinsics.areEqual(this.usageValue, beneficiaryResponse.usageValue) && Intrinsics.areEqual(this.bundleType, beneficiaryResponse.bundleType) && Intrinsics.areEqual(this.startTime, beneficiaryResponse.startTime) && Intrinsics.areEqual(this.endTime, beneficiaryResponse.endTime);
        }
        int i3 = copydefault + 69;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 97;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((this.msisdn.hashCode() * 31) + this.limitValue.hashCode()) * 31) + this.remainderValue.hashCode()) * 31) + this.usageValue.hashCode()) * 31) + this.bundleType.hashCode()) * 31) + this.startTime.hashCode()) * 31) + this.endTime.hashCode();
        int i4 = copydefault + 9;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 41 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BeneficiaryResponse(msisdn=" + this.msisdn + ", limitValue=" + this.limitValue + ", remainderValue=" + this.remainderValue + ", usageValue=" + this.usageValue + ", bundleType=" + this.bundleType + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ")";
        int i2 = component3 + 93;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
