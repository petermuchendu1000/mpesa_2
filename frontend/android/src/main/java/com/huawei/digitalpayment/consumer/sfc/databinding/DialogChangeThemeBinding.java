package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class DialogChangeThemeBinding extends ViewDataBinding {
    private static int component1 = 0;
    private static int component3 = 1;
    public final ComposeView bottomSheetHeader;
    public final RecyclerView rvTheme;

    protected DialogChangeThemeBinding(Object obj, View view, int i, ComposeView composeView, RecyclerView recyclerView) {
        super(obj, view, i);
        this.bottomSheetHeader = composeView;
        this.rvTheme = recyclerView;
    }

    public static DialogChangeThemeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 113;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DialogChangeThemeBinding dialogChangeThemeBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 121;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 86 / 0;
        }
        return dialogChangeThemeBindingInflate;
    }

    @Deprecated
    public static DialogChangeThemeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 53;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingInflateInternal = ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialog_change_theme, viewGroup, z, obj);
        if (i3 == 0) {
            return (DialogChangeThemeBinding) viewDataBindingInflateInternal;
        }
        int i4 = 28 / 0;
        return (DialogChangeThemeBinding) viewDataBindingInflateInternal;
    }

    public static DialogChangeThemeBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 61;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DialogChangeThemeBinding dialogChangeThemeBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 41;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return dialogChangeThemeBindingInflate;
    }

    @Deprecated
    public static DialogChangeThemeBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 19;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DialogChangeThemeBinding dialogChangeThemeBinding = (DialogChangeThemeBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialog_change_theme, null, false, obj);
        int i4 = component3 + 13;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return dialogChangeThemeBinding;
    }

    public static DialogChangeThemeBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 65;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DialogChangeThemeBinding dialogChangeThemeBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 95;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 70 / 0;
        }
        return dialogChangeThemeBindingBind;
    }

    @Deprecated
    public static DialogChangeThemeBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 123;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DialogChangeThemeBinding dialogChangeThemeBinding = (DialogChangeThemeBinding) bind(obj, view, R.layout.dialog_change_theme);
        int i4 = component3 + 83;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 8 / 0;
        }
        return dialogChangeThemeBinding;
    }
}
