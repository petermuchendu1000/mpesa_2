package com.huawei.digitalpayment.history.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class TransactionHistoryViewModel_HiltModules {
    private TransactionHistoryViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(TransactionHistoryViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(TransactionHistoryViewModel transactionHistoryViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private static int component1 = 1;
        private static int copydefault;

        private KeyModule() {
        }

        @Provides
        @LazyClassKey(TransactionHistoryViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = component1 + 51;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 71;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 63 / 0;
            }
            return true;
        }
    }
}
