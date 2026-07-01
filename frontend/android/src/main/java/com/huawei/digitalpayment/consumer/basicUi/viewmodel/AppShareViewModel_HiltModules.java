package com.huawei.digitalpayment.consumer.basicUi.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class AppShareViewModel_HiltModules {
    private AppShareViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(AppShareViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(AppShareViewModel appShareViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private static int component1 = 0;
        private static int component2 = 1;

        private KeyModule() {
        }

        @Provides
        @LazyClassKey(AppShareViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = component1 + 67;
            int i3 = i2 % 128;
            component2 = i3;
            boolean z = i2 % 2 != 0;
            int i4 = i3 + 111;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                return z;
            }
            throw null;
        }
    }
}
