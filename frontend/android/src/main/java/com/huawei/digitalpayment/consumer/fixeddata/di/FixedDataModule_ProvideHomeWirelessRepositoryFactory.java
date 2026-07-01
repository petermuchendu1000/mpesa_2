package com.huawei.digitalpayment.consumer.fixeddata.di;

import com.huawei.digitalpayment.consumer.fixeddata.domain.repository.HomeWirelessRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class FixedDataModule_ProvideHomeWirelessRepositoryFactory implements Factory<HomeWirelessRepository> {
    private static int ShareDataUIState = 1;
    private static int copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 79;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return get();
        }
        get();
        throw null;
    }

    @Override
    public HomeWirelessRepository get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 95;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        HomeWirelessRepository homeWirelessRepositoryProvideHomeWirelessRepository = provideHomeWirelessRepository();
        int i4 = copydefault + 23;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return homeWirelessRepositoryProvideHomeWirelessRepository;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static FixedDataModule_ProvideHomeWirelessRepositoryFactory create() {
        int i = 2 % 2;
        int i2 = copydefault + 15;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        FixedDataModule_ProvideHomeWirelessRepositoryFactory fixedDataModule_ProvideHomeWirelessRepositoryFactory = component3.ShareDataUIState;
        int i4 = ShareDataUIState + 69;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return fixedDataModule_ProvideHomeWirelessRepositoryFactory;
    }

    public static HomeWirelessRepository provideHomeWirelessRepository() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 29;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        HomeWirelessRepository homeWirelessRepositoryProvideHomeWirelessRepository = FixedDataModule.INSTANCE.provideHomeWirelessRepository();
        if (i3 == 0) {
            return (HomeWirelessRepository) Preconditions.checkNotNullFromProvides(homeWirelessRepositoryProvideHomeWirelessRepository);
        }
        int i4 = 38 / 0;
        return (HomeWirelessRepository) Preconditions.checkNotNullFromProvides(homeWirelessRepositoryProvideHomeWirelessRepository);
    }

    static final class component3 {
        static final FixedDataModule_ProvideHomeWirelessRepositoryFactory ShareDataUIState = new FixedDataModule_ProvideHomeWirelessRepositoryFactory();
        private static int component2 = 0;
        private static int copydefault = 1;

        private component3() {
        }

        static {
            int i = copydefault + 13;
            component2 = i % 128;
            int i2 = i % 2;
        }
    }
}
