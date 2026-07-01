package com.huawei.digitalpayment.consumer.qrcode.viewmodel;

import com.huawei.digitalpayment.consumer.qrcode.viewmodel.PayViewCodeModel_HiltModules;
import dagger.internal.Factory;

public final class PayViewCodeModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 113;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            get();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Boolean bool = get();
        int i3 = component2 + 23;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return bool;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = component2 + 69;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = provide();
        if (i3 == 0) {
            return Boolean.valueOf(zProvide);
        }
        Boolean.valueOf(zProvide);
        throw null;
    }

    public static PayViewCodeModel_HiltModules_KeyModule_ProvideFactory create() {
        PayViewCodeModel_HiltModules_KeyModule_ProvideFactory payViewCodeModel_HiltModules_KeyModule_ProvideFactory;
        int i = 2 % 2;
        int i2 = component2 + 43;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            payViewCodeModel_HiltModules_KeyModule_ProvideFactory = component1.component2;
            int i3 = 52 / 0;
        } else {
            payViewCodeModel_HiltModules_KeyModule_ProvideFactory = component1.component2;
        }
        int i4 = component2 + 49;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 72 / 0;
        }
        return payViewCodeModel_HiltModules_KeyModule_ProvideFactory;
    }

    public static boolean provide() {
        boolean zProvide;
        int i = 2 % 2;
        int i2 = component2 + 93;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            zProvide = PayViewCodeModel_HiltModules.KeyModule.provide();
            int i3 = 23 / 0;
        } else {
            zProvide = PayViewCodeModel_HiltModules.KeyModule.provide();
        }
        int i4 = component2 + 89;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return zProvide;
    }

    static final class component1 {
        private static int component1 = 1;
        static final PayViewCodeModel_HiltModules_KeyModule_ProvideFactory component2 = new PayViewCodeModel_HiltModules_KeyModule_ProvideFactory();
        private static int component3;

        private component1() {
        }

        static {
            int i = component3 + 75;
            component1 = i % 128;
            if (i % 2 == 0) {
                int i2 = 40 / 0;
            }
        }
    }
}
