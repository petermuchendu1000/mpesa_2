package com.huawei.digitalpayment.consumer.sfcui.statement.viewmodel;

import com.huawei.digitalpayment.consumer.sfcui.statement.viewmodel.MpesaStatementsDetailsViewModel_HiltModules;
import dagger.internal.Factory;

public final class MpesaStatementsDetailsViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int component1 = 0;
    private static int component3 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component1 + 103;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return get();
        }
        get();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = component1 + 97;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        if (i3 == 0) {
            int i4 = 92 / 0;
        }
        return boolValueOf;
    }

    public static MpesaStatementsDetailsViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = component3 + 7;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        MpesaStatementsDetailsViewModel_HiltModules_KeyModule_ProvideFactory mpesaStatementsDetailsViewModel_HiltModules_KeyModule_ProvideFactory = component1.component2;
        if (i3 == 0) {
            return mpesaStatementsDetailsViewModel_HiltModules_KeyModule_ProvideFactory;
        }
        throw null;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = component1 + 87;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = MpesaStatementsDetailsViewModel_HiltModules.KeyModule.provide();
        int i4 = component3 + 103;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return zProvide;
        }
        throw null;
    }

    static final class component1 {
        private static int component1 = 0;
        static final MpesaStatementsDetailsViewModel_HiltModules_KeyModule_ProvideFactory component2 = new MpesaStatementsDetailsViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int copydefault = 1;

        private component1() {
        }

        static {
            int i = copydefault + 105;
            component1 = i % 128;
            if (i % 2 != 0) {
                int i2 = 84 / 0;
            }
        }
    }
}
