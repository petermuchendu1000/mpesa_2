package com.huawei.digitalpayment.consumer.sfcui.profile.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class BiometricsViewModel_HiltModules {
    private BiometricsViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(BiometricsViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(BiometricsViewModel biometricsViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private static int component2 = 1;
        private static int component3;

        private KeyModule() {
        }

        @Provides
        @LazyClassKey(BiometricsViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 47;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 125;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 73 / 0;
            }
            return true;
        }
    }
}
