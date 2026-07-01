package com.huawei.digitalpayment.checkoutUi.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.common.widget.text.AmountDisplayView;
import com.huawei.digitalpayment.consumer.baselib.widget.code.CodeEditText;
import com.huawei.digitalpayment.consumer.baselib.widget.code.SafeInputKeyboard;

public final class FragmentPayPinBinding implements ViewBinding {
    private static int component1 = 0;
    private static int component3 = 1;
    public final AmountDisplayView amountDisplayView;
    public final ConstraintLayout clContent;
    private final ConstraintLayout component2;
    public final CodeEditText editPin;
    public final ImageView imPayMethod;
    public final RoundImageView ivClose;
    public final LinearLayout llDisplay;
    public final LinearLayout llNote;
    public final RoundTextView tvDes;
    public final RoundTextView tvDisplayItems;
    public final RoundTextView tvNote;
    public final RoundTextView tvPayMethod;
    public final RoundTextView tvSubTitle;
    public final RoundTextView tvTitle;
    public final SafeInputKeyboard virtualKeyboardView;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component1 + 125;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        if (i3 == 0) {
            int i4 = 1 / 0;
        }
        return root;
    }

    private FragmentPayPinBinding(ConstraintLayout constraintLayout, AmountDisplayView amountDisplayView, ConstraintLayout constraintLayout2, CodeEditText codeEditText, ImageView imageView, RoundImageView roundImageView, LinearLayout linearLayout, LinearLayout linearLayout2, RoundTextView roundTextView, RoundTextView roundTextView2, RoundTextView roundTextView3, RoundTextView roundTextView4, RoundTextView roundTextView5, RoundTextView roundTextView6, SafeInputKeyboard safeInputKeyboard) {
        this.component2 = constraintLayout;
        this.amountDisplayView = amountDisplayView;
        this.clContent = constraintLayout2;
        this.editPin = codeEditText;
        this.imPayMethod = imageView;
        this.ivClose = roundImageView;
        this.llDisplay = linearLayout;
        this.llNote = linearLayout2;
        this.tvDes = roundTextView;
        this.tvDisplayItems = roundTextView2;
        this.tvNote = roundTextView3;
        this.tvPayMethod = roundTextView4;
        this.tvSubTitle = roundTextView5;
        this.tvTitle = roundTextView6;
        this.virtualKeyboardView = safeInputKeyboard;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 121;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        ConstraintLayout constraintLayout = this.component2;
        int i5 = i2 + 29;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return constraintLayout;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static FragmentPayPinBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 29;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentPayPinBinding fragmentPayPinBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component1 + 117;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return fragmentPayPinBindingInflate;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r3
  0x0020: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v5 android.view.View) binds: [B:8:0x001e, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.checkoutUi.databinding.FragmentPayPinBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.checkoutUi.databinding.FragmentPayPinBinding.component1
            int r1 = r1 + 29
            int r2 = r1 % 128
            com.huawei.digitalpayment.checkoutUi.databinding.FragmentPayPinBinding.component3 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L18
            int r1 = com.huawei.digitalpayment.checkoutUi.R.layout.fragment_pay_pin
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L39
            goto L20
        L18:
            int r1 = com.huawei.digitalpayment.checkoutUi.R.layout.fragment_pay_pin
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L39
        L20:
            int r5 = com.huawei.digitalpayment.checkoutUi.databinding.FragmentPayPinBinding.component3
            int r5 = r5 + 119
            int r1 = r5 % 128
            com.huawei.digitalpayment.checkoutUi.databinding.FragmentPayPinBinding.component1 = r1
            int r5 = r5 % r0
            r4.addView(r3)
            int r4 = com.huawei.digitalpayment.checkoutUi.databinding.FragmentPayPinBinding.component3
            int r4 = r4 + 15
            int r5 = r4 % 128
            com.huawei.digitalpayment.checkoutUi.databinding.FragmentPayPinBinding.component1 = r5
            int r4 = r4 % r0
            if (r4 == 0) goto L39
            r4 = 3
            int r4 = r4 % r0
        L39:
            com.huawei.digitalpayment.checkoutUi.databinding.FragmentPayPinBinding r3 = bind(r3)
            int r4 = com.huawei.digitalpayment.checkoutUi.databinding.FragmentPayPinBinding.component3
            int r4 = r4 + 37
            int r5 = r4 % 128
            com.huawei.digitalpayment.checkoutUi.databinding.FragmentPayPinBinding.component1 = r5
            int r4 = r4 % r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkoutUi.databinding.FragmentPayPinBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.checkoutUi.databinding.FragmentPayPinBinding");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0061 A[PHI: r3
  0x0061: PHI (r3v8 android.widget.LinearLayout) = (r3v7 android.widget.LinearLayout), (r3v25 android.widget.LinearLayout) binds: [B:16:0x005f, B:13:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086 A[PHI: r3
  0x0086: PHI (r3v12 android.widget.LinearLayout) = (r3v11 android.widget.LinearLayout), (r3v23 android.widget.LinearLayout) binds: [B:23:0x0084, B:20:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.checkoutUi.databinding.FragmentPayPinBinding bind(android.view.View r20) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkoutUi.databinding.FragmentPayPinBinding.bind(android.view.View):com.huawei.digitalpayment.checkoutUi.databinding.FragmentPayPinBinding");
    }
}
