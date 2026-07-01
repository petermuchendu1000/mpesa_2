package com.huawei.digitalpayment.consumer.sfcui.statement.resp;

import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÇ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\t\u0010\u0018\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/MpesaStatementsGroupResp;", "", TinyAppLogUtil.TINY_APP_STANDARD_CATEGORY, "", "cateGoryDisPlay", "dataList", "", "Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/MpesaStatementTransactionResp;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getCategory", "()Ljava/lang/String;", "getCateGoryDisPlay", "getDataList", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MpesaStatementsGroupResp {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component2 = 25 % 128;
    private static int equals = 1;
    private static int getAsAtTimestamp;
    private final List<MpesaStatementTransactionResp> component1;
    private final String component3;
    private final String copydefault;

    public MpesaStatementsGroupResp(String str, String str2, List<MpesaStatementTransactionResp> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = str;
        this.component3 = str2;
        this.component1 = list;
    }

    public final String getCategory() {
        String str;
        int i = 2 % 2;
        int i2 = equals + 101;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        if (i2 % 2 != 0) {
            str = this.copydefault;
            int i4 = 59 / 0;
        } else {
            str = this.copydefault;
        }
        int i5 = i3 + 9;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getCateGoryDisPlay() {
        int i = 2 % 2;
        int i2 = equals + 15;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        int i5 = i3 + 3;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<MpesaStatementTransactionResp> getDataList() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 61;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        List<MpesaStatementTransactionResp> list = this.component1;
        int i5 = i3 + 61;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 55 / 0;
        }
        return list;
    }

    static {
        int i = 25 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static MpesaStatementsGroupResp copy$default(MpesaStatementsGroupResp mpesaStatementsGroupResp, String str, String str2, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp;
        int i4 = i3 + 39;
        equals = i4 % 128;
        Object obj2 = null;
        if (i4 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            int i5 = i3 + 7;
            equals = i5 % 128;
            if (i5 % 2 == 0) {
                String str3 = mpesaStatementsGroupResp.copydefault;
                obj2.hashCode();
                throw null;
            }
            str = mpesaStatementsGroupResp.copydefault;
        }
        if ((i & 2) != 0) {
            int i6 = i3 + 45;
            equals = i6 % 128;
            if (i6 % 2 == 0) {
                String str4 = mpesaStatementsGroupResp.component3;
                obj2.hashCode();
                throw null;
            }
            str2 = mpesaStatementsGroupResp.component3;
        }
        if ((i & 4) != 0) {
            list = mpesaStatementsGroupResp.component1;
        }
        return mpesaStatementsGroupResp.copy(str, str2, list);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 95;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            return this.copydefault;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = equals + 49;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        int i5 = i3 + 13;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<MpesaStatementTransactionResp> component3() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 85;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        List<MpesaStatementTransactionResp> list = this.component1;
        int i5 = i2 + 47;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final MpesaStatementsGroupResp copy(String category, String cateGoryDisPlay, List<MpesaStatementTransactionResp> dataList) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(category, "");
        Intrinsics.checkNotNullParameter(cateGoryDisPlay, "");
        Intrinsics.checkNotNullParameter(dataList, "");
        MpesaStatementsGroupResp mpesaStatementsGroupResp = new MpesaStatementsGroupResp(category, cateGoryDisPlay, dataList);
        int i2 = getAsAtTimestamp + 71;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            return mpesaStatementsGroupResp;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof com.huawei.digitalpayment.consumer.sfcui.statement.resp.MpesaStatementsGroupResp) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r6 = (com.huawei.digitalpayment.consumer.sfcui.statement.resp.MpesaStatementsGroupResp) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.copydefault, r6.copydefault) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfcui.statement.resp.MpesaStatementsGroupResp.equals + 47;
        com.huawei.digitalpayment.consumer.sfcui.statement.resp.MpesaStatementsGroupResp.getAsAtTimestamp = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.component3, r6.component3) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.component1, r6.component1) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        r2 = r2 + 7;
        com.huawei.digitalpayment.consumer.sfcui.statement.resp.MpesaStatementsGroupResp.getAsAtTimestamp = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        return false;
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
            int r1 = com.huawei.digitalpayment.consumer.sfcui.statement.resp.MpesaStatementsGroupResp.getAsAtTimestamp
            int r1 = r1 + 35
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.statement.resp.MpesaStatementsGroupResp.equals = r2
            int r1 = r1 % r0
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L16
            r1 = 9
            int r1 = r1 / r4
            if (r5 != r6) goto L19
            goto L18
        L16:
            if (r5 != r6) goto L19
        L18:
            return r3
        L19:
            boolean r1 = r6 instanceof com.huawei.digitalpayment.consumer.sfcui.statement.resp.MpesaStatementsGroupResp
            if (r1 == 0) goto L4a
            com.huawei.digitalpayment.consumer.sfcui.statement.resp.MpesaStatementsGroupResp r6 = (com.huawei.digitalpayment.consumer.sfcui.statement.resp.MpesaStatementsGroupResp) r6
            java.lang.String r1 = r5.copydefault
            java.lang.String r2 = r6.copydefault
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L33
            int r6 = com.huawei.digitalpayment.consumer.sfcui.statement.resp.MpesaStatementsGroupResp.equals
            int r6 = r6 + 47
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.statement.resp.MpesaStatementsGroupResp.getAsAtTimestamp = r1
            int r6 = r6 % r0
            return r4
        L33:
            java.lang.String r0 = r5.component3
            java.lang.String r1 = r6.component3
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 != 0) goto L3e
            return r4
        L3e:
            java.util.List<com.huawei.digitalpayment.consumer.sfcui.statement.resp.MpesaStatementTransactionResp> r0 = r5.component1
            java.util.List<com.huawei.digitalpayment.consumer.sfcui.statement.resp.MpesaStatementTransactionResp> r6 = r6.component1
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r6)
            if (r6 != 0) goto L49
            return r4
        L49:
            return r3
        L4a:
            int r2 = r2 + 7
            int r6 = r2 % 128
            com.huawei.digitalpayment.consumer.sfcui.statement.resp.MpesaStatementsGroupResp.getAsAtTimestamp = r6
            int r2 = r2 % r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.statement.resp.MpesaStatementsGroupResp.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 99;
        equals = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.copydefault.hashCode() * 31) + this.component3.hashCode()) * 31) + this.component1.hashCode();
        int i4 = getAsAtTimestamp + 37;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MpesaStatementsGroupResp(category=" + this.copydefault + ", cateGoryDisPlay=" + this.component3 + ", dataList=" + this.component1 + ")";
        int i2 = getAsAtTimestamp + 69;
        equals = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
