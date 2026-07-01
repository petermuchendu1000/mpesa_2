package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ActivitySfcOfferBundlesBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    public final ComposeView cvFreshFriday;
    public final RoundImageView ivBack;
    public final RecyclerView rvBundles;
    public final RecyclerView rvOfferCategories;
    public final TextView tvRvFreshFriday;
    public final TextView tvRvTitle;
    public final TextView tvTitle;

    protected ActivitySfcOfferBundlesBinding(Object obj, View view, int i, ComposeView composeView, RoundImageView roundImageView, RecyclerView recyclerView, RecyclerView recyclerView2, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.cvFreshFriday = composeView;
        this.ivBack = roundImageView;
        this.rvBundles = recyclerView;
        this.rvOfferCategories = recyclerView2;
        this.tvRvFreshFriday = textView;
        this.tvRvTitle = textView2;
        this.tvTitle = textView3;
    }

    public static ActivitySfcOfferBundlesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 125;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcOfferBundlesBinding activitySfcOfferBundlesBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 47;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 47 / 0;
        }
        return activitySfcOfferBundlesBindingInflate;
    }

    @Deprecated
    public static ActivitySfcOfferBundlesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 11;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcOfferBundlesBinding activitySfcOfferBundlesBinding = (ActivitySfcOfferBundlesBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_offer_bundles, viewGroup, z, obj);
        int i4 = component2 + 31;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcOfferBundlesBinding;
    }

    public static ActivitySfcOfferBundlesBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 29;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return inflate(layoutInflater, defaultComponent);
        }
        inflate(layoutInflater, defaultComponent);
        throw null;
    }

    @Deprecated
    public static ActivitySfcOfferBundlesBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 35;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            i = R.layout.activity_sfc_offer_bundles;
            z = true;
        } else {
            i = R.layout.activity_sfc_offer_bundles;
            z = false;
        }
        return (ActivitySfcOfferBundlesBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
    }

    public static ActivitySfcOfferBundlesBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 49;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcOfferBundlesBinding activitySfcOfferBundlesBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 75;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcOfferBundlesBindingBind;
    }

    @Deprecated
    public static ActivitySfcOfferBundlesBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 1;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcOfferBundlesBinding activitySfcOfferBundlesBinding = (ActivitySfcOfferBundlesBinding) bind(obj, view, R.layout.activity_sfc_offer_bundles);
        if (i3 != 0) {
            return activitySfcOfferBundlesBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
