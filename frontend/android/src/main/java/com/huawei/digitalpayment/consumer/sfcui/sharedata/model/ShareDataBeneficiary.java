package com.huawei.digitalpayment.consumer.sfcui.sharedata.model;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J[\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH×\u0003J\t\u0010 \u001a\u00020!H×\u0001J\t\u0010\"\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006#"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/model/ShareDataBeneficiary;", "Ljava/io/Serializable;", "msisdn", "", "limitValue", "remainderValue", "usageValue", "startTime", "endTime", "bundleType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMsisdn", "()Ljava/lang/String;", "getLimitValue", "getRemainderValue", "getUsageValue", "getStartTime", "getEndTime", "getBundleType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ShareDataBeneficiary implements Serializable {
    public static final int $stable = 0;
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int copydefault;
    private final String bundleType;
    private final String endTime;
    private final String limitValue;
    private final String msisdn;
    private final String remainderValue;
    private final String startTime;
    private final String usageValue;

    public ShareDataBeneficiary(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        this.msisdn = str;
        this.limitValue = str2;
        this.remainderValue = str3;
        this.usageValue = str4;
        this.startTime = str5;
        this.endTime = str6;
        this.bundleType = str7;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ShareDataBeneficiary(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str8;
        String str9;
        String str10;
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            str = "";
        }
        String str11 = null;
        if ((i & 2) != 0) {
            int i3 = copydefault + 67;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 44 / 0;
            }
            int i5 = 2 % 2;
            str8 = null;
        } else {
            str8 = str2;
        }
        String str12 = (i & 4) != 0 ? null : str3;
        if ((i & 8) != 0) {
            int i6 = ShareDataUIState + 37;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            str9 = null;
        } else {
            str9 = str4;
        }
        if ((i & 16) != 0) {
            int i8 = ShareDataUIState + 91;
            copydefault = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 2 % 2;
            }
            str10 = null;
        } else {
            str10 = str5;
        }
        String str13 = (i & 32) != 0 ? null : str6;
        if ((i & 64) != 0) {
            int i10 = copydefault + 45;
            ShareDataUIState = i10 % 128;
            int i11 = i10 % 2;
        } else {
            str11 = str7;
        }
        this(str, str8, str12, str9, str10, str13, str11);
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 25;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.msisdn;
        int i5 = i2 + 75;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getLimitValue() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 69;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.limitValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getRemainderValue() {
        int i = 2 % 2;
        int i2 = copydefault + 9;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.remainderValue;
        int i4 = i3 + 17;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getUsageValue() {
        int i = 2 % 2;
        int i2 = copydefault + 77;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.usageValue;
        if (i3 == 0) {
            int i4 = 31 / 0;
        }
        return str;
    }

    public final String getStartTime() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 125;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            str = this.startTime;
            int i4 = 22 / 0;
        } else {
            str = this.startTime;
        }
        int i5 = i3 + 51;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getEndTime() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 1;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.endTime;
        int i5 = i2 + 29;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getBundleType() {
        int i = 2 % 2;
        int i2 = copydefault + 77;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.bundleType;
        int i5 = i3 + 53;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = 1 + 29;
        component1 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ShareDataBeneficiary() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static ShareDataBeneficiary copy$default(ShareDataBeneficiary shareDataBeneficiary, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        String str8;
        String str9;
        String str10;
        String str11;
        int i2 = 2 % 2;
        String str12 = (i & 1) != 0 ? shareDataBeneficiary.msisdn : str;
        String str13 = (i & 2) != 0 ? shareDataBeneficiary.limitValue : str2;
        if ((i & 4) != 0) {
            str8 = shareDataBeneficiary.remainderValue;
            int i3 = ShareDataUIState + 79;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
        } else {
            str8 = str3;
        }
        if ((i & 8) != 0) {
            int i5 = copydefault + 95;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            str9 = shareDataBeneficiary.usageValue;
        } else {
            str9 = str4;
        }
        if ((i & 16) != 0) {
            int i7 = copydefault + 31;
            ShareDataUIState = i7 % 128;
            if (i7 % 2 == 0) {
                str10 = shareDataBeneficiary.startTime;
                int i8 = 57 / 0;
            } else {
                str10 = shareDataBeneficiary.startTime;
            }
        } else {
            str10 = str5;
        }
        String str14 = (i & 32) != 0 ? shareDataBeneficiary.endTime : str6;
        if ((i & 64) != 0) {
            int i9 = copydefault + 79;
            ShareDataUIState = i9 % 128;
            int i10 = i9 % 2;
            str11 = shareDataBeneficiary.bundleType;
        } else {
            str11 = str7;
        }
        return shareDataBeneficiary.copy(str12, str13, str8, str9, str10, str14, str11);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 75;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.msisdn;
        int i4 = i3 + 95;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 7;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.limitValue;
        int i4 = i2 + 85;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault + 83;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.remainderValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 53;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.usageValue;
        int i5 = i2 + 61;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = copydefault + 41;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.startTime;
        int i5 = i3 + 29;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = copydefault + 3;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.endTime;
        int i5 = i3 + 27;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 41;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.bundleType;
        int i5 = i3 + 119;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 53 / 0;
        }
        return str;
    }

    public final ShareDataBeneficiary copy(String msisdn, String limitValue, String remainderValue, String usageValue, String startTime, String endTime, String bundleType) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(msisdn, "");
        ShareDataBeneficiary shareDataBeneficiary = new ShareDataBeneficiary(msisdn, limitValue, remainderValue, usageValue, startTime, endTime, bundleType);
        int i2 = ShareDataUIState + 29;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return shareDataBeneficiary;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copydefault + 1;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof ShareDataBeneficiary)) {
            int i4 = ShareDataUIState + 103;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 48 / 0;
            }
            return false;
        }
        ShareDataBeneficiary shareDataBeneficiary = (ShareDataBeneficiary) other;
        if (!Intrinsics.areEqual(this.msisdn, shareDataBeneficiary.msisdn)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.limitValue, shareDataBeneficiary.limitValue)) {
            int i6 = copydefault + 99;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 69 / 0;
            }
            return false;
        }
        if (!Intrinsics.areEqual(this.remainderValue, shareDataBeneficiary.remainderValue)) {
            int i8 = ShareDataUIState + 73;
            copydefault = i8 % 128;
            return i8 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.usageValue, shareDataBeneficiary.usageValue) || (!Intrinsics.areEqual(this.startTime, shareDataBeneficiary.startTime))) {
            return false;
        }
        if (!Intrinsics.areEqual(this.endTime, shareDataBeneficiary.endTime)) {
            int i9 = ShareDataUIState + 71;
            copydefault = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.bundleType, shareDataBeneficiary.bundleType)) {
            return true;
        }
        int i11 = ShareDataUIState + 59;
        copydefault = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026 A[PHI: r1 r3
  0x0026: PHI (r1v20 int) = (r1v5 int), (r1v22 int) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]
  0x0026: PHI (r3v3 java.lang.String) = (r3v0 java.lang.String), (r3v5 java.lang.String) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r1
  0x0024: PHI (r1v6 int) = (r1v5 int), (r1v22 int) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.sharedata.model.ShareDataBeneficiary.copydefault
            int r1 = r1 + 77
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.sharedata.model.ShareDataBeneficiary.ShareDataUIState = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L1a
            java.lang.String r1 = r8.msisdn
            int r1 = r1.hashCode()
            java.lang.String r3 = r8.limitValue
            if (r3 != 0) goto L26
            goto L24
        L1a:
            java.lang.String r1 = r8.msisdn
            int r1 = r1.hashCode()
            java.lang.String r3 = r8.limitValue
            if (r3 != 0) goto L26
        L24:
            r3 = r2
            goto L2a
        L26:
            int r3 = r3.hashCode()
        L2a:
            java.lang.String r4 = r8.remainderValue
            if (r4 != 0) goto L3d
            int r4 = com.huawei.digitalpayment.consumer.sfcui.sharedata.model.ShareDataBeneficiary.ShareDataUIState
            int r4 = r4 + 101
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.sfcui.sharedata.model.ShareDataBeneficiary.copydefault = r5
            int r4 = r4 % r0
            if (r4 == 0) goto L3b
            r4 = 1
            goto L41
        L3b:
            r4 = r2
            goto L41
        L3d:
            int r4 = r4.hashCode()
        L41:
            java.lang.String r5 = r8.usageValue
            if (r5 != 0) goto L50
            int r5 = com.huawei.digitalpayment.consumer.sfcui.sharedata.model.ShareDataBeneficiary.copydefault
            int r5 = r5 + 57
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.sfcui.sharedata.model.ShareDataBeneficiary.ShareDataUIState = r6
            int r5 = r5 % r0
            r5 = r2
            goto L54
        L50:
            int r5 = r5.hashCode()
        L54:
            java.lang.String r6 = r8.startTime
            if (r6 != 0) goto L63
            int r6 = com.huawei.digitalpayment.consumer.sfcui.sharedata.model.ShareDataBeneficiary.copydefault
            int r6 = r6 + 49
            int r7 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.sharedata.model.ShareDataBeneficiary.ShareDataUIState = r7
            int r6 = r6 % r0
            r0 = r2
            goto L67
        L63:
            int r0 = r6.hashCode()
        L67:
            java.lang.String r6 = r8.endTime
            if (r6 != 0) goto L6d
            r6 = r2
            goto L71
        L6d:
            int r6 = r6.hashCode()
        L71:
            java.lang.String r7 = r8.bundleType
            if (r7 != 0) goto L76
            goto L7a
        L76:
            int r2 = r7.hashCode()
        L7a:
            int r1 = r1 * 31
            int r1 = r1 + r3
            int r1 = r1 * 31
            int r1 = r1 + r4
            int r1 = r1 * 31
            int r1 = r1 + r5
            int r1 = r1 * 31
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r1 = r1 + r6
            int r1 = r1 * 31
            int r1 = r1 + r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sharedata.model.ShareDataBeneficiary.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ShareDataBeneficiary(msisdn=" + this.msisdn + ", limitValue=" + this.limitValue + ", remainderValue=" + this.remainderValue + ", usageValue=" + this.usageValue + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", bundleType=" + this.bundleType + ")";
        int i2 = ShareDataUIState + 117;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
