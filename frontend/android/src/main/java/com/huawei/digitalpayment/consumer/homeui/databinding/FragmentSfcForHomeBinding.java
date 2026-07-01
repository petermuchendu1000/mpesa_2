package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.Barrier;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class FragmentSfcForHomeBinding extends ViewDataBinding {
    private static int component1 = 0;
    private static int component3 = 1;
    public final ComposeView composeBalanceSection;
    public final LinearLayout homeFunction;
    public final LinearLayout rlRoot;
    public final NestedScrollView scrollView;
    public final Barrier viewpagerBarrier;

    protected FragmentSfcForHomeBinding(Object obj, View view, int i, ComposeView composeView, LinearLayout linearLayout, LinearLayout linearLayout2, NestedScrollView nestedScrollView, Barrier barrier) {
        super(obj, view, i);
        this.composeBalanceSection = composeView;
        this.homeFunction = linearLayout;
        this.rlRoot = linearLayout2;
        this.scrollView = nestedScrollView;
        this.viewpagerBarrier = barrier;
    }

    public static FragmentSfcForHomeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 79;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcForHomeBinding fragmentSfcForHomeBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 19;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentSfcForHomeBindingInflate;
    }

    @Deprecated
    public static FragmentSfcForHomeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 109;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcForHomeBinding fragmentSfcForHomeBinding = (FragmentSfcForHomeBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_sfc_for_home, viewGroup, z, obj);
        int i4 = component1 + 117;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentSfcForHomeBinding;
    }

    public static FragmentSfcForHomeBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 55;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return inflate(layoutInflater, defaultComponent);
        }
        inflate(layoutInflater, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static FragmentSfcForHomeBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 3;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcForHomeBinding fragmentSfcForHomeBinding = (FragmentSfcForHomeBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_sfc_for_home, null, false, obj);
        int i4 = component1 + 79;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentSfcForHomeBinding;
    }

    public static FragmentSfcForHomeBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 11;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcForHomeBinding fragmentSfcForHomeBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 81;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return fragmentSfcForHomeBindingBind;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static FragmentSfcForHomeBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 81;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcForHomeBinding fragmentSfcForHomeBinding = (FragmentSfcForHomeBinding) bind(obj, view, R.layout.fragment_sfc_for_home);
        int i4 = component3 + 91;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return fragmentSfcForHomeBinding;
        }
        throw null;
    }
}
