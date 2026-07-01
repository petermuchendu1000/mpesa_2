package com.huawei.digitalpayment.consumer.loginModule.register.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class RegisterOtpViewModel_HiltModules {
    private RegisterOtpViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(RegisterOtpViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(RegisterOtpViewModel registerOtpViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private static int ShareDataUIState = 1;
        private static int component1;

        private KeyModule() {
        }

        @Provides
        @LazyClassKey(RegisterOtpViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = component1 + 29;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
    }
}
