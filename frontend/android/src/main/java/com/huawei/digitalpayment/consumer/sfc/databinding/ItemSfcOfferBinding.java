package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.huawei.digitalpayment.consumer.sfc.R;

public final class ItemSfcOfferBinding implements ViewBinding {
    private static int ShareDataUIState = 1;
    private static int component2;
    public final CardView cardView2;
    private final FrameLayout component3;
    public final LinearLayout contentContainer;
    public final View headerBackground;
    public final TextView tvBundleTitle;
    public final TextView tvPromotionTitle;
    public final TextView tvTimer;
    public final TextView tvValidity;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 23;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FrameLayout root = getRoot();
        int i4 = ShareDataUIState + 115;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private ItemSfcOfferBinding(FrameLayout frameLayout, CardView cardView, LinearLayout linearLayout, View view, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.component3 = frameLayout;
        this.cardView2 = cardView;
        this.contentContainer = linearLayout;
        this.headerBackground = view;
        this.tvBundleTitle = textView;
        this.tvPromotionTitle = textView2;
        this.tvTimer = textView3;
        this.tvValidity = textView4;
    }

    @Override
    public FrameLayout getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 61;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        FrameLayout frameLayout = this.component3;
        int i5 = i3 + 87;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return frameLayout;
    }

    public static ItemSfcOfferBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 89;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return inflate(layoutInflater, null, false);
    }

    public static ItemSfcOfferBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 95;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.item_sfc_offer, viewGroup, false);
        if (z) {
            int i4 = component2 + 71;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            viewGroup.addView(viewInflate);
        }
        ItemSfcOfferBinding itemSfcOfferBindingBind = bind(viewInflate);
        int i6 = component2 + 99;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        return itemSfcOfferBindingBind;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0072 A[PHI: r3
  0x0072: PHI (r3v6 android.widget.TextView) = (r3v5 android.widget.TextView), (r3v11 android.widget.TextView) binds: [B:22:0x0070, B:19:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.sfc.databinding.ItemSfcOfferBinding bind(android.view.View r12) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.cardView2
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r1)
            r5 = r2
            androidx.cardview.widget.CardView r5 = (androidx.cardview.widget.CardView) r5
            if (r5 == 0) goto La3
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.content_container
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r1)
            r6 = r2
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            if (r6 == 0) goto La3
            int r1 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemSfcOfferBinding.ShareDataUIState
            int r1 = r1 + 73
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemSfcOfferBinding.component2 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L9d
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.header_background
            android.view.View r7 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r1)
            if (r7 == 0) goto La3
            int r1 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemSfcOfferBinding.component2
            int r1 = r1 + 43
            int r3 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemSfcOfferBinding.ShareDataUIState = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L94
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.tv_bundle_title
            android.view.View r3 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r1)
            r8 = r3
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r8 == 0) goto La3
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.tv_promotion_title
            android.view.View r3 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r1)
            r9 = r3
            android.widget.TextView r9 = (android.widget.TextView) r9
            if (r9 == 0) goto La3
            int r1 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemSfcOfferBinding.component2
            int r1 = r1 + 85
            int r3 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemSfcOfferBinding.ShareDataUIState = r3
            int r1 = r1 % r0
            if (r1 != 0) goto L68
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.tv_timer
            android.view.View r3 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r1)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r4 = 21
            int r4 = r4 / 0
            if (r3 == 0) goto La3
            goto L72
        L68:
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.tv_timer
            android.view.View r3 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r1)
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 == 0) goto La3
        L72:
            r10 = r3
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.tv_validity
            android.view.View r3 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r1)
            r11 = r3
            android.widget.TextView r11 = (android.widget.TextView) r11
            if (r11 == 0) goto La3
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemSfcOfferBinding r1 = new com.huawei.digitalpayment.consumer.sfc.databinding.ItemSfcOfferBinding
            r4 = r12
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            int r12 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemSfcOfferBinding.ShareDataUIState
            int r12 = r12 + 49
            int r3 = r12 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemSfcOfferBinding.component2 = r3
            int r12 = r12 % r0
            if (r12 != 0) goto L93
            return r1
        L93:
            throw r2
        L94:
            int r0 = com.huawei.digitalpayment.consumer.sfc.R.id.tv_bundle_title
            android.view.View r12 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r0)
            android.widget.TextView r12 = (android.widget.TextView) r12
            throw r2
        L9d:
            int r0 = com.huawei.digitalpayment.consumer.sfc.R.id.header_background
            androidx.viewbinding.ViewBindings.findChildViewById(r12, r0)
            throw r2
        La3:
            android.content.res.Resources r12 = r12.getResources()
            java.lang.String r12 = r12.getResourceName(r1)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r12 = r1.concat(r12)
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.databinding.ItemSfcOfferBinding.bind(android.view.View):com.huawei.digitalpayment.consumer.sfc.databinding.ItemSfcOfferBinding");
    }
}
