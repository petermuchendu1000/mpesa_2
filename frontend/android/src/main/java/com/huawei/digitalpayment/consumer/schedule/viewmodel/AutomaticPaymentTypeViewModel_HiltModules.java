package com.huawei.digitalpayment.consumer.schedule.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class AutomaticPaymentTypeViewModel_HiltModules {
    private AutomaticPaymentTypeViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(AutomaticPaymentTypeViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(AutomaticPaymentTypeViewModel automaticPaymentTypeViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private static int ShareDataUIState = 1;
        private static int component3;

        private KeyModule() {
        }

        @Provides
        @LazyClassKey(AutomaticPaymentTypeViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = component3 + 11;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 93;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
    }
}
