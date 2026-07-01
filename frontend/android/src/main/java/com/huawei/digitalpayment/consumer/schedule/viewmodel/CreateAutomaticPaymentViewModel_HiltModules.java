package com.huawei.digitalpayment.consumer.schedule.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class CreateAutomaticPaymentViewModel_HiltModules {
    private CreateAutomaticPaymentViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(CreateAutomaticPaymentViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(CreateAutomaticPaymentViewModel createAutomaticPaymentViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private static int component3 = 0;
        private static int copydefault = 1;

        private KeyModule() {
        }

        @Provides
        @LazyClassKey(CreateAutomaticPaymentViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = component3 + 61;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 107;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 45 / 0;
            }
            return true;
        }
    }
}
