package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class ActivitySfcSearchBinding extends ViewDataBinding {
    private static int component2 = 0;
    private static int copydefault = 1;
    public final ConstraintLayout clEmptyView;
    public final CommonInputView inputSearch;
    public final ImageView ivEmptyView;
    public final RecyclerView lifeRecycler;
    public final RecyclerView rvCategory;
    public final TextView tvNoResultTips;
    public final TextView tvNoResultTitle;

    protected ActivitySfcSearchBinding(Object obj, View view, int i, ConstraintLayout constraintLayout, CommonInputView commonInputView, ImageView imageView, RecyclerView recyclerView, RecyclerView recyclerView2, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.clEmptyView = constraintLayout;
        this.inputSearch = commonInputView;
        this.ivEmptyView = imageView;
        this.lifeRecycler = recyclerView;
        this.rvCategory = recyclerView2;
        this.tvNoResultTips = textView;
        this.tvNoResultTitle = textView2;
    }

    public static ActivitySfcSearchBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 109;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ActivitySfcSearchBinding activitySfcSearchBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = copydefault + 91;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return activitySfcSearchBindingInflate;
    }

    @Deprecated
    public static ActivitySfcSearchBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 69;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcSearchBinding activitySfcSearchBinding = (ActivitySfcSearchBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_search, viewGroup, z, obj);
        int i4 = component2 + 101;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 52 / 0;
        }
        return activitySfcSearchBinding;
    }

    public static ActivitySfcSearchBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 65;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcSearchBinding activitySfcSearchBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 3;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcSearchBindingInflate;
    }

    @Deprecated
    public static ActivitySfcSearchBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 121;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return (ActivitySfcSearchBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_search, null, false, obj);
    }

    public static ActivitySfcSearchBinding bind(View view) {
        ActivitySfcSearchBinding activitySfcSearchBindingBind;
        int i = 2 % 2;
        int i2 = component2 + 81;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            activitySfcSearchBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
            int i3 = 16 / 0;
        } else {
            activitySfcSearchBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        }
        int i4 = component2 + 89;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return activitySfcSearchBindingBind;
        }
        throw null;
    }

    @Deprecated
    public static ActivitySfcSearchBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 125;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcSearchBinding activitySfcSearchBinding = (ActivitySfcSearchBinding) bind(obj, view, R.layout.activity_sfc_search);
        int i4 = component2 + 43;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcSearchBinding;
    }
}
