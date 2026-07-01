package com.huawei.digitalpayment.consumer.home.ui.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class BalancesViewModel_HiltModules {
    private BalancesViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(BalancesViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(BalancesViewModel balancesViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;

        private KeyModule() {
        }

        @Provides
        @LazyClassKey(BalancesViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = component2 + 5;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
    }
}
