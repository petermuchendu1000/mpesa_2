package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class VerifyBaseQuestionViewModel_HiltModules {
    private VerifyBaseQuestionViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(VerifyBaseQuestionViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(VerifyBaseQuestionViewModel verifyBaseQuestionViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private static int component2 = 0;
        private static int component3 = 1;

        private KeyModule() {
        }

        @Provides
        @LazyClassKey(VerifyBaseQuestionViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = component3 + 57;
            int i3 = i2 % 128;
            component2 = i3;
            boolean z = i2 % 2 == 0;
            int i4 = i3 + 5;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                return z;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
