package com.huawei.digitalpayment.consumer.sfcui.profile.faqs;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.digitalpayment.consumer.sfc.databinding.ItemFaqsCardBinding;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\fH\u0016J\u0014\u0010\u0012\u001a\u00020\u000f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/faqs/FAQsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/faqs/FAQsViewHolder;", "<init>", "()V", "lsFAQsItems", "", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/faqs/FAQsBean;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "getItemCount", "onBindViewHolder", "", "holder", "position", "updateItems", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FAQsAdapter extends RecyclerView.Adapter<FAQsViewHolder> {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component1 = 11 % 128;
    private static int component2 = 0;
    private static int copydefault = 1;
    private List<FAQsBean> component3 = CollectionsKt.emptyList();

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2 = 2 % 2;
        int i3 = copydefault + 11;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        onBindViewHolder((FAQsViewHolder) viewHolder, i);
        if (i4 != 0) {
            int i5 = 17 / 0;
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 57;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        FAQsViewHolder fAQsViewHolderOnCreateViewHolder = onCreateViewHolder(viewGroup, i);
        int i5 = ShareDataUIState + 37;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return fAQsViewHolderOnCreateViewHolder;
        }
        throw null;
    }

    @Override
    public FAQsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(parent, "");
        ItemFaqsCardBinding itemFaqsCardBindingInflate = ItemFaqsCardBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(itemFaqsCardBindingInflate, "");
        FAQsViewHolder fAQsViewHolder = new FAQsViewHolder(itemFaqsCardBindingInflate);
        int i2 = ShareDataUIState + 109;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return fAQsViewHolder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public int getItemCount() {
        int i = 2 % 2;
        int i2 = copydefault + 93;
        ShareDataUIState = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.component3.size();
            throw null;
        }
        int size = this.component3.size();
        int i3 = copydefault + 97;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            return size;
        }
        obj.hashCode();
        throw null;
    }

    public void onBindViewHolder(FAQsViewHolder holder, int position) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 107;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(holder, "");
        holder.bind(this.component3.get(position));
        int i4 = ShareDataUIState + 107;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 27 / 0;
        }
    }

    public final void updateItems(List<FAQsBean> lsFAQsItems) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 9;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(lsFAQsItems, "");
        this.component3 = lsFAQsItems;
        notifyDataSetChanged();
        int i4 = copydefault + 21;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        if (11 % 2 == 0) {
            int i = 31 / 0;
        }
    }
}
