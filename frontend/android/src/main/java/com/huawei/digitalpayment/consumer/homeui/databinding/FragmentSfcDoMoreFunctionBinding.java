package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class FragmentSfcDoMoreFunctionBinding extends ViewDataBinding {
    private static int component1 = 1;
    private static int component3;
    public final CardView cardDoMoreRoot;
    public final RecyclerView recyclerView;
    public final TextView tvTitle;

    protected FragmentSfcDoMoreFunctionBinding(Object obj, View view, int i, CardView cardView, RecyclerView recyclerView, TextView textView) {
        super(obj, view, i);
        this.cardDoMoreRoot = cardView;
        this.recyclerView = recyclerView;
        this.tvTitle = textView;
    }

    public static FragmentSfcDoMoreFunctionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 1;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcDoMoreFunctionBinding fragmentSfcDoMoreFunctionBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 33;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentSfcDoMoreFunctionBindingInflate;
    }

    @Deprecated
    public static FragmentSfcDoMoreFunctionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 97;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        FragmentSfcDoMoreFunctionBinding fragmentSfcDoMoreFunctionBinding = (FragmentSfcDoMoreFunctionBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_sfc_do_more_function, viewGroup, z, obj);
        int i3 = component3 + 29;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return fragmentSfcDoMoreFunctionBinding;
    }

    public static FragmentSfcDoMoreFunctionBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 63;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return inflate(layoutInflater, defaultComponent);
        }
        inflate(layoutInflater, defaultComponent);
        throw null;
    }

    @Deprecated
    public static FragmentSfcDoMoreFunctionBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 71;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return (FragmentSfcDoMoreFunctionBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_sfc_do_more_function, null, false, obj);
    }

    public static FragmentSfcDoMoreFunctionBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 23;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcDoMoreFunctionBinding fragmentSfcDoMoreFunctionBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 55;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentSfcDoMoreFunctionBindingBind;
    }

    @Deprecated
    public static FragmentSfcDoMoreFunctionBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 99;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcDoMoreFunctionBinding fragmentSfcDoMoreFunctionBinding = (FragmentSfcDoMoreFunctionBinding) bind(obj, view, R.layout.fragment_sfc_do_more_function);
        if (i3 != 0) {
            int i4 = 7 / 0;
        }
        return fragmentSfcDoMoreFunctionBinding;
    }
}
