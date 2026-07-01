package com.huawei.digitalpayment.consumer.baselib.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.date.WheelPicker;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.baselib.R;

public abstract class BaseDialogDatePickerBinding extends ViewDataBinding {
    private static int component3 = 1;
    private static int copydefault;
    public final RoundTextView btnCancel;
    public final RoundTextView btnConfirm;
    public final LinearLayout llDate;
    public final RoundTextView tvTitle;
    public final WheelPicker wheelDay;
    public final WheelPicker wheelMonth;
    public final WheelPicker wheelyear;

    protected BaseDialogDatePickerBinding(Object obj, View view, int i, RoundTextView roundTextView, RoundTextView roundTextView2, LinearLayout linearLayout, RoundTextView roundTextView3, WheelPicker wheelPicker, WheelPicker wheelPicker2, WheelPicker wheelPicker3) {
        super(obj, view, i);
        this.btnCancel = roundTextView;
        this.btnConfirm = roundTextView2;
        this.llDate = linearLayout;
        this.tvTitle = roundTextView3;
        this.wheelDay = wheelPicker;
        this.wheelMonth = wheelPicker2;
        this.wheelyear = wheelPicker3;
    }

    public static BaseDialogDatePickerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 59;
        component3 = i2 % 128;
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
    public static BaseDialogDatePickerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 17;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        BaseDialogDatePickerBinding baseDialogDatePickerBinding = (BaseDialogDatePickerBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.base_dialog_date_picker, viewGroup, z, obj);
        int i3 = component3 + 37;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 7 / 0;
        }
        return baseDialogDatePickerBinding;
    }

    public static BaseDialogDatePickerBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 71;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        BaseDialogDatePickerBinding baseDialogDatePickerBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 75;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 6 / 0;
        }
        return baseDialogDatePickerBindingInflate;
    }

    @Deprecated
    public static BaseDialogDatePickerBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 65;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        BaseDialogDatePickerBinding baseDialogDatePickerBinding = (BaseDialogDatePickerBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.base_dialog_date_picker, null, false, obj);
        int i4 = component3 + 31;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return baseDialogDatePickerBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static BaseDialogDatePickerBinding bind(View view) {
        BaseDialogDatePickerBinding baseDialogDatePickerBindingBind;
        int i = 2 % 2;
        int i2 = component3 + 33;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            baseDialogDatePickerBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
            int i3 = 14 / 0;
        } else {
            baseDialogDatePickerBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        }
        int i4 = copydefault + 35;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return baseDialogDatePickerBindingBind;
    }

    @Deprecated
    public static BaseDialogDatePickerBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 9;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        BaseDialogDatePickerBinding baseDialogDatePickerBinding = (BaseDialogDatePickerBinding) bind(obj, view, R.layout.base_dialog_date_picker);
        int i4 = copydefault + 115;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return baseDialogDatePickerBinding;
    }
}
