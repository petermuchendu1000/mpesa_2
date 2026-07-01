package com.huawei.digitalpayment.consumer.basicUi.model;

import dagger.internal.Factory;

public final class LoginSettingModel_Factory implements Factory<LoginSettingModel> {
    private static int component1 = 0;
    private static int copydefault = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = copydefault + 115;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        LoginSettingModel loginSettingModel = get();
        int i4 = component1 + 85;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return loginSettingModel;
    }

    @Override
    public LoginSettingModel get() {
        int i = 2 % 2;
        int i2 = copydefault + 103;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        LoginSettingModel loginSettingModelNewInstance = newInstance();
        int i4 = component1 + 3;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return loginSettingModelNewInstance;
    }

    public static LoginSettingModel_Factory create() {
        int i = 2 % 2;
        int i2 = component1 + 79;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            LoginSettingModel_Factory loginSettingModel_Factory = component1.component2;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        LoginSettingModel_Factory loginSettingModel_Factory2 = component1.component2;
        int i3 = component1 + 7;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return loginSettingModel_Factory2;
    }

    public static LoginSettingModel newInstance() {
        int i = 2 % 2;
        LoginSettingModel loginSettingModel = new LoginSettingModel();
        int i2 = copydefault + 45;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return loginSettingModel;
        }
        throw null;
    }

    static final class component1 {
        private static int component1 = 1;
        static final LoginSettingModel_Factory component2 = new LoginSettingModel_Factory();
        private static int copydefault;

        private component1() {
        }

        static {
            int i = component1 + 29;
            copydefault = i % 128;
            if (i % 2 != 0) {
                int i2 = 12 / 0;
            }
        }
    }
}
