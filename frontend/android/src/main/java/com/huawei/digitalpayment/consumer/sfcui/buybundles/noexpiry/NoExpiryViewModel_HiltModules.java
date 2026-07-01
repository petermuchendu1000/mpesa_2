package com.huawei.digitalpayment.consumer.sfcui.buybundles.noexpiry;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class NoExpiryViewModel_HiltModules {
    private NoExpiryViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(NoExpiryViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(NoExpiryViewModel noExpiryViewModel);

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
        @LazyClassKey(NoExpiryViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 21;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 97;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                return true;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
