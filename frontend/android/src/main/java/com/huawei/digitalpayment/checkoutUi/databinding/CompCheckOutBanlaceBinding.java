package com.huawei.digitalpayment.checkoutUi.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.checkoutUi.R;

public abstract class CompCheckOutBanlaceBinding extends ViewDataBinding {
    private static int component2 = 1;
    private static int component3;
    public final ImageView ivWallet;
    public final TextView tvBalance;

    protected CompCheckOutBanlaceBinding(Object obj, View view, int i, ImageView imageView, TextView textView) {
        super(obj, view, i);
        this.ivWallet = imageView;
        this.tvBalance = textView;
    }

    public static CompCheckOutBanlaceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 101;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return inflate(layoutInflater, viewGroup, z, defaultComponent);
        }
        inflate(layoutInflater, viewGroup, z, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static CompCheckOutBanlaceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 85;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        CompCheckOutBanlaceBinding compCheckOutBanlaceBinding = (CompCheckOutBanlaceBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.comp_check_out_banlace, viewGroup, z, obj);
        int i3 = component2 + 79;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return compCheckOutBanlaceBinding;
    }

    public static CompCheckOutBanlaceBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 33;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        CompCheckOutBanlaceBinding compCheckOutBanlaceBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 3;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return compCheckOutBanlaceBindingInflate;
    }

    @Deprecated
    public static CompCheckOutBanlaceBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = component3 + 19;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            i = R.layout.comp_check_out_banlace;
            z = true;
        } else {
            i = R.layout.comp_check_out_banlace;
            z = false;
        }
        CompCheckOutBanlaceBinding compCheckOutBanlaceBinding = (CompCheckOutBanlaceBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
        int i4 = component2 + 29;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return compCheckOutBanlaceBinding;
    }

    public static CompCheckOutBanlaceBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 65;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return bind(view, defaultComponent);
        }
        bind(view, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static CompCheckOutBanlaceBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 69;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingBind = bind(obj, view, R.layout.comp_check_out_banlace);
        if (i3 == 0) {
            return (CompCheckOutBanlaceBinding) viewDataBindingBind;
        }
        int i4 = 65 / 0;
        return (CompCheckOutBanlaceBinding) viewDataBindingBind;
    }
}
