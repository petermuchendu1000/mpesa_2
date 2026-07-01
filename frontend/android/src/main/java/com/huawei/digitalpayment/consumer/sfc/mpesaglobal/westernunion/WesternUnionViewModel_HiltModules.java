package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class WesternUnionViewModel_HiltModules {
    private WesternUnionViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(WesternUnionViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(WesternUnionViewModel westernUnionViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private static int component1 = 0;
        private static int component2 = 1;

        private KeyModule() {
        }

        @Provides
        @LazyClassKey(WesternUnionViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = component1 + 83;
            int i3 = i2 % 128;
            component2 = i3;
            boolean z = i2 % 2 != 0;
            int i4 = i3 + 25;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return z;
        }
    }
}
