package com.huawei.digitalpayment.consumer.profile.model;

import dagger.internal.Factory;

public final class ProfileModel_Factory implements Factory<ProfileModel> {
    private static int component1 = 0;
    private static int component3 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 113;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ProfileModel profileModel = get();
        int i4 = component3 + 5;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return profileModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public ProfileModel get() {
        int i = 2 % 2;
        int i2 = component3 + 91;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ProfileModel profileModelNewInstance = newInstance();
        int i4 = component3 + 37;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return profileModelNewInstance;
    }

    public static ProfileModel_Factory create() {
        int i = 2 % 2;
        int i2 = component1 + 11;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ProfileModel_Factory profileModel_Factory = InstanceHolder.INSTANCE;
        int i4 = component3 + 109;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return profileModel_Factory;
    }

    public static ProfileModel newInstance() {
        int i = 2 % 2;
        ProfileModel profileModel = new ProfileModel();
        int i2 = component3 + 119;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return profileModel;
    }

    static final class InstanceHolder {
        static final ProfileModel_Factory INSTANCE = new ProfileModel_Factory();
        private static int ShareDataUIState = 1;
        private static int component3;

        private InstanceHolder() {
        }

        static {
            int i = ShareDataUIState + 107;
            component3 = i % 128;
            int i2 = i % 2;
        }
    }
}
