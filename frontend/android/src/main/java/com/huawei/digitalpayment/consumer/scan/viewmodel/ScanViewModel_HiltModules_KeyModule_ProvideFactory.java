package com.huawei.digitalpayment.consumer.scan.viewmodel;

import com.huawei.digitalpayment.consumer.scan.viewmodel.ScanViewModel_HiltModules;
import dagger.internal.Factory;

public final class ScanViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int ShareDataUIState = 1;
    private static int component1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 53;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            get();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Boolean bool = get();
        int i3 = component1 + 77;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return bool;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = component1 + 19;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            Boolean.valueOf(provide());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i3 = component1 + 119;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return boolValueOf;
    }

    public static ScanViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = component1 + 109;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ScanViewModel_HiltModules_KeyModule_ProvideFactory scanViewModel_HiltModules_KeyModule_ProvideFactory = component1.component1;
        if (i3 != 0) {
            return scanViewModel_HiltModules_KeyModule_ProvideFactory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = component1 + 55;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = ScanViewModel_HiltModules.KeyModule.provide();
        int i4 = component1 + 87;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return zProvide;
    }

    static final class component1 {
        private static int ShareDataUIState = 0;
        static final ScanViewModel_HiltModules_KeyModule_ProvideFactory component1 = new ScanViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int component2 = 1;

        private component1() {
        }

        static {
            int i = ShareDataUIState + 95;
            component2 = i % 128;
            int i2 = i % 2;
        }
    }
}
