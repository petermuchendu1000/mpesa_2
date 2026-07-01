package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ActivitySfcWithExpiryCategoryBinding extends ViewDataBinding {
    private static int component2 = 1;
    private static int component3;
    public final RoundImageView ivBack;
    public final RecyclerView rvBundles;
    public final RecyclerView rvCategory;
    public final TextView tvTitle;

    protected ActivitySfcWithExpiryCategoryBinding(Object obj, View view, int i, RoundImageView roundImageView, RecyclerView recyclerView, RecyclerView recyclerView2, TextView textView) {
        super(obj, view, i);
        this.ivBack = roundImageView;
        this.rvBundles = recyclerView;
        this.rvCategory = recyclerView2;
        this.tvTitle = textView;
    }

    public static ActivitySfcWithExpiryCategoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 9;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return inflate(layoutInflater, viewGroup, z, defaultComponent);
        }
        inflate(layoutInflater, viewGroup, z, defaultComponent);
        throw null;
    }

    @Deprecated
    public static ActivitySfcWithExpiryCategoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 109;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcWithExpiryCategoryBinding activitySfcWithExpiryCategoryBinding = (ActivitySfcWithExpiryCategoryBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_with_expiry_category, viewGroup, z, obj);
        int i4 = component2 + 7;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcWithExpiryCategoryBinding;
    }

    public static ActivitySfcWithExpiryCategoryBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 73;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcWithExpiryCategoryBinding activitySfcWithExpiryCategoryBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 3;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcWithExpiryCategoryBindingInflate;
    }

    @Deprecated
    public static ActivitySfcWithExpiryCategoryBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = component2 + 121;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            i = R.layout.activity_sfc_with_expiry_category;
            z = true;
        } else {
            i = R.layout.activity_sfc_with_expiry_category;
            z = false;
        }
        ActivitySfcWithExpiryCategoryBinding activitySfcWithExpiryCategoryBinding = (ActivitySfcWithExpiryCategoryBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
        int i4 = component2 + 29;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcWithExpiryCategoryBinding;
    }

    public static ActivitySfcWithExpiryCategoryBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 1;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcWithExpiryCategoryBinding activitySfcWithExpiryCategoryBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        if (i3 != 0) {
            int i4 = 45 / 0;
        }
        return activitySfcWithExpiryCategoryBindingBind;
    }

    @Deprecated
    public static ActivitySfcWithExpiryCategoryBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 9;
        component2 = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        ActivitySfcWithExpiryCategoryBinding activitySfcWithExpiryCategoryBinding = (ActivitySfcWithExpiryCategoryBinding) bind(obj, view, R.layout.activity_sfc_with_expiry_category);
        int i3 = component2 + 7;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            return activitySfcWithExpiryCategoryBinding;
        }
        obj2.hashCode();
        throw null;
    }
}
