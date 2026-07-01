package com.huawei.digitalpayment.consumer.baseui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.digitalpayment.consumer.baseui.R;

public final class LayoutSafeInputKeyboardOtpBinding implements ViewBinding {
    private static int component2 = 0;
    private static int copydefault = 1;
    public final FrameLayout biometricLayout;
    private final ConstraintLayout component1;
    public final ImageView ivBiometric;
    public final TextView tvInput0;
    public final TextView tvInput1;
    public final TextView tvInput2;
    public final TextView tvInput3;
    public final TextView tvInput4;
    public final TextView tvInput5;
    public final TextView tvInput6;
    public final TextView tvInput7;
    public final TextView tvInput8;
    public final TextView tvInput9;
    public final RoundLinearLayout tvInputBack;
    public final TextView tvInputForget;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component2 + 23;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        int i4 = copydefault + 57;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 38 / 0;
        }
        return root;
    }

    private LayoutSafeInputKeyboardOtpBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, RoundLinearLayout roundLinearLayout, TextView textView11) {
        this.component1 = constraintLayout;
        this.biometricLayout = frameLayout;
        this.ivBiometric = imageView;
        this.tvInput0 = textView;
        this.tvInput1 = textView2;
        this.tvInput2 = textView3;
        this.tvInput3 = textView4;
        this.tvInput4 = textView5;
        this.tvInput5 = textView6;
        this.tvInput6 = textView7;
        this.tvInput7 = textView8;
        this.tvInput8 = textView9;
        this.tvInput9 = textView10;
        this.tvInputBack = roundLinearLayout;
        this.tvInputForget = textView11;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component2 + 21;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        ConstraintLayout constraintLayout = this.component1;
        int i4 = i3 + 123;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return constraintLayout;
    }

    public static LayoutSafeInputKeyboardOtpBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 65;
        copydefault = i2 % 128;
        return inflate(layoutInflater, null, i2 % 2 == 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r4
  0x0020: PHI (r4v2 android.view.View) = (r4v1 android.view.View), (r4v5 android.view.View) binds: [B:8:0x001e, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.baseui.databinding.LayoutSafeInputKeyboardOtpBinding inflate(android.view.LayoutInflater r4, android.view.ViewGroup r5, boolean r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.baseui.databinding.LayoutSafeInputKeyboardOtpBinding.copydefault
            r2 = 1
            int r1 = r1 + r2
            int r3 = r1 % 128
            com.huawei.digitalpayment.consumer.baseui.databinding.LayoutSafeInputKeyboardOtpBinding.component2 = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L17
            int r1 = com.huawei.digitalpayment.consumer.baseui.R.layout.layout_safe_input_keyboard_otp
            android.view.View r4 = r4.inflate(r1, r5, r2)
            if (r6 == 0) goto L23
            goto L20
        L17:
            int r1 = com.huawei.digitalpayment.consumer.baseui.R.layout.layout_safe_input_keyboard_otp
            r2 = 0
            android.view.View r4 = r4.inflate(r1, r5, r2)
            if (r6 == 0) goto L23
        L20:
            r5.addView(r4)
        L23:
            com.huawei.digitalpayment.consumer.baseui.databinding.LayoutSafeInputKeyboardOtpBinding r4 = bind(r4)
            int r5 = com.huawei.digitalpayment.consumer.baseui.databinding.LayoutSafeInputKeyboardOtpBinding.component2
            int r5 = r5 + 107
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.baseui.databinding.LayoutSafeInputKeyboardOtpBinding.copydefault = r6
            int r5 = r5 % r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baseui.databinding.LayoutSafeInputKeyboardOtpBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.baseui.databinding.LayoutSafeInputKeyboardOtpBinding");
    }

    public static LayoutSafeInputKeyboardOtpBinding bind(View view) {
        int i = 2 % 2;
        int i2 = R.id.biometricLayout;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i2);
        if (frameLayout != null) {
            i2 = R.id.ivBiometric;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i2);
            if (imageView != null) {
                int i3 = component2 + 87;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                i2 = R.id.tv_input_0;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i2);
                if (textView != null) {
                    i2 = R.id.tv_input_1;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i2);
                    if (textView2 != null) {
                        int i5 = copydefault + 29;
                        component2 = i5 % 128;
                        Object obj = null;
                        if (i5 % 2 != 0) {
                            obj.hashCode();
                            throw null;
                        }
                        i2 = R.id.tv_input_2;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i2);
                        if (textView3 != null) {
                            i2 = R.id.tv_input_3;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i2);
                            if (textView4 != null) {
                                i2 = R.id.tv_input_4;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i2);
                                if (textView5 != null) {
                                    int i6 = copydefault + 87;
                                    component2 = i6 % 128;
                                    if (i6 % 2 != 0) {
                                        throw null;
                                    }
                                    i2 = R.id.tv_input_5;
                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i2);
                                    if (textView6 != null) {
                                        int i7 = component2 + 31;
                                        copydefault = i7 % 128;
                                        int i8 = i7 % 2;
                                        i2 = R.id.tv_input_6;
                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i2);
                                        if (textView7 != null) {
                                            i2 = R.id.tv_input_7;
                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i2);
                                            if (textView8 != null) {
                                                i2 = R.id.tv_input_8;
                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(view, i2);
                                                if (textView9 != null) {
                                                    i2 = R.id.tv_input_9;
                                                    TextView textView10 = (TextView) ViewBindings.findChildViewById(view, i2);
                                                    if (textView10 != null) {
                                                        i2 = R.id.tv_input_back;
                                                        RoundLinearLayout roundLinearLayout = (RoundLinearLayout) ViewBindings.findChildViewById(view, i2);
                                                        if (roundLinearLayout != null) {
                                                            i2 = R.id.tv_input_forget;
                                                            TextView textView11 = (TextView) ViewBindings.findChildViewById(view, i2);
                                                            if (textView11 != null) {
                                                                return new LayoutSafeInputKeyboardOtpBinding((ConstraintLayout) view, frameLayout, imageView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, roundLinearLayout, textView11);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
