package com.huawei.digitalpayment.consumer.fixeddata.di;

import com.huawei.digitalpayment.consumer.fixeddata.domain.repository.FixedDataRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class FixedDataModule_ProvideHomeFibreRepositoryFactory implements Factory<FixedDataRepository> {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 23;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return get();
        }
        get();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public FixedDataRepository get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 45;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FixedDataRepository fixedDataRepositoryProvideHomeFibreRepository = provideHomeFibreRepository();
        int i4 = ShareDataUIState + 95;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 27 / 0;
        }
        return fixedDataRepositoryProvideHomeFibreRepository;
    }

    public static FixedDataModule_ProvideHomeFibreRepositoryFactory create() {
        int i = 2 % 2;
        int i2 = component3 + 15;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        FixedDataModule_ProvideHomeFibreRepositoryFactory fixedDataModule_ProvideHomeFibreRepositoryFactory = copydefault.copydefault;
        if (i3 != 0) {
            int i4 = 35 / 0;
        }
        return fixedDataModule_ProvideHomeFibreRepositoryFactory;
    }

    public static FixedDataRepository provideHomeFibreRepository() {
        int i = 2 % 2;
        int i2 = component3 + 9;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        FixedDataRepository fixedDataRepository = (FixedDataRepository) Preconditions.checkNotNullFromProvides(FixedDataModule.INSTANCE.provideHomeFibreRepository());
        int i4 = component3 + 61;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return fixedDataRepository;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class copydefault {
        private static int ShareDataUIState = 1;
        private static int component2;
        static final FixedDataModule_ProvideHomeFibreRepositoryFactory copydefault = new FixedDataModule_ProvideHomeFibreRepositoryFactory();

        private copydefault() {
        }

        static {
            int i = component2 + 25;
            ShareDataUIState = i % 128;
            int i2 = i % 2;
        }
    }
}
