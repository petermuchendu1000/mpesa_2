package com.huawei.digitalpayment.consumer.login.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.digitalpayment.consumer.login.R;

public abstract class ActivityNewDeviceBinding extends ViewDataBinding {
    private static int component2 = 0;
    private static int component3 = 1;
    public final LoadingButton btnConfirm;
    public final CommonInputView idNumber;
    public final CommonInputView idType;
    public final RoundLinearLayout llTips;

    protected ActivityNewDeviceBinding(Object obj, View view, int i, LoadingButton loadingButton, CommonInputView commonInputView, CommonInputView commonInputView2, RoundLinearLayout roundLinearLayout) {
        super(obj, view, i);
        this.btnConfirm = loadingButton;
        this.idNumber = commonInputView;
        this.idType = commonInputView2;
        this.llTips = roundLinearLayout;
    }

    public static ActivityNewDeviceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 45;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityNewDeviceBinding activityNewDeviceBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 27;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activityNewDeviceBindingInflate;
    }

    @Deprecated
    public static ActivityNewDeviceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 73;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityNewDeviceBinding activityNewDeviceBinding = (ActivityNewDeviceBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_new_device, viewGroup, z, obj);
        int i4 = component3 + 53;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return activityNewDeviceBinding;
    }

    public static ActivityNewDeviceBinding inflate(LayoutInflater layoutInflater) {
        ActivityNewDeviceBinding activityNewDeviceBindingInflate;
        int i = 2 % 2;
        int i2 = component2 + 83;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            activityNewDeviceBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            int i3 = 35 / 0;
        } else {
            activityNewDeviceBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        }
        int i4 = component3 + 119;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return activityNewDeviceBindingInflate;
    }

    @Deprecated
    public static ActivityNewDeviceBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 47;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityNewDeviceBinding activityNewDeviceBinding = (ActivityNewDeviceBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_new_device, null, false, obj);
        int i4 = component3 + 65;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 79 / 0;
        }
        return activityNewDeviceBinding;
    }

    public static ActivityNewDeviceBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 29;
        component2 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ActivityNewDeviceBinding activityNewDeviceBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = component2 + 103;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            return activityNewDeviceBindingBind;
        }
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivityNewDeviceBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 21;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityNewDeviceBinding activityNewDeviceBinding = (ActivityNewDeviceBinding) bind(obj, view, R.layout.activity_new_device);
        int i4 = component2 + 77;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return activityNewDeviceBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
