package com.huawei.digitalpayment.consumer.basicUi.viewmodel;

import com.huawei.digitalpayment.consumer.basicUi.viewmodel.AppShareViewModel_HiltModules;
import dagger.internal.Factory;

public final class AppShareViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 79;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return get();
        }
        get();
        throw null;
    }

    @Override
    public Boolean get() {
        Boolean boolValueOf;
        int i = 2 % 2;
        int i2 = component3 + 61;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            boolValueOf = Boolean.valueOf(provide());
            int i3 = 61 / 0;
        } else {
            boolValueOf = Boolean.valueOf(provide());
        }
        int i4 = component3 + 15;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }

    public static AppShareViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 77;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        AppShareViewModel_HiltModules_KeyModule_ProvideFactory appShareViewModel_HiltModules_KeyModule_ProvideFactory = component1.copydefault;
        int i4 = ShareDataUIState + 87;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return appShareViewModel_HiltModules_KeyModule_ProvideFactory;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 103;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            AppShareViewModel_HiltModules.KeyModule.provide();
            throw null;
        }
        boolean zProvide = AppShareViewModel_HiltModules.KeyModule.provide();
        int i3 = ShareDataUIState + 93;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return zProvide;
    }

    static final class component1 {
        private static int ShareDataUIState = 1;
        private static int component3;
        static final AppShareViewModel_HiltModules_KeyModule_ProvideFactory copydefault = new AppShareViewModel_HiltModules_KeyModule_ProvideFactory();

        private component1() {
        }

        static {
            int i = ShareDataUIState + 69;
            component3 = i % 128;
            int i2 = i % 2;
        }
    }
}
