package com.huawei.digitalpayment.common.theme.model;

import dagger.internal.Factory;

public final class LogoutModel_Factory implements Factory<LogoutModel> {
    private static int component2 = 0;
    private static int copydefault = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = copydefault + 43;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        LogoutModel logoutModel = get();
        int i4 = component2 + 87;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return logoutModel;
    }

    @Override
    public LogoutModel get() {
        int i = 2 % 2;
        int i2 = copydefault + 115;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        LogoutModel logoutModelNewInstance = newInstance();
        int i4 = component2 + 67;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return logoutModelNewInstance;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static LogoutModel_Factory create() {
        int i = 2 % 2;
        int i2 = copydefault + 11;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        LogoutModel_Factory logoutModel_Factory = ShareDataUIState.component3;
        if (i3 == 0) {
            return logoutModel_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static LogoutModel newInstance() {
        int i = 2 % 2;
        LogoutModel logoutModel = new LogoutModel();
        int i2 = copydefault + 21;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 31 / 0;
        }
        return logoutModel;
    }

    static final class ShareDataUIState {
        private static int ShareDataUIState = 1;
        private static int component2;
        static final LogoutModel_Factory component3 = new LogoutModel_Factory();

        private ShareDataUIState() {
        }

        static {
            int i = component2 + 37;
            ShareDataUIState = i % 128;
            int i2 = i % 2;
        }
    }
}
