package com.huawei.digitalpayment.consumer.qrcode.model;

import dagger.internal.Factory;

public final class DefaultPayCodeModel_Factory implements Factory<DefaultPayCodeModel> {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component1 + 101;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return get();
        }
        get();
        throw null;
    }

    @Override
    public DefaultPayCodeModel get() {
        int i = 2 % 2;
        int i2 = component1 + 59;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DefaultPayCodeModel defaultPayCodeModelNewInstance = newInstance();
        int i4 = ShareDataUIState + 119;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 80 / 0;
        }
        return defaultPayCodeModelNewInstance;
    }

    public static DefaultPayCodeModel_Factory create() {
        int i = 2 % 2;
        int i2 = component1 + 89;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DefaultPayCodeModel_Factory defaultPayCodeModel_Factory = component1.component2;
        int i4 = component1 + 123;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 9 / 0;
        }
        return defaultPayCodeModel_Factory;
    }

    public static DefaultPayCodeModel newInstance() {
        int i = 2 % 2;
        DefaultPayCodeModel defaultPayCodeModel = new DefaultPayCodeModel();
        int i2 = component1 + 29;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return defaultPayCodeModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class component1 {
        private static int ShareDataUIState = 1;
        static final DefaultPayCodeModel_Factory component2 = new DefaultPayCodeModel_Factory();
        private static int component3;

        private component1() {
        }

        static {
            int i = ShareDataUIState + 75;
            component3 = i % 128;
            if (i % 2 != 0) {
                int i2 = 50 / 0;
            }
        }
    }
}
