package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels;

import com.huawei.digitalpayment.consumer.base.database.repository.mtandao.SpeedTestsHistoryDataRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class SpeedTestHistoryViewModel_Factory implements Factory<SpeedTestHistoryViewModel> {
    private static int component2 = 0;
    private static int component3 = 1;
    private final Provider<SpeedTestsHistoryDataRepository> ShareDataUIState;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 61;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        SpeedTestHistoryViewModel speedTestHistoryViewModel = get();
        int i4 = component3 + 41;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return speedTestHistoryViewModel;
    }

    public SpeedTestHistoryViewModel_Factory(Provider<SpeedTestsHistoryDataRepository> provider) {
        this.ShareDataUIState = provider;
    }

    @Override
    public SpeedTestHistoryViewModel get() {
        int i = 2 % 2;
        int i2 = component3 + 105;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        SpeedTestHistoryViewModel speedTestHistoryViewModelNewInstance = newInstance(this.ShareDataUIState.get());
        int i4 = component2 + 15;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return speedTestHistoryViewModelNewInstance;
    }

    public static SpeedTestHistoryViewModel_Factory create(javax.inject.Provider<SpeedTestsHistoryDataRepository> provider) {
        int i = 2 % 2;
        SpeedTestHistoryViewModel_Factory speedTestHistoryViewModel_Factory = new SpeedTestHistoryViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = component3 + 105;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return speedTestHistoryViewModel_Factory;
    }

    public static SpeedTestHistoryViewModel_Factory create(Provider<SpeedTestsHistoryDataRepository> provider) {
        int i = 2 % 2;
        SpeedTestHistoryViewModel_Factory speedTestHistoryViewModel_Factory = new SpeedTestHistoryViewModel_Factory(provider);
        int i2 = component2 + 25;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return speedTestHistoryViewModel_Factory;
    }

    public static SpeedTestHistoryViewModel newInstance(SpeedTestsHistoryDataRepository speedTestsHistoryDataRepository) {
        int i = 2 % 2;
        SpeedTestHistoryViewModel speedTestHistoryViewModel = new SpeedTestHistoryViewModel(speedTestsHistoryDataRepository);
        int i2 = component2 + 95;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return speedTestHistoryViewModel;
    }
}
