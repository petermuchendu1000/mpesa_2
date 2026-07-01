package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels;

import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestViewModel_HiltModules;
import dagger.internal.Factory;

public final class SpeedTestViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int ShareDataUIState = 1;
    private static int copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = copydefault + 25;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        int i4 = ShareDataUIState + 1;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = copydefault + 63;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = provide();
        if (i3 != 0) {
            return Boolean.valueOf(zProvide);
        }
        Boolean.valueOf(zProvide);
        throw null;
    }

    public static SpeedTestViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = copydefault + 71;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        SpeedTestViewModel_HiltModules_KeyModule_ProvideFactory speedTestViewModel_HiltModules_KeyModule_ProvideFactory = ShareDataUIState.component1;
        int i4 = copydefault + 57;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return speedTestViewModel_HiltModules_KeyModule_ProvideFactory;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 59;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            SpeedTestViewModel_HiltModules.KeyModule.provide();
            throw null;
        }
        boolean zProvide = SpeedTestViewModel_HiltModules.KeyModule.provide();
        int i3 = ShareDataUIState + 23;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 12 / 0;
        }
        return zProvide;
    }

    static final class ShareDataUIState {
        static final SpeedTestViewModel_HiltModules_KeyModule_ProvideFactory component1 = new SpeedTestViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int component2 = 1;
        private static int copydefault;

        private ShareDataUIState() {
        }

        static {
            int i = component2 + 31;
            copydefault = i % 128;
            if (i % 2 != 0) {
                int i2 = 6 / 0;
            }
        }
    }
}
