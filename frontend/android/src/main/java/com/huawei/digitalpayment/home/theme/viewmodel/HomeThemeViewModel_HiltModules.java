package com.huawei.digitalpayment.home.theme.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class HomeThemeViewModel_HiltModules {
    private HomeThemeViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(HomeThemeViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(HomeThemeViewModel homeThemeViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private static int component1 = 0;
        private static int component3 = 1;

        private KeyModule() {
        }

        @Provides
        @LazyClassKey(HomeThemeViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = component3 + 51;
            component1 = i2 % 128;
            return i2 % 2 == 0;
        }
    }
}
