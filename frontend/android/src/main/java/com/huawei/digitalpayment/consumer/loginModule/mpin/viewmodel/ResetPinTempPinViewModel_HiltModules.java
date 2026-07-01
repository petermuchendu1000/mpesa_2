package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class ResetPinTempPinViewModel_HiltModules {
    private ResetPinTempPinViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(ResetPinTempPinViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(ResetPinTempPinViewModel resetPinTempPinViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private static int component2 = 1;
        private static int copydefault;

        private KeyModule() {
        }

        @Provides
        @LazyClassKey(ResetPinTempPinViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = copydefault + 23;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
    }
}
