package com.huawei.digitalpayment.common.theme.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class BalanceThemeViewModel_HiltModules {
    private BalanceThemeViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(BalanceThemeViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(BalanceThemeViewModel balanceThemeViewModel);

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
        @LazyClassKey(BalanceThemeViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = copydefault + 105;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 99;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
    }
}
