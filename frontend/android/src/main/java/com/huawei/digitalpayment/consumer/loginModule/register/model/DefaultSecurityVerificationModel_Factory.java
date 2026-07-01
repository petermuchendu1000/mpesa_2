package com.huawei.digitalpayment.consumer.loginModule.register.model;

import dagger.internal.Factory;

public final class DefaultSecurityVerificationModel_Factory implements Factory<DefaultSecurityVerificationModel> {
    private static int component1 = 1;
    private static int component2;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 41;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DefaultSecurityVerificationModel defaultSecurityVerificationModel = get();
        int i4 = component1 + 83;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return defaultSecurityVerificationModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public DefaultSecurityVerificationModel get() {
        DefaultSecurityVerificationModel defaultSecurityVerificationModelNewInstance;
        int i = 2 % 2;
        int i2 = component1 + 33;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            defaultSecurityVerificationModelNewInstance = newInstance();
            int i3 = 8 / 0;
        } else {
            defaultSecurityVerificationModelNewInstance = newInstance();
        }
        int i4 = component2 + 35;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return defaultSecurityVerificationModelNewInstance;
    }

    public static DefaultSecurityVerificationModel_Factory create() {
        int i = 2 % 2;
        int i2 = component1 + 75;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        DefaultSecurityVerificationModel_Factory defaultSecurityVerificationModel_Factory = component2.component2;
        int i4 = component1 + 53;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return defaultSecurityVerificationModel_Factory;
    }

    public static DefaultSecurityVerificationModel newInstance() {
        int i = 2 % 2;
        DefaultSecurityVerificationModel defaultSecurityVerificationModel = new DefaultSecurityVerificationModel();
        int i2 = component1 + 57;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return defaultSecurityVerificationModel;
    }

    static final class component2 {
        private static int component1 = 1;
        static final DefaultSecurityVerificationModel_Factory component2 = new DefaultSecurityVerificationModel_Factory();
        private static int copydefault;

        private component2() {
        }

        static {
            int i = component1 + 107;
            copydefault = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
