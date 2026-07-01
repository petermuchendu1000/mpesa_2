package com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfcpochiwallet.R;

public abstract class ActivityFulizaGuideBinding extends ViewDataBinding {
    private static int component2 = 0;
    private static int copydefault = 1;
    public final LoadingButton btnConfirm;
    public final RoundImageView ivBack;
    public final ImageView ivImageGuide;
    public final TextView tvGuideTips;
    public final TextView tvGuideTitle;
    public final TextView tvTermsTips;
    public final TextView tvTitle;

    protected ActivityFulizaGuideBinding(Object obj, View view, int i, LoadingButton loadingButton, RoundImageView roundImageView, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.btnConfirm = loadingButton;
        this.ivBack = roundImageView;
        this.ivImageGuide = imageView;
        this.tvGuideTips = textView;
        this.tvGuideTitle = textView2;
        this.tvTermsTips = textView3;
        this.tvTitle = textView4;
    }

    public static ActivityFulizaGuideBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 75;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ActivityFulizaGuideBinding activityFulizaGuideBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = component2 + 27;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return activityFulizaGuideBindingInflate;
    }

    @Deprecated
    public static ActivityFulizaGuideBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 39;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityFulizaGuideBinding activityFulizaGuideBinding = (ActivityFulizaGuideBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_fuliza_guide, viewGroup, z, obj);
        int i4 = copydefault + 107;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return activityFulizaGuideBinding;
    }

    public static ActivityFulizaGuideBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 23;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityFulizaGuideBinding activityFulizaGuideBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 81;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return activityFulizaGuideBindingInflate;
    }

    @Deprecated
    public static ActivityFulizaGuideBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 81;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityFulizaGuideBinding activityFulizaGuideBinding = (ActivityFulizaGuideBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_fuliza_guide, null, false, obj);
        int i4 = component2 + 1;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return activityFulizaGuideBinding;
        }
        throw null;
    }

    public static ActivityFulizaGuideBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 73;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityFulizaGuideBinding activityFulizaGuideBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 33;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return activityFulizaGuideBindingBind;
        }
        throw null;
    }

    @Deprecated
    public static ActivityFulizaGuideBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 107;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityFulizaGuideBinding activityFulizaGuideBinding = (ActivityFulizaGuideBinding) bind(obj, view, R.layout.activity_fuliza_guide);
        int i4 = component2 + 57;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 92 / 0;
        }
        return activityFulizaGuideBinding;
    }
}
