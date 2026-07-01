package com.huawei.digitalpayment.consumer.sfcadjust.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.sfcadjust.R;

public abstract class ActivityEmptySfcAdjustBinding extends ViewDataBinding {
    private static int component1 = 1;
    private static int component2;

    protected ActivityEmptySfcAdjustBinding(Object obj, View view, int i) {
        super(obj, view, i);
    }

    public static ActivityEmptySfcAdjustBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 67;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ActivityEmptySfcAdjustBinding activityEmptySfcAdjustBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = component1 + 51;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return activityEmptySfcAdjustBindingInflate;
    }

    @Deprecated
    public static ActivityEmptySfcAdjustBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 53;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityEmptySfcAdjustBinding activityEmptySfcAdjustBinding = (ActivityEmptySfcAdjustBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_empty_sfc_adjust, viewGroup, z, obj);
        int i4 = component2 + 109;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return activityEmptySfcAdjustBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static ActivityEmptySfcAdjustBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 13;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityEmptySfcAdjustBinding activityEmptySfcAdjustBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 31;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 79 / 0;
        }
        return activityEmptySfcAdjustBindingInflate;
    }

    @Deprecated
    public static ActivityEmptySfcAdjustBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 21;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityEmptySfcAdjustBinding activityEmptySfcAdjustBinding = (ActivityEmptySfcAdjustBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_empty_sfc_adjust, null, false, obj);
        int i4 = component2 + 73;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return activityEmptySfcAdjustBinding;
    }

    public static ActivityEmptySfcAdjustBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 57;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ActivityEmptySfcAdjustBinding activityEmptySfcAdjustBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = component2 + 35;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return activityEmptySfcAdjustBindingBind;
    }

    @Deprecated
    public static ActivityEmptySfcAdjustBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 57;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityEmptySfcAdjustBinding activityEmptySfcAdjustBinding = (ActivityEmptySfcAdjustBinding) bind(obj, view, R.layout.activity_empty_sfc_adjust);
        int i4 = component1 + 105;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return activityEmptySfcAdjustBinding;
        }
        throw null;
    }
}
