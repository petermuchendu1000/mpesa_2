package com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class OfferBundleViewModel_HiltModules {
    private OfferBundleViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(OfferBundleViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(OfferBundleViewModel offerBundleViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private static int component3 = 1;
        private static int copydefault;

        private KeyModule() {
        }

        @Provides
        @LazyClassKey(OfferBundleViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 1;
            component3 = i3 % 128;
            boolean z = i3 % 2 != 0;
            int i4 = i2 + 35;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return z;
        }
    }
}
