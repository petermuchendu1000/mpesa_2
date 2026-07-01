package com.huawei.digitalpayment.consumer.login.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.login.R;

public abstract class ActivityTermsAndConditionBinding extends ViewDataBinding {
    private static int component3 = 0;
    private static int copydefault = 1;
    public final LoadingButton btnConfirm;
    public final RoundImageView ivBack;
    public final ImageView ivTerms;
    public final TextView tvTermsTips;
    public final TextView tvTitle;

    protected ActivityTermsAndConditionBinding(Object obj, View view, int i, LoadingButton loadingButton, RoundImageView roundImageView, ImageView imageView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.btnConfirm = loadingButton;
        this.ivBack = roundImageView;
        this.ivTerms = imageView;
        this.tvTermsTips = textView;
        this.tvTitle = textView2;
    }

    public static ActivityTermsAndConditionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 45;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityTermsAndConditionBinding activityTermsAndConditionBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 95;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return activityTermsAndConditionBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static ActivityTermsAndConditionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 61;
        copydefault = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        ActivityTermsAndConditionBinding activityTermsAndConditionBinding = (ActivityTermsAndConditionBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_terms_and_condition, viewGroup, z, obj);
        int i3 = component3 + 111;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            return activityTermsAndConditionBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static ActivityTermsAndConditionBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 63;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityTermsAndConditionBinding activityTermsAndConditionBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 13;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activityTermsAndConditionBindingInflate;
    }

    @Deprecated
    public static ActivityTermsAndConditionBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 15;
        component3 = i2 % 128;
        ActivityTermsAndConditionBinding activityTermsAndConditionBinding = (ActivityTermsAndConditionBinding) (i2 % 2 != 0 ? ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_terms_and_condition, null, true, obj) : ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_terms_and_condition, null, false, obj));
        int i3 = component3 + 105;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 80 / 0;
        }
        return activityTermsAndConditionBinding;
    }

    public static ActivityTermsAndConditionBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 87;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityTermsAndConditionBinding activityTermsAndConditionBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 75;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activityTermsAndConditionBindingBind;
    }

    @Deprecated
    public static ActivityTermsAndConditionBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 95;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityTermsAndConditionBinding activityTermsAndConditionBinding = (ActivityTermsAndConditionBinding) bind(obj, view, R.layout.activity_terms_and_condition);
        int i4 = copydefault + 115;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return activityTermsAndConditionBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
