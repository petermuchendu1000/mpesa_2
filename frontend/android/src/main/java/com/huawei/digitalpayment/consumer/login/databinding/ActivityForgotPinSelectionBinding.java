package com.huawei.digitalpayment.consumer.login.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.login.R;

public abstract class ActivityForgotPinSelectionBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int component2;
    public final LinearLayout llContent;

    protected ActivityForgotPinSelectionBinding(Object obj, View view, int i, LinearLayout linearLayout) {
        super(obj, view, i);
        this.llContent = linearLayout;
    }

    public static ActivityForgotPinSelectionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 91;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivityForgotPinSelectionBinding activityForgotPinSelectionBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 79;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return activityForgotPinSelectionBindingInflate;
    }

    @Deprecated
    public static ActivityForgotPinSelectionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 103;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityForgotPinSelectionBinding activityForgotPinSelectionBinding = (ActivityForgotPinSelectionBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_forgot_pin_selection, viewGroup, z, obj);
        if (i3 != 0) {
            int i4 = 16 / 0;
        }
        return activityForgotPinSelectionBinding;
    }

    public static ActivityForgotPinSelectionBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 23;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityForgotPinSelectionBinding activityForgotPinSelectionBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 25;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return activityForgotPinSelectionBindingInflate;
    }

    @Deprecated
    public static ActivityForgotPinSelectionBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 33;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityForgotPinSelectionBinding activityForgotPinSelectionBinding = (ActivityForgotPinSelectionBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_forgot_pin_selection, null, false, obj);
        int i4 = ShareDataUIState + 39;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return activityForgotPinSelectionBinding;
    }

    public static ActivityForgotPinSelectionBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 69;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return bind(view, defaultComponent);
        }
        bind(view, defaultComponent);
        throw null;
    }

    @Deprecated
    public static ActivityForgotPinSelectionBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 95;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityForgotPinSelectionBinding activityForgotPinSelectionBinding = (ActivityForgotPinSelectionBinding) bind(obj, view, R.layout.activity_forgot_pin_selection);
        int i4 = component2 + 57;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return activityForgotPinSelectionBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
