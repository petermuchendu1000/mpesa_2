package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class FragmentSetServicePinBinding extends ViewDataBinding {
    private static int component2 = 1;
    private static int component3;
    public final ImageView backButton;
    public final CardView cardServicePin;
    public final ImageView ivPin;
    public final ConstraintLayout topContainer;
    public final TextView tvTitleBar;

    protected FragmentSetServicePinBinding(Object obj, View view, int i, ImageView imageView, CardView cardView, ImageView imageView2, ConstraintLayout constraintLayout, TextView textView) {
        super(obj, view, i);
        this.backButton = imageView;
        this.cardServicePin = cardView;
        this.ivPin = imageView2;
        this.topContainer = constraintLayout;
        this.tvTitleBar = textView;
    }

    public static FragmentSetServicePinBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 53;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return inflate(layoutInflater, viewGroup, z, defaultComponent);
        }
        inflate(layoutInflater, viewGroup, z, defaultComponent);
        throw null;
    }

    @Deprecated
    public static FragmentSetServicePinBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 3;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingInflateInternal = ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_set_service_pin, viewGroup, z, obj);
        if (i3 != 0) {
            return (FragmentSetServicePinBinding) viewDataBindingInflateInternal;
        }
        throw null;
    }

    public static FragmentSetServicePinBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 41;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return inflate(layoutInflater, defaultComponent);
        }
        inflate(layoutInflater, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static FragmentSetServicePinBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = component2 + 19;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            i = R.layout.fragment_set_service_pin;
            z = true;
        } else {
            i = R.layout.fragment_set_service_pin;
            z = false;
        }
        return (FragmentSetServicePinBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
    }

    public static FragmentSetServicePinBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 113;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSetServicePinBinding fragmentSetServicePinBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 83;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return fragmentSetServicePinBindingBind;
        }
        throw null;
    }

    @Deprecated
    public static FragmentSetServicePinBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 21;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        FragmentSetServicePinBinding fragmentSetServicePinBinding = (FragmentSetServicePinBinding) bind(obj, view, R.layout.fragment_set_service_pin);
        int i3 = component3 + 93;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return fragmentSetServicePinBinding;
    }
}
