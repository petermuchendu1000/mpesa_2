package com.huawei.digitalpayment.consumer.loginModule.login.data;

import dagger.internal.Factory;

public final class DefaultNewDeviceModel_Factory implements Factory<DefaultNewDeviceModel> {
    private static int component1 = 1;
    private static int component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component1 + 51;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DefaultNewDeviceModel defaultNewDeviceModel = get();
        int i4 = component1 + 39;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return defaultNewDeviceModel;
        }
        throw null;
    }

    @Override
    public DefaultNewDeviceModel get() {
        int i = 2 % 2;
        int i2 = component3 + 29;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DefaultNewDeviceModel defaultNewDeviceModelNewInstance = newInstance();
        int i4 = component3 + 57;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return defaultNewDeviceModelNewInstance;
    }

    public static DefaultNewDeviceModel_Factory create() {
        int i = 2 % 2;
        int i2 = component3 + 1;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DefaultNewDeviceModel_Factory defaultNewDeviceModel_Factory = component2.ShareDataUIState;
        int i4 = component3 + 109;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return defaultNewDeviceModel_Factory;
        }
        throw null;
    }

    public static DefaultNewDeviceModel newInstance() {
        int i = 2 % 2;
        DefaultNewDeviceModel defaultNewDeviceModel = new DefaultNewDeviceModel();
        int i2 = component3 + 79;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 52 / 0;
        }
        return defaultNewDeviceModel;
    }

    static final class component2 {
        static final DefaultNewDeviceModel_Factory ShareDataUIState = new DefaultNewDeviceModel_Factory();
        private static int component2 = 1;
        private static int component3;

        private component2() {
        }

        static {
            int i = component3 + 49;
            component2 = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }
    }
}
