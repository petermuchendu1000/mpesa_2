package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.IdentifyPinViewModel_HiltModules;
import dagger.internal.Factory;

public final class IdentifyPinViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component1 + 55;
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
    public Boolean get() {
        int i = 2 % 2;
        int i2 = component1 + 27;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i4 = ShareDataUIState + 121;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return boolValueOf;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static IdentifyPinViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 31;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        IdentifyPinViewModel_HiltModules_KeyModule_ProvideFactory identifyPinViewModel_HiltModules_KeyModule_ProvideFactory = component1.ShareDataUIState;
        if (i3 != 0) {
            return identifyPinViewModel_HiltModules_KeyModule_ProvideFactory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 5;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = IdentifyPinViewModel_HiltModules.KeyModule.provide();
        int i4 = component1 + 109;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return zProvide;
    }

    static final class component1 {
        static final IdentifyPinViewModel_HiltModules_KeyModule_ProvideFactory ShareDataUIState = new IdentifyPinViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int component1 = 1;
        private static int component3;

        private component1() {
        }

        static {
            int i = component1 + 49;
            component3 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }
    }
}
