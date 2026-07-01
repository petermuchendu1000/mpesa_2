package com.huawei.digitalpayment.consumer.loginModule.login.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class NewDeviceViewModel_HiltModules {
    private NewDeviceViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(NewDeviceViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(NewDeviceViewModel newDeviceViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private static int component2 = 0;
        private static int component3 = 1;

        public static void ShareDataUIState() {
        }

        private KeyModule() {
        }

        @Provides
        @LazyClassKey(NewDeviceViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = component2 + 61;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 105;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
    }
}
