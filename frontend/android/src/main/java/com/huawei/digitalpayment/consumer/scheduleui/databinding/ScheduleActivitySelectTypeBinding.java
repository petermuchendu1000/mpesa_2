package com.huawei.digitalpayment.consumer.scheduleui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.digitalpayment.consumer.scheduleui.R;

public abstract class ScheduleActivitySelectTypeBinding extends ViewDataBinding {
    private static int component2 = 0;
    private static int component3 = 1;
    public final RecyclerView recyclerView;

    protected ScheduleActivitySelectTypeBinding(Object obj, View view, int i, RecyclerView recyclerView) {
        super(obj, view, i);
        this.recyclerView = recyclerView;
    }

    public static ScheduleActivitySelectTypeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 73;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ScheduleActivitySelectTypeBinding scheduleActivitySelectTypeBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 41;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return scheduleActivitySelectTypeBindingInflate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ScheduleActivitySelectTypeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 105;
        component2 = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        ScheduleActivitySelectTypeBinding scheduleActivitySelectTypeBinding = (ScheduleActivitySelectTypeBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.schedule_activity_select_type, viewGroup, z, obj);
        int i3 = component3 + 119;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            return scheduleActivitySelectTypeBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static ScheduleActivitySelectTypeBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 11;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ScheduleActivitySelectTypeBinding scheduleActivitySelectTypeBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 85;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return scheduleActivitySelectTypeBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static ScheduleActivitySelectTypeBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = component2 + 39;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            i = R.layout.schedule_activity_select_type;
            z = true;
        } else {
            i = R.layout.schedule_activity_select_type;
            z = false;
        }
        return (ScheduleActivitySelectTypeBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
    }

    public static ScheduleActivitySelectTypeBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 35;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ScheduleActivitySelectTypeBinding scheduleActivitySelectTypeBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 9;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return scheduleActivitySelectTypeBindingBind;
    }

    @Deprecated
    public static ScheduleActivitySelectTypeBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 113;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ScheduleActivitySelectTypeBinding scheduleActivitySelectTypeBinding = (ScheduleActivitySelectTypeBinding) bind(obj, view, R.layout.schedule_activity_select_type);
        int i4 = component3 + 83;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return scheduleActivitySelectTypeBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
