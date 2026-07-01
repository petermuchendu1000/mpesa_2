package com.huawei.digitalpayment.consumer.login.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.digitalpayment.consumer.login.R;

public abstract class ActivitySecurityVerificationBinding extends ViewDataBinding {
    private static int component2 = 0;
    private static int copydefault = 1;
    public final LoadingButton btnContinue;
    public final CommonInputView inputAnswer;
    public final CommonInputView inputQuestion;
    public final TextView tvTitle;

    protected ActivitySecurityVerificationBinding(Object obj, View view, int i, LoadingButton loadingButton, CommonInputView commonInputView, CommonInputView commonInputView2, TextView textView) {
        super(obj, view, i);
        this.btnContinue = loadingButton;
        this.inputAnswer = commonInputView;
        this.inputQuestion = commonInputView2;
        this.tvTitle = textView;
    }

    public static ActivitySecurityVerificationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 123;
        copydefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            obj.hashCode();
            throw null;
        }
        ActivitySecurityVerificationBinding activitySecurityVerificationBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = component2 + 61;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            return activitySecurityVerificationBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static ActivitySecurityVerificationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 21;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySecurityVerificationBinding activitySecurityVerificationBinding = (ActivitySecurityVerificationBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_security_verification, viewGroup, z, obj);
        int i4 = copydefault + 77;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return activitySecurityVerificationBinding;
    }

    public static ActivitySecurityVerificationBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 81;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivitySecurityVerificationBinding activitySecurityVerificationBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        if (i3 == 0) {
            int i4 = 74 / 0;
        }
        return activitySecurityVerificationBindingInflate;
    }

    @Deprecated
    public static ActivitySecurityVerificationBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 115;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySecurityVerificationBinding activitySecurityVerificationBinding = (ActivitySecurityVerificationBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_security_verification, null, false, obj);
        int i4 = component2 + 43;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activitySecurityVerificationBinding;
    }

    public static ActivitySecurityVerificationBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 97;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySecurityVerificationBinding activitySecurityVerificationBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 17;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return activitySecurityVerificationBindingBind;
    }

    @Deprecated
    public static ActivitySecurityVerificationBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 89;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySecurityVerificationBinding activitySecurityVerificationBinding = (ActivitySecurityVerificationBinding) bind(obj, view, R.layout.activity_security_verification);
        int i4 = component2 + 97;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activitySecurityVerificationBinding;
    }
}
