package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile;

import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileViewModel_HiltModules;
import dagger.internal.Factory;

public final class SendToMobileViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int component1 = 1;
    private static int component2;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component1 + 71;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            get();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Boolean bool = get();
        int i3 = component1 + 105;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return bool;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = component1 + 55;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i4 = component2 + 5;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return boolValueOf;
        }
        throw null;
    }

    public static SendToMobileViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = component2 + 35;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        SendToMobileViewModel_HiltModules_KeyModule_ProvideFactory sendToMobileViewModel_HiltModules_KeyModule_ProvideFactory = component3.ShareDataUIState;
        int i4 = component1 + 21;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return sendToMobileViewModel_HiltModules_KeyModule_ProvideFactory;
        }
        throw null;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = component1 + 63;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return SendToMobileViewModel_HiltModules.KeyModule.provide();
        }
        SendToMobileViewModel_HiltModules.KeyModule.provide();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class component3 {
        static final SendToMobileViewModel_HiltModules_KeyModule_ProvideFactory ShareDataUIState = new SendToMobileViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int component2 = 0;
        private static int copydefault = 1;

        private component3() {
        }

        static {
            int i = copydefault + 47;
            component2 = i % 128;
            int i2 = i % 2;
        }
    }
}
