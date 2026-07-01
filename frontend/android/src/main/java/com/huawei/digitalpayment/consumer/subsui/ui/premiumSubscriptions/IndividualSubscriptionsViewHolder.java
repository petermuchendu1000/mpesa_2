package com.huawei.digitalpayment.consumer.subsui.ui.premiumSubscriptions;

import androidx.recyclerview.widget.RecyclerView;
import com.huawei.digitalpayment.consumer.subsui.databinding.ItemIndividualSubscriptionBinding;
import com.huawei.digitalpayment.consumer.subsui.resp.premiumSubscriptions.Subscription;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/subsui/ui/premiumSubscriptions/IndividualSubscriptionsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/huawei/digitalpayment/consumer/subsui/databinding/ItemIndividualSubscriptionBinding;", "<init>", "(Lcom/huawei/digitalpayment/consumer/subsui/databinding/ItemIndividualSubscriptionBinding;)V", "getBinding", "()Lcom/huawei/digitalpayment/consumer/subsui/databinding/ItemIndividualSubscriptionBinding;", "bind", "", "item", "Lcom/huawei/digitalpayment/consumer/subsui/resp/premiumSubscriptions/Subscription;", "ConsumerSfcMySubscriptionsUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IndividualSubscriptionsViewHolder extends RecyclerView.ViewHolder {
    public static final int $stable = 8;
    private static int ShareDataUIState = 1;
    private static int component1 = 1;
    private static int component2;
    private static int component3;
    private final ItemIndividualSubscriptionBinding copydefault;

    public final ItemIndividualSubscriptionBinding getBinding() {
        int i = 2 % 2;
        int i2 = component3 + 101;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        ItemIndividualSubscriptionBinding itemIndividualSubscriptionBinding = this.copydefault;
        int i5 = i3 + 35;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 0 / 0;
        }
        return itemIndividualSubscriptionBinding;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndividualSubscriptionsViewHolder(ItemIndividualSubscriptionBinding itemIndividualSubscriptionBinding) {
        super(itemIndividualSubscriptionBinding.getRoot());
        Intrinsics.checkNotNullParameter(itemIndividualSubscriptionBinding, "");
        this.copydefault = itemIndividualSubscriptionBinding;
    }

    public final void bind(Subscription item) {
        int i = 2 % 2;
        int i2 = component3 + 91;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(item, "");
        this.copydefault.tvTitle.setText(item.getOfferName());
        this.copydefault.executePendingBindings();
        int i4 = component3 + 93;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 29 / 0;
        }
    }

    static {
        int i = 1 + 111;
        component2 = i % 128;
        if (i % 2 != 0) {
            int i2 = 84 / 0;
        }
    }
}
