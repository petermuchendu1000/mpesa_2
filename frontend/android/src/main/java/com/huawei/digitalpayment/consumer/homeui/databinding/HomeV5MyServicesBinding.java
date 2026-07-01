package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class HomeV5MyServicesBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    public final RecyclerView lifeRecycler;

    protected HomeV5MyServicesBinding(Object obj, View view, int i, RecyclerView recyclerView) {
        super(obj, view, i);
        this.lifeRecycler = recyclerView;
    }

    public static HomeV5MyServicesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 27;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        HomeV5MyServicesBinding homeV5MyServicesBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 57;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 43 / 0;
        }
        return homeV5MyServicesBindingInflate;
    }

    @Deprecated
    public static HomeV5MyServicesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 111;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        HomeV5MyServicesBinding homeV5MyServicesBinding = (HomeV5MyServicesBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.home_v5_my_services, viewGroup, z, obj);
        int i3 = ShareDataUIState + 23;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            return homeV5MyServicesBinding;
        }
        throw null;
    }

    public static HomeV5MyServicesBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 55;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        HomeV5MyServicesBinding homeV5MyServicesBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 115;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return homeV5MyServicesBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static HomeV5MyServicesBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 51;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        HomeV5MyServicesBinding homeV5MyServicesBinding = (HomeV5MyServicesBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.home_v5_my_services, null, false, obj);
        int i4 = ShareDataUIState + 83;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return homeV5MyServicesBinding;
    }

    public static HomeV5MyServicesBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 31;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        HomeV5MyServicesBinding homeV5MyServicesBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 41;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return homeV5MyServicesBindingBind;
    }

    @Deprecated
    public static HomeV5MyServicesBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 113;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        HomeV5MyServicesBinding homeV5MyServicesBinding = (HomeV5MyServicesBinding) bind(obj, view, R.layout.home_v5_my_services);
        int i4 = copydefault + 79;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 42 / 0;
        }
        return homeV5MyServicesBinding;
    }
}
