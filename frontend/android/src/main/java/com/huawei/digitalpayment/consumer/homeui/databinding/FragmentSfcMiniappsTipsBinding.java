package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class FragmentSfcMiniappsTipsBinding extends ViewDataBinding {
    private static int component1 = 0;
    private static int component2 = 1;
    public final ImageView ivImage;
    public final TextView tvTipsContent;
    public final TextView tvTipsTitle;
    public final TextView tvTitle;

    protected FragmentSfcMiniappsTipsBinding(Object obj, View view, int i, ImageView imageView, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.ivImage = imageView;
        this.tvTipsContent = textView;
        this.tvTipsTitle = textView2;
        this.tvTitle = textView3;
    }

    public static FragmentSfcMiniappsTipsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 53;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        FragmentSfcMiniappsTipsBinding fragmentSfcMiniappsTipsBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = component2 + 15;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            return fragmentSfcMiniappsTipsBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static FragmentSfcMiniappsTipsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 43;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcMiniappsTipsBinding fragmentSfcMiniappsTipsBinding = (FragmentSfcMiniappsTipsBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_sfc_miniapps_tips, viewGroup, z, obj);
        int i4 = component1 + 33;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return fragmentSfcMiniappsTipsBinding;
        }
        throw null;
    }

    public static FragmentSfcMiniappsTipsBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 53;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return inflate(layoutInflater, defaultComponent);
        }
        inflate(layoutInflater, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static FragmentSfcMiniappsTipsBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 73;
        component1 = i2 % 128;
        FragmentSfcMiniappsTipsBinding fragmentSfcMiniappsTipsBinding = (FragmentSfcMiniappsTipsBinding) ViewDataBinding.inflateInternal(layoutInflater, i2 % 2 != 0 ? R.layout.fragment_sfc_miniapps_tips : R.layout.fragment_sfc_miniapps_tips, null, false, obj);
        int i3 = component1 + 111;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return fragmentSfcMiniappsTipsBinding;
    }

    public static FragmentSfcMiniappsTipsBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 99;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return bind(view, defaultComponent);
        }
        bind(view, defaultComponent);
        throw null;
    }

    @Deprecated
    public static FragmentSfcMiniappsTipsBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 109;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcMiniappsTipsBinding fragmentSfcMiniappsTipsBinding = (FragmentSfcMiniappsTipsBinding) bind(obj, view, R.layout.fragment_sfc_miniapps_tips);
        int i4 = component1 + 43;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentSfcMiniappsTipsBinding;
    }
}
