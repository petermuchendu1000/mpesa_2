package com.huawei.digitalpayment.consumer.base.database.di;

import com.huawei.digitalpayment.consumer.base.database.AppDatabase;
import com.huawei.digitalpayment.consumer.base.database.daos.mtandao.PhoneDataDAO;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class AppDatabaseModule_ProvidePhoneDataDao$ConsumerBaseUi_releaseFactory implements Factory<PhoneDataDAO> {
    private static int ShareDataUIState = 1;
    private static int component3;
    private final Provider<AppDatabase> copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 85;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        PhoneDataDAO phoneDataDAO = get();
        int i4 = component3 + 51;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 20 / 0;
        }
        return phoneDataDAO;
    }

    public AppDatabaseModule_ProvidePhoneDataDao$ConsumerBaseUi_releaseFactory(Provider<AppDatabase> provider) {
        this.copydefault = provider;
    }

    @Override
    public PhoneDataDAO get() {
        int i = 2 % 2;
        int i2 = component3 + 21;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        PhoneDataDAO phoneDataDAOProvidePhoneDataDao$ConsumerBaseUi_release = providePhoneDataDao$ConsumerBaseUi_release(this.copydefault.get());
        int i4 = component3 + 79;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return phoneDataDAOProvidePhoneDataDao$ConsumerBaseUi_release;
    }

    public static AppDatabaseModule_ProvidePhoneDataDao$ConsumerBaseUi_releaseFactory create(javax.inject.Provider<AppDatabase> provider) {
        int i = 2 % 2;
        AppDatabaseModule_ProvidePhoneDataDao$ConsumerBaseUi_releaseFactory appDatabaseModule_ProvidePhoneDataDao$ConsumerBaseUi_releaseFactory = new AppDatabaseModule_ProvidePhoneDataDao$ConsumerBaseUi_releaseFactory(Providers.asDaggerProvider(provider));
        int i2 = component3 + 49;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return appDatabaseModule_ProvidePhoneDataDao$ConsumerBaseUi_releaseFactory;
    }

    public static AppDatabaseModule_ProvidePhoneDataDao$ConsumerBaseUi_releaseFactory create(Provider<AppDatabase> provider) {
        int i = 2 % 2;
        AppDatabaseModule_ProvidePhoneDataDao$ConsumerBaseUi_releaseFactory appDatabaseModule_ProvidePhoneDataDao$ConsumerBaseUi_releaseFactory = new AppDatabaseModule_ProvidePhoneDataDao$ConsumerBaseUi_releaseFactory(provider);
        int i2 = component3 + 15;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return appDatabaseModule_ProvidePhoneDataDao$ConsumerBaseUi_releaseFactory;
        }
        throw null;
    }

    public static PhoneDataDAO providePhoneDataDao$ConsumerBaseUi_release(AppDatabase appDatabase) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 1;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        PhoneDataDAO phoneDataDAO = (PhoneDataDAO) Preconditions.checkNotNullFromProvides(AppDatabaseModule.INSTANCE.providePhoneDataDao$ConsumerBaseUi_release(appDatabase));
        int i4 = ShareDataUIState + 27;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return phoneDataDAO;
    }
}
