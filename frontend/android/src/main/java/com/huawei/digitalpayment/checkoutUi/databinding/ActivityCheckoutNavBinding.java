package com.huawei.digitalpayment.checkoutUi.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import com.huawei.digitalpayment.checkoutUi.R;

public abstract class ActivityCheckoutNavBinding extends ViewDataBinding {
    private static int component3 = 1;
    private static int copydefault;
    public final FrameLayout llContainer;
    public final FragmentContainerView navHostFragment;
    public final FrameLayout root;

    protected ActivityCheckoutNavBinding(Object obj, View view, int i, FrameLayout frameLayout, FragmentContainerView fragmentContainerView, FrameLayout frameLayout2) {
        super(obj, view, i);
        this.llContainer = frameLayout;
        this.navHostFragment = fragmentContainerView;
        this.root = frameLayout2;
    }

    public static ActivityCheckoutNavBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 121;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityCheckoutNavBinding activityCheckoutNavBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 125;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activityCheckoutNavBindingInflate;
    }

    @Deprecated
    public static ActivityCheckoutNavBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 71;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityCheckoutNavBinding activityCheckoutNavBinding = (ActivityCheckoutNavBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_checkout_nav, viewGroup, z, obj);
        int i4 = component3 + 47;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 26 / 0;
        }
        return activityCheckoutNavBinding;
    }

    public static ActivityCheckoutNavBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 51;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityCheckoutNavBinding activityCheckoutNavBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 27;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 78 / 0;
        }
        return activityCheckoutNavBindingInflate;
    }

    @Deprecated
    public static ActivityCheckoutNavBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 27;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        ActivityCheckoutNavBinding activityCheckoutNavBinding = (ActivityCheckoutNavBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_checkout_nav, null, false, obj);
        int i4 = component3 + 47;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return activityCheckoutNavBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static ActivityCheckoutNavBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 97;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ActivityCheckoutNavBinding activityCheckoutNavBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = component3 + 47;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return activityCheckoutNavBindingBind;
    }

    @Deprecated
    public static ActivityCheckoutNavBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 111;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityCheckoutNavBinding activityCheckoutNavBinding = (ActivityCheckoutNavBinding) bind(obj, view, R.layout.activity_checkout_nav);
        int i4 = component3 + 27;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 26 / 0;
        }
        return activityCheckoutNavBinding;
    }
}
