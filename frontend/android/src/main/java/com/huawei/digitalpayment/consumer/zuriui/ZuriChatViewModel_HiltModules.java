package com.huawei.digitalpayment.consumer.zuriui;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class ZuriChatViewModel_HiltModules {
    private ZuriChatViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(ZuriChatViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(ZuriChatViewModel zuriChatViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private static int component1 = 1;
        private static int component3;

        private KeyModule() {
        }

        @Provides
        @LazyClassKey(ZuriChatViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = component1 + 77;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 19;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
    }
}
