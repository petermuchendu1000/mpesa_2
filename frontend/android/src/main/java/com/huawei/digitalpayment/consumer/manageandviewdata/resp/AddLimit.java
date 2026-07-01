package com.huawei.digitalpayment.consumer.manageandviewdata.resp;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/consumer/manageandviewdata/resp/AddLimit;", "", "msisdn", "", "type", "limit", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMsisdn", "()Ljava/lang/String;", "getType", "getLimit", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcManageAndViewData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AddLimit {
    public static final int $stable = 0;
    private static int component2 = 1;
    private static int copy = 0;
    private static int copydefault = 0;
    private static int getRequestBeneficiariesState = 1;

    @SerializedName("msisdn")
    private final String ShareDataUIState;

    @SerializedName("limitValue")
    private final String component1;

    @SerializedName("limitType")
    private final String component3;

    public AddLimit(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.ShareDataUIState = str;
        this.component3 = str2;
        this.component1 = str3;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 61;
        copy = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.ShareDataUIState;
        int i4 = i2 + 71;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getType() {
        int i = 2 % 2;
        int i2 = copy + 17;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.component3;
        if (i3 == 0) {
            int i4 = 43 / 0;
        }
        return str;
    }

    public final String getLimit() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 79;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component1;
        int i5 = i2 + 85;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 63 / 0;
        }
        return str;
    }

    static {
        int i = 1 + 39;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public static AddLimit copy$default(AddLimit addLimit, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState;
        int i4 = i3 + 113;
        copy = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 111;
            copy = i6 % 128;
            if (i6 % 2 != 0) {
                String str4 = addLimit.ShareDataUIState;
                throw null;
            }
            str = addLimit.ShareDataUIState;
        }
        if ((i & 2) != 0) {
            int i7 = copy + 113;
            getRequestBeneficiariesState = i7 % 128;
            if (i7 % 2 == 0) {
                String str5 = addLimit.component3;
                throw null;
            }
            str2 = addLimit.component3;
        }
        if ((i & 4) != 0) {
            str3 = addLimit.component1;
        }
        return addLimit.copy(str, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 3;
        int i3 = i2 % 128;
        copy = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.ShareDataUIState;
        int i4 = i3 + 23;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copy + 81;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.component3;
        int i4 = i3 + 85;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 73;
        copy = i2 % 128;
        int i3 = i2 % 2;
        String str = this.component1;
        if (i3 != 0) {
            int i4 = 84 / 0;
        }
        return str;
    }

    public final AddLimit copy(String msisdn, String type, String limit) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(msisdn, "");
        Intrinsics.checkNotNullParameter(type, "");
        Intrinsics.checkNotNullParameter(limit, "");
        AddLimit addLimit = new AddLimit(msisdn, type, limit);
        int i2 = getRequestBeneficiariesState + 5;
        copy = i2 % 128;
        int i3 = i2 % 2;
        return addLimit;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof com.huawei.digitalpayment.consumer.manageandviewdata.resp.AddLimit) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r1 = r1 + 27;
        com.huawei.digitalpayment.consumer.manageandviewdata.resp.AddLimit.getRequestBeneficiariesState = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r6 = (com.huawei.digitalpayment.consumer.manageandviewdata.resp.AddLimit) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.ShareDataUIState, r6.ShareDataUIState) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.component3, r6.component3) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.manageandviewdata.resp.AddLimit.getRequestBeneficiariesState + 119;
        com.huawei.digitalpayment.consumer.manageandviewdata.resp.AddLimit.copy = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.component1, r6.component1) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.manageandviewdata.resp.AddLimit.copy + 57;
        com.huawei.digitalpayment.consumer.manageandviewdata.resp.AddLimit.getRequestBeneficiariesState = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
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
            int r1 = com.huawei.digitalpayment.consumer.manageandviewdata.resp.AddLimit.copy
            int r2 = r1 + 43
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.manageandviewdata.resp.AddLimit.getRequestBeneficiariesState = r3
            int r2 = r2 % r0
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L16
            r2 = 92
            int r2 = r2 / r4
            if (r5 != r6) goto L19
            goto L18
        L16:
            if (r5 != r6) goto L19
        L18:
            return r3
        L19:
            boolean r2 = r6 instanceof com.huawei.digitalpayment.consumer.manageandviewdata.resp.AddLimit
            if (r2 != 0) goto L25
            int r1 = r1 + 27
            int r6 = r1 % 128
            com.huawei.digitalpayment.consumer.manageandviewdata.resp.AddLimit.getRequestBeneficiariesState = r6
            int r1 = r1 % r0
            return r4
        L25:
            com.huawei.digitalpayment.consumer.manageandviewdata.resp.AddLimit r6 = (com.huawei.digitalpayment.consumer.manageandviewdata.resp.AddLimit) r6
            java.lang.String r1 = r5.ShareDataUIState
            java.lang.String r2 = r6.ShareDataUIState
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L32
            return r4
        L32:
            java.lang.String r1 = r5.component3
            java.lang.String r2 = r6.component3
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L46
            int r6 = com.huawei.digitalpayment.consumer.manageandviewdata.resp.AddLimit.getRequestBeneficiariesState
            int r6 = r6 + 119
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.manageandviewdata.resp.AddLimit.copy = r1
            int r6 = r6 % r0
            return r4
        L46:
            java.lang.String r1 = r5.component1
            java.lang.String r6 = r6.component1
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r6)
            if (r6 != 0) goto L51
            return r4
        L51:
            int r6 = com.huawei.digitalpayment.consumer.manageandviewdata.resp.AddLimit.copy
            int r6 = r6 + 57
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.manageandviewdata.resp.AddLimit.getRequestBeneficiariesState = r1
            int r6 = r6 % r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.manageandviewdata.resp.AddLimit.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copy + 1;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.ShareDataUIState.hashCode() * 31) + this.component3.hashCode()) * 31) + this.component1.hashCode();
        int i4 = copy + 5;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AddLimit(msisdn=" + this.ShareDataUIState + ", type=" + this.component3 + ", limit=" + this.component1 + ")";
        int i2 = getRequestBeneficiariesState + 83;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 30 / 0;
        }
        return str;
    }
}
