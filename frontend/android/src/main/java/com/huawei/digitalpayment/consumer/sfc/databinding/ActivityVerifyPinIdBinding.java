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

public abstract class ActivityVerifyPinIdBinding extends ViewDataBinding {
    private static int component2 = 0;
    private static int copydefault = 1;
    public final LoadingButton btnConfirm;
    public final CommonInputView inputNumber;
    public final RoundImageView ivBack;
    public final ImageView ivPinLocked;
    public final TextView tvPinTitle;
    public final TextView tvTitle;
    public final View viewBg;

    protected ActivityVerifyPinIdBinding(Object obj, View view, int i, LoadingButton loadingButton, CommonInputView commonInputView, RoundImageView roundImageView, ImageView imageView, TextView textView, TextView textView2, View view2) {
        super(obj, view, i);
        this.btnConfirm = loadingButton;
        this.inputNumber = commonInputView;
        this.ivBack = roundImageView;
        this.ivPinLocked = imageView;
        this.tvPinTitle = textView;
        this.tvTitle = textView2;
        this.viewBg = view2;
    }

    public static ActivityVerifyPinIdBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 39;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return inflate(layoutInflater, viewGroup, z, defaultComponent);
        }
        inflate(layoutInflater, viewGroup, z, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivityVerifyPinIdBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 11;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityVerifyPinIdBinding activityVerifyPinIdBinding = (ActivityVerifyPinIdBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_verify_pin_id, viewGroup, z, obj);
        int i4 = component2 + 33;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activityVerifyPinIdBinding;
    }

    public static ActivityVerifyPinIdBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 89;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityVerifyPinIdBinding activityVerifyPinIdBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 29;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 39 / 0;
        }
        return activityVerifyPinIdBindingInflate;
    }

    @Deprecated
    public static ActivityVerifyPinIdBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 21;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        ActivityVerifyPinIdBinding activityVerifyPinIdBinding = (ActivityVerifyPinIdBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_verify_pin_id, null, false, obj);
        int i4 = component2 + 111;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return activityVerifyPinIdBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static ActivityVerifyPinIdBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 17;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityVerifyPinIdBinding activityVerifyPinIdBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 121;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return activityVerifyPinIdBindingBind;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivityVerifyPinIdBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 57;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityVerifyPinIdBinding activityVerifyPinIdBinding = (ActivityVerifyPinIdBinding) bind(obj, view, R.layout.activity_verify_pin_id);
        int i4 = component2 + 63;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 92 / 0;
        }
        return activityVerifyPinIdBinding;
    }
}
