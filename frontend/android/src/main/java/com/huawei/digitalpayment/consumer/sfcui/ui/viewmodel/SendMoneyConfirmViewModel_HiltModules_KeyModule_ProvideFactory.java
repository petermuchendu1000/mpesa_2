package com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel;

import com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.SendMoneyConfirmViewModel_HiltModules;
import dagger.internal.Factory;

public final class SendMoneyConfirmViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 65;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        int i4 = ShareDataUIState + 35;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return bool;
        }
        throw null;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 11;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i4 = ShareDataUIState + 35;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }

    public static SendMoneyConfirmViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = copydefault + 25;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        SendMoneyConfirmViewModel_HiltModules_KeyModule_ProvideFactory sendMoneyConfirmViewModel_HiltModules_KeyModule_ProvideFactory = component1.copydefault;
        int i4 = ShareDataUIState + 35;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return sendMoneyConfirmViewModel_HiltModules_KeyModule_ProvideFactory;
        }
        throw null;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = copydefault + 53;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = SendMoneyConfirmViewModel_HiltModules.KeyModule.provide();
        if (i3 != 0) {
            int i4 = 7 / 0;
        }
        return zProvide;
    }

    static final class component1 {
        private static int component2 = 0;
        private static int component3 = 1;
        static final SendMoneyConfirmViewModel_HiltModules_KeyModule_ProvideFactory copydefault = new SendMoneyConfirmViewModel_HiltModules_KeyModule_ProvideFactory();

        private component1() {
        }

        static {
            int i = component2 + 117;
            component3 = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
