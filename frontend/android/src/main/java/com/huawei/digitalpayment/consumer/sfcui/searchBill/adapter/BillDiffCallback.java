package com.huawei.digitalpayment.consumer.sfcui.searchBill.adapter;

import androidx.recyclerview.widget.DiffUtil;
import com.huawei.digitalpayment.checkout.resp.BillInfosResp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/searchBill/adapter/BillDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/huawei/digitalpayment/checkout/resp/BillInfosResp;", "<init>", "()V", "areItemsTheSame", "", "oldItem", "newItem", "areContentsTheSame", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BillDiffCallback extends DiffUtil.ItemCallback<BillInfosResp> {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;

    @Override
    public boolean areContentsTheSame(BillInfosResp billInfosResp, BillInfosResp billInfosResp2) {
        int i = 2 % 2;
        int i2 = copydefault + 47;
        component3 = i2 % 128;
        BillInfosResp billInfosResp3 = billInfosResp;
        BillInfosResp billInfosResp4 = billInfosResp2;
        if (i2 % 2 == 0) {
            return areContentsTheSame2(billInfosResp3, billInfosResp4);
        }
        areContentsTheSame2(billInfosResp3, billInfosResp4);
        throw null;
    }

    @Override
    public boolean areItemsTheSame(BillInfosResp billInfosResp, BillInfosResp billInfosResp2) {
        int i = 2 % 2;
        int i2 = copydefault + 43;
        component3 = i2 % 128;
        BillInfosResp billInfosResp3 = billInfosResp;
        BillInfosResp billInfosResp4 = billInfosResp2;
        if (i2 % 2 == 0) {
            return areItemsTheSame2(billInfosResp3, billInfosResp4);
        }
        int i3 = 2 / 0;
        return areItemsTheSame2(billInfosResp3, billInfosResp4);
    }

    public boolean areItemsTheSame2(BillInfosResp oldItem, BillInfosResp newItem) {
        int i = 2 % 2;
        int i2 = component3 + 35;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(oldItem, "");
            Intrinsics.checkNotNullParameter(newItem, "");
            Intrinsics.areEqual(oldItem.getBillId(), newItem.getBillId());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(oldItem, "");
        Intrinsics.checkNotNullParameter(newItem, "");
        if (!Intrinsics.areEqual(oldItem.getBillId(), newItem.getBillId()) || !Intrinsics.areEqual(oldItem.getMerchCode(), newItem.getMerchCode())) {
            return false;
        }
        int i3 = component3 + 97;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }

    public boolean areContentsTheSame2(BillInfosResp oldItem, BillInfosResp newItem) {
        int i = 2 % 2;
        int i2 = component3 + 113;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(oldItem, "");
        Intrinsics.checkNotNullParameter(newItem, "");
        boolean zAreEqual = Intrinsics.areEqual(oldItem, newItem);
        int i4 = component3 + 79;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 2 / 0;
        }
        return zAreEqual;
    }

    static {
        int i = 1 + 57;
        ShareDataUIState = i % 128;
        if (i % 2 != 0) {
            int i2 = 35 / 0;
        }
    }
}
