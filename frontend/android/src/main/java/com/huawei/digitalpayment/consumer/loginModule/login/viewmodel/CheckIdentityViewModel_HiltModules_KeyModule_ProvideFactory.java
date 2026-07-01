package com.huawei.digitalpayment.consumer.loginModule.login.viewmodel;

import com.huawei.digitalpayment.consumer.loginModule.login.viewmodel.CheckIdentityViewModel_HiltModules;
import dagger.internal.Factory;

public final class CheckIdentityViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 27;
        component3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            get();
            obj.hashCode();
            throw null;
        }
        Boolean bool = get();
        int i3 = ShareDataUIState + 61;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            return bool;
        }
        obj.hashCode();
        throw null;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = component3 + 9;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            Boolean.valueOf(provide());
            throw null;
        }
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i3 = component3 + 69;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            return boolValueOf;
        }
        throw null;
    }

    public static CheckIdentityViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = component3 + 75;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        CheckIdentityViewModel_HiltModules_KeyModule_ProvideFactory checkIdentityViewModel_HiltModules_KeyModule_ProvideFactory = ShareDataUIState.component2;
        if (i3 != 0) {
            int i4 = 79 / 0;
        }
        return checkIdentityViewModel_HiltModules_KeyModule_ProvideFactory;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = component3 + 121;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return CheckIdentityViewModel_HiltModules.KeyModule.provide();
        }
        CheckIdentityViewModel_HiltModules.KeyModule.provide();
        throw null;
    }

    static final class ShareDataUIState {
        static final CheckIdentityViewModel_HiltModules_KeyModule_ProvideFactory component2 = new CheckIdentityViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int component3 = 0;
        private static int copydefault = 1;

        private ShareDataUIState() {
        }

        static {
            int i = copydefault + 113;
            component3 = i % 128;
            int i2 = i % 2;
        }
    }
}
