package com.huawei.digitalpayment.consumer.loginModule.login.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class LoginViewModel_HiltModules {
    private LoginViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(LoginViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(LoginViewModel loginViewModel);

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
        @LazyClassKey(LoginViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = copydefault + 93;
            ShareDataUIState = i2 % 128;
            return true ^ (i2 % 2 == 0);
        }
    }
}
