package com.huawei.digitalpayment.consumer.login.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.digitalpayment.consumer.base.ui.widget.SafeInputKeyboard;
import com.huawei.digitalpayment.consumer.baselib.widget.code.CodeEditText;
import com.huawei.digitalpayment.consumer.login.R;

public abstract class ActivitySfcRegisterOtpVerifyBinding extends ViewDataBinding {
    private static int component1 = 1;
    private static int component3;
    public final LoadingButton btnConfirm;
    public final CodeEditText etCode;
    public final ImageView ivBack;
    public final ImageView ivMessage;
    public final ConstraintLayout llContent;
    public final ConstraintLayout rlTipsContainer;
    public final TextView tvCountDown;
    public final TextView tvNotReceiveCodeTips;
    public final TextView tvResend;
    public final TextView tvTips;
    public final TextView tvTitle;
    public final SafeInputKeyboard virtualKeyboardView;

    protected ActivitySfcRegisterOtpVerifyBinding(Object obj, View view, int i, LoadingButton loadingButton, CodeEditText codeEditText, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, SafeInputKeyboard safeInputKeyboard) {
        super(obj, view, i);
        this.btnConfirm = loadingButton;
        this.etCode = codeEditText;
        this.ivBack = imageView;
        this.ivMessage = imageView2;
        this.llContent = constraintLayout;
        this.rlTipsContainer = constraintLayout2;
        this.tvCountDown = textView;
        this.tvNotReceiveCodeTips = textView2;
        this.tvResend = textView3;
        this.tvTips = textView4;
        this.tvTitle = textView5;
        this.virtualKeyboardView = safeInputKeyboard;
    }

    public static ActivitySfcRegisterOtpVerifyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 55;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return inflate(layoutInflater, viewGroup, z, defaultComponent);
        }
        inflate(layoutInflater, viewGroup, z, defaultComponent);
        throw null;
    }

    @Deprecated
    public static ActivitySfcRegisterOtpVerifyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 55;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcRegisterOtpVerifyBinding activitySfcRegisterOtpVerifyBinding = (ActivitySfcRegisterOtpVerifyBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_register_otp_verify, viewGroup, z, obj);
        int i4 = component3 + 37;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcRegisterOtpVerifyBinding;
    }

    public static ActivitySfcRegisterOtpVerifyBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 103;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcRegisterOtpVerifyBinding activitySfcRegisterOtpVerifyBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        if (i3 == 0) {
            int i4 = 78 / 0;
        }
        return activitySfcRegisterOtpVerifyBindingInflate;
    }

    @Deprecated
    public static ActivitySfcRegisterOtpVerifyBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 85;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcRegisterOtpVerifyBinding activitySfcRegisterOtpVerifyBinding = (ActivitySfcRegisterOtpVerifyBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_register_otp_verify, null, false, obj);
        int i4 = component1 + 15;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcRegisterOtpVerifyBinding;
    }

    public static ActivitySfcRegisterOtpVerifyBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 107;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcRegisterOtpVerifyBinding activitySfcRegisterOtpVerifyBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 105;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 91 / 0;
        }
        return activitySfcRegisterOtpVerifyBindingBind;
    }

    @Deprecated
    public static ActivitySfcRegisterOtpVerifyBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 11;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcRegisterOtpVerifyBinding activitySfcRegisterOtpVerifyBinding = (ActivitySfcRegisterOtpVerifyBinding) bind(obj, view, R.layout.activity_sfc_register_otp_verify);
        if (i3 != 0) {
            int i4 = 68 / 0;
        }
        return activitySfcRegisterOtpVerifyBinding;
    }
}
