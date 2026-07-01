package com.huawei.digitalpayment.consumer.login.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.base.ui.widget.SafeOtpInputKeyboard;
import com.huawei.digitalpayment.consumer.baselib.widget.code.CodeEditText;
import com.huawei.digitalpayment.consumer.login.R;

public abstract class ActivityOtpVerifyBinding extends ViewDataBinding {
    private static int component1 = 0;
    private static int component2 = 1;
    public final LoadingButton btnConfirm;
    public final ConstraintLayout csContent;
    public final CodeEditText etCode;
    public final RoundImageView ivBack;
    public final ImageView ivMessage;
    public final ConstraintLayout rlTipsContainer;
    public final TextView tvCountDown;
    public final TextView tvNotReceiveCodeTips;
    public final TextView tvResend;
    public final TextView tvTips;
    public final TextView tvTitle;
    public final SafeOtpInputKeyboard virtualKeyboardView;

    protected ActivityOtpVerifyBinding(Object obj, View view, int i, LoadingButton loadingButton, ConstraintLayout constraintLayout, CodeEditText codeEditText, RoundImageView roundImageView, ImageView imageView, ConstraintLayout constraintLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, SafeOtpInputKeyboard safeOtpInputKeyboard) {
        super(obj, view, i);
        this.btnConfirm = loadingButton;
        this.csContent = constraintLayout;
        this.etCode = codeEditText;
        this.ivBack = roundImageView;
        this.ivMessage = imageView;
        this.rlTipsContainer = constraintLayout2;
        this.tvCountDown = textView;
        this.tvNotReceiveCodeTips = textView2;
        this.tvResend = textView3;
        this.tvTips = textView4;
        this.tvTitle = textView5;
        this.virtualKeyboardView = safeOtpInputKeyboard;
    }

    public static ActivityOtpVerifyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 81;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ActivityOtpVerifyBinding activityOtpVerifyBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = component2 + 79;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return activityOtpVerifyBindingInflate;
    }

    @Deprecated
    public static ActivityOtpVerifyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 123;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityOtpVerifyBinding activityOtpVerifyBinding = (ActivityOtpVerifyBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_otp_verify, viewGroup, z, obj);
        int i4 = component2 + 77;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 58 / 0;
        }
        return activityOtpVerifyBinding;
    }

    public static ActivityOtpVerifyBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 27;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityOtpVerifyBinding activityOtpVerifyBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 65;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return activityOtpVerifyBindingInflate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivityOtpVerifyBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 35;
        component2 = i2 % 128;
        ActivityOtpVerifyBinding activityOtpVerifyBinding = (ActivityOtpVerifyBinding) (i2 % 2 == 0 ? ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_otp_verify, null, true, obj) : ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_otp_verify, null, false, obj));
        int i3 = component2 + 115;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 22 / 0;
        }
        return activityOtpVerifyBinding;
    }

    public static ActivityOtpVerifyBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 113;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ActivityOtpVerifyBinding activityOtpVerifyBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = component1 + 9;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return activityOtpVerifyBindingBind;
    }

    @Deprecated
    public static ActivityOtpVerifyBinding bind(View view, Object obj) {
        ActivityOtpVerifyBinding activityOtpVerifyBinding;
        int i = 2 % 2;
        int i2 = component1 + 119;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            activityOtpVerifyBinding = (ActivityOtpVerifyBinding) bind(obj, view, R.layout.activity_otp_verify);
            int i3 = 62 / 0;
        } else {
            activityOtpVerifyBinding = (ActivityOtpVerifyBinding) bind(obj, view, R.layout.activity_otp_verify);
        }
        int i4 = component2 + 81;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return activityOtpVerifyBinding;
    }
}
