package com.huawei.digitalpayment.consumer.login.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.CommonCheckBox;
import com.huawei.common.widget.LoadingButton;
import com.huawei.digitalpayment.consumer.baselib.widget.input.MobileInputView;
import com.huawei.digitalpayment.consumer.login.R;

public abstract class LoginActivityLoginBinding extends ViewDataBinding {
    private static int component2 = 0;
    private static int component3 = 1;
    public final LoadingButton btnNext;
    public final CommonCheckBox ivAgreement;
    public final LinearLayout llAgreement;
    public final MobileInputView phoneNumberInput;
    public final TextView tvAgreement;
    public final TextView tvDescription;
    public final TextView tvLoginTitle;

    protected LoginActivityLoginBinding(Object obj, View view, int i, LoadingButton loadingButton, CommonCheckBox commonCheckBox, LinearLayout linearLayout, MobileInputView mobileInputView, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.btnNext = loadingButton;
        this.ivAgreement = commonCheckBox;
        this.llAgreement = linearLayout;
        this.phoneNumberInput = mobileInputView;
        this.tvAgreement = textView;
        this.tvDescription = textView2;
        this.tvLoginTitle = textView3;
    }

    public static LoginActivityLoginBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 23;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        LoginActivityLoginBinding loginActivityLoginBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 25;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return loginActivityLoginBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static LoginActivityLoginBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        LoginActivityLoginBinding loginActivityLoginBinding;
        int i = 2 % 2;
        int i2 = component3 + 13;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            loginActivityLoginBinding = (LoginActivityLoginBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.login_activity_login, viewGroup, z, obj);
            int i3 = 48 / 0;
        } else {
            loginActivityLoginBinding = (LoginActivityLoginBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.login_activity_login, viewGroup, z, obj);
        }
        int i4 = component2 + 59;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return loginActivityLoginBinding;
    }

    public static LoginActivityLoginBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 35;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        LoginActivityLoginBinding loginActivityLoginBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 13;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return loginActivityLoginBindingInflate;
    }

    @Deprecated
    public static LoginActivityLoginBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = component3 + 81;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            i = R.layout.login_activity_login;
            z = true;
        } else {
            i = R.layout.login_activity_login;
            z = false;
        }
        return (LoginActivityLoginBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
    }

    public static LoginActivityLoginBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 55;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        LoginActivityLoginBinding loginActivityLoginBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 85;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return loginActivityLoginBindingBind;
    }

    @Deprecated
    public static LoginActivityLoginBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 11;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        LoginActivityLoginBinding loginActivityLoginBinding = (LoginActivityLoginBinding) bind(obj, view, R.layout.login_activity_login);
        int i4 = component2 + 25;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return loginActivityLoginBinding;
    }
}
