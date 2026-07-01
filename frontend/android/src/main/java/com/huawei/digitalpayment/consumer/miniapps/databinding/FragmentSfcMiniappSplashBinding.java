package com.huawei.digitalpayment.consumer.miniapps.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.miniapps.R;

public abstract class FragmentSfcMiniappSplashBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int component2;
    public final ComposeView composeView;

    protected FragmentSfcMiniappSplashBinding(Object obj, View view, int i, ComposeView composeView) {
        super(obj, view, i);
        this.composeView = composeView;
    }

    public static FragmentSfcMiniappSplashBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 27;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcMiniappSplashBinding fragmentSfcMiniappSplashBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 47;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return fragmentSfcMiniappSplashBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static FragmentSfcMiniappSplashBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 105;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcMiniappSplashBinding fragmentSfcMiniappSplashBinding = (FragmentSfcMiniappSplashBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_sfc_miniapp_splash, viewGroup, z, obj);
        if (i3 != 0) {
            return fragmentSfcMiniappSplashBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static FragmentSfcMiniappSplashBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 53;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        FragmentSfcMiniappSplashBinding fragmentSfcMiniappSplashBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = component2 + 29;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 2 / 0;
        }
        return fragmentSfcMiniappSplashBindingInflate;
    }

    @Deprecated
    public static FragmentSfcMiniappSplashBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 121;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return (FragmentSfcMiniappSplashBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_sfc_miniapp_splash, null, false, obj);
    }

    public static FragmentSfcMiniappSplashBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 81;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcMiniappSplashBinding fragmentSfcMiniappSplashBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 21;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return fragmentSfcMiniappSplashBindingBind;
        }
        throw null;
    }

    @Deprecated
    public static FragmentSfcMiniappSplashBinding bind(View view, Object obj) {
        FragmentSfcMiniappSplashBinding fragmentSfcMiniappSplashBinding;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 67;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            fragmentSfcMiniappSplashBinding = (FragmentSfcMiniappSplashBinding) bind(obj, view, R.layout.fragment_sfc_miniapp_splash);
            int i3 = 97 / 0;
        } else {
            fragmentSfcMiniappSplashBinding = (FragmentSfcMiniappSplashBinding) bind(obj, view, R.layout.fragment_sfc_miniapp_splash);
        }
        int i4 = component2 + 103;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 93 / 0;
        }
        return fragmentSfcMiniappSplashBinding;
    }
}
