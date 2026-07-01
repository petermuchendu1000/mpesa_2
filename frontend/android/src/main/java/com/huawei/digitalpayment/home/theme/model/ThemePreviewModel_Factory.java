package com.huawei.digitalpayment.home.theme.model;

import dagger.internal.Factory;

public final class ThemePreviewModel_Factory implements Factory<ThemePreviewModel> {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 117;
        ShareDataUIState = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            get();
            obj.hashCode();
            throw null;
        }
        ThemePreviewModel themePreviewModel = get();
        int i3 = component3 + 73;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            return themePreviewModel;
        }
        throw null;
    }

    @Override
    public ThemePreviewModel get() {
        int i = 2 % 2;
        int i2 = component3 + 83;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            newInstance();
            throw null;
        }
        ThemePreviewModel themePreviewModelNewInstance = newInstance();
        int i3 = component3 + 75;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return themePreviewModelNewInstance;
    }

    public static ThemePreviewModel_Factory create() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 81;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ThemePreviewModel_Factory themePreviewModel_Factory = component3.copydefault;
        if (i3 == 0) {
            int i4 = 84 / 0;
        }
        return themePreviewModel_Factory;
    }

    public static ThemePreviewModel newInstance() {
        int i = 2 % 2;
        ThemePreviewModel themePreviewModel = new ThemePreviewModel();
        int i2 = component3 + 23;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return themePreviewModel;
    }

    static final class component3 {
        private static int component2 = 0;
        private static int component3 = 1;
        static final ThemePreviewModel_Factory copydefault = new ThemePreviewModel_Factory();

        private component3() {
        }

        static {
            int i = component3 + 65;
            component2 = i % 128;
            int i2 = i % 2;
        }
    }
}
