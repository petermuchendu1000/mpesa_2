package com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.diybundles;

import com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.diybundles.DiyBundlesViewModel_HiltModules;
import dagger.internal.Factory;

public final class DiyBundlesViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int ShareDataUIState = 1;
    private static int component2;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 107;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        int i4 = component2 + 39;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 79;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i4 = ShareDataUIState + 17;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }

    public static DiyBundlesViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 37;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        DiyBundlesViewModel_HiltModules_KeyModule_ProvideFactory diyBundlesViewModel_HiltModules_KeyModule_ProvideFactory = copydefault.ShareDataUIState;
        if (i3 == 0) {
            return diyBundlesViewModel_HiltModules_KeyModule_ProvideFactory;
        }
        throw null;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = component2 + 125;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return DiyBundlesViewModel_HiltModules.KeyModule.provide();
        }
        DiyBundlesViewModel_HiltModules.KeyModule.provide();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class copydefault {
        static final DiyBundlesViewModel_HiltModules_KeyModule_ProvideFactory ShareDataUIState = new DiyBundlesViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int component2 = 0;
        private static int component3 = 1;

        private copydefault() {
        }

        static {
            int i = component2 + 63;
            component3 = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
