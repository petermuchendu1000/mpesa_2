package com.huawei.digitalpayment.consumer.profile.viewmodel;

import com.huawei.digitalpayment.consumer.profile.viewmodel.ChangeMsisdnViewModel_HiltModules;
import dagger.internal.Factory;

public final class ChangeMsisdnViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int component1 = 0;
    private static int component3 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 27;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        int i4 = component3 + 113;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = component3 + 117;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = provide();
        if (i3 == 0) {
            return Boolean.valueOf(zProvide);
        }
        Boolean.valueOf(zProvide);
        throw null;
    }

    public static ChangeMsisdnViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = component1 + 85;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ChangeMsisdnViewModel_HiltModules_KeyModule_ProvideFactory changeMsisdnViewModel_HiltModules_KeyModule_ProvideFactory = copydefault.component3;
        int i4 = component3 + 93;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return changeMsisdnViewModel_HiltModules_KeyModule_ProvideFactory;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = component1 + 111;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = ChangeMsisdnViewModel_HiltModules.KeyModule.provide();
        if (i3 == 0) {
            int i4 = 59 / 0;
        }
        return zProvide;
    }

    static final class copydefault {
        private static int component1 = 0;
        static final ChangeMsisdnViewModel_HiltModules_KeyModule_ProvideFactory component3 = new ChangeMsisdnViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int copydefault = 1;

        private copydefault() {
        }

        static {
            int i = copydefault + 1;
            component1 = i % 128;
            int i2 = i % 2;
        }
    }
}
