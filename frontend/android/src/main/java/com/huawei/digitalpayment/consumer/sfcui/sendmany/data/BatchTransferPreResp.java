package com.huawei.digitalpayment.consumer.sfcui.sendmany.data;

import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH×\u0003J\t\u0010\u000f\u001a\u00020\u0010H×\u0001J\t\u0010\u0011\u001a\u00020\u0003H×\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sendmany/data/BatchTransferPreResp;", "Lcom/huawei/http/BaseResp;", "batchNo", "", "<init>", "(Ljava/lang/String;)V", "getBatchNo", "()Ljava/lang/String;", "setBatchNo", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BatchTransferPreResp extends BaseResp {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component1 = 35 % 128;
    private static int component2 = 1;
    private static int component3;
    private String batchNo;

    /* JADX WARN: Illegal instructions before constructor call */
    public BatchTransferPreResp(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component2;
            int i3 = i2 + 71;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 39;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            str = "";
        }
        this(str);
    }

    public final String getBatchNo() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 103;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.batchNo;
        int i5 = i2 + 45;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setBatchNo(String str) {
        int i = 2 % 2;
        int i2 = component3 + 73;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.batchNo = str;
        int i5 = i3 + 39;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 3 / 0;
        }
    }

    public BatchTransferPreResp(String str) {
        this.batchNo = str;
    }

    static {
        if (35 % 2 == 0) {
            int i = 5 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BatchTransferPreResp() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static BatchTransferPreResp copy$default(BatchTransferPreResp batchTransferPreResp, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2;
        int i4 = i3 + 71;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 23;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            str = batchTransferPreResp.batchNo;
        }
        return batchTransferPreResp.copy(str);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 19;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.batchNo;
        int i5 = i3 + 13;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final BatchTransferPreResp copy(String batchNo) {
        int i = 2 % 2;
        BatchTransferPreResp batchTransferPreResp = new BatchTransferPreResp(batchNo);
        int i2 = component3 + 7;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return batchTransferPreResp;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 25;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            int i5 = i2 + 21;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof BatchTransferPreResp) || !Intrinsics.areEqual(this.batchNo, ((BatchTransferPreResp) other).batchNo)) {
            return false;
        }
        int i7 = component3 + 111;
        component2 = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        String str = this.batchNo;
        if (str == null) {
            int i2 = component2 + 21;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return 0;
        }
        int iHashCode = str.hashCode();
        int i4 = component2 + 87;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BatchTransferPreResp(batchNo=" + this.batchNo + ")";
        int i2 = component2 + 41;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
