package com.huawei.digitalpayment.consumer.sfcui.sendmany.ui.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.huawei.digitalpayment.checkout.resp.OrderDetailsBean;
import com.huawei.digitalpayment.consumer.sfc.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0014¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sendmany/ui/adapter/SendManyFailedAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/huawei/digitalpayment/checkout/resp/OrderDetailsBean;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "<init>", "()V", "convert", "", "holder", "item", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SendManyFailedAdapter extends BaseQuickAdapter<OrderDetailsBean, BaseViewHolder> {
    public static final int $stable = 0;
    private static int ShareDataUIState = 23 % 128;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;

    @Override
    public void convert(BaseViewHolder baseViewHolder, OrderDetailsBean orderDetailsBean) {
        int i = 2 % 2;
        int i2 = component2 + 35;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        convert2(baseViewHolder, orderDetailsBean);
        if (i3 != 0) {
            throw null;
        }
        int i4 = component2 + 29;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public SendManyFailedAdapter() {
        super(R.layout.item_send_to_many_failed, null, 2, null);
    }

    protected void convert2(BaseViewHolder holder, OrderDetailsBean item) {
        int i = 2 % 2;
        int i2 = component2 + 15;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(holder, "");
        Intrinsics.checkNotNullParameter(item, "");
        holder.setText(R.id.name, item.getNameDisplay());
        holder.setText(R.id.amount, item.getAmountDisplay());
        int i4 = component2 + 109;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        if (23 % 2 == 0) {
            throw null;
        }
    }
}
