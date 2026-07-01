package com.huawei.digitalpayment.consumer.loginModule.mpin.model;

import dagger.internal.Factory;

public final class DefaultChangePinOtpModel_Factory implements Factory<DefaultChangePinOtpModel> {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 125;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return get();
        }
        get();
        throw null;
    }

    @Override
    public DefaultChangePinOtpModel get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 83;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DefaultChangePinOtpModel defaultChangePinOtpModelNewInstance = newInstance();
        int i4 = ShareDataUIState + 21;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return defaultChangePinOtpModelNewInstance;
    }

    public static DefaultChangePinOtpModel_Factory create() {
        DefaultChangePinOtpModel_Factory defaultChangePinOtpModel_Factory;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 27;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            defaultChangePinOtpModel_Factory = component2.component2;
            int i3 = 34 / 0;
        } else {
            defaultChangePinOtpModel_Factory = component2.component2;
        }
        int i4 = ShareDataUIState + 11;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return defaultChangePinOtpModel_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static DefaultChangePinOtpModel newInstance() {
        int i = 2 % 2;
        DefaultChangePinOtpModel defaultChangePinOtpModel = new DefaultChangePinOtpModel();
        int i2 = ShareDataUIState + 119;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return defaultChangePinOtpModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class component2 {
        private static int component1 = 1;
        static final DefaultChangePinOtpModel_Factory component2 = new DefaultChangePinOtpModel_Factory();
        private static int component3;

        private component2() {
        }

        static {
            int i = component1 + 17;
            component3 = i % 128;
            int i2 = i % 2;
        }
    }
}
