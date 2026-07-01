package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.item.CommonItemView;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class ItemMyFunctionBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int component2;
    public final RoundImageView background;
    public final CommonItemView itemView;

    protected ItemMyFunctionBinding(Object obj, View view, int i, RoundImageView roundImageView, CommonItemView commonItemView) {
        super(obj, view, i);
        this.background = roundImageView;
        this.itemView = commonItemView;
    }

    public static ItemMyFunctionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 3;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ItemMyFunctionBinding itemMyFunctionBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = component2 + 7;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return itemMyFunctionBindingInflate;
    }

    @Deprecated
    public static ItemMyFunctionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 33;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        ItemMyFunctionBinding itemMyFunctionBinding = (ItemMyFunctionBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_my_function, viewGroup, z, obj);
        int i3 = ShareDataUIState + 51;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return itemMyFunctionBinding;
    }

    public static ItemMyFunctionBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 67;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ItemMyFunctionBinding itemMyFunctionBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 35;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return itemMyFunctionBindingInflate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ItemMyFunctionBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = component2 + 107;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            i = R.layout.item_my_function;
            z = true;
        } else {
            i = R.layout.item_my_function;
            z = false;
        }
        ItemMyFunctionBinding itemMyFunctionBinding = (ItemMyFunctionBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
        int i4 = component2 + 41;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return itemMyFunctionBinding;
    }

    public static ItemMyFunctionBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 103;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ItemMyFunctionBinding itemMyFunctionBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 123;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return itemMyFunctionBindingBind;
        }
        throw null;
    }

    @Deprecated
    public static ItemMyFunctionBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 103;
        ShareDataUIState = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        ItemMyFunctionBinding itemMyFunctionBinding = (ItemMyFunctionBinding) bind(obj, view, R.layout.item_my_function);
        int i3 = ShareDataUIState + 73;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            return itemMyFunctionBinding;
        }
        throw null;
    }
}
