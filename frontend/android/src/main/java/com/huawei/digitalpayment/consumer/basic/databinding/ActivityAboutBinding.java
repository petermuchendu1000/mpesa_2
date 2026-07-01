package com.huawei.digitalpayment.consumer.basic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.digitalpayment.consumer.basic.R;

public abstract class ActivityAboutBinding extends ViewDataBinding {
    private static int component2 = 0;
    private static int component3 = 1;
    public final LoadingButton btnCheckUpdate;
    public final LoadingButton btnTeamOfService;
    public final ImageView ivLogo;
    public final TextView tvDesc;
    public final TextView tvReservedVersion;
    public final TextView tvVersion;
    public final TextView tvVersionDesc;

    protected ActivityAboutBinding(Object obj, View view, int i, LoadingButton loadingButton, LoadingButton loadingButton2, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.btnCheckUpdate = loadingButton;
        this.btnTeamOfService = loadingButton2;
        this.ivLogo = imageView;
        this.tvDesc = textView;
        this.tvReservedVersion = textView2;
        this.tvVersion = textView3;
        this.tvVersionDesc = textView4;
    }

    public static ActivityAboutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 41;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ActivityAboutBinding activityAboutBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = component3 + 79;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return activityAboutBindingInflate;
    }

    @Deprecated
    public static ActivityAboutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 91;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityAboutBinding activityAboutBinding = (ActivityAboutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_about, viewGroup, z, obj);
        int i4 = component3 + 93;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return activityAboutBinding;
    }

    public static ActivityAboutBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 83;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityAboutBinding activityAboutBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        if (i3 == 0) {
            int i4 = 16 / 0;
        }
        return activityAboutBindingInflate;
    }

    @Deprecated
    public static ActivityAboutBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 79;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityAboutBinding activityAboutBinding = (ActivityAboutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_about, null, false, obj);
        int i4 = component3 + 49;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return activityAboutBinding;
    }

    public static ActivityAboutBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 91;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityAboutBinding activityAboutBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 51;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 12 / 0;
        }
        return activityAboutBindingBind;
    }

    @Deprecated
    public static ActivityAboutBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 107;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityAboutBinding activityAboutBinding = (ActivityAboutBinding) bind(obj, view, R.layout.activity_about);
        if (i3 == 0) {
            return activityAboutBinding;
        }
        throw null;
    }
}
