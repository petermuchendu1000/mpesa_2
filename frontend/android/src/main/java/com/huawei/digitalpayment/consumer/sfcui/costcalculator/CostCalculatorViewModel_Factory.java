package com.huawei.digitalpayment.consumer.sfcui.costcalculator;

import com.huawei.digitalpayment.consumer.sfcui.costcalculator.repository.CostCalculatorRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class CostCalculatorViewModel_Factory implements Factory<CostCalculatorViewModel> {
    private static int component1 = 1;
    private static int component3;
    private final Provider<CostCalculatorRepository> copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component1 + 25;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        CostCalculatorViewModel costCalculatorViewModel = get();
        int i4 = component3 + 47;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return costCalculatorViewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public CostCalculatorViewModel_Factory(Provider<CostCalculatorRepository> provider) {
        this.copydefault = provider;
    }

    @Override
    public CostCalculatorViewModel get() {
        int i = 2 % 2;
        int i2 = component3 + 29;
        component1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            newInstance(this.copydefault.get());
            obj.hashCode();
            throw null;
        }
        CostCalculatorViewModel costCalculatorViewModelNewInstance = newInstance(this.copydefault.get());
        int i3 = component1 + 55;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            return costCalculatorViewModelNewInstance;
        }
        throw null;
    }

    public static CostCalculatorViewModel_Factory create(javax.inject.Provider<CostCalculatorRepository> provider) {
        int i = 2 % 2;
        CostCalculatorViewModel_Factory costCalculatorViewModel_Factory = new CostCalculatorViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = component1 + 87;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return costCalculatorViewModel_Factory;
        }
        throw null;
    }

    public static CostCalculatorViewModel_Factory create(Provider<CostCalculatorRepository> provider) {
        int i = 2 % 2;
        CostCalculatorViewModel_Factory costCalculatorViewModel_Factory = new CostCalculatorViewModel_Factory(provider);
        int i2 = component3 + 17;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return costCalculatorViewModel_Factory;
    }

    public static CostCalculatorViewModel newInstance(CostCalculatorRepository costCalculatorRepository) {
        int i = 2 % 2;
        CostCalculatorViewModel costCalculatorViewModel = new CostCalculatorViewModel(costCalculatorRepository);
        int i2 = component3 + 1;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return costCalculatorViewModel;
        }
        throw null;
    }
}
