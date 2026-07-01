package com.huawei.digitalpayment.consumer.scheduleui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.text.AmountInputView;
import com.huawei.digitalpayment.consumer.scheduleui.R;

public abstract class SchedulePaymentDynamicsElementAmountLayoutBinding extends ViewDataBinding {
    private static int component3 = 1;
    private static int copydefault;
    public final AmountInputView commonInputView;

    protected SchedulePaymentDynamicsElementAmountLayoutBinding(Object obj, View view, int i, AmountInputView amountInputView) {
        super(obj, view, i);
        this.commonInputView = amountInputView;
    }

    public static SchedulePaymentDynamicsElementAmountLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 81;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        SchedulePaymentDynamicsElementAmountLayoutBinding schedulePaymentDynamicsElementAmountLayoutBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = copydefault + 59;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return schedulePaymentDynamicsElementAmountLayoutBindingInflate;
    }

    @Deprecated
    public static SchedulePaymentDynamicsElementAmountLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 57;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        SchedulePaymentDynamicsElementAmountLayoutBinding schedulePaymentDynamicsElementAmountLayoutBinding = (SchedulePaymentDynamicsElementAmountLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.schedule_payment_dynamics_element_amount_layout, viewGroup, z, obj);
        int i4 = copydefault + 115;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return schedulePaymentDynamicsElementAmountLayoutBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static SchedulePaymentDynamicsElementAmountLayoutBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 85;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        SchedulePaymentDynamicsElementAmountLayoutBinding schedulePaymentDynamicsElementAmountLayoutBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        if (i3 == 0) {
            int i4 = 38 / 0;
        }
        return schedulePaymentDynamicsElementAmountLayoutBindingInflate;
    }

    @Deprecated
    public static SchedulePaymentDynamicsElementAmountLayoutBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 85;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        SchedulePaymentDynamicsElementAmountLayoutBinding schedulePaymentDynamicsElementAmountLayoutBinding = (SchedulePaymentDynamicsElementAmountLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.schedule_payment_dynamics_element_amount_layout, null, false, obj);
        int i4 = component3 + 77;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 88 / 0;
        }
        return schedulePaymentDynamicsElementAmountLayoutBinding;
    }

    public static SchedulePaymentDynamicsElementAmountLayoutBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 99;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        SchedulePaymentDynamicsElementAmountLayoutBinding schedulePaymentDynamicsElementAmountLayoutBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 85;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return schedulePaymentDynamicsElementAmountLayoutBindingBind;
        }
        throw null;
    }

    @Deprecated
    public static SchedulePaymentDynamicsElementAmountLayoutBinding bind(View view, Object obj) {
        SchedulePaymentDynamicsElementAmountLayoutBinding schedulePaymentDynamicsElementAmountLayoutBinding;
        int i = 2 % 2;
        int i2 = component3 + 27;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            schedulePaymentDynamicsElementAmountLayoutBinding = (SchedulePaymentDynamicsElementAmountLayoutBinding) bind(obj, view, R.layout.schedule_payment_dynamics_element_amount_layout);
            int i3 = 9 / 0;
        } else {
            schedulePaymentDynamicsElementAmountLayoutBinding = (SchedulePaymentDynamicsElementAmountLayoutBinding) bind(obj, view, R.layout.schedule_payment_dynamics_element_amount_layout);
        }
        int i4 = component3 + 1;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 4 / 0;
        }
        return schedulePaymentDynamicsElementAmountLayoutBinding;
    }
}
