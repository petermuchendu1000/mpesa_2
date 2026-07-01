package com.huawei.digitalpayment.consumer.sfcui.ui.miniapp;

import com.huawei.digitalpayment.consumer.sfcui.ui.miniapp.MiniAppsDetailsViewModel_HiltModules;
import dagger.internal.Factory;

public final class MiniAppsDetailsViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int ShareDataUIState = 1;
    private static int component2;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 45;
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
    public Boolean get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 109;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        if (i3 != 0) {
            int i4 = 65 / 0;
        }
        return boolValueOf;
    }

    public static MiniAppsDetailsViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 85;
        component2 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            MiniAppsDetailsViewModel_HiltModules_KeyModule_ProvideFactory miniAppsDetailsViewModel_HiltModules_KeyModule_ProvideFactory = ShareDataUIState.component2;
            obj.hashCode();
            throw null;
        }
        MiniAppsDetailsViewModel_HiltModules_KeyModule_ProvideFactory miniAppsDetailsViewModel_HiltModules_KeyModule_ProvideFactory2 = ShareDataUIState.component2;
        int i3 = ShareDataUIState + 9;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            return miniAppsDetailsViewModel_HiltModules_KeyModule_ProvideFactory2;
        }
        obj.hashCode();
        throw null;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 121;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return MiniAppsDetailsViewModel_HiltModules.KeyModule.provide();
        }
        MiniAppsDetailsViewModel_HiltModules.KeyModule.provide();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class ShareDataUIState {
        private static int ShareDataUIState = 0;
        static final MiniAppsDetailsViewModel_HiltModules_KeyModule_ProvideFactory component2 = new MiniAppsDetailsViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int component3 = 1;

        private ShareDataUIState() {
        }

        static {
            int i = component3 + 99;
            ShareDataUIState = i % 128;
            int i2 = i % 2;
        }
    }
}
