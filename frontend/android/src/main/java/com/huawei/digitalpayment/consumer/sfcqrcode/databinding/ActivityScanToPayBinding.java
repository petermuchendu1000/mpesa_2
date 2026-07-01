package com.huawei.digitalpayment.consumer.sfcqrcode.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import com.huawei.digitalpayment.consumer.sfcqrcode.R;

public abstract class ActivityScanToPayBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    public final ComposeView composeTabs;
    public final FragmentContainerView fragmentContainer;
    public final ImageView ivBack;
    public final ConstraintLayout toolbarRoot;
    public final TextView tvTitle;

    protected ActivityScanToPayBinding(Object obj, View view, int i, ComposeView composeView, FragmentContainerView fragmentContainerView, ImageView imageView, ConstraintLayout constraintLayout, TextView textView) {
        super(obj, view, i);
        this.composeTabs = composeView;
        this.fragmentContainer = fragmentContainerView;
        this.ivBack = imageView;
        this.toolbarRoot = constraintLayout;
        this.tvTitle = textView;
    }

    public static ActivityScanToPayBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 37;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivityScanToPayBinding activityScanToPayBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 89;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return activityScanToPayBindingInflate;
    }

    @Deprecated
    public static ActivityScanToPayBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 69;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingInflateInternal = ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_scan_to_pay, viewGroup, z, obj);
        if (i3 != 0) {
            return (ActivityScanToPayBinding) viewDataBindingInflateInternal;
        }
        int i4 = 33 / 0;
        return (ActivityScanToPayBinding) viewDataBindingInflateInternal;
    }

    public static ActivityScanToPayBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 3;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivityScanToPayBinding activityScanToPayBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        if (i3 != 0) {
            int i4 = 36 / 0;
        }
        return activityScanToPayBindingInflate;
    }

    @Deprecated
    public static ActivityScanToPayBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 123;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivityScanToPayBinding activityScanToPayBinding = (ActivityScanToPayBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_scan_to_pay, null, false, obj);
        int i4 = ShareDataUIState + 55;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return activityScanToPayBinding;
    }

    public static ActivityScanToPayBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 9;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityScanToPayBinding activityScanToPayBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        if (i3 == 0) {
            int i4 = 56 / 0;
        }
        return activityScanToPayBindingBind;
    }

    @Deprecated
    public static ActivityScanToPayBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 97;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        ActivityScanToPayBinding activityScanToPayBinding = (ActivityScanToPayBinding) bind(obj, view, R.layout.activity_scan_to_pay);
        int i3 = component1 + 63;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return activityScanToPayBinding;
    }
}
