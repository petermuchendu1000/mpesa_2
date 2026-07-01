package com.huawei.digitalpayment.consumer.login.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.digitalpayment.consumer.login.R;

public abstract class ActivityResetPinVerifyIdBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int component3;
    public final LoadingButton btnNext;
    public final CommonInputView idNumber;
    public final CommonInputView idType;
    public final TextView resetPinVerifyTip;
    public final RoundLinearLayout resetPinVerifyTipParent;

    protected ActivityResetPinVerifyIdBinding(Object obj, View view, int i, LoadingButton loadingButton, CommonInputView commonInputView, CommonInputView commonInputView2, TextView textView, RoundLinearLayout roundLinearLayout) {
        super(obj, view, i);
        this.btnNext = loadingButton;
        this.idNumber = commonInputView;
        this.idType = commonInputView2;
        this.resetPinVerifyTip = textView;
        this.resetPinVerifyTipParent = roundLinearLayout;
    }

    public static ActivityResetPinVerifyIdBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 125;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivityResetPinVerifyIdBinding activityResetPinVerifyIdBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 27;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activityResetPinVerifyIdBindingInflate;
    }

    @Deprecated
    public static ActivityResetPinVerifyIdBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 101;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityResetPinVerifyIdBinding activityResetPinVerifyIdBinding = (ActivityResetPinVerifyIdBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_reset_pin_verify_id, viewGroup, z, obj);
        int i4 = ShareDataUIState + 121;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return activityResetPinVerifyIdBinding;
        }
        throw null;
    }

    public static ActivityResetPinVerifyIdBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 55;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityResetPinVerifyIdBinding activityResetPinVerifyIdBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 93;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return activityResetPinVerifyIdBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static ActivityResetPinVerifyIdBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = component3 + 17;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            i = R.layout.activity_reset_pin_verify_id;
            z = true;
        } else {
            i = R.layout.activity_reset_pin_verify_id;
            z = false;
        }
        return (ActivityResetPinVerifyIdBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
    }

    public static ActivityResetPinVerifyIdBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 47;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return bind(view, defaultComponent);
        }
        bind(view, defaultComponent);
        throw null;
    }

    @Deprecated
    public static ActivityResetPinVerifyIdBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 39;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivityResetPinVerifyIdBinding activityResetPinVerifyIdBinding = (ActivityResetPinVerifyIdBinding) bind(obj, view, R.layout.activity_reset_pin_verify_id);
        int i4 = ShareDataUIState + 123;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return activityResetPinVerifyIdBinding;
        }
        throw null;
    }
}
