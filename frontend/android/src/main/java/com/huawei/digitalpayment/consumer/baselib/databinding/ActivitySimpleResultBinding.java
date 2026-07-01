package com.huawei.digitalpayment.consumer.baselib.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.digitalpayment.consumer.baselib.R;

public abstract class ActivitySimpleResultBinding extends ViewDataBinding {
    private static int component2 = 1;
    private static int copydefault;
    public final LoadingButton btnNext;
    public final ImageView ivSuccess;
    public final TextView tvDescription;
    public final TextView tvTitle;

    protected ActivitySimpleResultBinding(Object obj, View view, int i, LoadingButton loadingButton, ImageView imageView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.btnNext = loadingButton;
        this.ivSuccess = imageView;
        this.tvDescription = textView;
        this.tvTitle = textView2;
    }

    public static ActivitySimpleResultBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        ActivitySimpleResultBinding activitySimpleResultBindingInflate;
        int i = 2 % 2;
        int i2 = component2 + 29;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            activitySimpleResultBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            int i3 = 0 / 0;
        } else {
            activitySimpleResultBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        }
        int i4 = component2 + 19;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activitySimpleResultBindingInflate;
    }

    @Deprecated
    public static ActivitySimpleResultBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 95;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingInflateInternal = ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_simple_result, viewGroup, z, obj);
        if (i3 != 0) {
            return (ActivitySimpleResultBinding) viewDataBindingInflateInternal;
        }
        throw null;
    }

    public static ActivitySimpleResultBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 7;
        copydefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            obj.hashCode();
            throw null;
        }
        ActivitySimpleResultBinding activitySimpleResultBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = component2 + 113;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            return activitySimpleResultBindingInflate;
        }
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivitySimpleResultBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 101;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        ActivitySimpleResultBinding activitySimpleResultBinding = (ActivitySimpleResultBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_simple_result, null, false, obj);
        int i4 = copydefault + 73;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return activitySimpleResultBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static ActivitySimpleResultBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 49;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ActivitySimpleResultBinding activitySimpleResultBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = component2 + 15;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return activitySimpleResultBindingBind;
    }

    @Deprecated
    public static ActivitySimpleResultBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 81;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySimpleResultBinding activitySimpleResultBinding = (ActivitySimpleResultBinding) bind(obj, view, R.layout.activity_simple_result);
        int i4 = component2 + 107;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activitySimpleResultBinding;
    }
}
