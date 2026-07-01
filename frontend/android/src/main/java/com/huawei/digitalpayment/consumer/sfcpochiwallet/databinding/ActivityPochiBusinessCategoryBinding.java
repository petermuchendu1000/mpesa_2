package com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.digitalpayment.consumer.sfcpochiwallet.R;

public abstract class ActivityPochiBusinessCategoryBinding extends ViewDataBinding {
    private static int component2 = 0;
    private static int copydefault = 1;
    public final RecyclerView rvBusinessCategory;
    public final TextView tvTitle;

    protected ActivityPochiBusinessCategoryBinding(Object obj, View view, int i, RecyclerView recyclerView, TextView textView) {
        super(obj, view, i);
        this.rvBusinessCategory = recyclerView;
        this.tvTitle = textView;
    }

    public static ActivityPochiBusinessCategoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        ActivityPochiBusinessCategoryBinding activityPochiBusinessCategoryBindingInflate;
        int i = 2 % 2;
        int i2 = component2 + 33;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            activityPochiBusinessCategoryBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            int i3 = 27 / 0;
        } else {
            activityPochiBusinessCategoryBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        }
        int i4 = component2 + 63;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activityPochiBusinessCategoryBindingInflate;
    }

    @Deprecated
    public static ActivityPochiBusinessCategoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 77;
        component2 = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        ActivityPochiBusinessCategoryBinding activityPochiBusinessCategoryBinding = (ActivityPochiBusinessCategoryBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_pochi_business_category, viewGroup, z, obj);
        int i3 = component2 + 11;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            return activityPochiBusinessCategoryBinding;
        }
        throw null;
    }

    public static ActivityPochiBusinessCategoryBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 65;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityPochiBusinessCategoryBinding activityPochiBusinessCategoryBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        if (i3 != 0) {
            int i4 = 41 / 0;
        }
        return activityPochiBusinessCategoryBindingInflate;
    }

    @Deprecated
    public static ActivityPochiBusinessCategoryBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = component2 + 41;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            i = R.layout.activity_pochi_business_category;
            z = true;
        } else {
            i = R.layout.activity_pochi_business_category;
            z = false;
        }
        ActivityPochiBusinessCategoryBinding activityPochiBusinessCategoryBinding = (ActivityPochiBusinessCategoryBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
        int i4 = component2 + 35;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activityPochiBusinessCategoryBinding;
    }

    public static ActivityPochiBusinessCategoryBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 109;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityPochiBusinessCategoryBinding activityPochiBusinessCategoryBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 93;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return activityPochiBusinessCategoryBindingBind;
    }

    @Deprecated
    public static ActivityPochiBusinessCategoryBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 111;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingBind = bind(obj, view, R.layout.activity_pochi_business_category);
        if (i3 != 0) {
            return (ActivityPochiBusinessCategoryBinding) viewDataBindingBind;
        }
        throw null;
    }
}
