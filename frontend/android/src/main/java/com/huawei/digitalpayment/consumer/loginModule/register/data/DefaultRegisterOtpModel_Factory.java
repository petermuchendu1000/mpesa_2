package com.huawei.digitalpayment.consumer.loginModule.register.data;

import dagger.internal.Factory;

public final class DefaultRegisterOtpModel_Factory implements Factory<DefaultRegisterOtpModel> {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 1;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        DefaultRegisterOtpModel defaultRegisterOtpModel = get();
        int i4 = ShareDataUIState + 67;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return defaultRegisterOtpModel;
        }
        throw null;
    }

    @Override
    public DefaultRegisterOtpModel get() {
        int i = 2 % 2;
        int i2 = component2 + 41;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DefaultRegisterOtpModel defaultRegisterOtpModelNewInstance = newInstance();
        int i4 = component2 + 89;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return defaultRegisterOtpModelNewInstance;
    }

    public static DefaultRegisterOtpModel_Factory create() {
        int i = 2 % 2;
        int i2 = component2 + 109;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DefaultRegisterOtpModel_Factory defaultRegisterOtpModel_Factory = component2.component1;
        if (i3 != 0) {
            int i4 = 58 / 0;
        }
        return defaultRegisterOtpModel_Factory;
    }

    public static DefaultRegisterOtpModel newInstance() {
        int i = 2 % 2;
        DefaultRegisterOtpModel defaultRegisterOtpModel = new DefaultRegisterOtpModel();
        int i2 = ShareDataUIState + 39;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 1 / 0;
        }
        return defaultRegisterOtpModel;
    }

    static final class component2 {
        private static int ShareDataUIState = 0;
        static final DefaultRegisterOtpModel_Factory component1 = new DefaultRegisterOtpModel_Factory();
        private static int component2 = 1;

        private component2() {
        }

        static {
            int i = ShareDataUIState + 99;
            component2 = i % 128;
            int i2 = i % 2;
        }
    }
}
