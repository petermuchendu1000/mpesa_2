package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.VerifyBaseQuestionViewModel_HiltModules;
import dagger.internal.Factory;

public final class VerifyBaseQuestionViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int ShareDataUIState = 1;
    private static int copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = copydefault + 59;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        int i4 = ShareDataUIState + 81;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    @Override
    public Boolean get() {
        Boolean boolValueOf;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 95;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            boolValueOf = Boolean.valueOf(provide());
            int i3 = 40 / 0;
        } else {
            boolValueOf = Boolean.valueOf(provide());
        }
        int i4 = ShareDataUIState + 103;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return boolValueOf;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static VerifyBaseQuestionViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 17;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        VerifyBaseQuestionViewModel_HiltModules_KeyModule_ProvideFactory verifyBaseQuestionViewModel_HiltModules_KeyModule_ProvideFactory = ShareDataUIState.component2;
        int i4 = copydefault + 89;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return verifyBaseQuestionViewModel_HiltModules_KeyModule_ProvideFactory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = copydefault + 33;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = VerifyBaseQuestionViewModel_HiltModules.KeyModule.provide();
        int i4 = ShareDataUIState + 59;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return zProvide;
    }

    static final class ShareDataUIState {
        private static int ShareDataUIState = 1;
        private static int component1;
        static final VerifyBaseQuestionViewModel_HiltModules_KeyModule_ProvideFactory component2 = new VerifyBaseQuestionViewModel_HiltModules_KeyModule_ProvideFactory();

        private ShareDataUIState() {
        }

        static {
            int i = component1 + 109;
            ShareDataUIState = i % 128;
            int i2 = i % 2;
        }
    }
}
