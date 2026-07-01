package com.huawei.digitalpayment.consumer.subsui.ui.promoMessages;

import androidx.recyclerview.widget.RecyclerView;
import com.huawei.digitalpayment.consumer.subsui.databinding.ItemPromoMessagesBinding;
import com.huawei.digitalpayment.consumer.subsui.resp.promoMessages.PromoBlockedSendersResp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/subsui/ui/promoMessages/PromoMessagesViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/huawei/digitalpayment/consumer/subsui/databinding/ItemPromoMessagesBinding;", "<init>", "(Lcom/huawei/digitalpayment/consumer/subsui/databinding/ItemPromoMessagesBinding;)V", "getBinding", "()Lcom/huawei/digitalpayment/consumer/subsui/databinding/ItemPromoMessagesBinding;", "bind", "", "item", "Lcom/huawei/digitalpayment/consumer/subsui/resp/promoMessages/PromoBlockedSendersResp;", "ConsumerSfcMySubscriptionsUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PromoMessagesViewHolder extends RecyclerView.ViewHolder {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;
    private final ItemPromoMessagesBinding component1;

    public final ItemPromoMessagesBinding getBinding() {
        int i = 2 % 2;
        int i2 = component3 + 23;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component1;
        }
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromoMessagesViewHolder(ItemPromoMessagesBinding itemPromoMessagesBinding) {
        super(itemPromoMessagesBinding.getRoot());
        Intrinsics.checkNotNullParameter(itemPromoMessagesBinding, "");
        this.component1 = itemPromoMessagesBinding;
    }

    public final void bind(PromoBlockedSendersResp item) {
        int i = 2 % 2;
        int i2 = component3 + 69;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(item, "");
        this.component1.tvTitle.setText(item.getValue());
        this.component1.executePendingBindings();
        int i4 = component3 + 99;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        int i = 1 + 119;
        component2 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
