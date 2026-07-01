package com.huawei.digitalpayment.consumer.basic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.common.widget.input.MultiLineInputView;
import com.huawei.digitalpayment.consumer.basic.R;

public abstract class ActivityShareAppMessageBinding extends ViewDataBinding {
    private static int component3 = 1;
    private static int copydefault;
    public final MultiLineInputView inputContent;
    public final CommonInputView inputPhone;
    public final Button lbConfirm;
    public final AppCompatTextView tvShareLimit;

    protected ActivityShareAppMessageBinding(Object obj, View view, int i, MultiLineInputView multiLineInputView, CommonInputView commonInputView, Button button, AppCompatTextView appCompatTextView) {
        super(obj, view, i);
        this.inputContent = multiLineInputView;
        this.inputPhone = commonInputView;
        this.lbConfirm = button;
        this.tvShareLimit = appCompatTextView;
    }

    public static ActivityShareAppMessageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 23;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityShareAppMessageBinding activityShareAppMessageBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 23;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 1 / 0;
        }
        return activityShareAppMessageBindingInflate;
    }

    @Deprecated
    public static ActivityShareAppMessageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 17;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingInflateInternal = ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_share_app_message, viewGroup, z, obj);
        if (i3 == 0) {
            return (ActivityShareAppMessageBinding) viewDataBindingInflateInternal;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static ActivityShareAppMessageBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 125;
        copydefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ActivityShareAppMessageBinding activityShareAppMessageBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = component3 + 109;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            return activityShareAppMessageBindingInflate;
        }
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivityShareAppMessageBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 47;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityShareAppMessageBinding activityShareAppMessageBinding = (ActivityShareAppMessageBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_share_app_message, null, false, obj);
        int i4 = component3 + 51;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return activityShareAppMessageBinding;
        }
        throw null;
    }

    public static ActivityShareAppMessageBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 95;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return bind(view, defaultComponent);
        }
        bind(view, defaultComponent);
        throw null;
    }

    @Deprecated
    public static ActivityShareAppMessageBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 109;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityShareAppMessageBinding activityShareAppMessageBinding = (ActivityShareAppMessageBinding) bind(obj, view, R.layout.activity_share_app_message);
        int i4 = component3 + 5;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activityShareAppMessageBinding;
    }
}
