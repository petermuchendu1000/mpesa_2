package com.huawei.digitalpayment.consumer.base.database.di;

import com.huawei.digitalpayment.consumer.base.database.AppDatabase;
import com.huawei.digitalpayment.consumer.base.database.daos.mtandao.UserDataDAO;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class AppDatabaseModule_ProvideUserDataDao$ConsumerBaseUi_releaseFactory implements Factory<UserDataDAO> {
    private static int component2 = 0;
    private static int component3 = 1;
    private final Provider<AppDatabase> ShareDataUIState;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 53;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        UserDataDAO userDataDAO = get();
        int i4 = component2 + 15;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return userDataDAO;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public AppDatabaseModule_ProvideUserDataDao$ConsumerBaseUi_releaseFactory(Provider<AppDatabase> provider) {
        this.ShareDataUIState = provider;
    }

    @Override
    public UserDataDAO get() {
        UserDataDAO userDataDAOProvideUserDataDao$ConsumerBaseUi_release;
        int i = 2 % 2;
        int i2 = component3 + 19;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            userDataDAOProvideUserDataDao$ConsumerBaseUi_release = provideUserDataDao$ConsumerBaseUi_release(this.ShareDataUIState.get());
            int i3 = 3 / 0;
        } else {
            userDataDAOProvideUserDataDao$ConsumerBaseUi_release = provideUserDataDao$ConsumerBaseUi_release(this.ShareDataUIState.get());
        }
        int i4 = component2 + 111;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return userDataDAOProvideUserDataDao$ConsumerBaseUi_release;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static AppDatabaseModule_ProvideUserDataDao$ConsumerBaseUi_releaseFactory create(javax.inject.Provider<AppDatabase> provider) {
        int i = 2 % 2;
        AppDatabaseModule_ProvideUserDataDao$ConsumerBaseUi_releaseFactory appDatabaseModule_ProvideUserDataDao$ConsumerBaseUi_releaseFactory = new AppDatabaseModule_ProvideUserDataDao$ConsumerBaseUi_releaseFactory(Providers.asDaggerProvider(provider));
        int i2 = component3 + 19;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return appDatabaseModule_ProvideUserDataDao$ConsumerBaseUi_releaseFactory;
    }

    public static AppDatabaseModule_ProvideUserDataDao$ConsumerBaseUi_releaseFactory create(Provider<AppDatabase> provider) {
        int i = 2 % 2;
        AppDatabaseModule_ProvideUserDataDao$ConsumerBaseUi_releaseFactory appDatabaseModule_ProvideUserDataDao$ConsumerBaseUi_releaseFactory = new AppDatabaseModule_ProvideUserDataDao$ConsumerBaseUi_releaseFactory(provider);
        int i2 = component2 + 85;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return appDatabaseModule_ProvideUserDataDao$ConsumerBaseUi_releaseFactory;
    }

    public static UserDataDAO provideUserDataDao$ConsumerBaseUi_release(AppDatabase appDatabase) {
        int i = 2 % 2;
        int i2 = component2 + 103;
        component3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        UserDataDAO userDataDAO = (UserDataDAO) Preconditions.checkNotNullFromProvides(AppDatabaseModule.INSTANCE.provideUserDataDao$ConsumerBaseUi_release(appDatabase));
        int i3 = component2 + 47;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            return userDataDAO;
        }
        throw null;
    }
}
