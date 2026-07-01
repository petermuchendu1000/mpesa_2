package com.huawei.digitalpayment.consumer.webview.viewmodel;

import com.huawei.digitalpayment.consumer.webview.viewmodel.WebViewViewModel_HiltModules;
import dagger.internal.Factory;

public final class WebViewViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int component2 = 0;
    private static int component3 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 71;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        if (i3 != 0) {
            int i4 = 98 / 0;
        }
        return bool;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = component3 + 43;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i4 = component2 + 67;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return boolValueOf;
        }
        throw null;
    }

    public static WebViewViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = component2 + 77;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        WebViewViewModel_HiltModules_KeyModule_ProvideFactory webViewViewModel_HiltModules_KeyModule_ProvideFactory = component1.component1;
        int i4 = component2 + 107;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 48 / 0;
        }
        return webViewViewModel_HiltModules_KeyModule_ProvideFactory;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = component2 + 37;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = WebViewViewModel_HiltModules.KeyModule.provide();
        if (i3 == 0) {
            int i4 = 38 / 0;
        }
        return zProvide;
    }

    static final class component1 {
        static final WebViewViewModel_HiltModules_KeyModule_ProvideFactory component1 = new WebViewViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int component2 = 1;
        private static int copydefault;

        private component1() {
        }

        static {
            int i = copydefault + 23;
            component2 = i % 128;
            int i2 = i % 2;
        }
    }
}
