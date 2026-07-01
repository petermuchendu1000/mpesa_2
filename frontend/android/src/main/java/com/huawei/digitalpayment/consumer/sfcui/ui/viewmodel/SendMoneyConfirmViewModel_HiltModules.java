package com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class SendMoneyConfirmViewModel_HiltModules {
    private SendMoneyConfirmViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(SendMoneyConfirmViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(SendMoneyConfirmViewModel sendMoneyConfirmViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private static int component1 = 0;
        private static int copydefault = 1;

        private KeyModule() {
        }

        @Provides
        @LazyClassKey(SendMoneyConfirmViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = copydefault + 43;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
    }
}
