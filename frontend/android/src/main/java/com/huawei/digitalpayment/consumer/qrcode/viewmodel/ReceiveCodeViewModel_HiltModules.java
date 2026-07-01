package com.huawei.digitalpayment.consumer.qrcode.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class ReceiveCodeViewModel_HiltModules {
    private ReceiveCodeViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(ReceiveCodeViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(ReceiveCodeViewModel receiveCodeViewModel);

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
        @LazyClassKey(ReceiveCodeViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 19;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 39;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
    }
}
