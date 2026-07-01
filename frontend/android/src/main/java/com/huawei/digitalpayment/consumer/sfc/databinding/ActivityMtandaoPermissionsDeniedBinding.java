package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ActivityMtandaoPermissionsDeniedBinding extends ViewDataBinding {
    private static int component1 = 1;
    private static int component3;
    public final Button btnDone;
    public final ImageView imageView3;
    public final RoundImageView ivDelete;
    public final CardView rlContainer;
    public final RoundConstraintLayout rlContainerInside;
    public final ConstraintLayout tvAvatar;
    public final TextView tvTips;
    public final TextView tvTitle;

    protected ActivityMtandaoPermissionsDeniedBinding(Object obj, View view, int i, Button button, ImageView imageView, RoundImageView roundImageView, CardView cardView, RoundConstraintLayout roundConstraintLayout, ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.btnDone = button;
        this.imageView3 = imageView;
        this.ivDelete = roundImageView;
        this.rlContainer = cardView;
        this.rlContainerInside = roundConstraintLayout;
        this.tvAvatar = constraintLayout;
        this.tvTips = textView;
        this.tvTitle = textView2;
    }

    public static ActivityMtandaoPermissionsDeniedBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 75;
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
    public static ActivityMtandaoPermissionsDeniedBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 9;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityMtandaoPermissionsDeniedBinding activityMtandaoPermissionsDeniedBinding = (ActivityMtandaoPermissionsDeniedBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_mtandao_permissions_denied, viewGroup, z, obj);
        int i4 = component3 + 111;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 0 / 0;
        }
        return activityMtandaoPermissionsDeniedBinding;
    }

    public static ActivityMtandaoPermissionsDeniedBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 77;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityMtandaoPermissionsDeniedBinding activityMtandaoPermissionsDeniedBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 111;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 46 / 0;
        }
        return activityMtandaoPermissionsDeniedBindingInflate;
    }

    @Deprecated
    public static ActivityMtandaoPermissionsDeniedBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 111;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityMtandaoPermissionsDeniedBinding activityMtandaoPermissionsDeniedBinding = (ActivityMtandaoPermissionsDeniedBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_mtandao_permissions_denied, null, false, obj);
        int i4 = component1 + 39;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activityMtandaoPermissionsDeniedBinding;
    }

    public static ActivityMtandaoPermissionsDeniedBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 33;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityMtandaoPermissionsDeniedBinding activityMtandaoPermissionsDeniedBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 55;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 30 / 0;
        }
        return activityMtandaoPermissionsDeniedBindingBind;
    }

    @Deprecated
    public static ActivityMtandaoPermissionsDeniedBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 105;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityMtandaoPermissionsDeniedBinding activityMtandaoPermissionsDeniedBinding = (ActivityMtandaoPermissionsDeniedBinding) bind(obj, view, R.layout.activity_mtandao_permissions_denied);
        int i4 = component1 + 25;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return activityMtandaoPermissionsDeniedBinding;
        }
        throw null;
    }
}
