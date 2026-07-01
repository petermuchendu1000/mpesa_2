package com.huawei.digitalpayment.consumer.loginModule.register.data;

import dagger.internal.Factory;

public final class DefaultResetOtpModel_Factory implements Factory<DefaultResetOtpModel> {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 21;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DefaultResetOtpModel defaultResetOtpModel = get();
        int i4 = ShareDataUIState + 23;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return defaultResetOtpModel;
        }
        throw null;
    }

    @Override
    public DefaultResetOtpModel get() {
        int i = 2 % 2;
        int i2 = component2 + 43;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DefaultResetOtpModel defaultResetOtpModelNewInstance = newInstance();
        int i4 = ShareDataUIState + 39;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return defaultResetOtpModelNewInstance;
    }

    public static DefaultResetOtpModel_Factory create() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 121;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        DefaultResetOtpModel_Factory defaultResetOtpModel_Factory = copydefault.ShareDataUIState;
        int i4 = ShareDataUIState + 23;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return defaultResetOtpModel_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static DefaultResetOtpModel newInstance() {
        int i = 2 % 2;
        DefaultResetOtpModel defaultResetOtpModel = new DefaultResetOtpModel();
        int i2 = component2 + 71;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return defaultResetOtpModel;
        }
        throw null;
    }

    static final class copydefault {
        static final DefaultResetOtpModel_Factory ShareDataUIState = new DefaultResetOtpModel_Factory();
        private static int component1 = 0;
        private static int component3 = 1;

        private copydefault() {
        }

        static {
            int i = component1 + 109;
            component3 = i % 128;
            int i2 = i % 2;
        }
    }
}
