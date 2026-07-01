package com.huawei.digitalpayment.consumer.scheduleui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.digitalpayment.consumer.scheduleui.R;

public abstract class ScheduleActivityCreateAutomaticPaymentBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    public final LoadingButton btnSubmit;
    public final LinearLayout llContainer;

    protected ScheduleActivityCreateAutomaticPaymentBinding(Object obj, View view, int i, LoadingButton loadingButton, LinearLayout linearLayout) {
        super(obj, view, i);
        this.btnSubmit = loadingButton;
        this.llContainer = linearLayout;
    }

    public static ScheduleActivityCreateAutomaticPaymentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 89;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ScheduleActivityCreateAutomaticPaymentBinding scheduleActivityCreateAutomaticPaymentBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 35;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return scheduleActivityCreateAutomaticPaymentBindingInflate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ScheduleActivityCreateAutomaticPaymentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 5;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        ScheduleActivityCreateAutomaticPaymentBinding scheduleActivityCreateAutomaticPaymentBinding = (ScheduleActivityCreateAutomaticPaymentBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.schedule_activity_create_automatic_payment, viewGroup, z, obj);
        int i3 = ShareDataUIState + 5;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return scheduleActivityCreateAutomaticPaymentBinding;
    }

    public static ScheduleActivityCreateAutomaticPaymentBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 35;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ScheduleActivityCreateAutomaticPaymentBinding scheduleActivityCreateAutomaticPaymentBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 67;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return scheduleActivityCreateAutomaticPaymentBindingInflate;
    }

    @Deprecated
    public static ScheduleActivityCreateAutomaticPaymentBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 91;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ScheduleActivityCreateAutomaticPaymentBinding scheduleActivityCreateAutomaticPaymentBinding = (ScheduleActivityCreateAutomaticPaymentBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.schedule_activity_create_automatic_payment, null, false, obj);
        int i4 = component1 + 101;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return scheduleActivityCreateAutomaticPaymentBinding;
    }

    public static ScheduleActivityCreateAutomaticPaymentBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 35;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return bind(view, defaultComponent);
        }
        bind(view, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ScheduleActivityCreateAutomaticPaymentBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 21;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ScheduleActivityCreateAutomaticPaymentBinding scheduleActivityCreateAutomaticPaymentBinding = (ScheduleActivityCreateAutomaticPaymentBinding) bind(obj, view, R.layout.schedule_activity_create_automatic_payment);
        int i4 = component1 + 87;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return scheduleActivityCreateAutomaticPaymentBinding;
    }
}
