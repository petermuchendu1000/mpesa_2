package com.huawei.digitalpayment.consumer.profile.model;

import dagger.internal.Factory;

public final class PhotoProfileModel_Factory implements Factory<PhotoProfileModel> {
    private static int component1 = 0;
    private static int component2 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 33;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return get();
        }
        get();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public PhotoProfileModel get() {
        int i = 2 % 2;
        int i2 = component1 + 41;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        PhotoProfileModel photoProfileModelNewInstance = newInstance();
        if (i3 == 0) {
            int i4 = 49 / 0;
        }
        return photoProfileModelNewInstance;
    }

    public static PhotoProfileModel_Factory create() {
        int i = 2 % 2;
        int i2 = component2 + 109;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        PhotoProfileModel_Factory photoProfileModel_Factory = InstanceHolder.INSTANCE;
        int i4 = component1 + 19;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 71 / 0;
        }
        return photoProfileModel_Factory;
    }

    public static PhotoProfileModel newInstance() {
        int i = 2 % 2;
        PhotoProfileModel photoProfileModel = new PhotoProfileModel();
        int i2 = component2 + 55;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 48 / 0;
        }
        return photoProfileModel;
    }

    static final class InstanceHolder {
        static final PhotoProfileModel_Factory INSTANCE = new PhotoProfileModel_Factory();
        private static int ShareDataUIState = 0;
        private static int component1 = 1;

        private InstanceHolder() {
        }

        static {
            int i = component1 + 21;
            ShareDataUIState = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }
    }
}
