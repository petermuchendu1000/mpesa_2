package com.huawei.digitalpayment.checkout.resp;

import com.huawei.http.BaseResp;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÇ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H×\u0003J\t\u0010\u0018\u001a\u00020\u0019H×\u0001J\t\u0010\u001a\u001a\u00020\u0006H×\u0001R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/huawei/digitalpayment/checkout/resp/BatchTransferQueryPreOrderResp;", "Lcom/huawei/http/BaseResp;", "orderDetails", "", "Lcom/huawei/digitalpayment/checkout/resp/OrderDetailsBean;", "result", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getOrderDetails", "()Ljava/util/List;", "setOrderDetails", "(Ljava/util/List;)V", "getResult", "()Ljava/lang/String;", "setResult", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerCheckOutUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BatchTransferQueryPreOrderResp extends BaseResp {
    public static final int $stable = 8;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 27 % 128;
    private static int copydefault = 1;
    private List<OrderDetailsBean> orderDetails;
    private String result;

    public BatchTransferQueryPreOrderResp(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            list = new ArrayList();
            int i2 = component1 + 3;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 5 / 2;
            } else {
                int i4 = 2 % 2;
            }
        }
        if ((i & 2) != 0) {
            int i5 = component1 + 55;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            str = "";
        }
        this(list, str);
    }

    public final List<OrderDetailsBean> getOrderDetails() {
        int i = 2 % 2;
        int i2 = copydefault + 53;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.orderDetails;
        }
        throw null;
    }

    public final void setOrderDetails(List<OrderDetailsBean> list) {
        int i = 2 % 2;
        int i2 = component1 + 1;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        this.orderDetails = list;
        int i4 = component1 + 21;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getResult() {
        int i = 2 % 2;
        int i2 = copydefault + 55;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.result;
        int i5 = i3 + 77;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final void setResult(String str) {
        int i = 2 % 2;
        int i2 = component1 + 61;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.result = str;
        int i5 = i3 + 31;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public BatchTransferQueryPreOrderResp(List<OrderDetailsBean> list, String str) {
        Intrinsics.checkNotNullParameter(list, "");
        this.orderDetails = list;
        this.result = str;
    }

    static {
        if (27 % 2 == 0) {
            int i = 60 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BatchTransferQueryPreOrderResp() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static BatchTransferQueryPreOrderResp copy$default(BatchTransferQueryPreOrderResp batchTransferQueryPreOrderResp, List list, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault + 81;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 1) != 0) {
            list = batchTransferQueryPreOrderResp.orderDetails;
        }
        if ((i & 2) != 0) {
            str = batchTransferQueryPreOrderResp.result;
        }
        BatchTransferQueryPreOrderResp batchTransferQueryPreOrderRespCopy = batchTransferQueryPreOrderResp.copy(list, str);
        int i5 = component1 + 47;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return batchTransferQueryPreOrderRespCopy;
    }

    public final List<OrderDetailsBean> component1() {
        int i = 2 % 2;
        int i2 = component1 + 121;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        List<OrderDetailsBean> list = this.orderDetails;
        if (i3 == 0) {
            int i4 = 11 / 0;
        }
        return list;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault + 85;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.result;
        int i5 = i3 + 111;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final BatchTransferQueryPreOrderResp copy(List<OrderDetailsBean> orderDetails, String result) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(orderDetails, "");
        BatchTransferQueryPreOrderResp batchTransferQueryPreOrderResp = new BatchTransferQueryPreOrderResp(orderDetails, result);
        int i2 = copydefault + 123;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 88 / 0;
        }
        return batchTransferQueryPreOrderResp;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        Object obj = null;
        if (this == other) {
            int i2 = component1 + 73;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                return true;
            }
            obj.hashCode();
            throw null;
        }
        if (!(other instanceof BatchTransferQueryPreOrderResp)) {
            return false;
        }
        BatchTransferQueryPreOrderResp batchTransferQueryPreOrderResp = (BatchTransferQueryPreOrderResp) other;
        if (!Intrinsics.areEqual(this.orderDetails, batchTransferQueryPreOrderResp.orderDetails)) {
            int i3 = copydefault + 91;
            component1 = i3 % 128;
            if (i3 % 2 == 0) {
                return false;
            }
            obj.hashCode();
            throw null;
        }
        if (!Intrinsics.areEqual(this.result, batchTransferQueryPreOrderResp.result)) {
            int i4 = component1 + 59;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = copydefault + 23;
        component1 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 49 / 0;
        }
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 65;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.orderDetails.hashCode();
        String str = this.result;
        int iHashCode2 = (iHashCode * 31) + (str == null ? 0 : str.hashCode());
        int i4 = component1 + 89;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BatchTransferQueryPreOrderResp(orderDetails=" + this.orderDetails + ", result=" + this.result + ")";
        int i2 = copydefault + 33;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
