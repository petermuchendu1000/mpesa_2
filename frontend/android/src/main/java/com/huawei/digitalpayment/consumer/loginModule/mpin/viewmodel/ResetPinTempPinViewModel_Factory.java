package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import dagger.internal.Factory;

public final class ResetPinTempPinViewModel_Factory implements Factory<ResetPinTempPinViewModel> {
    private static int ShareDataUIState = 1;
    private static int component1;

    @Override
    public Object get() {
        ResetPinTempPinViewModel resetPinTempPinViewModel;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 45;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            resetPinTempPinViewModel = get();
            int i3 = 94 / 0;
        } else {
            resetPinTempPinViewModel = get();
        }
        int i4 = ShareDataUIState + 27;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return resetPinTempPinViewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public ResetPinTempPinViewModel get() {
        int i = 2 % 2;
        int i2 = component1 + 21;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            newInstance();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ResetPinTempPinViewModel resetPinTempPinViewModelNewInstance = newInstance();
        int i3 = component1 + 7;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 38 / 0;
        }
        return resetPinTempPinViewModelNewInstance;
    }

    public static ResetPinTempPinViewModel_Factory create() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 69;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ResetPinTempPinViewModel_Factory resetPinTempPinViewModel_Factory = component2.component2;
        int i4 = component1 + 19;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return resetPinTempPinViewModel_Factory;
        }
        throw null;
    }

    public static ResetPinTempPinViewModel newInstance() {
        int i = 2 % 2;
        ResetPinTempPinViewModel resetPinTempPinViewModel = new ResetPinTempPinViewModel();
        int i2 = component1 + 103;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return resetPinTempPinViewModel;
    }

    static final class component2 {
        private static int component1 = 0;
        static final ResetPinTempPinViewModel_Factory component2 = new ResetPinTempPinViewModel_Factory();
        private static int copydefault = 1;

        private component2() {
        }

        static {
            int i = component1 + 51;
            copydefault = i % 128;
            int i2 = i % 2;
        }
    }
}
