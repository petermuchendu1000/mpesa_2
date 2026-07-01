package com.huawei.digitalpayment.consumer.loginModule.register.viewmodel;

import com.huawei.digitalpayment.consumer.loginModule.register.viewmodel.ActiveConsumerViewModel_HiltModules;
import dagger.internal.Factory;

public final class ActiveConsumerViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int ShareDataUIState = 1;
    private static int copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 123;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            get();
            throw null;
        }
        Boolean bool = get();
        int i3 = copydefault + 29;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 67 / 0;
        }
        return bool;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 35;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i4 = ShareDataUIState + 49;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return boolValueOf;
        }
        throw null;
    }

    public static ActiveConsumerViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 99;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActiveConsumerViewModel_HiltModules_KeyModule_ProvideFactory activeConsumerViewModel_HiltModules_KeyModule_ProvideFactory = component2.ShareDataUIState;
        int i4 = ShareDataUIState + 83;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activeConsumerViewModel_HiltModules_KeyModule_ProvideFactory;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = copydefault + 11;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = ActiveConsumerViewModel_HiltModules.KeyModule.provide();
        int i4 = copydefault + 99;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 91 / 0;
        }
        return zProvide;
    }

    static final class component2 {
        static final ActiveConsumerViewModel_HiltModules_KeyModule_ProvideFactory ShareDataUIState = new ActiveConsumerViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int component1 = 1;
        private static int component2;

        private component2() {
        }

        static {
            int i = component2 + 61;
            component1 = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }
    }
}
