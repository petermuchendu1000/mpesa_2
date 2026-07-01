package com.huawei.digitalpayment.home.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class RecentMiniAppViewModel_HiltModules {
    private RecentMiniAppViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        public static void ShareDataUIState() {
        }

        @LazyClassKey(RecentMiniAppViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(RecentMiniAppViewModel recentMiniAppViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private static int ShareDataUIState = 0;
        private static int component1 = 1;

        private KeyModule() {
        }

        @Provides
        @LazyClassKey(RecentMiniAppViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = component1 + 99;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
    }
}
