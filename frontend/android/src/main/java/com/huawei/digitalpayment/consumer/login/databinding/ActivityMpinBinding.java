package com.huawei.digitalpayment.consumer.login.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.login.R;

public abstract class ActivityMpinBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    public final LinearLayout llChangePin;
    public final LinearLayout llForgetPin;

    protected ActivityMpinBinding(Object obj, View view, int i, LinearLayout linearLayout, LinearLayout linearLayout2) {
        super(obj, view, i);
        this.llChangePin = linearLayout;
        this.llForgetPin = linearLayout2;
    }

    public static ActivityMpinBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 9;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityMpinBinding activityMpinBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 21;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return activityMpinBindingInflate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivityMpinBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 67;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityMpinBinding activityMpinBinding = (ActivityMpinBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_mpin, viewGroup, z, obj);
        int i4 = copydefault + 81;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return activityMpinBinding;
        }
        throw null;
    }

    public static ActivityMpinBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 31;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivityMpinBinding activityMpinBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 117;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activityMpinBindingInflate;
    }

    @Deprecated
    public static ActivityMpinBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 109;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivityMpinBinding activityMpinBinding = (ActivityMpinBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_mpin, null, false, obj);
        int i4 = ShareDataUIState + 103;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activityMpinBinding;
    }

    public static ActivityMpinBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 63;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivityMpinBinding activityMpinBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 29;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return activityMpinBindingBind;
        }
        throw null;
    }

    @Deprecated
    public static ActivityMpinBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 41;
        ShareDataUIState = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        ActivityMpinBinding activityMpinBinding = (ActivityMpinBinding) bind(obj, view, R.layout.activity_mpin);
        int i3 = ShareDataUIState + 33;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            return activityMpinBinding;
        }
        obj2.hashCode();
        throw null;
    }
}
