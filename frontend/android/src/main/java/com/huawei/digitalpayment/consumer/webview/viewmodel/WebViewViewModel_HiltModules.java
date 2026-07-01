package com.huawei.digitalpayment.consumer.webview.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class WebViewViewModel_HiltModules {
    private WebViewViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(WebViewViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(WebViewViewModel webViewViewModel);

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
        @LazyClassKey(WebViewViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 45;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 19;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
    }
}
