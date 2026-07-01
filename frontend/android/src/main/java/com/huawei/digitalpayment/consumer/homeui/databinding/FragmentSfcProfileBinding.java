package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class FragmentSfcProfileBinding extends ViewDataBinding {
    private static int component1 = 0;
    private static int component3 = 1;
    public final CardView cardAbbr;
    public final CardView cardNotification;
    public final CardView cardSearch;
    public final RoundImageView ivAvatar;
    public final ImageView ivNotification;
    public final ImageView ivNotificationBadge;
    public final ImageView ivSearch;
    public final ImageView ivTurnBottom;
    public final ConstraintLayout profileTutorialWrapper;
    public final ConstraintLayout rlRoot;
    public final TextView tvAbbr;
    public final TextView tvName;
    public final TextView tvTime;

    protected FragmentSfcProfileBinding(Object obj, View view, int i, CardView cardView, CardView cardView2, CardView cardView3, RoundImageView roundImageView, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.cardAbbr = cardView;
        this.cardNotification = cardView2;
        this.cardSearch = cardView3;
        this.ivAvatar = roundImageView;
        this.ivNotification = imageView;
        this.ivNotificationBadge = imageView2;
        this.ivSearch = imageView3;
        this.ivTurnBottom = imageView4;
        this.profileTutorialWrapper = constraintLayout;
        this.rlRoot = constraintLayout2;
        this.tvAbbr = textView;
        this.tvName = textView2;
        this.tvTime = textView3;
    }

    public static FragmentSfcProfileBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 89;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcProfileBinding fragmentSfcProfileBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 3;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 94 / 0;
        }
        return fragmentSfcProfileBindingInflate;
    }

    @Deprecated
    public static FragmentSfcProfileBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 63;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcProfileBinding fragmentSfcProfileBinding = (FragmentSfcProfileBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_sfc_profile, viewGroup, z, obj);
        int i4 = component3 + 111;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentSfcProfileBinding;
    }

    public static FragmentSfcProfileBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 5;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcProfileBinding fragmentSfcProfileBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 113;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return fragmentSfcProfileBindingInflate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static FragmentSfcProfileBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        int i2 = 2 % 2;
        boolean z = true;
        int i3 = component1 + 1;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            i = R.layout.fragment_sfc_profile;
        } else {
            i = R.layout.fragment_sfc_profile;
            z = false;
        }
        FragmentSfcProfileBinding fragmentSfcProfileBinding = (FragmentSfcProfileBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
        int i4 = component1 + 71;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentSfcProfileBinding;
    }

    public static FragmentSfcProfileBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 11;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcProfileBinding fragmentSfcProfileBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 37;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return fragmentSfcProfileBindingBind;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static FragmentSfcProfileBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 47;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcProfileBinding fragmentSfcProfileBinding = (FragmentSfcProfileBinding) bind(obj, view, R.layout.fragment_sfc_profile);
        int i4 = component3 + 19;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 24 / 0;
        }
        return fragmentSfcProfileBinding;
    }
}
