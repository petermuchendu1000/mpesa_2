package com.huawei.digitalpayment.consumer.login.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.digitalpayment.consumer.baselib.widget.code.CodeEditText;
import com.huawei.digitalpayment.consumer.baselib.widget.code.SafeInputKeyboard;
import com.huawei.digitalpayment.consumer.login.R;

public abstract class ActivityPinLoginBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    public final LoadingButton btnContinue;
    public final TextView btnHelp;
    public final TextView btnLoginWay;
    public final CodeEditText etCode;
    public final LinearLayout llExt;
    public final SafeInputKeyboard pinInputKeyboard;
    public final TextView tvDescription;
    public final TextView tvError;
    public final TextView tvForgot;
    public final TextView tvTitle;
    public final TextView tvWelcome;

    protected ActivityPinLoginBinding(Object obj, View view, int i, LoadingButton loadingButton, TextView textView, TextView textView2, CodeEditText codeEditText, LinearLayout linearLayout, SafeInputKeyboard safeInputKeyboard, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        super(obj, view, i);
        this.btnContinue = loadingButton;
        this.btnHelp = textView;
        this.btnLoginWay = textView2;
        this.etCode = codeEditText;
        this.llExt = linearLayout;
        this.pinInputKeyboard = safeInputKeyboard;
        this.tvDescription = textView3;
        this.tvError = textView4;
        this.tvForgot = textView5;
        this.tvTitle = textView6;
        this.tvWelcome = textView7;
    }

    public static ActivityPinLoginBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 29;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ActivityPinLoginBinding activityPinLoginBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = copydefault + 63;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 88 / 0;
        }
        return activityPinLoginBindingInflate;
    }

    @Deprecated
    public static ActivityPinLoginBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 49;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityPinLoginBinding activityPinLoginBinding = (ActivityPinLoginBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_pin_login, viewGroup, z, obj);
        if (i3 == 0) {
            return activityPinLoginBinding;
        }
        throw null;
    }

    public static ActivityPinLoginBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 107;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return inflate(layoutInflater, defaultComponent);
        }
        inflate(layoutInflater, defaultComponent);
        throw null;
    }

    @Deprecated
    public static ActivityPinLoginBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 119;
        ShareDataUIState = i2 % 128;
        Object obj2 = null;
        ActivityPinLoginBinding activityPinLoginBinding = (ActivityPinLoginBinding) ViewDataBinding.inflateInternal(layoutInflater, i2 % 2 == 0 ? R.layout.activity_pin_login : R.layout.activity_pin_login, null, false, obj);
        int i3 = ShareDataUIState + 43;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            return activityPinLoginBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static ActivityPinLoginBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 119;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityPinLoginBinding activityPinLoginBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 35;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return activityPinLoginBindingBind;
        }
        throw null;
    }

    @Deprecated
    public static ActivityPinLoginBinding bind(View view, Object obj) {
        ActivityPinLoginBinding activityPinLoginBinding;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 39;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            activityPinLoginBinding = (ActivityPinLoginBinding) bind(obj, view, R.layout.activity_pin_login);
            int i3 = 13 / 0;
        } else {
            activityPinLoginBinding = (ActivityPinLoginBinding) bind(obj, view, R.layout.activity_pin_login);
        }
        int i4 = ShareDataUIState + 55;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activityPinLoginBinding;
    }
}
