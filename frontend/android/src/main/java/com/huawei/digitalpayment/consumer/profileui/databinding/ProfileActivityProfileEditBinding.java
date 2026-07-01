package com.huawei.digitalpayment.consumer.profileui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.digitalpayment.consumer.profileui.R;

public abstract class ProfileActivityProfileEditBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    public final CommonInputView inputName;
    public final LoadingButton lbSave;

    protected ProfileActivityProfileEditBinding(Object obj, View view, int i, CommonInputView commonInputView, LoadingButton loadingButton) {
        super(obj, view, i);
        this.inputName = commonInputView;
        this.lbSave = loadingButton;
    }

    public static ProfileActivityProfileEditBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 105;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ProfileActivityProfileEditBinding profileActivityProfileEditBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 97;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return profileActivityProfileEditBindingInflate;
    }

    @Deprecated
    public static ProfileActivityProfileEditBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 85;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingInflateInternal = ViewDataBinding.inflateInternal(layoutInflater, R.layout.profile_activity_profile_edit, viewGroup, z, obj);
        if (i3 != 0) {
            return (ProfileActivityProfileEditBinding) viewDataBindingInflateInternal;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static ProfileActivityProfileEditBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 87;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ProfileActivityProfileEditBinding profileActivityProfileEditBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        if (i3 == 0) {
            int i4 = 60 / 0;
        }
        return profileActivityProfileEditBindingInflate;
    }

    @Deprecated
    public static ProfileActivityProfileEditBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 51;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ProfileActivityProfileEditBinding profileActivityProfileEditBinding = (ProfileActivityProfileEditBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.profile_activity_profile_edit, null, false, obj);
        int i4 = component1 + 77;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return profileActivityProfileEditBinding;
    }

    public static ProfileActivityProfileEditBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 95;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ProfileActivityProfileEditBinding profileActivityProfileEditBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 107;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 17 / 0;
        }
        return profileActivityProfileEditBindingBind;
    }

    @Deprecated
    public static ProfileActivityProfileEditBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 119;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ProfileActivityProfileEditBinding profileActivityProfileEditBinding = (ProfileActivityProfileEditBinding) bind(obj, view, R.layout.profile_activity_profile_edit);
        int i4 = component1 + 125;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return profileActivityProfileEditBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
