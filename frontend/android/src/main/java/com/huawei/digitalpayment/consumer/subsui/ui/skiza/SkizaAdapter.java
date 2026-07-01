package com.huawei.digitalpayment.consumer.subsui.ui.skiza;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.digitalpayment.consumer.subsui.databinding.ItemSkizaTuneBinding;
import com.huawei.digitalpayment.consumer.subsui.resp.skiza.SkizaTone;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\b\u0010\u0013\u001a\u00020\u000eH\u0016J\u0014\u0010\u0014\u001a\u00020\u00102\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/huawei/digitalpayment/consumer/subsui/ui/skiza/SkizaAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/huawei/digitalpayment/consumer/subsui/ui/skiza/SkizaViewHolder;", "viewModel", "Lcom/huawei/digitalpayment/consumer/subsui/ui/skiza/SkizaViewModel;", "<init>", "(Lcom/huawei/digitalpayment/consumer/subsui/ui/skiza/SkizaViewModel;)V", "lsSkizaTunes", "", "Lcom/huawei/digitalpayment/consumer/subsui/resp/skiza/SkizaTone;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", "holder", "position", "getItemCount", "updateData", "ConsumerSfcMySubscriptionsUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SkizaAdapter extends RecyclerView.Adapter<SkizaViewHolder> {
    public static final int $stable = 8;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int copydefault = 1;
    private static int equals = 1 % 128;
    private final SkizaViewModel ShareDataUIState;
    private List<SkizaTone> component3;

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2 = 2 % 2;
        int i3 = component1 + 51;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        onBindViewHolder((SkizaViewHolder) viewHolder, i);
        int i5 = component1 + 125;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        int i3 = component1 + 113;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        SkizaViewHolder skizaViewHolderOnCreateViewHolder = onCreateViewHolder(viewGroup, i);
        if (i4 == 0) {
            int i5 = 22 / 0;
        }
        return skizaViewHolderOnCreateViewHolder;
    }

    public SkizaAdapter(SkizaViewModel skizaViewModel) {
        Intrinsics.checkNotNullParameter(skizaViewModel, "");
        this.ShareDataUIState = skizaViewModel;
        this.component3 = CollectionsKt.emptyList();
    }

    @Override
    public SkizaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(parent, "");
        ItemSkizaTuneBinding itemSkizaTuneBindingInflate = ItemSkizaTuneBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(itemSkizaTuneBindingInflate, "");
        SkizaViewHolder skizaViewHolder = new SkizaViewHolder(itemSkizaTuneBindingInflate);
        int i2 = component1 + 65;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return skizaViewHolder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onBindViewHolder(SkizaViewHolder holder, int position) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(holder, "");
        final SkizaTone skizaTone = this.component3.get(position);
        holder.bind(skizaTone);
        holder.getBinding().tvBuy.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i2 = 2 % 2;
                int i3 = component3 + 7;
                copydefault = i3 % 128;
                if (i3 % 2 != 0) {
                    SkizaAdapter.$r8$lambda$XxD5ZoVvZMQFfX93jr9z1wHPphU(this.f$0, skizaTone, compoundButton, z);
                    int i4 = 91 / 0;
                } else {
                    SkizaAdapter.$r8$lambda$XxD5ZoVvZMQFfX93jr9z1wHPphU(this.f$0, skizaTone, compoundButton, z);
                }
                int i5 = copydefault + 9;
                component3 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }
        });
        int i2 = component1 + 63;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void component3(SkizaAdapter skizaAdapter, SkizaTone skizaTone, CompoundButton compoundButton, boolean z) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(skizaAdapter, "");
        Intrinsics.checkNotNullParameter(skizaTone, "");
        if (!(!z)) {
            int i2 = copydefault + 63;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            if (!skizaAdapter.ShareDataUIState.getSelectedTones().contains(skizaTone.getSubscriptionID())) {
                skizaAdapter.ShareDataUIState.getSelectedTones().add(skizaTone.getSubscriptionID());
                int i4 = component1 + 71;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
            }
        } else if (!(!skizaAdapter.ShareDataUIState.getSelectedTones().contains(skizaTone.getSubscriptionID()))) {
            skizaAdapter.ShareDataUIState.getSelectedTones().remove(skizaTone.getSubscriptionID());
        }
        int i6 = component1 + 109;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override
    public int getItemCount() {
        int i = 2 % 2;
        int i2 = copydefault + 33;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int size = this.component3.size();
        int i4 = copydefault + 79;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return size;
    }

    public final void updateData(List<SkizaTone> lsSkizaTunes) {
        int i = 2 % 2;
        int i2 = copydefault + 61;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(lsSkizaTunes, "");
        this.component3 = lsSkizaTunes;
        notifyDataSetChanged();
        int i4 = copydefault + 87;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static void $r8$lambda$XxD5ZoVvZMQFfX93jr9z1wHPphU(SkizaAdapter skizaAdapter, SkizaTone skizaTone, CompoundButton compoundButton, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 13;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        component3(skizaAdapter, skizaTone, compoundButton, z);
        if (i3 == 0) {
            int i4 = 75 / 0;
        }
        int i5 = copydefault + 109;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 21 / 0;
        }
    }

    static {
        int i = 1 % 2;
    }
}
