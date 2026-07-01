package com.huawei.digitalpayment.consumer.basic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.basic.R;

public final class DialogSwitchMobileDataBinding implements ViewBinding {
    private static int component2 = 0;
    private static int component3 = 1;
    private final ConstraintLayout copydefault;
    public final ImageView ivArrow;
    public final ImageView ivBack;
    public final ImageView ivOffWifi;
    public final LinearLayout llIcon;
    public final RoundTextView tvLeftButton;
    public final RoundTextView tvRightButton;
    public final TextView tvTips;
    public final TextView tvTitle;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component2 + 49;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        int i4 = component3 + 103;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private DialogSwitchMobileDataBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout, RoundTextView roundTextView, RoundTextView roundTextView2, TextView textView, TextView textView2) {
        this.copydefault = constraintLayout;
        this.ivArrow = imageView;
        this.ivBack = imageView2;
        this.ivOffWifi = imageView3;
        this.llIcon = linearLayout;
        this.tvLeftButton = roundTextView;
        this.tvRightButton = roundTextView2;
        this.tvTips = textView;
        this.tvTitle = textView2;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component2 + 61;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ConstraintLayout constraintLayout = this.copydefault;
        int i4 = i3 + 37;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return constraintLayout;
    }

    public static DialogSwitchMobileDataBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 35;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DialogSwitchMobileDataBinding dialogSwitchMobileDataBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component3 + 17;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return dialogSwitchMobileDataBindingInflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[PHI: r3
  0x0022: PHI (r3v4 android.view.View) = (r3v1 android.view.View), (r3v5 android.view.View) binds: [B:8:0x0020, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.basic.databinding.DialogSwitchMobileDataBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.basic.databinding.DialogSwitchMobileDataBinding.component3
            int r1 = r1 + 37
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.basic.databinding.DialogSwitchMobileDataBinding.component2 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L19
            int r1 = com.huawei.digitalpayment.consumer.basic.R.layout.dialog_switch_mobile_data
            r2 = 1
            android.view.View r3 = r3.inflate(r1, r4, r2)
            r5 = r5 ^ r2
            if (r5 == 0) goto L22
            goto L2e
        L19:
            int r1 = com.huawei.digitalpayment.consumer.basic.R.layout.dialog_switch_mobile_data
            r2 = 0
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L2e
        L22:
            int r5 = com.huawei.digitalpayment.consumer.basic.databinding.DialogSwitchMobileDataBinding.component2
            int r5 = r5 + 73
            int r1 = r5 % 128
            com.huawei.digitalpayment.consumer.basic.databinding.DialogSwitchMobileDataBinding.component3 = r1
            int r5 = r5 % r0
            r4.addView(r3)
        L2e:
            com.huawei.digitalpayment.consumer.basic.databinding.DialogSwitchMobileDataBinding r3 = bind(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.databinding.DialogSwitchMobileDataBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.basic.databinding.DialogSwitchMobileDataBinding");
    }

    public static DialogSwitchMobileDataBinding bind(View view) {
        int i = 2 % 2;
        int i2 = R.id.iv_arrow;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i2);
        if (imageView != null) {
            i2 = R.id.iv_back;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i2);
            if (imageView2 != null) {
                int i3 = component2 + 95;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                i2 = R.id.iv_off_wifi;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i2);
                if (imageView3 != null) {
                    int i5 = component3 + 119;
                    component2 = i5 % 128;
                    int i6 = i5 % 2;
                    i2 = R.id.ll_icon;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i2);
                    if (linearLayout != null) {
                        i2 = R.id.tv_left_button;
                        RoundTextView roundTextView = (RoundTextView) ViewBindings.findChildViewById(view, i2);
                        if (roundTextView != null) {
                            int i7 = component3 + 111;
                            component2 = i7 % 128;
                            if (i7 % 2 != 0) {
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            i2 = R.id.tv_right_button;
                            RoundTextView roundTextView2 = (RoundTextView) ViewBindings.findChildViewById(view, i2);
                            if (roundTextView2 != null) {
                                i2 = R.id.tv_tips;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, i2);
                                if (textView != null) {
                                    i2 = R.id.tv_title;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i2);
                                    if (textView2 != null) {
                                        return new DialogSwitchMobileDataBinding((ConstraintLayout) view, imageView, imageView2, imageView3, linearLayout, roundTextView, roundTextView2, textView, textView2);
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
