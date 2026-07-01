package com.huawei.digitalpayment.consumer.home.viewmodel;

import com.huawei.digitalpayment.consumer.home.viewmodel.QuickActionsViewModel_HiltModules;
import dagger.internal.Factory;

public final class QuickActionsViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int component2 = 0;
    private static int copydefault = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 71;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            get();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Boolean bool = get();
        int i3 = copydefault + 29;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 36 / 0;
        }
        return bool;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = copydefault + 41;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        if (i3 != 0) {
            int i4 = 32 / 0;
        }
        return boolValueOf;
    }

    public static QuickActionsViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = component2 + 67;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        QuickActionsViewModel_HiltModules_KeyModule_ProvideFactory quickActionsViewModel_HiltModules_KeyModule_ProvideFactory = component2.component1;
        int i4 = component2 + 113;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return quickActionsViewModel_HiltModules_KeyModule_ProvideFactory;
        }
        throw null;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = copydefault + 81;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = QuickActionsViewModel_HiltModules.KeyModule.provide();
        int i4 = component2 + 13;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 36 / 0;
        }
        return zProvide;
    }

    static final class component2 {
        private static int ShareDataUIState = 0;
        static final QuickActionsViewModel_HiltModules_KeyModule_ProvideFactory component1 = new QuickActionsViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int component2 = 1;

        private component2() {
        }

        static {
            int i = component2 + 101;
            ShareDataUIState = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }
    }
}
