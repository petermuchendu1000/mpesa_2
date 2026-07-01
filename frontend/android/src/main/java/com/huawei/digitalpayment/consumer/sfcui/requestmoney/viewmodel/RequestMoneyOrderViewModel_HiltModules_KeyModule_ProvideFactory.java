package com.huawei.digitalpayment.consumer.sfcui.requestmoney.viewmodel;

import com.huawei.digitalpayment.consumer.sfcui.requestmoney.viewmodel.RequestMoneyOrderViewModel_HiltModules;
import dagger.internal.Factory;

public final class RequestMoneyOrderViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int ShareDataUIState = 1;
    private static int component2;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 79;
        component2 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            get();
            obj.hashCode();
            throw null;
        }
        Boolean bool = get();
        int i3 = ShareDataUIState + 103;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            return bool;
        }
        throw null;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 3;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = provide();
        if (i3 == 0) {
            return Boolean.valueOf(zProvide);
        }
        Boolean.valueOf(zProvide);
        throw null;
    }

    public static RequestMoneyOrderViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = component2 + 79;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            RequestMoneyOrderViewModel_HiltModules_KeyModule_ProvideFactory requestMoneyOrderViewModel_HiltModules_KeyModule_ProvideFactory = component2.copydefault;
            throw null;
        }
        RequestMoneyOrderViewModel_HiltModules_KeyModule_ProvideFactory requestMoneyOrderViewModel_HiltModules_KeyModule_ProvideFactory2 = component2.copydefault;
        int i3 = ShareDataUIState + 7;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return requestMoneyOrderViewModel_HiltModules_KeyModule_ProvideFactory2;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 109;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return RequestMoneyOrderViewModel_HiltModules.KeyModule.provide();
        }
        RequestMoneyOrderViewModel_HiltModules.KeyModule.provide();
        throw null;
    }

    static final class component2 {
        private static int ShareDataUIState = 1;
        private static int component3;
        static final RequestMoneyOrderViewModel_HiltModules_KeyModule_ProvideFactory copydefault = new RequestMoneyOrderViewModel_HiltModules_KeyModule_ProvideFactory();

        private component2() {
        }

        static {
            int i = component3 + 23;
            ShareDataUIState = i % 128;
            int i2 = i % 2;
        }
    }
}
