package com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class FavouriteBundlesViewModel_HiltModules {
    private FavouriteBundlesViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(FavouriteBundlesViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(FavouriteBundlesViewModel favouriteBundlesViewModel);

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
        @LazyClassKey(FavouriteBundlesViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 65;
            int i3 = i2 % 128;
            component3 = i3;
            boolean z = i2 % 2 != 0;
            int i4 = i3 + 93;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                return z;
            }
            throw null;
        }
    }
}
