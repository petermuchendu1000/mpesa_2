package com.huawei.digitalpayment.consumer.zuriui.di;

import com.huawei.digitalpayment.consumer.base.database.daos.MessageDao;
import com.huawei.digitalpayment.consumer.zuriui.data.MessagesRepository;
import com.huawei.digitalpayment.consumer.zuriui.data.MessagesRepositoryImpl;
import com.huawei.digitalpayment.consumer.zuriui.data.WebSocketRepository;
import com.huawei.digitalpayment.consumer.zuriui.data.WebSocketRepositoryImpl;
import com.huawei.digitalpayment.consumer.zuriui.websocket.WebSocketClient;
import dagger.Module;
import dagger.Provides;
import javax.inject.Named;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\rH\u0007¨\u0006\u000e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/zuriui/di/RepositoryModule;", "", "<init>", "()V", "provideMessageRepository", "Lcom/huawei/digitalpayment/consumer/zuriui/data/MessagesRepository;", "messageDao", "Lcom/huawei/digitalpayment/consumer/base/database/daos/MessageDao;", "provideWebSocketRepository", "Lcom/huawei/digitalpayment/consumer/zuriui/data/WebSocketRepository;", "webSocketClient", "Lcom/huawei/digitalpayment/consumer/zuriui/websocket/WebSocketClient;", "webSocketUrl", "", "ConsumerSfcZuriUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Module
public final class RepositoryModule {
    public static final int $stable = 0;
    public static final RepositoryModule INSTANCE = new RepositoryModule();
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 1;
    private static int copydefault;

    private RepositoryModule() {
    }

    @Provides
    @Singleton
    public final MessagesRepository provideMessageRepository(MessageDao messageDao) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(messageDao, "");
        MessagesRepositoryImpl messagesRepositoryImpl = new MessagesRepositoryImpl(messageDao);
        int i2 = component3 + 113;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return messagesRepositoryImpl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Provides
    @Singleton
    public final WebSocketRepository provideWebSocketRepository(WebSocketClient webSocketClient, @Named(WebSocketModule.NAMED_WEB_SOCKET_URL) String webSocketUrl) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(webSocketClient, "");
        Intrinsics.checkNotNullParameter(webSocketUrl, "");
        WebSocketRepositoryImpl webSocketRepositoryImpl = new WebSocketRepositoryImpl(webSocketClient, webSocketUrl);
        int i2 = component1 + 99;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return webSocketRepositoryImpl;
        }
        throw null;
    }

    static {
        int i = component2 + 49;
        copydefault = i % 128;
        int i2 = i % 2;
    }
}
