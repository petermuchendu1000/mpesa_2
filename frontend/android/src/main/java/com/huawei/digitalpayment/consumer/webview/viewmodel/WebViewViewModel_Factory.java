package com.huawei.digitalpayment.consumer.webview.viewmodel;

import com.huawei.digitalpayment.consumer.webview.model.IWebViewModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class WebViewViewModel_Factory implements Factory<WebViewViewModel> {
    private static int ShareDataUIState = 1;
    private static int component3;
    private final Provider<IWebViewModel> component2;

    @Override
    public Object get() {
        WebViewViewModel webViewViewModel;
        int i = 2 % 2;
        int i2 = component3 + 85;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            webViewViewModel = get();
            int i3 = 22 / 0;
        } else {
            webViewViewModel = get();
        }
        int i4 = component3 + 3;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return webViewViewModel;
    }

    public WebViewViewModel_Factory(Provider<IWebViewModel> provider) {
        this.component2 = provider;
    }

    @Override
    public WebViewViewModel get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 123;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            newInstance(this.component2.get());
            throw null;
        }
        WebViewViewModel webViewViewModelNewInstance = newInstance(this.component2.get());
        int i3 = ShareDataUIState + 87;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return webViewViewModelNewInstance;
    }

    public static WebViewViewModel_Factory create(javax.inject.Provider<IWebViewModel> provider) {
        int i = 2 % 2;
        WebViewViewModel_Factory webViewViewModel_Factory = new WebViewViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = component3 + 111;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return webViewViewModel_Factory;
    }

    public static WebViewViewModel_Factory create(Provider<IWebViewModel> provider) {
        int i = 2 % 2;
        WebViewViewModel_Factory webViewViewModel_Factory = new WebViewViewModel_Factory(provider);
        int i2 = ShareDataUIState + 95;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 84 / 0;
        }
        return webViewViewModel_Factory;
    }

    public static WebViewViewModel newInstance(IWebViewModel iWebViewModel) {
        int i = 2 % 2;
        WebViewViewModel webViewViewModel = new WebViewViewModel(iWebViewModel);
        int i2 = component3 + 53;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 26 / 0;
        }
        return webViewViewModel;
    }
}
