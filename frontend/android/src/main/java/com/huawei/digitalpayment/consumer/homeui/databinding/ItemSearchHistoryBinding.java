package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class ItemSearchHistoryBinding extends ViewDataBinding {
    private static int component2 = 1;
    private static int copydefault;
    public final ImageView ivFunctionIcon;
    public final RoundLinearLayout ivMore;
    public final TextView tvFunctionName;

    protected ItemSearchHistoryBinding(Object obj, View view, int i, ImageView imageView, RoundLinearLayout roundLinearLayout, TextView textView) {
        super(obj, view, i);
        this.ivFunctionIcon = imageView;
        this.ivMore = roundLinearLayout;
        this.tvFunctionName = textView;
    }

    public static ItemSearchHistoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 49;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return inflate(layoutInflater, viewGroup, z, defaultComponent);
        }
        inflate(layoutInflater, viewGroup, z, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ItemSearchHistoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 43;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ItemSearchHistoryBinding itemSearchHistoryBinding = (ItemSearchHistoryBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_search_history, viewGroup, z, obj);
        int i4 = component2 + 11;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return itemSearchHistoryBinding;
        }
        throw null;
    }

    public static ItemSearchHistoryBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 103;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ItemSearchHistoryBinding itemSearchHistoryBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = copydefault + 41;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return itemSearchHistoryBindingInflate;
    }

    @Deprecated
    public static ItemSearchHistoryBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = copydefault + 21;
        component2 = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            i = R.layout.item_search_history;
            z = true;
        } else {
            i = R.layout.item_search_history;
            z = false;
        }
        ItemSearchHistoryBinding itemSearchHistoryBinding = (ItemSearchHistoryBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
        int i4 = copydefault + 111;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return itemSearchHistoryBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static ItemSearchHistoryBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 49;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ItemSearchHistoryBinding itemSearchHistoryBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        if (i3 != 0) {
            int i4 = 72 / 0;
        }
        return itemSearchHistoryBindingBind;
    }

    @Deprecated
    public static ItemSearchHistoryBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 17;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ItemSearchHistoryBinding itemSearchHistoryBinding = (ItemSearchHistoryBinding) bind(obj, view, R.layout.item_search_history);
        int i4 = copydefault + 63;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return itemSearchHistoryBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
