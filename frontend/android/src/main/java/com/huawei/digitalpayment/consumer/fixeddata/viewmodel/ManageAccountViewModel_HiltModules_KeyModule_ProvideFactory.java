package com.huawei.digitalpayment.consumer.fixeddata.viewmodel;

import com.huawei.digitalpayment.consumer.fixeddata.viewmodel.ManageAccountViewModel_HiltModules;
import dagger.internal.Factory;

public final class ManageAccountViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 103;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            get();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Boolean bool = get();
        int i3 = component1 + 15;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return bool;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 83;
        component1 = i2 % 128;
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

    public static ManageAccountViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = component1 + 117;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ManageAccountViewModel_HiltModules_KeyModule_ProvideFactory manageAccountViewModel_HiltModules_KeyModule_ProvideFactory = component1.ShareDataUIState;
        int i4 = ShareDataUIState + 83;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return manageAccountViewModel_HiltModules_KeyModule_ProvideFactory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static boolean provide() {
        boolean zProvide;
        int i = 2 % 2;
        int i2 = component1 + 103;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            zProvide = ManageAccountViewModel_HiltModules.KeyModule.provide();
            int i3 = 17 / 0;
        } else {
            zProvide = ManageAccountViewModel_HiltModules.KeyModule.provide();
        }
        int i4 = component1 + 55;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return zProvide;
    }

    static final class component1 {
        static final ManageAccountViewModel_HiltModules_KeyModule_ProvideFactory ShareDataUIState = new ManageAccountViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int component3 = 0;
        private static int copydefault = 1;

        private component1() {
        }

        static {
            int i = copydefault + 11;
            component3 = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
