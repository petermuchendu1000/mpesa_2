package com.huawei.digitalpayment.consumer.zuriui.data;

import com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketClient;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class WebSocketRepositoryImpl_Factory implements Factory<WebSocketRepositoryImpl> {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    private final Provider<String> component2;
    private final Provider<WebSocketClient> component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = copydefault + 19;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        WebSocketRepositoryImpl webSocketRepositoryImpl = get();
        int i4 = ShareDataUIState + 93;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return webSocketRepositoryImpl;
    }

    public WebSocketRepositoryImpl_Factory(Provider<WebSocketClient> provider, Provider<String> provider2) {
        this.component3 = provider;
        this.component2 = provider2;
    }

    @Override
    public WebSocketRepositoryImpl get() {
        int i = 2 % 2;
        int i2 = copydefault + 39;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        WebSocketClient webSocketClient = this.component3.get();
        if (i3 == 0) {
            return newInstance(webSocketClient, this.component2.get());
        }
        newInstance(webSocketClient, this.component2.get());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static WebSocketRepositoryImpl_Factory create(javax.inject.Provider<WebSocketClient> provider, javax.inject.Provider<String> provider2) {
        int i = 2 % 2;
        WebSocketRepositoryImpl_Factory webSocketRepositoryImpl_Factory = new WebSocketRepositoryImpl_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
        int i2 = copydefault + 51;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return webSocketRepositoryImpl_Factory;
    }

    public static WebSocketRepositoryImpl_Factory create(Provider<WebSocketClient> provider, Provider<String> provider2) {
        int i = 2 % 2;
        WebSocketRepositoryImpl_Factory webSocketRepositoryImpl_Factory = new WebSocketRepositoryImpl_Factory(provider, provider2);
        int i2 = ShareDataUIState + 105;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return webSocketRepositoryImpl_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static WebSocketRepositoryImpl newInstance(WebSocketClient webSocketClient, String str) {
        int i = 2 % 2;
        WebSocketRepositoryImpl webSocketRepositoryImpl = new WebSocketRepositoryImpl(webSocketClient, str);
        int i2 = copydefault + 97;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return webSocketRepositoryImpl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
