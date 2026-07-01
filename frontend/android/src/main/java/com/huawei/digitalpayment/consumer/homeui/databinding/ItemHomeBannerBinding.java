package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import com.huawei.common.widget.banner.BannerView;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class ItemHomeBannerBinding extends ViewDataBinding {
    private static int component1 = 1;
    private static int component2;
    public final RoundImageView background;
    public final BannerView bannerView;
    public final FragmentContainerView fcTop;
    public final RoundConstraintLayout root;

    protected ItemHomeBannerBinding(Object obj, View view, int i, RoundImageView roundImageView, BannerView bannerView, FragmentContainerView fragmentContainerView, RoundConstraintLayout roundConstraintLayout) {
        super(obj, view, i);
        this.background = roundImageView;
        this.bannerView = bannerView;
        this.fcTop = fragmentContainerView;
        this.root = roundConstraintLayout;
    }

    public static ItemHomeBannerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 43;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ItemHomeBannerBinding itemHomeBannerBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        if (i3 != 0) {
            int i4 = 66 / 0;
        }
        return itemHomeBannerBindingInflate;
    }

    @Deprecated
    public static ItemHomeBannerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 67;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        ItemHomeBannerBinding itemHomeBannerBinding = (ItemHomeBannerBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_home_banner, viewGroup, z, obj);
        int i3 = component1 + 89;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return itemHomeBannerBinding;
    }

    public static ItemHomeBannerBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 71;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ItemHomeBannerBinding itemHomeBannerBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 103;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return itemHomeBannerBindingInflate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ItemHomeBannerBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 99;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        ItemHomeBannerBinding itemHomeBannerBinding = (ItemHomeBannerBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_home_banner, null, false, obj);
        int i4 = component1 + 85;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return itemHomeBannerBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static ItemHomeBannerBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 3;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ItemHomeBannerBinding itemHomeBannerBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = component1 + 125;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return itemHomeBannerBindingBind;
    }

    @Deprecated
    public static ItemHomeBannerBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 1;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ItemHomeBannerBinding itemHomeBannerBinding = (ItemHomeBannerBinding) bind(obj, view, R.layout.item_home_banner);
        int i4 = component2 + 37;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return itemHomeBannerBinding;
    }
}
