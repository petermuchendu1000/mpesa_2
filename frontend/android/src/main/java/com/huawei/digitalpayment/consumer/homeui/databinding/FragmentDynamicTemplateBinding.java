package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.digitalpayment.consumer.base.ui.widget.BaseRefreshHeader;
import com.huawei.digitalpayment.consumer.homeui.R;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;

public abstract class FragmentDynamicTemplateBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    public final LinearLayout container;
    public final ImageView ivBackground;
    public final BaseRefreshHeader refreshHeader;
    public final SmartRefreshLayout refreshLayout;
    public final RoundConstraintLayout root;
    public final NestedScrollView scrollView;
    public final View statusBar;

    protected FragmentDynamicTemplateBinding(Object obj, View view, int i, LinearLayout linearLayout, ImageView imageView, BaseRefreshHeader baseRefreshHeader, SmartRefreshLayout smartRefreshLayout, RoundConstraintLayout roundConstraintLayout, NestedScrollView nestedScrollView, View view2) {
        super(obj, view, i);
        this.container = linearLayout;
        this.ivBackground = imageView;
        this.refreshHeader = baseRefreshHeader;
        this.refreshLayout = smartRefreshLayout;
        this.root = roundConstraintLayout;
        this.scrollView = nestedScrollView;
        this.statusBar = view2;
    }

    public static FragmentDynamicTemplateBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 63;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return inflate(layoutInflater, viewGroup, z, defaultComponent);
        }
        inflate(layoutInflater, viewGroup, z, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static FragmentDynamicTemplateBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 45;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        FragmentDynamicTemplateBinding fragmentDynamicTemplateBinding = (FragmentDynamicTemplateBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_dynamic_template, viewGroup, z, obj);
        int i4 = ShareDataUIState + 59;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return fragmentDynamicTemplateBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static FragmentDynamicTemplateBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 79;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        FragmentDynamicTemplateBinding fragmentDynamicTemplateBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 95;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return fragmentDynamicTemplateBindingInflate;
    }

    @Deprecated
    public static FragmentDynamicTemplateBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 61;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return (FragmentDynamicTemplateBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_dynamic_template, null, false, obj);
    }

    public static FragmentDynamicTemplateBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 85;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        FragmentDynamicTemplateBinding fragmentDynamicTemplateBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 55;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return fragmentDynamicTemplateBindingBind;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static FragmentDynamicTemplateBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 95;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        FragmentDynamicTemplateBinding fragmentDynamicTemplateBinding = (FragmentDynamicTemplateBinding) bind(obj, view, R.layout.fragment_dynamic_template);
        if (i3 == 0) {
            return fragmentDynamicTemplateBinding;
        }
        throw null;
    }
}
