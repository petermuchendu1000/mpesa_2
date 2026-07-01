package com.huawei.digitalpayment.consumer.loginModule.register.data;

import dagger.internal.Factory;

public final class DefaultActiveConsumerModel_Factory implements Factory<DefaultActiveConsumerModel> {
    private static int component1 = 0;
    private static int component2 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 87;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            get();
            throw null;
        }
        DefaultActiveConsumerModel defaultActiveConsumerModel = get();
        int i3 = component1 + 9;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return defaultActiveConsumerModel;
    }

    @Override
    public DefaultActiveConsumerModel get() {
        int i = 2 % 2;
        int i2 = component2 + 125;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DefaultActiveConsumerModel defaultActiveConsumerModelNewInstance = newInstance();
        if (i3 != 0) {
            int i4 = 79 / 0;
        }
        return defaultActiveConsumerModelNewInstance;
    }

    public static DefaultActiveConsumerModel_Factory create() {
        int i = 2 % 2;
        int i2 = component1 + 23;
        component2 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            DefaultActiveConsumerModel_Factory defaultActiveConsumerModel_Factory = component1.component3;
            obj.hashCode();
            throw null;
        }
        DefaultActiveConsumerModel_Factory defaultActiveConsumerModel_Factory2 = component1.component3;
        int i3 = component2 + 59;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            return defaultActiveConsumerModel_Factory2;
        }
        throw null;
    }

    public static DefaultActiveConsumerModel newInstance() {
        int i = 2 % 2;
        DefaultActiveConsumerModel defaultActiveConsumerModel = new DefaultActiveConsumerModel();
        int i2 = component2 + 49;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return defaultActiveConsumerModel;
    }

    static final class component1 {
        private static int ShareDataUIState = 1;
        static final DefaultActiveConsumerModel_Factory component3 = new DefaultActiveConsumerModel_Factory();
        private static int copydefault;

        private component1() {
        }

        static {
            int i = ShareDataUIState + 93;
            copydefault = i % 128;
            int i2 = i % 2;
        }
    }
}
