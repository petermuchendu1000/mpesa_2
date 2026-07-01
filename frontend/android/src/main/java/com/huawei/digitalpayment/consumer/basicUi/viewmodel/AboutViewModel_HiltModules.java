package com.huawei.digitalpayment.consumer.basicUi.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class AboutViewModel_HiltModules {
    private AboutViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(AboutViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(AboutViewModel aboutViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private static int ShareDataUIState = 0;
        private static int component3 = 1;

        private KeyModule() {
        }

        @Provides
        @LazyClassKey(AboutViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = component3 + 109;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
    }
}
