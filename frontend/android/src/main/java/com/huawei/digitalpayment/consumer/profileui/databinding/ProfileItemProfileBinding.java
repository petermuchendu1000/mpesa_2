package com.huawei.digitalpayment.consumer.profileui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.profileui.R;

public abstract class ProfileItemProfileBinding extends ViewDataBinding {
    private static int component1 = 0;
    private static int component3 = 1;
    public final ConstraintLayout clProfilesValue;
    public final ConstraintLayout itemView;
    public final ImageView ivEditMore;
    public final ConstraintLayout llLayout;
    public final RoundImageView profilesImg;
    public final TextView profilesName;
    public final TextView profilesValue;

    protected ProfileItemProfileBinding(Object obj, View view, int i, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, ConstraintLayout constraintLayout3, RoundImageView roundImageView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.clProfilesValue = constraintLayout;
        this.itemView = constraintLayout2;
        this.ivEditMore = imageView;
        this.llLayout = constraintLayout3;
        this.profilesImg = roundImageView;
        this.profilesName = textView;
        this.profilesValue = textView2;
    }

    public static ProfileItemProfileBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 43;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ProfileItemProfileBinding profileItemProfileBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 45;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return profileItemProfileBindingInflate;
    }

    @Deprecated
    public static ProfileItemProfileBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 57;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ProfileItemProfileBinding profileItemProfileBinding = (ProfileItemProfileBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.profile_item_profile, viewGroup, z, obj);
        if (i3 == 0) {
            return profileItemProfileBinding;
        }
        throw null;
    }

    public static ProfileItemProfileBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 85;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ProfileItemProfileBinding profileItemProfileBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 39;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return profileItemProfileBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static ProfileItemProfileBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 59;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        ProfileItemProfileBinding profileItemProfileBinding = (ProfileItemProfileBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.profile_item_profile, null, false, obj);
        int i4 = component3 + 55;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return profileItemProfileBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static ProfileItemProfileBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 67;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ProfileItemProfileBinding profileItemProfileBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        if (i3 == 0) {
            int i4 = 81 / 0;
        }
        return profileItemProfileBindingBind;
    }

    @Deprecated
    public static ProfileItemProfileBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 67;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        ProfileItemProfileBinding profileItemProfileBinding = (ProfileItemProfileBinding) bind(obj, view, R.layout.profile_item_profile);
        int i3 = component3 + 23;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return profileItemProfileBinding;
    }
}
