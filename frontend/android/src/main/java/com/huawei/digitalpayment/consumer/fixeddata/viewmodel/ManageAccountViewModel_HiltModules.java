package com.huawei.digitalpayment.consumer.fixeddata.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class ManageAccountViewModel_HiltModules {
    private ManageAccountViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(ManageAccountViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(ManageAccountViewModel manageAccountViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private static int component1 = 1;
        private static int component2;

        private KeyModule() {
        }

        @Provides
        @LazyClassKey(ManageAccountViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = component2 + 95;
            int i3 = i2 % 128;
            component1 = i3;
            boolean z = i2 % 2 != 0;
            int i4 = i3 + 87;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 84 / 0;
            }
            return z;
        }
    }
}
