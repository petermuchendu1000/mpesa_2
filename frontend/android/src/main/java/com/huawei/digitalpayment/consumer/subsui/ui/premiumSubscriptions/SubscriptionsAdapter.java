package com.huawei.digitalpayment.consumer.subsui.ui.premiumSubscriptions;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.dynatrace.android.callback.Callback;
import com.huawei.digitalpayment.consumer.subsui.databinding.ItemMySubscriptionBinding;
import com.huawei.digitalpayment.consumer.subsui.resp.premiumSubscriptions.SubscriptionsListResp;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\b\u0010\u0013\u001a\u00020\u000eH\u0016J\u0014\u0010\u0014\u001a\u00020\u00102\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/huawei/digitalpayment/consumer/subsui/ui/premiumSubscriptions/SubscriptionsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/huawei/digitalpayment/consumer/subsui/ui/premiumSubscriptions/SubscriptionsViewHolder;", "onSubscriptionClick", "Lcom/huawei/digitalpayment/consumer/subsui/ui/premiumSubscriptions/OnSubscriptionClick;", "<init>", "(Lcom/huawei/digitalpayment/consumer/subsui/ui/premiumSubscriptions/OnSubscriptionClick;)V", "lsSubscriptions", "", "Lcom/huawei/digitalpayment/consumer/subsui/resp/premiumSubscriptions/SubscriptionsListResp;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", "holder", "position", "getItemCount", "updateList", "ConsumerSfcMySubscriptionsUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SubscriptionsAdapter extends RecyclerView.Adapter<SubscriptionsViewHolder> {
    public static final int $stable = 8;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int getAsAtTimestamp = 53 % 128;
    private final OnSubscriptionClick ShareDataUIState;
    private List<SubscriptionsListResp> copydefault;

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2 = 2 % 2;
        int i3 = component1 + 11;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        onBindViewHolder((SubscriptionsViewHolder) viewHolder, i);
        int i5 = component2 + 93;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 57 / 0;
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        int i3 = component1 + 21;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        SubscriptionsViewHolder subscriptionsViewHolderOnCreateViewHolder = onCreateViewHolder(viewGroup, i);
        if (i4 == 0) {
            return subscriptionsViewHolderOnCreateViewHolder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public SubscriptionsAdapter(OnSubscriptionClick onSubscriptionClick) {
        Intrinsics.checkNotNullParameter(onSubscriptionClick, "");
        this.ShareDataUIState = onSubscriptionClick;
        this.copydefault = CollectionsKt.emptyList();
    }

    @Override
    public SubscriptionsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(parent, "");
        ItemMySubscriptionBinding itemMySubscriptionBindingInflate = ItemMySubscriptionBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(itemMySubscriptionBindingInflate, "");
        SubscriptionsViewHolder subscriptionsViewHolder = new SubscriptionsViewHolder(itemMySubscriptionBindingInflate);
        int i2 = component1 + 47;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return subscriptionsViewHolder;
    }

    public void onBindViewHolder(SubscriptionsViewHolder holder, int position) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(holder, "");
        final SubscriptionsListResp subscriptionsListResp = this.copydefault.get(position);
        holder.bind(subscriptionsListResp);
        holder.getBinding().cvRoot.setOnClickListener(new View.OnClickListener() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = component1 + 23;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                SubscriptionsAdapter.m12119$r8$lambda$1OFbY2Ouye1HBUMaXGNtyoKXaM(this.f$0, subscriptionsListResp, view);
                int i5 = component1 + 81;
                component3 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 62 / 0;
                }
            }
        });
        int i2 = component1 + 13;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static final void copydefault(SubscriptionsAdapter subscriptionsAdapter, SubscriptionsListResp subscriptionsListResp, View view) {
        int i = 2 % 2;
        int i2 = component2 + 123;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(subscriptionsAdapter, "");
        Intrinsics.checkNotNullParameter(subscriptionsListResp, "");
        subscriptionsAdapter.ShareDataUIState.onSubscriptionClick(subscriptionsListResp);
        int i4 = component2 + 27;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 24 / 0;
        }
    }

    @Override
    public int getItemCount() {
        int i = 2 % 2;
        int i2 = component2 + 33;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int size = this.copydefault.size();
        int i4 = component2 + 93;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 81 / 0;
        }
        return size;
    }

    public final void updateList(List<SubscriptionsListResp> lsSubscriptions) {
        int i = 2 % 2;
        int i2 = component1 + 7;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(lsSubscriptions, "");
        this.copydefault = lsSubscriptions;
        notifyDataSetChanged();
        int i4 = component1 + 117;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void m12119$r8$lambda$1OFbY2Ouye1HBUMaXGNtyoKXaM(SubscriptionsAdapter subscriptionsAdapter, SubscriptionsListResp subscriptionsListResp, View view) {
        int i = 2 % 2;
        int i2 = component1 + 73;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        component3(subscriptionsAdapter, subscriptionsListResp, view);
        if (i3 != 0) {
            throw null;
        }
    }

    static {
        int i = 53 % 2;
    }

    private static void component3(SubscriptionsAdapter subscriptionsAdapter, SubscriptionsListResp subscriptionsListResp, View view) {
        int i = 2 % 2;
        int i2 = component1 + 107;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            copydefault(subscriptionsAdapter, subscriptionsListResp, view);
            Callback.onClick_exit();
            int i4 = component1 + 115;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }
}
