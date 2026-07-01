package com.huawei.digitalpayment.consumer.basicUi.pinfree.viewmodel;

import com.huawei.digitalpayment.consumer.basicUi.pinfree.viewmodel.ManagePinFreeViewModel_HiltModules;
import dagger.internal.Factory;

public final class ManagePinFreeViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int component2 = 1;
    private static int copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 61;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            get();
            throw null;
        }
        Boolean bool = get();
        int i3 = component2 + 111;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return bool;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = copydefault + 103;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i4 = copydefault + 5;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 0 / 0;
        }
        return boolValueOf;
    }

    public static ManagePinFreeViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = component2 + 21;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ManagePinFreeViewModel_HiltModules_KeyModule_ProvideFactory managePinFreeViewModel_HiltModules_KeyModule_ProvideFactory = ShareDataUIState.component1;
        int i4 = copydefault + 89;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return managePinFreeViewModel_HiltModules_KeyModule_ProvideFactory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = component2 + 105;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = ManagePinFreeViewModel_HiltModules.KeyModule.provide();
        if (i3 != 0) {
            int i4 = 6 / 0;
        }
        return zProvide;
    }

    static final class ShareDataUIState {
        static final ManagePinFreeViewModel_HiltModules_KeyModule_ProvideFactory component1 = new ManagePinFreeViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int component2 = 0;
        private static int component3 = 1;

        private ShareDataUIState() {
        }

        static {
            int i = component3 + 123;
            component2 = i % 128;
            int i2 = i % 2;
        }
    }
}
