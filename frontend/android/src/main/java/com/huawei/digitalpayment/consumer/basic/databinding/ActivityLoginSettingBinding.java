package com.huawei.digitalpayment.consumer.basic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.SwitchView;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.digitalpayment.consumer.basic.R;

public abstract class ActivityLoginSettingBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int component3;
    public final SwitchView cbFaceLogin;
    public final SwitchView cbFingerprintLogin;
    public final RoundConstraintLayout clFaceLogin;
    public final RoundConstraintLayout clFingerprintLogin;
    public final View lineFaceLogin;
    public final TextView tvFaceLogin;
    public final TextView tvFingerprintLogin;

    protected ActivityLoginSettingBinding(Object obj, View view, int i, SwitchView switchView, SwitchView switchView2, RoundConstraintLayout roundConstraintLayout, RoundConstraintLayout roundConstraintLayout2, View view2, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.cbFaceLogin = switchView;
        this.cbFingerprintLogin = switchView2;
        this.clFaceLogin = roundConstraintLayout;
        this.clFingerprintLogin = roundConstraintLayout2;
        this.lineFaceLogin = view2;
        this.tvFaceLogin = textView;
        this.tvFingerprintLogin = textView2;
    }

    public static ActivityLoginSettingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 125;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return inflate(layoutInflater, viewGroup, z, defaultComponent);
        }
        inflate(layoutInflater, viewGroup, z, defaultComponent);
        throw null;
    }

    @Deprecated
    public static ActivityLoginSettingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 43;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityLoginSettingBinding activityLoginSettingBinding = (ActivityLoginSettingBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_login_setting, viewGroup, z, obj);
        int i4 = ShareDataUIState + 63;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return activityLoginSettingBinding;
        }
        throw null;
    }

    public static ActivityLoginSettingBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 57;
        component3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ActivityLoginSettingBinding activityLoginSettingBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = ShareDataUIState + 25;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            return activityLoginSettingBindingInflate;
        }
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivityLoginSettingBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 93;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            i = R.layout.activity_login_setting;
            z = true;
        } else {
            i = R.layout.activity_login_setting;
            z = false;
        }
        ActivityLoginSettingBinding activityLoginSettingBinding = (ActivityLoginSettingBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
        int i4 = component3 + 111;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return activityLoginSettingBinding;
    }

    public static ActivityLoginSettingBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 75;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityLoginSettingBinding activityLoginSettingBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 83;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return activityLoginSettingBindingBind;
    }

    @Deprecated
    public static ActivityLoginSettingBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 117;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityLoginSettingBinding activityLoginSettingBinding = (ActivityLoginSettingBinding) bind(obj, view, R.layout.activity_login_setting);
        int i4 = ShareDataUIState + 109;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activityLoginSettingBinding;
    }
}
