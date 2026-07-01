package com.huawei.digitalpayment.consumer.basicUi.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class IntroScreensViewModel_HiltModules {
    private IntroScreensViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(IntroScreensViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(IntroScreensViewModel introScreensViewModel);

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
        @LazyClassKey(IntroScreensViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 87;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 111;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                return true;
            }
            throw null;
        }
    }
}
