package com.huawei.digitalpayment.consumer.loginModule.login.data;

import dagger.internal.Factory;

public final class DefaultOtpLoginModel_Factory implements Factory<DefaultOtpLoginModel> {
    private static int component1 = 0;
    private static int component3 = 1;

    @Override
    public Object get() {
        DefaultOtpLoginModel defaultOtpLoginModel;
        int i = 2 % 2;
        int i2 = component1 + 121;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            defaultOtpLoginModel = get();
            int i3 = 96 / 0;
        } else {
            defaultOtpLoginModel = get();
        }
        int i4 = component3 + 45;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return defaultOtpLoginModel;
    }

    @Override
    public DefaultOtpLoginModel get() {
        int i = 2 % 2;
        int i2 = component1 + 37;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DefaultOtpLoginModel defaultOtpLoginModelNewInstance = newInstance();
        int i4 = component1 + 65;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return defaultOtpLoginModelNewInstance;
    }

    public static DefaultOtpLoginModel_Factory create() {
        int i = 2 % 2;
        int i2 = component3 + 53;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            DefaultOtpLoginModel_Factory defaultOtpLoginModel_Factory = component3.ShareDataUIState;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        DefaultOtpLoginModel_Factory defaultOtpLoginModel_Factory2 = component3.ShareDataUIState;
        int i3 = component3 + 1;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return defaultOtpLoginModel_Factory2;
    }

    public static DefaultOtpLoginModel newInstance() {
        int i = 2 % 2;
        DefaultOtpLoginModel defaultOtpLoginModel = new DefaultOtpLoginModel();
        int i2 = component3 + 81;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return defaultOtpLoginModel;
    }

    static final class component3 {
        static final DefaultOtpLoginModel_Factory ShareDataUIState = new DefaultOtpLoginModel_Factory();
        private static int component2 = 0;
        private static int component3 = 1;

        private component3() {
        }

        static {
            int i = component3 + 3;
            component2 = i % 128;
            if (i % 2 != 0) {
                int i2 = 81 / 0;
            }
        }
    }
}
