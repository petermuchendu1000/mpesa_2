package com.huawei.digitalpayment.consumer.profile.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class ProfileViewModel_HiltModules {
    private ProfileViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(ProfileViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(ProfileViewModel profileViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;

        private KeyModule() {
        }

        @Provides
        @LazyClassKey(ProfileViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 115;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 7;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                return true;
            }
            throw null;
        }
    }
}
