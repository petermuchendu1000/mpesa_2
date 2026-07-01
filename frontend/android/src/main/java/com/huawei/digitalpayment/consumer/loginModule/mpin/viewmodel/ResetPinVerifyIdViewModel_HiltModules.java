package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class ResetPinVerifyIdViewModel_HiltModules {
    private ResetPinVerifyIdViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(ResetPinVerifyIdViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(ResetPinVerifyIdViewModel resetPinVerifyIdViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private static int component3 = 0;
        private static int copydefault = 1;

        private KeyModule() {
        }

        @Provides
        @LazyClassKey(ResetPinVerifyIdViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = copydefault + 93;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 69;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                return true;
            }
            throw null;
        }
    }
}
