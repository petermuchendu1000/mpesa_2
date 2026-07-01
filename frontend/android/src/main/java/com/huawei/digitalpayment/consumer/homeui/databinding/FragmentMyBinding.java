package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.recyclerview.HFRecyclerView;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class FragmentMyBinding extends ViewDataBinding {
    private static int component2 = 1;
    private static int copydefault;
    public final ConstraintLayout clHeader;
    public final ImageView ivArrowRight;
    public final RoundImageView ivProfile;
    public final RoundLinearLayout llProfile;
    public final HFRecyclerView myFunctionGroupRecycler;
    public final View topView;
    public final TextView tvName;
    public final TextView tvPhone;
    public final View viewProfile;

    protected FragmentMyBinding(Object obj, View view, int i, ConstraintLayout constraintLayout, ImageView imageView, RoundImageView roundImageView, RoundLinearLayout roundLinearLayout, HFRecyclerView hFRecyclerView, View view2, TextView textView, TextView textView2, View view3) {
        super(obj, view, i);
        this.clHeader = constraintLayout;
        this.ivArrowRight = imageView;
        this.ivProfile = roundImageView;
        this.llProfile = roundLinearLayout;
        this.myFunctionGroupRecycler = hFRecyclerView;
        this.topView = view2;
        this.tvName = textView;
        this.tvPhone = textView2;
        this.viewProfile = view3;
    }

    public static FragmentMyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 61;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        FragmentMyBinding fragmentMyBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = copydefault + 29;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return fragmentMyBindingInflate;
    }

    @Deprecated
    public static FragmentMyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 111;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        FragmentMyBinding fragmentMyBinding = (FragmentMyBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_my, viewGroup, z, obj);
        int i4 = component2 + 87;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return fragmentMyBinding;
    }

    public static FragmentMyBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 61;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        FragmentMyBinding fragmentMyBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 117;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 65 / 0;
        }
        return fragmentMyBindingInflate;
    }

    @Deprecated
    public static FragmentMyBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = component2 + 25;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            i = R.layout.fragment_my;
            z = true;
        } else {
            i = R.layout.fragment_my;
            z = false;
        }
        FragmentMyBinding fragmentMyBinding = (FragmentMyBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
        int i4 = copydefault + 117;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentMyBinding;
    }

    public static FragmentMyBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 67;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        FragmentMyBinding fragmentMyBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 125;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentMyBindingBind;
    }

    @Deprecated
    public static FragmentMyBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 19;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        FragmentMyBinding fragmentMyBinding = (FragmentMyBinding) bind(obj, view, R.layout.fragment_my);
        int i3 = copydefault + 49;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return fragmentMyBinding;
    }
}
