package com.huawei.digitalpayment.consumer.zuriui.data;

import com.huawei.digitalpayment.consumer.base.database.daos.MessageDao;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class MessagesRepositoryImpl_Factory implements Factory<MessagesRepositoryImpl> {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    private final Provider<MessageDao> component2;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 93;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        MessagesRepositoryImpl messagesRepositoryImpl = get();
        if (i3 == 0) {
            int i4 = 72 / 0;
        }
        return messagesRepositoryImpl;
    }

    public MessagesRepositoryImpl_Factory(Provider<MessageDao> provider) {
        this.component2 = provider;
    }

    @Override
    public MessagesRepositoryImpl get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 45;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        MessageDao messageDao = this.component2.get();
        if (i3 != 0) {
            return newInstance(messageDao);
        }
        newInstance(messageDao);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static MessagesRepositoryImpl_Factory create(javax.inject.Provider<MessageDao> provider) {
        int i = 2 % 2;
        MessagesRepositoryImpl_Factory messagesRepositoryImpl_Factory = new MessagesRepositoryImpl_Factory(Providers.asDaggerProvider(provider));
        int i2 = component3 + 121;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return messagesRepositoryImpl_Factory;
        }
        throw null;
    }

    public static MessagesRepositoryImpl_Factory create(Provider<MessageDao> provider) {
        int i = 2 % 2;
        MessagesRepositoryImpl_Factory messagesRepositoryImpl_Factory = new MessagesRepositoryImpl_Factory(provider);
        int i2 = component3 + 109;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return messagesRepositoryImpl_Factory;
    }

    public static MessagesRepositoryImpl newInstance(MessageDao messageDao) {
        int i = 2 % 2;
        MessagesRepositoryImpl messagesRepositoryImpl = new MessagesRepositoryImpl(messageDao);
        int i2 = component3 + 13;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return messagesRepositoryImpl;
    }
}
