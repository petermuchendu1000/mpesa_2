package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country;

import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.MpesaGlobalCountriesViewModel_HiltModules;
import dagger.internal.Factory;

public final class MpesaGlobalCountriesViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int ShareDataUIState = 1;
    private static int copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 15;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return get();
        }
        get();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = copydefault + 59;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = provide();
        if (i3 != 0) {
            return Boolean.valueOf(zProvide);
        }
        Boolean.valueOf(zProvide);
        throw null;
    }

    public static MpesaGlobalCountriesViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 63;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            MpesaGlobalCountriesViewModel_HiltModules_KeyModule_ProvideFactory mpesaGlobalCountriesViewModel_HiltModules_KeyModule_ProvideFactory = copydefault.copydefault;
            throw null;
        }
        MpesaGlobalCountriesViewModel_HiltModules_KeyModule_ProvideFactory mpesaGlobalCountriesViewModel_HiltModules_KeyModule_ProvideFactory2 = copydefault.copydefault;
        int i3 = copydefault + 11;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return mpesaGlobalCountriesViewModel_HiltModules_KeyModule_ProvideFactory2;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 83;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = MpesaGlobalCountriesViewModel_HiltModules.KeyModule.provide();
        if (i3 != 0) {
            int i4 = 18 / 0;
        }
        return zProvide;
    }

    static final class copydefault {
        private static int component2 = 0;
        private static int component3 = 1;
        static final MpesaGlobalCountriesViewModel_HiltModules_KeyModule_ProvideFactory copydefault = new MpesaGlobalCountriesViewModel_HiltModules_KeyModule_ProvideFactory();

        private copydefault() {
        }

        static {
            int i = component2 + 45;
            component3 = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }
    }
}
