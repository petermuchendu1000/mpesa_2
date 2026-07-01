package com.huawei.digitalpayment.home.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class TipsViewModel_HiltModules {
    private TipsViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(TipsViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(TipsViewModel tipsViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private static int ShareDataUIState = 1;
        private static int component3;

        private KeyModule() {
        }

        @Provides
        @LazyClassKey(TipsViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 3;
            component3 = i3 % 128;
            boolean z = i3 % 2 == 0;
            int i4 = i2 + 7;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                return z;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
