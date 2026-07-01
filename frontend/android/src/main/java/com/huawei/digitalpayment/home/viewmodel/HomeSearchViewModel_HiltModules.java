package com.huawei.digitalpayment.home.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class HomeSearchViewModel_HiltModules {
    private HomeSearchViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(HomeSearchViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(HomeSearchViewModel homeSearchViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private static int component1 = 1;
        private static int component2;

        private KeyModule() {
        }

        @Provides
        @LazyClassKey(HomeSearchViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = component1 + 65;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 89;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
    }
}
