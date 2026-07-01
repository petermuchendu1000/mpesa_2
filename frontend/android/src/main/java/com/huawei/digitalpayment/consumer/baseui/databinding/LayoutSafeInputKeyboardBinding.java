package com.huawei.digitalpayment.consumer.baseui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.digitalpayment.consumer.baseui.R;

public final class LayoutSafeInputKeyboardBinding implements ViewBinding {
    private static int component1 = 0;
    private static int copydefault = 1;
    public final FrameLayout biometricLayout;
    private final ConstraintLayout component2;
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
        int i2 = component1 + 103;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        int i4 = copydefault + 45;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return root;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private LayoutSafeInputKeyboardBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, RoundLinearLayout roundLinearLayout, TextView textView11) {
        this.component2 = constraintLayout;
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
        int i2 = component1;
        int i3 = i2 + 107;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        ConstraintLayout constraintLayout = this.component2;
        int i4 = i2 + 105;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return constraintLayout;
        }
        throw null;
    }

    public static LayoutSafeInputKeyboardBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 103;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return inflate(layoutInflater, null, false);
    }

    public static LayoutSafeInputKeyboardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 83;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.layout_safe_input_keyboard, viewGroup, false);
        if (z) {
            int i4 = copydefault + 3;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                viewGroup.addView(viewInflate);
            } else {
                viewGroup.addView(viewInflate);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        return bind(viewInflate);
    }

    public static LayoutSafeInputKeyboardBinding bind(View view) {
        int i = 2 % 2;
        int i2 = R.id.biometricLayout;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i2);
        if (frameLayout != null) {
            i2 = R.id.ivBiometric;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i2);
            if (imageView != null) {
                int i3 = copydefault + 89;
                component1 = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                i2 = R.id.tv_input_0;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i2);
                if (textView != null) {
                    i2 = R.id.tv_input_1;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i2);
                    if (textView2 != null) {
                        int i4 = component1 + 103;
                        copydefault = i4 % 128;
                        int i5 = i4 % 2;
                        i2 = R.id.tv_input_2;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i2);
                        if (textView3 != null) {
                            i2 = R.id.tv_input_3;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i2);
                            if (textView4 != null) {
                                i2 = R.id.tv_input_4;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i2);
                                if (textView5 != null) {
                                    int i6 = copydefault + 67;
                                    component1 = i6 % 128;
                                    if (i6 % 2 != 0) {
                                        obj.hashCode();
                                        throw null;
                                    }
                                    i2 = R.id.tv_input_5;
                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i2);
                                    if (textView6 != null) {
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
                                                        int i7 = copydefault + 43;
                                                        component1 = i7 % 128;
                                                        if (i7 % 2 != 0) {
                                                            obj.hashCode();
                                                            throw null;
                                                        }
                                                        i2 = R.id.tv_input_back;
                                                        RoundLinearLayout roundLinearLayout = (RoundLinearLayout) ViewBindings.findChildViewById(view, i2);
                                                        if (roundLinearLayout != null) {
                                                            i2 = R.id.tv_input_forget;
                                                            TextView textView11 = (TextView) ViewBindings.findChildViewById(view, i2);
                                                            if (textView11 != null) {
                                                                LayoutSafeInputKeyboardBinding layoutSafeInputKeyboardBinding = new LayoutSafeInputKeyboardBinding((ConstraintLayout) view, frameLayout, imageView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, roundLinearLayout, textView11);
                                                                int i8 = copydefault + 45;
                                                                component1 = i8 % 128;
                                                                if (i8 % 2 == 0) {
                                                                    return layoutSafeInputKeyboardBinding;
                                                                }
                                                                obj.hashCode();
                                                                throw null;
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
