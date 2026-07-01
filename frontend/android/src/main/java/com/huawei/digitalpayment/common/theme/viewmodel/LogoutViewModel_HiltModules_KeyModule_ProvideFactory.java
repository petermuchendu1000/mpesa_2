package com.huawei.digitalpayment.common.theme.viewmodel;

import com.huawei.digitalpayment.common.theme.viewmodel.LogoutViewModel_HiltModules;
import dagger.internal.Factory;

public final class LogoutViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 19;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        int i4 = copydefault + 91;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return bool;
        }
        throw null;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 67;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = provide();
        if (i3 != 0) {
            return Boolean.valueOf(zProvide);
        }
        Boolean.valueOf(zProvide);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static LogoutViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = copydefault + 101;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        LogoutViewModel_HiltModules_KeyModule_ProvideFactory logoutViewModel_HiltModules_KeyModule_ProvideFactory = component2.component3;
        if (i3 != 0) {
            int i4 = 59 / 0;
        }
        return logoutViewModel_HiltModules_KeyModule_ProvideFactory;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = copydefault + 53;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return LogoutViewModel_HiltModules.KeyModule.provide();
        }
        LogoutViewModel_HiltModules.KeyModule.provide();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class component2 {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;
        static final LogoutViewModel_HiltModules_KeyModule_ProvideFactory component3 = new LogoutViewModel_HiltModules_KeyModule_ProvideFactory();

        private component2() {
        }

        static {
            int i = component2 + 17;
            ShareDataUIState = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
