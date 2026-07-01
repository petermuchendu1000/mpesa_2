package com.huawei.digitalpayment.consumer.loginModule.mpin.data;

import dagger.internal.Factory;

public final class DefaultChangePinModel_Factory implements Factory<DefaultChangePinModel> {
    private static int component3 = 1;
    private static int copydefault;

    public static void copydefault() {
    }

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 91;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            get();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        DefaultChangePinModel defaultChangePinModel = get();
        int i3 = component3 + 107;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return defaultChangePinModel;
    }

    @Override
    public DefaultChangePinModel get() {
        int i = 2 % 2;
        int i2 = component3 + 29;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return newInstance();
        }
        newInstance();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static DefaultChangePinModel_Factory create() {
        int i = 2 % 2;
        int i2 = component3 + 69;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DefaultChangePinModel_Factory defaultChangePinModel_Factory = component1.component1;
        int i4 = component3 + 1;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return defaultChangePinModel_Factory;
    }

    public static DefaultChangePinModel newInstance() {
        int i = 2 % 2;
        DefaultChangePinModel defaultChangePinModel = new DefaultChangePinModel();
        int i2 = copydefault + 13;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return defaultChangePinModel;
    }

    static final class component1 {
        static final DefaultChangePinModel_Factory component1 = new DefaultChangePinModel_Factory();
        private static int component2 = 0;
        private static int copydefault = 1;

        private component1() {
        }

        static {
            int i = component2 + 9;
            copydefault = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }
    }
}
