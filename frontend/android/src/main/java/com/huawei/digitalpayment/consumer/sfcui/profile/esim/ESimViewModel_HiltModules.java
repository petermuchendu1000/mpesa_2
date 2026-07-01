package com.huawei.digitalpayment.consumer.sfcui.profile.esim;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class ESimViewModel_HiltModules {
    private ESimViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(ESimViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(ESimViewModel eSimViewModel);

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
        @LazyClassKey(ESimViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 53;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 105;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
    }
}
