package com.huawei.digitalpayment.consumer.qrcode.viewmodel;

import com.huawei.digitalpayment.consumer.qrcode.viewmodel.PartnerReceiveCodeViewModel_HiltModules;
import dagger.internal.Factory;

public final class PartnerReceiveCodeViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int component1 = 0;
    private static int copydefault = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component1 + 53;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return get();
        }
        get();
        throw null;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = component1 + 59;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i4 = component1 + 83;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }

    public static PartnerReceiveCodeViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = copydefault + 83;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        PartnerReceiveCodeViewModel_HiltModules_KeyModule_ProvideFactory partnerReceiveCodeViewModel_HiltModules_KeyModule_ProvideFactory = ShareDataUIState.ShareDataUIState;
        int i4 = component1 + 111;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 79 / 0;
        }
        return partnerReceiveCodeViewModel_HiltModules_KeyModule_ProvideFactory;
    }

    public static boolean provide() {
        boolean zProvide;
        int i = 2 % 2;
        int i2 = copydefault + 51;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            zProvide = PartnerReceiveCodeViewModel_HiltModules.KeyModule.provide();
            int i3 = 86 / 0;
        } else {
            zProvide = PartnerReceiveCodeViewModel_HiltModules.KeyModule.provide();
        }
        int i4 = component1 + 101;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 96 / 0;
        }
        return zProvide;
    }

    static final class ShareDataUIState {
        static final PartnerReceiveCodeViewModel_HiltModules_KeyModule_ProvideFactory ShareDataUIState = new PartnerReceiveCodeViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int component2 = 1;
        private static int component3;

        private ShareDataUIState() {
        }

        static {
            int i = component2 + 27;
            component3 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }
    }
}
