package com.huawei.digitalpayment.consumer.loginModule.mpin.model;

import dagger.internal.Factory;

public final class DefaultSecurityQuestionModel_Factory implements Factory<DefaultSecurityQuestionModel> {
    private static int component1 = 0;
    private static int copydefault = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component1 + 79;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            get();
            throw null;
        }
        DefaultSecurityQuestionModel defaultSecurityQuestionModel = get();
        int i3 = copydefault + 103;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return defaultSecurityQuestionModel;
    }

    @Override
    public DefaultSecurityQuestionModel get() {
        int i = 2 % 2;
        int i2 = copydefault + 71;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DefaultSecurityQuestionModel defaultSecurityQuestionModelNewInstance = newInstance();
        int i4 = component1 + 19;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return defaultSecurityQuestionModelNewInstance;
        }
        throw null;
    }

    public static DefaultSecurityQuestionModel_Factory create() {
        int i = 2 % 2;
        int i2 = copydefault + 95;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DefaultSecurityQuestionModel_Factory defaultSecurityQuestionModel_Factory = ShareDataUIState.component1;
        int i4 = component1 + 45;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 82 / 0;
        }
        return defaultSecurityQuestionModel_Factory;
    }

    public static DefaultSecurityQuestionModel newInstance() {
        int i = 2 % 2;
        DefaultSecurityQuestionModel defaultSecurityQuestionModel = new DefaultSecurityQuestionModel();
        int i2 = component1 + 19;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 41 / 0;
        }
        return defaultSecurityQuestionModel;
    }

    static final class ShareDataUIState {
        static final DefaultSecurityQuestionModel_Factory component1 = new DefaultSecurityQuestionModel_Factory();
        private static int component3 = 1;
        private static int copydefault;

        private ShareDataUIState() {
        }

        static {
            int i = component3 + 35;
            copydefault = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }
    }
}
