package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.dashboard;

import com.huawei.digitalpayment.consumer.remoteconfig.RemoteConfig;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class MpesaGlobalDashboardRepository_Factory implements Factory<MpesaGlobalDashboardRepository> {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    private final Provider<RemoteConfig> component2;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = copydefault + 121;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        MpesaGlobalDashboardRepository mpesaGlobalDashboardRepository = get();
        int i4 = ShareDataUIState + 7;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 16 / 0;
        }
        return mpesaGlobalDashboardRepository;
    }

    public MpesaGlobalDashboardRepository_Factory(Provider<RemoteConfig> provider) {
        this.component2 = provider;
    }

    @Override
    public MpesaGlobalDashboardRepository get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 97;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        RemoteConfig remoteConfig = this.component2.get();
        if (i3 != 0) {
            return newInstance(remoteConfig);
        }
        newInstance(remoteConfig);
        throw null;
    }

    public static MpesaGlobalDashboardRepository_Factory create(javax.inject.Provider<RemoteConfig> provider) {
        int i = 2 % 2;
        MpesaGlobalDashboardRepository_Factory mpesaGlobalDashboardRepository_Factory = new MpesaGlobalDashboardRepository_Factory(Providers.asDaggerProvider(provider));
        int i2 = ShareDataUIState + 77;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return mpesaGlobalDashboardRepository_Factory;
    }

    public static MpesaGlobalDashboardRepository_Factory create(Provider<RemoteConfig> provider) {
        int i = 2 % 2;
        MpesaGlobalDashboardRepository_Factory mpesaGlobalDashboardRepository_Factory = new MpesaGlobalDashboardRepository_Factory(provider);
        int i2 = copydefault + 11;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 48 / 0;
        }
        return mpesaGlobalDashboardRepository_Factory;
    }

    public static MpesaGlobalDashboardRepository newInstance(RemoteConfig remoteConfig) {
        int i = 2 % 2;
        MpesaGlobalDashboardRepository mpesaGlobalDashboardRepository = new MpesaGlobalDashboardRepository(remoteConfig);
        int i2 = copydefault + 1;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return mpesaGlobalDashboardRepository;
    }
}
