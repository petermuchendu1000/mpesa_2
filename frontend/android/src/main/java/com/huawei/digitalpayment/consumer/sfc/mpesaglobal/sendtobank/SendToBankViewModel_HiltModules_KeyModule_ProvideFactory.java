package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank;

import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankViewModel_HiltModules;
import dagger.internal.Factory;

public final class SendToBankViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int component1 = 0;
    private static int component2 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component1 + 27;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            get();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Boolean bool = get();
        int i3 = component1 + 25;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return bool;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = component1 + 17;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i4 = component1 + 109;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }

    public static SendToBankViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = component1 + 77;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        SendToBankViewModel_HiltModules_KeyModule_ProvideFactory sendToBankViewModel_HiltModules_KeyModule_ProvideFactory = component2.ShareDataUIState;
        int i4 = component2 + 113;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return sendToBankViewModel_HiltModules_KeyModule_ProvideFactory;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = component2 + 23;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return SendToBankViewModel_HiltModules.KeyModule.provide();
        }
        SendToBankViewModel_HiltModules.KeyModule.provide();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class component2 {
        static final SendToBankViewModel_HiltModules_KeyModule_ProvideFactory ShareDataUIState = new SendToBankViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int component1 = 0;
        private static int component2 = 1;

        private component2() {
        }

        static {
            int i = component2 + 1;
            component1 = i % 128;
            int i2 = i % 2;
        }
    }
}
