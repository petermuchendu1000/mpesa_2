package com.huawei.digitalpayment.checkout.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class PayResultViewModel_HiltModules {
    private PayResultViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(PayResultViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(PayResultViewModel payResultViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;

        private KeyModule() {
        }

        @Provides
        @LazyClassKey(PayResultViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 17;
            component2 = i2 % 128;
            return i2 % 2 != 0;
        }
    }
}
