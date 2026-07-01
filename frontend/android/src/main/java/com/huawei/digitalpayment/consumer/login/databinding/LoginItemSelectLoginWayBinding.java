package com.huawei.digitalpayment.consumer.login.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.login.R;

public abstract class LoginItemSelectLoginWayBinding extends ViewDataBinding {
    private static int component2 = 1;
    private static int component3;
    public final ImageView ivSelected;
    public final TextView tvContent;

    protected LoginItemSelectLoginWayBinding(Object obj, View view, int i, ImageView imageView, TextView textView) {
        super(obj, view, i);
        this.ivSelected = imageView;
        this.tvContent = textView;
    }

    public static LoginItemSelectLoginWayBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 125;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        LoginItemSelectLoginWayBinding loginItemSelectLoginWayBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 91;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return loginItemSelectLoginWayBindingInflate;
    }

    @Deprecated
    public static LoginItemSelectLoginWayBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 87;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        LoginItemSelectLoginWayBinding loginItemSelectLoginWayBinding = (LoginItemSelectLoginWayBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.login_item_select_login_way, viewGroup, z, obj);
        int i4 = component2 + 21;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return loginItemSelectLoginWayBinding;
    }

    public static LoginItemSelectLoginWayBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 55;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        LoginItemSelectLoginWayBinding loginItemSelectLoginWayBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 25;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return loginItemSelectLoginWayBindingInflate;
    }

    @Deprecated
    public static LoginItemSelectLoginWayBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = component2 + 53;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            i = R.layout.login_item_select_login_way;
            z = true;
        } else {
            i = R.layout.login_item_select_login_way;
            z = false;
        }
        LoginItemSelectLoginWayBinding loginItemSelectLoginWayBinding = (LoginItemSelectLoginWayBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
        int i4 = component3 + 83;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return loginItemSelectLoginWayBinding;
    }

    public static LoginItemSelectLoginWayBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 91;
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
    public static LoginItemSelectLoginWayBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 59;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingBind = bind(obj, view, R.layout.login_item_select_login_way);
        if (i3 == 0) {
            return (LoginItemSelectLoginWayBinding) viewDataBindingBind;
        }
        throw null;
    }
}
