package com.huawei.digitalpayment.consumer.baseui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.baseui.R;

public final class LayoutSafeInputKeyboardLoginBinding implements ViewBinding {
    private static int component1 = 0;
    private static int component3 = 1;
    public final FrameLayout biometricLayout;
    private final ConstraintLayout component2;
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
        int i2 = component1 + 115;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        int i4 = component1 + 39;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 50 / 0;
        }
        return root;
    }

    private LayoutSafeInputKeyboardLoginBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout, ImageView imageView, RoundTextView roundTextView, RoundTextView roundTextView2, RoundTextView roundTextView3, RoundTextView roundTextView4, RoundTextView roundTextView5, RoundTextView roundTextView6, RoundTextView roundTextView7, RoundTextView roundTextView8, RoundTextView roundTextView9, RoundTextView roundTextView10, RoundLinearLayout roundLinearLayout, RoundTextView roundTextView11) {
        this.component2 = constraintLayout;
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
        int i2 = component1;
        int i3 = i2 + 99;
        component3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        ConstraintLayout constraintLayout = this.component2;
        int i4 = i2 + 79;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return constraintLayout;
        }
        obj.hashCode();
        throw null;
    }

    public static LayoutSafeInputKeyboardLoginBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 105;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return inflate(layoutInflater, null, false);
    }

    public static LayoutSafeInputKeyboardLoginBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.layout_safe_input_keyboard_login, viewGroup, false);
        if (z) {
            int i2 = component1 + 43;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            viewGroup.addView(viewInflate);
            int i4 = component3 + 55;
            component1 = i4 % 128;
            int i5 = i4 % 2;
        }
        LayoutSafeInputKeyboardLoginBinding layoutSafeInputKeyboardLoginBindingBind = bind(viewInflate);
        int i6 = component3 + 121;
        component1 = i6 % 128;
        if (i6 % 2 == 0) {
            return layoutSafeInputKeyboardLoginBindingBind;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a3 A[PHI: r4
  0x00a3: PHI (r4v11 com.huawei.common.widget.round.RoundTextView) = (r4v10 com.huawei.common.widget.round.RoundTextView), (r4v20 com.huawei.common.widget.round.RoundTextView) binds: [B:30:0x00a1, B:27:0x0096] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.baseui.databinding.LayoutSafeInputKeyboardLoginBinding bind(android.view.View r20) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baseui.databinding.LayoutSafeInputKeyboardLoginBinding.bind(android.view.View):com.huawei.digitalpayment.consumer.baseui.databinding.LayoutSafeInputKeyboardLoginBinding");
    }
}
