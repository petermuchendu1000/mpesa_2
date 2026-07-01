package com.huawei.digitalpayment.consumer.schedule.viewmodel;

import com.huawei.digitalpayment.consumer.schedule.viewmodel.AutomaticPaymentTypeViewModel_HiltModules;
import dagger.internal.Factory;

public final class AutomaticPaymentTypeViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int ShareDataUIState = 1;
    private static int component2;

    @Override
    public Object get() {
        Boolean bool;
        int i = 2 % 2;
        int i2 = component2 + 123;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            bool = get();
            int i3 = 51 / 0;
        } else {
            bool = get();
        }
        int i4 = ShareDataUIState + 7;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 23 / 0;
        }
        return bool;
    }

    @Override
    public Boolean get() {
        Boolean boolValueOf;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 41;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            boolValueOf = Boolean.valueOf(provide());
            int i3 = 81 / 0;
        } else {
            boolValueOf = Boolean.valueOf(provide());
        }
        int i4 = component2 + 121;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }

    public static AutomaticPaymentTypeViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = component2 + 61;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            AutomaticPaymentTypeViewModel_HiltModules_KeyModule_ProvideFactory automaticPaymentTypeViewModel_HiltModules_KeyModule_ProvideFactory = ShareDataUIState.copydefault;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        AutomaticPaymentTypeViewModel_HiltModules_KeyModule_ProvideFactory automaticPaymentTypeViewModel_HiltModules_KeyModule_ProvideFactory2 = ShareDataUIState.copydefault;
        int i3 = component2 + 77;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return automaticPaymentTypeViewModel_HiltModules_KeyModule_ProvideFactory2;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 47;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = AutomaticPaymentTypeViewModel_HiltModules.KeyModule.provide();
        int i4 = ShareDataUIState + 111;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return zProvide;
    }

    static final class ShareDataUIState {
        private static int component2 = 1;
        private static int component3;
        static final AutomaticPaymentTypeViewModel_HiltModules_KeyModule_ProvideFactory copydefault = new AutomaticPaymentTypeViewModel_HiltModules_KeyModule_ProvideFactory();

        private ShareDataUIState() {
        }

        static {
            int i = component2 + 111;
            component3 = i % 128;
            if (i % 2 != 0) {
                int i2 = 29 / 0;
            }
        }
    }
}
