package com.huawei.digitalpayment.consumer.manageandviewdata.ui.usage.viewmodels;

import com.huawei.digitalpayment.consumer.manageandviewdata.ui.usage.viewmodels.DeviceDataUsageViewModel_HiltModules;
import dagger.internal.Factory;

public final class DeviceDataUsageViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int component3 = 0;
    private static int copydefault = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = copydefault + 1;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        int i4 = component3 + 81;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = copydefault + 75;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i4 = copydefault + 61;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }

    public static DeviceDataUsageViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = copydefault + 41;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            DeviceDataUsageViewModel_HiltModules_KeyModule_ProvideFactory deviceDataUsageViewModel_HiltModules_KeyModule_ProvideFactory = ShareDataUIState.copydefault;
            throw null;
        }
        DeviceDataUsageViewModel_HiltModules_KeyModule_ProvideFactory deviceDataUsageViewModel_HiltModules_KeyModule_ProvideFactory2 = ShareDataUIState.copydefault;
        int i3 = copydefault + 51;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            return deviceDataUsageViewModel_HiltModules_KeyModule_ProvideFactory2;
        }
        throw null;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = component3 + 81;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = DeviceDataUsageViewModel_HiltModules.KeyModule.provide();
        int i4 = copydefault + 51;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 49 / 0;
        }
        return zProvide;
    }

    static final class ShareDataUIState {
        private static int component2 = 0;
        private static int component3 = 1;
        static final DeviceDataUsageViewModel_HiltModules_KeyModule_ProvideFactory copydefault = new DeviceDataUsageViewModel_HiltModules_KeyModule_ProvideFactory();

        private ShareDataUIState() {
        }

        static {
            int i = component3 + 51;
            component2 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }
    }
}
