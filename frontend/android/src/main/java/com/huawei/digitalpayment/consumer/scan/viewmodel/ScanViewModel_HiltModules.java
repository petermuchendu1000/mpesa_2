package com.huawei.digitalpayment.consumer.scan.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class ScanViewModel_HiltModules {
    private ScanViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(ScanViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(ScanViewModel scanViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private static int ShareDataUIState = 1;
        private static int component1;

        private KeyModule() {
        }

        @Provides
        @LazyClassKey(ScanViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 95;
            ShareDataUIState = i3 % 128;
            boolean z = !(i3 % 2 == 0);
            int i4 = i2 + 75;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return z;
        }
    }
}
