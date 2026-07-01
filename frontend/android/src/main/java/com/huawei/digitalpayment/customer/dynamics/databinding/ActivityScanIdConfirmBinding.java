package com.huawei.digitalpayment.customer.dynamics.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.digitalpayment.customer.dynamics.R;

public abstract class ActivityScanIdConfirmBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int component1;
    public final RoundImageView imageView;
    public final ImageView ivBack;
    public final ImageView ivConfirm;
    public final ImageView ivRefresh;
    public final RoundLinearLayout llTips;

    protected ActivityScanIdConfirmBinding(Object obj, View view, int i, RoundImageView roundImageView, ImageView imageView, ImageView imageView2, ImageView imageView3, RoundLinearLayout roundLinearLayout) {
        super(obj, view, i);
        this.imageView = roundImageView;
        this.ivBack = imageView;
        this.ivConfirm = imageView2;
        this.ivRefresh = imageView3;
        this.llTips = roundLinearLayout;
    }

    public static ActivityScanIdConfirmBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 119;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityScanIdConfirmBinding activityScanIdConfirmBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 29;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return activityScanIdConfirmBindingInflate;
    }

    @Deprecated
    public static ActivityScanIdConfirmBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 1;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingInflateInternal = ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_scan_id_confirm, viewGroup, z, obj);
        if (i3 != 0) {
            return (ActivityScanIdConfirmBinding) viewDataBindingInflateInternal;
        }
        throw null;
    }

    public static ActivityScanIdConfirmBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 119;
        ShareDataUIState = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ActivityScanIdConfirmBinding activityScanIdConfirmBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = ShareDataUIState + 101;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            return activityScanIdConfirmBindingInflate;
        }
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivityScanIdConfirmBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 77;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityScanIdConfirmBinding activityScanIdConfirmBinding = (ActivityScanIdConfirmBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_scan_id_confirm, null, false, obj);
        int i4 = component1 + 107;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return activityScanIdConfirmBinding;
    }

    public static ActivityScanIdConfirmBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 123;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivityScanIdConfirmBinding activityScanIdConfirmBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        if (i3 == 0) {
            int i4 = 10 / 0;
        }
        return activityScanIdConfirmBindingBind;
    }

    @Deprecated
    public static ActivityScanIdConfirmBinding bind(View view, Object obj) {
        ActivityScanIdConfirmBinding activityScanIdConfirmBinding;
        int i = 2 % 2;
        int i2 = component1 + 67;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            activityScanIdConfirmBinding = (ActivityScanIdConfirmBinding) bind(obj, view, R.layout.activity_scan_id_confirm);
            int i3 = 64 / 0;
        } else {
            activityScanIdConfirmBinding = (ActivityScanIdConfirmBinding) bind(obj, view, R.layout.activity_scan_id_confirm);
        }
        int i4 = ShareDataUIState + 95;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return activityScanIdConfirmBinding;
    }
}
