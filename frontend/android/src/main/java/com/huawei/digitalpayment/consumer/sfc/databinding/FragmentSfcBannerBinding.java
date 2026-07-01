package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.banner.BannerView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class FragmentSfcBannerBinding extends ViewDataBinding {
    private static int component1 = 0;
    private static int component3 = 1;
    public final BannerView bannerView;
    public final TextView tvTitle;

    protected FragmentSfcBannerBinding(Object obj, View view, int i, BannerView bannerView, TextView textView) {
        super(obj, view, i);
        this.bannerView = bannerView;
        this.tvTitle = textView;
    }

    public static FragmentSfcBannerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 67;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcBannerBinding fragmentSfcBannerBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        if (i3 == 0) {
            int i4 = 13 / 0;
        }
        return fragmentSfcBannerBindingInflate;
    }

    @Deprecated
    public static FragmentSfcBannerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 19;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcBannerBinding fragmentSfcBannerBinding = (FragmentSfcBannerBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_sfc_banner, viewGroup, z, obj);
        if (i3 != 0) {
            return fragmentSfcBannerBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static FragmentSfcBannerBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 89;
        component3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            obj.hashCode();
            throw null;
        }
        FragmentSfcBannerBinding fragmentSfcBannerBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = component1 + 75;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            return fragmentSfcBannerBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static FragmentSfcBannerBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 105;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        FragmentSfcBannerBinding fragmentSfcBannerBinding = (FragmentSfcBannerBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_sfc_banner, null, false, obj);
        int i4 = component3 + 59;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return fragmentSfcBannerBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static FragmentSfcBannerBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 13;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcBannerBinding fragmentSfcBannerBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 81;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 21 / 0;
        }
        return fragmentSfcBannerBindingBind;
    }

    @Deprecated
    public static FragmentSfcBannerBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 105;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcBannerBinding fragmentSfcBannerBinding = (FragmentSfcBannerBinding) bind(obj, view, R.layout.fragment_sfc_banner);
        int i4 = component3 + 3;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return fragmentSfcBannerBinding;
        }
        throw null;
    }
}
