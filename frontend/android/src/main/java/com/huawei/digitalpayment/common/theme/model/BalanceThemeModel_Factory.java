package com.huawei.digitalpayment.common.theme.model;

import dagger.internal.Factory;

public final class BalanceThemeModel_Factory implements Factory<BalanceThemeModel> {
    private static int component2 = 0;
    private static int component3 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 109;
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
    public BalanceThemeModel get() {
        int i = 2 % 2;
        int i2 = component3 + 51;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            newInstance();
            throw null;
        }
        BalanceThemeModel balanceThemeModelNewInstance = newInstance();
        int i3 = component3 + 71;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            return balanceThemeModelNewInstance;
        }
        throw null;
    }

    public static BalanceThemeModel_Factory create() {
        int i = 2 % 2;
        int i2 = component3 + 41;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        BalanceThemeModel_Factory balanceThemeModel_Factory = ShareDataUIState.component2;
        int i4 = component2 + 21;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 70 / 0;
        }
        return balanceThemeModel_Factory;
    }

    public static BalanceThemeModel newInstance() {
        int i = 2 % 2;
        BalanceThemeModel balanceThemeModel = new BalanceThemeModel();
        int i2 = component2 + 91;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return balanceThemeModel;
    }

    static final class ShareDataUIState {
        static final BalanceThemeModel_Factory component2 = new BalanceThemeModel_Factory();
        private static int component3 = 0;
        private static int copydefault = 1;

        private ShareDataUIState() {
        }

        static {
            int i = component3 + 105;
            copydefault = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }
    }
}
