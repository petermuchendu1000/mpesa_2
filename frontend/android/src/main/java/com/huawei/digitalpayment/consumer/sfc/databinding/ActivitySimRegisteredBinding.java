package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ActivitySimRegisteredBinding extends ViewDataBinding {
    private static int component1 = 1;
    private static int component3;
    public final LoadingButton btnConfirm;
    public final RoundImageView ivAvatar;
    public final RoundImageView ivDelete;
    public final View ivGuideline;
    public final LinearLayout llBannerContainer;
    public final CardView rlContainer;
    public final RoundConstraintLayout rlSuccessContainer;
    public final RecyclerView rvRegisteredLines;
    public final TextView tvDes;
    public final TextView tvTitle;

    protected ActivitySimRegisteredBinding(Object obj, View view, int i, LoadingButton loadingButton, RoundImageView roundImageView, RoundImageView roundImageView2, View view2, LinearLayout linearLayout, CardView cardView, RoundConstraintLayout roundConstraintLayout, RecyclerView recyclerView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.btnConfirm = loadingButton;
        this.ivAvatar = roundImageView;
        this.ivDelete = roundImageView2;
        this.ivGuideline = view2;
        this.llBannerContainer = linearLayout;
        this.rlContainer = cardView;
        this.rlSuccessContainer = roundConstraintLayout;
        this.rvRegisteredLines = recyclerView;
        this.tvDes = textView;
        this.tvTitle = textView2;
    }

    public static ActivitySimRegisteredBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 67;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySimRegisteredBinding activitySimRegisteredBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 105;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 88 / 0;
        }
        return activitySimRegisteredBindingInflate;
    }

    @Deprecated
    public static ActivitySimRegisteredBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 111;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySimRegisteredBinding activitySimRegisteredBinding = (ActivitySimRegisteredBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sim_registered, viewGroup, z, obj);
        if (i3 != 0) {
            return activitySimRegisteredBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static ActivitySimRegisteredBinding inflate(LayoutInflater layoutInflater) {
        ActivitySimRegisteredBinding activitySimRegisteredBindingInflate;
        int i = 2 % 2;
        int i2 = component1 + 115;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            activitySimRegisteredBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            int i3 = 25 / 0;
        } else {
            activitySimRegisteredBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        }
        int i4 = component1 + 111;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return activitySimRegisteredBindingInflate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivitySimRegisteredBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 31;
        component1 = i2 % 128;
        ActivitySimRegisteredBinding activitySimRegisteredBinding = (ActivitySimRegisteredBinding) ViewDataBinding.inflateInternal(layoutInflater, i2 % 2 == 0 ? R.layout.activity_sim_registered : R.layout.activity_sim_registered, null, false, obj);
        int i3 = component3 + 93;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return activitySimRegisteredBinding;
    }

    public static ActivitySimRegisteredBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 111;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySimRegisteredBinding activitySimRegisteredBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        if (i3 != 0) {
            int i4 = 89 / 0;
        }
        return activitySimRegisteredBindingBind;
    }

    @Deprecated
    public static ActivitySimRegisteredBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 55;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySimRegisteredBinding activitySimRegisteredBinding = (ActivitySimRegisteredBinding) bind(obj, view, R.layout.activity_sim_registered);
        int i4 = component1 + 97;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activitySimRegisteredBinding;
    }
}
