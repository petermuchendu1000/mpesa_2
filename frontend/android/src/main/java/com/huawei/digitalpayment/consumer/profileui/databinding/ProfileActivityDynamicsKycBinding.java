package com.huawei.digitalpayment.consumer.profileui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.digitalpayment.consumer.profileui.R;

public abstract class ProfileActivityDynamicsKycBinding extends ViewDataBinding {
    private static int component2 = 1;
    private static int component3;
    public final LoadingButton btnSubmit;
    public final ConstraintLayout clBottom;
    public final LinearLayout llContainer;

    protected ProfileActivityDynamicsKycBinding(Object obj, View view, int i, LoadingButton loadingButton, ConstraintLayout constraintLayout, LinearLayout linearLayout) {
        super(obj, view, i);
        this.btnSubmit = loadingButton;
        this.clBottom = constraintLayout;
        this.llContainer = linearLayout;
    }

    public static ProfileActivityDynamicsKycBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 79;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ProfileActivityDynamicsKycBinding profileActivityDynamicsKycBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = component2 + 45;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return profileActivityDynamicsKycBindingInflate;
    }

    @Deprecated
    public static ProfileActivityDynamicsKycBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 49;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ProfileActivityDynamicsKycBinding profileActivityDynamicsKycBinding = (ProfileActivityDynamicsKycBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.profile_activity_dynamics_kyc, viewGroup, z, obj);
        if (i3 == 0) {
            int i4 = 83 / 0;
        }
        return profileActivityDynamicsKycBinding;
    }

    public static ProfileActivityDynamicsKycBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 17;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return inflate(layoutInflater, defaultComponent);
        }
        inflate(layoutInflater, defaultComponent);
        throw null;
    }

    @Deprecated
    public static ProfileActivityDynamicsKycBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 107;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ProfileActivityDynamicsKycBinding profileActivityDynamicsKycBinding = (ProfileActivityDynamicsKycBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.profile_activity_dynamics_kyc, null, false, obj);
        int i4 = component2 + 15;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 10 / 0;
        }
        return profileActivityDynamicsKycBinding;
    }

    public static ProfileActivityDynamicsKycBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 15;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ProfileActivityDynamicsKycBinding profileActivityDynamicsKycBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        if (i3 != 0) {
            int i4 = 3 / 0;
        }
        return profileActivityDynamicsKycBindingBind;
    }

    @Deprecated
    public static ProfileActivityDynamicsKycBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 49;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ProfileActivityDynamicsKycBinding profileActivityDynamicsKycBinding = (ProfileActivityDynamicsKycBinding) bind(obj, view, R.layout.profile_activity_dynamics_kyc);
        if (i3 == 0) {
            int i4 = 74 / 0;
        }
        return profileActivityDynamicsKycBinding;
    }
}
