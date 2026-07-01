package com.huawei.digitalpayment.consumer.basicUi.pinfree.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class ManagePinFreeViewModel_HiltModules {
    private ManagePinFreeViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(ManagePinFreeViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(ManagePinFreeViewModel managePinFreeViewModel);

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
        @LazyClassKey(ManagePinFreeViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = copydefault + 31;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 103;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
    }
}
