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
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class FragmentHomeMultipleBalanceBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int component3;
    public final View divider;
    public final ImageView ivBackground;
    public final ImageView ivBalance;
    public final ImageView ivBalance2;
    public final RoundImageView ivBalance2Icon;
    public final RoundImageView ivBalance2Icon2;
    public final ImageView ivBalance2ValueIcon;
    public final RoundImageView ivBalanceIcon;
    public final RoundImageView ivBalanceIcon2;
    public final ImageView ivBalanceValueIcon;
    public final ImageView ivLogo;

    @Bindable
    protected Boolean mBalance2IsVisible;
    public final RoundConstraintLayout root;
    public final TextView tvBalance;
    public final TextView tvBalance2Title;
    public final TextView tvBalance2Value;
    public final TextView tvBalanceValue;
    public final TextView tvUnit;
    public final TextView tvWelcome;

    public abstract void setBalance2IsVisible(Boolean bool);

    protected FragmentHomeMultipleBalanceBinding(Object obj, View view, int i, View view2, ImageView imageView, ImageView imageView2, ImageView imageView3, RoundImageView roundImageView, RoundImageView roundImageView2, ImageView imageView4, RoundImageView roundImageView3, RoundImageView roundImageView4, ImageView imageView5, ImageView imageView6, RoundConstraintLayout roundConstraintLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        super(obj, view, i);
        this.divider = view2;
        this.ivBackground = imageView;
        this.ivBalance = imageView2;
        this.ivBalance2 = imageView3;
        this.ivBalance2Icon = roundImageView;
        this.ivBalance2Icon2 = roundImageView2;
        this.ivBalance2ValueIcon = imageView4;
        this.ivBalanceIcon = roundImageView3;
        this.ivBalanceIcon2 = roundImageView4;
        this.ivBalanceValueIcon = imageView5;
        this.ivLogo = imageView6;
        this.root = roundConstraintLayout;
        this.tvBalance = textView;
        this.tvBalance2Title = textView2;
        this.tvBalance2Value = textView3;
        this.tvBalanceValue = textView4;
        this.tvUnit = textView5;
        this.tvWelcome = textView6;
    }

    public Boolean getBalance2IsVisible() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 1;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        Boolean bool = this.mBalance2IsVisible;
        int i5 = i3 + 79;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return bool;
        }
        throw null;
    }

    public static FragmentHomeMultipleBalanceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 77;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentHomeMultipleBalanceBinding fragmentHomeMultipleBalanceBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 73;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentHomeMultipleBalanceBindingInflate;
    }

    @Deprecated
    public static FragmentHomeMultipleBalanceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 121;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        FragmentHomeMultipleBalanceBinding fragmentHomeMultipleBalanceBinding = (FragmentHomeMultipleBalanceBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_home_multiple_balance, viewGroup, z, obj);
        int i4 = ShareDataUIState + 81;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return fragmentHomeMultipleBalanceBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static FragmentHomeMultipleBalanceBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 85;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        FragmentHomeMultipleBalanceBinding fragmentHomeMultipleBalanceBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 41;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentHomeMultipleBalanceBindingInflate;
    }

    @Deprecated
    public static FragmentHomeMultipleBalanceBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 55;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return (FragmentHomeMultipleBalanceBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_home_multiple_balance, null, false, obj);
    }

    public static FragmentHomeMultipleBalanceBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 107;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        FragmentHomeMultipleBalanceBinding fragmentHomeMultipleBalanceBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 39;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return fragmentHomeMultipleBalanceBindingBind;
    }

    @Deprecated
    public static FragmentHomeMultipleBalanceBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 73;
        component3 = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        FragmentHomeMultipleBalanceBinding fragmentHomeMultipleBalanceBinding = (FragmentHomeMultipleBalanceBinding) bind(obj, view, R.layout.fragment_home_multiple_balance);
        int i3 = ShareDataUIState + 121;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            return fragmentHomeMultipleBalanceBinding;
        }
        obj2.hashCode();
        throw null;
    }
}
