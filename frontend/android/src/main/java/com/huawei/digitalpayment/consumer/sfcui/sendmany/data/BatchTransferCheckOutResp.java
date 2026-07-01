package com.huawei.digitalpayment.consumer.sfcui.sendmany.data;

import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH×\u0003J\t\u0010\u000f\u001a\u00020\u0010H×\u0001J\t\u0010\u0011\u001a\u00020\u0003H×\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sendmany/data/BatchTransferCheckOutResp;", "Lcom/huawei/http/BaseResp;", "batchNo", "", "<init>", "(Ljava/lang/String;)V", "getBatchNo", "()Ljava/lang/String;", "setBatchNo", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BatchTransferCheckOutResp extends BaseResp {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 61 % 128;
    private String batchNo;

    /* JADX WARN: Illegal instructions before constructor call */
    public BatchTransferCheckOutResp(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component2 + 101;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i4 = i3 + 51;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
            str = "";
        }
        this(str);
    }

    public final String getBatchNo() {
        int i = 2 % 2;
        int i2 = component2 + 93;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.batchNo;
        int i4 = i3 + 19;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final void setBatchNo(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 97;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.batchNo = str;
        if (i3 == 0) {
            int i4 = 75 / 0;
        }
    }

    public BatchTransferCheckOutResp(String str) {
        this.batchNo = str;
    }

    static {
        if (61 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BatchTransferCheckOutResp() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static BatchTransferCheckOutResp copy$default(BatchTransferCheckOutResp batchTransferCheckOutResp, String str, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = ShareDataUIState + 83;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                String str2 = batchTransferCheckOutResp.batchNo;
                throw null;
            }
            str = batchTransferCheckOutResp.batchNo;
        }
        BatchTransferCheckOutResp batchTransferCheckOutRespCopy = batchTransferCheckOutResp.copy(str);
        int i4 = ShareDataUIState + 109;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 94 / 0;
        }
        return batchTransferCheckOutRespCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 69;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.batchNo;
        int i5 = i2 + 37;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final BatchTransferCheckOutResp copy(String batchNo) {
        int i = 2 % 2;
        BatchTransferCheckOutResp batchTransferCheckOutResp = new BatchTransferCheckOutResp(batchNo);
        int i2 = component2 + 45;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return batchTransferCheckOutResp;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = ShareDataUIState + 77;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (other instanceof BatchTransferCheckOutResp) {
            return Intrinsics.areEqual(this.batchNo, ((BatchTransferCheckOutResp) other).batchNo);
        }
        int i4 = ShareDataUIState + 51;
        int i5 = i4 % 128;
        component2 = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 41;
        ShareDataUIState = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 75 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        String str = this.batchNo;
        if (str == null) {
            int i2 = ShareDataUIState + 117;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return 0;
        }
        int iHashCode = str.hashCode();
        int i4 = component2 + 73;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BatchTransferCheckOutResp(batchNo=" + this.batchNo + ")";
        int i2 = component2 + 97;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
