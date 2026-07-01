package com.huawei.digitalpayment.consumer.subsui.ui.skiza;

import androidx.recyclerview.widget.RecyclerView;
import com.huawei.digitalpayment.consumer.subsui.databinding.ItemSkizaTuneBinding;
import com.huawei.digitalpayment.consumer.subsui.resp.skiza.SkizaTone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/subsui/ui/skiza/SkizaViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/huawei/digitalpayment/consumer/subsui/databinding/ItemSkizaTuneBinding;", "<init>", "(Lcom/huawei/digitalpayment/consumer/subsui/databinding/ItemSkizaTuneBinding;)V", "getBinding", "()Lcom/huawei/digitalpayment/consumer/subsui/databinding/ItemSkizaTuneBinding;", "bind", "", "item", "Lcom/huawei/digitalpayment/consumer/subsui/resp/skiza/SkizaTone;", "ConsumerSfcMySubscriptionsUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SkizaViewHolder extends RecyclerView.ViewHolder {
    public static final int $stable = 8;
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int copydefault = 1;
    private final ItemSkizaTuneBinding component3;

    public final ItemSkizaTuneBinding getBinding() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 17;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        ItemSkizaTuneBinding itemSkizaTuneBinding = this.component3;
        int i4 = i2 + 39;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return itemSkizaTuneBinding;
        }
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkizaViewHolder(ItemSkizaTuneBinding itemSkizaTuneBinding) {
        super(itemSkizaTuneBinding.getRoot());
        Intrinsics.checkNotNullParameter(itemSkizaTuneBinding, "");
        this.component3 = itemSkizaTuneBinding;
    }

    public final void bind(SkizaTone item) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(item, "");
        this.component3.tvTitle.setText(item.getName() + " by " + item.getSingerName());
        this.component3.tvDesc.setText(item.getAmount());
        this.component3.executePendingBindings();
        int i2 = copydefault + 73;
        component1 = i2 % 128;
        int i3 = i2 % 2;
    }

    static {
        int i = 1 + 119;
        component2 = i % 128;
        int i2 = i % 2;
    }
}
