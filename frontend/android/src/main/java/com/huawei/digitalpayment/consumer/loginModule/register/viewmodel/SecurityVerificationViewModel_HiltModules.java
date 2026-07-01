package com.huawei.digitalpayment.consumer.loginModule.register.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class SecurityVerificationViewModel_HiltModules {
    private SecurityVerificationViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(SecurityVerificationViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(SecurityVerificationViewModel securityVerificationViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private static int component1 = 1;
        private static int copydefault;

        private KeyModule() {
        }

        @Provides
        @LazyClassKey(SecurityVerificationViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = copydefault + 115;
            component1 = i2 % 128;
            return i2 % 2 != 0;
        }
    }
}
