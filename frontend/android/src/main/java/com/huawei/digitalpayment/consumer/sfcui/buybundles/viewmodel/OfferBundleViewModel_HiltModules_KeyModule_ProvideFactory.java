package com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel;

import com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.OfferBundleViewModel_HiltModules;
import dagger.internal.Factory;

public final class OfferBundleViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int component3 = 1;
    private static int copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = copydefault + 71;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        int i4 = component3 + 9;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = component3 + 53;
        copydefault = i2 % 128;
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

    public static OfferBundleViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = copydefault + 119;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        OfferBundleViewModel_HiltModules_KeyModule_ProvideFactory offerBundleViewModel_HiltModules_KeyModule_ProvideFactory = copydefault.component1;
        int i4 = component3 + 81;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return offerBundleViewModel_HiltModules_KeyModule_ProvideFactory;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = component3 + 85;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = OfferBundleViewModel_HiltModules.KeyModule.provide();
        int i4 = component3 + 37;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return zProvide;
        }
        throw null;
    }

    static final class copydefault {
        private static int ShareDataUIState = 0;
        static final OfferBundleViewModel_HiltModules_KeyModule_ProvideFactory component1 = new OfferBundleViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int component3 = 1;

        private copydefault() {
        }

        static {
            int i = component3 + 121;
            ShareDataUIState = i % 128;
            if (i % 2 != 0) {
                int i2 = 17 / 0;
            }
        }
    }
}
