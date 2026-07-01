package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ActivitySfcEntertainmentCategoryBinding extends ViewDataBinding {
    private static int component2 = 1;
    private static int component3;
    public final RoundImageView ivBack;
    public final ImageView ivBanner;
    public final RecyclerView rvBundles;
    public final RecyclerView rvCategory;
    public final TextView tvTitle;
    public final View viewBg;

    protected ActivitySfcEntertainmentCategoryBinding(Object obj, View view, int i, RoundImageView roundImageView, ImageView imageView, RecyclerView recyclerView, RecyclerView recyclerView2, TextView textView, View view2) {
        super(obj, view, i);
        this.ivBack = roundImageView;
        this.ivBanner = imageView;
        this.rvBundles = recyclerView;
        this.rvCategory = recyclerView2;
        this.tvTitle = textView;
        this.viewBg = view2;
    }

    public static ActivitySfcEntertainmentCategoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 85;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcEntertainmentCategoryBinding activitySfcEntertainmentCategoryBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 121;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return activitySfcEntertainmentCategoryBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static ActivitySfcEntertainmentCategoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 9;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcEntertainmentCategoryBinding activitySfcEntertainmentCategoryBinding = (ActivitySfcEntertainmentCategoryBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_entertainment_category, viewGroup, z, obj);
        int i4 = component2 + 115;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return activitySfcEntertainmentCategoryBinding;
        }
        throw null;
    }

    public static ActivitySfcEntertainmentCategoryBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 15;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcEntertainmentCategoryBinding activitySfcEntertainmentCategoryBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 51;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcEntertainmentCategoryBindingInflate;
    }

    @Deprecated
    public static ActivitySfcEntertainmentCategoryBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 45;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcEntertainmentCategoryBinding activitySfcEntertainmentCategoryBinding = (ActivitySfcEntertainmentCategoryBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_entertainment_category, null, false, obj);
        int i4 = component2 + 51;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcEntertainmentCategoryBinding;
    }

    public static ActivitySfcEntertainmentCategoryBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 27;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcEntertainmentCategoryBinding activitySfcEntertainmentCategoryBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 23;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return activitySfcEntertainmentCategoryBindingBind;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivitySfcEntertainmentCategoryBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 103;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcEntertainmentCategoryBinding activitySfcEntertainmentCategoryBinding = (ActivitySfcEntertainmentCategoryBinding) bind(obj, view, R.layout.activity_sfc_entertainment_category);
        int i4 = component2 + 93;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcEntertainmentCategoryBinding;
    }
}
