package com.huawei.digitalpayment.consumer.baselib.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.common.widget.round.RoundTextView;

public final class LayoutSafeInputKeyboardBinding implements ViewBinding {
    private static int component1 = 1;
    private static int component2;
    public final FrameLayout biometricLayout;
    private final ConstraintLayout copydefault;
    public final ImageView ivBiometric;
    public final RoundTextView tvInput0;
    public final RoundTextView tvInput1;
    public final RoundTextView tvInput2;
    public final RoundTextView tvInput3;
    public final RoundTextView tvInput4;
    public final RoundTextView tvInput5;
    public final RoundTextView tvInput6;
    public final RoundTextView tvInput7;
    public final RoundTextView tvInput8;
    public final RoundTextView tvInput9;
    public final RoundLinearLayout tvInputBack;
    public final RoundTextView tvInputForget;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component1 + 7;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        int i4 = component1 + 39;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 60 / 0;
        }
        return root;
    }

    private LayoutSafeInputKeyboardBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout, ImageView imageView, RoundTextView roundTextView, RoundTextView roundTextView2, RoundTextView roundTextView3, RoundTextView roundTextView4, RoundTextView roundTextView5, RoundTextView roundTextView6, RoundTextView roundTextView7, RoundTextView roundTextView8, RoundTextView roundTextView9, RoundTextView roundTextView10, RoundLinearLayout roundLinearLayout, RoundTextView roundTextView11) {
        this.copydefault = constraintLayout;
        this.biometricLayout = frameLayout;
        this.ivBiometric = imageView;
        this.tvInput0 = roundTextView;
        this.tvInput1 = roundTextView2;
        this.tvInput2 = roundTextView3;
        this.tvInput3 = roundTextView4;
        this.tvInput4 = roundTextView5;
        this.tvInput5 = roundTextView6;
        this.tvInput6 = roundTextView7;
        this.tvInput7 = roundTextView8;
        this.tvInput8 = roundTextView9;
        this.tvInput9 = roundTextView10;
        this.tvInputBack = roundLinearLayout;
        this.tvInputForget = roundTextView11;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component1 + 47;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ConstraintLayout constraintLayout = this.copydefault;
        int i4 = i3 + 47;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return constraintLayout;
    }

    public static LayoutSafeInputKeyboardBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 13;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        LayoutSafeInputKeyboardBinding layoutSafeInputKeyboardBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component2 + 55;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return layoutSafeInputKeyboardBindingInflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r3
  0x0021: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v5 android.view.View) binds: [B:8:0x001f, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.baselib.databinding.LayoutSafeInputKeyboardBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.baselib.databinding.LayoutSafeInputKeyboardBinding.component2
            int r1 = r1 + 33
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.baselib.databinding.LayoutSafeInputKeyboardBinding.component1 = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L18
            int r1 = com.huawei.digitalpayment.consumer.baselib.R.layout.layout_safe_input_keyboard
            r2 = 1
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L24
            goto L21
        L18:
            int r1 = com.huawei.digitalpayment.consumer.baselib.R.layout.layout_safe_input_keyboard
            r2 = 0
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L24
        L21:
            r4.addView(r3)
        L24:
            com.huawei.digitalpayment.consumer.baselib.databinding.LayoutSafeInputKeyboardBinding r3 = bind(r3)
            int r4 = com.huawei.digitalpayment.consumer.baselib.databinding.LayoutSafeInputKeyboardBinding.component2
            int r4 = r4 + 15
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.baselib.databinding.LayoutSafeInputKeyboardBinding.component1 = r5
            int r4 = r4 % r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.databinding.LayoutSafeInputKeyboardBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.baselib.databinding.LayoutSafeInputKeyboardBinding");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0095 A[PHI: r3
  0x0095: PHI (r3v13 com.huawei.common.widget.round.RoundTextView) = (r3v12 com.huawei.common.widget.round.RoundTextView), (r3v19 com.huawei.common.widget.round.RoundTextView) binds: [B:26:0x0093, B:23:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.baselib.databinding.LayoutSafeInputKeyboardBinding bind(android.view.View r20) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.databinding.LayoutSafeInputKeyboardBinding.bind(android.view.View):com.huawei.digitalpayment.consumer.baselib.databinding.LayoutSafeInputKeyboardBinding");
    }
}
