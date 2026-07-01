package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ActivityMakeUrBundleConfirmBinding extends ViewDataBinding {
    private static int component1 = 1;
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

    protected ActivityMakeUrBundleConfirmBinding(Object obj, View view, int i, LoadingButton loadingButton, ImageView imageView, RoundImageView roundImageView, RoundImageView roundImageView2, View view2, CardView cardView, RecyclerView recyclerView, TextView textView, TextView textView2, View view3) {
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

    public static ActivityMakeUrBundleConfirmBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 25;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return inflate(layoutInflater, viewGroup, z, defaultComponent);
        }
        inflate(layoutInflater, viewGroup, z, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivityMakeUrBundleConfirmBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        ActivityMakeUrBundleConfirmBinding activityMakeUrBundleConfirmBinding;
        int i = 2 % 2;
        int i2 = component1 + 59;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            activityMakeUrBundleConfirmBinding = (ActivityMakeUrBundleConfirmBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_make_ur_bundle_confirm, viewGroup, z, obj);
            int i3 = 80 / 0;
        } else {
            activityMakeUrBundleConfirmBinding = (ActivityMakeUrBundleConfirmBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_make_ur_bundle_confirm, viewGroup, z, obj);
        }
        int i4 = component3 + 29;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return activityMakeUrBundleConfirmBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static ActivityMakeUrBundleConfirmBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 7;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityMakeUrBundleConfirmBinding activityMakeUrBundleConfirmBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 83;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return activityMakeUrBundleConfirmBindingInflate;
    }

    @Deprecated
    public static ActivityMakeUrBundleConfirmBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 93;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityMakeUrBundleConfirmBinding activityMakeUrBundleConfirmBinding = (ActivityMakeUrBundleConfirmBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_make_ur_bundle_confirm, null, false, obj);
        int i4 = component3 + 123;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return activityMakeUrBundleConfirmBinding;
    }

    public static ActivityMakeUrBundleConfirmBinding bind(View view) {
        ActivityMakeUrBundleConfirmBinding activityMakeUrBundleConfirmBindingBind;
        int i = 2 % 2;
        int i2 = component3 + 35;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            activityMakeUrBundleConfirmBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
            int i3 = 98 / 0;
        } else {
            activityMakeUrBundleConfirmBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        }
        int i4 = component3 + 117;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 12 / 0;
        }
        return activityMakeUrBundleConfirmBindingBind;
    }

    @Deprecated
    public static ActivityMakeUrBundleConfirmBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 113;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityMakeUrBundleConfirmBinding activityMakeUrBundleConfirmBinding = (ActivityMakeUrBundleConfirmBinding) bind(obj, view, R.layout.activity_make_ur_bundle_confirm);
        int i4 = component1 + 113;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activityMakeUrBundleConfirmBinding;
    }
}
