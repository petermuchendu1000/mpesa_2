package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ActivityPesaBinding extends ViewDataBinding {
    private static int component3 = 0;
    private static int copydefault = 1;
    public final ComposeView composeTabs;
    public final ViewPager2 viewPager;

    protected ActivityPesaBinding(Object obj, View view, int i, ComposeView composeView, ViewPager2 viewPager2) {
        super(obj, view, i);
        this.composeTabs = composeView;
        this.viewPager = viewPager2;
    }

    public static ActivityPesaBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 77;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ActivityPesaBinding activityPesaBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = copydefault + 101;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return activityPesaBindingInflate;
    }

    @Deprecated
    public static ActivityPesaBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 49;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        ActivityPesaBinding activityPesaBinding = (ActivityPesaBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_pesa, viewGroup, z, obj);
        int i3 = component3 + 41;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return activityPesaBinding;
    }

    public static ActivityPesaBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 73;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return inflate(layoutInflater, defaultComponent);
        }
        inflate(layoutInflater, defaultComponent);
        throw null;
    }

    @Deprecated
    public static ActivityPesaBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 15;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityPesaBinding activityPesaBinding = (ActivityPesaBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_pesa, null, false, obj);
        int i4 = component3 + 115;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return activityPesaBinding;
        }
        throw null;
    }

    public static ActivityPesaBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 55;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityPesaBinding activityPesaBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 55;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activityPesaBindingBind;
    }

    @Deprecated
    public static ActivityPesaBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 29;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityPesaBinding activityPesaBinding = (ActivityPesaBinding) bind(obj, view, R.layout.activity_pesa);
        int i4 = copydefault + 119;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 69 / 0;
        }
        return activityPesaBinding;
    }
}
