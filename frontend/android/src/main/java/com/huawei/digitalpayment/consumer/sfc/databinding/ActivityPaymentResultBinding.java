package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ActivityPaymentResultBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int component3;

    protected ActivityPaymentResultBinding(Object obj, View view, int i) {
        super(obj, view, i);
    }

    public static ActivityPaymentResultBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 101;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return inflate(layoutInflater, viewGroup, z, defaultComponent);
        }
        inflate(layoutInflater, viewGroup, z, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivityPaymentResultBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 5;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingInflateInternal = ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_payment_result, viewGroup, z, obj);
        if (i3 == 0) {
            return (ActivityPaymentResultBinding) viewDataBindingInflateInternal;
        }
        throw null;
    }

    public static ActivityPaymentResultBinding inflate(LayoutInflater layoutInflater) {
        ActivityPaymentResultBinding activityPaymentResultBindingInflate;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 5;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            activityPaymentResultBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            int i3 = 93 / 0;
        } else {
            activityPaymentResultBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        }
        int i4 = ShareDataUIState + 1;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activityPaymentResultBindingInflate;
    }

    @Deprecated
    public static ActivityPaymentResultBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 117;
        ShareDataUIState = i2 % 128;
        return (ActivityPaymentResultBinding) ViewDataBinding.inflateInternal(layoutInflater, i2 % 2 == 0 ? R.layout.activity_payment_result : R.layout.activity_payment_result, null, false, obj);
    }

    public static ActivityPaymentResultBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 111;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityPaymentResultBinding activityPaymentResultBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 107;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return activityPaymentResultBindingBind;
    }

    @Deprecated
    public static ActivityPaymentResultBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 79;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityPaymentResultBinding activityPaymentResultBinding = (ActivityPaymentResultBinding) bind(obj, view, R.layout.activity_payment_result);
        int i4 = component3 + 1;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return activityPaymentResultBinding;
    }
}
