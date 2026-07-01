package com.huawei.digitalpayment.consumer.risk.vm;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class RiskViewModel_HiltModules {
    private RiskViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(RiskViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(RiskViewModel riskViewModel);

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
        @LazyClassKey(RiskViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = component3 + 85;
            component2 = i2 % 128;
            return i2 % 2 != 0;
        }
    }
}
