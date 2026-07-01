package com.huawei.digitalpayment.consumer.base.database.di;

import com.huawei.digitalpayment.consumer.base.database.AppDatabase;
import com.huawei.digitalpayment.consumer.base.database.daos.mtandao.LogsDataDAO;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class AppDatabaseModule_ProvideLogsDataDao$ConsumerBaseUi_releaseFactory implements Factory<LogsDataDAO> {
    private static int component2 = 1;
    private static int component3;
    private final Provider<AppDatabase> ShareDataUIState;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 71;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        LogsDataDAO logsDataDAO = get();
        int i4 = component3 + 7;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return logsDataDAO;
    }

    public AppDatabaseModule_ProvideLogsDataDao$ConsumerBaseUi_releaseFactory(Provider<AppDatabase> provider) {
        this.ShareDataUIState = provider;
    }

    @Override
    public LogsDataDAO get() {
        int i = 2 % 2;
        int i2 = component3 + 9;
        component2 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            provideLogsDataDao$ConsumerBaseUi_release(this.ShareDataUIState.get());
            throw null;
        }
        LogsDataDAO logsDataDAOProvideLogsDataDao$ConsumerBaseUi_release = provideLogsDataDao$ConsumerBaseUi_release(this.ShareDataUIState.get());
        int i3 = component3 + 1;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            return logsDataDAOProvideLogsDataDao$ConsumerBaseUi_release;
        }
        obj.hashCode();
        throw null;
    }

    public static AppDatabaseModule_ProvideLogsDataDao$ConsumerBaseUi_releaseFactory create(javax.inject.Provider<AppDatabase> provider) {
        int i = 2 % 2;
        AppDatabaseModule_ProvideLogsDataDao$ConsumerBaseUi_releaseFactory appDatabaseModule_ProvideLogsDataDao$ConsumerBaseUi_releaseFactory = new AppDatabaseModule_ProvideLogsDataDao$ConsumerBaseUi_releaseFactory(Providers.asDaggerProvider(provider));
        int i2 = component2 + 79;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return appDatabaseModule_ProvideLogsDataDao$ConsumerBaseUi_releaseFactory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static AppDatabaseModule_ProvideLogsDataDao$ConsumerBaseUi_releaseFactory create(Provider<AppDatabase> provider) {
        int i = 2 % 2;
        AppDatabaseModule_ProvideLogsDataDao$ConsumerBaseUi_releaseFactory appDatabaseModule_ProvideLogsDataDao$ConsumerBaseUi_releaseFactory = new AppDatabaseModule_ProvideLogsDataDao$ConsumerBaseUi_releaseFactory(provider);
        int i2 = component3 + 125;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 89 / 0;
        }
        return appDatabaseModule_ProvideLogsDataDao$ConsumerBaseUi_releaseFactory;
    }

    public static LogsDataDAO provideLogsDataDao$ConsumerBaseUi_release(AppDatabase appDatabase) {
        int i = 2 % 2;
        int i2 = component2 + 43;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        LogsDataDAO logsDataDAO = (LogsDataDAO) Preconditions.checkNotNullFromProvides(AppDatabaseModule.INSTANCE.provideLogsDataDao$ConsumerBaseUi_release(appDatabase));
        int i4 = component3 + 67;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 48 / 0;
        }
        return logsDataDAO;
    }
}
