package com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager;

import com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerViewModel_HiltModules;
import dagger.internal.Factory;

public final class BillManagerViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int component2 = 0;
    private static int copydefault = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 67;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        int i4 = copydefault + 39;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 10 / 0;
        }
        return bool;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = component2 + 121;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = provide();
        if (i3 != 0) {
            return Boolean.valueOf(zProvide);
        }
        Boolean.valueOf(zProvide);
        throw null;
    }

    public static BillManagerViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = copydefault + 23;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        BillManagerViewModel_HiltModules_KeyModule_ProvideFactory billManagerViewModel_HiltModules_KeyModule_ProvideFactory = component3.component2;
        int i4 = component2 + 15;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return billManagerViewModel_HiltModules_KeyModule_ProvideFactory;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = copydefault + 117;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            BillManagerViewModel_HiltModules.KeyModule.provide();
            throw null;
        }
        boolean zProvide = BillManagerViewModel_HiltModules.KeyModule.provide();
        int i3 = component2 + 55;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            return zProvide;
        }
        throw null;
    }

    static final class component3 {
        private static int ShareDataUIState = 0;
        static final BillManagerViewModel_HiltModules_KeyModule_ProvideFactory component2 = new BillManagerViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int component3 = 1;

        private component3() {
        }

        static {
            int i = component3 + 81;
            ShareDataUIState = i % 128;
            int i2 = i % 2;
        }
    }
}
