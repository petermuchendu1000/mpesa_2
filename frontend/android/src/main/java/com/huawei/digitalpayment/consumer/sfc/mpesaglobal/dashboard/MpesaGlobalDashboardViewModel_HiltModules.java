package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.dashboard;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class MpesaGlobalDashboardViewModel_HiltModules {
    private MpesaGlobalDashboardViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(MpesaGlobalDashboardViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(MpesaGlobalDashboardViewModel mpesaGlobalDashboardViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private static int component2 = 1;
        private static int copydefault;

        private KeyModule() {
        }

        @Provides
        @LazyClassKey(MpesaGlobalDashboardViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 13;
            component2 = i3 % 128;
            boolean z = i3 % 2 != 0;
            int i4 = i2 + 117;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                return z;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
