package com.huawei.digitalpayment.consumer.loginModule.login.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class PinLoginViewModel_HiltModules {
    private PinLoginViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(PinLoginViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(PinLoginViewModel pinLoginViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private static int ShareDataUIState = 1;
        private static int copydefault;

        private KeyModule() {
        }

        @Provides
        @LazyClassKey(PinLoginViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 25;
            copydefault = i2 % 128;
            return i2 % 2 == 0;
        }
    }
}
