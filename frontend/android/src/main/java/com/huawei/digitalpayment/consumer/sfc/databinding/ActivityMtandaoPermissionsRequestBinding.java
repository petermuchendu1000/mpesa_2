package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.card.MaterialCardView;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ActivityMtandaoPermissionsRequestBinding extends ViewDataBinding {
    private static int component1 = 0;
    private static int copydefault = 1;
    public final RoundTextView btnAllow;
    public final RoundTextView btnDeny;
    public final LinearLayout btnLayout;
    public final MaterialCardView cardLocation;
    public final MaterialCardView cardMain;
    public final MaterialCardView cardNetwork;
    public final ImageView imgNetwork;
    public final TextView tvDescription;
    public final TextView tvHeader;
    public final TextView tvOptOut;
    public final TextView tvPolicy;

    protected ActivityMtandaoPermissionsRequestBinding(Object obj, View view, int i, RoundTextView roundTextView, RoundTextView roundTextView2, LinearLayout linearLayout, MaterialCardView materialCardView, MaterialCardView materialCardView2, MaterialCardView materialCardView3, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.btnAllow = roundTextView;
        this.btnDeny = roundTextView2;
        this.btnLayout = linearLayout;
        this.cardLocation = materialCardView;
        this.cardMain = materialCardView2;
        this.cardNetwork = materialCardView3;
        this.imgNetwork = imageView;
        this.tvDescription = textView;
        this.tvHeader = textView2;
        this.tvOptOut = textView3;
        this.tvPolicy = textView4;
    }

    public static ActivityMtandaoPermissionsRequestBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 71;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityMtandaoPermissionsRequestBinding activityMtandaoPermissionsRequestBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 35;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return activityMtandaoPermissionsRequestBindingInflate;
    }

    @Deprecated
    public static ActivityMtandaoPermissionsRequestBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 117;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityMtandaoPermissionsRequestBinding activityMtandaoPermissionsRequestBinding = (ActivityMtandaoPermissionsRequestBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_mtandao_permissions_request, viewGroup, z, obj);
        int i4 = copydefault + 23;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 36 / 0;
        }
        return activityMtandaoPermissionsRequestBinding;
    }

    public static ActivityMtandaoPermissionsRequestBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 91;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityMtandaoPermissionsRequestBinding activityMtandaoPermissionsRequestBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 43;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activityMtandaoPermissionsRequestBindingInflate;
    }

    @Deprecated
    public static ActivityMtandaoPermissionsRequestBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 121;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityMtandaoPermissionsRequestBinding activityMtandaoPermissionsRequestBinding = (ActivityMtandaoPermissionsRequestBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_mtandao_permissions_request, null, false, obj);
        int i4 = copydefault + 87;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return activityMtandaoPermissionsRequestBinding;
    }

    public static ActivityMtandaoPermissionsRequestBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 11;
        copydefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ActivityMtandaoPermissionsRequestBinding activityMtandaoPermissionsRequestBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = component1 + 39;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            return activityMtandaoPermissionsRequestBindingBind;
        }
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivityMtandaoPermissionsRequestBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 43;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityMtandaoPermissionsRequestBinding activityMtandaoPermissionsRequestBinding = (ActivityMtandaoPermissionsRequestBinding) bind(obj, view, R.layout.activity_mtandao_permissions_request);
        int i4 = component1 + 67;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 98 / 0;
        }
        return activityMtandaoPermissionsRequestBinding;
    }
}
