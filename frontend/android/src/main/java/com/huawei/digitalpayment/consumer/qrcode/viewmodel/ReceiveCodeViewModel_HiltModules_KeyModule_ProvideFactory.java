package com.huawei.digitalpayment.consumer.qrcode.viewmodel;

import com.huawei.digitalpayment.consumer.qrcode.viewmodel.ReceiveCodeViewModel_HiltModules;
import dagger.internal.Factory;

public final class ReceiveCodeViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int component3 = 1;
    private static int copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 97;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        int i4 = copydefault + 71;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = component3 + 33;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i4 = copydefault + 71;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return boolValueOf;
        }
        throw null;
    }

    public static ReceiveCodeViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = component3 + 83;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ReceiveCodeViewModel_HiltModules_KeyModule_ProvideFactory receiveCodeViewModel_HiltModules_KeyModule_ProvideFactory = copydefault.component3;
        int i4 = copydefault + 121;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return receiveCodeViewModel_HiltModules_KeyModule_ProvideFactory;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = component3 + 73;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = ReceiveCodeViewModel_HiltModules.KeyModule.provide();
        int i4 = copydefault + 31;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return zProvide;
    }

    static final class copydefault {
        private static int component1 = 1;
        private static int component2;
        static final ReceiveCodeViewModel_HiltModules_KeyModule_ProvideFactory component3 = new ReceiveCodeViewModel_HiltModules_KeyModule_ProvideFactory();

        private copydefault() {
        }

        static {
            int i = component2 + 15;
            component1 = i % 128;
            int i2 = i % 2;
        }
    }
}
