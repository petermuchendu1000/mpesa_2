package com.huawei.digitalpayment.consumer.basic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.LoadingButton;
import com.huawei.digitalpayment.consumer.basic.R;

public abstract class DialogChooseLanguageBinding extends ViewDataBinding {
    private static int component3 = 1;
    private static int copydefault;
    public final LoadingButton continueBtn;
    public final LinearLayout gestureLayout;
    public final RecyclerView recyclerView;
    public final TextView tvDescription;
    public final TextView tvTitle;

    protected DialogChooseLanguageBinding(Object obj, View view, int i, LoadingButton loadingButton, LinearLayout linearLayout, RecyclerView recyclerView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.continueBtn = loadingButton;
        this.gestureLayout = linearLayout;
        this.recyclerView = recyclerView;
        this.tvDescription = textView;
        this.tvTitle = textView2;
    }

    public static DialogChooseLanguageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 107;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DialogChooseLanguageBinding dialogChooseLanguageBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 19;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return dialogChooseLanguageBindingInflate;
    }

    @Deprecated
    public static DialogChooseLanguageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 63;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DialogChooseLanguageBinding dialogChooseLanguageBinding = (DialogChooseLanguageBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialog_choose_language, viewGroup, z, obj);
        if (i3 != 0) {
            return dialogChooseLanguageBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static DialogChooseLanguageBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 41;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return inflate(layoutInflater, defaultComponent);
        }
        inflate(layoutInflater, defaultComponent);
        throw null;
    }

    @Deprecated
    public static DialogChooseLanguageBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 23;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DialogChooseLanguageBinding dialogChooseLanguageBinding = (DialogChooseLanguageBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialog_choose_language, null, false, obj);
        int i4 = copydefault + 103;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 77 / 0;
        }
        return dialogChooseLanguageBinding;
    }

    public static DialogChooseLanguageBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 69;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        DialogChooseLanguageBinding dialogChooseLanguageBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = component3 + 39;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return dialogChooseLanguageBindingBind;
    }

    @Deprecated
    public static DialogChooseLanguageBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 27;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DialogChooseLanguageBinding dialogChooseLanguageBinding = (DialogChooseLanguageBinding) bind(obj, view, R.layout.dialog_choose_language);
        int i4 = copydefault + 9;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return dialogChooseLanguageBinding;
    }
}
