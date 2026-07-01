package com.huawei.digitalpayment.checkout.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class EasyCheckoutViewModel_HiltModules {
    private EasyCheckoutViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(EasyCheckoutViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(EasyCheckoutViewModel easyCheckoutViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private static int ShareDataUIState = 0;
        private static int copydefault = 1;

        private KeyModule() {
        }

        @Provides
        @LazyClassKey(EasyCheckoutViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 39;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 15;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 19 / 0;
            }
            return true;
        }
    }
}
