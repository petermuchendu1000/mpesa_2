package com.huawei.digitalpayment.consumer.basicUi.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class ChangeLanguageViewModel_HiltModules {
    private ChangeLanguageViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(ChangeLanguageViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(ChangeLanguageViewModel changeLanguageViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private static int component2 = 0;
        private static int component3 = 1;

        private KeyModule() {
        }

        @Provides
        @LazyClassKey(ChangeLanguageViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = component2 + 87;
            int i3 = i2 % 128;
            component3 = i3;
            boolean z = i2 % 2 != 0;
            int i4 = i3 + 31;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return z;
        }
    }
}
