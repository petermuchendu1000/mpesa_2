package com.huawei.digitalpayment.consumer.loginModule.mpin.model;

import dagger.internal.Factory;

public final class DefaultBaseQuestionModel_Factory implements Factory<DefaultBaseQuestionModel> {
    private static int component2 = 1;
    private static int copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 85;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DefaultBaseQuestionModel defaultBaseQuestionModel = get();
        if (i3 != 0) {
            int i4 = 7 / 0;
        }
        return defaultBaseQuestionModel;
    }

    @Override
    public DefaultBaseQuestionModel get() {
        int i = 2 % 2;
        int i2 = component2 + 27;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DefaultBaseQuestionModel defaultBaseQuestionModelNewInstance = newInstance();
        int i4 = component2 + 121;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return defaultBaseQuestionModelNewInstance;
        }
        throw null;
    }

    public static DefaultBaseQuestionModel_Factory create() {
        int i = 2 % 2;
        int i2 = component2 + 39;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DefaultBaseQuestionModel_Factory defaultBaseQuestionModel_Factory = component2.component1;
        if (i3 == 0) {
            return defaultBaseQuestionModel_Factory;
        }
        throw null;
    }

    public static DefaultBaseQuestionModel newInstance() {
        int i = 2 % 2;
        DefaultBaseQuestionModel defaultBaseQuestionModel = new DefaultBaseQuestionModel();
        int i2 = component2 + 103;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return defaultBaseQuestionModel;
    }

    static final class component2 {
        static final DefaultBaseQuestionModel_Factory component1 = new DefaultBaseQuestionModel_Factory();
        private static int component2 = 1;
        private static int copydefault;

        private component2() {
        }

        static {
            int i = component2 + 31;
            copydefault = i % 128;
            int i2 = i % 2;
        }
    }
}
