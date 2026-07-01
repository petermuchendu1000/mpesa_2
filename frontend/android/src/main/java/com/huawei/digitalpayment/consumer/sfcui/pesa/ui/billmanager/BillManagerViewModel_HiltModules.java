package com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class BillManagerViewModel_HiltModules {
    private BillManagerViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(BillManagerViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(BillManagerViewModel billManagerViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private static int ShareDataUIState = 1;
        private static int component3;

        private KeyModule() {
        }

        @Provides
        @LazyClassKey(BillManagerViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 29;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 41;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
    }
}
