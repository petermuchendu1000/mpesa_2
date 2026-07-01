package com.huawei.digitalpayment.consumer.sfcui.profile.manageline.resp;

import com.alibaba.ariver.kernel.common.log.ConnectionLog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÇ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\f\u001a\u00020\rH×\u0001J\t\u0010\u000e\u001a\u00020\u000fH×\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/manageline/resp/UpdateKYC;", "", ConnectionLog.CONN_LOG_STATE_RESPONSE, "<init>", "(Ljava/lang/Object;)V", "getResponse", "()Ljava/lang/Object;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UpdateKYC {
    public static final int $stable = 8;
    private static int ShareDataUIState = 59 % 128;
    private static int component1 = 1;
    private static int component3;
    private static int copydefault;
    private final Object component2;

    public UpdateKYC(Object obj) {
        this.component2 = obj;
    }

    public final Object getResponse() {
        int i = 2 % 2;
        int i2 = component1 + 115;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        Object obj = this.component2;
        int i5 = i3 + 19;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return obj;
        }
        throw null;
    }

    static {
        if (59 % 2 == 0) {
            throw null;
        }
    }

    public static UpdateKYC copy$default(UpdateKYC updateKYC, Object obj, int i, Object obj2) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component3 + 63;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            obj = updateKYC.component2;
        }
        UpdateKYC updateKYCCopy = updateKYC.copy(obj);
        int i5 = component1 + 69;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return updateKYCCopy;
    }

    public final Object component1() {
        Object obj;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 13;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            obj = this.component2;
            int i4 = 40 / 0;
        } else {
            obj = this.component2;
        }
        int i5 = i2 + 67;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return obj;
    }

    public final UpdateKYC copy(Object response) {
        int i = 2 % 2;
        UpdateKYC updateKYC = new UpdateKYC(response);
        int i2 = component3 + 101;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return updateKYC;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateKYC)) {
            return false;
        }
        if (Intrinsics.areEqual(this.component2, ((UpdateKYC) other).component2)) {
            int i2 = component1 + 59;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = component3 + 71;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        r3 = r1.hashCode();
        r1 = com.huawei.digitalpayment.consumer.sfcui.profile.manageline.resp.UpdateKYC.component1 + 43;
        com.huawei.digitalpayment.consumer.sfcui.profile.manageline.resp.UpdateKYC.component3 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r2 = r2 + 79;
        com.huawei.digitalpayment.consumer.sfcui.profile.manageline.resp.UpdateKYC.component1 = r2 % 128;
        r2 = r2 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.manageline.resp.UpdateKYC.component1
            int r1 = r1 + 33
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.manageline.resp.UpdateKYC.component3 = r2
            int r1 = r1 % r0
            r3 = 0
            if (r1 == 0) goto L17
            java.lang.Object r1 = r5.component2
            r4 = 35
            int r4 = r4 / r3
            if (r1 != 0) goto L23
            goto L1b
        L17:
            java.lang.Object r1 = r5.component2
            if (r1 != 0) goto L23
        L1b:
            int r2 = r2 + 79
            int r1 = r2 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.manageline.resp.UpdateKYC.component1 = r1
            int r2 = r2 % r0
            goto L30
        L23:
            int r3 = r1.hashCode()
            int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.manageline.resp.UpdateKYC.component1
            int r1 = r1 + 43
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.manageline.resp.UpdateKYC.component3 = r2
            int r1 = r1 % r0
        L30:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.manageline.resp.UpdateKYC.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "UpdateKYC(response=" + this.component2 + ")";
        int i2 = component1 + 77;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
