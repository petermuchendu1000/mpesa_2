package com.huawei.digitalpayment.pwa.model;

import dagger.internal.Factory;

public final class DefaultPwaModel_Factory implements Factory<DefaultPwaModel> {
    private static int component3 = 0;
    private static int copydefault = 1;

    @Override
    public Object get() {
        DefaultPwaModel defaultPwaModel;
        int i = 2 % 2;
        int i2 = copydefault + 63;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            defaultPwaModel = get();
            int i3 = 75 / 0;
        } else {
            defaultPwaModel = get();
        }
        int i4 = component3 + 45;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 61 / 0;
        }
        return defaultPwaModel;
    }

    @Override
    public DefaultPwaModel get() {
        int i = 2 % 2;
        int i2 = copydefault + 35;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            newInstance();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        DefaultPwaModel defaultPwaModelNewInstance = newInstance();
        int i3 = copydefault + 15;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return defaultPwaModelNewInstance;
    }

    public static DefaultPwaModel_Factory create() {
        int i = 2 % 2;
        int i2 = component3 + 19;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DefaultPwaModel_Factory defaultPwaModel_Factory = component3.ShareDataUIState;
        int i4 = component3 + 105;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return defaultPwaModel_Factory;
    }

    public static DefaultPwaModel newInstance() {
        int i = 2 % 2;
        DefaultPwaModel defaultPwaModel = new DefaultPwaModel();
        int i2 = copydefault + 55;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return defaultPwaModel;
    }

    static final class component3 {
        static final DefaultPwaModel_Factory ShareDataUIState = new DefaultPwaModel_Factory();
        private static int component1 = 0;
        private static int copydefault = 1;

        private component3() {
        }

        static {
            int i = copydefault + 67;
            component1 = i % 128;
            int i2 = i % 2;
        }
    }
}
