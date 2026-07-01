package com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry;

import com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry.NoExpiryViewModel_HiltModules;
import dagger.internal.Factory;

public final class NoExpiryViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int component2 = 0;
    private static int copydefault = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 113;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        if (i3 == 0) {
            int i4 = 65 / 0;
        }
        return bool;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = copydefault + 27;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i4 = copydefault + 57;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }

    public static NoExpiryViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = component2 + 91;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        NoExpiryViewModel_HiltModules_KeyModule_ProvideFactory noExpiryViewModel_HiltModules_KeyModule_ProvideFactory = component1.copydefault;
        if (i3 != 0) {
            return noExpiryViewModel_HiltModules_KeyModule_ProvideFactory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = copydefault + 11;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = NoExpiryViewModel_HiltModules.KeyModule.provide();
        int i4 = component2 + 121;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return zProvide;
    }

    static final class component1 {
        private static int ShareDataUIState = 1;
        private static int component3;
        static final NoExpiryViewModel_HiltModules_KeyModule_ProvideFactory copydefault = new NoExpiryViewModel_HiltModules_KeyModule_ProvideFactory();

        private component1() {
        }

        static {
            int i = component3 + 113;
            ShareDataUIState = i % 128;
            if (i % 2 == 0) {
                int i2 = 30 / 0;
            }
        }
    }
}
