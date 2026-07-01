package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class FragmentUserinfoTemplate2Binding extends ViewDataBinding {
    private static int component1 = 1;
    private static int copydefault;
    public final RoundImageView background;
    public final RoundImageView ivAvatar;
    public final View line;
    public final RoundConstraintLayout root;
    public final TextView tvLevel;
    public final TextView tvLevelNum;
    public final TextView tvMyCoupons;
    public final TextView tvMyCouponsNum;
    public final TextView tvMyLoyalty;
    public final TextView tvMyLoyaltyNum;
    public final TextView tvName;
    public final TextView tvPhone;
    public final RoundTextView tvProfile;

    protected FragmentUserinfoTemplate2Binding(Object obj, View view, int i, RoundImageView roundImageView, RoundImageView roundImageView2, View view2, RoundConstraintLayout roundConstraintLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, RoundTextView roundTextView) {
        super(obj, view, i);
        this.background = roundImageView;
        this.ivAvatar = roundImageView2;
        this.line = view2;
        this.root = roundConstraintLayout;
        this.tvLevel = textView;
        this.tvLevelNum = textView2;
        this.tvMyCoupons = textView3;
        this.tvMyCouponsNum = textView4;
        this.tvMyLoyalty = textView5;
        this.tvMyLoyaltyNum = textView6;
        this.tvName = textView7;
        this.tvPhone = textView8;
        this.tvProfile = roundTextView;
    }

    public static FragmentUserinfoTemplate2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 65;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return inflate(layoutInflater, viewGroup, z, defaultComponent);
        }
        inflate(layoutInflater, viewGroup, z, defaultComponent);
        throw null;
    }

    @Deprecated
    public static FragmentUserinfoTemplate2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 23;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        FragmentUserinfoTemplate2Binding fragmentUserinfoTemplate2Binding = (FragmentUserinfoTemplate2Binding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_userinfo_template2, viewGroup, z, obj);
        if (i3 == 0) {
            return fragmentUserinfoTemplate2Binding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static FragmentUserinfoTemplate2Binding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 1;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return inflate(layoutInflater, defaultComponent);
        }
        inflate(layoutInflater, defaultComponent);
        throw null;
    }

    @Deprecated
    public static FragmentUserinfoTemplate2Binding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 119;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FragmentUserinfoTemplate2Binding fragmentUserinfoTemplate2Binding = (FragmentUserinfoTemplate2Binding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_userinfo_template2, null, false, obj);
        int i4 = component1 + 37;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return fragmentUserinfoTemplate2Binding;
    }

    public static FragmentUserinfoTemplate2Binding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 107;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        FragmentUserinfoTemplate2Binding fragmentUserinfoTemplate2BindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 59;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentUserinfoTemplate2BindingBind;
    }

    @Deprecated
    public static FragmentUserinfoTemplate2Binding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 33;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingBind = bind(obj, view, R.layout.fragment_userinfo_template2);
        if (i3 == 0) {
            return (FragmentUserinfoTemplate2Binding) viewDataBindingBind;
        }
        throw null;
    }
}
