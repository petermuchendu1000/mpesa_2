package com.huawei.digitalpayment.consumer.zuriui.di;

import com.huawei.digitalpayment.consumer.base.database.daos.MessageDao;
import com.huawei.digitalpayment.consumer.zuriui.data.MessagesRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class RepositoryModule_ProvideMessageRepositoryFactory implements Factory<MessagesRepository> {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    private final Provider<MessageDao> component1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 107;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        MessagesRepository messagesRepository = get();
        int i4 = ShareDataUIState + 45;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return messagesRepository;
    }

    public RepositoryModule_ProvideMessageRepositoryFactory(Provider<MessageDao> provider) {
        this.component1 = provider;
    }

    @Override
    public MessagesRepository get() {
        int i = 2 % 2;
        int i2 = copydefault + 49;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        MessagesRepository messagesRepositoryProvideMessageRepository = provideMessageRepository(this.component1.get());
        if (i3 == 0) {
            int i4 = 85 / 0;
        }
        return messagesRepositoryProvideMessageRepository;
    }

    public static RepositoryModule_ProvideMessageRepositoryFactory create(javax.inject.Provider<MessageDao> provider) {
        int i = 2 % 2;
        RepositoryModule_ProvideMessageRepositoryFactory repositoryModule_ProvideMessageRepositoryFactory = new RepositoryModule_ProvideMessageRepositoryFactory(Providers.asDaggerProvider(provider));
        int i2 = ShareDataUIState + 39;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return repositoryModule_ProvideMessageRepositoryFactory;
    }

    public static RepositoryModule_ProvideMessageRepositoryFactory create(Provider<MessageDao> provider) {
        int i = 2 % 2;
        RepositoryModule_ProvideMessageRepositoryFactory repositoryModule_ProvideMessageRepositoryFactory = new RepositoryModule_ProvideMessageRepositoryFactory(provider);
        int i2 = copydefault + 55;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 85 / 0;
        }
        return repositoryModule_ProvideMessageRepositoryFactory;
    }

    public static MessagesRepository provideMessageRepository(MessageDao messageDao) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 117;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        MessagesRepository messagesRepository = (MessagesRepository) Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideMessageRepository(messageDao));
        int i4 = ShareDataUIState + 9;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return messagesRepository;
        }
        throw null;
    }
}
