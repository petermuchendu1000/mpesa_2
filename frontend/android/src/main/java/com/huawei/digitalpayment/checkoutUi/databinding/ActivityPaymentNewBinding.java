package com.huawei.digitalpayment.checkoutUi.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.LoadingButton;
import com.huawei.digitalpayment.checkoutUi.R;

public abstract class ActivityPaymentNewBinding extends ViewDataBinding {
    private static int component2 = 0;
    private static int component3 = 1;
    public final LoadingButton confirm;
    public final ImageView ivClose;
    public final ImageView ivIcon;
    public final RecyclerView rvRecyclerView;
    public final TextView tvAmount;
    public final TextView tvAmountUnit;
    public final TextView tvTitle;
    public final TextView tvVerifyMethod;

    protected ActivityPaymentNewBinding(Object obj, View view, int i, LoadingButton loadingButton, ImageView imageView, ImageView imageView2, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.confirm = loadingButton;
        this.ivClose = imageView;
        this.ivIcon = imageView2;
        this.rvRecyclerView = recyclerView;
        this.tvAmount = textView;
        this.tvAmountUnit = textView2;
        this.tvTitle = textView3;
        this.tvVerifyMethod = textView4;
    }

    public static ActivityPaymentNewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 113;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return inflate(layoutInflater, viewGroup, z, defaultComponent);
        }
        inflate(layoutInflater, viewGroup, z, defaultComponent);
        throw null;
    }

    @Deprecated
    public static ActivityPaymentNewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 43;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingInflateInternal = ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_payment_new, viewGroup, z, obj);
        if (i3 == 0) {
            return (ActivityPaymentNewBinding) viewDataBindingInflateInternal;
        }
        throw null;
    }

    public static ActivityPaymentNewBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 111;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return inflate(layoutInflater, defaultComponent);
        }
        inflate(layoutInflater, defaultComponent);
        throw null;
    }

    @Deprecated
    public static ActivityPaymentNewBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 9;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityPaymentNewBinding activityPaymentNewBinding = (ActivityPaymentNewBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_payment_new, null, false, obj);
        int i4 = component2 + 79;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activityPaymentNewBinding;
    }

    public static ActivityPaymentNewBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 93;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return bind(view, defaultComponent);
        }
        bind(view, defaultComponent);
        throw null;
    }

    @Deprecated
    public static ActivityPaymentNewBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 123;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityPaymentNewBinding activityPaymentNewBinding = (ActivityPaymentNewBinding) bind(obj, view, R.layout.activity_payment_new);
        int i4 = component3 + 83;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 76 / 0;
        }
        return activityPaymentNewBinding;
    }
}
