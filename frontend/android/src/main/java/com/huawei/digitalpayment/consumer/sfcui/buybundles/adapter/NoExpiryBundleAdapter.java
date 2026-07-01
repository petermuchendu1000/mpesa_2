package com.huawei.digitalpayment.consumer.sfcui.buybundles.adapter;

import android.view.View;
import androidx.cardview.widget.CardView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.dynatrace.android.callback.Callback;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.WithExpiryResp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0014R(\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/adapter/NoExpiryBundleAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/WithExpiryResp;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "<init>", "()V", "onBundleClick", "Lkotlin/Function1;", "", "getOnBundleClick", "()Lkotlin/jvm/functions/Function1;", "setOnBundleClick", "(Lkotlin/jvm/functions/Function1;)V", "convert", "holder", "item", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NoExpiryBundleAdapter extends BaseQuickAdapter<WithExpiryResp, BaseViewHolder> {
    public static final int $stable = 8;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;
    private Function1<? super WithExpiryResp, Unit> ShareDataUIState;

    @Override
    public void convert(BaseViewHolder baseViewHolder, WithExpiryResp withExpiryResp) {
        int i = 2 % 2;
        int i2 = copydefault + 81;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        convert2(baseViewHolder, withExpiryResp);
        int i4 = component3 + 123;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public NoExpiryBundleAdapter() {
        super(R.layout.item_no_expiry_bundle, null, 2, null);
    }

    public final Function1<WithExpiryResp, Unit> getOnBundleClick() {
        int i = 2 % 2;
        int i2 = component3 + 119;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Function1 function1 = this.ShareDataUIState;
        int i5 = i3 + 99;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return function1;
    }

    public final void setOnBundleClick(Function1<? super WithExpiryResp, Unit> function1) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 45;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.ShareDataUIState = function1;
        int i5 = i2 + 69;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    protected void convert2(BaseViewHolder holder, final WithExpiryResp item) {
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(holder, "");
        Intrinsics.checkNotNullParameter(item, "");
        holder.setText(R.id.tv_bundle_title, item.getTitle());
        holder.setText(R.id.tv_bundle_amount, item.getUnit() + ". " + item.getAmount());
        if (!item.isCall()) {
            i = R.mipmap.icon_with_expiry_bundle;
            int i3 = copydefault + 105;
            component3 = i3 % 128;
            int i4 = i3 % 2;
        } else {
            int i5 = copydefault + 101;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            i = R.mipmap.icon_bundle_no_expire_call;
        }
        holder.setImageResource(R.id.iv_bundle, i);
        ((CardView) holder.getView(R.id.cv_root)).setOnClickListener(new View.OnClickListener() {
            private static int ShareDataUIState = 1;
            private static int component1;

            @Override
            public final void onClick(View view) {
                int i7 = 2 % 2;
                int i8 = ShareDataUIState + 119;
                component1 = i8 % 128;
                if (i8 % 2 != 0) {
                    NoExpiryBundleAdapter.$r8$lambda$FPJC6qVEWpFYCSRNHcTlcGA2FWQ(this.f$0, item, view);
                    throw null;
                }
                NoExpiryBundleAdapter.$r8$lambda$FPJC6qVEWpFYCSRNHcTlcGA2FWQ(this.f$0, item, view);
                int i9 = component1 + 121;
                ShareDataUIState = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 11 / 0;
                }
            }
        });
    }

    private static final void ShareDataUIState(NoExpiryBundleAdapter noExpiryBundleAdapter, WithExpiryResp withExpiryResp, View view) {
        int i = 2 % 2;
        int i2 = copydefault + 105;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(noExpiryBundleAdapter, "");
        Intrinsics.checkNotNullParameter(withExpiryResp, "");
        Function1<? super WithExpiryResp, Unit> function1 = noExpiryBundleAdapter.ShareDataUIState;
        if (function1 != null) {
            int i4 = component3 + 71;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            function1.invoke(withExpiryResp);
        }
        int i6 = component3 + 121;
        copydefault = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void $r8$lambda$FPJC6qVEWpFYCSRNHcTlcGA2FWQ(NoExpiryBundleAdapter noExpiryBundleAdapter, WithExpiryResp withExpiryResp, View view) {
        int i = 2 % 2;
        int i2 = component3 + 61;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        copydefault(noExpiryBundleAdapter, withExpiryResp, view);
        int i4 = component3 + 69;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        int i = 1 + 23;
        component2 = i % 128;
        if (i % 2 != 0) {
            int i2 = 78 / 0;
        }
    }

    private static void copydefault(NoExpiryBundleAdapter noExpiryBundleAdapter, WithExpiryResp withExpiryResp, View view) {
        int i = 2 % 2;
        int i2 = copydefault + 117;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 != 0) {
                ShareDataUIState(noExpiryBundleAdapter, withExpiryResp, view);
                Callback.onClick_exit();
                int i4 = 16 / 0;
            } else {
                ShareDataUIState(noExpiryBundleAdapter, withExpiryResp, view);
                Callback.onClick_exit();
            }
            int i5 = copydefault + 91;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }
}
