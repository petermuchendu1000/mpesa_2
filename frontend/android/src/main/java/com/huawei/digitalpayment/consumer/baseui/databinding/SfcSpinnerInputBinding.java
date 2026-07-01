package com.huawei.digitalpayment.consumer.baseui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.baseui.R;

public final class SfcSpinnerInputBinding implements ViewBinding {
    private static int ShareDataUIState = 1;
    private static int component1;
    private final View component2;
    public final Spinner spinnerInner;

    private SfcSpinnerInputBinding(View view, Spinner spinner) {
        this.component2 = view;
        this.spinnerInner = spinner;
    }

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 109;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static SfcSpinnerInputBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = component1 + 65;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        int i5 = i3 + 111;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            layoutInflater.inflate(R.layout.sfc_spinner_input, viewGroup);
            return bind(viewGroup);
        }
        layoutInflater.inflate(R.layout.sfc_spinner_input, viewGroup);
        bind(viewGroup);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static SfcSpinnerInputBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 9;
        ShareDataUIState = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            int i3 = R.id.spinner_inner;
            Spinner spinner = (Spinner) ViewBindings.findChildViewById(view, i3);
            if (spinner != null) {
                SfcSpinnerInputBinding sfcSpinnerInputBinding = new SfcSpinnerInputBinding(view, spinner);
                int i4 = ShareDataUIState + 53;
                component1 = i4 % 128;
                if (i4 % 2 == 0) {
                    return sfcSpinnerInputBinding;
                }
                throw null;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
        }
        obj.hashCode();
        throw null;
    }
}
