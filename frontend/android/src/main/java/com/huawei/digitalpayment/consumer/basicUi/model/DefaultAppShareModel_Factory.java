package com.huawei.digitalpayment.consumer.basicUi.model;

import dagger.internal.Factory;

public final class DefaultAppShareModel_Factory implements Factory<DefaultAppShareModel> {
    private static int component2 = 0;
    private static int copydefault = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 19;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DefaultAppShareModel defaultAppShareModel = get();
        int i4 = copydefault + 31;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 80 / 0;
        }
        return defaultAppShareModel;
    }

    @Override
    public DefaultAppShareModel get() {
        int i = 2 % 2;
        int i2 = component2 + 79;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DefaultAppShareModel defaultAppShareModelNewInstance = newInstance();
        int i4 = component2 + 57;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return defaultAppShareModelNewInstance;
        }
        throw null;
    }

    public static DefaultAppShareModel_Factory create() {
        int i = 2 % 2;
        int i2 = copydefault + 65;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            DefaultAppShareModel_Factory defaultAppShareModel_Factory = component3.component1;
            throw null;
        }
        DefaultAppShareModel_Factory defaultAppShareModel_Factory2 = component3.component1;
        int i3 = component2 + 83;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 1 / 0;
        }
        return defaultAppShareModel_Factory2;
    }

    public static DefaultAppShareModel newInstance() {
        int i = 2 % 2;
        DefaultAppShareModel defaultAppShareModel = new DefaultAppShareModel();
        int i2 = component2 + 109;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return defaultAppShareModel;
    }

    static final class component3 {
        static final DefaultAppShareModel_Factory component1 = new DefaultAppShareModel_Factory();
        private static int component2 = 1;
        private static int copydefault;

        private component3() {
        }

        static {
            int i = component2 + 109;
            copydefault = i % 128;
            int i2 = i % 2;
        }
    }
}
