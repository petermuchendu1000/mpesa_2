package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class ItemSearchGroupBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int component1;
    public final RecyclerView groupFunctionRecycler;
    public final ImageView ivArrow;
    public final ImageView ivMarker;
    public final TextView tvTitle;
    public final View vline;

    protected ItemSearchGroupBinding(Object obj, View view, int i, RecyclerView recyclerView, ImageView imageView, ImageView imageView2, TextView textView, View view2) {
        super(obj, view, i);
        this.groupFunctionRecycler = recyclerView;
        this.ivArrow = imageView;
        this.ivMarker = imageView2;
        this.tvTitle = textView;
        this.vline = view2;
    }

    public static ItemSearchGroupBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 79;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ItemSearchGroupBinding itemSearchGroupBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 107;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return itemSearchGroupBindingInflate;
    }

    @Deprecated
    public static ItemSearchGroupBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 81;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ItemSearchGroupBinding itemSearchGroupBinding = (ItemSearchGroupBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_search_group, viewGroup, z, obj);
        int i4 = component1 + 63;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 83 / 0;
        }
        return itemSearchGroupBinding;
    }

    public static ItemSearchGroupBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 115;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ItemSearchGroupBinding itemSearchGroupBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 3;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return itemSearchGroupBindingInflate;
    }

    @Deprecated
    public static ItemSearchGroupBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 69;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        ItemSearchGroupBinding itemSearchGroupBinding = (ItemSearchGroupBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_search_group, null, false, obj);
        int i4 = component1 + 23;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return itemSearchGroupBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static ItemSearchGroupBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 93;
        component1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            obj.hashCode();
            throw null;
        }
        ItemSearchGroupBinding itemSearchGroupBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = ShareDataUIState + 97;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            return itemSearchGroupBindingBind;
        }
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ItemSearchGroupBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 31;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ItemSearchGroupBinding itemSearchGroupBinding = (ItemSearchGroupBinding) bind(obj, view, R.layout.item_search_group);
        int i4 = component1 + 5;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return itemSearchGroupBinding;
    }
}
