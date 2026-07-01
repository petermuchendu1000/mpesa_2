package com.huawei.digitalpayment.consumer.base.database.repository.mtandao;

import com.safaricom.mtandaoapp.database.dao.SpeedTestsHistoryDataDAO;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class SpeedTestsHistoryDataRepository_Factory implements Factory<SpeedTestsHistoryDataRepository> {
    private static int ShareDataUIState = 1;
    private static int component3;
    private final Provider<SpeedTestsHistoryDataDAO> copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 37;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return get();
        }
        get();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public SpeedTestsHistoryDataRepository_Factory(Provider<SpeedTestsHistoryDataDAO> provider) {
        this.copydefault = provider;
    }

    @Override
    public SpeedTestsHistoryDataRepository get() {
        int i = 2 % 2;
        int i2 = component3 + 67;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        SpeedTestsHistoryDataRepository speedTestsHistoryDataRepositoryNewInstance = newInstance(this.copydefault.get());
        int i4 = ShareDataUIState + 83;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return speedTestsHistoryDataRepositoryNewInstance;
    }

    public static SpeedTestsHistoryDataRepository_Factory create(javax.inject.Provider<SpeedTestsHistoryDataDAO> provider) {
        int i = 2 % 2;
        SpeedTestsHistoryDataRepository_Factory speedTestsHistoryDataRepository_Factory = new SpeedTestsHistoryDataRepository_Factory(Providers.asDaggerProvider(provider));
        int i2 = ShareDataUIState + 61;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return speedTestsHistoryDataRepository_Factory;
    }

    public static SpeedTestsHistoryDataRepository_Factory create(Provider<SpeedTestsHistoryDataDAO> provider) {
        int i = 2 % 2;
        SpeedTestsHistoryDataRepository_Factory speedTestsHistoryDataRepository_Factory = new SpeedTestsHistoryDataRepository_Factory(provider);
        int i2 = ShareDataUIState + 91;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 70 / 0;
        }
        return speedTestsHistoryDataRepository_Factory;
    }

    public static SpeedTestsHistoryDataRepository newInstance(SpeedTestsHistoryDataDAO speedTestsHistoryDataDAO) {
        int i = 2 % 2;
        SpeedTestsHistoryDataRepository speedTestsHistoryDataRepository = new SpeedTestsHistoryDataRepository(speedTestsHistoryDataDAO);
        int i2 = component3 + 89;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return speedTestsHistoryDataRepository;
        }
        throw null;
    }
}
