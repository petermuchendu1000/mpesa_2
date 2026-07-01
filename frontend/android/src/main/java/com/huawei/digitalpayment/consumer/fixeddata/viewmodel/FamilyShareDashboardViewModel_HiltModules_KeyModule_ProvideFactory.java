package com.huawei.digitalpayment.consumer.fixeddata.viewmodel;

import com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FamilyShareDashboardViewModel_HiltModules;
import dagger.internal.Factory;

public final class FamilyShareDashboardViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int ShareDataUIState = 1;
    private static int component1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component1 + 87;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            get();
            throw null;
        }
        Boolean bool = get();
        int i3 = component1 + 49;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            return bool;
        }
        throw null;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = component1 + 63;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        if (i3 == 0) {
            int i4 = 93 / 0;
        }
        return boolValueOf;
    }

    public static FamilyShareDashboardViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 61;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FamilyShareDashboardViewModel_HiltModules_KeyModule_ProvideFactory familyShareDashboardViewModel_HiltModules_KeyModule_ProvideFactory = component1.component3;
        int i4 = ShareDataUIState + 19;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 15 / 0;
        }
        return familyShareDashboardViewModel_HiltModules_KeyModule_ProvideFactory;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = component1 + 31;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return FamilyShareDashboardViewModel_HiltModules.KeyModule.provide();
        }
        FamilyShareDashboardViewModel_HiltModules.KeyModule.provide();
        throw null;
    }

    static final class component1 {
        private static int component1 = 1;
        static final FamilyShareDashboardViewModel_HiltModules_KeyModule_ProvideFactory component3 = new FamilyShareDashboardViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int copydefault;

        private component1() {
        }

        static {
            int i = copydefault + 91;
            component1 = i % 128;
            int i2 = i % 2;
        }
    }
}
