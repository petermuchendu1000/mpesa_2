package com.huawei.digitalpayment.consumer.baseui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.huawei.digitalpayment.consumer.baseui.R;

public final class LayoutPinPadBinding implements ViewBinding {
    private static int component1 = 1;
    private static int copydefault;
    private final LinearLayout component3;
    public final LinearLayout pinPadContainer;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = copydefault + 15;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        LinearLayout root = getRoot();
        int i4 = copydefault + 33;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private LayoutPinPadBinding(LinearLayout linearLayout, LinearLayout linearLayout2) {
        this.component3 = linearLayout;
        this.pinPadContainer = linearLayout2;
    }

    @Override
    public LinearLayout getRoot() {
        int i = 2 % 2;
        int i2 = copydefault + 111;
        int i3 = i2 % 128;
        component1 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        LinearLayout linearLayout = this.component3;
        int i4 = i3 + 113;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return linearLayout;
        }
        throw null;
    }

    public static LayoutPinPadBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 11;
        copydefault = i2 % 128;
        LayoutPinPadBinding layoutPinPadBindingInflate = inflate(layoutInflater, null, i2 % 2 != 0);
        int i3 = component1 + 87;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return layoutPinPadBindingInflate;
    }

    public static LayoutPinPadBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 3;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.layout_pin_pad, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        LayoutPinPadBinding layoutPinPadBindingBind = bind(viewInflate);
        int i4 = copydefault + 17;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 92 / 0;
        }
        return layoutPinPadBindingBind;
    }

    public static LayoutPinPadBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 1;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        LinearLayout linearLayout = (LinearLayout) view;
        LayoutPinPadBinding layoutPinPadBinding = new LayoutPinPadBinding(linearLayout, linearLayout);
        int i4 = copydefault + 67;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return layoutPinPadBinding;
        }
        throw null;
    }
}
