package com.huawei.digitalpayment.customer.dynamics.model;

import dagger.internal.Factory;

public final class DefaultPhotoModel_Factory implements Factory<DefaultPhotoModel> {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 53;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return get();
        }
        get();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public DefaultPhotoModel get() {
        int i = 2 % 2;
        int i2 = component3 + 25;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            newInstance();
            throw null;
        }
        DefaultPhotoModel defaultPhotoModelNewInstance = newInstance();
        int i3 = ShareDataUIState + 67;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 91 / 0;
        }
        return defaultPhotoModelNewInstance;
    }

    public static DefaultPhotoModel_Factory create() {
        int i = 2 % 2;
        int i2 = component3 + 33;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DefaultPhotoModel_Factory defaultPhotoModel_Factory = component3.ShareDataUIState;
        if (i3 == 0) {
            return defaultPhotoModel_Factory;
        }
        throw null;
    }

    public static DefaultPhotoModel newInstance() {
        int i = 2 % 2;
        DefaultPhotoModel defaultPhotoModel = new DefaultPhotoModel();
        int i2 = ShareDataUIState + 69;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return defaultPhotoModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class component3 {
        static final DefaultPhotoModel_Factory ShareDataUIState = new DefaultPhotoModel_Factory();
        private static int component1 = 1;
        private static int copydefault;

        private component3() {
        }

        static {
            int i = copydefault + 103;
            component1 = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }
    }
}
