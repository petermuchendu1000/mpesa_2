package com.huawei.digitalpayment.consumer.zuriui;

import com.huawei.digitalpayment.consumer.zuriui.data.MessagesRepository;
import com.huawei.digitalpayment.consumer.zuriui.data.WebSocketRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class ZuriChatViewModel_Factory implements Factory<ZuriChatViewModel> {
    private static int component1 = 1;
    private static int copydefault;
    private final Provider<WebSocketRepository> ShareDataUIState;
    private final Provider<MessagesRepository> component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component1 + 93;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return get();
        }
        get();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ZuriChatViewModel_Factory(Provider<MessagesRepository> provider, Provider<WebSocketRepository> provider2) {
        this.component3 = provider;
        this.ShareDataUIState = provider2;
    }

    @Override
    public ZuriChatViewModel get() {
        int i = 2 % 2;
        int i2 = copydefault + 55;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ZuriChatViewModel zuriChatViewModelNewInstance = newInstance(this.component3.get(), this.ShareDataUIState.get());
        int i4 = component1 + 29;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return zuriChatViewModelNewInstance;
        }
        throw null;
    }

    public static ZuriChatViewModel_Factory create(javax.inject.Provider<MessagesRepository> provider, javax.inject.Provider<WebSocketRepository> provider2) {
        int i = 2 % 2;
        ZuriChatViewModel_Factory zuriChatViewModel_Factory = new ZuriChatViewModel_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
        int i2 = component1 + 13;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return zuriChatViewModel_Factory;
    }

    public static ZuriChatViewModel_Factory create(Provider<MessagesRepository> provider, Provider<WebSocketRepository> provider2) {
        int i = 2 % 2;
        ZuriChatViewModel_Factory zuriChatViewModel_Factory = new ZuriChatViewModel_Factory(provider, provider2);
        int i2 = component1 + 113;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return zuriChatViewModel_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ZuriChatViewModel newInstance(MessagesRepository messagesRepository, WebSocketRepository webSocketRepository) {
        int i = 2 % 2;
        ZuriChatViewModel zuriChatViewModel = new ZuriChatViewModel(messagesRepository, webSocketRepository);
        int i2 = copydefault + 117;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return zuriChatViewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
