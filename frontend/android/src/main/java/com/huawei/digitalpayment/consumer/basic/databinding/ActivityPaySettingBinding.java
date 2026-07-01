package com.huawei.digitalpayment.consumer.basic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.SingleRadioButton;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.digitalpayment.consumer.basic.R;

public abstract class ActivityPaySettingBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    public final SingleRadioButton cbFacePayment;
    public final SingleRadioButton cbFingerprintPayment;
    public final SingleRadioButton cbNone;
    public final RoundConstraintLayout clFacePayment;
    public final RoundConstraintLayout clFingerprintPayment;
    public final RoundConstraintLayout clNone;
    public final View lineFacePayment;
    public final View lineFingerprintPayment;
    public final TextView tvFacePayment;
    public final TextView tvFingerprintPayment;
    public final TextView tvNone;

    protected ActivityPaySettingBinding(Object obj, View view, int i, SingleRadioButton singleRadioButton, SingleRadioButton singleRadioButton2, SingleRadioButton singleRadioButton3, RoundConstraintLayout roundConstraintLayout, RoundConstraintLayout roundConstraintLayout2, RoundConstraintLayout roundConstraintLayout3, View view2, View view3, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.cbFacePayment = singleRadioButton;
        this.cbFingerprintPayment = singleRadioButton2;
        this.cbNone = singleRadioButton3;
        this.clFacePayment = roundConstraintLayout;
        this.clFingerprintPayment = roundConstraintLayout2;
        this.clNone = roundConstraintLayout3;
        this.lineFacePayment = view2;
        this.lineFingerprintPayment = view3;
        this.tvFacePayment = textView;
        this.tvFingerprintPayment = textView2;
        this.tvNone = textView3;
    }

    public static ActivityPaySettingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 125;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivityPaySettingBinding activityPaySettingBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 17;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 26 / 0;
        }
        return activityPaySettingBindingInflate;
    }

    @Deprecated
    public static ActivityPaySettingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 63;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityPaySettingBinding activityPaySettingBinding = (ActivityPaySettingBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_pay_setting, viewGroup, z, obj);
        if (i3 == 0) {
            int i4 = 57 / 0;
        }
        return activityPaySettingBinding;
    }

    public static ActivityPaySettingBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 55;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ActivityPaySettingBinding activityPaySettingBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = component1 + 59;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 27 / 0;
        }
        return activityPaySettingBindingInflate;
    }

    @Deprecated
    public static ActivityPaySettingBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 69;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            i = R.layout.activity_pay_setting;
            z = true;
        } else {
            i = R.layout.activity_pay_setting;
            z = false;
        }
        return (ActivityPaySettingBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
    }

    public static ActivityPaySettingBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 125;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityPaySettingBinding activityPaySettingBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        if (i3 == 0) {
            int i4 = 75 / 0;
        }
        return activityPaySettingBindingBind;
    }

    @Deprecated
    public static ActivityPaySettingBinding bind(View view, Object obj) {
        ActivityPaySettingBinding activityPaySettingBinding;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 69;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            activityPaySettingBinding = (ActivityPaySettingBinding) bind(obj, view, R.layout.activity_pay_setting);
            int i3 = 28 / 0;
        } else {
            activityPaySettingBinding = (ActivityPaySettingBinding) bind(obj, view, R.layout.activity_pay_setting);
        }
        int i4 = component1 + 17;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return activityPaySettingBinding;
    }
}
