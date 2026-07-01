package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ActivityMyProfileNavBinding extends ViewDataBinding {
    private static int component3 = 0;
    private static int copydefault = 1;
    public final FrameLayout llContainer;
    public final FragmentContainerView navHostFragment;
    public final FrameLayout root;

    protected ActivityMyProfileNavBinding(Object obj, View view, int i, FrameLayout frameLayout, FragmentContainerView fragmentContainerView, FrameLayout frameLayout2) {
        super(obj, view, i);
        this.llContainer = frameLayout;
        this.navHostFragment = fragmentContainerView;
        this.root = frameLayout2;
    }

    public static ActivityMyProfileNavBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 111;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityMyProfileNavBinding activityMyProfileNavBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        if (i3 != 0) {
            int i4 = 53 / 0;
        }
        return activityMyProfileNavBindingInflate;
    }

    @Deprecated
    public static ActivityMyProfileNavBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        ActivityMyProfileNavBinding activityMyProfileNavBinding;
        int i = 2 % 2;
        int i2 = copydefault + 19;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            activityMyProfileNavBinding = (ActivityMyProfileNavBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_my_profile_nav, viewGroup, z, obj);
            int i3 = 28 / 0;
        } else {
            activityMyProfileNavBinding = (ActivityMyProfileNavBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_my_profile_nav, viewGroup, z, obj);
        }
        int i4 = copydefault + 125;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 7 / 0;
        }
        return activityMyProfileNavBinding;
    }

    public static ActivityMyProfileNavBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 53;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityMyProfileNavBinding activityMyProfileNavBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 101;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return activityMyProfileNavBindingInflate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivityMyProfileNavBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 109;
        component3 = i2 % 128;
        ActivityMyProfileNavBinding activityMyProfileNavBinding = (ActivityMyProfileNavBinding) (i2 % 2 != 0 ? ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_my_profile_nav, null, true, obj) : ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_my_profile_nav, null, false, obj));
        int i3 = copydefault + 115;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 26 / 0;
        }
        return activityMyProfileNavBinding;
    }

    public static ActivityMyProfileNavBinding bind(View view) {
        ActivityMyProfileNavBinding activityMyProfileNavBindingBind;
        int i = 2 % 2;
        int i2 = component3 + 49;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            activityMyProfileNavBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
            int i3 = 49 / 0;
        } else {
            activityMyProfileNavBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        }
        int i4 = copydefault + 73;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 62 / 0;
        }
        return activityMyProfileNavBindingBind;
    }

    @Deprecated
    public static ActivityMyProfileNavBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 31;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingBind = bind(obj, view, R.layout.activity_my_profile_nav);
        if (i3 == 0) {
            return (ActivityMyProfileNavBinding) viewDataBindingBind;
        }
        throw null;
    }
}
