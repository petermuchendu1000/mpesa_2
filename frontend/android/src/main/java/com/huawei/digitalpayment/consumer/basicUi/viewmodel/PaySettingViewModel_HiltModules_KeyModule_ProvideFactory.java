package com.huawei.digitalpayment.consumer.basicUi.viewmodel;

import com.huawei.digitalpayment.consumer.basicUi.viewmodel.PaySettingViewModel_HiltModules;
import dagger.internal.Factory;

public final class PaySettingViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int component1 = 1;
    private static int component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component1 + 85;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            get();
            throw null;
        }
        Boolean bool = get();
        int i3 = component3 + 99;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            return bool;
        }
        throw null;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = component3 + 107;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = provide();
        if (i3 != 0) {
            return Boolean.valueOf(zProvide);
        }
        Boolean.valueOf(zProvide);
        throw null;
    }

    public static PaySettingViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = component3 + 119;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            PaySettingViewModel_HiltModules_KeyModule_ProvideFactory paySettingViewModel_HiltModules_KeyModule_ProvideFactory = component2.component3;
            throw null;
        }
        PaySettingViewModel_HiltModules_KeyModule_ProvideFactory paySettingViewModel_HiltModules_KeyModule_ProvideFactory2 = component2.component3;
        int i3 = component1 + 117;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return paySettingViewModel_HiltModules_KeyModule_ProvideFactory2;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = component1 + 119;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = PaySettingViewModel_HiltModules.KeyModule.provide();
        int i4 = component3 + 45;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return zProvide;
    }

    static final class component2 {
        private static int component1 = 1;
        private static int component2;
        static final PaySettingViewModel_HiltModules_KeyModule_ProvideFactory component3 = new PaySettingViewModel_HiltModules_KeyModule_ProvideFactory();

        private component2() {
        }

        static {
            int i = component1 + 93;
            component2 = i % 128;
            int i2 = i % 2;
        }
    }
}
