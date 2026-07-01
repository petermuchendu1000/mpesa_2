package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ActivitySfcGoMonthlyBinding extends ViewDataBinding {
    private static int component2 = 1;
    private static int component3;
    public final ImageButton ivBack;
    public final ImageView ivGoMonthly;
    public final ConstraintLayout root;
    public final RecyclerView rvGoMonthly;
    public final TextView tvBundleTitle;
    public final TextView tvTitle;

    protected ActivitySfcGoMonthlyBinding(Object obj, View view, int i, ImageButton imageButton, ImageView imageView, ConstraintLayout constraintLayout, RecyclerView recyclerView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.ivBack = imageButton;
        this.ivGoMonthly = imageView;
        this.root = constraintLayout;
        this.rvGoMonthly = recyclerView;
        this.tvBundleTitle = textView;
        this.tvTitle = textView2;
    }

    public static ActivitySfcGoMonthlyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 11;
        component2 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            obj.hashCode();
            throw null;
        }
        ActivitySfcGoMonthlyBinding activitySfcGoMonthlyBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = component2 + 39;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            return activitySfcGoMonthlyBindingInflate;
        }
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivitySfcGoMonthlyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 55;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcGoMonthlyBinding activitySfcGoMonthlyBinding = (ActivitySfcGoMonthlyBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_go_monthly, viewGroup, z, obj);
        int i4 = component3 + 49;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcGoMonthlyBinding;
    }

    public static ActivitySfcGoMonthlyBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 103;
        component2 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            obj.hashCode();
            throw null;
        }
        ActivitySfcGoMonthlyBinding activitySfcGoMonthlyBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = component3 + 17;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            return activitySfcGoMonthlyBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static ActivitySfcGoMonthlyBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 59;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        ActivitySfcGoMonthlyBinding activitySfcGoMonthlyBinding = (ActivitySfcGoMonthlyBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_go_monthly, null, false, obj);
        int i4 = component3 + 123;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return activitySfcGoMonthlyBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static ActivitySfcGoMonthlyBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 91;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ActivitySfcGoMonthlyBinding activitySfcGoMonthlyBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = component2 + 93;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return activitySfcGoMonthlyBindingBind;
    }

    @Deprecated
    public static ActivitySfcGoMonthlyBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 99;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        ActivitySfcGoMonthlyBinding activitySfcGoMonthlyBinding = (ActivitySfcGoMonthlyBinding) bind(obj, view, R.layout.activity_sfc_go_monthly);
        int i3 = component2 + 119;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return activitySfcGoMonthlyBinding;
    }
}
