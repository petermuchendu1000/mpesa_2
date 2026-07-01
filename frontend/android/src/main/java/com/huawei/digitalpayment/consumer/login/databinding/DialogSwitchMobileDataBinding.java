package com.huawei.digitalpayment.consumer.login.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.login.R;

public final class DialogSwitchMobileDataBinding implements ViewBinding {
    private static int ShareDataUIState = 1;
    private static int component2;
    private final ConstraintLayout component3;
    public final ImageView ivArrow;
    public final RoundImageView ivBack;
    public final ImageView ivOffWifi;
    public final LinearLayout llIcon;
    public final RoundTextView tvLeftButton;
    public final RoundTextView tvRightButton;
    public final TextView tvTips;
    public final TextView tvTitle;

    @Override
    public View getRoot() {
        ConstraintLayout root;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 99;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            root = getRoot();
            int i3 = 86 / 0;
        } else {
            root = getRoot();
        }
        int i4 = ShareDataUIState + 23;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return root;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private DialogSwitchMobileDataBinding(ConstraintLayout constraintLayout, ImageView imageView, RoundImageView roundImageView, ImageView imageView2, LinearLayout linearLayout, RoundTextView roundTextView, RoundTextView roundTextView2, TextView textView, TextView textView2) {
        this.component3 = constraintLayout;
        this.ivArrow = imageView;
        this.ivBack = roundImageView;
        this.ivOffWifi = imageView2;
        this.llIcon = linearLayout;
        this.tvLeftButton = roundTextView;
        this.tvRightButton = roundTextView2;
        this.tvTips = textView;
        this.tvTitle = textView2;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component2 + 55;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static DialogSwitchMobileDataBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 33;
        ShareDataUIState = i2 % 128;
        return inflate(layoutInflater, null, i2 % 2 == 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r3
  0x0021: PHI (r3v4 android.view.View) = (r3v1 android.view.View), (r3v5 android.view.View) binds: [B:8:0x001f, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.login.databinding.DialogSwitchMobileDataBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.login.databinding.DialogSwitchMobileDataBinding.ShareDataUIState
            int r1 = r1 + 89
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.login.databinding.DialogSwitchMobileDataBinding.component2 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L18
            int r1 = com.huawei.digitalpayment.consumer.login.R.layout.dialog_switch_mobile_data
            r2 = 1
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == r2) goto L21
            goto L2d
        L18:
            int r1 = com.huawei.digitalpayment.consumer.login.R.layout.dialog_switch_mobile_data
            r2 = 0
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L2d
        L21:
            r4.addView(r3)
            int r4 = com.huawei.digitalpayment.consumer.login.databinding.DialogSwitchMobileDataBinding.component2
            int r4 = r4 + 119
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.login.databinding.DialogSwitchMobileDataBinding.ShareDataUIState = r5
            int r4 = r4 % r0
        L2d:
            com.huawei.digitalpayment.consumer.login.databinding.DialogSwitchMobileDataBinding r3 = bind(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.login.databinding.DialogSwitchMobileDataBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.login.databinding.DialogSwitchMobileDataBinding");
    }

    public static DialogSwitchMobileDataBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 35;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.iv_arrow;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i4);
        if (imageView != null) {
            i4 = R.id.iv_back;
            RoundImageView roundImageView = (RoundImageView) ViewBindings.findChildViewById(view, i4);
            if (roundImageView != null) {
                i4 = R.id.iv_off_wifi;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i4);
                if (imageView2 != null) {
                    i4 = R.id.ll_icon;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i4);
                    if (linearLayout != null) {
                        i4 = R.id.tv_left_button;
                        RoundTextView roundTextView = (RoundTextView) ViewBindings.findChildViewById(view, i4);
                        if (roundTextView != null) {
                            i4 = R.id.tv_right_button;
                            RoundTextView roundTextView2 = (RoundTextView) ViewBindings.findChildViewById(view, i4);
                            if (roundTextView2 != null) {
                                i4 = R.id.tv_tips;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, i4);
                                if (textView != null) {
                                    int i5 = ShareDataUIState + 27;
                                    component2 = i5 % 128;
                                    int i6 = i5 % 2;
                                    i4 = R.id.tv_title;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i4);
                                    if (textView2 != null) {
                                        DialogSwitchMobileDataBinding dialogSwitchMobileDataBinding = new DialogSwitchMobileDataBinding((ConstraintLayout) view, imageView, roundImageView, imageView2, linearLayout, roundTextView, roundTextView2, textView, textView2);
                                        int i7 = ShareDataUIState + 51;
                                        component2 = i7 % 128;
                                        int i8 = i7 % 2;
                                        return dialogSwitchMobileDataBinding;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
