package com.huawei.digitalpayment.common.theme.viewmodel;

import com.huawei.digitalpayment.common.theme.viewmodel.MyServicesViewModel_HiltModules;
import dagger.internal.Factory;

public final class MyServicesViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int component2 = 1;
    private static int component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 13;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        int i4 = component2 + 123;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = component2 + 119;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i4 = component2 + 67;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 94 / 0;
        }
        return boolValueOf;
    }

    public static MyServicesViewModel_HiltModules_KeyModule_ProvideFactory create() {
        MyServicesViewModel_HiltModules_KeyModule_ProvideFactory myServicesViewModel_HiltModules_KeyModule_ProvideFactory;
        int i = 2 % 2;
        int i2 = component3 + 23;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            myServicesViewModel_HiltModules_KeyModule_ProvideFactory = component3.component2;
            int i3 = 95 / 0;
        } else {
            myServicesViewModel_HiltModules_KeyModule_ProvideFactory = component3.component2;
        }
        int i4 = component3 + 37;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return myServicesViewModel_HiltModules_KeyModule_ProvideFactory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = component2 + 53;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = MyServicesViewModel_HiltModules.KeyModule.provide();
        int i4 = component2 + 105;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 63 / 0;
        }
        return zProvide;
    }

    static final class component3 {
        private static int component1 = 0;
        static final MyServicesViewModel_HiltModules_KeyModule_ProvideFactory component2 = new MyServicesViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int component3 = 1;

        private component3() {
        }

        static {
            int i = component1 + 19;
            component3 = i % 128;
            int i2 = i % 2;
        }
    }
}
