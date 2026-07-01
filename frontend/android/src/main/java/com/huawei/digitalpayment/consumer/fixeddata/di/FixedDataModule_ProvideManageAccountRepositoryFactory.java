package com.huawei.digitalpayment.consumer.fixeddata.di;

import com.huawei.digitalpayment.consumer.fixeddata.domain.repository.ManageAccountRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class FixedDataModule_ProvideManageAccountRepositoryFactory implements Factory<ManageAccountRepository> {
    private static int ShareDataUIState = 1;
    private static int copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 29;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ManageAccountRepository manageAccountRepository = get();
        int i4 = copydefault + 1;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return manageAccountRepository;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public ManageAccountRepository get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 23;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ManageAccountRepository manageAccountRepositoryProvideManageAccountRepository = provideManageAccountRepository();
        int i4 = ShareDataUIState + 3;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return manageAccountRepositoryProvideManageAccountRepository;
        }
        throw null;
    }

    public static FixedDataModule_ProvideManageAccountRepositoryFactory create() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 33;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            FixedDataModule_ProvideManageAccountRepositoryFactory fixedDataModule_ProvideManageAccountRepositoryFactory = ShareDataUIState.copydefault;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        FixedDataModule_ProvideManageAccountRepositoryFactory fixedDataModule_ProvideManageAccountRepositoryFactory2 = ShareDataUIState.copydefault;
        int i3 = copydefault + 115;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return fixedDataModule_ProvideManageAccountRepositoryFactory2;
    }

    public static ManageAccountRepository provideManageAccountRepository() {
        int i = 2 % 2;
        int i2 = copydefault + 79;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ManageAccountRepository manageAccountRepository = (ManageAccountRepository) Preconditions.checkNotNullFromProvides(FixedDataModule.INSTANCE.provideManageAccountRepository());
        int i4 = ShareDataUIState + 49;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return manageAccountRepository;
    }

    static final class ShareDataUIState {
        private static int ShareDataUIState = 0;
        private static int component3 = 1;
        static final FixedDataModule_ProvideManageAccountRepositoryFactory copydefault = new FixedDataModule_ProvideManageAccountRepositoryFactory();

        private ShareDataUIState() {
        }

        static {
            int i = ShareDataUIState + 89;
            component3 = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }
    }
}
