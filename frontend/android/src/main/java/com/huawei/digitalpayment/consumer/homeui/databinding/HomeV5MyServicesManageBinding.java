package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.round.RoundRecyclerView;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class HomeV5MyServicesManageBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    public final RecyclerView lifeRecycler;
    public final RoundRecyclerView myServiceRecycler;
    public final TextView tvSubTitle;
    public final TextView tvTitle;

    protected HomeV5MyServicesManageBinding(Object obj, View view, int i, RecyclerView recyclerView, RoundRecyclerView roundRecyclerView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.lifeRecycler = recyclerView;
        this.myServiceRecycler = roundRecyclerView;
        this.tvSubTitle = textView;
        this.tvTitle = textView2;
    }

    public static HomeV5MyServicesManageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 35;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        HomeV5MyServicesManageBinding homeV5MyServicesManageBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 93;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return homeV5MyServicesManageBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static HomeV5MyServicesManageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 15;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        HomeV5MyServicesManageBinding homeV5MyServicesManageBinding = (HomeV5MyServicesManageBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.home_v5_my_services_manage, viewGroup, z, obj);
        int i4 = component2 + 113;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return homeV5MyServicesManageBinding;
    }

    public static HomeV5MyServicesManageBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 109;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        HomeV5MyServicesManageBinding homeV5MyServicesManageBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 101;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return homeV5MyServicesManageBindingInflate;
    }

    @Deprecated
    public static HomeV5MyServicesManageBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 29;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        HomeV5MyServicesManageBinding homeV5MyServicesManageBinding = (HomeV5MyServicesManageBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.home_v5_my_services_manage, null, false, obj);
        int i4 = ShareDataUIState + 1;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return homeV5MyServicesManageBinding;
    }

    public static HomeV5MyServicesManageBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 69;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        HomeV5MyServicesManageBinding homeV5MyServicesManageBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        if (i3 == 0) {
            int i4 = 65 / 0;
        }
        return homeV5MyServicesManageBindingBind;
    }

    @Deprecated
    public static HomeV5MyServicesManageBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 23;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        HomeV5MyServicesManageBinding homeV5MyServicesManageBinding = (HomeV5MyServicesManageBinding) bind(obj, view, R.layout.home_v5_my_services_manage);
        int i3 = component2 + 77;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return homeV5MyServicesManageBinding;
    }
}
