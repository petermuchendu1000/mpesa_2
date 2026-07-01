package com.huawei.digitalpayment.consumer.basic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.viewpager.ViewPager2Indicator;
import com.huawei.digitalpayment.consumer.basic.R;

public abstract class BasicActivityGuideBinding extends ViewDataBinding {
    private static int component1 = 1;
    private static int component2;
    public final ViewPager2Indicator indicator;
    public final LoadingButton tvStart;
    public final ViewPager2 viewpager;

    protected BasicActivityGuideBinding(Object obj, View view, int i, ViewPager2Indicator viewPager2Indicator, LoadingButton loadingButton, ViewPager2 viewPager2) {
        super(obj, view, i);
        this.indicator = viewPager2Indicator;
        this.tvStart = loadingButton;
        this.viewpager = viewPager2;
    }

    public static BasicActivityGuideBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 113;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        BasicActivityGuideBinding basicActivityGuideBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 103;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return basicActivityGuideBindingInflate;
    }

    @Deprecated
    public static BasicActivityGuideBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 19;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        BasicActivityGuideBinding basicActivityGuideBinding = (BasicActivityGuideBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.basic_activity_guide, viewGroup, z, obj);
        int i4 = component2 + 63;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 84 / 0;
        }
        return basicActivityGuideBinding;
    }

    public static BasicActivityGuideBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 1;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        BasicActivityGuideBinding basicActivityGuideBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = component2 + 73;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 45 / 0;
        }
        return basicActivityGuideBindingInflate;
    }

    @Deprecated
    public static BasicActivityGuideBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 15;
        component2 = i2 % 128;
        BasicActivityGuideBinding basicActivityGuideBinding = (BasicActivityGuideBinding) ViewDataBinding.inflateInternal(layoutInflater, i2 % 2 != 0 ? R.layout.basic_activity_guide : R.layout.basic_activity_guide, null, false, obj);
        int i3 = component2 + 37;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return basicActivityGuideBinding;
    }

    public static BasicActivityGuideBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 99;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return bind(view, defaultComponent);
        }
        bind(view, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static BasicActivityGuideBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 119;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        BasicActivityGuideBinding basicActivityGuideBinding = (BasicActivityGuideBinding) bind(obj, view, R.layout.basic_activity_guide);
        int i3 = component1 + 65;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return basicActivityGuideBinding;
    }
}
