package com.huawei.digitalpayment.consumer.subsui.ui.promoMessages;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.dynatrace.android.callback.Callback;
import com.huawei.digitalpayment.consumer.subsui.databinding.ItemPromoMessagesBinding;
import com.huawei.digitalpayment.consumer.subsui.resp.promoMessages.PromoBlockedSendersResp;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\b\u0010\u0013\u001a\u00020\u000eH\u0016J\u0014\u0010\u0014\u001a\u00020\u00102\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/huawei/digitalpayment/consumer/subsui/ui/promoMessages/PromoMessagesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/huawei/digitalpayment/consumer/subsui/ui/promoMessages/PromoMessagesViewHolder;", "onPromoMessageClicked", "Lcom/huawei/digitalpayment/consumer/subsui/ui/promoMessages/OnPromoMessageClicked;", "<init>", "(Lcom/huawei/digitalpayment/consumer/subsui/ui/promoMessages/OnPromoMessageClicked;)V", "lsItems", "", "Lcom/huawei/digitalpayment/consumer/subsui/resp/promoMessages/PromoBlockedSendersResp;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", "holder", "position", "getItemCount", "updateData", "ConsumerSfcMySubscriptionsUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PromoMessagesAdapter extends RecyclerView.Adapter<PromoMessagesViewHolder> {
    public static final int $stable = 8;
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int copydefault = 0;
    private static int equals = 33 % 128;
    private List<PromoBlockedSendersResp> component2;
    private final OnPromoMessageClicked component3;

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 31;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        onBindViewHolder((PromoMessagesViewHolder) viewHolder, i);
        if (i4 != 0) {
            int i5 = 69 / 0;
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 37;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        PromoMessagesViewHolder promoMessagesViewHolderOnCreateViewHolder = onCreateViewHolder(viewGroup, i);
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = ShareDataUIState + 93;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return promoMessagesViewHolderOnCreateViewHolder;
    }

    public PromoMessagesAdapter(OnPromoMessageClicked onPromoMessageClicked) {
        Intrinsics.checkNotNullParameter(onPromoMessageClicked, "");
        this.component3 = onPromoMessageClicked;
        this.component2 = new ArrayList();
    }

    @Override
    public PromoMessagesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(parent, "");
        ItemPromoMessagesBinding itemPromoMessagesBindingInflate = ItemPromoMessagesBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(itemPromoMessagesBindingInflate, "");
        PromoMessagesViewHolder promoMessagesViewHolder = new PromoMessagesViewHolder(itemPromoMessagesBindingInflate);
        int i2 = component1 + 75;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return promoMessagesViewHolder;
    }

    public void onBindViewHolder(PromoMessagesViewHolder holder, int position) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(holder, "");
        final PromoBlockedSendersResp promoBlockedSendersResp = this.component2.get(position);
        holder.bind(promoBlockedSendersResp);
        holder.getBinding().tvBuy.setOnClickListener(new View.OnClickListener() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = component3 + 63;
                component1 = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    PromoMessagesAdapter.$r8$lambda$pLn4zg4Zefbkq2E424OyNtXVj10(this.f$0, promoBlockedSendersResp, view);
                    obj.hashCode();
                    throw null;
                }
                PromoMessagesAdapter.$r8$lambda$pLn4zg4Zefbkq2E424OyNtXVj10(this.f$0, promoBlockedSendersResp, view);
                int i4 = component1 + 45;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
            }
        });
        int i2 = ShareDataUIState + 39;
        component1 = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void copydefault(PromoMessagesAdapter promoMessagesAdapter, PromoBlockedSendersResp promoBlockedSendersResp, View view) {
        int i = 2 % 2;
        int i2 = component1 + 75;
        ShareDataUIState = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(promoMessagesAdapter, "");
            Intrinsics.checkNotNullParameter(promoBlockedSendersResp, "");
            promoMessagesAdapter.component3.onPromoMessageClicked(promoBlockedSendersResp);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(promoMessagesAdapter, "");
        Intrinsics.checkNotNullParameter(promoBlockedSendersResp, "");
        promoMessagesAdapter.component3.onPromoMessageClicked(promoBlockedSendersResp);
        int i3 = component1 + 57;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @Override
    public int getItemCount() {
        int i = 2 % 2;
        int i2 = component1 + 111;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int size = this.component2.size();
        int i4 = ShareDataUIState + 23;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return size;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void updateData(List<PromoBlockedSendersResp> lsItems) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 121;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(lsItems, "");
            this.component2 = lsItems;
            notifyDataSetChanged();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(lsItems, "");
        this.component2 = lsItems;
        notifyDataSetChanged();
        int i3 = component1 + 21;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 24 / 0;
        }
    }

    public static void $r8$lambda$pLn4zg4Zefbkq2E424OyNtXVj10(PromoMessagesAdapter promoMessagesAdapter, PromoBlockedSendersResp promoBlockedSendersResp, View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 55;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        component3(promoMessagesAdapter, promoBlockedSendersResp, view);
        int i4 = component1 + 107;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        int i = 33 % 2;
    }

    private static void component3(PromoMessagesAdapter promoMessagesAdapter, PromoBlockedSendersResp promoBlockedSendersResp, View view) {
        int i = 2 % 2;
        int i2 = component1 + 95;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 == 0) {
                copydefault(promoMessagesAdapter, promoBlockedSendersResp, view);
                Callback.onClick_exit();
                int i4 = 76 / 0;
            } else {
                copydefault(promoMessagesAdapter, promoBlockedSendersResp, view);
                Callback.onClick_exit();
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }
}
