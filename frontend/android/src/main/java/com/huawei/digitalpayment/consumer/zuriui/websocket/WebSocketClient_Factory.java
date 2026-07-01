package com.huawei.digitalpayment.consumer.zuriui.websocket;

import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import kotlinx.serialization.json.Json;

public final class WebSocketClient_Factory implements Factory<WebSocketClient> {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    private final Provider<Json> component1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = copydefault + 73;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        WebSocketClient webSocketClient = get();
        int i4 = copydefault + 21;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return webSocketClient;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public WebSocketClient_Factory(Provider<Json> provider) {
        this.component1 = provider;
    }

    @Override
    public WebSocketClient get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 19;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        WebSocketClient webSocketClientNewInstance = newInstance(this.component1.get());
        int i4 = copydefault + 17;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return webSocketClientNewInstance;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static WebSocketClient_Factory create(javax.inject.Provider<Json> provider) {
        int i = 2 % 2;
        WebSocketClient_Factory webSocketClient_Factory = new WebSocketClient_Factory(Providers.asDaggerProvider(provider));
        int i2 = ShareDataUIState + 89;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return webSocketClient_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static WebSocketClient_Factory create(Provider<Json> provider) {
        int i = 2 % 2;
        WebSocketClient_Factory webSocketClient_Factory = new WebSocketClient_Factory(provider);
        int i2 = ShareDataUIState + 35;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return webSocketClient_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static WebSocketClient newInstance(Json json) {
        int i = 2 % 2;
        WebSocketClient webSocketClient = new WebSocketClient(json);
        int i2 = copydefault + 55;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return webSocketClient;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
