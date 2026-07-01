package com.huawei.digitalpayment.customer.dynamics.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.date.WheelPicker;
import com.huawei.digitalpayment.customer.dynamics.R;

public abstract class DynamicsDialogDatePickerBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    public final LoadingButton btnCancel;
    public final LoadingButton btnConfirm;
    public final LinearLayout llDate;
    public final TextView tvTitle;
    public final WheelPicker wheelDay;
    public final WheelPicker wheelMonth;
    public final WheelPicker wheelyear;

    protected DynamicsDialogDatePickerBinding(Object obj, View view, int i, LoadingButton loadingButton, LoadingButton loadingButton2, LinearLayout linearLayout, TextView textView, WheelPicker wheelPicker, WheelPicker wheelPicker2, WheelPicker wheelPicker3) {
        super(obj, view, i);
        this.btnCancel = loadingButton;
        this.btnConfirm = loadingButton2;
        this.llDate = linearLayout;
        this.tvTitle = textView;
        this.wheelDay = wheelPicker;
        this.wheelMonth = wheelPicker2;
        this.wheelyear = wheelPicker3;
    }

    public static DynamicsDialogDatePickerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 43;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        DynamicsDialogDatePickerBinding dynamicsDialogDatePickerBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 111;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return dynamicsDialogDatePickerBindingInflate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static DynamicsDialogDatePickerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 17;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DynamicsDialogDatePickerBinding dynamicsDialogDatePickerBinding = (DynamicsDialogDatePickerBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dynamics_dialog_date_picker, viewGroup, z, obj);
        int i4 = component2 + 27;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return dynamicsDialogDatePickerBinding;
    }

    public static DynamicsDialogDatePickerBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 69;
        ShareDataUIState = i2 % 128;
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
    public static DynamicsDialogDatePickerBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = component2 + 79;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            i = R.layout.dynamics_dialog_date_picker;
            z = true;
        } else {
            i = R.layout.dynamics_dialog_date_picker;
            z = false;
        }
        return (DynamicsDialogDatePickerBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
    }

    public static DynamicsDialogDatePickerBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 121;
        ShareDataUIState = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            obj.hashCode();
            throw null;
        }
        DynamicsDialogDatePickerBinding dynamicsDialogDatePickerBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = component2 + 11;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            return dynamicsDialogDatePickerBindingBind;
        }
        throw null;
    }

    @Deprecated
    public static DynamicsDialogDatePickerBinding bind(View view, Object obj) {
        DynamicsDialogDatePickerBinding dynamicsDialogDatePickerBinding;
        int i = 2 % 2;
        int i2 = component2 + 77;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            dynamicsDialogDatePickerBinding = (DynamicsDialogDatePickerBinding) bind(obj, view, R.layout.dynamics_dialog_date_picker);
            int i3 = 20 / 0;
        } else {
            dynamicsDialogDatePickerBinding = (DynamicsDialogDatePickerBinding) bind(obj, view, R.layout.dynamics_dialog_date_picker);
        }
        int i4 = component2 + 111;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return dynamicsDialogDatePickerBinding;
    }
}
