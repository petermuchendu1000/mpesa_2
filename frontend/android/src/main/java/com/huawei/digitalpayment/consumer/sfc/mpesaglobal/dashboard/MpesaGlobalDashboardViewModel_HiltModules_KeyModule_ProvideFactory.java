package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.dashboard;

import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.dashboard.MpesaGlobalDashboardViewModel_HiltModules;
import dagger.internal.Factory;

public final class MpesaGlobalDashboardViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int component1 = 0;
    private static int component3 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component1 + 95;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        int i4 = component3 + 85;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = component3 + 55;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i4 = component1 + 37;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }

    public static MpesaGlobalDashboardViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = component3 + 31;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            MpesaGlobalDashboardViewModel_HiltModules_KeyModule_ProvideFactory mpesaGlobalDashboardViewModel_HiltModules_KeyModule_ProvideFactory = copydefault.copydefault;
            throw null;
        }
        MpesaGlobalDashboardViewModel_HiltModules_KeyModule_ProvideFactory mpesaGlobalDashboardViewModel_HiltModules_KeyModule_ProvideFactory2 = copydefault.copydefault;
        int i3 = component3 + 69;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return mpesaGlobalDashboardViewModel_HiltModules_KeyModule_ProvideFactory2;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = component3 + 111;
        component1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            MpesaGlobalDashboardViewModel_HiltModules.KeyModule.provide();
            throw null;
        }
        boolean zProvide = MpesaGlobalDashboardViewModel_HiltModules.KeyModule.provide();
        int i3 = component1 + 111;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            return zProvide;
        }
        obj.hashCode();
        throw null;
    }

    static final class copydefault {
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        static final MpesaGlobalDashboardViewModel_HiltModules_KeyModule_ProvideFactory copydefault = new MpesaGlobalDashboardViewModel_HiltModules_KeyModule_ProvideFactory();

        private copydefault() {
        }

        static {
            int i = ShareDataUIState + 61;
            component1 = i % 128;
            int i2 = i % 2;
        }
    }
}
