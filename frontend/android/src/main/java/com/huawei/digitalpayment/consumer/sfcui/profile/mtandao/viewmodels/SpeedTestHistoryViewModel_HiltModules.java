package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class SpeedTestHistoryViewModel_HiltModules {
    private SpeedTestHistoryViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(SpeedTestHistoryViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(SpeedTestHistoryViewModel speedTestHistoryViewModel);

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
        @LazyClassKey(SpeedTestHistoryViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = copydefault + 103;
            ShareDataUIState = i2 % 128;
            return i2 % 2 != 0;
        }
    }
}
