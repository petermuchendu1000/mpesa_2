package com.huawei.digitalpayment.consumer.sfcui.profile.support;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.dynatrace.android.callback.Callback;
import com.huawei.digitalpayment.consumer.sfc.databinding.ItemSupportActionCardBinding;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\u0014\u0010\u0014\u001a\u00020\u00112\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/support/SupportAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/support/SupportViewHolder;", "onSupportClick", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/support/SupportClick;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/profile/support/SupportClick;)V", "lsSupportItems", "", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/support/SupportBean;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "getItemCount", "onBindViewHolder", "", "holder", "position", "updateItems", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SupportAdapter extends RecyclerView.Adapter<SupportViewHolder> {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int copydefault = 1;
    private static int getAsAtTimestamp = 101 % 128;
    private List<SupportBean> component2;
    private final SupportClick component3;

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 95;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        onBindViewHolder((SupportViewHolder) viewHolder, i);
        if (i4 == 0) {
            int i5 = 49 / 0;
        }
        int i6 = ShareDataUIState + 3;
        copydefault = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 27;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        SupportViewHolder supportViewHolderOnCreateViewHolder = onCreateViewHolder(viewGroup, i);
        int i5 = copydefault + 21;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return supportViewHolderOnCreateViewHolder;
    }

    public SupportAdapter(SupportClick supportClick) {
        Intrinsics.checkNotNullParameter(supportClick, "");
        this.component3 = supportClick;
        this.component2 = new ArrayList();
    }

    @Override
    public SupportViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(parent, "");
        ItemSupportActionCardBinding itemSupportActionCardBindingInflate = ItemSupportActionCardBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(itemSupportActionCardBindingInflate, "");
        SupportViewHolder supportViewHolder = new SupportViewHolder(itemSupportActionCardBindingInflate);
        int i2 = ShareDataUIState + 119;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 4 / 0;
        }
        return supportViewHolder;
    }

    @Override
    public int getItemCount() {
        int i = 2 % 2;
        int i2 = copydefault + 41;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int size = this.component2.size();
        int i4 = copydefault + 95;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 99 / 0;
        }
        return size;
    }

    public void onBindViewHolder(SupportViewHolder holder, int position) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(holder, "");
        final SupportBean supportBean = this.component2.get(position);
        holder.bind(supportBean);
        holder.getBinding().getRoot().setOnClickListener(new View.OnClickListener() {
            private static int ShareDataUIState = 1;
            private static int component1;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = component1 + 61;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                SupportAdapter.m11768$r8$lambda$n08o7Bape1vwK4R2JEHLdb0ujE(this.f$0, supportBean, view);
                int i5 = component1 + 111;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = copydefault + 63;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 9 / 0;
        }
    }

    private static final void component3(SupportAdapter supportAdapter, SupportBean supportBean, View view) {
        int i = 2 % 2;
        int i2 = copydefault + 31;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(supportAdapter, "");
            Intrinsics.checkNotNullParameter(supportBean, "");
            supportAdapter.component3.onSupportClick(supportBean);
            int i3 = 50 / 0;
        } else {
            Intrinsics.checkNotNullParameter(supportAdapter, "");
            Intrinsics.checkNotNullParameter(supportBean, "");
            supportAdapter.component3.onSupportClick(supportBean);
        }
        int i4 = copydefault + 23;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void updateItems(List<SupportBean> lsSupportItems) {
        int i = 2 % 2;
        int i2 = copydefault + 105;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(lsSupportItems, "");
        this.component2 = lsSupportItems;
        notifyDataSetChanged();
        int i4 = ShareDataUIState + 59;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void m11768$r8$lambda$n08o7Bape1vwK4R2JEHLdb0ujE(SupportAdapter supportAdapter, SupportBean supportBean, View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 59;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        component1(supportAdapter, supportBean, view);
        int i4 = copydefault + 85;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static {
        if (101 % 2 == 0) {
            throw null;
        }
    }

    private static void component1(SupportAdapter supportAdapter, SupportBean supportBean, View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 67;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            component3(supportAdapter, supportBean, view);
            Callback.onClick_exit();
            int i4 = copydefault + 63;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }
}
