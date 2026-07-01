package com.huawei.digitalpayment.consumer.profile.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class UpdateDynamicsKycViewModel_HiltModules {
    private UpdateDynamicsKycViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(UpdateDynamicsKycViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(UpdateDynamicsKycViewModel updateDynamicsKycViewModel);

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
        @LazyClassKey(UpdateDynamicsKycViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = copydefault + 111;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 119;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                return true;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
