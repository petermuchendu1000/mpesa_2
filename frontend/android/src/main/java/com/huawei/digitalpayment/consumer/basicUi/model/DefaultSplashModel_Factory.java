package com.huawei.digitalpayment.consumer.basicUi.model;

import dagger.internal.Factory;

public final class DefaultSplashModel_Factory implements Factory<DefaultSplashModel> {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;

    @Override
    public Object get() {
        DefaultSplashModel defaultSplashModel;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 77;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            defaultSplashModel = get();
            int i3 = 69 / 0;
        } else {
            defaultSplashModel = get();
        }
        int i4 = copydefault + 9;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return defaultSplashModel;
        }
        throw null;
    }

    @Override
    public DefaultSplashModel get() {
        int i = 2 % 2;
        int i2 = copydefault + 67;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            newInstance();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        DefaultSplashModel defaultSplashModelNewInstance = newInstance();
        int i3 = copydefault + 23;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return defaultSplashModelNewInstance;
    }

    public static DefaultSplashModel_Factory create() {
        int i = 2 % 2;
        int i2 = copydefault + 75;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DefaultSplashModel_Factory defaultSplashModel_Factory = component3.ShareDataUIState;
        if (i3 == 0) {
            return defaultSplashModel_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static DefaultSplashModel newInstance() {
        int i = 2 % 2;
        DefaultSplashModel defaultSplashModel = new DefaultSplashModel();
        int i2 = ShareDataUIState + 47;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return defaultSplashModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class component3 {
        static final DefaultSplashModel_Factory ShareDataUIState = new DefaultSplashModel_Factory();
        private static int component3 = 0;
        private static int copydefault = 1;

        private component3() {
        }

        static {
            int i = copydefault + 53;
            component3 = i % 128;
            int i2 = i % 2;
        }
    }
}
