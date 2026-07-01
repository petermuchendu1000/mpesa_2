package com.huawei.digitalpayment.consumer.profile.viewmodel;

import com.huawei.digitalpayment.consumer.profile.viewmodel.UpdateDynamicsKycViewModel_HiltModules;
import dagger.internal.Factory;

public final class UpdateDynamicsKycViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int ShareDataUIState = 1;
    private static int component2;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 95;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        int i4 = component2 + 15;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = component2 + 99;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            Boolean.valueOf(provide());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i3 = component2 + 45;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return boolValueOf;
    }

    public static UpdateDynamicsKycViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = component2 + 89;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        UpdateDynamicsKycViewModel_HiltModules_KeyModule_ProvideFactory updateDynamicsKycViewModel_HiltModules_KeyModule_ProvideFactory = component1.component1;
        if (i3 != 0) {
            return updateDynamicsKycViewModel_HiltModules_KeyModule_ProvideFactory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 15;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return UpdateDynamicsKycViewModel_HiltModules.KeyModule.provide();
        }
        UpdateDynamicsKycViewModel_HiltModules.KeyModule.provide();
        throw null;
    }

    static final class component1 {
        private static int ShareDataUIState = 1;
        static final UpdateDynamicsKycViewModel_HiltModules_KeyModule_ProvideFactory component1 = new UpdateDynamicsKycViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int component2;

        private component1() {
        }

        static {
            int i = component2 + 123;
            ShareDataUIState = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }
    }
}
