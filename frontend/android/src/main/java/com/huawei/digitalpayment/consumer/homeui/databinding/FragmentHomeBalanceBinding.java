package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class FragmentHomeBalanceBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    public final ImageView ivBackground;
    public final ImageView ivBalance;
    public final RoundConstraintLayout root;
    public final TextView tvBalance;
    public final TextView tvBalanceValue;
    public final TextView tvBalanceValueTag;
    public final TextView tvUnit;

    protected FragmentHomeBalanceBinding(Object obj, View view, int i, ImageView imageView, ImageView imageView2, RoundConstraintLayout roundConstraintLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.ivBackground = imageView;
        this.ivBalance = imageView2;
        this.root = roundConstraintLayout;
        this.tvBalance = textView;
        this.tvBalanceValue = textView2;
        this.tvBalanceValueTag = textView3;
        this.tvUnit = textView4;
    }

    public static FragmentHomeBalanceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 21;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        FragmentHomeBalanceBinding fragmentHomeBalanceBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = component2 + 25;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return fragmentHomeBalanceBindingInflate;
    }

    @Deprecated
    public static FragmentHomeBalanceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 35;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        FragmentHomeBalanceBinding fragmentHomeBalanceBinding = (FragmentHomeBalanceBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_home_balance, viewGroup, z, obj);
        int i4 = component2 + 43;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return fragmentHomeBalanceBinding;
    }

    public static FragmentHomeBalanceBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 95;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FragmentHomeBalanceBinding fragmentHomeBalanceBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        if (i3 == 0) {
            int i4 = 25 / 0;
        }
        return fragmentHomeBalanceBindingInflate;
    }

    @Deprecated
    public static FragmentHomeBalanceBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 1;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        FragmentHomeBalanceBinding fragmentHomeBalanceBinding = (FragmentHomeBalanceBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_home_balance, null, false, obj);
        int i4 = component2 + 15;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 96 / 0;
        }
        return fragmentHomeBalanceBinding;
    }

    public static FragmentHomeBalanceBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 75;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FragmentHomeBalanceBinding fragmentHomeBalanceBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 125;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return fragmentHomeBalanceBindingBind;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static FragmentHomeBalanceBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 45;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingBind = bind(obj, view, R.layout.fragment_home_balance);
        if (i3 == 0) {
            return (FragmentHomeBalanceBinding) viewDataBindingBind;
        }
        int i4 = 3 / 0;
        return (FragmentHomeBalanceBinding) viewDataBindingBind;
    }
}
