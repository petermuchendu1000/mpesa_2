package com.huawei.digitalpayment.common.theme.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class ThemePreviewViewModel_HiltModules {
    private ThemePreviewViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(ThemePreviewViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(ThemePreviewViewModel themePreviewViewModel);

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
        @LazyClassKey(ThemePreviewViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 121;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 39;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
    }
}
