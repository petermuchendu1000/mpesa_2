package com.huawei.digitalpayment.consumer.sfcui.costcalculator;

import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0018\u001a\u00020\u0006H×\u0001J\t\u0010\u0019\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/LipaCostResult;", "", "merchantName", "", KeysConstants.SHORT_CODE, "amount", "", "fee", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getMerchantName", "()Ljava/lang/String;", "getShortCode", "getAmount", "()I", "getFee", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LipaCostResult {
    public static final int $stable = 0;
    private static int component2 = 0;
    private static int equals = 1;
    private static int getAsAtTimestamp = 121 % 128;
    private static int getRequestBeneficiariesState;
    private final int ShareDataUIState;
    private final String component1;
    private final String component3;
    private final String copydefault;

    public LipaCostResult(String str, String str2, int i, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.copydefault = str;
        this.component3 = str2;
        this.ShareDataUIState = i;
        this.component1 = str3;
    }

    public final String getMerchantName() {
        int i = 2 % 2;
        int i2 = equals + 35;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        String str = this.copydefault;
        int i5 = i3 + 75;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getShortCode() {
        String str;
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 81;
        int i3 = i2 % 128;
        equals = i3;
        if (i2 % 2 == 0) {
            str = this.component3;
            int i4 = 2 / 0;
        } else {
            str = this.component3;
        }
        int i5 = i3 + 57;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getAmount() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 123;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.ShareDataUIState;
        int i6 = i2 + 19;
        getRequestBeneficiariesState = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 8 / 0;
        }
        return i5;
    }

    public final String getFee() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 59;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component1;
        int i5 = i2 + 81;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = 121 % 2;
    }

    public static LipaCostResult copy$default(LipaCostResult lipaCostResult, String str, String str2, int i, String str3, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            str = lipaCostResult.copydefault;
        }
        if ((i2 & 2) != 0) {
            int i4 = getRequestBeneficiariesState + 3;
            equals = i4 % 128;
            int i5 = i4 % 2;
            str2 = lipaCostResult.component3;
        }
        if ((i2 & 4) != 0) {
            i = lipaCostResult.ShareDataUIState;
            int i6 = equals + 67;
            getRequestBeneficiariesState = i6 % 128;
            int i7 = i6 % 2;
        }
        if ((i2 & 8) != 0) {
            int i8 = equals + 29;
            getRequestBeneficiariesState = i8 % 128;
            if (i8 % 2 != 0) {
                String str4 = lipaCostResult.component1;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str3 = lipaCostResult.component1;
        }
        return lipaCostResult.copy(str, str2, i, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = equals + 71;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        String str = this.copydefault;
        int i5 = i3 + 31;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 8 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 27;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component3;
        int i5 = i2 + 11;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int component3() {
        int i;
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 89;
        int i4 = i3 % 128;
        equals = i4;
        if (i3 % 2 == 0) {
            i = this.ShareDataUIState;
            int i5 = 63 / 0;
        } else {
            i = this.ShareDataUIState;
        }
        int i6 = i4 + 49;
        getRequestBeneficiariesState = i6 % 128;
        if (i6 % 2 == 0) {
            return i;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = equals + 5;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final LipaCostResult copy(String merchantName, String shortCode, int amount, String fee) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(merchantName, "");
        Intrinsics.checkNotNullParameter(shortCode, "");
        Intrinsics.checkNotNullParameter(fee, "");
        LipaCostResult lipaCostResult = new LipaCostResult(merchantName, shortCode, amount, fee);
        int i2 = getRequestBeneficiariesState + 125;
        equals = i2 % 128;
        int i3 = i2 % 2;
        return lipaCostResult;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if ((r6 instanceof com.huawei.digitalpayment.consumer.sfcui.costcalculator.LipaCostResult) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        r2 = r2 + 67;
        com.huawei.digitalpayment.consumer.sfcui.costcalculator.LipaCostResult.equals = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        r6 = (com.huawei.digitalpayment.consumer.sfcui.costcalculator.LipaCostResult) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.copydefault, r6.copydefault) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.component3, r6.component3) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (r5.ShareDataUIState == r6.ShareDataUIState) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfcui.costcalculator.LipaCostResult.equals + 9;
        com.huawei.digitalpayment.consumer.sfcui.costcalculator.LipaCostResult.getRequestBeneficiariesState = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.component1, r6.component1) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r2 = r2 + 15;
        com.huawei.digitalpayment.consumer.sfcui.costcalculator.LipaCostResult.equals = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.costcalculator.LipaCostResult.equals
            int r1 = r1 + 111
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.costcalculator.LipaCostResult.getRequestBeneficiariesState = r2
            int r1 = r1 % r0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L16
            r1 = 86
            int r1 = r1 / r4
            if (r5 != r6) goto L20
            goto L18
        L16:
            if (r5 != r6) goto L20
        L18:
            int r2 = r2 + 15
            int r6 = r2 % 128
            com.huawei.digitalpayment.consumer.sfcui.costcalculator.LipaCostResult.equals = r6
            int r2 = r2 % r0
            return r3
        L20:
            boolean r1 = r6 instanceof com.huawei.digitalpayment.consumer.sfcui.costcalculator.LipaCostResult
            if (r1 != 0) goto L2c
            int r2 = r2 + 67
            int r6 = r2 % 128
            com.huawei.digitalpayment.consumer.sfcui.costcalculator.LipaCostResult.equals = r6
            int r2 = r2 % r0
            return r4
        L2c:
            com.huawei.digitalpayment.consumer.sfcui.costcalculator.LipaCostResult r6 = (com.huawei.digitalpayment.consumer.sfcui.costcalculator.LipaCostResult) r6
            java.lang.String r1 = r5.copydefault
            java.lang.String r2 = r6.copydefault
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L39
            return r4
        L39:
            java.lang.String r1 = r5.component3
            java.lang.String r2 = r6.component3
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L44
            return r4
        L44:
            int r1 = r5.ShareDataUIState
            int r2 = r6.ShareDataUIState
            if (r1 == r2) goto L54
            int r6 = com.huawei.digitalpayment.consumer.sfcui.costcalculator.LipaCostResult.equals
            int r6 = r6 + 9
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.costcalculator.LipaCostResult.getRequestBeneficiariesState = r1
            int r6 = r6 % r0
            return r4
        L54:
            java.lang.String r0 = r5.component1
            java.lang.String r6 = r6.component1
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r6)
            if (r6 != 0) goto L5f
            return r4
        L5f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.costcalculator.LipaCostResult.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 9;
        equals = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((this.copydefault.hashCode() * 31) + this.component3.hashCode()) * 31) + Integer.hashCode(this.ShareDataUIState)) * 31) + this.component1.hashCode();
        int i4 = equals + 27;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 72 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LipaCostResult(merchantName=" + this.copydefault + ", shortCode=" + this.component3 + ", amount=" + this.ShareDataUIState + ", fee=" + this.component1 + ")";
        int i2 = equals + 13;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
