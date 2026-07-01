package com.huawei.digitalpayment.consumer.profileui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.digitalpayment.consumer.profileui.R;

public abstract class ProfileActivityCurrentMsisdnBinding extends ViewDataBinding {
    private static int component1 = 0;
    private static int component3 = 1;
    public final LoadingButton btnNext;
    public final CommonInputView phoneNumberInput;
    public final TextView tvDescription;
    public final TextView tvLoginTitle;

    protected ProfileActivityCurrentMsisdnBinding(Object obj, View view, int i, LoadingButton loadingButton, CommonInputView commonInputView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.btnNext = loadingButton;
        this.phoneNumberInput = commonInputView;
        this.tvDescription = textView;
        this.tvLoginTitle = textView2;
    }

    public static ProfileActivityCurrentMsisdnBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 21;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ProfileActivityCurrentMsisdnBinding profileActivityCurrentMsisdnBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 99;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return profileActivityCurrentMsisdnBindingInflate;
    }

    @Deprecated
    public static ProfileActivityCurrentMsisdnBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 35;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ProfileActivityCurrentMsisdnBinding profileActivityCurrentMsisdnBinding = (ProfileActivityCurrentMsisdnBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.profile_activity_current_msisdn, viewGroup, z, obj);
        int i4 = component1 + 11;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return profileActivityCurrentMsisdnBinding;
    }

    public static ProfileActivityCurrentMsisdnBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 57;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ProfileActivityCurrentMsisdnBinding profileActivityCurrentMsisdnBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 105;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return profileActivityCurrentMsisdnBindingInflate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ProfileActivityCurrentMsisdnBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 93;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ProfileActivityCurrentMsisdnBinding profileActivityCurrentMsisdnBinding = (ProfileActivityCurrentMsisdnBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.profile_activity_current_msisdn, null, false, obj);
        int i4 = component3 + 29;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 36 / 0;
        }
        return profileActivityCurrentMsisdnBinding;
    }

    public static ProfileActivityCurrentMsisdnBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 117;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return bind(view, defaultComponent);
        }
        bind(view, defaultComponent);
        throw null;
    }

    @Deprecated
    public static ProfileActivityCurrentMsisdnBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 55;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        ProfileActivityCurrentMsisdnBinding profileActivityCurrentMsisdnBinding = (ProfileActivityCurrentMsisdnBinding) bind(obj, view, R.layout.profile_activity_current_msisdn);
        int i3 = component3 + 65;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            return profileActivityCurrentMsisdnBinding;
        }
        throw null;
    }
}
