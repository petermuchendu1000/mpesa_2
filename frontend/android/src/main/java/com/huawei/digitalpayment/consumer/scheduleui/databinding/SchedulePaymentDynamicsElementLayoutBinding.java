package com.huawei.digitalpayment.consumer.scheduleui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.digitalpayment.consumer.scheduleui.R;

public abstract class SchedulePaymentDynamicsElementLayoutBinding extends ViewDataBinding {
    private static int component2 = 1;
    private static int copydefault;
    public final CommonInputView commonInputView;

    protected SchedulePaymentDynamicsElementLayoutBinding(Object obj, View view, int i, CommonInputView commonInputView) {
        super(obj, view, i);
        this.commonInputView = commonInputView;
    }

    public static SchedulePaymentDynamicsElementLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 27;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return inflate(layoutInflater, viewGroup, z, defaultComponent);
        }
        inflate(layoutInflater, viewGroup, z, defaultComponent);
        throw null;
    }

    @Deprecated
    public static SchedulePaymentDynamicsElementLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        SchedulePaymentDynamicsElementLayoutBinding schedulePaymentDynamicsElementLayoutBinding;
        int i = 2 % 2;
        int i2 = copydefault + 61;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            schedulePaymentDynamicsElementLayoutBinding = (SchedulePaymentDynamicsElementLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.schedule_payment_dynamics_element_layout, viewGroup, z, obj);
            int i3 = 47 / 0;
        } else {
            schedulePaymentDynamicsElementLayoutBinding = (SchedulePaymentDynamicsElementLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.schedule_payment_dynamics_element_layout, viewGroup, z, obj);
        }
        int i4 = copydefault + 125;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return schedulePaymentDynamicsElementLayoutBinding;
    }

    public static SchedulePaymentDynamicsElementLayoutBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 89;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        SchedulePaymentDynamicsElementLayoutBinding schedulePaymentDynamicsElementLayoutBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = component2 + 63;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return schedulePaymentDynamicsElementLayoutBindingInflate;
    }

    @Deprecated
    public static SchedulePaymentDynamicsElementLayoutBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 27;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        SchedulePaymentDynamicsElementLayoutBinding schedulePaymentDynamicsElementLayoutBinding = (SchedulePaymentDynamicsElementLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.schedule_payment_dynamics_element_layout, null, false, obj);
        int i4 = copydefault + 7;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 48 / 0;
        }
        return schedulePaymentDynamicsElementLayoutBinding;
    }

    public static SchedulePaymentDynamicsElementLayoutBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 17;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return bind(view, defaultComponent);
        }
        bind(view, defaultComponent);
        throw null;
    }

    @Deprecated
    public static SchedulePaymentDynamicsElementLayoutBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 119;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingBind = bind(obj, view, R.layout.schedule_payment_dynamics_element_layout);
        if (i3 != 0) {
            return (SchedulePaymentDynamicsElementLayoutBinding) viewDataBindingBind;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
