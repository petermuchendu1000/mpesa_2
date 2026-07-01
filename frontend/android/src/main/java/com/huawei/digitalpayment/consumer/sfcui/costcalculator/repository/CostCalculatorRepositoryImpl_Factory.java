package com.huawei.digitalpayment.consumer.sfcui.costcalculator.repository;

import com.huawei.digitalpayment.consumer.sfcui.api.CostCalculatorService;
import com.huawei.digitalpayment.consumer.sfcui.local.CostCalculatorLocalDataSource;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class CostCalculatorRepositoryImpl_Factory implements Factory<CostCalculatorRepositoryImpl> {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    private final Provider<CostCalculatorService> component1;
    private final Provider<CostCalculatorLocalDataSource> component2;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 77;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            get();
            throw null;
        }
        CostCalculatorRepositoryImpl costCalculatorRepositoryImpl = get();
        int i3 = copydefault + 105;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return costCalculatorRepositoryImpl;
    }

    public CostCalculatorRepositoryImpl_Factory(Provider<CostCalculatorService> provider, Provider<CostCalculatorLocalDataSource> provider2) {
        this.component1 = provider;
        this.component2 = provider2;
    }

    @Override
    public CostCalculatorRepositoryImpl get() {
        int i = 2 % 2;
        int i2 = copydefault + 103;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            newInstance(this.component1.get(), this.component2.get());
            throw null;
        }
        CostCalculatorRepositoryImpl costCalculatorRepositoryImplNewInstance = newInstance(this.component1.get(), this.component2.get());
        int i3 = copydefault + 45;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return costCalculatorRepositoryImplNewInstance;
    }

    public static CostCalculatorRepositoryImpl_Factory create(javax.inject.Provider<CostCalculatorService> provider, javax.inject.Provider<CostCalculatorLocalDataSource> provider2) {
        int i = 2 % 2;
        CostCalculatorRepositoryImpl_Factory costCalculatorRepositoryImpl_Factory = new CostCalculatorRepositoryImpl_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
        int i2 = ShareDataUIState + 63;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return costCalculatorRepositoryImpl_Factory;
    }

    public static CostCalculatorRepositoryImpl_Factory create(Provider<CostCalculatorService> provider, Provider<CostCalculatorLocalDataSource> provider2) {
        int i = 2 % 2;
        CostCalculatorRepositoryImpl_Factory costCalculatorRepositoryImpl_Factory = new CostCalculatorRepositoryImpl_Factory(provider, provider2);
        int i2 = ShareDataUIState + 7;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 89 / 0;
        }
        return costCalculatorRepositoryImpl_Factory;
    }

    public static CostCalculatorRepositoryImpl newInstance(CostCalculatorService costCalculatorService, CostCalculatorLocalDataSource costCalculatorLocalDataSource) {
        int i = 2 % 2;
        CostCalculatorRepositoryImpl costCalculatorRepositoryImpl = new CostCalculatorRepositoryImpl(costCalculatorService, costCalculatorLocalDataSource);
        int i2 = ShareDataUIState + 1;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return costCalculatorRepositoryImpl;
    }
}
