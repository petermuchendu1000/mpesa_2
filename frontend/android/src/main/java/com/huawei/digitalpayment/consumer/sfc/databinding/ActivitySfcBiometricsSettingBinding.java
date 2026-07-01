package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ActivitySfcBiometricsSettingBinding extends ViewDataBinding {
    private static int component1 = 0;
    private static int component3 = 1;
    public final ComposeView composeScreen;

    protected ActivitySfcBiometricsSettingBinding(Object obj, View view, int i, ComposeView composeView) {
        super(obj, view, i);
        this.composeScreen = composeView;
    }

    public static ActivitySfcBiometricsSettingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 123;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ActivitySfcBiometricsSettingBinding activitySfcBiometricsSettingBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = component1 + 103;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return activitySfcBiometricsSettingBindingInflate;
    }

    @Deprecated
    public static ActivitySfcBiometricsSettingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 69;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        ActivitySfcBiometricsSettingBinding activitySfcBiometricsSettingBinding = (ActivitySfcBiometricsSettingBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_biometrics_setting, viewGroup, z, obj);
        int i3 = component1 + 55;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return activitySfcBiometricsSettingBinding;
    }

    public static ActivitySfcBiometricsSettingBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 111;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ActivitySfcBiometricsSettingBinding activitySfcBiometricsSettingBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = component1 + 77;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 99 / 0;
        }
        return activitySfcBiometricsSettingBindingInflate;
    }

    @Deprecated
    public static ActivitySfcBiometricsSettingBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 21;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcBiometricsSettingBinding activitySfcBiometricsSettingBinding = (ActivitySfcBiometricsSettingBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_biometrics_setting, null, false, obj);
        int i4 = component3 + 81;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return activitySfcBiometricsSettingBinding;
        }
        throw null;
    }

    public static ActivitySfcBiometricsSettingBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 111;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return bind(view, defaultComponent);
        }
        bind(view, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivitySfcBiometricsSettingBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 111;
        component3 = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        ActivitySfcBiometricsSettingBinding activitySfcBiometricsSettingBinding = (ActivitySfcBiometricsSettingBinding) bind(obj, view, R.layout.activity_sfc_biometrics_setting);
        int i3 = component3 + 37;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            return activitySfcBiometricsSettingBinding;
        }
        throw null;
    }
}
