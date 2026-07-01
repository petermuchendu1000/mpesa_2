package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class SendToBankViewModel_HiltModules {
    private SendToBankViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(SendToBankViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(SendToBankViewModel sendToBankViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private static int ShareDataUIState = 0;
        private static int copydefault = 1;

        private KeyModule() {
        }

        @Provides
        @LazyClassKey(SendToBankViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 15;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 117;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
    }
}
