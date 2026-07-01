package com.huawei.digitalpayment.consumer.profile.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class PhotoProfileViewModel_HiltModules {
    private PhotoProfileViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(PhotoProfileViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(PhotoProfileViewModel photoProfileViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;

        private KeyModule() {
        }

        @Provides
        @LazyClassKey(PhotoProfileViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = component2 + 91;
            ShareDataUIState = i2 % 128;
            return i2 % 2 == 0;
        }
    }
}
