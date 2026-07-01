package com.huawei.digitalpayment.checkoutUi.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundTextView;

public final class ItemCheckoutCouponBinding implements ViewBinding {
    private static int component1 = 0;
    private static int component2 = 1;
    private final ConstraintLayout ShareDataUIState;
    public final RoundConstraintLayout clContent;
    public final ImageView dashLine;
    public final ImageView imBottom;
    public final ImageView imSelect;
    public final ImageView imTop;
    public final RelativeLayout rlDash;
    public final RoundTextView tvAmount;
    public final TextView tvCouponHint;
    public final TextView tvCouponName;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component1 + 123;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        int i4 = component2 + 87;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 52 / 0;
        }
        return root;
    }

    private ItemCheckoutCouponBinding(ConstraintLayout constraintLayout, RoundConstraintLayout roundConstraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, RelativeLayout relativeLayout, RoundTextView roundTextView, TextView textView, TextView textView2) {
        this.ShareDataUIState = constraintLayout;
        this.clContent = roundConstraintLayout;
        this.dashLine = imageView;
        this.imBottom = imageView2;
        this.imSelect = imageView3;
        this.imTop = imageView4;
        this.rlDash = relativeLayout;
        this.tvAmount = roundTextView;
        this.tvCouponHint = textView;
        this.tvCouponName = textView2;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 103;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        ConstraintLayout constraintLayout = this.ShareDataUIState;
        int i5 = i2 + 123;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return constraintLayout;
    }

    public static ItemCheckoutCouponBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 97;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ItemCheckoutCouponBinding itemCheckoutCouponBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component1 + 83;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return itemCheckoutCouponBindingInflate;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r3
  0x0021: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v5 android.view.View) binds: [B:8:0x001f, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.checkoutUi.databinding.ItemCheckoutCouponBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.checkoutUi.databinding.ItemCheckoutCouponBinding.component2
            int r1 = r1 + 21
            int r2 = r1 % 128
            com.huawei.digitalpayment.checkoutUi.databinding.ItemCheckoutCouponBinding.component1 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L18
            int r1 = com.huawei.digitalpayment.checkoutUi.R.layout.item_checkout_coupon
            r2 = 1
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L36
            goto L21
        L18:
            int r1 = com.huawei.digitalpayment.checkoutUi.R.layout.item_checkout_coupon
            r2 = 0
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L36
        L21:
            int r5 = com.huawei.digitalpayment.checkoutUi.databinding.ItemCheckoutCouponBinding.component1
            int r5 = r5 + 35
            int r1 = r5 % 128
            com.huawei.digitalpayment.checkoutUi.databinding.ItemCheckoutCouponBinding.component2 = r1
            int r5 = r5 % r0
            r4.addView(r3)
            int r4 = com.huawei.digitalpayment.checkoutUi.databinding.ItemCheckoutCouponBinding.component2
            int r4 = r4 + 65
            int r5 = r4 % 128
            com.huawei.digitalpayment.checkoutUi.databinding.ItemCheckoutCouponBinding.component1 = r5
            int r4 = r4 % r0
        L36:
            com.huawei.digitalpayment.checkoutUi.databinding.ItemCheckoutCouponBinding r3 = bind(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkoutUi.databinding.ItemCheckoutCouponBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.checkoutUi.databinding.ItemCheckoutCouponBinding");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a1, code lost:
    
        if (r0 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ac, code lost:
    
        if (r0 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b8, code lost:
    
        return new com.huawei.digitalpayment.checkoutUi.databinding.ItemCheckoutCouponBinding((androidx.constraintlayout.widget.ConstraintLayout) r14, r5, r6, r7, r8, r9, r10, r11, r12, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072 A[PHI: r2
  0x0072: PHI (r2v11 com.huawei.common.widget.round.RoundTextView) = (r2v10 com.huawei.common.widget.round.RoundTextView), (r2v17 com.huawei.common.widget.round.RoundTextView) binds: [B:22:0x007c, B:19:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.checkoutUi.databinding.ItemCheckoutCouponBinding bind(android.view.View r14) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkoutUi.databinding.ItemCheckoutCouponBinding.bind(android.view.View):com.huawei.digitalpayment.checkoutUi.databinding.ItemCheckoutCouponBinding");
    }
}
