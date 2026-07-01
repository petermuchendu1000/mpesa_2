package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.VerifySecurityQuestionViewModel_HiltModules;
import dagger.internal.Factory;

public final class VerifySecurityQuestionViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 19;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        int i4 = component3 + 113;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return bool;
        }
        throw null;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 113;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i4 = component3 + 27;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return boolValueOf;
        }
        throw null;
    }

    public static VerifySecurityQuestionViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 61;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        VerifySecurityQuestionViewModel_HiltModules_KeyModule_ProvideFactory verifySecurityQuestionViewModel_HiltModules_KeyModule_ProvideFactory = component3.component2;
        int i4 = ShareDataUIState + 29;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return verifySecurityQuestionViewModel_HiltModules_KeyModule_ProvideFactory;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 73;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = VerifySecurityQuestionViewModel_HiltModules.KeyModule.provide();
        int i4 = component3 + 25;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 68 / 0;
        }
        return zProvide;
    }

    static final class component3 {
        static final VerifySecurityQuestionViewModel_HiltModules_KeyModule_ProvideFactory component2 = new VerifySecurityQuestionViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int component3 = 0;
        private static int copydefault = 1;

        private component3() {
        }

        static {
            int i = copydefault + 5;
            component3 = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
