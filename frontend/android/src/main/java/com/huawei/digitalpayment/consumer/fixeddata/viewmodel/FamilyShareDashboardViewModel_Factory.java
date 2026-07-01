package com.huawei.digitalpayment.consumer.fixeddata.viewmodel;

import com.huawei.digitalpayment.consumer.fixeddata.domain.repository.FixedDataRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class FamilyShareDashboardViewModel_Factory implements Factory<FamilyShareDashboardViewModel> {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    private final Provider<FixedDataRepository> component2;

    @Override
    public Object get() {
        FamilyShareDashboardViewModel familyShareDashboardViewModel;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 69;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            familyShareDashboardViewModel = get();
            int i3 = 57 / 0;
        } else {
            familyShareDashboardViewModel = get();
        }
        int i4 = copydefault + 91;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return familyShareDashboardViewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public FamilyShareDashboardViewModel_Factory(Provider<FixedDataRepository> provider) {
        this.component2 = provider;
    }

    @Override
    public FamilyShareDashboardViewModel get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 73;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        FamilyShareDashboardViewModel familyShareDashboardViewModelNewInstance = newInstance(this.component2.get());
        int i4 = ShareDataUIState + 75;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return familyShareDashboardViewModelNewInstance;
    }

    public static FamilyShareDashboardViewModel_Factory create(javax.inject.Provider<FixedDataRepository> provider) {
        int i = 2 % 2;
        FamilyShareDashboardViewModel_Factory familyShareDashboardViewModel_Factory = new FamilyShareDashboardViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = ShareDataUIState + 113;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 97 / 0;
        }
        return familyShareDashboardViewModel_Factory;
    }

    public static FamilyShareDashboardViewModel_Factory create(Provider<FixedDataRepository> provider) {
        int i = 2 % 2;
        FamilyShareDashboardViewModel_Factory familyShareDashboardViewModel_Factory = new FamilyShareDashboardViewModel_Factory(provider);
        int i2 = copydefault + 53;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return familyShareDashboardViewModel_Factory;
    }

    public static FamilyShareDashboardViewModel newInstance(FixedDataRepository fixedDataRepository) {
        int i = 2 % 2;
        FamilyShareDashboardViewModel familyShareDashboardViewModel = new FamilyShareDashboardViewModel(fixedDataRepository);
        int i2 = ShareDataUIState + 77;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 53 / 0;
        }
        return familyShareDashboardViewModel;
    }
}
