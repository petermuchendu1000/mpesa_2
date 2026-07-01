package com.huawei.digitalpayment.consumer.sfcui.bonga.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.digitalpayment.consumer.sfcui.bonga.model.BongaDeal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\nH\u0016¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/adapter/BongaDealsAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/huawei/digitalpayment/consumer/sfcui/bonga/model/BongaDeal;", "Lcom/huawei/digitalpayment/consumer/sfcui/bonga/adapter/BongaDealsAdapter$DealViewHolder;", "<init>", "()V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", "holder", "position", "DealViewHolder", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BongaDealsAdapter extends ListAdapter<BongaDeal, DealViewHolder> {
    public static final int $stable = 0;
    private static int component1 = 89 % 128;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;

    public BongaDealsAdapter() {
        super(new DealDiffCallback());
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2 = 2 % 2;
        int i3 = copydefault + 5;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        onBindViewHolder((DealViewHolder) viewHolder, i);
        if (i4 != 0) {
            int i5 = 72 / 0;
        }
        int i6 = component3 + 19;
        copydefault = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        int i3 = copydefault + 105;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        DealViewHolder dealViewHolderOnCreateViewHolder = onCreateViewHolder(viewGroup, i);
        if (i4 == 0) {
            return dealViewHolderOnCreateViewHolder;
        }
        throw null;
    }

    @Override
    public DealViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(parent, "");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.deal_item_placeholder, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        DealViewHolder dealViewHolder = new DealViewHolder(viewInflate);
        int i2 = copydefault + 109;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return dealViewHolder;
        }
        throw null;
    }

    public void onBindViewHolder(DealViewHolder holder, int position) {
        int i = 2 % 2;
        int i2 = component3 + 45;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(holder, "");
        BongaDeal item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "");
        holder.bind(item);
        int i4 = copydefault + 119;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        if (89 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/adapter/BongaDealsAdapter$DealViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "titleTextView", "Landroid/widget/TextView;", "pointsTextView", "imageView", "Landroid/widget/ImageView;", "bind", "", "deal", "Lcom/huawei/digitalpayment/consumer/sfcui/bonga/model/BongaDeal;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DealViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;
        private static int component1 = 0;
        private static int copydefault = 7 % 128;
        private static int equals = 1;
        private static int getRequestBeneficiariesState;
        private final ImageView ShareDataUIState;
        private final TextView component2;
        private final TextView component3;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DealViewHolder(View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            View viewFindViewById = view.findViewById(R.id.tv_deal_title);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.component2 = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.tv_deal_price);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            this.component3 = (TextView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(R.id.img_deal_thumbnail);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
            this.ShareDataUIState = (ImageView) viewFindViewById3;
        }

        public final void bind(BongaDeal deal) {
            int i = 2 % 2;
            int i2 = equals + 13;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(deal, "");
            this.component2.setText(deal.getTitle());
            this.component3.setText(deal.getPoints());
            int i4 = getRequestBeneficiariesState + 33;
            equals = i4 % 128;
            int i5 = i4 % 2;
        }

        static {
            if (7 % 2 == 0) {
                int i = 4 / 0;
            }
        }
    }
}
