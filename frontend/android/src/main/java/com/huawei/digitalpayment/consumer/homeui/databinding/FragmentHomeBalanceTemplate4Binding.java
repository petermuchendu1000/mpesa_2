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

public abstract class FragmentHomeBalanceTemplate4Binding extends ViewDataBinding {
    private static int component3 = 1;
    private static int copydefault;
    public final ImageView ivArrow;
    public final ImageView ivBackground;
    public final ImageView ivBalance;
    public final RoundConstraintLayout root;
    public final TextView tvBalance;
    public final TextView tvBalanceValue;
    public final TextView tvUnit;

    protected FragmentHomeBalanceTemplate4Binding(Object obj, View view, int i, ImageView imageView, ImageView imageView2, ImageView imageView3, RoundConstraintLayout roundConstraintLayout, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.ivArrow = imageView;
        this.ivBackground = imageView2;
        this.ivBalance = imageView3;
        this.root = roundConstraintLayout;
        this.tvBalance = textView;
        this.tvBalanceValue = textView2;
        this.tvUnit = textView3;
    }

    public static FragmentHomeBalanceTemplate4Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 5;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        FragmentHomeBalanceTemplate4Binding fragmentHomeBalanceTemplate4BindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 71;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentHomeBalanceTemplate4BindingInflate;
    }

    @Deprecated
    public static FragmentHomeBalanceTemplate4Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 1;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        FragmentHomeBalanceTemplate4Binding fragmentHomeBalanceTemplate4Binding = (FragmentHomeBalanceTemplate4Binding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_home_balance_template4, viewGroup, z, obj);
        int i4 = copydefault + 27;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return fragmentHomeBalanceTemplate4Binding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static FragmentHomeBalanceTemplate4Binding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 67;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        FragmentHomeBalanceTemplate4Binding fragmentHomeBalanceTemplate4BindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = component3 + 111;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return fragmentHomeBalanceTemplate4BindingInflate;
    }

    @Deprecated
    public static FragmentHomeBalanceTemplate4Binding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 111;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        FragmentHomeBalanceTemplate4Binding fragmentHomeBalanceTemplate4Binding = (FragmentHomeBalanceTemplate4Binding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_home_balance_template4, null, false, obj);
        int i4 = copydefault + 29;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return fragmentHomeBalanceTemplate4Binding;
        }
        obj2.hashCode();
        throw null;
    }

    public static FragmentHomeBalanceTemplate4Binding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 105;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentHomeBalanceTemplate4Binding fragmentHomeBalanceTemplate4BindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 51;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentHomeBalanceTemplate4BindingBind;
    }

    @Deprecated
    public static FragmentHomeBalanceTemplate4Binding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 11;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentHomeBalanceTemplate4Binding fragmentHomeBalanceTemplate4Binding = (FragmentHomeBalanceTemplate4Binding) bind(obj, view, R.layout.fragment_home_balance_template4);
        int i4 = copydefault + 125;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return fragmentHomeBalanceTemplate4Binding;
        }
        throw null;
    }
}
