package com.huawei.digitalpayment.common.theme.model;

import dagger.internal.Factory;

public final class ThemeModel_Factory implements Factory<ThemeModel> {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 117;
        component2 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            get();
            throw null;
        }
        ThemeModel themeModel = get();
        int i3 = component2 + 83;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            return themeModel;
        }
        obj.hashCode();
        throw null;
    }

    @Override
    public ThemeModel get() {
        int i = 2 % 2;
        int i2 = component2 + 19;
        ShareDataUIState = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            newInstance();
            obj.hashCode();
            throw null;
        }
        ThemeModel themeModelNewInstance = newInstance();
        int i3 = ShareDataUIState + 111;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            return themeModelNewInstance;
        }
        obj.hashCode();
        throw null;
    }

    public static ThemeModel_Factory create() {
        int i = 2 % 2;
        int i2 = component2 + 37;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ThemeModel_Factory themeModel_Factory = copydefault.ShareDataUIState;
        int i4 = ShareDataUIState + 27;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return themeModel_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ThemeModel newInstance() {
        int i = 2 % 2;
        ThemeModel themeModel = new ThemeModel();
        int i2 = ShareDataUIState + 5;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return themeModel;
    }

    static final class copydefault {
        static final ThemeModel_Factory ShareDataUIState = new ThemeModel_Factory();
        private static int component1 = 0;
        private static int component2 = 1;

        private copydefault() {
        }

        static {
            int i = component2 + 75;
            component1 = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
