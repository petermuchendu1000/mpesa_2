package com.huawei.digitalpayment.home.theme.viewmodel;

import com.huawei.digitalpayment.home.theme.viewmodel.MyServicesViewModel_HiltModules;
import dagger.internal.Factory;

public final class MyServicesViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 51;
        component1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            get();
            throw null;
        }
        Boolean bool = get();
        int i3 = ShareDataUIState + 41;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            return bool;
        }
        obj.hashCode();
        throw null;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = component1 + 63;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = provide();
        if (i3 == 0) {
            return Boolean.valueOf(zProvide);
        }
        Boolean.valueOf(zProvide);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static MyServicesViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 41;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        MyServicesViewModel_HiltModules_KeyModule_ProvideFactory myServicesViewModel_HiltModules_KeyModule_ProvideFactory = component1.component1;
        int i4 = component1 + 47;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return myServicesViewModel_HiltModules_KeyModule_ProvideFactory;
        }
        throw null;
    }

    public static boolean provide() {
        boolean zProvide;
        int i = 2 % 2;
        int i2 = component1 + 125;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            zProvide = MyServicesViewModel_HiltModules.KeyModule.provide();
            int i3 = 61 / 0;
        } else {
            zProvide = MyServicesViewModel_HiltModules.KeyModule.provide();
        }
        int i4 = component1 + 35;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return zProvide;
    }

    static final class component1 {
        private static int ShareDataUIState = 1;
        static final MyServicesViewModel_HiltModules_KeyModule_ProvideFactory component1 = new MyServicesViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int component2;

        private component1() {
        }

        static {
            int i = component2 + 111;
            ShareDataUIState = i % 128;
            int i2 = i % 2;
        }
    }
}
