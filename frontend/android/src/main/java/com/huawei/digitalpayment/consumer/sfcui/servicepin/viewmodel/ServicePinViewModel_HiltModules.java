package com.huawei.digitalpayment.consumer.sfcui.servicepin.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class ServicePinViewModel_HiltModules {
    private ServicePinViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(ServicePinViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(ServicePinViewModel servicePinViewModel);

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
        @LazyClassKey(ServicePinViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 3;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 55;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
    }
}
