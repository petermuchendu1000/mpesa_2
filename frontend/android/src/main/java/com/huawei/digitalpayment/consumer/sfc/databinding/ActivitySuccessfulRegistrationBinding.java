package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ActivitySuccessfulRegistrationBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    public final LoadingButton btnConfirm;
    public final RoundImageView ivAvatar;
    public final RoundImageView ivDelete;
    public final View ivGuideline;
    public final LinearLayout llBannerContainer;
    public final CardView rlContainer;
    public final RoundConstraintLayout rlSuccessContainer;
    public final TextView tvDes;
    public final TextView tvTitle;

    protected ActivitySuccessfulRegistrationBinding(Object obj, View view, int i, LoadingButton loadingButton, RoundImageView roundImageView, RoundImageView roundImageView2, View view2, LinearLayout linearLayout, CardView cardView, RoundConstraintLayout roundConstraintLayout, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.btnConfirm = loadingButton;
        this.ivAvatar = roundImageView;
        this.ivDelete = roundImageView2;
        this.ivGuideline = view2;
        this.llBannerContainer = linearLayout;
        this.rlContainer = cardView;
        this.rlSuccessContainer = roundConstraintLayout;
        this.tvDes = textView;
        this.tvTitle = textView2;
    }

    public static ActivitySuccessfulRegistrationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 9;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySuccessfulRegistrationBinding activitySuccessfulRegistrationBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 3;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return activitySuccessfulRegistrationBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static ActivitySuccessfulRegistrationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 103;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivitySuccessfulRegistrationBinding activitySuccessfulRegistrationBinding = (ActivitySuccessfulRegistrationBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_successful_registration, viewGroup, z, obj);
        int i4 = component3 + 3;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return activitySuccessfulRegistrationBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static ActivitySuccessfulRegistrationBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 119;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivitySuccessfulRegistrationBinding activitySuccessfulRegistrationBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 111;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return activitySuccessfulRegistrationBindingInflate;
    }

    @Deprecated
    public static ActivitySuccessfulRegistrationBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 35;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            i = R.layout.activity_successful_registration;
            z = true;
        } else {
            i = R.layout.activity_successful_registration;
            z = false;
        }
        return (ActivitySuccessfulRegistrationBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
    }

    public static ActivitySuccessfulRegistrationBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 107;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return bind(view, defaultComponent);
        }
        bind(view, defaultComponent);
        throw null;
    }

    @Deprecated
    public static ActivitySuccessfulRegistrationBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 69;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivitySuccessfulRegistrationBinding activitySuccessfulRegistrationBinding = (ActivitySuccessfulRegistrationBinding) bind(obj, view, R.layout.activity_successful_registration);
        if (i3 != 0) {
            int i4 = 13 / 0;
        }
        return activitySuccessfulRegistrationBinding;
    }
}
