package com.huawei.digitalpayment.consumer.basicUi.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class SplashViewModel_HiltModules {
    private SplashViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(SplashViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(SplashViewModel splashViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private static int component1 = 0;
        private static int copydefault = 1;

        private KeyModule() {
        }

        @Provides
        @LazyClassKey(SplashViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = copydefault + 7;
            component1 = i2 % 128;
            return i2 % 2 == 0;
        }
    }
}
