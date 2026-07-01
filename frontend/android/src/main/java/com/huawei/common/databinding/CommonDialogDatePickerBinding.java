package com.huawei.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.R;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.date.WheelPicker;
import com.huawei.common.widget.round.RoundTextView;

public abstract class CommonDialogDatePickerBinding extends ViewDataBinding {
    public final LoadingButton btnConfirm;
    public final RoundTextView line;
    public final LinearLayout llDate;
    public final TextView tvTitle;
    public final WheelPicker wheelDay;
    public final WheelPicker wheelMonth;
    public final WheelPicker wheelyear;

    protected CommonDialogDatePickerBinding(Object obj, View view, int i, LoadingButton loadingButton, RoundTextView roundTextView, LinearLayout linearLayout, TextView textView, WheelPicker wheelPicker, WheelPicker wheelPicker2, WheelPicker wheelPicker3) {
        super(obj, view, i);
        this.btnConfirm = loadingButton;
        this.line = roundTextView;
        this.llDate = linearLayout;
        this.tvTitle = textView;
        this.wheelDay = wheelPicker;
        this.wheelMonth = wheelPicker2;
        this.wheelyear = wheelPicker3;
    }

    public static CommonDialogDatePickerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static CommonDialogDatePickerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (CommonDialogDatePickerBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.common_dialog_date_picker, viewGroup, z, obj);
    }

    public static CommonDialogDatePickerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static CommonDialogDatePickerBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (CommonDialogDatePickerBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.common_dialog_date_picker, null, false, obj);
    }

    public static CommonDialogDatePickerBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static CommonDialogDatePickerBinding bind(View view, Object obj) {
        return (CommonDialogDatePickerBinding) bind(obj, view, R.layout.common_dialog_date_picker);
    }
}
