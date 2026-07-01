package com.huawei.digitalpayment.consumer.qrcode.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class PayViewCodeModel_HiltModules {
    private PayViewCodeModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(PayViewCodeModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(PayViewCodeModel payViewCodeModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private static int component2 = 1;
        private static int copydefault;

        private KeyModule() {
        }

        @Provides
        @LazyClassKey(PayViewCodeModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = component2 + 35;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 81;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
    }
}
