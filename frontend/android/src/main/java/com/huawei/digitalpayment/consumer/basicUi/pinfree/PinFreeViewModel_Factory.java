package com.huawei.digitalpayment.consumer.basicUi.pinfree;

import dagger.internal.Factory;

public final class PinFreeViewModel_Factory implements Factory<PinFreeViewModel> {
    private static int component2 = 0;
    private static int component3 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 21;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        PinFreeViewModel pinFreeViewModel = get();
        int i4 = component2 + 7;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return pinFreeViewModel;
    }

    @Override
    public PinFreeViewModel get() {
        int i = 2 % 2;
        int i2 = component3 + 49;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        PinFreeViewModel pinFreeViewModelNewInstance = newInstance();
        int i4 = component3 + 121;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return pinFreeViewModelNewInstance;
    }

    public static PinFreeViewModel_Factory create() {
        int i = 2 % 2;
        int i2 = component2 + 81;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        PinFreeViewModel_Factory pinFreeViewModel_Factory = ShareDataUIState.component3;
        if (i3 == 0) {
            int i4 = 63 / 0;
        }
        return pinFreeViewModel_Factory;
    }

    public static PinFreeViewModel newInstance() {
        int i = 2 % 2;
        PinFreeViewModel pinFreeViewModel = new PinFreeViewModel();
        int i2 = component3 + 65;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return pinFreeViewModel;
        }
        throw null;
    }

    static final class ShareDataUIState {
        private static int component1 = 1;
        private static int component2;
        static final PinFreeViewModel_Factory component3 = new PinFreeViewModel_Factory();

        private ShareDataUIState() {
        }

        static {
            int i = component2 + 9;
            component1 = i % 128;
            int i2 = i % 2;
        }
    }
}
