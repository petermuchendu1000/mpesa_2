package com.huawei.digitalpayment.consumer.sfcui.profile.support;

import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.huawei.digitalpayment.consumer.sfc.databinding.ItemSupportActionCardBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/support/SupportViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/huawei/digitalpayment/consumer/sfc/databinding/ItemSupportActionCardBinding;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfc/databinding/ItemSupportActionCardBinding;)V", "getBinding", "()Lcom/huawei/digitalpayment/consumer/sfc/databinding/ItemSupportActionCardBinding;", "bind", "", "item", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/support/SupportBean;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SupportViewHolder extends RecyclerView.ViewHolder {
    public static final int $stable = 8;
    private static int component1 = 107 % 128;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault;
    private final ItemSupportActionCardBinding ShareDataUIState;

    public final ItemSupportActionCardBinding getBinding() {
        int i = 2 % 2;
        int i2 = component2 + 73;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        ItemSupportActionCardBinding itemSupportActionCardBinding = this.ShareDataUIState;
        int i5 = i3 + 1;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return itemSupportActionCardBinding;
        }
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportViewHolder(ItemSupportActionCardBinding itemSupportActionCardBinding) {
        super(itemSupportActionCardBinding.getRoot());
        Intrinsics.checkNotNullParameter(itemSupportActionCardBinding, "");
        this.ShareDataUIState = itemSupportActionCardBinding;
    }

    public final void bind(SupportBean item) {
        int i = 2 % 2;
        int i2 = component3 + 29;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(item, "");
        this.ShareDataUIState.tvTitle.setText(item.getTitle());
        Glide.with(this.ShareDataUIState.imgIcon).load(Integer.valueOf(item.getIconRes())).into(this.ShareDataUIState.imgIcon);
        this.ShareDataUIState.executePendingBindings();
        int i4 = component2 + 17;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        int i = 107 % 2;
    }
}
