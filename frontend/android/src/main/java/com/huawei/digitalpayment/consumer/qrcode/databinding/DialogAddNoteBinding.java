package com.huawei.digitalpayment.consumer.qrcode.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.digitalpayment.consumer.qrcode.R;

public abstract class DialogAddNoteBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int component1;
    public final CommonInputView edtTipsContent;
    public final AppCompatTextView tvLeftButton;
    public final AppCompatTextView tvRightButton;
    public final AppCompatTextView tvTipsTitle;
    public final View viewDivider;

    protected DialogAddNoteBinding(Object obj, View view, int i, CommonInputView commonInputView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, View view2) {
        super(obj, view, i);
        this.edtTipsContent = commonInputView;
        this.tvLeftButton = appCompatTextView;
        this.tvRightButton = appCompatTextView2;
        this.tvTipsTitle = appCompatTextView3;
        this.viewDivider = view2;
    }

    public static DialogAddNoteBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 99;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DialogAddNoteBinding dialogAddNoteBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        if (i3 == 0) {
            int i4 = 7 / 0;
        }
        return dialogAddNoteBindingInflate;
    }

    @Deprecated
    public static DialogAddNoteBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 7;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DialogAddNoteBinding dialogAddNoteBinding = (DialogAddNoteBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialog_add_note, viewGroup, z, obj);
        if (i3 != 0) {
            return dialogAddNoteBinding;
        }
        throw null;
    }

    public static DialogAddNoteBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 61;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DialogAddNoteBinding dialogAddNoteBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 23;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return dialogAddNoteBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static DialogAddNoteBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 17;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DialogAddNoteBinding dialogAddNoteBinding = (DialogAddNoteBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialog_add_note, null, false, obj);
        int i4 = ShareDataUIState + 65;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 49 / 0;
        }
        return dialogAddNoteBinding;
    }

    public static DialogAddNoteBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 41;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DialogAddNoteBinding dialogAddNoteBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        if (i3 == 0) {
            int i4 = 21 / 0;
        }
        return dialogAddNoteBindingBind;
    }

    @Deprecated
    public static DialogAddNoteBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 31;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        DialogAddNoteBinding dialogAddNoteBinding = (DialogAddNoteBinding) bind(obj, view, R.layout.dialog_add_note);
        int i3 = component1 + 87;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return dialogAddNoteBinding;
    }
}
