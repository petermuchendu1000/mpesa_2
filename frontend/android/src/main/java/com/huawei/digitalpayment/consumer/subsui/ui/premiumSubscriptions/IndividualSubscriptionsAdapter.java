package com.huawei.digitalpayment.consumer.subsui.ui.premiumSubscriptions;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.dynatrace.android.callback.Callback;
import com.huawei.digitalpayment.consumer.subsui.databinding.ItemIndividualSubscriptionBinding;
import com.huawei.digitalpayment.consumer.subsui.resp.premiumSubscriptions.Subscription;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\b\u0010\u0013\u001a\u00020\u000eH\u0016J\u0014\u0010\u0014\u001a\u00020\u00102\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/huawei/digitalpayment/consumer/subsui/ui/premiumSubscriptions/IndividualSubscriptionsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/huawei/digitalpayment/consumer/subsui/ui/premiumSubscriptions/IndividualSubscriptionsViewHolder;", "onSubscriptionClick", "Lcom/huawei/digitalpayment/consumer/subsui/ui/premiumSubscriptions/OnSubscriptionClick;", "<init>", "(Lcom/huawei/digitalpayment/consumer/subsui/ui/premiumSubscriptions/OnSubscriptionClick;)V", "lsSubscriptions", "", "Lcom/huawei/digitalpayment/consumer/subsui/resp/premiumSubscriptions/Subscription;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", "holder", "position", "getItemCount", "updateData", "ConsumerSfcMySubscriptionsUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IndividualSubscriptionsAdapter extends RecyclerView.Adapter<IndividualSubscriptionsViewHolder> {
    public static final int $stable = 8;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 0;
    private static int getRequestBeneficiariesState = 1;
    private final OnSubscriptionClick ShareDataUIState;
    private List<Subscription> component1;

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2 = 2 % 2;
        int i3 = component2 + 63;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        onBindViewHolder((IndividualSubscriptionsViewHolder) viewHolder, i);
        if (i4 == 0) {
            throw null;
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        int i3 = component2 + 121;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        IndividualSubscriptionsViewHolder individualSubscriptionsViewHolderOnCreateViewHolder = onCreateViewHolder(viewGroup, i);
        if (i4 != 0) {
            return individualSubscriptionsViewHolderOnCreateViewHolder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public IndividualSubscriptionsAdapter(OnSubscriptionClick onSubscriptionClick) {
        Intrinsics.checkNotNullParameter(onSubscriptionClick, "");
        this.ShareDataUIState = onSubscriptionClick;
        this.component1 = CollectionsKt.emptyList();
    }

    @Override
    public IndividualSubscriptionsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(parent, "");
        ItemIndividualSubscriptionBinding itemIndividualSubscriptionBindingInflate = ItemIndividualSubscriptionBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(itemIndividualSubscriptionBindingInflate, "");
        IndividualSubscriptionsViewHolder individualSubscriptionsViewHolder = new IndividualSubscriptionsViewHolder(itemIndividualSubscriptionBindingInflate);
        int i2 = component3 + 37;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return individualSubscriptionsViewHolder;
        }
        throw null;
    }

    public void onBindViewHolder(IndividualSubscriptionsViewHolder holder, int position) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(holder, "");
        final Subscription subscription = this.component1.get(position);
        holder.bind(subscription);
        holder.getBinding().cvRoot.setOnClickListener(new View.OnClickListener() {
            private static int ShareDataUIState = 1;
            private static int component1;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 45;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                IndividualSubscriptionsAdapter.m12116$r8$lambda$ivzMJcVMsN3k5y3v1qKNj55aj0(this.f$0, subscription, view);
                int i5 = component1 + 125;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i2 = component2 + 15;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void component2(IndividualSubscriptionsAdapter individualSubscriptionsAdapter, Subscription subscription, View view) {
        int i = 2 % 2;
        int i2 = component3 + 55;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(individualSubscriptionsAdapter, "");
        Intrinsics.checkNotNullParameter(subscription, "");
        individualSubscriptionsAdapter.ShareDataUIState.onSubscriptionClick(subscription);
        int i4 = component3 + 29;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override
    public int getItemCount() {
        int i = 2 % 2;
        int i2 = component2 + 55;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int size = this.component1.size();
        int i4 = component3 + 85;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return size;
    }

    public final void updateData(List<Subscription> lsSubscriptions) {
        int i = 2 % 2;
        int i2 = component2 + 95;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(lsSubscriptions, "");
            this.component1 = lsSubscriptions;
            notifyDataSetChanged();
            int i3 = 39 / 0;
        } else {
            Intrinsics.checkNotNullParameter(lsSubscriptions, "");
            this.component1 = lsSubscriptions;
            notifyDataSetChanged();
        }
        int i4 = component3 + 51;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 93 / 0;
        }
    }

    public static void m12116$r8$lambda$ivzMJcVMsN3k5y3v1qKNj55aj0(IndividualSubscriptionsAdapter individualSubscriptionsAdapter, Subscription subscription, View view) {
        int i = 2 % 2;
        int i2 = component3 + 53;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        component1(individualSubscriptionsAdapter, subscription, view);
        if (i3 != 0) {
            throw null;
        }
    }

    static {
        int i = 1 + 111;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Finally extract failed */
    private static void component1(IndividualSubscriptionsAdapter individualSubscriptionsAdapter, Subscription subscription, View view) {
        int i = 2 % 2;
        int i2 = component2 + 19;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Callback.onClick_enter(view);
        try {
            if (i3 == 0) {
                component2(individualSubscriptionsAdapter, subscription, view);
                Callback.onClick_exit();
                obj.hashCode();
                throw null;
            }
            component2(individualSubscriptionsAdapter, subscription, view);
            Callback.onClick_exit();
            int i4 = component3 + 119;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }
}
