package com.huawei.digitalpayment.consumer.loginModule.login.data;

import dagger.internal.Factory;

public final class DefaultPinLoginModel_Factory implements Factory<DefaultPinLoginModel> {
    private static int component3 = 0;
    private static int copydefault = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = copydefault + 39;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DefaultPinLoginModel defaultPinLoginModel = get();
        int i4 = copydefault + 43;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return defaultPinLoginModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public DefaultPinLoginModel get() {
        int i = 2 % 2;
        int i2 = component3 + 77;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DefaultPinLoginModel defaultPinLoginModelNewInstance = newInstance();
        int i4 = component3 + 45;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return defaultPinLoginModelNewInstance;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static DefaultPinLoginModel_Factory create() {
        int i = 2 % 2;
        int i2 = copydefault + 117;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DefaultPinLoginModel_Factory defaultPinLoginModel_Factory = ShareDataUIState.component1;
        int i4 = copydefault + 51;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 99 / 0;
        }
        return defaultPinLoginModel_Factory;
    }

    public static DefaultPinLoginModel newInstance() {
        int i = 2 % 2;
        DefaultPinLoginModel defaultPinLoginModel = new DefaultPinLoginModel();
        int i2 = copydefault + 123;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return defaultPinLoginModel;
    }

    static final class ShareDataUIState {
        private static int ShareDataUIState = 0;
        static final DefaultPinLoginModel_Factory component1 = new DefaultPinLoginModel_Factory();
        private static int component3 = 1;

        private ShareDataUIState() {
        }

        static {
            int i = component3 + 27;
            ShareDataUIState = i % 128;
            if (i % 2 != 0) {
                int i2 = 13 / 0;
            }
        }
    }
}
