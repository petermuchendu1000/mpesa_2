package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class HomeV5ItemMyServicesBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int component1;
    public final ImageView ivAdd;
    public final ImageView ivFunctionIcon;
    public final View topLine;
    public final TextView tvFunctionName;

    protected HomeV5ItemMyServicesBinding(Object obj, View view, int i, ImageView imageView, ImageView imageView2, View view2, TextView textView) {
        super(obj, view, i);
        this.ivAdd = imageView;
        this.ivFunctionIcon = imageView2;
        this.topLine = view2;
        this.tvFunctionName = textView;
    }

    public static HomeV5ItemMyServicesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 89;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        HomeV5ItemMyServicesBinding homeV5ItemMyServicesBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 93;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return homeV5ItemMyServicesBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static HomeV5ItemMyServicesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 57;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        HomeV5ItemMyServicesBinding homeV5ItemMyServicesBinding = (HomeV5ItemMyServicesBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.home_v5_item_my_services, viewGroup, z, obj);
        int i4 = ShareDataUIState + 121;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return homeV5ItemMyServicesBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static HomeV5ItemMyServicesBinding inflate(LayoutInflater layoutInflater) {
        HomeV5ItemMyServicesBinding homeV5ItemMyServicesBindingInflate;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 95;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            homeV5ItemMyServicesBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            int i3 = 52 / 0;
        } else {
            homeV5ItemMyServicesBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        }
        int i4 = ShareDataUIState + 17;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return homeV5ItemMyServicesBindingInflate;
    }

    @Deprecated
    public static HomeV5ItemMyServicesBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 47;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        HomeV5ItemMyServicesBinding homeV5ItemMyServicesBinding = (HomeV5ItemMyServicesBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.home_v5_item_my_services, null, false, obj);
        int i4 = ShareDataUIState + 55;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return homeV5ItemMyServicesBinding;
    }

    public static HomeV5ItemMyServicesBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 89;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        HomeV5ItemMyServicesBinding homeV5ItemMyServicesBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 95;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return homeV5ItemMyServicesBindingBind;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static HomeV5ItemMyServicesBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 11;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        HomeV5ItemMyServicesBinding homeV5ItemMyServicesBinding = (HomeV5ItemMyServicesBinding) bind(obj, view, R.layout.home_v5_item_my_services);
        int i4 = component1 + 75;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 61 / 0;
        }
        return homeV5ItemMyServicesBinding;
    }
}
