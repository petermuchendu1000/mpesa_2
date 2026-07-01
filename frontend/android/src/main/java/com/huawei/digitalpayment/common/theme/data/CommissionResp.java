package com.huawei.digitalpayment.common.theme.data;

import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/data/CommissionResp;", "Lcom/huawei/http/BaseResp;", "unityType", "", "amount", "unity", "totalCommission", "currency", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUnityType", "()Ljava/lang/String;", "getAmount", "getUnity", "getTotalCommission", "getCurrency", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CommissionResp extends BaseResp {
    private static int ShareDataUIState = 1;
    private static int component3;
    private final String amount;
    private final String currency;
    private final String totalCommission;
    private final String unity;
    private final String unityType;

    /* JADX WARN: Illegal instructions before constructor call */
    public CommissionResp(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str6;
        String str7;
        String str8 = null;
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            str = null;
        }
        String str9 = (i & 2) != 0 ? null : str2;
        if ((i & 4) != 0) {
            int i3 = ShareDataUIState + 69;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            str6 = null;
        } else {
            str6 = str3;
        }
        if ((i & 8) != 0) {
            int i6 = ShareDataUIState + 31;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            str7 = null;
        } else {
            str7 = str4;
        }
        if ((i & 16) != 0) {
            int i8 = 2 % 2;
        } else {
            str8 = str5;
        }
        this(str, str9, str6, str7, str8);
    }

    public final String getUnityType() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 73;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.unityType;
        int i4 = i2 + 1;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getAmount() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 63;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.amount;
        int i5 = i2 + 111;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 33 / 0;
        }
        return str;
    }

    public final String getUnity() {
        int i = 2 % 2;
        int i2 = component3 + 23;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.unity;
        int i4 = i3 + 93;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 70 / 0;
        }
        return str;
    }

    public final String getTotalCommission() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 1;
        int i3 = i2 % 128;
        component3 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.totalCommission;
        int i4 = i3 + 39;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getCurrency() {
        int i = 2 % 2;
        int i2 = component3 + 59;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.currency;
        int i5 = i3 + 75;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 18 / 0;
        }
        return str;
    }

    public CommissionResp(String str, String str2, String str3, String str4, String str5) {
        this.unityType = str;
        this.amount = str2;
        this.unity = str3;
        this.totalCommission = str4;
        this.currency = str5;
    }

    public CommissionResp() {
        this(null, null, null, null, null, 31, null);
    }

    public static CommissionResp copy$default(CommissionResp commissionResp, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 73;
        int i4 = i3 % 128;
        component3 = i4;
        if (i3 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
            str = commissionResp.unityType;
        }
        String str6 = str;
        if ((i & 2) != 0) {
            int i5 = i4 + 115;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            str2 = commissionResp.amount;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = commissionResp.unity;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = commissionResp.totalCommission;
            int i7 = ShareDataUIState + 25;
            component3 = i7 % 128;
            int i8 = i7 % 2;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = commissionResp.currency;
        }
        return commissionResp.copy(str6, str7, str8, str9, str5);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 39;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.unityType;
        int i5 = i2 + 31;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        String str;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 27;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.amount;
            int i4 = 66 / 0;
        } else {
            str = this.amount;
        }
        int i5 = i2 + 15;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 86 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 105;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.unity;
        int i4 = i2 + 103;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 113;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.totalCommission;
        int i4 = i2 + 37;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 45;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.currency;
        if (i3 != 0) {
            int i4 = 9 / 0;
        }
        return str;
    }

    public final CommissionResp copy(String unityType, String amount, String unity, String totalCommission, String currency) {
        int i = 2 % 2;
        CommissionResp commissionResp = new CommissionResp(unityType, amount, unity, totalCommission, currency);
        int i2 = component3 + 117;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return commissionResp;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r7 instanceof com.huawei.digitalpayment.common.theme.data.CommissionResp) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r7 = r2 + 39;
        com.huawei.digitalpayment.common.theme.data.CommissionResp.ShareDataUIState = r7 % 128;
        r7 = r7 % 2;
        r2 = r2 + 19;
        com.huawei.digitalpayment.common.theme.data.CommissionResp.ShareDataUIState = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        r7 = (com.huawei.digitalpayment.common.theme.data.CommissionResp) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.unityType, r7.unityType) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.amount, r7.amount) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.unity, r7.unity) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.totalCommission, r7.totalCommission) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.currency, r7.currency) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        r7 = com.huawei.digitalpayment.common.theme.data.CommissionResp.ShareDataUIState + 29;
        com.huawei.digitalpayment.common.theme.data.CommissionResp.component3 = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if ((r7 % 2) != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0071, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
    
        r7 = com.huawei.digitalpayment.common.theme.data.CommissionResp.ShareDataUIState + 3;
        com.huawei.digitalpayment.common.theme.data.CommissionResp.component3 = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007b, code lost:
    
        if ((r7 % 2) != 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007e, code lost:
    
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0081, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.common.theme.data.CommissionResp.ShareDataUIState
            int r1 = r1 + 13
            int r2 = r1 % 128
            com.huawei.digitalpayment.common.theme.data.CommissionResp.component3 = r2
            int r1 = r1 % r0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L16
            r1 = 78
            int r1 = r1 / r4
            if (r6 != r7) goto L19
            goto L18
        L16:
            if (r6 != r7) goto L19
        L18:
            return r3
        L19:
            boolean r1 = r7 instanceof com.huawei.digitalpayment.common.theme.data.CommissionResp
            if (r1 != 0) goto L2c
            int r7 = r2 + 39
            int r1 = r7 % 128
            com.huawei.digitalpayment.common.theme.data.CommissionResp.ShareDataUIState = r1
            int r7 = r7 % r0
            int r2 = r2 + 19
            int r7 = r2 % 128
            com.huawei.digitalpayment.common.theme.data.CommissionResp.ShareDataUIState = r7
            int r2 = r2 % r0
            return r4
        L2c:
            com.huawei.digitalpayment.common.theme.data.CommissionResp r7 = (com.huawei.digitalpayment.common.theme.data.CommissionResp) r7
            java.lang.String r1 = r6.unityType
            java.lang.String r2 = r7.unityType
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L39
            return r4
        L39:
            java.lang.String r1 = r6.amount
            java.lang.String r2 = r7.amount
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L44
            return r4
        L44:
            java.lang.String r1 = r6.unity
            java.lang.String r2 = r7.unity
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            r2 = 0
            if (r1 == 0) goto L72
            java.lang.String r1 = r6.totalCommission
            java.lang.String r5 = r7.totalCommission
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
            if (r1 != 0) goto L5a
            return r4
        L5a:
            java.lang.String r1 = r6.currency
            java.lang.String r7 = r7.currency
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r7)
            if (r7 != 0) goto L71
            int r7 = com.huawei.digitalpayment.common.theme.data.CommissionResp.ShareDataUIState
            int r7 = r7 + 29
            int r1 = r7 % 128
            com.huawei.digitalpayment.common.theme.data.CommissionResp.component3 = r1
            int r7 = r7 % r0
            if (r7 != 0) goto L70
            return r4
        L70:
            throw r2
        L71:
            return r3
        L72:
            int r7 = com.huawei.digitalpayment.common.theme.data.CommissionResp.ShareDataUIState
            int r7 = r7 + 3
            int r1 = r7 % 128
            com.huawei.digitalpayment.common.theme.data.CommissionResp.component3 = r1
            int r7 = r7 % r0
            if (r7 != 0) goto L7e
            return r4
        L7e:
            r2.hashCode()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.common.theme.data.CommissionResp.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.unityType;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.amount;
        if (str2 == null) {
            int i2 = component3 + 111;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
            int i4 = component3 + 73;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
        }
        String str3 = this.unity;
        if (str3 == null) {
            int i6 = ShareDataUIState + 37;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str3.hashCode();
        }
        String str4 = this.totalCommission;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.currency;
        return (((((((iHashCode3 * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode4) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CommissionResp(unityType=" + this.unityType + ", amount=" + this.amount + ", unity=" + this.unity + ", totalCommission=" + this.totalCommission + ", currency=" + this.currency + ")";
        int i2 = ShareDataUIState + 9;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
