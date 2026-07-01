package com.huawei.digitalpayment.consumer.login.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.digitalpayment.consumer.baselib.widget.code.OtpEditText;
import com.huawei.digitalpayment.consumer.login.R;

public abstract class ActivityOtpLoginBinding extends ViewDataBinding {
    private static int component1 = 1;
    private static int component3;
    public final LoadingButton btnContinue;
    public final TextView btnGetOtp;
    public final TextView btnHelp;
    public final TextView btnLoginWay;
    public final OtpEditText etCode;
    public final View line;
    public final LinearLayout llExt;
    public final TextView tvDescription;
    public final TextView tvError;
    public final TextView tvTitle;
    public final TextView tvWelcome;

    protected ActivityOtpLoginBinding(Object obj, View view, int i, LoadingButton loadingButton, TextView textView, TextView textView2, TextView textView3, OtpEditText otpEditText, View view2, LinearLayout linearLayout, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        super(obj, view, i);
        this.btnContinue = loadingButton;
        this.btnGetOtp = textView;
        this.btnHelp = textView2;
        this.btnLoginWay = textView3;
        this.etCode = otpEditText;
        this.line = view2;
        this.llExt = linearLayout;
        this.tvDescription = textView4;
        this.tvError = textView5;
        this.tvTitle = textView6;
        this.tvWelcome = textView7;
    }

    public static ActivityOtpLoginBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 33;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityOtpLoginBinding activityOtpLoginBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 55;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activityOtpLoginBindingInflate;
    }

    @Deprecated
    public static ActivityOtpLoginBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 103;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityOtpLoginBinding activityOtpLoginBinding = (ActivityOtpLoginBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_otp_login, viewGroup, z, obj);
        if (i3 != 0) {
            return activityOtpLoginBinding;
        }
        throw null;
    }

    public static ActivityOtpLoginBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 107;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityOtpLoginBinding activityOtpLoginBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 23;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return activityOtpLoginBindingInflate;
    }

    @Deprecated
    public static ActivityOtpLoginBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 67;
        component1 = i2 % 128;
        return (ActivityOtpLoginBinding) ViewDataBinding.inflateInternal(layoutInflater, i2 % 2 == 0 ? R.layout.activity_otp_login : R.layout.activity_otp_login, null, false, obj);
    }

    public static ActivityOtpLoginBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 19;
        component3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ActivityOtpLoginBinding activityOtpLoginBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = component3 + 97;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            return activityOtpLoginBindingBind;
        }
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivityOtpLoginBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 109;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityOtpLoginBinding activityOtpLoginBinding = (ActivityOtpLoginBinding) bind(obj, view, R.layout.activity_otp_login);
        int i4 = component1 + 123;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activityOtpLoginBinding;
    }
}
