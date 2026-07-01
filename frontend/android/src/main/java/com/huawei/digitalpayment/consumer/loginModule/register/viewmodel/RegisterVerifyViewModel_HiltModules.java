package com.huawei.digitalpayment.consumer.loginModule.register.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class RegisterVerifyViewModel_HiltModules {
    private RegisterVerifyViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(RegisterVerifyViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(RegisterVerifyViewModel registerVerifyViewModel);

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
        @LazyClassKey(RegisterVerifyViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = component2 + 23;
            int i3 = i2 % 128;
            copydefault = i3;
            boolean z = !(i2 % 2 != 0);
            int i4 = i3 + 87;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return z;
        }
    }
}
