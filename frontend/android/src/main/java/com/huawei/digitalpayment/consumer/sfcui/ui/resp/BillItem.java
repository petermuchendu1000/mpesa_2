package com.huawei.digitalpayment.consumer.sfcui.ui.resp;

import com.huawei.digitalpayment.checkout.resp.BillInfosResp;
import com.huawei.http.BaseResp;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\u000b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH×\u0003J\t\u0010\u0010\u001a\u00020\u0011H×\u0001J\t\u0010\u0012\u001a\u00020\u0013H×\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/resp/BillItem;", "Lcom/huawei/http/BaseResp;", "billInfos", "", "Lcom/huawei/digitalpayment/checkout/resp/BillInfosResp;", "<init>", "(Ljava/util/List;)V", "getBillInfos", "()Ljava/util/List;", "setBillInfos", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BillItem extends BaseResp {
    public static final int $stable = 8;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;
    private List<BillInfosResp> billInfos;

    /* JADX WARN: Illegal instructions before constructor call */
    public BillItem(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component1 + 9;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 123;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 5 % 4;
            } else {
                int i7 = 2 % 2;
            }
            list = null;
        }
        this(list);
    }

    public final List<BillInfosResp> getBillInfos() {
        int i = 2 % 2;
        int i2 = component2 + 111;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        List<BillInfosResp> list = this.billInfos;
        int i5 = i3 + 53;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public final void setBillInfos(List<BillInfosResp> list) {
        int i = 2 % 2;
        int i2 = component1 + 41;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.billInfos = list;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public BillItem(List<BillInfosResp> list) {
        this.billInfos = list;
    }

    static {
        int i = 1 + 27;
        component3 = i % 128;
        if (i % 2 != 0) {
            int i2 = 18 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BillItem() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static BillItem copy$default(BillItem billItem, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1 + 61;
        int i4 = i3 % 128;
        component2 = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 109;
            component1 = i6 % 128;
            if (i6 % 2 == 0) {
                List<BillInfosResp> list2 = billItem.billInfos;
                throw null;
            }
            list = billItem.billInfos;
        }
        return billItem.copy(list);
    }

    public final List<BillInfosResp> component1() {
        int i = 2 % 2;
        int i2 = component2 + 79;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        List<BillInfosResp> list = this.billInfos;
        if (i3 == 0) {
            int i4 = 50 / 0;
        }
        return list;
    }

    public final BillItem copy(List<BillInfosResp> billInfos) {
        int i = 2 % 2;
        BillItem billItem = new BillItem(billInfos);
        int i2 = component1 + 29;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return billItem;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 79;
        int i4 = i3 % 128;
        component1 = i4;
        int i5 = i3 % 2;
        if (this == other) {
            int i6 = i4 + 21;
            component2 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 96 / 0;
            }
            return true;
        }
        if (other instanceof BillItem) {
            return Intrinsics.areEqual(this.billInfos, ((BillItem) other).billInfos);
        }
        int i8 = i2 + 1;
        component1 = i8 % 128;
        if (i8 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        List<BillInfosResp> list = this.billInfos;
        if (list == null) {
            int i2 = component2 + 95;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = list.hashCode();
        }
        int i4 = component2 + 101;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BillItem(billInfos=" + this.billInfos + ")";
        int i2 = component2 + 19;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
