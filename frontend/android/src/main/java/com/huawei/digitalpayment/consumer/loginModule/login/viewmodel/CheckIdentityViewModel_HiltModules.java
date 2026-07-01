package com.huawei.digitalpayment.consumer.loginModule.login.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class CheckIdentityViewModel_HiltModules {
    private CheckIdentityViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(CheckIdentityViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(CheckIdentityViewModel checkIdentityViewModel);

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
        @LazyClassKey(CheckIdentityViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 7;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 97;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                return true;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
