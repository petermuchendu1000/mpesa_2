package com.huawei.digitalpayment.home.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class HomeServiceManagerViewModel_HiltModules {
    private HomeServiceManagerViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(HomeServiceManagerViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(HomeServiceManagerViewModel homeServiceManagerViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private static int component2 = 0;
        private static int component3 = 1;

        private KeyModule() {
        }

        @Provides
        @LazyClassKey(HomeServiceManagerViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 47;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 89;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
    }
}
