package com.huawei.digitalpayment.consumer.zuriui.di;

import com.huawei.digitalpayment.consumer.zuriui.data.WebSocketRepository;
import com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketClient;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class RepositoryModule_ProvideWebSocketRepositoryFactory implements Factory<WebSocketRepository> {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    private final Provider<WebSocketClient> component2;
    private final Provider<String> copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 55;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return get();
        }
        get();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public RepositoryModule_ProvideWebSocketRepositoryFactory(Provider<WebSocketClient> provider, Provider<String> provider2) {
        this.component2 = provider;
        this.copydefault = provider2;
    }

    @Override
    public WebSocketRepository get() {
        int i = 2 % 2;
        int i2 = component3 + 121;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        WebSocketRepository webSocketRepositoryProvideWebSocketRepository = provideWebSocketRepository(this.component2.get(), this.copydefault.get());
        int i4 = component3 + 97;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return webSocketRepositoryProvideWebSocketRepository;
    }

    public static RepositoryModule_ProvideWebSocketRepositoryFactory create(javax.inject.Provider<WebSocketClient> provider, javax.inject.Provider<String> provider2) {
        int i = 2 % 2;
        RepositoryModule_ProvideWebSocketRepositoryFactory repositoryModule_ProvideWebSocketRepositoryFactory = new RepositoryModule_ProvideWebSocketRepositoryFactory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
        int i2 = ShareDataUIState + 25;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return repositoryModule_ProvideWebSocketRepositoryFactory;
    }

    public static RepositoryModule_ProvideWebSocketRepositoryFactory create(Provider<WebSocketClient> provider, Provider<String> provider2) {
        int i = 2 % 2;
        RepositoryModule_ProvideWebSocketRepositoryFactory repositoryModule_ProvideWebSocketRepositoryFactory = new RepositoryModule_ProvideWebSocketRepositoryFactory(provider, provider2);
        int i2 = component3 + 101;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return repositoryModule_ProvideWebSocketRepositoryFactory;
    }

    public static WebSocketRepository provideWebSocketRepository(WebSocketClient webSocketClient, String str) {
        int i = 2 % 2;
        int i2 = component3 + 95;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        WebSocketRepository webSocketRepository = (WebSocketRepository) Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideWebSocketRepository(webSocketClient, str));
        int i3 = component3 + 113;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return webSocketRepository;
    }
}
