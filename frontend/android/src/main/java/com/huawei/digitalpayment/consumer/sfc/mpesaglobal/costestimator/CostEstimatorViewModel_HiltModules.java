package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class CostEstimatorViewModel_HiltModules {
    private CostEstimatorViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(CostEstimatorViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(CostEstimatorViewModel costEstimatorViewModel);

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
        @LazyClassKey(CostEstimatorViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 7;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 101;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                return true;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
