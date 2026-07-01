package com.huawei.digitalpayment.consumer.loginModule.register.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class ActiveConsumerViewModel_HiltModules {
    private ActiveConsumerViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(ActiveConsumerViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(ActiveConsumerViewModel activeConsumerViewModel);

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
        @LazyClassKey(ActiveConsumerViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = component2 + 123;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 113;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 60 / 0;
            }
            return true;
        }
    }
}
