package com.huawei.digitalpayment.consumer.di;

import com.huawei.digitalpayment.consumer.base.repository.ConfigurationRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class RepositoryModule_ProvideConfigurationRepositoryFactory implements Factory<ConfigurationRepository> {
    private static int component1 = 0;
    private static int copydefault = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = copydefault + 57;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ConfigurationRepository configurationRepository = get();
        int i4 = component1 + 99;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return configurationRepository;
    }

    @Override
    public ConfigurationRepository get() {
        int i = 2 % 2;
        int i2 = copydefault + 75;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            provideConfigurationRepository();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ConfigurationRepository configurationRepositoryProvideConfigurationRepository = provideConfigurationRepository();
        int i3 = copydefault + 117;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return configurationRepositoryProvideConfigurationRepository;
    }

    public static RepositoryModule_ProvideConfigurationRepositoryFactory create() {
        int i = 2 % 2;
        int i2 = component1 + 109;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        RepositoryModule_ProvideConfigurationRepositoryFactory repositoryModule_ProvideConfigurationRepositoryFactory = component2.component2;
        int i4 = copydefault + 5;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return repositoryModule_ProvideConfigurationRepositoryFactory;
    }

    public static ConfigurationRepository provideConfigurationRepository() {
        int i = 2 % 2;
        int i2 = copydefault + 17;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ConfigurationRepository configurationRepository = (ConfigurationRepository) Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideConfigurationRepository());
        int i3 = copydefault + 9;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 69 / 0;
        }
        return configurationRepository;
    }

    static final class component2 {
        private static int ShareDataUIState = 0;
        static final RepositoryModule_ProvideConfigurationRepositoryFactory component2 = new RepositoryModule_ProvideConfigurationRepositoryFactory();
        private static int copydefault = 1;

        private component2() {
        }

        static {
            int i = ShareDataUIState + 115;
            copydefault = i % 128;
            int i2 = i % 2;
        }
    }
}
