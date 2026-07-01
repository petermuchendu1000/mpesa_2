package com.huawei.digitalpayment.checkoutUi.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import com.huawei.digitalpayment.checkoutUi.R;

public abstract class ActivitySfcCheckoutNavBinding extends ViewDataBinding {
    private static int component1 = 1;
    private static int component2;
    public final FrameLayout llContainer;
    public final FragmentContainerView navHostFragment;
    public final FrameLayout root;

    protected ActivitySfcCheckoutNavBinding(Object obj, View view, int i, FrameLayout frameLayout, FragmentContainerView fragmentContainerView, FrameLayout frameLayout2) {
        super(obj, view, i);
        this.llContainer = frameLayout;
        this.navHostFragment = fragmentContainerView;
        this.root = frameLayout2;
    }

    public static ActivitySfcCheckoutNavBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 115;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ActivitySfcCheckoutNavBinding activitySfcCheckoutNavBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = component2 + 3;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return activitySfcCheckoutNavBindingInflate;
    }

    @Deprecated
    public static ActivitySfcCheckoutNavBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 77;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcCheckoutNavBinding activitySfcCheckoutNavBinding = (ActivitySfcCheckoutNavBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_checkout_nav, viewGroup, z, obj);
        int i4 = component2 + 33;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 26 / 0;
        }
        return activitySfcCheckoutNavBinding;
    }

    public static ActivitySfcCheckoutNavBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 33;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return inflate(layoutInflater, defaultComponent);
        }
        inflate(layoutInflater, defaultComponent);
        throw null;
    }

    @Deprecated
    public static ActivitySfcCheckoutNavBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 93;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcCheckoutNavBinding activitySfcCheckoutNavBinding = (ActivitySfcCheckoutNavBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_checkout_nav, null, false, obj);
        int i4 = component1 + 11;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return activitySfcCheckoutNavBinding;
        }
        throw null;
    }

    public static ActivitySfcCheckoutNavBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 59;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ActivitySfcCheckoutNavBinding activitySfcCheckoutNavBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = component1 + 65;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return activitySfcCheckoutNavBindingBind;
    }

    @Deprecated
    public static ActivitySfcCheckoutNavBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 25;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        ActivitySfcCheckoutNavBinding activitySfcCheckoutNavBinding = (ActivitySfcCheckoutNavBinding) bind(obj, view, R.layout.activity_sfc_checkout_nav);
        int i3 = component1 + 113;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return activitySfcCheckoutNavBinding;
    }
}
