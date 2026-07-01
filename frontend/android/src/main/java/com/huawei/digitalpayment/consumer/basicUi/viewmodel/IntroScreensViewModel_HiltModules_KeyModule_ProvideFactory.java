package com.huawei.digitalpayment.consumer.basicUi.viewmodel;

import com.huawei.digitalpayment.consumer.basicUi.viewmodel.IntroScreensViewModel_HiltModules;
import dagger.internal.Factory;

public final class IntroScreensViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int component3 = 0;
    private static int copydefault = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 31;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        int i4 = component3 + 29;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return bool;
        }
        throw null;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = component3 + 67;
        copydefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Boolean.valueOf(provide());
            obj.hashCode();
            throw null;
        }
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i3 = component3 + 79;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            return boolValueOf;
        }
        obj.hashCode();
        throw null;
    }

    public static IntroScreensViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = copydefault + 95;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        IntroScreensViewModel_HiltModules_KeyModule_ProvideFactory introScreensViewModel_HiltModules_KeyModule_ProvideFactory = copydefault.copydefault;
        int i4 = copydefault + 85;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 8 / 0;
        }
        return introScreensViewModel_HiltModules_KeyModule_ProvideFactory;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = copydefault + 25;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return IntroScreensViewModel_HiltModules.KeyModule.provide();
        }
        IntroScreensViewModel_HiltModules.KeyModule.provide();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class copydefault {
        private static int component1 = 0;
        private static int component2 = 1;
        static final IntroScreensViewModel_HiltModules_KeyModule_ProvideFactory copydefault = new IntroScreensViewModel_HiltModules_KeyModule_ProvideFactory();

        private copydefault() {
        }

        static {
            int i = component1 + 25;
            component2 = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
