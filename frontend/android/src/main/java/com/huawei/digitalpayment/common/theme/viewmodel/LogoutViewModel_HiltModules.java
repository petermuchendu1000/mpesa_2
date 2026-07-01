package com.huawei.digitalpayment.common.theme.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class LogoutViewModel_HiltModules {
    private LogoutViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(LogoutViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(LogoutViewModel logoutViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private static int component3 = 1;
        private static int copydefault;

        private KeyModule() {
        }

        @Provides
        @LazyClassKey(LogoutViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 17;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 87;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
    }
}
