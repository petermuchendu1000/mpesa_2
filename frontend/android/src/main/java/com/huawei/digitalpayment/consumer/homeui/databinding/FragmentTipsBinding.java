package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.text.MarqueeView;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class FragmentTipsBinding extends ViewDataBinding {
    private static int component1 = 1;
    private static int component2;
    public final ImageView background;
    public final MarqueeView marqueeView;
    public final RoundConstraintLayout tipsRoot;

    protected FragmentTipsBinding(Object obj, View view, int i, ImageView imageView, MarqueeView marqueeView, RoundConstraintLayout roundConstraintLayout) {
        super(obj, view, i);
        this.background = imageView;
        this.marqueeView = marqueeView;
        this.tipsRoot = roundConstraintLayout;
    }

    public static FragmentTipsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 53;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FragmentTipsBinding fragmentTipsBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 3;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return fragmentTipsBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static FragmentTipsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 13;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FragmentTipsBinding fragmentTipsBinding = (FragmentTipsBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_tips, viewGroup, z, obj);
        int i4 = component2 + 113;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return fragmentTipsBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static FragmentTipsBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 13;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FragmentTipsBinding fragmentTipsBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 59;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentTipsBindingInflate;
    }

    @Deprecated
    public static FragmentTipsBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 79;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FragmentTipsBinding fragmentTipsBinding = (FragmentTipsBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_tips, null, false, obj);
        int i4 = component1 + 115;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentTipsBinding;
    }

    public static FragmentTipsBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 119;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FragmentTipsBinding fragmentTipsBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 77;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 55 / 0;
        }
        return fragmentTipsBindingBind;
    }

    @Deprecated
    public static FragmentTipsBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 119;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingBind = bind(obj, view, R.layout.fragment_tips);
        if (i3 != 0) {
            return (FragmentTipsBinding) viewDataBindingBind;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
