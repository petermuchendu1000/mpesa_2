package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class SpeedTestViewModel_HiltModules {
    private SpeedTestViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(SpeedTestViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(SpeedTestViewModel speedTestViewModel);

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
        @LazyClassKey(SpeedTestViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 51;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 89;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                return true;
            }
            throw null;
        }
    }
}
