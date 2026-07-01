package com.huawei.digitalpayment.consumer.basicUi.pinfree;

import com.huawei.digitalpayment.consumer.basicUi.pinfree.PinFreeViewModel_HiltModules;
import dagger.internal.Factory;

public final class PinFreeViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int ShareDataUIState = 1;
    private static int component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 81;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        int i4 = ShareDataUIState + 53;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return bool;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 109;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i4 = ShareDataUIState + 101;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }

    public static PinFreeViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 93;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        PinFreeViewModel_HiltModules_KeyModule_ProvideFactory pinFreeViewModel_HiltModules_KeyModule_ProvideFactory = copydefault.copydefault;
        if (i3 == 0) {
            return pinFreeViewModel_HiltModules_KeyModule_ProvideFactory;
        }
        throw null;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 43;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = PinFreeViewModel_HiltModules.KeyModule.provide();
        int i4 = ShareDataUIState + 39;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return zProvide;
    }

    static final class copydefault {
        private static int component1 = 1;
        private static int component3;
        static final PinFreeViewModel_HiltModules_KeyModule_ProvideFactory copydefault = new PinFreeViewModel_HiltModules_KeyModule_ProvideFactory();

        private copydefault() {
        }

        static {
            int i = component3 + 65;
            component1 = i % 128;
            int i2 = i % 2;
        }
    }
}
