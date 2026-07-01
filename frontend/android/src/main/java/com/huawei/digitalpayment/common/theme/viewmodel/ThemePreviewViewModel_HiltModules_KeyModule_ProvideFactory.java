package com.huawei.digitalpayment.common.theme.viewmodel;

import com.huawei.digitalpayment.common.theme.viewmodel.ThemePreviewViewModel_HiltModules;
import dagger.internal.Factory;

public final class ThemePreviewViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 123;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        int i4 = ShareDataUIState + 103;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = copydefault + 45;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i4 = copydefault + 39;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }

    public static ThemePreviewViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 89;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ThemePreviewViewModel_HiltModules_KeyModule_ProvideFactory themePreviewViewModel_HiltModules_KeyModule_ProvideFactory = component2.ShareDataUIState;
        int i4 = ShareDataUIState + 67;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return themePreviewViewModel_HiltModules_KeyModule_ProvideFactory;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 87;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = ThemePreviewViewModel_HiltModules.KeyModule.provide();
        int i4 = copydefault + 95;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return zProvide;
    }

    static final class component2 {
        static final ThemePreviewViewModel_HiltModules_KeyModule_ProvideFactory ShareDataUIState = new ThemePreviewViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int component2 = 1;
        private static int component3;

        private component2() {
        }

        static {
            int i = component2 + 65;
            component3 = i % 128;
            int i2 = i % 2;
        }
    }
}
