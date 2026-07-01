package com.huawei.digitalpayment.consumer.login.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.baselib.widget.code.CodeEditText;
import com.huawei.digitalpayment.consumer.baselib.widget.code.SafeInputKeyboard;
import com.huawei.digitalpayment.consumer.login.R;

public abstract class ActivitySfcPinLoginBinding extends ViewDataBinding {
    private static int component1 = 1;
    private static int copydefault;
    public final CodeEditText etCode;
    public final RoundImageView ivAvatar;
    public final RoundImageView ivBack;
    public final LinearLayout llContainer;
    public final TextView tvAmountDisplay;
    public final TextView tvName;
    public final TextView tvPhoneNumber;
    public final TextView tvTitle;
    public final SafeInputKeyboard virtualKeyboardView;

    protected ActivitySfcPinLoginBinding(Object obj, View view, int i, CodeEditText codeEditText, RoundImageView roundImageView, RoundImageView roundImageView2, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, SafeInputKeyboard safeInputKeyboard) {
        super(obj, view, i);
        this.etCode = codeEditText;
        this.ivAvatar = roundImageView;
        this.ivBack = roundImageView2;
        this.llContainer = linearLayout;
        this.tvAmountDisplay = textView;
        this.tvName = textView2;
        this.tvPhoneNumber = textView3;
        this.tvTitle = textView4;
        this.virtualKeyboardView = safeInputKeyboard;
    }

    public static ActivitySfcPinLoginBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 21;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcPinLoginBinding activitySfcPinLoginBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 101;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return activitySfcPinLoginBindingInflate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivitySfcPinLoginBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 47;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingInflateInternal = ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_pin_login, viewGroup, z, obj);
        if (i3 != 0) {
            return (ActivitySfcPinLoginBinding) viewDataBindingInflateInternal;
        }
        throw null;
    }

    public static ActivitySfcPinLoginBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 3;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcPinLoginBinding activitySfcPinLoginBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 23;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcPinLoginBindingInflate;
    }

    @Deprecated
    public static ActivitySfcPinLoginBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 91;
        copydefault = i2 % 128;
        return (ActivitySfcPinLoginBinding) ViewDataBinding.inflateInternal(layoutInflater, i2 % 2 != 0 ? R.layout.activity_sfc_pin_login : R.layout.activity_sfc_pin_login, null, false, obj);
    }

    public static ActivitySfcPinLoginBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 33;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcPinLoginBinding activitySfcPinLoginBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 73;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcPinLoginBindingBind;
    }

    @Deprecated
    public static ActivitySfcPinLoginBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 111;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcPinLoginBinding activitySfcPinLoginBinding = (ActivitySfcPinLoginBinding) bind(obj, view, R.layout.activity_sfc_pin_login);
        int i4 = component1 + 49;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcPinLoginBinding;
    }
}
