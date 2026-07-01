package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.ModifySecurityQuestionsViewModel_HiltModules;
import dagger.internal.Factory;

public final class ModifySecurityQuestionsViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int ShareDataUIState = 1;
    private static int component2;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 45;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        int i4 = ShareDataUIState + 125;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return bool;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = component2 + 89;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            Boolean.valueOf(provide());
            throw null;
        }
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i3 = ShareDataUIState + 91;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return boolValueOf;
    }

    public static ModifySecurityQuestionsViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 5;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ModifySecurityQuestionsViewModel_HiltModules_KeyModule_ProvideFactory modifySecurityQuestionsViewModel_HiltModules_KeyModule_ProvideFactory = copydefault.component3;
        int i4 = ShareDataUIState + 63;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return modifySecurityQuestionsViewModel_HiltModules_KeyModule_ProvideFactory;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 101;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = ModifySecurityQuestionsViewModel_HiltModules.KeyModule.provide();
        int i4 = ShareDataUIState + 29;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 10 / 0;
        }
        return zProvide;
    }

    static final class copydefault {
        private static int ShareDataUIState = 1;
        private static int component1;
        static final ModifySecurityQuestionsViewModel_HiltModules_KeyModule_ProvideFactory component3 = new ModifySecurityQuestionsViewModel_HiltModules_KeyModule_ProvideFactory();

        private copydefault() {
        }

        static {
            int i = component1 + 73;
            ShareDataUIState = i % 128;
            int i2 = i % 2;
        }
    }
}
