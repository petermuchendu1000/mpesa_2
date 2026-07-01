package com.huawei.digitalpayment.common.theme.model;

import dagger.internal.Factory;

public final class TipsThemeModel_Factory implements Factory<TipsThemeModel> {
    private static int component2 = 0;
    private static int copydefault = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = copydefault + 89;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return get();
        }
        get();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public TipsThemeModel get() {
        int i = 2 % 2;
        int i2 = copydefault + 53;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            newInstance();
            throw null;
        }
        TipsThemeModel tipsThemeModelNewInstance = newInstance();
        int i3 = copydefault + 71;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return tipsThemeModelNewInstance;
    }

    public static TipsThemeModel_Factory create() {
        int i = 2 % 2;
        int i2 = component2 + 111;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        TipsThemeModel_Factory tipsThemeModel_Factory = copydefault.component3;
        int i4 = component2 + 43;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return tipsThemeModel_Factory;
    }

    public static TipsThemeModel newInstance() {
        int i = 2 % 2;
        TipsThemeModel tipsThemeModel = new TipsThemeModel();
        int i2 = copydefault + 33;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return tipsThemeModel;
    }

    static final class copydefault {
        private static int component1 = 0;
        private static int component2 = 1;
        static final TipsThemeModel_Factory component3 = new TipsThemeModel_Factory();

        private copydefault() {
        }

        static {
            int i = component2 + 1;
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
