package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.digitalpayment.consumer.homeui.R;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;

public abstract class FragmentSfcChildHomeBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    public final LinearLayout llProfileContainer;
    public final FragmentContainerView profileContainer;
    public final SmartRefreshLayout refreshLayout;
    public final RoundConstraintLayout rlScan;
    public final RoundConstraintLayout rlScanImage;
    public final NestedScrollView scrollView;
    public final FragmentContainerView sfcHomeContainer;
    public final View topBg;
    public final View viewStatusBar;

    protected FragmentSfcChildHomeBinding(Object obj, View view, int i, LinearLayout linearLayout, FragmentContainerView fragmentContainerView, SmartRefreshLayout smartRefreshLayout, RoundConstraintLayout roundConstraintLayout, RoundConstraintLayout roundConstraintLayout2, NestedScrollView nestedScrollView, FragmentContainerView fragmentContainerView2, View view2, View view3) {
        super(obj, view, i);
        this.llProfileContainer = linearLayout;
        this.profileContainer = fragmentContainerView;
        this.refreshLayout = smartRefreshLayout;
        this.rlScan = roundConstraintLayout;
        this.rlScanImage = roundConstraintLayout2;
        this.scrollView = nestedScrollView;
        this.sfcHomeContainer = fragmentContainerView2;
        this.topBg = view2;
        this.viewStatusBar = view3;
    }

    public static FragmentSfcChildHomeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 53;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return inflate(layoutInflater, viewGroup, z, defaultComponent);
        }
        inflate(layoutInflater, viewGroup, z, defaultComponent);
        throw null;
    }

    @Deprecated
    public static FragmentSfcChildHomeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 53;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcChildHomeBinding fragmentSfcChildHomeBinding = (FragmentSfcChildHomeBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_sfc_child_home, viewGroup, z, obj);
        int i4 = ShareDataUIState + 75;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentSfcChildHomeBinding;
    }

    public static FragmentSfcChildHomeBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 91;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcChildHomeBinding fragmentSfcChildHomeBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 11;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 31 / 0;
        }
        return fragmentSfcChildHomeBindingInflate;
    }

    @Deprecated
    public static FragmentSfcChildHomeBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 1;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcChildHomeBinding fragmentSfcChildHomeBinding = (FragmentSfcChildHomeBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_sfc_child_home, null, false, obj);
        int i4 = component2 + 83;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return fragmentSfcChildHomeBinding;
    }

    public static FragmentSfcChildHomeBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 7;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcChildHomeBinding fragmentSfcChildHomeBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 105;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return fragmentSfcChildHomeBindingBind;
    }

    @Deprecated
    public static FragmentSfcChildHomeBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 27;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcChildHomeBinding fragmentSfcChildHomeBinding = (FragmentSfcChildHomeBinding) bind(obj, view, R.layout.fragment_sfc_child_home);
        int i4 = component2 + 99;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return fragmentSfcChildHomeBinding;
        }
        throw null;
    }
}
