package com.huawei.digitalpayment.consumer.subsui.ui.premiumSubscriptions;

import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.huawei.digitalpayment.consumer.subsui.R;
import com.huawei.digitalpayment.consumer.subsui.databinding.ItemMySubscriptionBinding;
import com.huawei.digitalpayment.consumer.subsui.resp.premiumSubscriptions.SubscriptionsListResp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/subsui/ui/premiumSubscriptions/SubscriptionsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/huawei/digitalpayment/consumer/subsui/databinding/ItemMySubscriptionBinding;", "<init>", "(Lcom/huawei/digitalpayment/consumer/subsui/databinding/ItemMySubscriptionBinding;)V", "getBinding", "()Lcom/huawei/digitalpayment/consumer/subsui/databinding/ItemMySubscriptionBinding;", "bind", "", "item", "Lcom/huawei/digitalpayment/consumer/subsui/resp/premiumSubscriptions/SubscriptionsListResp;", "ConsumerSfcMySubscriptionsUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SubscriptionsViewHolder extends RecyclerView.ViewHolder {
    public static final int $stable = 8;
    private static int ShareDataUIState = 1;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copydefault = 19 % 128;
    private final ItemMySubscriptionBinding component1;

    public final ItemMySubscriptionBinding getBinding() {
        int i = 2 % 2;
        int i2 = component2 + 125;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        ItemMySubscriptionBinding itemMySubscriptionBinding = this.component1;
        int i5 = i3 + 19;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return itemMySubscriptionBinding;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionsViewHolder(ItemMySubscriptionBinding itemMySubscriptionBinding) {
        super(itemMySubscriptionBinding.getRoot());
        Intrinsics.checkNotNullParameter(itemMySubscriptionBinding, "");
        this.component1 = itemMySubscriptionBinding;
    }

    public final void bind(SubscriptionsListResp item) {
        int i = 2 % 2;
        int i2 = component2 + 47;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(item, "");
        this.component1.tvTitle.setText(item.getCategory());
        this.component1.tvDesc.setText(item.getActiveItems());
        Glide.with(this.component1.ivBundle).load(item.getImageUrl()).placeholder(R.drawable.ic_sms_plans).into(this.component1.ivBundle);
        this.component1.executePendingBindings();
        int i4 = ShareDataUIState + 123;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static {
        if (19 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
