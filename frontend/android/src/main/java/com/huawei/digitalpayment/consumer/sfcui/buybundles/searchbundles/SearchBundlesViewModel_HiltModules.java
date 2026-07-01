package com.huawei.digitalpayment.consumer.sfcui.buybundles.searchbundles;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class SearchBundlesViewModel_HiltModules {
    private SearchBundlesViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(SearchBundlesViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(SearchBundlesViewModel searchBundlesViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private static int component1 = 1;
        private static int component3;

        private KeyModule() {
        }

        @Provides
        @LazyClassKey(SearchBundlesViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = component1 + 21;
            component3 = i2 % 128;
            return i2 % 2 == 0;
        }
    }
}
