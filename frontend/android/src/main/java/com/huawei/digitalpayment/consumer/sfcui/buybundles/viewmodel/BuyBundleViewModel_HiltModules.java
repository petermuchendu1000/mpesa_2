package com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class BuyBundleViewModel_HiltModules {
    private BuyBundleViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(BuyBundleViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(BuyBundleViewModel buyBundleViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private static int component2 = 0;
        private static int copydefault = 1;

        private KeyModule() {
        }

        @Provides
        @LazyClassKey(BuyBundleViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = component2 + 119;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 89;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                return true;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
