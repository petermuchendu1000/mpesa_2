package com.huawei.digitalpayment.consumer.qrcode.model;

import dagger.internal.Factory;

public final class DefaultReceiveCodeModel_Factory implements Factory<DefaultReceiveCodeModel> {
    private static int ShareDataUIState = 1;
    private static int component1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component1 + 59;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DefaultReceiveCodeModel defaultReceiveCodeModel = get();
        int i4 = component1 + 93;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return defaultReceiveCodeModel;
        }
        throw null;
    }

    @Override
    public DefaultReceiveCodeModel get() {
        int i = 2 % 2;
        int i2 = component1 + 53;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DefaultReceiveCodeModel defaultReceiveCodeModelNewInstance = newInstance();
        int i4 = component1 + 121;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return defaultReceiveCodeModelNewInstance;
        }
        throw null;
    }

    public static DefaultReceiveCodeModel_Factory create() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 51;
        component1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            DefaultReceiveCodeModel_Factory defaultReceiveCodeModel_Factory = copydefault.component3;
            throw null;
        }
        DefaultReceiveCodeModel_Factory defaultReceiveCodeModel_Factory2 = copydefault.component3;
        int i3 = component1 + 21;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            return defaultReceiveCodeModel_Factory2;
        }
        obj.hashCode();
        throw null;
    }

    public static DefaultReceiveCodeModel newInstance() {
        int i = 2 % 2;
        DefaultReceiveCodeModel defaultReceiveCodeModel = new DefaultReceiveCodeModel();
        int i2 = ShareDataUIState + 87;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return defaultReceiveCodeModel;
        }
        throw null;
    }

    static final class copydefault {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;
        static final DefaultReceiveCodeModel_Factory component3 = new DefaultReceiveCodeModel_Factory();

        private copydefault() {
        }

        static {
            int i = ShareDataUIState + 111;
            component2 = i % 128;
            if (i % 2 == 0) {
                int i2 = 7 / 0;
            }
        }
    }
}
