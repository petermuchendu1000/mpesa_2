package com.huawei.digitalpayment.consumer.profileui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.digitalpayment.consumer.baselib.widget.input.MobileInputView;
import com.huawei.digitalpayment.consumer.profileui.R;

public abstract class ProfileActivityProfileEditMsisdnBinding extends ViewDataBinding {
    private static int component2 = 0;
    private static int copydefault = 1;
    public final LoadingButton btnNext;
    public final MobileInputView phoneNumberInput;
    public final TextView tvLoginTitle;

    protected ProfileActivityProfileEditMsisdnBinding(Object obj, View view, int i, LoadingButton loadingButton, MobileInputView mobileInputView, TextView textView) {
        super(obj, view, i);
        this.btnNext = loadingButton;
        this.phoneNumberInput = mobileInputView;
        this.tvLoginTitle = textView;
    }

    public static ProfileActivityProfileEditMsisdnBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 75;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ProfileActivityProfileEditMsisdnBinding profileActivityProfileEditMsisdnBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 123;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return profileActivityProfileEditMsisdnBindingInflate;
    }

    @Deprecated
    public static ProfileActivityProfileEditMsisdnBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 59;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingInflateInternal = ViewDataBinding.inflateInternal(layoutInflater, R.layout.profile_activity_profile_edit_msisdn, viewGroup, z, obj);
        if (i3 != 0) {
            return (ProfileActivityProfileEditMsisdnBinding) viewDataBindingInflateInternal;
        }
        throw null;
    }

    public static ProfileActivityProfileEditMsisdnBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 15;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ProfileActivityProfileEditMsisdnBinding profileActivityProfileEditMsisdnBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 7;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return profileActivityProfileEditMsisdnBindingInflate;
    }

    @Deprecated
    public static ProfileActivityProfileEditMsisdnBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = component2 + 121;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            i = R.layout.profile_activity_profile_edit_msisdn;
            z = true;
        } else {
            i = R.layout.profile_activity_profile_edit_msisdn;
            z = false;
        }
        return (ProfileActivityProfileEditMsisdnBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
    }

    public static ProfileActivityProfileEditMsisdnBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 91;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return bind(view, defaultComponent);
        }
        bind(view, defaultComponent);
        throw null;
    }

    @Deprecated
    public static ProfileActivityProfileEditMsisdnBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 111;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingBind = bind(obj, view, R.layout.profile_activity_profile_edit_msisdn);
        if (i3 == 0) {
            return (ProfileActivityProfileEditMsisdnBinding) viewDataBindingBind;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
