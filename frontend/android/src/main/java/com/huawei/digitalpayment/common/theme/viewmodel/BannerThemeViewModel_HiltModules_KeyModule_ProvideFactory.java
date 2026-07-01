package com.huawei.digitalpayment.common.theme.viewmodel;

import com.huawei.digitalpayment.common.theme.viewmodel.BannerThemeViewModel_HiltModules;
import dagger.internal.Factory;

public final class BannerThemeViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int ShareDataUIState = 1;
    private static int copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = copydefault + 27;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        int i4 = ShareDataUIState + 25;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 125;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        if (i3 != 0) {
            int i4 = 63 / 0;
        }
        return boolValueOf;
    }

    public static BannerThemeViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = copydefault + 21;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        BannerThemeViewModel_HiltModules_KeyModule_ProvideFactory bannerThemeViewModel_HiltModules_KeyModule_ProvideFactory = component2.copydefault;
        int i4 = ShareDataUIState + 103;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 85 / 0;
        }
        return bannerThemeViewModel_HiltModules_KeyModule_ProvideFactory;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 107;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = BannerThemeViewModel_HiltModules.KeyModule.provide();
        int i4 = copydefault + 79;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return zProvide;
    }

    static final class component2 {
        private static int ShareDataUIState = 1;
        private static int component2;
        static final BannerThemeViewModel_HiltModules_KeyModule_ProvideFactory copydefault = new BannerThemeViewModel_HiltModules_KeyModule_ProvideFactory();

        private component2() {
        }

        static {
            int i = ShareDataUIState + 87;
            component2 = i % 128;
            int i2 = i % 2;
        }
    }
}
