package com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.digitalpayment.consumer.sfcpochiwallet.R;

public abstract class ActivityPochiWalletGuideBinding extends ViewDataBinding {
    private static int component3 = 0;
    private static int copydefault = 1;
    public final LoadingButton btnConfirm;
    public final ImageView ivImage;
    public final TextView tvContentTips;
    public final TextView tvTermsTips;
    public final TextView tvTitle;

    protected ActivityPochiWalletGuideBinding(Object obj, View view, int i, LoadingButton loadingButton, ImageView imageView, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.btnConfirm = loadingButton;
        this.ivImage = imageView;
        this.tvContentTips = textView;
        this.tvTermsTips = textView2;
        this.tvTitle = textView3;
    }

    public static ActivityPochiWalletGuideBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 25;
        copydefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ActivityPochiWalletGuideBinding activityPochiWalletGuideBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = component3 + 71;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            return activityPochiWalletGuideBindingInflate;
        }
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivityPochiWalletGuideBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 11;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityPochiWalletGuideBinding activityPochiWalletGuideBinding = (ActivityPochiWalletGuideBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_pochi_wallet_guide, viewGroup, z, obj);
        int i4 = copydefault + 75;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activityPochiWalletGuideBinding;
    }

    public static ActivityPochiWalletGuideBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 119;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityPochiWalletGuideBinding activityPochiWalletGuideBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 19;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activityPochiWalletGuideBindingInflate;
    }

    @Deprecated
    public static ActivityPochiWalletGuideBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = component3 + 23;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            i = R.layout.activity_pochi_wallet_guide;
            z = true;
        } else {
            i = R.layout.activity_pochi_wallet_guide;
            z = false;
        }
        ActivityPochiWalletGuideBinding activityPochiWalletGuideBinding = (ActivityPochiWalletGuideBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
        int i4 = component3 + 81;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activityPochiWalletGuideBinding;
    }

    public static ActivityPochiWalletGuideBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 99;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityPochiWalletGuideBinding activityPochiWalletGuideBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 19;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activityPochiWalletGuideBindingBind;
    }

    @Deprecated
    public static ActivityPochiWalletGuideBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 33;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingBind = bind(obj, view, R.layout.activity_pochi_wallet_guide);
        if (i3 == 0) {
            return (ActivityPochiWalletGuideBinding) viewDataBindingBind;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
