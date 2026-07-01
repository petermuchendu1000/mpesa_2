package com.huawei.digitalpayment.consumer.fixeddata.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class FamilyShareDashboardViewModel_HiltModules {
    private FamilyShareDashboardViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(FamilyShareDashboardViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(FamilyShareDashboardViewModel familyShareDashboardViewModel);

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
        @LazyClassKey(FamilyShareDashboardViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 73;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 3;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                return true;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
