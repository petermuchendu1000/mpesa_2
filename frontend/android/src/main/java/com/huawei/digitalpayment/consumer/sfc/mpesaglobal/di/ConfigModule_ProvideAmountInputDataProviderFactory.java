package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.di;

import com.safaricom.android.design.templates.amountinput.provider.AmountInputDataProvider;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class ConfigModule_ProvideAmountInputDataProviderFactory implements Factory<AmountInputDataProvider> {
    private static int component1 = 0;
    private static int component3 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component1 + 33;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        AmountInputDataProvider amountInputDataProvider = get();
        int i4 = component1 + 19;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return amountInputDataProvider;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public AmountInputDataProvider get() {
        int i = 2 % 2;
        int i2 = component3 + 3;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        AmountInputDataProvider amountInputDataProviderProvideAmountInputDataProvider = provideAmountInputDataProvider();
        int i4 = component3 + 11;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return amountInputDataProviderProvideAmountInputDataProvider;
    }

    public static ConfigModule_ProvideAmountInputDataProviderFactory create() {
        int i = 2 % 2;
        int i2 = component3 + 103;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ConfigModule_ProvideAmountInputDataProviderFactory configModule_ProvideAmountInputDataProviderFactory = component3.component1;
        int i4 = component1 + 11;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 40 / 0;
        }
        return configModule_ProvideAmountInputDataProviderFactory;
    }

    public static AmountInputDataProvider provideAmountInputDataProvider() {
        int i = 2 % 2;
        int i2 = component3 + 83;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        AmountInputDataProvider amountInputDataProvider = (AmountInputDataProvider) Preconditions.checkNotNullFromProvides(ConfigModule.INSTANCE.provideAmountInputDataProvider());
        if (i3 == 0) {
            return amountInputDataProvider;
        }
        throw null;
    }

    static final class component3 {
        private static int ShareDataUIState = 1;
        static final ConfigModule_ProvideAmountInputDataProviderFactory component1 = new ConfigModule_ProvideAmountInputDataProviderFactory();
        private static int component2;

        private component3() {
        }

        static {
            int i = component2 + 67;
            ShareDataUIState = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
