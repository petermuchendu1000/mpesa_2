package com.huawei.digitalpayment.checkoutModule.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.checkoutModule.R;

public final class LayoutQuickpayReceiptBinding implements ViewBinding {
    private static int ShareDataUIState = 1;
    private static int component3;
    public final ConstraintLayout clContent;
    public final ConstraintLayout clTitle;
    private final FrameLayout copydefault;
    public final View dashLine;
    public final ImageView ivKbzpay;
    public final LinearLayout llDetails;
    public final RoundImageView semicircleLeft;
    public final RoundImageView semicircleRight;
    public final TextView tvAmount;
    public final TextView tvCurrency;
    public final TextView tvReceiptTitle;
    public final TextView tvThanks;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 109;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FrameLayout root = getRoot();
        int i4 = component3 + 61;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private LayoutQuickpayReceiptBinding(FrameLayout frameLayout, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, View view, ImageView imageView, LinearLayout linearLayout, RoundImageView roundImageView, RoundImageView roundImageView2, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.copydefault = frameLayout;
        this.clContent = constraintLayout;
        this.clTitle = constraintLayout2;
        this.dashLine = view;
        this.ivKbzpay = imageView;
        this.llDetails = linearLayout;
        this.semicircleLeft = roundImageView;
        this.semicircleRight = roundImageView2;
        this.tvAmount = textView;
        this.tvCurrency = textView2;
        this.tvReceiptTitle = textView3;
        this.tvThanks = textView4;
    }

    @Override
    public FrameLayout getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 1;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        FrameLayout frameLayout = this.copydefault;
        int i4 = i3 + 55;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return frameLayout;
    }

    public static LayoutQuickpayReceiptBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 95;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        LayoutQuickpayReceiptBinding layoutQuickpayReceiptBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component3 + 63;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return layoutQuickpayReceiptBindingInflate;
        }
        throw null;
    }

    public static LayoutQuickpayReceiptBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 107;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.layout_quickpay_receipt, viewGroup, false);
        if (z) {
            int i4 = component3 + 113;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0029 A[PHI: r3
  0x0029: PHI (r3v3 androidx.constraintlayout.widget.ConstraintLayout) = (r3v2 androidx.constraintlayout.widget.ConstraintLayout), (r3v19 androidx.constraintlayout.widget.ConstraintLayout) binds: [B:8:0x0027, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.checkoutModule.databinding.LayoutQuickpayReceiptBinding bind(android.view.View r17) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkoutModule.databinding.LayoutQuickpayReceiptBinding.bind(android.view.View):com.huawei.digitalpayment.checkoutModule.databinding.LayoutQuickpayReceiptBinding");
    }
}
