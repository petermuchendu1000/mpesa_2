package com.huawei.digitalpayment.common.theme.viewmodel;

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
        @LazyClassKey(RecentMiniAppViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(RecentMiniAppViewModel recentMiniAppViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private static int component1 = 1;
        private static int copydefault;

        private KeyModule() {
        }

        @Provides
        @LazyClassKey(RecentMiniAppViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = component1 + 5;
            int i3 = i2 % 128;
            copydefault = i3;
            boolean z = i2 % 2 == 0;
            int i4 = i3 + 53;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                return z;
            }
            throw null;
        }
    }
}
