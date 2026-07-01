package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.common.widget.round.RoundRelativeLayout;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class ItemViewpageChangeSkinBinding extends ViewDataBinding {
    private static int component1 = 1;
    private static int component3;
    public final RoundImageView imageView;
    public final RoundImageView imageViewDefault;
    public final RoundRelativeLayout rlHolder;

    protected ItemViewpageChangeSkinBinding(Object obj, View view, int i, RoundImageView roundImageView, RoundImageView roundImageView2, RoundRelativeLayout roundRelativeLayout) {
        super(obj, view, i);
        this.imageView = roundImageView;
        this.imageViewDefault = roundImageView2;
        this.rlHolder = roundRelativeLayout;
    }

    public static ItemViewpageChangeSkinBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 95;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ItemViewpageChangeSkinBinding itemViewpageChangeSkinBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        if (i3 == 0) {
            int i4 = 61 / 0;
        }
        return itemViewpageChangeSkinBindingInflate;
    }

    @Deprecated
    public static ItemViewpageChangeSkinBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 47;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ItemViewpageChangeSkinBinding itemViewpageChangeSkinBinding = (ItemViewpageChangeSkinBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_viewpage_change_skin, viewGroup, z, obj);
        int i4 = component1 + 91;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return itemViewpageChangeSkinBinding;
    }

    public static ItemViewpageChangeSkinBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 49;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemViewpageChangeSkinBinding itemViewpageChangeSkinBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 101;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return itemViewpageChangeSkinBindingInflate;
    }

    @Deprecated
    public static ItemViewpageChangeSkinBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = component1 + 93;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            i = R.layout.item_viewpage_change_skin;
            z = true;
        } else {
            i = R.layout.item_viewpage_change_skin;
            z = false;
        }
        return (ItemViewpageChangeSkinBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
    }

    public static ItemViewpageChangeSkinBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 71;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemViewpageChangeSkinBinding itemViewpageChangeSkinBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 13;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return itemViewpageChangeSkinBindingBind;
    }

    @Deprecated
    public static ItemViewpageChangeSkinBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 111;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ItemViewpageChangeSkinBinding itemViewpageChangeSkinBinding = (ItemViewpageChangeSkinBinding) bind(obj, view, R.layout.item_viewpage_change_skin);
        if (i3 == 0) {
            int i4 = 34 / 0;
        }
        return itemViewpageChangeSkinBinding;
    }
}
