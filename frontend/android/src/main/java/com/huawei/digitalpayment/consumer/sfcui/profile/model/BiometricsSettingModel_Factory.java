package com.huawei.digitalpayment.consumer.sfcui.profile.model;

import dagger.internal.Factory;

public final class BiometricsSettingModel_Factory implements Factory<BiometricsSettingModel> {
    private static int component2 = 0;
    private static int component3 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 35;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        BiometricsSettingModel biometricsSettingModel = get();
        int i4 = component3 + 71;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 91 / 0;
        }
        return biometricsSettingModel;
    }

    @Override
    public BiometricsSettingModel get() {
        int i = 2 % 2;
        int i2 = component3 + 79;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return newInstance();
        }
        newInstance();
        throw null;
    }

    public static BiometricsSettingModel_Factory create() {
        int i = 2 % 2;
        int i2 = component3 + 75;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        BiometricsSettingModel_Factory biometricsSettingModel_Factory = ShareDataUIState.copydefault;
        int i4 = component2 + 109;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return biometricsSettingModel_Factory;
    }

    public static BiometricsSettingModel newInstance() {
        int i = 2 % 2;
        BiometricsSettingModel biometricsSettingModel = new BiometricsSettingModel();
        int i2 = component2 + 59;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return biometricsSettingModel;
    }

    static final class ShareDataUIState {
        private static int ShareDataUIState = 1;
        private static int component2;
        static final BiometricsSettingModel_Factory copydefault = new BiometricsSettingModel_Factory();

        private ShareDataUIState() {
        }

        static {
            int i = ShareDataUIState + 53;
            component2 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }
    }
}
