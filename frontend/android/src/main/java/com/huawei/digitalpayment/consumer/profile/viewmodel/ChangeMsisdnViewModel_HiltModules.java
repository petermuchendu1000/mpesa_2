package com.huawei.digitalpayment.consumer.profile.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class ChangeMsisdnViewModel_HiltModules {
    private ChangeMsisdnViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(ChangeMsisdnViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(ChangeMsisdnViewModel changeMsisdnViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private static int ShareDataUIState = 0;
        private static int component1 = 1;

        private KeyModule() {
        }

        @Provides
        @LazyClassKey(ChangeMsisdnViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 65;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 113;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
    }
}
