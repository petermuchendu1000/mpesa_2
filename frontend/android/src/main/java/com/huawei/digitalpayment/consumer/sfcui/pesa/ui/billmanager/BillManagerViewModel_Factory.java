package com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager;

import dagger.internal.Factory;

public final class BillManagerViewModel_Factory implements Factory<BillManagerViewModel> {
    private static int ShareDataUIState = 1;
    private static int component2;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 13;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        BillManagerViewModel billManagerViewModel = get();
        int i4 = ShareDataUIState + 85;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return billManagerViewModel;
    }

    @Override
    public BillManagerViewModel get() {
        int i = 2 % 2;
        int i2 = component2 + 13;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        BillManagerViewModel billManagerViewModelNewInstance = newInstance();
        int i4 = ShareDataUIState + 121;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 54 / 0;
        }
        return billManagerViewModelNewInstance;
    }

    public static BillManagerViewModel_Factory create() {
        int i = 2 % 2;
        int i2 = component2 + 31;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        BillManagerViewModel_Factory billManagerViewModel_Factory = component3.component1;
        int i4 = ShareDataUIState + 31;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return billManagerViewModel_Factory;
    }

    public static BillManagerViewModel newInstance() {
        int i = 2 % 2;
        BillManagerViewModel billManagerViewModel = new BillManagerViewModel();
        int i2 = ShareDataUIState + 15;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 68 / 0;
        }
        return billManagerViewModel;
    }

    static final class component3 {
        static final BillManagerViewModel_Factory component1 = new BillManagerViewModel_Factory();
        private static int component2 = 0;
        private static int component3 = 1;

        private component3() {
        }

        static {
            int i = component2 + 65;
            component3 = i % 128;
            if (i % 2 == 0) {
                int i2 = 97 / 0;
            }
        }
    }
}
