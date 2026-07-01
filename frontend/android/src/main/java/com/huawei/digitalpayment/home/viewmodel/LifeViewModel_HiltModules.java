package com.huawei.digitalpayment.home.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class LifeViewModel_HiltModules {
    private LifeViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(LifeViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(LifeViewModel lifeViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private static int ShareDataUIState = 1;
        private static int component2;

        private KeyModule() {
        }

        @Provides
        @LazyClassKey(LifeViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 19;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 3;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 22 / 0;
            }
            return true;
        }
    }
}
