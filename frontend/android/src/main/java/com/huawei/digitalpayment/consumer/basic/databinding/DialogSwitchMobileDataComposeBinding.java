package com.huawei.digitalpayment.consumer.basic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import com.huawei.digitalpayment.consumer.basic.R;

public final class DialogSwitchMobileDataComposeBinding implements ViewBinding {
    private static int component2 = 1;
    private static int copydefault;
    private final ComposeView component3;
    public final ComposeView composeSwitchMobileDataDialog;

    @Override
    public View getRoot() {
        ComposeView root;
        int i = 2 % 2;
        int i2 = copydefault + 117;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            root = getRoot();
            int i3 = 87 / 0;
        } else {
            root = getRoot();
        }
        int i4 = copydefault + 91;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return root;
        }
        throw null;
    }

    private DialogSwitchMobileDataComposeBinding(ComposeView composeView, ComposeView composeView2) {
        this.component3 = composeView;
        this.composeSwitchMobileDataDialog = composeView2;
    }

    @Override
    public ComposeView getRoot() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 79;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        ComposeView composeView = this.component3;
        int i4 = i2 + 21;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return composeView;
    }

    public static DialogSwitchMobileDataComposeBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 43;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DialogSwitchMobileDataComposeBinding dialogSwitchMobileDataComposeBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component2 + 83;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 26 / 0;
        }
        return dialogSwitchMobileDataComposeBindingInflate;
    }

    public static DialogSwitchMobileDataComposeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 21;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.dialog_switch_mobile_data_compose, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        DialogSwitchMobileDataComposeBinding dialogSwitchMobileDataComposeBindingBind = bind(viewInflate);
        int i4 = component2 + 9;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return dialogSwitchMobileDataComposeBindingBind;
        }
        throw null;
    }

    public static DialogSwitchMobileDataComposeBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 41;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ComposeView composeView = (ComposeView) view;
        DialogSwitchMobileDataComposeBinding dialogSwitchMobileDataComposeBinding = new DialogSwitchMobileDataComposeBinding(composeView, composeView);
        int i3 = copydefault + 55;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 44 / 0;
        }
        return dialogSwitchMobileDataComposeBinding;
    }
}
