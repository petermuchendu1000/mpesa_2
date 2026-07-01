package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class SpinnerItemMtandaoBinding extends ViewDataBinding {
    private static int component2 = 0;
    private static int component3 = 1;
    public final View separator;
    public final TextView text1;

    protected SpinnerItemMtandaoBinding(Object obj, View view, int i, View view2, TextView textView) {
        super(obj, view, i);
        this.separator = view2;
        this.text1 = textView;
    }

    public static SpinnerItemMtandaoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 105;
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
    public static SpinnerItemMtandaoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 19;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        SpinnerItemMtandaoBinding spinnerItemMtandaoBinding = (SpinnerItemMtandaoBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.spinner_item_mtandao, viewGroup, z, obj);
        int i3 = component2 + 39;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return spinnerItemMtandaoBinding;
    }

    public static SpinnerItemMtandaoBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 7;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return inflate(layoutInflater, defaultComponent);
        }
        inflate(layoutInflater, defaultComponent);
        throw null;
    }

    @Deprecated
    public static SpinnerItemMtandaoBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 19;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        SpinnerItemMtandaoBinding spinnerItemMtandaoBinding = (SpinnerItemMtandaoBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.spinner_item_mtandao, null, false, obj);
        int i4 = component2 + 123;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return spinnerItemMtandaoBinding;
    }

    public static SpinnerItemMtandaoBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 43;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return bind(view, defaultComponent);
        }
        bind(view, defaultComponent);
        throw null;
    }

    @Deprecated
    public static SpinnerItemMtandaoBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 51;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        SpinnerItemMtandaoBinding spinnerItemMtandaoBinding = (SpinnerItemMtandaoBinding) bind(obj, view, R.layout.spinner_item_mtandao);
        if (i3 == 0) {
            int i4 = 89 / 0;
        }
        return spinnerItemMtandaoBinding;
    }
}
