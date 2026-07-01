package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels;

import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestHistoryViewModel_HiltModules;
import dagger.internal.Factory;

public final class SpeedTestHistoryViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 101;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        int i4 = component2 + 63;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return bool;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 15;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i4 = component2 + 95;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }

    public static SpeedTestHistoryViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 25;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        SpeedTestHistoryViewModel_HiltModules_KeyModule_ProvideFactory speedTestHistoryViewModel_HiltModules_KeyModule_ProvideFactory = component2.copydefault;
        int i4 = ShareDataUIState + 95;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return speedTestHistoryViewModel_HiltModules_KeyModule_ProvideFactory;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 117;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            SpeedTestHistoryViewModel_HiltModules.KeyModule.provide();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zProvide = SpeedTestHistoryViewModel_HiltModules.KeyModule.provide();
        int i3 = ShareDataUIState + 41;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return zProvide;
    }

    static final class component2 {
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        static final SpeedTestHistoryViewModel_HiltModules_KeyModule_ProvideFactory copydefault = new SpeedTestHistoryViewModel_HiltModules_KeyModule_ProvideFactory();

        private component2() {
        }

        static {
            int i = component1 + 55;
            ShareDataUIState = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }
    }
}
