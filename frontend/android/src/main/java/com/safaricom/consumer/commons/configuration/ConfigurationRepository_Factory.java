package com.safaricom.consumer.commons.configuration;

import dagger.internal.Factory;

public final class ConfigurationRepository_Factory implements Factory<ConfigurationRepository> {
    @Override
    public ConfigurationRepository get() {
        return newInstance();
    }

    public static ConfigurationRepository_Factory create() {
        return copydefault.ShareDataUIState;
    }

    public static ConfigurationRepository newInstance() {
        return new ConfigurationRepository();
    }

    static final class copydefault {
        static final ConfigurationRepository_Factory ShareDataUIState = new ConfigurationRepository_Factory();

        private copydefault() {
        }
    }
}
