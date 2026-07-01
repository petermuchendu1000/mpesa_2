package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ActivitySfcUnlockAppBinding extends ViewDataBinding {
    private static int component1 = 0;
    private static int component3 = 1;
    public final LoadingButton btnConfirm;
    public final CommonInputView inputNumber;
    public final RoundImageView ivBack;
    public final ImageView ivPinLocked;
    public final TextView tvPinTitle;
    public final TextView tvTitle;

    protected ActivitySfcUnlockAppBinding(Object obj, View view, int i, LoadingButton loadingButton, CommonInputView commonInputView, RoundImageView roundImageView, ImageView imageView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.btnConfirm = loadingButton;
        this.inputNumber = commonInputView;
        this.ivBack = roundImageView;
        this.ivPinLocked = imageView;
        this.tvPinTitle = textView;
        this.tvTitle = textView2;
    }

    public static ActivitySfcUnlockAppBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 57;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcUnlockAppBinding activitySfcUnlockAppBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 105;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcUnlockAppBindingInflate;
    }

    @Deprecated
    public static ActivitySfcUnlockAppBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        ActivitySfcUnlockAppBinding activitySfcUnlockAppBinding;
        int i = 2 % 2;
        int i2 = component3 + 125;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            activitySfcUnlockAppBinding = (ActivitySfcUnlockAppBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_unlock_app, viewGroup, z, obj);
            int i3 = 86 / 0;
        } else {
            activitySfcUnlockAppBinding = (ActivitySfcUnlockAppBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_unlock_app, viewGroup, z, obj);
        }
        int i4 = component3 + 93;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 65 / 0;
        }
        return activitySfcUnlockAppBinding;
    }

    public static ActivitySfcUnlockAppBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 3;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return inflate(layoutInflater, defaultComponent);
        }
        inflate(layoutInflater, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivitySfcUnlockAppBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 57;
        component3 = i2 % 128;
        return (ActivitySfcUnlockAppBinding) ViewDataBinding.inflateInternal(layoutInflater, i2 % 2 == 0 ? R.layout.activity_sfc_unlock_app : R.layout.activity_sfc_unlock_app, null, false, obj);
    }

    public static ActivitySfcUnlockAppBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 101;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcUnlockAppBinding activitySfcUnlockAppBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 19;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcUnlockAppBindingBind;
    }

    @Deprecated
    public static ActivitySfcUnlockAppBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 19;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        ActivitySfcUnlockAppBinding activitySfcUnlockAppBinding = (ActivitySfcUnlockAppBinding) bind(obj, view, R.layout.activity_sfc_unlock_app);
        int i3 = component3 + 107;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 32 / 0;
        }
        return activitySfcUnlockAppBinding;
    }
}
