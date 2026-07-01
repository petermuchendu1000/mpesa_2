package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class FragmentItemAppsBinding extends ViewDataBinding {
    private static int component1 = 1;
    private static int copydefault;
    public final RecyclerView recyclerView;

    protected FragmentItemAppsBinding(Object obj, View view, int i, RecyclerView recyclerView) {
        super(obj, view, i);
        this.recyclerView = recyclerView;
    }

    public static FragmentItemAppsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 63;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return inflate(layoutInflater, viewGroup, z, defaultComponent);
        }
        inflate(layoutInflater, viewGroup, z, defaultComponent);
        throw null;
    }

    @Deprecated
    public static FragmentItemAppsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 1;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        FragmentItemAppsBinding fragmentItemAppsBinding = (FragmentItemAppsBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_item_apps, viewGroup, z, obj);
        if (i3 != 0) {
            int i4 = 81 / 0;
        }
        return fragmentItemAppsBinding;
    }

    public static FragmentItemAppsBinding inflate(LayoutInflater layoutInflater) {
        FragmentItemAppsBinding fragmentItemAppsBindingInflate;
        int i = 2 % 2;
        int i2 = component1 + 107;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            fragmentItemAppsBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            int i3 = 90 / 0;
        } else {
            fragmentItemAppsBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        }
        int i4 = copydefault + 27;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentItemAppsBindingInflate;
    }

    @Deprecated
    public static FragmentItemAppsBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 91;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        FragmentItemAppsBinding fragmentItemAppsBinding = (FragmentItemAppsBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_item_apps, null, false, obj);
        int i4 = copydefault + 19;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentItemAppsBinding;
    }

    public static FragmentItemAppsBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 35;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FragmentItemAppsBinding fragmentItemAppsBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 31;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentItemAppsBindingBind;
    }

    @Deprecated
    public static FragmentItemAppsBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 71;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        FragmentItemAppsBinding fragmentItemAppsBinding = (FragmentItemAppsBinding) bind(obj, view, R.layout.fragment_item_apps);
        if (i3 != 0) {
            int i4 = 59 / 0;
        }
        return fragmentItemAppsBinding;
    }
}
