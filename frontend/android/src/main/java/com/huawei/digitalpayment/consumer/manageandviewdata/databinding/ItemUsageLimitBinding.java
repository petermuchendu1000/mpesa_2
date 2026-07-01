package com.huawei.digitalpayment.consumer.manageandviewdata.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.manageandviewdata.R;
import com.huawei.digitalpayment.consumer.manageandviewdata.resp.Limit;

public abstract class ItemUsageLimitBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    public final RoundTextView actionDeleteLimit;
    public final LoadingButton actionSetLimit;
    public final LoadingButton actionUpdateLimit;
    public final TextView currentUsage;
    public final ConstraintLayout headerLayout;
    public final ConstraintLayout limitNotSet;
    public final LinearProgressIndicator limitProgress;
    public final ConstraintLayout limitSet;

    @Bindable
    protected Limit mLimit;
    public final TextView setLimit;
    public final TextView textView23;
    public final TextView textView24;
    public final ImageView toggleIcon;
    public final TextView txTitle;
    public final ConstraintLayout usage;
    public final ConstraintLayout usageLayout;

    public abstract void setLimit(Limit limit);

    protected ItemUsageLimitBinding(Object obj, View view, int i, RoundTextView roundTextView, LoadingButton loadingButton, LoadingButton loadingButton2, TextView textView, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, LinearProgressIndicator linearProgressIndicator, ConstraintLayout constraintLayout3, TextView textView2, TextView textView3, TextView textView4, ImageView imageView, TextView textView5, ConstraintLayout constraintLayout4, ConstraintLayout constraintLayout5) {
        super(obj, view, i);
        this.actionDeleteLimit = roundTextView;
        this.actionSetLimit = loadingButton;
        this.actionUpdateLimit = loadingButton2;
        this.currentUsage = textView;
        this.headerLayout = constraintLayout;
        this.limitNotSet = constraintLayout2;
        this.limitProgress = linearProgressIndicator;
        this.limitSet = constraintLayout3;
        this.setLimit = textView2;
        this.textView23 = textView3;
        this.textView24 = textView4;
        this.toggleIcon = imageView;
        this.txTitle = textView5;
        this.usage = constraintLayout4;
        this.usageLayout = constraintLayout5;
    }

    public Limit getLimit() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 83;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Limit limit = this.mLimit;
        int i5 = i2 + 17;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 25 / 0;
        }
        return limit;
    }

    public static ItemUsageLimitBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 39;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ItemUsageLimitBinding itemUsageLimitBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 123;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return itemUsageLimitBindingInflate;
    }

    @Deprecated
    public static ItemUsageLimitBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 53;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemUsageLimitBinding itemUsageLimitBinding = (ItemUsageLimitBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_usage_limit, viewGroup, z, obj);
        int i4 = component3 + 67;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return itemUsageLimitBinding;
    }

    public static ItemUsageLimitBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 71;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ItemUsageLimitBinding itemUsageLimitBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 27;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return itemUsageLimitBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static ItemUsageLimitBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 11;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ItemUsageLimitBinding itemUsageLimitBinding = (ItemUsageLimitBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_usage_limit, null, false, obj);
        int i4 = ShareDataUIState + 1;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return itemUsageLimitBinding;
    }

    public static ItemUsageLimitBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 51;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemUsageLimitBinding itemUsageLimitBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 113;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return itemUsageLimitBindingBind;
    }

    @Deprecated
    public static ItemUsageLimitBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 81;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemUsageLimitBinding itemUsageLimitBinding = (ItemUsageLimitBinding) bind(obj, view, R.layout.item_usage_limit);
        int i4 = ShareDataUIState + 119;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 48 / 0;
        }
        return itemUsageLimitBinding;
    }
}
