package com.huawei.digitalpayment.consumer.schedule.viewmodel;

import com.huawei.digitalpayment.consumer.schedule.viewmodel.AutomaticPaymentListViewModel_HiltModules;
import dagger.internal.Factory;

public final class AutomaticPaymentListViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int component1 = 0;
    private static int component3 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 65;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        if (i3 != 0) {
            int i4 = 53 / 0;
        }
        return bool;
    }

    @Override
    public Boolean get() {
        Boolean boolValueOf;
        int i = 2 % 2;
        int i2 = component3 + 73;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            boolValueOf = Boolean.valueOf(provide());
            int i3 = 85 / 0;
        } else {
            boolValueOf = Boolean.valueOf(provide());
        }
        int i4 = component1 + 31;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return boolValueOf;
        }
        throw null;
    }

    public static AutomaticPaymentListViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = component1 + 103;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            AutomaticPaymentListViewModel_HiltModules_KeyModule_ProvideFactory automaticPaymentListViewModel_HiltModules_KeyModule_ProvideFactory = component1.ShareDataUIState;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        AutomaticPaymentListViewModel_HiltModules_KeyModule_ProvideFactory automaticPaymentListViewModel_HiltModules_KeyModule_ProvideFactory2 = component1.ShareDataUIState;
        int i3 = component1 + 3;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return automaticPaymentListViewModel_HiltModules_KeyModule_ProvideFactory2;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = component3 + 79;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = AutomaticPaymentListViewModel_HiltModules.KeyModule.provide();
        int i4 = component1 + 15;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return zProvide;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class component1 {
        static final AutomaticPaymentListViewModel_HiltModules_KeyModule_ProvideFactory ShareDataUIState = new AutomaticPaymentListViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int component1 = 1;
        private static int component3;

        private component1() {
        }

        static {
            int i = component1 + 59;
            component3 = i % 128;
            int i2 = i % 2;
        }
    }
}
