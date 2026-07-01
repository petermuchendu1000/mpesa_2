package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.dashboard;

import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class MpesaGlobalDashboardViewModel_Factory implements Factory<MpesaGlobalDashboardViewModel> {
    private static int component1 = 1;
    private static int copydefault;
    private final Provider<MpesaGlobalDashboardRepository> component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = copydefault + 9;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            get();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        MpesaGlobalDashboardViewModel mpesaGlobalDashboardViewModel = get();
        int i3 = component1 + 7;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return mpesaGlobalDashboardViewModel;
    }

    public MpesaGlobalDashboardViewModel_Factory(Provider<MpesaGlobalDashboardRepository> provider) {
        this.component3 = provider;
    }

    @Override
    public MpesaGlobalDashboardViewModel get() {
        int i = 2 % 2;
        int i2 = copydefault + 31;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        MpesaGlobalDashboardRepository mpesaGlobalDashboardRepository = this.component3.get();
        if (i3 != 0) {
            return newInstance(mpesaGlobalDashboardRepository);
        }
        newInstance(mpesaGlobalDashboardRepository);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static MpesaGlobalDashboardViewModel_Factory create(javax.inject.Provider<MpesaGlobalDashboardRepository> provider) {
        int i = 2 % 2;
        MpesaGlobalDashboardViewModel_Factory mpesaGlobalDashboardViewModel_Factory = new MpesaGlobalDashboardViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = copydefault + 29;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return mpesaGlobalDashboardViewModel_Factory;
    }

    public static MpesaGlobalDashboardViewModel_Factory create(Provider<MpesaGlobalDashboardRepository> provider) {
        int i = 2 % 2;
        MpesaGlobalDashboardViewModel_Factory mpesaGlobalDashboardViewModel_Factory = new MpesaGlobalDashboardViewModel_Factory(provider);
        int i2 = copydefault + 37;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return mpesaGlobalDashboardViewModel_Factory;
    }

    public static MpesaGlobalDashboardViewModel newInstance(MpesaGlobalDashboardRepository mpesaGlobalDashboardRepository) {
        int i = 2 % 2;
        MpesaGlobalDashboardViewModel mpesaGlobalDashboardViewModel = new MpesaGlobalDashboardViewModel(mpesaGlobalDashboardRepository);
        int i2 = component1 + 3;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return mpesaGlobalDashboardViewModel;
    }
}
