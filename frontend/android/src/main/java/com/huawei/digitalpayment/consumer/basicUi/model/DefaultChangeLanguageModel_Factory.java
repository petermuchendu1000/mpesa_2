package com.huawei.digitalpayment.consumer.basicUi.model;

import dagger.internal.Factory;

public final class DefaultChangeLanguageModel_Factory implements Factory<DefaultChangeLanguageModel> {
    private static int ShareDataUIState = 1;
    private static int copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 73;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DefaultChangeLanguageModel defaultChangeLanguageModel = get();
        int i4 = copydefault + 17;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return defaultChangeLanguageModel;
    }

    @Override
    public DefaultChangeLanguageModel get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 81;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            newInstance();
            throw null;
        }
        DefaultChangeLanguageModel defaultChangeLanguageModelNewInstance = newInstance();
        int i3 = ShareDataUIState + 19;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 93 / 0;
        }
        return defaultChangeLanguageModelNewInstance;
    }

    public static DefaultChangeLanguageModel_Factory create() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 91;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DefaultChangeLanguageModel_Factory defaultChangeLanguageModel_Factory = copydefault.component3;
        if (i3 != 0) {
            int i4 = 66 / 0;
        }
        return defaultChangeLanguageModel_Factory;
    }

    public static DefaultChangeLanguageModel newInstance() {
        int i = 2 % 2;
        DefaultChangeLanguageModel defaultChangeLanguageModel = new DefaultChangeLanguageModel();
        int i2 = copydefault + 27;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return defaultChangeLanguageModel;
    }

    static final class copydefault {
        private static int component2 = 0;
        static final DefaultChangeLanguageModel_Factory component3 = new DefaultChangeLanguageModel_Factory();
        private static int copydefault = 1;

        private copydefault() {
        }

        static {
            int i = component2 + 61;
            copydefault = i % 128;
            int i2 = i % 2;
        }
    }
}
