package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class ItemSearchBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int component3;
    public final ImageView ivFunctionIcon;
    public final RoundLinearLayout ivMore;
    public final TextView tvFunctionName;

    protected ItemSearchBinding(Object obj, View view, int i, ImageView imageView, RoundLinearLayout roundLinearLayout, TextView textView) {
        super(obj, view, i);
        this.ivFunctionIcon = imageView;
        this.ivMore = roundLinearLayout;
        this.tvFunctionName = textView;
    }

    public static ItemSearchBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        ItemSearchBinding itemSearchBindingInflate;
        int i = 2 % 2;
        int i2 = component3 + 21;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            itemSearchBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            int i3 = 8 / 0;
        } else {
            itemSearchBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        }
        int i4 = ShareDataUIState + 43;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 89 / 0;
        }
        return itemSearchBindingInflate;
    }

    @Deprecated
    public static ItemSearchBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 111;
        component3 = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        ItemSearchBinding itemSearchBinding = (ItemSearchBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_search, viewGroup, z, obj);
        int i3 = component3 + 29;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            return itemSearchBinding;
        }
        throw null;
    }

    public static ItemSearchBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 117;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ItemSearchBinding itemSearchBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = ShareDataUIState + 45;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            return itemSearchBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static ItemSearchBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 95;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        ItemSearchBinding itemSearchBinding = (ItemSearchBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_search, null, false, obj);
        int i4 = ShareDataUIState + 9;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return itemSearchBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static ItemSearchBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 31;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ItemSearchBinding itemSearchBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 81;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return itemSearchBindingBind;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ItemSearchBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 95;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ItemSearchBinding itemSearchBinding = (ItemSearchBinding) bind(obj, view, R.layout.item_search);
        int i4 = component3 + 25;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return itemSearchBinding;
        }
        throw null;
    }
}
