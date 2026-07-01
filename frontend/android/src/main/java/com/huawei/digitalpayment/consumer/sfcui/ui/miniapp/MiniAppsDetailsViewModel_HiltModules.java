package com.huawei.digitalpayment.consumer.sfcui.ui.miniapp;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class MiniAppsDetailsViewModel_HiltModules {
    private MiniAppsDetailsViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(MiniAppsDetailsViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(MiniAppsDetailsViewModel miniAppsDetailsViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private static int component3 = 0;
        private static int copydefault = 1;

        private KeyModule() {
        }

        @Provides
        @LazyClassKey(MiniAppsDetailsViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 71;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 25;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
    }
}
