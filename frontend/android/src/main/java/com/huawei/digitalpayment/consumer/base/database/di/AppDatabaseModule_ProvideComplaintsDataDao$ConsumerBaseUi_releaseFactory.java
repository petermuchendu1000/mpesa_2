package com.huawei.digitalpayment.consumer.base.database.di;

import com.huawei.digitalpayment.consumer.base.database.AppDatabase;
import com.huawei.digitalpayment.consumer.base.database.daos.mtandao.ComplaintsDataDAO;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class AppDatabaseModule_ProvideComplaintsDataDao$ConsumerBaseUi_releaseFactory implements Factory<ComplaintsDataDAO> {
    private static int ShareDataUIState = 1;
    private static int component3;
    private final Provider<AppDatabase> component2;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 45;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ComplaintsDataDAO complaintsDataDAO = get();
        int i4 = ShareDataUIState + 31;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return complaintsDataDAO;
    }

    public AppDatabaseModule_ProvideComplaintsDataDao$ConsumerBaseUi_releaseFactory(Provider<AppDatabase> provider) {
        this.component2 = provider;
    }

    @Override
    public ComplaintsDataDAO get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 19;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            provideComplaintsDataDao$ConsumerBaseUi_release(this.component2.get());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ComplaintsDataDAO complaintsDataDAOProvideComplaintsDataDao$ConsumerBaseUi_release = provideComplaintsDataDao$ConsumerBaseUi_release(this.component2.get());
        int i3 = component3 + 115;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 86 / 0;
        }
        return complaintsDataDAOProvideComplaintsDataDao$ConsumerBaseUi_release;
    }

    public static AppDatabaseModule_ProvideComplaintsDataDao$ConsumerBaseUi_releaseFactory create(javax.inject.Provider<AppDatabase> provider) {
        int i = 2 % 2;
        AppDatabaseModule_ProvideComplaintsDataDao$ConsumerBaseUi_releaseFactory appDatabaseModule_ProvideComplaintsDataDao$ConsumerBaseUi_releaseFactory = new AppDatabaseModule_ProvideComplaintsDataDao$ConsumerBaseUi_releaseFactory(Providers.asDaggerProvider(provider));
        int i2 = ShareDataUIState + 93;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return appDatabaseModule_ProvideComplaintsDataDao$ConsumerBaseUi_releaseFactory;
    }

    public static AppDatabaseModule_ProvideComplaintsDataDao$ConsumerBaseUi_releaseFactory create(Provider<AppDatabase> provider) {
        int i = 2 % 2;
        AppDatabaseModule_ProvideComplaintsDataDao$ConsumerBaseUi_releaseFactory appDatabaseModule_ProvideComplaintsDataDao$ConsumerBaseUi_releaseFactory = new AppDatabaseModule_ProvideComplaintsDataDao$ConsumerBaseUi_releaseFactory(provider);
        int i2 = component3 + 17;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return appDatabaseModule_ProvideComplaintsDataDao$ConsumerBaseUi_releaseFactory;
    }

    public static ComplaintsDataDAO provideComplaintsDataDao$ConsumerBaseUi_release(AppDatabase appDatabase) {
        ComplaintsDataDAO complaintsDataDAO;
        int i = 2 % 2;
        int i2 = component3 + 45;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            complaintsDataDAO = (ComplaintsDataDAO) Preconditions.checkNotNullFromProvides(AppDatabaseModule.INSTANCE.provideComplaintsDataDao$ConsumerBaseUi_release(appDatabase));
            int i3 = 1 / 0;
        } else {
            complaintsDataDAO = (ComplaintsDataDAO) Preconditions.checkNotNullFromProvides(AppDatabaseModule.INSTANCE.provideComplaintsDataDao$ConsumerBaseUi_release(appDatabase));
        }
        int i4 = ShareDataUIState + 91;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return complaintsDataDAO;
    }
}
