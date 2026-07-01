package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class ActivityMySettingBinding extends ViewDataBinding {
    private static int component3 = 1;
    private static int copydefault;
    public final FrameLayout flFragmentContainer;

    protected ActivityMySettingBinding(Object obj, View view, int i, FrameLayout frameLayout) {
        super(obj, view, i);
        this.flFragmentContainer = frameLayout;
    }

    public static ActivityMySettingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 17;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityMySettingBinding activityMySettingBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 65;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activityMySettingBindingInflate;
    }

    @Deprecated
    public static ActivityMySettingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 11;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityMySettingBinding activityMySettingBinding = (ActivityMySettingBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_my_setting, viewGroup, z, obj);
        if (i3 != 0) {
            int i4 = 77 / 0;
        }
        return activityMySettingBinding;
    }

    public static ActivityMySettingBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 107;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityMySettingBinding activityMySettingBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        if (i3 == 0) {
            int i4 = 66 / 0;
        }
        return activityMySettingBindingInflate;
    }

    @Deprecated
    public static ActivityMySettingBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 21;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        ActivityMySettingBinding activityMySettingBinding = (ActivityMySettingBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_my_setting, null, false, obj);
        int i4 = component3 + 83;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return activityMySettingBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static ActivityMySettingBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 91;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityMySettingBinding activityMySettingBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 7;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return activityMySettingBindingBind;
        }
        throw null;
    }

    @Deprecated
    public static ActivityMySettingBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 121;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityMySettingBinding activityMySettingBinding = (ActivityMySettingBinding) bind(obj, view, R.layout.activity_my_setting);
        if (i3 == 0) {
            return activityMySettingBinding;
        }
        throw null;
    }
}
