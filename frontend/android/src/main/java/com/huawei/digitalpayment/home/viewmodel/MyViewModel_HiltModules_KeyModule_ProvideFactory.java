package com.huawei.digitalpayment.home.viewmodel;

import com.huawei.digitalpayment.home.viewmodel.MyViewModel_HiltModules;
import dagger.internal.Factory;

public final class MyViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int component1 = 0;
    private static int component2 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component1 + 37;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        int i4 = component2 + 73;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    @Override
    public Boolean get() {
        Boolean boolValueOf;
        int i = 2 % 2;
        int i2 = component2 + 47;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            boolValueOf = Boolean.valueOf(provide());
            int i3 = 78 / 0;
        } else {
            boolValueOf = Boolean.valueOf(provide());
        }
        int i4 = component2 + 41;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }

    public static MyViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = component2 + 1;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        MyViewModel_HiltModules_KeyModule_ProvideFactory myViewModel_HiltModules_KeyModule_ProvideFactory = component1.ShareDataUIState;
        if (i3 != 0) {
            int i4 = 37 / 0;
        }
        return myViewModel_HiltModules_KeyModule_ProvideFactory;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = component1 + 3;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            MyViewModel_HiltModules.KeyModule.provide();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zProvide = MyViewModel_HiltModules.KeyModule.provide();
        int i3 = component1 + 95;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return zProvide;
    }

    static final class component1 {
        static final MyViewModel_HiltModules_KeyModule_ProvideFactory ShareDataUIState = new MyViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int component1 = 1;
        private static int component2;

        private component1() {
        }

        static {
            int i = component1 + 11;
            component2 = i % 128;
            int i2 = i % 2;
        }
    }
}
