package com.huawei.digitalpayment.consumer.loginModule.register.data;

import dagger.internal.Factory;

public final class DefaultAutoLoginModel_Factory implements Factory<DefaultAutoLoginModel> {
    private static int component3 = 1;
    private static int copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 61;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DefaultAutoLoginModel defaultAutoLoginModel = get();
        int i4 = copydefault + 65;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 44 / 0;
        }
        return defaultAutoLoginModel;
    }

    @Override
    public DefaultAutoLoginModel get() {
        int i = 2 % 2;
        int i2 = component3 + 107;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DefaultAutoLoginModel defaultAutoLoginModelNewInstance = newInstance();
        int i4 = copydefault + 87;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return defaultAutoLoginModelNewInstance;
    }

    public static DefaultAutoLoginModel_Factory create() {
        DefaultAutoLoginModel_Factory defaultAutoLoginModel_Factory;
        int i = 2 % 2;
        int i2 = component3 + 3;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            defaultAutoLoginModel_Factory = ShareDataUIState.copydefault;
            int i3 = 26 / 0;
        } else {
            defaultAutoLoginModel_Factory = ShareDataUIState.copydefault;
        }
        int i4 = component3 + 89;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return defaultAutoLoginModel_Factory;
    }

    public static DefaultAutoLoginModel newInstance() {
        int i = 2 % 2;
        DefaultAutoLoginModel defaultAutoLoginModel = new DefaultAutoLoginModel();
        int i2 = copydefault + 37;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return defaultAutoLoginModel;
    }

    static final class ShareDataUIState {
        private static int ShareDataUIState = 1;
        private static int component2;
        static final DefaultAutoLoginModel_Factory copydefault = new DefaultAutoLoginModel_Factory();

        private ShareDataUIState() {
        }

        static {
            int i = ShareDataUIState + 61;
            component2 = i % 128;
            if (i % 2 != 0) {
                int i2 = 89 / 0;
            }
        }
    }
}
