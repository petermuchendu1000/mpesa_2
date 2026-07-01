package com.huawei.digitalpayment.consumer.basicUi.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class LoginSettingViewModel_HiltModules {
    private LoginSettingViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(LoginSettingViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(LoginSettingViewModel loginSettingViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private static int component1 = 0;
        private static int component2 = 1;

        private KeyModule() {
        }

        @Provides
        @LazyClassKey(LoginSettingViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = component1 + 115;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
    }
}
