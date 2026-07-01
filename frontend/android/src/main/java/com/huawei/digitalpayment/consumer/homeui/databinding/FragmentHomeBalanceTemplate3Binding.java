package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class FragmentHomeBalanceTemplate3Binding extends ViewDataBinding {
    private static int component3 = 1;
    private static int copydefault;
    public final ImageView ivArrow;
    public final ImageView ivBackground;
    public final ImageView ivBalance;
    public final TextView lastTransactionTitle;
    public final TextView lastTransactionValue;

    @Bindable
    protected Boolean mTransactionIsVisible;
    public final RoundConstraintLayout root;
    public final TextView tvBalance;
    public final TextView tvBalanceValue;
    public final TextView tvBalanceValuePoint;
    public final TextView tvUnit;

    public abstract void setTransactionIsVisible(Boolean bool);

    protected FragmentHomeBalanceTemplate3Binding(Object obj, View view, int i, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView, TextView textView2, RoundConstraintLayout roundConstraintLayout, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        super(obj, view, i);
        this.ivArrow = imageView;
        this.ivBackground = imageView2;
        this.ivBalance = imageView3;
        this.lastTransactionTitle = textView;
        this.lastTransactionValue = textView2;
        this.root = roundConstraintLayout;
        this.tvBalance = textView3;
        this.tvBalanceValue = textView4;
        this.tvBalanceValuePoint = textView5;
        this.tvUnit = textView6;
    }

    public Boolean getTransactionIsVisible() {
        int i = 2 % 2;
        int i2 = component3 + 97;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Boolean bool = this.mTransactionIsVisible;
        int i5 = i3 + 69;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    public static FragmentHomeBalanceTemplate3Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 91;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentHomeBalanceTemplate3Binding fragmentHomeBalanceTemplate3BindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 121;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentHomeBalanceTemplate3BindingInflate;
    }

    @Deprecated
    public static FragmentHomeBalanceTemplate3Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 65;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        FragmentHomeBalanceTemplate3Binding fragmentHomeBalanceTemplate3Binding = (FragmentHomeBalanceTemplate3Binding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_home_balance_template3, viewGroup, z, obj);
        int i3 = copydefault + 21;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return fragmentHomeBalanceTemplate3Binding;
    }

    public static FragmentHomeBalanceTemplate3Binding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 23;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        FragmentHomeBalanceTemplate3Binding fragmentHomeBalanceTemplate3BindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = copydefault + 37;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 14 / 0;
        }
        return fragmentHomeBalanceTemplate3BindingInflate;
    }

    @Deprecated
    public static FragmentHomeBalanceTemplate3Binding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 121;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        FragmentHomeBalanceTemplate3Binding fragmentHomeBalanceTemplate3Binding = (FragmentHomeBalanceTemplate3Binding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_home_balance_template3, null, false, obj);
        int i4 = component3 + 87;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return fragmentHomeBalanceTemplate3Binding;
    }

    public static FragmentHomeBalanceTemplate3Binding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 17;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        FragmentHomeBalanceTemplate3Binding fragmentHomeBalanceTemplate3BindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 81;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return fragmentHomeBalanceTemplate3BindingBind;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static FragmentHomeBalanceTemplate3Binding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 25;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        FragmentHomeBalanceTemplate3Binding fragmentHomeBalanceTemplate3Binding = (FragmentHomeBalanceTemplate3Binding) bind(obj, view, R.layout.fragment_home_balance_template3);
        int i3 = copydefault + 9;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return fragmentHomeBalanceTemplate3Binding;
    }
}
