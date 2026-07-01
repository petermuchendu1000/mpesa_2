package com.huawei.digitalpayment.pwa.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class PwaViewModel_HiltModules {
    private PwaViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(PwaViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(PwaViewModel pwaViewModel);

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
        @LazyClassKey(PwaViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = copydefault + 97;
            ShareDataUIState = i2 % 128;
            return i2 % 2 != 0;
        }
    }
}
