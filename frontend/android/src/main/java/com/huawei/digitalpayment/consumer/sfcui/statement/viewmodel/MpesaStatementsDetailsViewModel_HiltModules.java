package com.huawei.digitalpayment.consumer.sfcui.statement.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class MpesaStatementsDetailsViewModel_HiltModules {
    private MpesaStatementsDetailsViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(MpesaStatementsDetailsViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(MpesaStatementsDetailsViewModel mpesaStatementsDetailsViewModel);

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
        @LazyClassKey(MpesaStatementsDetailsViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 117;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 23;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
    }
}
