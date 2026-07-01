package com.huawei.digitalpayment.consumer.base.database.repository.mtandao;

import com.huawei.digitalpayment.consumer.base.database.daos.mtandao.LogsDataDAO;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class LogsDataRepository_Factory implements Factory<LogsDataRepository> {
    private static int component1 = 1;
    private static int component3;
    private final Provider<LogsDataDAO> ShareDataUIState;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 25;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        LogsDataRepository logsDataRepository = get();
        int i4 = component1 + 105;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return logsDataRepository;
    }

    public LogsDataRepository_Factory(Provider<LogsDataDAO> provider) {
        this.ShareDataUIState = provider;
    }

    @Override
    public LogsDataRepository get() {
        int i = 2 % 2;
        int i2 = component1 + 51;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        LogsDataRepository logsDataRepositoryNewInstance = newInstance(this.ShareDataUIState.get());
        int i4 = component1 + 109;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return logsDataRepositoryNewInstance;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static LogsDataRepository_Factory create(javax.inject.Provider<LogsDataDAO> provider) {
        int i = 2 % 2;
        LogsDataRepository_Factory logsDataRepository_Factory = new LogsDataRepository_Factory(Providers.asDaggerProvider(provider));
        int i2 = component1 + 53;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return logsDataRepository_Factory;
        }
        throw null;
    }

    public static LogsDataRepository_Factory create(Provider<LogsDataDAO> provider) {
        int i = 2 % 2;
        LogsDataRepository_Factory logsDataRepository_Factory = new LogsDataRepository_Factory(provider);
        int i2 = component1 + 39;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return logsDataRepository_Factory;
    }

    public static LogsDataRepository newInstance(LogsDataDAO logsDataDAO) {
        int i = 2 % 2;
        LogsDataRepository logsDataRepository = new LogsDataRepository(logsDataDAO);
        int i2 = component1 + 61;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return logsDataRepository;
    }
}
