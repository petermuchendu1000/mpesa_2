package com.huawei.digitalpayment.consumer.profileui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.LoadingButton;
import com.huawei.digitalpayment.consumer.profileui.R;

public abstract class ActivityProfileMgtConfirmBinding extends ViewDataBinding {
    private static int component1 = 0;
    private static int component2 = 1;
    public final ImageView imHead;
    public final LoadingButton lbConfirm;
    public final RecyclerView recycleview;
    public final TextView tvAgreement;
    public final TextView tvNickname;
    public final TextView tvNo;

    protected ActivityProfileMgtConfirmBinding(Object obj, View view, int i, ImageView imageView, LoadingButton loadingButton, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.imHead = imageView;
        this.lbConfirm = loadingButton;
        this.recycleview = recyclerView;
        this.tvAgreement = textView;
        this.tvNickname = textView2;
        this.tvNo = textView3;
    }

    public static ActivityProfileMgtConfirmBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 79;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityProfileMgtConfirmBinding activityProfileMgtConfirmBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        if (i3 != 0) {
            int i4 = 56 / 0;
        }
        return activityProfileMgtConfirmBindingInflate;
    }

    @Deprecated
    public static ActivityProfileMgtConfirmBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 77;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityProfileMgtConfirmBinding activityProfileMgtConfirmBinding = (ActivityProfileMgtConfirmBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_profile_mgt_confirm, viewGroup, z, obj);
        int i4 = component2 + 35;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return activityProfileMgtConfirmBinding;
    }

    public static ActivityProfileMgtConfirmBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 67;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityProfileMgtConfirmBinding activityProfileMgtConfirmBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 5;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return activityProfileMgtConfirmBindingInflate;
    }

    @Deprecated
    public static ActivityProfileMgtConfirmBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 95;
        component1 = i2 % 128;
        return (ActivityProfileMgtConfirmBinding) ViewDataBinding.inflateInternal(layoutInflater, i2 % 2 != 0 ? R.layout.activity_profile_mgt_confirm : R.layout.activity_profile_mgt_confirm, null, false, obj);
    }

    public static ActivityProfileMgtConfirmBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 113;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityProfileMgtConfirmBinding activityProfileMgtConfirmBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 117;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return activityProfileMgtConfirmBindingBind;
    }

    @Deprecated
    public static ActivityProfileMgtConfirmBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 31;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityProfileMgtConfirmBinding activityProfileMgtConfirmBinding = (ActivityProfileMgtConfirmBinding) bind(obj, view, R.layout.activity_profile_mgt_confirm);
        int i4 = component2 + 71;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return activityProfileMgtConfirmBinding;
    }
}
