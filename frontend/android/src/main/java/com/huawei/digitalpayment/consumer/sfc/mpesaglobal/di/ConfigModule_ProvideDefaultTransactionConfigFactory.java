package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.di;

import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.DefaultTransactionConfig;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class ConfigModule_ProvideDefaultTransactionConfigFactory implements Factory<DefaultTransactionConfig> {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 101;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return get();
        }
        get();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public DefaultTransactionConfig get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 23;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            provideDefaultTransactionConfig();
            throw null;
        }
        DefaultTransactionConfig defaultTransactionConfigProvideDefaultTransactionConfig = provideDefaultTransactionConfig();
        int i3 = component1 + 35;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return defaultTransactionConfigProvideDefaultTransactionConfig;
    }

    public static ConfigModule_ProvideDefaultTransactionConfigFactory create() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 41;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ConfigModule_ProvideDefaultTransactionConfigFactory configModule_ProvideDefaultTransactionConfigFactory = component3.component2;
        int i4 = component1 + 91;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return configModule_ProvideDefaultTransactionConfigFactory;
    }

    public static DefaultTransactionConfig provideDefaultTransactionConfig() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 89;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DefaultTransactionConfig defaultTransactionConfig = (DefaultTransactionConfig) Preconditions.checkNotNullFromProvides(ConfigModule.INSTANCE.provideDefaultTransactionConfig());
        int i4 = component1 + 103;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 65 / 0;
        }
        return defaultTransactionConfig;
    }

    static final class component3 {
        private static int ShareDataUIState = 0;
        static final ConfigModule_ProvideDefaultTransactionConfigFactory component2 = new ConfigModule_ProvideDefaultTransactionConfigFactory();
        private static int copydefault = 1;

        private component3() {
        }

        static {
            int i = copydefault + 125;
            ShareDataUIState = i % 128;
            int i2 = i % 2;
        }
    }
}
