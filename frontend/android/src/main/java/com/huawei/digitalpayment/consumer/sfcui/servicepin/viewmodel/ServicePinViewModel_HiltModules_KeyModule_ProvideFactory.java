package com.huawei.digitalpayment.consumer.sfcui.servicepin.viewmodel;

import com.huawei.digitalpayment.consumer.sfcui.servicepin.viewmodel.ServicePinViewModel_HiltModules;
import dagger.internal.Factory;

public final class ServicePinViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    public static int ShareDataUIState = -2123627954;
    private static int component2 = 0;
    private static int copydefault = 1;

    @Override
    public Object get() {
        Boolean bool;
        int i = 2 % 2;
        int i2 = component2 + 57;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            bool = get();
            int i3 = 58 / 0;
        } else {
            bool = get();
        }
        int i4 = copydefault + 71;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return bool;
        }
        throw null;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = component2 + 29;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i4 = copydefault + 21;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }

    public static ServicePinViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = copydefault + 35;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ServicePinViewModel_HiltModules_KeyModule_ProvideFactory servicePinViewModel_HiltModules_KeyModule_ProvideFactory = copydefault.ShareDataUIState;
        int i4 = component2 + 17;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 92 / 0;
        }
        return servicePinViewModel_HiltModules_KeyModule_ProvideFactory;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = component2 + 103;
        copydefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            ServicePinViewModel_HiltModules.KeyModule.provide();
            obj.hashCode();
            throw null;
        }
        boolean zProvide = ServicePinViewModel_HiltModules.KeyModule.provide();
        int i3 = copydefault + 37;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            return zProvide;
        }
        obj.hashCode();
        throw null;
    }

    static final class copydefault {
        static final ServicePinViewModel_HiltModules_KeyModule_ProvideFactory ShareDataUIState = new ServicePinViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int component2 = 0;
        private static int copydefault = 1;

        private copydefault() {
        }

        static {
            int i = copydefault + 57;
            component2 = i % 128;
            if (i % 2 != 0) {
                int i2 = 87 / 0;
            }
        }
    }
}
