package com.huawei.digitalpayment.customer.dynamics.vm;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class PhotoUploadViewModel_HiltModules {
    private PhotoUploadViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(PhotoUploadViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(PhotoUploadViewModel photoUploadViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private static int component1 = 0;
        private static int copydefault = 1;

        private KeyModule() {
        }

        @Provides
        @LazyClassKey(PhotoUploadViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = copydefault + 103;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 31;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
    }
}
