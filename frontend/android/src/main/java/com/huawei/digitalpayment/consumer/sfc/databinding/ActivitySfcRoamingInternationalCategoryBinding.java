package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ActivitySfcRoamingInternationalCategoryBinding extends ViewDataBinding {
    private static int component3 = 1;
    private static int copydefault;
    public final RoundImageView ivBack;
    public final ImageView ivBundle;
    public final LinearLayout llContainer;
    public final RoundConstraintLayout rlBundleContainer;
    public final RecyclerView rvBundles;
    public final RecyclerView rvCategory;
    public final TextView tvBundleDes;
    public final TextView tvBundleTitle;
    public final TextView tvTitle;
    public final View viewBg;

    protected ActivitySfcRoamingInternationalCategoryBinding(Object obj, View view, int i, RoundImageView roundImageView, ImageView imageView, LinearLayout linearLayout, RoundConstraintLayout roundConstraintLayout, RecyclerView recyclerView, RecyclerView recyclerView2, TextView textView, TextView textView2, TextView textView3, View view2) {
        super(obj, view, i);
        this.ivBack = roundImageView;
        this.ivBundle = imageView;
        this.llContainer = linearLayout;
        this.rlBundleContainer = roundConstraintLayout;
        this.rvBundles = recyclerView;
        this.rvCategory = recyclerView2;
        this.tvBundleDes = textView;
        this.tvBundleTitle = textView2;
        this.tvTitle = textView3;
        this.viewBg = view2;
    }

    public static ActivitySfcRoamingInternationalCategoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 123;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcRoamingInternationalCategoryBinding activitySfcRoamingInternationalCategoryBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 61;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return activitySfcRoamingInternationalCategoryBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static ActivitySfcRoamingInternationalCategoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 17;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcRoamingInternationalCategoryBinding activitySfcRoamingInternationalCategoryBinding = (ActivitySfcRoamingInternationalCategoryBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_roaming_international_category, viewGroup, z, obj);
        int i4 = component3 + 111;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcRoamingInternationalCategoryBinding;
    }

    public static ActivitySfcRoamingInternationalCategoryBinding inflate(LayoutInflater layoutInflater) {
        ActivitySfcRoamingInternationalCategoryBinding activitySfcRoamingInternationalCategoryBindingInflate;
        int i = 2 % 2;
        int i2 = component3 + 97;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            activitySfcRoamingInternationalCategoryBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            int i3 = 17 / 0;
        } else {
            activitySfcRoamingInternationalCategoryBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        }
        int i4 = component3 + 13;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return activitySfcRoamingInternationalCategoryBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static ActivitySfcRoamingInternationalCategoryBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 63;
        copydefault = i2 % 128;
        ActivitySfcRoamingInternationalCategoryBinding activitySfcRoamingInternationalCategoryBinding = (ActivitySfcRoamingInternationalCategoryBinding) ViewDataBinding.inflateInternal(layoutInflater, i2 % 2 != 0 ? R.layout.activity_sfc_roaming_international_category : R.layout.activity_sfc_roaming_international_category, null, false, obj);
        int i3 = copydefault + 83;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            return activitySfcRoamingInternationalCategoryBinding;
        }
        throw null;
    }

    public static ActivitySfcRoamingInternationalCategoryBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 111;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcRoamingInternationalCategoryBinding activitySfcRoamingInternationalCategoryBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 19;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcRoamingInternationalCategoryBindingBind;
    }

    @Deprecated
    public static ActivitySfcRoamingInternationalCategoryBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 11;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingBind = bind(obj, view, R.layout.activity_sfc_roaming_international_category);
        if (i3 == 0) {
            return (ActivitySfcRoamingInternationalCategoryBinding) viewDataBindingBind;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
