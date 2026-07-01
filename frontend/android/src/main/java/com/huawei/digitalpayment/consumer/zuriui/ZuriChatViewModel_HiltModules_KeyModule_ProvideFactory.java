package com.huawei.digitalpayment.consumer.zuriui;

import com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel_HiltModules;
import dagger.internal.Factory;

public final class ZuriChatViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int component1 = 0;
    private static int component2 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 1;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return get();
        }
        get();
        throw null;
    }

    @Override
    public Boolean get() {
        Boolean boolValueOf;
        int i = 2 % 2;
        int i2 = component2 + 29;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            boolValueOf = Boolean.valueOf(provide());
            int i3 = 6 / 0;
        } else {
            boolValueOf = Boolean.valueOf(provide());
        }
        int i4 = component1 + 65;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }

    public static ZuriChatViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = component1 + 5;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ZuriChatViewModel_HiltModules_KeyModule_ProvideFactory zuriChatViewModel_HiltModules_KeyModule_ProvideFactory = component3.component3;
        int i4 = component1 + 57;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return zuriChatViewModel_HiltModules_KeyModule_ProvideFactory;
        }
        throw null;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = component2 + 113;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return ZuriChatViewModel_HiltModules.KeyModule.provide();
        }
        ZuriChatViewModel_HiltModules.KeyModule.provide();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class component3 {
        private static int component1 = 0;
        static final ZuriChatViewModel_HiltModules_KeyModule_ProvideFactory component3 = new ZuriChatViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int copydefault = 1;

        private component3() {
        }

        static {
            int i = component1 + 81;
            copydefault = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }
    }
}
