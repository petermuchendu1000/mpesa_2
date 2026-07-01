package com.huawei.digitalpayment.consumer.sfcui.buybundles.adapter;

import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.dynatrace.android.callback.Callback;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.TunukiwaBundleResp;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B8\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0007¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0014J\b\u0010\u0011\u001a\u00020\u0012H\u0002R+\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/adapter/TunukiwaBundlesAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/TunukiwaBundleResp;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "data", "", "itemClick", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "item", "", "<init>", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "itemClickListener", "convert", "holder", "getImageByBundleType", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TunukiwaBundlesAdapter extends BaseQuickAdapter<TunukiwaBundleResp, BaseViewHolder> {
    public static final int $stable = 8;
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 105 % 128;
    private static int component3;
    private Function1<? super TunukiwaBundleResp, Unit> copydefault;

    @Override
    public void convert(BaseViewHolder baseViewHolder, TunukiwaBundleResp tunukiwaBundleResp) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 75;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        convert2(baseViewHolder, tunukiwaBundleResp);
        int i4 = ShareDataUIState + 23;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TunukiwaBundlesAdapter(List<TunukiwaBundleResp> list, Function1<? super TunukiwaBundleResp, Unit> function1) {
        super(R.layout.item_with_expiry_bundle, list);
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = function1;
    }

    protected void convert2(BaseViewHolder holder, final TunukiwaBundleResp item) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(holder, "");
        Intrinsics.checkNotNullParameter(item, "");
        holder.setText(R.id.tv_bundle_title, item.getOfferName());
        holder.setText(R.id.tv_bundle_amount, item.getOfferPrice());
        holder.setImageResource(R.id.iv_bundle, R.drawable.ic_tunukiwa_internet);
        ((RoundTextView) holder.getView(R.id.tv_buy)).setOnClickListener(new View.OnClickListener() {
            private static int component1 = 1;
            private static int component2;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = component2 + 63;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    TunukiwaBundlesAdapter.$r8$lambda$J7iAVeudjDfRRC0aR1LpWpw3jjA(this.f$0, item, view);
                    throw null;
                }
                TunukiwaBundlesAdapter.$r8$lambda$J7iAVeudjDfRRC0aR1LpWpw3jjA(this.f$0, item, view);
                int i4 = component1 + 123;
                component2 = i4 % 128;
                int i5 = i4 % 2;
            }
        });
        int i2 = ShareDataUIState + 109;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 82 / 0;
        }
    }

    private static final void component3(TunukiwaBundlesAdapter tunukiwaBundlesAdapter, TunukiwaBundleResp tunukiwaBundleResp, View view) {
        Function1<? super TunukiwaBundleResp, Unit> function1;
        int i = 2 % 2;
        int i2 = component1 + 37;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(tunukiwaBundlesAdapter, "");
            Intrinsics.checkNotNullParameter(tunukiwaBundleResp, "");
            function1 = tunukiwaBundlesAdapter.copydefault;
            int i3 = 22 / 0;
            if (function1 == null) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(tunukiwaBundlesAdapter, "");
            Intrinsics.checkNotNullParameter(tunukiwaBundleResp, "");
            function1 = tunukiwaBundlesAdapter.copydefault;
            if (function1 == null) {
                return;
            }
        }
        int i4 = ShareDataUIState + 27;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        function1.invoke(tunukiwaBundleResp);
    }

    private final int component1() {
        int i = 2 % 2;
        int i2 = component1 + 41;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.mipmap.icon_bundle_tunukiwa;
        int i5 = ShareDataUIState + 75;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 63 / 0;
        }
        return i4;
    }

    public static void $r8$lambda$J7iAVeudjDfRRC0aR1LpWpw3jjA(TunukiwaBundlesAdapter tunukiwaBundlesAdapter, TunukiwaBundleResp tunukiwaBundleResp, View view) {
        int i = 2 % 2;
        int i2 = component1 + 59;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        component2(tunukiwaBundlesAdapter, tunukiwaBundleResp, view);
        int i4 = component1 + 103;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        if (105 % 2 == 0) {
            int i = 50 / 0;
        }
    }

    /* JADX WARN: Finally extract failed */
    private static void component2(TunukiwaBundlesAdapter tunukiwaBundlesAdapter, TunukiwaBundleResp tunukiwaBundleResp, View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 11;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 != 0) {
                component3(tunukiwaBundlesAdapter, tunukiwaBundleResp, view);
                Callback.onClick_exit();
                throw null;
            }
            component3(tunukiwaBundlesAdapter, tunukiwaBundleResp, view);
            Callback.onClick_exit();
            int i4 = ShareDataUIState + 99;
            component1 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }
}
