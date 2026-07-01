package com.huawei.digitalpayment.consumer.sfcui.servicepin.viewmodel;

import dagger.internal.Factory;

public final class ServicePinViewModel_Factory implements Factory<ServicePinViewModel> {
    private static int component1 = 1;
    private static int component2;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component1 + 75;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return get();
        }
        get();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public ServicePinViewModel get() {
        ServicePinViewModel servicePinViewModelNewInstance;
        int i = 2 % 2;
        int i2 = component1 + 77;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            servicePinViewModelNewInstance = newInstance();
            int i3 = 99 / 0;
        } else {
            servicePinViewModelNewInstance = newInstance();
        }
        int i4 = component1 + 29;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return servicePinViewModelNewInstance;
    }

    public static ServicePinViewModel_Factory create() {
        ServicePinViewModel_Factory servicePinViewModel_Factory;
        int i = 2 % 2;
        int i2 = component2 + 111;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            servicePinViewModel_Factory = copydefault.copydefault;
            int i3 = 44 / 0;
        } else {
            servicePinViewModel_Factory = copydefault.copydefault;
        }
        int i4 = component1 + 83;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return servicePinViewModel_Factory;
    }

    public static ServicePinViewModel newInstance() {
        int i = 2 % 2;
        ServicePinViewModel servicePinViewModel = new ServicePinViewModel();
        int i2 = component2 + 49;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return servicePinViewModel;
        }
        throw null;
    }

    static final class copydefault {
        private static int ShareDataUIState = 1;
        private static int component1;
        static final ServicePinViewModel_Factory copydefault = new ServicePinViewModel_Factory();

        private copydefault() {
        }

        static {
            int i = ShareDataUIState + 67;
            component1 = i % 128;
            if (i % 2 != 0) {
                int i2 = 23 / 0;
            }
        }
    }
}
