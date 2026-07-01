package com.huawei.digitalpayment.common.theme.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class MyServicesViewModel_HiltModules {
    private MyServicesViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(MyServicesViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(MyServicesViewModel myServicesViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private static int component1 = 1;
        private static int component3;

        private KeyModule() {
        }

        @Provides
        @LazyClassKey(MyServicesViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = component1 + 109;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
    }
}
