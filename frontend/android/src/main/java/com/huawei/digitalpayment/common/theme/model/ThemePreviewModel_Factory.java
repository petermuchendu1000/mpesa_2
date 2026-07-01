package com.huawei.digitalpayment.common.theme.model;

import dagger.internal.Factory;

public final class ThemePreviewModel_Factory implements Factory<ThemePreviewModel> {
    private static int component1 = 1;
    private static int component2;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 13;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ThemePreviewModel themePreviewModel = get();
        int i4 = component2 + 3;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return themePreviewModel;
    }

    @Override
    public ThemePreviewModel get() {
        int i = 2 % 2;
        int i2 = component1 + 63;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ThemePreviewModel themePreviewModelNewInstance = newInstance();
        int i4 = component2 + 77;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 99 / 0;
        }
        return themePreviewModelNewInstance;
    }

    public static ThemePreviewModel_Factory create() {
        int i = 2 % 2;
        int i2 = component2 + 105;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ThemePreviewModel_Factory themePreviewModel_Factory = component2.ShareDataUIState;
        int i4 = component1 + 95;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 11 / 0;
        }
        return themePreviewModel_Factory;
    }

    public static ThemePreviewModel newInstance() {
        int i = 2 % 2;
        ThemePreviewModel themePreviewModel = new ThemePreviewModel();
        int i2 = component2 + 29;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return themePreviewModel;
    }

    static final class component2 {
        static final ThemePreviewModel_Factory ShareDataUIState = new ThemePreviewModel_Factory();
        private static int component2 = 0;
        private static int copydefault = 1;

        private component2() {
        }

        static {
            int i = component2 + 125;
            copydefault = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }
    }
}
