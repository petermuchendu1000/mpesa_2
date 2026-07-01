package com.huawei.digitalpayment.home.viewmodel;

import com.huawei.digitalpayment.home.viewmodel.BannerViewModel_HiltModules;
import dagger.internal.Factory;

public final class BannerViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int ShareDataUIState = 1;
    private static int component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 57;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        int i4 = ShareDataUIState + 119;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 94 / 0;
        }
        return bool;
    }

    @Override
    public Boolean get() {
        Boolean boolValueOf;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 109;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            boolValueOf = Boolean.valueOf(provide());
            int i3 = 52 / 0;
        } else {
            boolValueOf = Boolean.valueOf(provide());
        }
        int i4 = component3 + 35;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }

    public static BannerViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = component3 + 35;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            BannerViewModel_HiltModules_KeyModule_ProvideFactory bannerViewModel_HiltModules_KeyModule_ProvideFactory = copydefault.component1;
            throw null;
        }
        BannerViewModel_HiltModules_KeyModule_ProvideFactory bannerViewModel_HiltModules_KeyModule_ProvideFactory2 = copydefault.component1;
        int i3 = component3 + 3;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return bannerViewModel_HiltModules_KeyModule_ProvideFactory2;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 29;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = BannerViewModel_HiltModules.KeyModule.provide();
        int i4 = component3 + 17;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return zProvide;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class copydefault {
        static final BannerViewModel_HiltModules_KeyModule_ProvideFactory component1 = new BannerViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int component3 = 1;
        private static int copydefault;

        private copydefault() {
        }

        static {
            int i = component3 + 33;
            copydefault = i % 128;
            int i2 = i % 2;
        }
    }
}
