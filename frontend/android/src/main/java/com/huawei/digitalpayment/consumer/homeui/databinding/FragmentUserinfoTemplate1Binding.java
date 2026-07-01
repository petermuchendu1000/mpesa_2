package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class FragmentUserinfoTemplate1Binding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int component1;
    public final RoundImageView background;
    public final ConstraintLayout clHeader;
    public final RoundImageView ivProfile;
    public final RoundImageView ivRight;
    public final RoundConstraintLayout root;
    public final View topView;
    public final TextView tvName;
    public final TextView tvPhone;
    public final View viewProfile;

    protected FragmentUserinfoTemplate1Binding(Object obj, View view, int i, RoundImageView roundImageView, ConstraintLayout constraintLayout, RoundImageView roundImageView2, RoundImageView roundImageView3, RoundConstraintLayout roundConstraintLayout, View view2, TextView textView, TextView textView2, View view3) {
        super(obj, view, i);
        this.background = roundImageView;
        this.clHeader = constraintLayout;
        this.ivProfile = roundImageView2;
        this.ivRight = roundImageView3;
        this.root = roundConstraintLayout;
        this.topView = view2;
        this.tvName = textView;
        this.tvPhone = textView2;
        this.viewProfile = view3;
    }

    public static FragmentUserinfoTemplate1Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 85;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        FragmentUserinfoTemplate1Binding fragmentUserinfoTemplate1BindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        if (i3 == 0) {
            int i4 = 82 / 0;
        }
        return fragmentUserinfoTemplate1BindingInflate;
    }

    @Deprecated
    public static FragmentUserinfoTemplate1Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 21;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        FragmentUserinfoTemplate1Binding fragmentUserinfoTemplate1Binding = (FragmentUserinfoTemplate1Binding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_userinfo_template1, viewGroup, z, obj);
        int i3 = component1 + 117;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 96 / 0;
        }
        return fragmentUserinfoTemplate1Binding;
    }

    public static FragmentUserinfoTemplate1Binding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 71;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FragmentUserinfoTemplate1Binding fragmentUserinfoTemplate1BindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 25;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return fragmentUserinfoTemplate1BindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static FragmentUserinfoTemplate1Binding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 75;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        FragmentUserinfoTemplate1Binding fragmentUserinfoTemplate1Binding = (FragmentUserinfoTemplate1Binding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_userinfo_template1, null, false, obj);
        int i4 = ShareDataUIState + 61;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return fragmentUserinfoTemplate1Binding;
        }
        obj2.hashCode();
        throw null;
    }

    public static FragmentUserinfoTemplate1Binding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 109;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return bind(view, defaultComponent);
        }
        bind(view, defaultComponent);
        throw null;
    }

    @Deprecated
    public static FragmentUserinfoTemplate1Binding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 13;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingBind = bind(obj, view, R.layout.fragment_userinfo_template1);
        if (i3 != 0) {
            return (FragmentUserinfoTemplate1Binding) viewDataBindingBind;
        }
        int i4 = 90 / 0;
        return (FragmentUserinfoTemplate1Binding) viewDataBindingBind;
    }
}
