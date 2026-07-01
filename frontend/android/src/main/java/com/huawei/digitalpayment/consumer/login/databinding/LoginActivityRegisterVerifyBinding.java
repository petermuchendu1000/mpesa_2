package com.huawei.digitalpayment.consumer.login.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.digitalpayment.consumer.login.R;
import com.huawei.digitalpayment.form.validator.ValidatorInputView;

public abstract class LoginActivityRegisterVerifyBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    public final LoadingButton btnNext;
    public final ValidatorInputView idNumber;
    public final CommonInputView idType;
    public final ValidatorInputView inputName;
    public final LinearLayout llContainer;
    public final TextView tvLoginTitle;

    protected LoginActivityRegisterVerifyBinding(Object obj, View view, int i, LoadingButton loadingButton, ValidatorInputView validatorInputView, CommonInputView commonInputView, ValidatorInputView validatorInputView2, LinearLayout linearLayout, TextView textView) {
        super(obj, view, i);
        this.btnNext = loadingButton;
        this.idNumber = validatorInputView;
        this.idType = commonInputView;
        this.inputName = validatorInputView2;
        this.llContainer = linearLayout;
        this.tvLoginTitle = textView;
    }

    public static LoginActivityRegisterVerifyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 85;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        LoginActivityRegisterVerifyBinding loginActivityRegisterVerifyBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 3;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 37 / 0;
        }
        return loginActivityRegisterVerifyBindingInflate;
    }

    @Deprecated
    public static LoginActivityRegisterVerifyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        LoginActivityRegisterVerifyBinding loginActivityRegisterVerifyBinding;
        int i = 2 % 2;
        int i2 = component3 + 87;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            loginActivityRegisterVerifyBinding = (LoginActivityRegisterVerifyBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.login_activity_register_verify, viewGroup, z, obj);
            int i3 = 3 / 0;
        } else {
            loginActivityRegisterVerifyBinding = (LoginActivityRegisterVerifyBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.login_activity_register_verify, viewGroup, z, obj);
        }
        int i4 = component3 + 55;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return loginActivityRegisterVerifyBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static LoginActivityRegisterVerifyBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 105;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        LoginActivityRegisterVerifyBinding loginActivityRegisterVerifyBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 125;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return loginActivityRegisterVerifyBindingInflate;
    }

    @Deprecated
    public static LoginActivityRegisterVerifyBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 1;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        LoginActivityRegisterVerifyBinding loginActivityRegisterVerifyBinding = (LoginActivityRegisterVerifyBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.login_activity_register_verify, null, false, obj);
        int i4 = ShareDataUIState + 31;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return loginActivityRegisterVerifyBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static LoginActivityRegisterVerifyBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 69;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        LoginActivityRegisterVerifyBinding loginActivityRegisterVerifyBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 3;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return loginActivityRegisterVerifyBindingBind;
    }

    @Deprecated
    public static LoginActivityRegisterVerifyBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 33;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        LoginActivityRegisterVerifyBinding loginActivityRegisterVerifyBinding = (LoginActivityRegisterVerifyBinding) bind(obj, view, R.layout.login_activity_register_verify);
        int i4 = component3 + 95;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return loginActivityRegisterVerifyBinding;
        }
        throw null;
    }
}
