package com.huawei.digitalpayment.consumer.qrcode.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.digitalpayment.consumer.baselib.databinding.BaseToolbarLayoutBinding;
import com.huawei.digitalpayment.consumer.qrcode.R;

public abstract class ActivityScanAndPayBinding extends ViewDataBinding {
    private static int component1 = 0;
    private static int component3 = 1;
    public final RoundLinearLayout llBottom;
    public final LinearLayout llManual;
    public final LinearLayout llScan;
    public final FragmentContainerView scanFragment;
    public final BaseToolbarLayoutBinding toolbar;

    protected ActivityScanAndPayBinding(Object obj, View view, int i, RoundLinearLayout roundLinearLayout, LinearLayout linearLayout, LinearLayout linearLayout2, FragmentContainerView fragmentContainerView, BaseToolbarLayoutBinding baseToolbarLayoutBinding) {
        super(obj, view, i);
        this.llBottom = roundLinearLayout;
        this.llManual = linearLayout;
        this.llScan = linearLayout2;
        this.scanFragment = fragmentContainerView;
        this.toolbar = baseToolbarLayoutBinding;
    }

    public static ActivityScanAndPayBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 47;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        }
        int i3 = 2 / 0;
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityScanAndPayBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        ActivityScanAndPayBinding activityScanAndPayBinding;
        int i = 2 % 2;
        int i2 = component1 + 99;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            activityScanAndPayBinding = (ActivityScanAndPayBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_scan_and_pay, viewGroup, z, obj);
            int i3 = 66 / 0;
        } else {
            activityScanAndPayBinding = (ActivityScanAndPayBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_scan_and_pay, viewGroup, z, obj);
        }
        int i4 = component3 + 93;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return activityScanAndPayBinding;
    }

    public static ActivityScanAndPayBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 35;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityScanAndPayBinding activityScanAndPayBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 27;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activityScanAndPayBindingInflate;
    }

    @Deprecated
    public static ActivityScanAndPayBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 11;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityScanAndPayBinding activityScanAndPayBinding = (ActivityScanAndPayBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_scan_and_pay, null, false, obj);
        int i4 = component3 + 43;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return activityScanAndPayBinding;
    }

    public static ActivityScanAndPayBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 101;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ActivityScanAndPayBinding activityScanAndPayBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = component3 + 1;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return activityScanAndPayBindingBind;
    }

    @Deprecated
    public static ActivityScanAndPayBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 29;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityScanAndPayBinding activityScanAndPayBinding = (ActivityScanAndPayBinding) bind(obj, view, R.layout.activity_scan_and_pay);
        if (i3 == 0) {
            return activityScanAndPayBinding;
        }
        throw null;
    }
}
