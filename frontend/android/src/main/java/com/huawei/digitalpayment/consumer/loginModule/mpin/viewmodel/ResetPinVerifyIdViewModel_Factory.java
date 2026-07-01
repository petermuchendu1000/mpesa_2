package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import dagger.internal.Factory;

public final class ResetPinVerifyIdViewModel_Factory implements Factory<ResetPinVerifyIdViewModel> {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 115;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ResetPinVerifyIdViewModel resetPinVerifyIdViewModel = get();
        if (i3 == 0) {
            int i4 = 3 / 0;
        }
        return resetPinVerifyIdViewModel;
    }

    @Override
    public ResetPinVerifyIdViewModel get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 13;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ResetPinVerifyIdViewModel resetPinVerifyIdViewModelNewInstance = newInstance();
        int i4 = component1 + 1;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return resetPinVerifyIdViewModelNewInstance;
    }

    public static ResetPinVerifyIdViewModel_Factory create() {
        int i = 2 % 2;
        int i2 = component1 + 43;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ResetPinVerifyIdViewModel_Factory resetPinVerifyIdViewModel_Factory = component1.copydefault;
        int i4 = ShareDataUIState + 17;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return resetPinVerifyIdViewModel_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ResetPinVerifyIdViewModel newInstance() {
        int i = 2 % 2;
        ResetPinVerifyIdViewModel resetPinVerifyIdViewModel = new ResetPinVerifyIdViewModel();
        int i2 = component1 + 107;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return resetPinVerifyIdViewModel;
    }

    static final class component1 {
        private static int component2 = 0;
        private static int component3 = 1;
        static final ResetPinVerifyIdViewModel_Factory copydefault = new ResetPinVerifyIdViewModel_Factory();

        private component1() {
        }

        static {
            int i = component2 + 65;
            component3 = i % 128;
            int i2 = i % 2;
        }
    }
}
