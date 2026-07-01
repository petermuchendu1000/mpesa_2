package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ActivitySfcDataOnlyBundlesBinding extends ViewDataBinding {
    private static int component1 = 0;
    private static int copydefault = 1;
    public final RoundImageView ivBack;
    public final RecyclerView rvBundles;
    public final TextView tvRvTitle;
    public final TextView tvTitle;

    protected ActivitySfcDataOnlyBundlesBinding(Object obj, View view, int i, RoundImageView roundImageView, RecyclerView recyclerView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.ivBack = roundImageView;
        this.rvBundles = recyclerView;
        this.tvRvTitle = textView;
        this.tvTitle = textView2;
    }

    public static ActivitySfcDataOnlyBundlesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 35;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcDataOnlyBundlesBinding activitySfcDataOnlyBundlesBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 115;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 8 / 0;
        }
        return activitySfcDataOnlyBundlesBindingInflate;
    }

    @Deprecated
    public static ActivitySfcDataOnlyBundlesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 57;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcDataOnlyBundlesBinding activitySfcDataOnlyBundlesBinding = (ActivitySfcDataOnlyBundlesBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_data_only_bundles, viewGroup, z, obj);
        int i4 = copydefault + 121;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return activitySfcDataOnlyBundlesBinding;
        }
        throw null;
    }

    public static ActivitySfcDataOnlyBundlesBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 1;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcDataOnlyBundlesBinding activitySfcDataOnlyBundlesBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 67;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return activitySfcDataOnlyBundlesBindingInflate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivitySfcDataOnlyBundlesBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 17;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return (ActivitySfcDataOnlyBundlesBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_data_only_bundles, null, false, obj);
    }

    public static ActivitySfcDataOnlyBundlesBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 119;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcDataOnlyBundlesBinding activitySfcDataOnlyBundlesBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 119;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcDataOnlyBundlesBindingBind;
    }

    @Deprecated
    public static ActivitySfcDataOnlyBundlesBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 93;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcDataOnlyBundlesBinding activitySfcDataOnlyBundlesBinding = (ActivitySfcDataOnlyBundlesBinding) bind(obj, view, R.layout.activity_sfc_data_only_bundles);
        int i4 = component1 + 7;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return activitySfcDataOnlyBundlesBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
