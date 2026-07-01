package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class ItemQuickActionGroupBinding extends ViewDataBinding {
    private static int component2 = 0;
    private static int copydefault = 1;
    public final RecyclerView groupFunctionRecycler;
    public final CardView miniAppCard;
    public final RoundConstraintLayout rlRoot;
    public final TextView tvTitle;
    public final View viewMargin;

    protected ItemQuickActionGroupBinding(Object obj, View view, int i, RecyclerView recyclerView, CardView cardView, RoundConstraintLayout roundConstraintLayout, TextView textView, View view2) {
        super(obj, view, i);
        this.groupFunctionRecycler = recyclerView;
        this.miniAppCard = cardView;
        this.rlRoot = roundConstraintLayout;
        this.tvTitle = textView;
        this.viewMargin = view2;
    }

    public static ItemQuickActionGroupBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 71;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ItemQuickActionGroupBinding itemQuickActionGroupBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 59;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return itemQuickActionGroupBindingInflate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ItemQuickActionGroupBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 73;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ItemQuickActionGroupBinding itemQuickActionGroupBinding = (ItemQuickActionGroupBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_quick_action_group, viewGroup, z, obj);
        int i4 = component2 + 107;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return itemQuickActionGroupBinding;
    }

    public static ItemQuickActionGroupBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 77;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ItemQuickActionGroupBinding itemQuickActionGroupBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        if (i3 != 0) {
            int i4 = 96 / 0;
        }
        return itemQuickActionGroupBindingInflate;
    }

    @Deprecated
    public static ItemQuickActionGroupBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 41;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ItemQuickActionGroupBinding itemQuickActionGroupBinding = (ItemQuickActionGroupBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_quick_action_group, null, false, obj);
        int i4 = copydefault + 75;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return itemQuickActionGroupBinding;
    }

    public static ItemQuickActionGroupBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 111;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ItemQuickActionGroupBinding itemQuickActionGroupBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        if (i3 == 0) {
            int i4 = 23 / 0;
        }
        return itemQuickActionGroupBindingBind;
    }

    @Deprecated
    public static ItemQuickActionGroupBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 49;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ItemQuickActionGroupBinding itemQuickActionGroupBinding = (ItemQuickActionGroupBinding) bind(obj, view, R.layout.item_quick_action_group);
        if (i3 == 0) {
            return itemQuickActionGroupBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
