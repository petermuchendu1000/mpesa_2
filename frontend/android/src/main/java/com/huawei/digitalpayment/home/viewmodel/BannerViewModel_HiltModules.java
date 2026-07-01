package com.huawei.digitalpayment.home.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class BannerViewModel_HiltModules {
    private BannerViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(BannerViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(BannerViewModel bannerViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private static int ShareDataUIState = 1;
        private static int component2;

        private KeyModule() {
        }

        @Provides
        @LazyClassKey(BannerViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 103;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
    }
}
