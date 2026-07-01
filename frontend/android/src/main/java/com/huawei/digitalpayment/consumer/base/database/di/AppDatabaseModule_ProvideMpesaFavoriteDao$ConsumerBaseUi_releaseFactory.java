package com.huawei.digitalpayment.consumer.base.database.di;

import com.huawei.digitalpayment.consumer.base.database.AppDatabase;
import com.huawei.digitalpayment.consumer.base.database.daos.favorite.MpesaFavoriteDao;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class AppDatabaseModule_ProvideMpesaFavoriteDao$ConsumerBaseUi_releaseFactory implements Factory<MpesaFavoriteDao> {
    private static int component1 = 1;
    private static int component3;
    private final Provider<AppDatabase> component2;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component1 + 63;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return get();
        }
        get();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public AppDatabaseModule_ProvideMpesaFavoriteDao$ConsumerBaseUi_releaseFactory(Provider<AppDatabase> provider) {
        this.component2 = provider;
    }

    @Override
    public MpesaFavoriteDao get() {
        int i = 2 % 2;
        int i2 = component1 + 59;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        MpesaFavoriteDao mpesaFavoriteDaoProvideMpesaFavoriteDao$ConsumerBaseUi_release = provideMpesaFavoriteDao$ConsumerBaseUi_release(this.component2.get());
        int i4 = component3 + 99;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return mpesaFavoriteDaoProvideMpesaFavoriteDao$ConsumerBaseUi_release;
    }

    public static AppDatabaseModule_ProvideMpesaFavoriteDao$ConsumerBaseUi_releaseFactory create(javax.inject.Provider<AppDatabase> provider) {
        int i = 2 % 2;
        AppDatabaseModule_ProvideMpesaFavoriteDao$ConsumerBaseUi_releaseFactory appDatabaseModule_ProvideMpesaFavoriteDao$ConsumerBaseUi_releaseFactory = new AppDatabaseModule_ProvideMpesaFavoriteDao$ConsumerBaseUi_releaseFactory(Providers.asDaggerProvider(provider));
        int i2 = component3 + 97;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return appDatabaseModule_ProvideMpesaFavoriteDao$ConsumerBaseUi_releaseFactory;
    }

    public static AppDatabaseModule_ProvideMpesaFavoriteDao$ConsumerBaseUi_releaseFactory create(Provider<AppDatabase> provider) {
        int i = 2 % 2;
        AppDatabaseModule_ProvideMpesaFavoriteDao$ConsumerBaseUi_releaseFactory appDatabaseModule_ProvideMpesaFavoriteDao$ConsumerBaseUi_releaseFactory = new AppDatabaseModule_ProvideMpesaFavoriteDao$ConsumerBaseUi_releaseFactory(provider);
        int i2 = component3 + 93;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return appDatabaseModule_ProvideMpesaFavoriteDao$ConsumerBaseUi_releaseFactory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static MpesaFavoriteDao provideMpesaFavoriteDao$ConsumerBaseUi_release(AppDatabase appDatabase) {
        int i = 2 % 2;
        int i2 = component1 + 11;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        MpesaFavoriteDao mpesaFavoriteDao = (MpesaFavoriteDao) Preconditions.checkNotNullFromProvides(AppDatabaseModule.INSTANCE.provideMpesaFavoriteDao$ConsumerBaseUi_release(appDatabase));
        int i4 = component1 + 69;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return mpesaFavoriteDao;
    }
}
