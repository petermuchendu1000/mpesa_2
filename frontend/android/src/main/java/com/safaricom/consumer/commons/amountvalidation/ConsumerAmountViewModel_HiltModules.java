package com.safaricom.consumer.commons.amountvalidation;

import com.safaricom.consumer.commons.amountvalidation.ConsumerAmountViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class ConsumerAmountViewModel_HiltModules {
    private ConsumerAmountViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(ConsumerAmountViewModel.class)
        @Binds
        @IntoMap
        public abstract Object bind(ConsumerAmountViewModel.Factory factory);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        @Provides
        @LazyClassKey(ConsumerAmountViewModel.class)
        @IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
