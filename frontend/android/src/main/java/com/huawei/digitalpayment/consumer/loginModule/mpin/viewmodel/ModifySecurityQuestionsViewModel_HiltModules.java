package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class ModifySecurityQuestionsViewModel_HiltModules {
    private ModifySecurityQuestionsViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(ModifySecurityQuestionsViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(ModifySecurityQuestionsViewModel modifySecurityQuestionsViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private static int component2 = 1;
        private static int component3;

        private KeyModule() {
        }

        @Provides
        @LazyClassKey(ModifySecurityQuestionsViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 15;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 113;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 66 / 0;
            }
            return true;
        }
    }
}
