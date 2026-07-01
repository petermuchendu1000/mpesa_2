package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ItemBundleFavBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    public final RoundImageView ivAvatar;
    public final TextView tvName;

    protected ItemBundleFavBinding(Object obj, View view, int i, RoundImageView roundImageView, TextView textView) {
        super(obj, view, i);
        this.ivAvatar = roundImageView;
        this.tvName = textView;
    }

    public static ItemBundleFavBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 49;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ItemBundleFavBinding itemBundleFavBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 59;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 32 / 0;
        }
        return itemBundleFavBindingInflate;
    }

    @Deprecated
    public static ItemBundleFavBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 101;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingInflateInternal = ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_bundle_fav, viewGroup, z, obj);
        if (i3 != 0) {
            return (ItemBundleFavBinding) viewDataBindingInflateInternal;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static ItemBundleFavBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 17;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return inflate(layoutInflater, defaultComponent);
        }
        inflate(layoutInflater, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ItemBundleFavBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 49;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ItemBundleFavBinding itemBundleFavBinding = (ItemBundleFavBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_bundle_fav, null, false, obj);
        int i4 = copydefault + 95;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 96 / 0;
        }
        return itemBundleFavBinding;
    }

    public static ItemBundleFavBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 69;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return bind(view, defaultComponent);
        }
        bind(view, defaultComponent);
        throw null;
    }

    @Deprecated
    public static ItemBundleFavBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 31;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ItemBundleFavBinding itemBundleFavBinding = (ItemBundleFavBinding) bind(obj, view, R.layout.item_bundle_fav);
        if (i3 == 0) {
            return itemBundleFavBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
