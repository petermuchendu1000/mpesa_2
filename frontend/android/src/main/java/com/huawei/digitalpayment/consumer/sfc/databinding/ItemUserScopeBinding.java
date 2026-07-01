package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ItemUserScopeBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    public final ImageView imgIcon;
    public final TextView tvUserscope;

    protected ItemUserScopeBinding(Object obj, View view, int i, ImageView imageView, TextView textView) {
        super(obj, view, i);
        this.imgIcon = imageView;
        this.tvUserscope = textView;
    }

    public static ItemUserScopeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 27;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ItemUserScopeBinding itemUserScopeBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 55;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 27 / 0;
        }
        return itemUserScopeBindingInflate;
    }

    @Deprecated
    public static ItemUserScopeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 81;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ItemUserScopeBinding itemUserScopeBinding = (ItemUserScopeBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_user_scope, viewGroup, z, obj);
        int i4 = ShareDataUIState + 15;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return itemUserScopeBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static ItemUserScopeBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 105;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return inflate(layoutInflater, defaultComponent);
        }
        inflate(layoutInflater, defaultComponent);
        throw null;
    }

    @Deprecated
    public static ItemUserScopeBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 121;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        ItemUserScopeBinding itemUserScopeBinding = (ItemUserScopeBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_user_scope, null, false, obj);
        int i4 = ShareDataUIState + 37;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return itemUserScopeBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static ItemUserScopeBinding bind(View view) {
        ItemUserScopeBinding itemUserScopeBindingBind;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 103;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            itemUserScopeBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
            int i3 = 71 / 0;
        } else {
            itemUserScopeBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        }
        int i4 = ShareDataUIState + 125;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return itemUserScopeBindingBind;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ItemUserScopeBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 109;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        ItemUserScopeBinding itemUserScopeBinding = (ItemUserScopeBinding) bind(obj, view, R.layout.item_user_scope);
        int i3 = component1 + 119;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 77 / 0;
        }
        return itemUserScopeBinding;
    }
}
