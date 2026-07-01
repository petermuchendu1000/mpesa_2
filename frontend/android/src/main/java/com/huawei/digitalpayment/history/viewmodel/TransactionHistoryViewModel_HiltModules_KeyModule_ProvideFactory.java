package com.huawei.digitalpayment.history.viewmodel;

import com.huawei.digitalpayment.history.viewmodel.TransactionHistoryViewModel_HiltModules;
import dagger.internal.Factory;

public final class TransactionHistoryViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int component1 = 0;
    private static int component3 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 101;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        int i4 = component3 + 85;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = component1 + 41;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i4 = component1 + 11;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }

    public static TransactionHistoryViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = component3 + 105;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        TransactionHistoryViewModel_HiltModules_KeyModule_ProvideFactory transactionHistoryViewModel_HiltModules_KeyModule_ProvideFactory = copydefault.ShareDataUIState;
        if (i3 != 0) {
            int i4 = 24 / 0;
        }
        return transactionHistoryViewModel_HiltModules_KeyModule_ProvideFactory;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = component1 + 47;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = TransactionHistoryViewModel_HiltModules.KeyModule.provide();
        int i4 = component3 + 45;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return zProvide;
        }
        throw null;
    }

    static final class copydefault {
        static final TransactionHistoryViewModel_HiltModules_KeyModule_ProvideFactory ShareDataUIState = new TransactionHistoryViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int component1 = 0;
        private static int component2 = 1;

        private copydefault() {
        }

        static {
            int i = component1 + 55;
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
