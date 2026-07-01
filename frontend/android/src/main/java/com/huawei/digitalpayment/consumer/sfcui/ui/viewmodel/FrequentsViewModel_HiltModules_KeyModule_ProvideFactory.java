package com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel;

import com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.FrequentsViewModel_HiltModules;
import dagger.internal.Factory;

public final class FrequentsViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int component1 = 1;
    private static int component2;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component1 + 109;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        int i4 = component1 + 121;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 55 / 0;
        }
        return bool;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = component1 + 67;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        if (i3 != 0) {
            int i4 = 11 / 0;
        }
        return boolValueOf;
    }

    public static FrequentsViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = component2 + 35;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return copydefault.copydefault;
        }
        int i3 = 2 / 0;
        return copydefault.copydefault;
    }

    public static boolean provide() {
        boolean zProvide;
        int i = 2 % 2;
        int i2 = component1 + 111;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            zProvide = FrequentsViewModel_HiltModules.KeyModule.provide();
            int i3 = 0 / 0;
        } else {
            zProvide = FrequentsViewModel_HiltModules.KeyModule.provide();
        }
        int i4 = component1 + 123;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return zProvide;
    }

    static final class copydefault {
        private static int component1 = 1;
        private static int component2;
        static final FrequentsViewModel_HiltModules_KeyModule_ProvideFactory copydefault = new FrequentsViewModel_HiltModules_KeyModule_ProvideFactory();

        private copydefault() {
        }

        static {
            int i = component2 + 3;
            component1 = i % 128;
            int i2 = i % 2;
        }
    }
}
