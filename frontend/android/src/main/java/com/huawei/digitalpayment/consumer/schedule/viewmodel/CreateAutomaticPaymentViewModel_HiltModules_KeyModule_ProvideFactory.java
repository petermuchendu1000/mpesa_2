package com.huawei.digitalpayment.consumer.schedule.viewmodel;

import com.huawei.digitalpayment.consumer.schedule.viewmodel.CreateAutomaticPaymentViewModel_HiltModules;
import dagger.internal.Factory;

public final class CreateAutomaticPaymentViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = copydefault + 27;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            get();
            throw null;
        }
        Boolean bool = get();
        int i3 = copydefault + 113;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return bool;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 17;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        if (i3 == 0) {
            int i4 = 60 / 0;
        }
        return boolValueOf;
    }

    public static CreateAutomaticPaymentViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 47;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        CreateAutomaticPaymentViewModel_HiltModules_KeyModule_ProvideFactory createAutomaticPaymentViewModel_HiltModules_KeyModule_ProvideFactory = ShareDataUIState.ShareDataUIState;
        int i4 = ShareDataUIState + 79;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 37 / 0;
        }
        return createAutomaticPaymentViewModel_HiltModules_KeyModule_ProvideFactory;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 93;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = CreateAutomaticPaymentViewModel_HiltModules.KeyModule.provide();
        int i4 = ShareDataUIState + 13;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return zProvide;
    }

    static final class ShareDataUIState {
        static final CreateAutomaticPaymentViewModel_HiltModules_KeyModule_ProvideFactory ShareDataUIState = new CreateAutomaticPaymentViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int component1 = 0;
        private static int component3 = 1;

        private ShareDataUIState() {
        }

        static {
            int i = component1 + 89;
            component3 = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }
    }
}
