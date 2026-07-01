package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ActivitySfcShookBundlesBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int component1;
    public final ImageView ivBack;
    public final RecyclerView rvBundles;
    public final RecyclerView rvCategory;
    public final TextView tvTitle;
    public final View viewBg;

    protected ActivitySfcShookBundlesBinding(Object obj, View view, int i, ImageView imageView, RecyclerView recyclerView, RecyclerView recyclerView2, TextView textView, View view2) {
        super(obj, view, i);
        this.ivBack = imageView;
        this.rvBundles = recyclerView;
        this.rvCategory = recyclerView2;
        this.tvTitle = textView;
        this.viewBg = view2;
    }

    public static ActivitySfcShookBundlesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 1;
        ShareDataUIState = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            obj.hashCode();
            throw null;
        }
        ActivitySfcShookBundlesBinding activitySfcShookBundlesBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = ShareDataUIState + 35;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            return activitySfcShookBundlesBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static ActivitySfcShookBundlesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 57;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcShookBundlesBinding activitySfcShookBundlesBinding = (ActivitySfcShookBundlesBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_shook_bundles, viewGroup, z, obj);
        int i4 = component1 + 115;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcShookBundlesBinding;
    }

    public static ActivitySfcShookBundlesBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 19;
        ShareDataUIState = i2 % 128;
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
    public static ActivitySfcShookBundlesBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 115;
        ShareDataUIState = i2 % 128;
        Object obj2 = null;
        ActivitySfcShookBundlesBinding activitySfcShookBundlesBinding = (ActivitySfcShookBundlesBinding) ViewDataBinding.inflateInternal(layoutInflater, i2 % 2 == 0 ? R.layout.activity_sfc_shook_bundles : R.layout.activity_sfc_shook_bundles, null, false, obj);
        int i3 = component1 + 119;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            return activitySfcShookBundlesBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static ActivitySfcShookBundlesBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 47;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ActivitySfcShookBundlesBinding activitySfcShookBundlesBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = component1 + 67;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return activitySfcShookBundlesBindingBind;
    }

    @Deprecated
    public static ActivitySfcShookBundlesBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 11;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcShookBundlesBinding activitySfcShookBundlesBinding = (ActivitySfcShookBundlesBinding) bind(obj, view, R.layout.activity_sfc_shook_bundles);
        int i4 = component1 + 111;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcShookBundlesBinding;
    }
}
