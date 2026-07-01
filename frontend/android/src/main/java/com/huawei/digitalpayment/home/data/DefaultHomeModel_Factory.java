package com.huawei.digitalpayment.home.data;

import dagger.internal.Factory;

public final class DefaultHomeModel_Factory implements Factory<DefaultHomeModel> {
    private static int component2 = 1;
    private static int component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 55;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            get();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        DefaultHomeModel defaultHomeModel = get();
        int i3 = component3 + 37;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return defaultHomeModel;
    }

    @Override
    public DefaultHomeModel get() {
        int i = 2 % 2;
        int i2 = component2 + 75;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DefaultHomeModel defaultHomeModelNewInstance = newInstance();
        if (i3 != 0) {
            int i4 = 24 / 0;
        }
        return defaultHomeModelNewInstance;
    }

    public static DefaultHomeModel_Factory create() {
        int i = 2 % 2;
        int i2 = component2 + 93;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DefaultHomeModel_Factory defaultHomeModel_Factory = copydefault.ShareDataUIState;
        int i4 = component3 + 95;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return defaultHomeModel_Factory;
    }

    public static DefaultHomeModel newInstance() {
        int i = 2 % 2;
        DefaultHomeModel defaultHomeModel = new DefaultHomeModel();
        int i2 = component2 + 45;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return defaultHomeModel;
    }

    static final class copydefault {
        static final DefaultHomeModel_Factory ShareDataUIState = new DefaultHomeModel_Factory();
        private static int component2 = 1;
        private static int copydefault;

        private copydefault() {
        }

        static {
            int i = component2 + 115;
            copydefault = i % 128;
            int i2 = i % 2;
        }
    }
}
