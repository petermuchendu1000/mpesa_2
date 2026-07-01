package com.huawei.digitalpayment.consumer.sfcui.buybundles.adapter;

import android.view.View;
import androidx.cardview.widget.CardView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.dynatrace.android.callback.Callback;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OfferResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0002H\u0014J\u0014\u0010\u0012\u001a\u00020\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014R(\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/adapter/MakeUrBundleRecyclerAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/OfferResponse;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "<init>", "()V", "onBundleClick", "Lkotlin/Function1;", "", "getOnBundleClick", "()Lkotlin/jvm/functions/Function1;", "setOnBundleClick", "(Lkotlin/jvm/functions/Function1;)V", "bundleList", "", "convert", "holder", "item", "updateOffers", "list", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MakeUrBundleRecyclerAdapter extends BaseQuickAdapter<OfferResponse, BaseViewHolder> {
    public static final int $stable = 8;
    private static int ShareDataUIState = 1;
    private static int component3 = 0;
    private static int copy = 1;
    private static int copydefault;
    private Function1<? super OfferResponse, Unit> component1;
    private final List<OfferResponse> component2;

    @Override
    public void convert(BaseViewHolder baseViewHolder, OfferResponse offerResponse) {
        int i = 2 % 2;
        int i2 = component3 + 51;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        convert2(baseViewHolder, offerResponse);
        int i4 = ShareDataUIState + 79;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    public MakeUrBundleRecyclerAdapter() {
        super(R.layout.item_with_expiry_bundle, null, 2, null);
        this.component2 = new ArrayList();
    }

    public final Function1<OfferResponse, Unit> getOnBundleClick() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 51;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Function1 function1 = this.component1;
        int i5 = i2 + 93;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return function1;
    }

    public final void setOnBundleClick(Function1<? super OfferResponse, Unit> function1) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 61;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.component1 = function1;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 69;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    protected void convert2(BaseViewHolder holder, final OfferResponse item) {
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(holder, "");
        Intrinsics.checkNotNullParameter(item, "");
        holder.setText(R.id.tv_bundle_title, item.getName());
        holder.setText(R.id.tv_bundle_amount, "Ksh. " + item.getTotalPrice());
        if (item.getVoice() == 0) {
            i = R.drawable.ic_bundle_no_expire_call;
            int i3 = ShareDataUIState + 113;
            component3 = i3 % 128;
            int i4 = i3 % 2;
        } else {
            i = R.drawable.ic_with_expiry_bundle;
        }
        holder.setImageResource(R.id.iv_bundle, i);
        ((CardView) holder.getView(R.id.cv_root)).setOnClickListener(new View.OnClickListener() {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public final void onClick(View view) {
                int i5 = 2 % 2;
                int i6 = component3 + 13;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
                MakeUrBundleRecyclerAdapter.$r8$lambda$JKB17QT_ZMeGjrAk7t4Ve8o0SZU(this.f$0, item, view);
                int i8 = ShareDataUIState + 89;
                component3 = i8 % 128;
                int i9 = i8 % 2;
            }
        });
        int i5 = component3 + 81;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final void component3(MakeUrBundleRecyclerAdapter makeUrBundleRecyclerAdapter, OfferResponse offerResponse, View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 53;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(makeUrBundleRecyclerAdapter, "");
        Intrinsics.checkNotNullParameter(offerResponse, "");
        Function1<? super OfferResponse, Unit> function1 = makeUrBundleRecyclerAdapter.component1;
        if (function1 != null) {
            function1.invoke(offerResponse);
            int i4 = component3 + 39;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 5 / 5;
            }
        }
    }

    public final void updateOffers(List<OfferResponse> list) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 51;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        this.component2.clear();
        this.component2.addAll(list);
        setNewInstance(this.component2);
        int i4 = component3 + 109;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static void $r8$lambda$JKB17QT_ZMeGjrAk7t4Ve8o0SZU(MakeUrBundleRecyclerAdapter makeUrBundleRecyclerAdapter, OfferResponse offerResponse, View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 103;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        component2(makeUrBundleRecyclerAdapter, offerResponse, view);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = component3 + 97;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        int i = 1 + 109;
        copydefault = i % 128;
        if (i % 2 != 0) {
            int i2 = 5 / 0;
        }
    }

    private static void component2(MakeUrBundleRecyclerAdapter makeUrBundleRecyclerAdapter, OfferResponse offerResponse, View view) {
        int i = 2 % 2;
        int i2 = component3 + 77;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 == 0) {
                component3(makeUrBundleRecyclerAdapter, offerResponse, view);
                Callback.onClick_exit();
                int i4 = 59 / 0;
            } else {
                component3(makeUrBundleRecyclerAdapter, offerResponse, view);
                Callback.onClick_exit();
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }
}
