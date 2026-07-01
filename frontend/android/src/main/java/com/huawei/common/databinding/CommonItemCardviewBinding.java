package com.huawei.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.R;
import com.huawei.common.widget.horizontalcard.CommonCardView;

public abstract class CommonItemCardviewBinding extends ViewDataBinding {
    public final CommonCardView cardView;

    protected CommonItemCardviewBinding(Object obj, View view, int i, CommonCardView commonCardView) {
        super(obj, view, i);
        this.cardView = commonCardView;
    }

    public static CommonItemCardviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static CommonItemCardviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (CommonItemCardviewBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.common_item_cardview, viewGroup, z, obj);
    }

    public static CommonItemCardviewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static CommonItemCardviewBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (CommonItemCardviewBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.common_item_cardview, null, false, obj);
    }

    public static CommonItemCardviewBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static CommonItemCardviewBinding bind(View view, Object obj) {
        return (CommonItemCardviewBinding) bind(obj, view, R.layout.common_item_cardview);
    }
}
