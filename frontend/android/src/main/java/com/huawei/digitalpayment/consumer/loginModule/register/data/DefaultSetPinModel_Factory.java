package com.huawei.digitalpayment.consumer.loginModule.register.data;

import dagger.internal.Factory;

public final class DefaultSetPinModel_Factory implements Factory<DefaultSetPinModel> {
    private static int component2 = 0;
    private static int component3 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 119;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        DefaultSetPinModel defaultSetPinModel = get();
        int i4 = component2 + 13;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 14 / 0;
        }
        return defaultSetPinModel;
    }

    @Override
    public DefaultSetPinModel get() {
        int i = 2 % 2;
        int i2 = component2 + 9;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DefaultSetPinModel defaultSetPinModelNewInstance = newInstance();
        if (i3 == 0) {
            int i4 = 59 / 0;
        }
        return defaultSetPinModelNewInstance;
    }

    public static DefaultSetPinModel_Factory create() {
        int i = 2 % 2;
        int i2 = component3 + 1;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        DefaultSetPinModel_Factory defaultSetPinModel_Factory = ShareDataUIState.component1;
        int i4 = component3 + 33;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return defaultSetPinModel_Factory;
        }
        throw null;
    }

    public static DefaultSetPinModel newInstance() {
        int i = 2 % 2;
        DefaultSetPinModel defaultSetPinModel = new DefaultSetPinModel();
        int i2 = component2 + 31;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 44 / 0;
        }
        return defaultSetPinModel;
    }

    static final class ShareDataUIState {
        static final DefaultSetPinModel_Factory component1 = new DefaultSetPinModel_Factory();
        private static int component2 = 0;
        private static int copydefault = 1;

        private ShareDataUIState() {
        }

        static {
            int i = copydefault + 121;
            component2 = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
