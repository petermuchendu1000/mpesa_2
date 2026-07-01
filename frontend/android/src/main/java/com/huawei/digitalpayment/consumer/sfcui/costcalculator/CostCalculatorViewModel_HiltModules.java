package com.huawei.digitalpayment.consumer.sfcui.costcalculator;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class CostCalculatorViewModel_HiltModules {
    private CostCalculatorViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(CostCalculatorViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(CostCalculatorViewModel costCalculatorViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private static int component2 = 0;
        private static int component3 = 1;

        private KeyModule() {
        }

        @Provides
        @LazyClassKey(CostCalculatorViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 15;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 69;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                return true;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
