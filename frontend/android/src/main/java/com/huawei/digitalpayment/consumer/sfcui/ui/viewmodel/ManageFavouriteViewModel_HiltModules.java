package com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class ManageFavouriteViewModel_HiltModules {
    private ManageFavouriteViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(ManageFavouriteViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(ManageFavouriteViewModel manageFavouriteViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private static int component2 = 0;
        private static int copydefault = 1;

        private KeyModule() {
        }

        @Provides
        @LazyClassKey(ManageFavouriteViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = copydefault + 103;
            int i3 = i2 % 128;
            component2 = i3;
            boolean z = !(i2 % 2 != 0);
            int i4 = i3 + 53;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 71 / 0;
            }
            return z;
        }
    }
}
