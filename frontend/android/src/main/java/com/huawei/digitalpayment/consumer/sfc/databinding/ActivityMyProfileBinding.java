package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ActivityMyProfileBinding extends ViewDataBinding {
    private static int component2 = 1;
    private static int copydefault;
    public final FrameLayout flFragmentContainer;

    protected ActivityMyProfileBinding(Object obj, View view, int i, FrameLayout frameLayout) {
        super(obj, view, i);
        this.flFragmentContainer = frameLayout;
    }

    public static ActivityMyProfileBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 59;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityMyProfileBinding activityMyProfileBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 63;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activityMyProfileBindingInflate;
    }

    @Deprecated
    public static ActivityMyProfileBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 49;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityMyProfileBinding activityMyProfileBinding = (ActivityMyProfileBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_my_profile, viewGroup, z, obj);
        int i4 = component2 + 87;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 97 / 0;
        }
        return activityMyProfileBinding;
    }

    public static ActivityMyProfileBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 123;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityMyProfileBinding activityMyProfileBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 125;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return activityMyProfileBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static ActivityMyProfileBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = component2 + 97;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            i = R.layout.activity_my_profile;
            z = true;
        } else {
            i = R.layout.activity_my_profile;
            z = false;
        }
        ActivityMyProfileBinding activityMyProfileBinding = (ActivityMyProfileBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
        int i4 = component2 + 27;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return activityMyProfileBinding;
        }
        throw null;
    }

    public static ActivityMyProfileBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 45;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ActivityMyProfileBinding activityMyProfileBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = copydefault + 121;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 32 / 0;
        }
        return activityMyProfileBindingBind;
    }

    @Deprecated
    public static ActivityMyProfileBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 35;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityMyProfileBinding activityMyProfileBinding = (ActivityMyProfileBinding) bind(obj, view, R.layout.activity_my_profile);
        int i4 = copydefault + 69;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return activityMyProfileBinding;
    }
}
