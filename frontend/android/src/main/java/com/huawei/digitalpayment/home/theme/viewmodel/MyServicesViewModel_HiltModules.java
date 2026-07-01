package com.huawei.digitalpayment.home.theme.viewmodel;

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
        private static int component2 = 0;
        private static int copydefault = 1;

        private KeyModule() {
        }

        @Provides
        @LazyClassKey(MyServicesViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 13;
            copydefault = i3 % 128;
            boolean z = i3 % 2 != 0;
            int i4 = i2 + 93;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 88 / 0;
            }
            return z;
        }
    }
}
