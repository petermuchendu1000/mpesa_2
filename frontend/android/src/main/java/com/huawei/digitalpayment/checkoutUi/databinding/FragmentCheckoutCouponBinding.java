package com.huawei.digitalpayment.checkoutUi.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundConstraintLayout;

public final class FragmentCheckoutCouponBinding implements ViewBinding {
    private static int component3 = 0;
    private static int copydefault = 1;
    private final RelativeLayout component2;
    public final ImageView imTips;
    public final ImageView ivBack;
    public final LoadingButton lbNext;
    public final RoundConstraintLayout rlContent;
    public final RecyclerView rvList;
    public final TextView tvTitle;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 75;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        RelativeLayout root = getRoot();
        int i4 = component3 + 41;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 0 / 0;
        }
        return root;
    }

    private FragmentCheckoutCouponBinding(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, LoadingButton loadingButton, RoundConstraintLayout roundConstraintLayout, RecyclerView recyclerView, TextView textView) {
        this.component2 = relativeLayout;
        this.imTips = imageView;
        this.ivBack = imageView2;
        this.lbNext = loadingButton;
        this.rlContent = roundConstraintLayout;
        this.rvList = recyclerView;
        this.tvTitle = textView;
    }

    @Override
    public RelativeLayout getRoot() {
        int i = 2 % 2;
        int i2 = copydefault + 93;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        RelativeLayout relativeLayout = this.component2;
        int i5 = i3 + 27;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return relativeLayout;
    }

    public static FragmentCheckoutCouponBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 29;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return inflate(layoutInflater, null, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r3
  0x0021: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v5 android.view.View) binds: [B:8:0x001f, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.checkoutUi.databinding.FragmentCheckoutCouponBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.checkoutUi.databinding.FragmentCheckoutCouponBinding.copydefault
            int r1 = r1 + 45
            int r2 = r1 % 128
            com.huawei.digitalpayment.checkoutUi.databinding.FragmentCheckoutCouponBinding.component3 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L18
            int r1 = com.huawei.digitalpayment.checkoutUi.R.layout.fragment_checkout_coupon
            r2 = 1
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L2d
            goto L21
        L18:
            int r1 = com.huawei.digitalpayment.checkoutUi.R.layout.fragment_checkout_coupon
            r2 = 0
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L2d
        L21:
            r4.addView(r3)
            int r4 = com.huawei.digitalpayment.checkoutUi.databinding.FragmentCheckoutCouponBinding.copydefault
            int r4 = r4 + 103
            int r5 = r4 % 128
            com.huawei.digitalpayment.checkoutUi.databinding.FragmentCheckoutCouponBinding.component3 = r5
            int r4 = r4 % r0
        L2d:
            com.huawei.digitalpayment.checkoutUi.databinding.FragmentCheckoutCouponBinding r3 = bind(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkoutUi.databinding.FragmentCheckoutCouponBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.checkoutUi.databinding.FragmentCheckoutCouponBinding");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[PHI: r2
  0x0027: PHI (r2v3 android.widget.ImageView) = (r2v2 android.widget.ImageView), (r2v12 android.widget.ImageView) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.checkoutUi.databinding.FragmentCheckoutCouponBinding bind(android.view.View r11) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.checkoutUi.databinding.FragmentCheckoutCouponBinding.copydefault
            int r1 = r1 + 107
            int r2 = r1 % 128
            com.huawei.digitalpayment.checkoutUi.databinding.FragmentCheckoutCouponBinding.component3 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L1d
            int r1 = com.huawei.digitalpayment.checkoutUi.R.id.im_tips
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r11, r1)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r3 = 27
            int r3 = r3 / 0
            if (r2 == 0) goto L9c
            goto L27
        L1d:
            int r1 = com.huawei.digitalpayment.checkoutUi.R.id.im_tips
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r11, r1)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            if (r2 == 0) goto L9c
        L27:
            r5 = r2
            int r1 = com.huawei.digitalpayment.checkoutUi.R.id.iv_back
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r11, r1)
            r6 = r2
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            if (r6 == 0) goto L9c
            int r1 = com.huawei.digitalpayment.checkoutUi.databinding.FragmentCheckoutCouponBinding.copydefault
            int r1 = r1 + 91
            int r2 = r1 % 128
            com.huawei.digitalpayment.checkoutUi.databinding.FragmentCheckoutCouponBinding.component3 = r2
            int r1 = r1 % r0
            int r1 = com.huawei.digitalpayment.checkoutUi.R.id.lb_next
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r11, r1)
            r7 = r2
            com.huawei.common.widget.LoadingButton r7 = (com.huawei.common.widget.LoadingButton) r7
            if (r7 == 0) goto L9c
            int r1 = com.huawei.digitalpayment.checkoutUi.databinding.FragmentCheckoutCouponBinding.component3
            int r1 = r1 + 67
            int r2 = r1 % 128
            com.huawei.digitalpayment.checkoutUi.databinding.FragmentCheckoutCouponBinding.copydefault = r2
            int r1 = r1 % r0
            int r1 = com.huawei.digitalpayment.checkoutUi.R.id.rl_content
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r11, r1)
            r8 = r2
            com.huawei.common.widget.round.RoundConstraintLayout r8 = (com.huawei.common.widget.round.RoundConstraintLayout) r8
            if (r8 == 0) goto L9c
            int r1 = com.huawei.digitalpayment.checkoutUi.databinding.FragmentCheckoutCouponBinding.component3
            int r1 = r1 + 121
            int r2 = r1 % 128
            com.huawei.digitalpayment.checkoutUi.databinding.FragmentCheckoutCouponBinding.copydefault = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L93
            int r1 = com.huawei.digitalpayment.checkoutUi.R.id.rv_list
            android.view.View r3 = androidx.viewbinding.ViewBindings.findChildViewById(r11, r1)
            r9 = r3
            androidx.recyclerview.widget.RecyclerView r9 = (androidx.recyclerview.widget.RecyclerView) r9
            if (r9 == 0) goto L9c
            int r1 = com.huawei.digitalpayment.checkoutUi.R.id.tv_title
            android.view.View r3 = androidx.viewbinding.ViewBindings.findChildViewById(r11, r1)
            r10 = r3
            android.widget.TextView r10 = (android.widget.TextView) r10
            if (r10 == 0) goto L9c
            com.huawei.digitalpayment.checkoutUi.databinding.FragmentCheckoutCouponBinding r1 = new com.huawei.digitalpayment.checkoutUi.databinding.FragmentCheckoutCouponBinding
            r4 = r11
            android.widget.RelativeLayout r4 = (android.widget.RelativeLayout) r4
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            int r11 = com.huawei.digitalpayment.checkoutUi.databinding.FragmentCheckoutCouponBinding.copydefault
            int r11 = r11 + 23
            int r3 = r11 % 128
            com.huawei.digitalpayment.checkoutUi.databinding.FragmentCheckoutCouponBinding.component3 = r3
            int r11 = r11 % r0
            if (r11 != 0) goto L92
            return r1
        L92:
            throw r2
        L93:
            int r0 = com.huawei.digitalpayment.checkoutUi.R.id.rv_list
            android.view.View r11 = androidx.viewbinding.ViewBindings.findChildViewById(r11, r0)
            androidx.recyclerview.widget.RecyclerView r11 = (androidx.recyclerview.widget.RecyclerView) r11
            throw r2
        L9c:
            android.content.res.Resources r11 = r11.getResources()
            java.lang.String r11 = r11.getResourceName(r1)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r11 = r1.concat(r11)
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkoutUi.databinding.FragmentCheckoutCouponBinding.bind(android.view.View):com.huawei.digitalpayment.checkoutUi.databinding.FragmentCheckoutCouponBinding");
    }
}
