package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.sfc.R;

public final class ItemOfferBundleBinding implements ViewBinding {
    private static int component1 = 1;
    private static int component2;
    private final CardView copydefault;
    public final CardView cvRoot;
    public final ImageView ivBundle;
    public final TextView tvBundleAmount;
    public final TextView tvBundleTitle;
    public final RoundTextView tvBuy;
    public final TextView tvFreshFridayBanner;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component1 + 101;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return getRoot();
        }
        getRoot();
        throw null;
    }

    private ItemOfferBundleBinding(CardView cardView, CardView cardView2, ImageView imageView, TextView textView, TextView textView2, RoundTextView roundTextView, TextView textView3) {
        this.copydefault = cardView;
        this.cvRoot = cardView2;
        this.ivBundle = imageView;
        this.tvBundleAmount = textView;
        this.tvBundleTitle = textView2;
        this.tvBuy = roundTextView;
        this.tvFreshFridayBanner = textView3;
    }

    @Override
    public CardView getRoot() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 69;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        CardView cardView = this.copydefault;
        int i5 = i2 + 61;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return cardView;
    }

    public static ItemOfferBundleBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 29;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ItemOfferBundleBinding itemOfferBundleBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component1 + 45;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return itemOfferBundleBindingInflate;
    }

    public static ItemOfferBundleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.item_offer_bundle, viewGroup, false);
        if (z) {
            int i2 = component1 + 27;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            viewGroup.addView(viewInflate);
        }
        ItemOfferBundleBinding itemOfferBundleBindingBind = bind(viewInflate);
        int i4 = component2 + 123;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return itemOfferBundleBindingBind;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005d A[PHI: r0
  0x005d: PHI (r0v4 com.huawei.common.widget.round.RoundTextView) = (r0v3 com.huawei.common.widget.round.RoundTextView), (r0v7 com.huawei.common.widget.round.RoundTextView) binds: [B:14:0x005b, B:11:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.sfc.databinding.ItemOfferBundleBinding bind(android.view.View r10) {
        /*
            r0 = 2
            int r1 = r0 % r0
            r4 = r10
            androidx.cardview.widget.CardView r4 = (androidx.cardview.widget.CardView) r4
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.iv_bundle
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r10, r1)
            r5 = r2
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            if (r5 == 0) goto L71
            int r1 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemOfferBundleBinding.component2
            int r1 = r1 + 93
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemOfferBundleBinding.component1 = r2
            int r1 = r1 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.tv_bundle_amount
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r10, r1)
            r6 = r2
            android.widget.TextView r6 = (android.widget.TextView) r6
            if (r6 == 0) goto L71
            int r1 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemOfferBundleBinding.component2
            int r1 = r1 + 97
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemOfferBundleBinding.component1 = r2
            int r1 = r1 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.tv_bundle_title
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r10, r1)
            r7 = r2
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L71
            int r1 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemOfferBundleBinding.component1
            int r1 = r1 + 97
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemOfferBundleBinding.component2 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L53
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.tv_buy
            android.view.View r0 = androidx.viewbinding.ViewBindings.findChildViewById(r10, r1)
            com.huawei.common.widget.round.RoundTextView r0 = (com.huawei.common.widget.round.RoundTextView) r0
            r2 = 43
            int r2 = r2 / 0
            if (r0 == 0) goto L71
            goto L5d
        L53:
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.tv_buy
            android.view.View r0 = androidx.viewbinding.ViewBindings.findChildViewById(r10, r1)
            com.huawei.common.widget.round.RoundTextView r0 = (com.huawei.common.widget.round.RoundTextView) r0
            if (r0 == 0) goto L71
        L5d:
            r8 = r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.tv_fresh_friday_banner
            android.view.View r0 = androidx.viewbinding.ViewBindings.findChildViewById(r10, r1)
            r9 = r0
            android.widget.TextView r9 = (android.widget.TextView) r9
            if (r9 == 0) goto L71
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemOfferBundleBinding r10 = new com.huawei.digitalpayment.consumer.sfc.databinding.ItemOfferBundleBinding
            r2 = r10
            r3 = r4
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r10
        L71:
            android.content.res.Resources r10 = r10.getResources()
            java.lang.String r10 = r10.getResourceName(r1)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r10 = r1.concat(r10)
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.databinding.ItemOfferBundleBinding.bind(android.view.View):com.huawei.digitalpayment.consumer.sfc.databinding.ItemOfferBundleBinding");
    }
}
