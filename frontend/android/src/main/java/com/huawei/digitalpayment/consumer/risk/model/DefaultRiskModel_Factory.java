package com.huawei.digitalpayment.consumer.risk.model;

import dagger.internal.Factory;

public final class DefaultRiskModel_Factory implements Factory<DefaultRiskModel> {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 43;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            get();
            throw null;
        }
        DefaultRiskModel defaultRiskModel = get();
        int i3 = ShareDataUIState + 71;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 73 / 0;
        }
        return defaultRiskModel;
    }

    @Override
    public DefaultRiskModel get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 97;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        DefaultRiskModel defaultRiskModelNewInstance = newInstance();
        int i4 = ShareDataUIState + 101;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return defaultRiskModelNewInstance;
        }
        throw null;
    }

    public static DefaultRiskModel_Factory create() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 1;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        DefaultRiskModel_Factory defaultRiskModel_Factory = component3.copydefault;
        if (i3 != 0) {
            return defaultRiskModel_Factory;
        }
        throw null;
    }

    public static DefaultRiskModel newInstance() {
        int i = 2 % 2;
        DefaultRiskModel defaultRiskModel = new DefaultRiskModel();
        int i2 = component2 + 83;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return defaultRiskModel;
        }
        throw null;
    }

    static final class component3 {
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        static final DefaultRiskModel_Factory copydefault = new DefaultRiskModel_Factory();

        private component3() {
        }

        static {
            int i = ShareDataUIState + 57;
            component1 = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }
    }
}
