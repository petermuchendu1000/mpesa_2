package com.huawei.digitalpayment.consumer.sfcui.profile.viewmodel;

import com.huawei.digitalpayment.consumer.sfcui.profile.model.IBiometricsSettingModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class BiometricsViewModel_Factory implements Factory<BiometricsViewModel> {
    private static int component1 = 0;
    private static int component2 = 1;
    private final Provider<IBiometricsSettingModel> copydefault;

    @Override
    public Object get() {
        BiometricsViewModel biometricsViewModel;
        int i = 2 % 2;
        int i2 = component1 + 113;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            biometricsViewModel = get();
            int i3 = 69 / 0;
        } else {
            biometricsViewModel = get();
        }
        int i4 = component2 + 97;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return biometricsViewModel;
    }

    public BiometricsViewModel_Factory(Provider<IBiometricsSettingModel> provider) {
        this.copydefault = provider;
    }

    @Override
    public BiometricsViewModel get() {
        BiometricsViewModel biometricsViewModelNewInstance;
        int i = 2 % 2;
        int i2 = component2 + 117;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            biometricsViewModelNewInstance = newInstance(this.copydefault.get());
            int i3 = 31 / 0;
        } else {
            biometricsViewModelNewInstance = newInstance(this.copydefault.get());
        }
        int i4 = component2 + 13;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return biometricsViewModelNewInstance;
        }
        throw null;
    }

    public static BiometricsViewModel_Factory create(javax.inject.Provider<IBiometricsSettingModel> provider) {
        int i = 2 % 2;
        BiometricsViewModel_Factory biometricsViewModel_Factory = new BiometricsViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = component2 + 67;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 48 / 0;
        }
        return biometricsViewModel_Factory;
    }

    public static BiometricsViewModel_Factory create(Provider<IBiometricsSettingModel> provider) {
        int i = 2 % 2;
        BiometricsViewModel_Factory biometricsViewModel_Factory = new BiometricsViewModel_Factory(provider);
        int i2 = component2 + 105;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return biometricsViewModel_Factory;
    }

    public static BiometricsViewModel newInstance(IBiometricsSettingModel iBiometricsSettingModel) {
        int i = 2 % 2;
        BiometricsViewModel biometricsViewModel = new BiometricsViewModel(iBiometricsSettingModel);
        int i2 = component1 + 109;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return biometricsViewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
