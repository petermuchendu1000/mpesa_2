package com.huawei.digitalpayment.consumer.di;

import com.huawei.digitalpayment.consumer.base.framework.PhoneNetworkInformationProvider;
import com.huawei.digitalpayment.consumer.base.repository.ConfigurationRepository;
import com.huawei.digitalpayment.consumer.base.sim.SimStateValidator;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class DeviceModule_ProvideSimStateValidatorFactory implements Factory<SimStateValidator> {
    private static int component1 = 1;
    private static int copydefault;
    private final Provider<PhoneNetworkInformationProvider> ShareDataUIState;
    private final Provider<ConfigurationRepository> component3;

    @Override
    public Object get() {
        SimStateValidator simStateValidator;
        int i = 2 % 2;
        int i2 = copydefault + 121;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            simStateValidator = get();
            int i3 = 47 / 0;
        } else {
            simStateValidator = get();
        }
        int i4 = component1 + 33;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 54 / 0;
        }
        return simStateValidator;
    }

    public DeviceModule_ProvideSimStateValidatorFactory(Provider<ConfigurationRepository> provider, Provider<PhoneNetworkInformationProvider> provider2) {
        this.component3 = provider;
        this.ShareDataUIState = provider2;
    }

    @Override
    public SimStateValidator get() {
        int i = 2 % 2;
        int i2 = component1 + 13;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        SimStateValidator simStateValidatorProvideSimStateValidator = provideSimStateValidator(this.component3.get(), this.ShareDataUIState.get());
        int i4 = copydefault + 57;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return simStateValidatorProvideSimStateValidator;
    }

    public static DeviceModule_ProvideSimStateValidatorFactory create(javax.inject.Provider<ConfigurationRepository> provider, javax.inject.Provider<PhoneNetworkInformationProvider> provider2) {
        int i = 2 % 2;
        DeviceModule_ProvideSimStateValidatorFactory deviceModule_ProvideSimStateValidatorFactory = new DeviceModule_ProvideSimStateValidatorFactory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
        int i2 = component1 + 1;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return deviceModule_ProvideSimStateValidatorFactory;
        }
        throw null;
    }

    public static DeviceModule_ProvideSimStateValidatorFactory create(Provider<ConfigurationRepository> provider, Provider<PhoneNetworkInformationProvider> provider2) {
        int i = 2 % 2;
        DeviceModule_ProvideSimStateValidatorFactory deviceModule_ProvideSimStateValidatorFactory = new DeviceModule_ProvideSimStateValidatorFactory(provider, provider2);
        int i2 = copydefault + 39;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return deviceModule_ProvideSimStateValidatorFactory;
        }
        throw null;
    }

    public static SimStateValidator provideSimStateValidator(ConfigurationRepository configurationRepository, PhoneNetworkInformationProvider phoneNetworkInformationProvider) {
        int i = 2 % 2;
        int i2 = copydefault + 61;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        SimStateValidator simStateValidator = (SimStateValidator) Preconditions.checkNotNullFromProvides(DeviceModule.INSTANCE.provideSimStateValidator(configurationRepository, phoneNetworkInformationProvider));
        int i3 = copydefault + 97;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return simStateValidator;
    }
}
