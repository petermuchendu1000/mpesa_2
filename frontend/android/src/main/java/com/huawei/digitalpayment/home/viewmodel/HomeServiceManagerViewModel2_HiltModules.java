package com.huawei.digitalpayment.home.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class HomeServiceManagerViewModel2_HiltModules {
    private HomeServiceManagerViewModel2_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(HomeServiceManagerViewModel2.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(HomeServiceManagerViewModel2 homeServiceManagerViewModel2);

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
        @LazyClassKey(HomeServiceManagerViewModel2.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 75;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 65;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
    }
}
