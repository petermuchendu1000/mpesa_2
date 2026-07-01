package com.huawei.digitalpayment.checkout.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class CheckoutViewModel_HiltModules {
    private CheckoutViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(CheckoutViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(CheckoutViewModel checkoutViewModel);

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
        @LazyClassKey(CheckoutViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 27;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 9;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 26 / 0;
            }
            return true;
        }
    }
}
