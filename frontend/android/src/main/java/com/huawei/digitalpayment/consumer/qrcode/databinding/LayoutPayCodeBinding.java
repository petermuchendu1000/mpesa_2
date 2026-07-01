package com.huawei.digitalpayment.consumer.qrcode.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.qrcode.R;

public final class LayoutPayCodeBinding implements ViewBinding {
    private static int component1 = 1;
    private static int copydefault;
    private final ConstraintLayout component2;
    public final ConstraintLayout cvScanPayView;
    public final ImageView ivBarCode;
    public final ImageView ivQrCode;
    public final ImageView ivScanHint;
    public final ImageView ivWallet;
    public final RoundTextView line2;
    public final TextView tvBalance;
    public final TextView tvTapToView;
    public final TextView tvUpdateAfterMinute;
    public final RoundTextView view7;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component1 + 63;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        int i4 = copydefault + 5;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private LayoutPayCodeBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, RoundTextView roundTextView, TextView textView, TextView textView2, TextView textView3, RoundTextView roundTextView2) {
        this.component2 = constraintLayout;
        this.cvScanPayView = constraintLayout2;
        this.ivBarCode = imageView;
        this.ivQrCode = imageView2;
        this.ivScanHint = imageView3;
        this.ivWallet = imageView4;
        this.line2 = roundTextView;
        this.tvBalance = textView;
        this.tvTapToView = textView2;
        this.tvUpdateAfterMinute = textView3;
        this.view7 = roundTextView2;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component1 + 71;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        ConstraintLayout constraintLayout = this.component2;
        int i5 = i3 + 49;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return constraintLayout;
    }

    public static LayoutPayCodeBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 47;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        LayoutPayCodeBinding layoutPayCodeBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component1 + 51;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 57 / 0;
        }
        return layoutPayCodeBindingInflate;
    }

    public static LayoutPayCodeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.layout_pay_code, viewGroup, false);
        if (!(!z)) {
            int i2 = copydefault + 57;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                viewGroup.addView(viewInflate);
                int i3 = 78 / 0;
            } else {
                viewGroup.addView(viewInflate);
            }
        }
        LayoutPayCodeBinding layoutPayCodeBindingBind = bind(viewInflate);
        int i4 = component1 + 99;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return layoutPayCodeBindingBind;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007f A[PHI: r0
  0x007f: PHI (r0v7 android.widget.TextView) = (r0v6 android.widget.TextView), (r0v10 android.widget.TextView) binds: [B:24:0x0089, B:21:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.qrcode.databinding.LayoutPayCodeBinding bind(android.view.View r14) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.qrcode.databinding.LayoutPayCodeBinding.copydefault
            int r1 = r1 + 43
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.qrcode.databinding.LayoutPayCodeBinding.component1 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto Lb3
            r4 = r14
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            int r1 = com.huawei.digitalpayment.consumer.qrcode.R.id.iv_bar_code
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r14, r1)
            r5 = r2
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            if (r5 == 0) goto L9f
            int r1 = com.huawei.digitalpayment.consumer.qrcode.R.id.iv_qr_code
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r14, r1)
            r6 = r2
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            if (r6 == 0) goto L9f
            int r1 = com.huawei.digitalpayment.consumer.qrcode.R.id.iv_scan_hint
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r14, r1)
            r7 = r2
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            if (r7 == 0) goto L9f
            int r1 = com.huawei.digitalpayment.consumer.qrcode.R.id.iv_wallet
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r14, r1)
            r8 = r2
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            if (r8 == 0) goto L9f
            int r1 = com.huawei.digitalpayment.consumer.qrcode.R.id.line2
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r14, r1)
            r9 = r2
            com.huawei.common.widget.round.RoundTextView r9 = (com.huawei.common.widget.round.RoundTextView) r9
            if (r9 == 0) goto L9f
            int r1 = com.huawei.digitalpayment.consumer.qrcode.R.id.tv_balance
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r14, r1)
            r10 = r2
            android.widget.TextView r10 = (android.widget.TextView) r10
            if (r10 == 0) goto L9f
            int r1 = com.huawei.digitalpayment.consumer.qrcode.databinding.LayoutPayCodeBinding.copydefault
            int r1 = r1 + 101
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.qrcode.databinding.LayoutPayCodeBinding.component1 = r2
            int r1 = r1 % r0
            int r1 = com.huawei.digitalpayment.consumer.qrcode.R.id.tv_tap_to_view
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r14, r1)
            r11 = r2
            android.widget.TextView r11 = (android.widget.TextView) r11
            if (r11 == 0) goto L9f
            int r1 = com.huawei.digitalpayment.consumer.qrcode.databinding.LayoutPayCodeBinding.component1
            int r1 = r1 + 1
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.qrcode.databinding.LayoutPayCodeBinding.copydefault = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L81
            int r1 = com.huawei.digitalpayment.consumer.qrcode.R.id.tv_update_after_minute
            android.view.View r0 = androidx.viewbinding.ViewBindings.findChildViewById(r14, r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2 = 6
            int r2 = r2 / 0
            if (r0 == 0) goto L9f
        L7f:
            r12 = r0
            goto L8c
        L81:
            int r1 = com.huawei.digitalpayment.consumer.qrcode.R.id.tv_update_after_minute
            android.view.View r0 = androidx.viewbinding.ViewBindings.findChildViewById(r14, r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L9f
            goto L7f
        L8c:
            int r1 = com.huawei.digitalpayment.consumer.qrcode.R.id.view7
            android.view.View r0 = androidx.viewbinding.ViewBindings.findChildViewById(r14, r1)
            r13 = r0
            com.huawei.common.widget.round.RoundTextView r13 = (com.huawei.common.widget.round.RoundTextView) r13
            if (r13 == 0) goto L9f
            com.huawei.digitalpayment.consumer.qrcode.databinding.LayoutPayCodeBinding r14 = new com.huawei.digitalpayment.consumer.qrcode.databinding.LayoutPayCodeBinding
            r2 = r14
            r3 = r4
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r14
        L9f:
            android.content.res.Resources r14 = r14.getResources()
            java.lang.String r14 = r14.getResourceName(r1)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r14 = r1.concat(r14)
            r0.<init>(r14)
            throw r0
        Lb3:
            r0 = r14
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            int r0 = com.huawei.digitalpayment.consumer.qrcode.R.id.iv_bar_code
            android.view.View r14 = androidx.viewbinding.ViewBindings.findChildViewById(r14, r0)
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            r14 = 0
            r14.hashCode()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.qrcode.databinding.LayoutPayCodeBinding.bind(android.view.View):com.huawei.digitalpayment.consumer.qrcode.databinding.LayoutPayCodeBinding");
    }
}
