package com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.diybundles;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class DiyBundlesViewModel_HiltModules {
    private DiyBundlesViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(DiyBundlesViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(DiyBundlesViewModel diyBundlesViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private static int ShareDataUIState = 1;
        private static int copydefault;

        private KeyModule() {
        }

        @Provides
        @LazyClassKey(DiyBundlesViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 109;
            ShareDataUIState = i3 % 128;
            boolean z = i3 % 2 != 0;
            int i4 = i2 + 73;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return z;
        }
    }
}
