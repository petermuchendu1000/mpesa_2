package com.huawei.digitalpayment.checkoutUi.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.huawei.common.widget.round.RoundImageView;

public final class SfcItemSuccessFunctionBinding implements ViewBinding {
    private static int ShareDataUIState = 1;
    private static int component1;
    private final LinearLayout component3;
    public final RoundImageView ivIcon;
    public final TextView tvTitle;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component1 + 27;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return getRoot();
        }
        getRoot();
        throw null;
    }

    private SfcItemSuccessFunctionBinding(LinearLayout linearLayout, RoundImageView roundImageView, TextView textView) {
        this.component3 = linearLayout;
        this.ivIcon = roundImageView;
        this.tvTitle = textView;
    }

    @Override
    public LinearLayout getRoot() {
        LinearLayout linearLayout;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 59;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            linearLayout = this.component3;
            int i4 = 65 / 0;
        } else {
            linearLayout = this.component3;
        }
        int i5 = i3 + 91;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return linearLayout;
        }
        throw null;
    }

    public static SfcItemSuccessFunctionBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 11;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        SfcItemSuccessFunctionBinding sfcItemSuccessFunctionBindingInflate = inflate(layoutInflater, null, false);
        int i4 = ShareDataUIState + 79;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return sfcItemSuccessFunctionBindingInflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[PHI: r3
  0x0022: PHI (r3v4 android.view.View) = (r3v1 android.view.View), (r3v5 android.view.View) binds: [B:8:0x0020, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.checkoutUi.databinding.SfcItemSuccessFunctionBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.checkoutUi.databinding.SfcItemSuccessFunctionBinding.ShareDataUIState
            int r1 = r1 + 23
            int r2 = r1 % 128
            com.huawei.digitalpayment.checkoutUi.databinding.SfcItemSuccessFunctionBinding.component1 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L1a
            int r1 = com.huawei.digitalpayment.checkoutUi.R.layout.sfc_item_success_function
            android.view.View r3 = r3.inflate(r1, r4, r2)
            r5 = r5 ^ 1
            if (r5 == 0) goto L22
            goto L25
        L1a:
            int r1 = com.huawei.digitalpayment.checkoutUi.R.layout.sfc_item_success_function
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L25
        L22:
            r4.addView(r3)
        L25:
            com.huawei.digitalpayment.checkoutUi.databinding.SfcItemSuccessFunctionBinding r3 = bind(r3)
            int r4 = com.huawei.digitalpayment.checkoutUi.databinding.SfcItemSuccessFunctionBinding.component1
            int r4 = r4 + 47
            int r5 = r4 % 128
            com.huawei.digitalpayment.checkoutUi.databinding.SfcItemSuccessFunctionBinding.ShareDataUIState = r5
            int r4 = r4 % r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkoutUi.databinding.SfcItemSuccessFunctionBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.checkoutUi.databinding.SfcItemSuccessFunctionBinding");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        if (r3 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        r1 = new com.huawei.digitalpayment.checkoutUi.databinding.SfcItemSuccessFunctionBinding((android.widget.LinearLayout) r5, r2, r3);
        r5 = com.huawei.digitalpayment.checkoutUi.databinding.SfcItemSuccessFunctionBinding.ShareDataUIState + 15;
        com.huawei.digitalpayment.checkoutUi.databinding.SfcItemSuccessFunctionBinding.component1 = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:
    
        if ((r5 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002d, code lost:
    
        if (r3 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.checkoutUi.databinding.SfcItemSuccessFunctionBinding bind(android.view.View r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.checkoutUi.databinding.SfcItemSuccessFunctionBinding.ShareDataUIState
            int r1 = r1 + 107
            int r2 = r1 % 128
            com.huawei.digitalpayment.checkoutUi.databinding.SfcItemSuccessFunctionBinding.component1 = r2
            int r1 = r1 % r0
            int r1 = com.huawei.digitalpayment.checkoutUi.R.id.iv_icon
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r5, r1)
            com.huawei.common.widget.round.RoundImageView r2 = (com.huawei.common.widget.round.RoundImageView) r2
            if (r2 == 0) goto L4f
            int r1 = com.huawei.digitalpayment.checkoutUi.databinding.SfcItemSuccessFunctionBinding.component1
            int r1 = r1 + 117
            int r3 = r1 % 128
            com.huawei.digitalpayment.checkoutUi.databinding.SfcItemSuccessFunctionBinding.ShareDataUIState = r3
            int r1 = r1 % r0
            if (r1 != 0) goto L30
            int r1 = com.huawei.digitalpayment.checkoutUi.R.id.tv_title
            android.view.View r3 = androidx.viewbinding.ViewBindings.findChildViewById(r5, r1)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r4 = 55
            int r4 = r4 / 0
            if (r3 == 0) goto L4f
            goto L3a
        L30:
            int r1 = com.huawei.digitalpayment.checkoutUi.R.id.tv_title
            android.view.View r3 = androidx.viewbinding.ViewBindings.findChildViewById(r5, r1)
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 == 0) goto L4f
        L3a:
            com.huawei.digitalpayment.checkoutUi.databinding.SfcItemSuccessFunctionBinding r1 = new com.huawei.digitalpayment.checkoutUi.databinding.SfcItemSuccessFunctionBinding
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r1.<init>(r5, r2, r3)
            int r5 = com.huawei.digitalpayment.checkoutUi.databinding.SfcItemSuccessFunctionBinding.ShareDataUIState
            int r5 = r5 + 15
            int r2 = r5 % 128
            com.huawei.digitalpayment.checkoutUi.databinding.SfcItemSuccessFunctionBinding.component1 = r2
            int r5 = r5 % r0
            if (r5 != 0) goto L4d
            return r1
        L4d:
            r5 = 0
            throw r5
        L4f:
            android.content.res.Resources r5 = r5.getResources()
            java.lang.String r5 = r5.getResourceName(r1)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r5 = r1.concat(r5)
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkoutUi.databinding.SfcItemSuccessFunctionBinding.bind(android.view.View):com.huawei.digitalpayment.checkoutUi.databinding.SfcItemSuccessFunctionBinding");
    }
}
