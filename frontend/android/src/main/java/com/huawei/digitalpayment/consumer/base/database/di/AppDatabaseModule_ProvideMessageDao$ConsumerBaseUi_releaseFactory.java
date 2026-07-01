package com.huawei.digitalpayment.consumer.base.database.di;

import com.huawei.digitalpayment.consumer.base.database.AppDatabase;
import com.huawei.digitalpayment.consumer.base.database.daos.MessageDao;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class AppDatabaseModule_ProvideMessageDao$ConsumerBaseUi_releaseFactory implements Factory<MessageDao> {
    private static int component3 = 0;
    private static int copydefault = 1;
    private final Provider<AppDatabase> component1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = copydefault + 111;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return get();
        }
        get();
        throw null;
    }

    public AppDatabaseModule_ProvideMessageDao$ConsumerBaseUi_releaseFactory(Provider<AppDatabase> provider) {
        this.component1 = provider;
    }

    @Override
    public MessageDao get() {
        int i = 2 % 2;
        int i2 = copydefault + 73;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        MessageDao messageDaoProvideMessageDao$ConsumerBaseUi_release = provideMessageDao$ConsumerBaseUi_release(this.component1.get());
        int i4 = copydefault + 19;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return messageDaoProvideMessageDao$ConsumerBaseUi_release;
        }
        throw null;
    }

    public static AppDatabaseModule_ProvideMessageDao$ConsumerBaseUi_releaseFactory create(javax.inject.Provider<AppDatabase> provider) {
        int i = 2 % 2;
        AppDatabaseModule_ProvideMessageDao$ConsumerBaseUi_releaseFactory appDatabaseModule_ProvideMessageDao$ConsumerBaseUi_releaseFactory = new AppDatabaseModule_ProvideMessageDao$ConsumerBaseUi_releaseFactory(Providers.asDaggerProvider(provider));
        int i2 = copydefault + 9;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return appDatabaseModule_ProvideMessageDao$ConsumerBaseUi_releaseFactory;
        }
        throw null;
    }

    public static AppDatabaseModule_ProvideMessageDao$ConsumerBaseUi_releaseFactory create(Provider<AppDatabase> provider) {
        int i = 2 % 2;
        AppDatabaseModule_ProvideMessageDao$ConsumerBaseUi_releaseFactory appDatabaseModule_ProvideMessageDao$ConsumerBaseUi_releaseFactory = new AppDatabaseModule_ProvideMessageDao$ConsumerBaseUi_releaseFactory(provider);
        int i2 = component3 + 7;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return appDatabaseModule_ProvideMessageDao$ConsumerBaseUi_releaseFactory;
    }

    public static MessageDao provideMessageDao$ConsumerBaseUi_release(AppDatabase appDatabase) {
        int i = 2 % 2;
        int i2 = copydefault + 37;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        MessageDao messageDao = (MessageDao) Preconditions.checkNotNullFromProvides(AppDatabaseModule.INSTANCE.provideMessageDao$ConsumerBaseUi_release(appDatabase));
        int i4 = component3 + 51;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return messageDao;
    }
}
