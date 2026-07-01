package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ActivitySfcExpiryConfirmByAirtimeBinding extends ViewDataBinding {
    private static int component2 = 1;
    private static int component3;
    public final LoadingButton btnConfirm;
    public final ImageView imageView2;
    public final RoundImageView ivAvatar;
    public final RoundImageView ivBack;
    public final View ivGuideline;
    public final CardView rlContainer;
    public final RecyclerView rvConfirm;
    public final TextView tvPayTitle;
    public final TextView tvTitle;
    public final View viewDivider;

    protected ActivitySfcExpiryConfirmByAirtimeBinding(Object obj, View view, int i, LoadingButton loadingButton, ImageView imageView, RoundImageView roundImageView, RoundImageView roundImageView2, View view2, CardView cardView, RecyclerView recyclerView, TextView textView, TextView textView2, View view3) {
        super(obj, view, i);
        this.btnConfirm = loadingButton;
        this.imageView2 = imageView;
        this.ivAvatar = roundImageView;
        this.ivBack = roundImageView2;
        this.ivGuideline = view2;
        this.rlContainer = cardView;
        this.rvConfirm = recyclerView;
        this.tvPayTitle = textView;
        this.tvTitle = textView2;
        this.viewDivider = view3;
    }

    public static ActivitySfcExpiryConfirmByAirtimeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 107;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcExpiryConfirmByAirtimeBinding activitySfcExpiryConfirmByAirtimeBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 49;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcExpiryConfirmByAirtimeBindingInflate;
    }

    @Deprecated
    public static ActivitySfcExpiryConfirmByAirtimeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 11;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcExpiryConfirmByAirtimeBinding activitySfcExpiryConfirmByAirtimeBinding = (ActivitySfcExpiryConfirmByAirtimeBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_expiry_confirm_by_airtime, viewGroup, z, obj);
        int i4 = component2 + 27;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcExpiryConfirmByAirtimeBinding;
    }

    public static ActivitySfcExpiryConfirmByAirtimeBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 73;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcExpiryConfirmByAirtimeBinding activitySfcExpiryConfirmByAirtimeBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 49;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcExpiryConfirmByAirtimeBindingInflate;
    }

    @Deprecated
    public static ActivitySfcExpiryConfirmByAirtimeBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 1;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcExpiryConfirmByAirtimeBinding activitySfcExpiryConfirmByAirtimeBinding = (ActivitySfcExpiryConfirmByAirtimeBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_expiry_confirm_by_airtime, null, false, obj);
        int i4 = component2 + 59;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 99 / 0;
        }
        return activitySfcExpiryConfirmByAirtimeBinding;
    }

    public static ActivitySfcExpiryConfirmByAirtimeBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 9;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcExpiryConfirmByAirtimeBinding activitySfcExpiryConfirmByAirtimeBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 95;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return activitySfcExpiryConfirmByAirtimeBindingBind;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivitySfcExpiryConfirmByAirtimeBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 51;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcExpiryConfirmByAirtimeBinding activitySfcExpiryConfirmByAirtimeBinding = (ActivitySfcExpiryConfirmByAirtimeBinding) bind(obj, view, R.layout.activity_sfc_expiry_confirm_by_airtime);
        int i4 = component2 + 11;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcExpiryConfirmByAirtimeBinding;
    }
}
