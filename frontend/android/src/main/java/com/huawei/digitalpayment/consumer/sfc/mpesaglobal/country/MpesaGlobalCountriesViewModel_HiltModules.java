package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class MpesaGlobalCountriesViewModel_HiltModules {
    private MpesaGlobalCountriesViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(MpesaGlobalCountriesViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(MpesaGlobalCountriesViewModel mpesaGlobalCountriesViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private static int ShareDataUIState = 1;
        private static int component1;

        private KeyModule() {
        }

        @Provides
        @LazyClassKey(MpesaGlobalCountriesViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 9;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 49;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
    }
}
