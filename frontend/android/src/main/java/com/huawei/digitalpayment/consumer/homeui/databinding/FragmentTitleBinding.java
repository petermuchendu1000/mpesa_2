package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class FragmentTitleBinding extends ViewDataBinding {
    private static int component2 = 1;
    private static int component3;
    public final RoundConstraintLayout clRoot;
    public final ImageView imageBg;
    public final RoundTextView tvTitle;

    protected FragmentTitleBinding(Object obj, View view, int i, RoundConstraintLayout roundConstraintLayout, ImageView imageView, RoundTextView roundTextView) {
        super(obj, view, i);
        this.clRoot = roundConstraintLayout;
        this.imageBg = imageView;
        this.tvTitle = roundTextView;
    }

    public static FragmentTitleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 117;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return inflate(layoutInflater, viewGroup, z, defaultComponent);
        }
        inflate(layoutInflater, viewGroup, z, defaultComponent);
        throw null;
    }

    @Deprecated
    public static FragmentTitleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 99;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FragmentTitleBinding fragmentTitleBinding = (FragmentTitleBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_title, viewGroup, z, obj);
        int i4 = component2 + 95;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentTitleBinding;
    }

    public static FragmentTitleBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 105;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return inflate(layoutInflater, defaultComponent);
        }
        inflate(layoutInflater, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static FragmentTitleBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 9;
        component2 = i2 % 128;
        FragmentTitleBinding fragmentTitleBinding = (FragmentTitleBinding) ViewDataBinding.inflateInternal(layoutInflater, i2 % 2 == 0 ? R.layout.fragment_title : R.layout.fragment_title, null, false, obj);
        int i3 = component2 + 67;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 70 / 0;
        }
        return fragmentTitleBinding;
    }

    public static FragmentTitleBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 95;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentTitleBinding fragmentTitleBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        if (i3 != 0) {
            int i4 = 97 / 0;
        }
        return fragmentTitleBindingBind;
    }

    @Deprecated
    public static FragmentTitleBinding bind(View view, Object obj) {
        FragmentTitleBinding fragmentTitleBinding;
        int i = 2 % 2;
        int i2 = component3 + 107;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            fragmentTitleBinding = (FragmentTitleBinding) bind(obj, view, R.layout.fragment_title);
            int i3 = 81 / 0;
        } else {
            fragmentTitleBinding = (FragmentTitleBinding) bind(obj, view, R.layout.fragment_title);
        }
        int i4 = component3 + 121;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentTitleBinding;
    }
}
