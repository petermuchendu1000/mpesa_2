package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundRecyclerView;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class FragmentRecentMiniAppBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int component3;
    public final ImageView ivBackground;
    public final RoundRecyclerView recyclerView;
    public final RoundConstraintLayout root;

    protected FragmentRecentMiniAppBinding(Object obj, View view, int i, ImageView imageView, RoundRecyclerView roundRecyclerView, RoundConstraintLayout roundConstraintLayout) {
        super(obj, view, i);
        this.ivBackground = imageView;
        this.recyclerView = roundRecyclerView;
        this.root = roundConstraintLayout;
    }

    public static FragmentRecentMiniAppBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 35;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return inflate(layoutInflater, viewGroup, z, defaultComponent);
        }
        inflate(layoutInflater, viewGroup, z, defaultComponent);
        throw null;
    }

    @Deprecated
    public static FragmentRecentMiniAppBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 33;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        FragmentRecentMiniAppBinding fragmentRecentMiniAppBinding = (FragmentRecentMiniAppBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_recent_mini_app, viewGroup, z, obj);
        int i3 = ShareDataUIState + 7;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return fragmentRecentMiniAppBinding;
    }

    public static FragmentRecentMiniAppBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 73;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentRecentMiniAppBinding fragmentRecentMiniAppBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        if (i3 != 0) {
            int i4 = 99 / 0;
        }
        return fragmentRecentMiniAppBindingInflate;
    }

    @Deprecated
    public static FragmentRecentMiniAppBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 9;
        ShareDataUIState = i2 % 128;
        return (FragmentRecentMiniAppBinding) ViewDataBinding.inflateInternal(layoutInflater, i2 % 2 == 0 ? R.layout.fragment_recent_mini_app : R.layout.fragment_recent_mini_app, null, false, obj);
    }

    public static FragmentRecentMiniAppBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 5;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentRecentMiniAppBinding fragmentRecentMiniAppBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 117;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return fragmentRecentMiniAppBindingBind;
    }

    @Deprecated
    public static FragmentRecentMiniAppBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 37;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentRecentMiniAppBinding fragmentRecentMiniAppBinding = (FragmentRecentMiniAppBinding) bind(obj, view, R.layout.fragment_recent_mini_app);
        if (i3 == 0) {
            return fragmentRecentMiniAppBinding;
        }
        throw null;
    }
}
