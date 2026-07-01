package com.huawei.digitalpayment.consumer.login.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.digitalpayment.consumer.login.R;

public abstract class LoginActivityCheckIdentityBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int component1;
    public final LoadingButton btnConfirm;
    public final CommonInputView idNumber;
    public final CommonInputView idType;
    public final RoundLinearLayout llTips;
    public final TextView tips;
    public final TextView title;

    protected LoginActivityCheckIdentityBinding(Object obj, View view, int i, LoadingButton loadingButton, CommonInputView commonInputView, CommonInputView commonInputView2, RoundLinearLayout roundLinearLayout, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.btnConfirm = loadingButton;
        this.idNumber = commonInputView;
        this.idType = commonInputView2;
        this.llTips = roundLinearLayout;
        this.tips = textView;
        this.title = textView2;
    }

    public static LoginActivityCheckIdentityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 99;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        LoginActivityCheckIdentityBinding loginActivityCheckIdentityBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 85;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return loginActivityCheckIdentityBindingInflate;
    }

    @Deprecated
    public static LoginActivityCheckIdentityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 47;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        LoginActivityCheckIdentityBinding loginActivityCheckIdentityBinding = (LoginActivityCheckIdentityBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.login_activity_check_identity, viewGroup, z, obj);
        int i3 = component1 + 119;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return loginActivityCheckIdentityBinding;
    }

    public static LoginActivityCheckIdentityBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 19;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        LoginActivityCheckIdentityBinding loginActivityCheckIdentityBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 91;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return loginActivityCheckIdentityBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static LoginActivityCheckIdentityBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 107;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        LoginActivityCheckIdentityBinding loginActivityCheckIdentityBinding = (LoginActivityCheckIdentityBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.login_activity_check_identity, null, false, obj);
        int i4 = ShareDataUIState + 27;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return loginActivityCheckIdentityBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static LoginActivityCheckIdentityBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 75;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        LoginActivityCheckIdentityBinding loginActivityCheckIdentityBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        if (i3 != 0) {
            int i4 = 93 / 0;
        }
        return loginActivityCheckIdentityBindingBind;
    }

    @Deprecated
    public static LoginActivityCheckIdentityBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 91;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        LoginActivityCheckIdentityBinding loginActivityCheckIdentityBinding = (LoginActivityCheckIdentityBinding) bind(obj, view, R.layout.login_activity_check_identity);
        int i4 = component1 + 111;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return loginActivityCheckIdentityBinding;
        }
        throw null;
    }
}
