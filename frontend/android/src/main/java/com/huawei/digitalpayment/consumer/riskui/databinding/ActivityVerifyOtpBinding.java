package com.huawei.digitalpayment.consumer.riskui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.digitalpayment.consumer.riskui.R;
import com.huawei.digitalpayment.consumer.riskui.widget.VerificationCodeView;

public abstract class ActivityVerifyOtpBinding extends ViewDataBinding {
    private static int component1 = 0;
    private static int component3 = 1;
    public final LoadingButton btnContinue;
    public final VerificationCodeView codeView;
    public final RoundLinearLayout llTips;

    protected ActivityVerifyOtpBinding(Object obj, View view, int i, LoadingButton loadingButton, VerificationCodeView verificationCodeView, RoundLinearLayout roundLinearLayout) {
        super(obj, view, i);
        this.btnContinue = loadingButton;
        this.codeView = verificationCodeView;
        this.llTips = roundLinearLayout;
    }

    public static ActivityVerifyOtpBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 69;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityVerifyOtpBinding activityVerifyOtpBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 21;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return activityVerifyOtpBindingInflate;
    }

    @Deprecated
    public static ActivityVerifyOtpBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 73;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityVerifyOtpBinding activityVerifyOtpBinding = (ActivityVerifyOtpBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_verify_otp, viewGroup, z, obj);
        int i4 = component1 + 47;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activityVerifyOtpBinding;
    }

    public static ActivityVerifyOtpBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 63;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ActivityVerifyOtpBinding activityVerifyOtpBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = component1 + 75;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return activityVerifyOtpBindingInflate;
    }

    @Deprecated
    public static ActivityVerifyOtpBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 87;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityVerifyOtpBinding activityVerifyOtpBinding = (ActivityVerifyOtpBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_verify_otp, null, false, obj);
        int i4 = component3 + 5;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return activityVerifyOtpBinding;
    }

    public static ActivityVerifyOtpBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 21;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityVerifyOtpBinding activityVerifyOtpBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 53;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activityVerifyOtpBindingBind;
    }

    @Deprecated
    public static ActivityVerifyOtpBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 29;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        ActivityVerifyOtpBinding activityVerifyOtpBinding = (ActivityVerifyOtpBinding) bind(obj, view, R.layout.activity_verify_otp);
        int i3 = component3 + 87;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return activityVerifyOtpBinding;
    }
}
