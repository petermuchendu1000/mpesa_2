package com.huawei.digitalpayment.common.theme.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class TipsThemeViewModel_HiltModules {
    private TipsThemeViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(TipsThemeViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(TipsThemeViewModel tipsThemeViewModel);

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
        @LazyClassKey(TipsThemeViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 85;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 121;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
    }
}
