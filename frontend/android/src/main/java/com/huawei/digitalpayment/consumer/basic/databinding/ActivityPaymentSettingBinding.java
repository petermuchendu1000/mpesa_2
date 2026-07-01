package com.huawei.digitalpayment.consumer.basic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.digitalpayment.consumer.basic.R;

public abstract class ActivityPaymentSettingBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int component3;
    public final RoundLinearLayout clAutoDeductionManager;
    public final RoundLinearLayout clAutomaticPayment;
    public final RoundLinearLayout clPinFree;
    public final RoundLinearLayout llBiometricPayment;
    public final RoundLinearLayout llProrityPayment;

    protected ActivityPaymentSettingBinding(Object obj, View view, int i, RoundLinearLayout roundLinearLayout, RoundLinearLayout roundLinearLayout2, RoundLinearLayout roundLinearLayout3, RoundLinearLayout roundLinearLayout4, RoundLinearLayout roundLinearLayout5) {
        super(obj, view, i);
        this.clAutoDeductionManager = roundLinearLayout;
        this.clAutomaticPayment = roundLinearLayout2;
        this.clPinFree = roundLinearLayout3;
        this.llBiometricPayment = roundLinearLayout4;
        this.llProrityPayment = roundLinearLayout5;
    }

    public static ActivityPaymentSettingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 49;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return inflate(layoutInflater, viewGroup, z, defaultComponent);
        }
        inflate(layoutInflater, viewGroup, z, defaultComponent);
        throw null;
    }

    @Deprecated
    public static ActivityPaymentSettingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 57;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingInflateInternal = ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_payment_setting, viewGroup, z, obj);
        if (i3 != 0) {
            return (ActivityPaymentSettingBinding) viewDataBindingInflateInternal;
        }
        int i4 = 89 / 0;
        return (ActivityPaymentSettingBinding) viewDataBindingInflateInternal;
    }

    public static ActivityPaymentSettingBinding inflate(LayoutInflater layoutInflater) {
        ActivityPaymentSettingBinding activityPaymentSettingBindingInflate;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 103;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            activityPaymentSettingBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            int i3 = 36 / 0;
        } else {
            activityPaymentSettingBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        }
        int i4 = component3 + 79;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return activityPaymentSettingBindingInflate;
    }

    @Deprecated
    public static ActivityPaymentSettingBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 71;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityPaymentSettingBinding activityPaymentSettingBinding = (ActivityPaymentSettingBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_payment_setting, null, false, obj);
        int i4 = component3 + 69;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return activityPaymentSettingBinding;
        }
        throw null;
    }

    public static ActivityPaymentSettingBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 39;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return bind(view, defaultComponent);
        }
        bind(view, defaultComponent);
        throw null;
    }

    @Deprecated
    public static ActivityPaymentSettingBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 105;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivityPaymentSettingBinding activityPaymentSettingBinding = (ActivityPaymentSettingBinding) bind(obj, view, R.layout.activity_payment_setting);
        int i4 = component3 + 113;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 14 / 0;
        }
        return activityPaymentSettingBinding;
    }
}
