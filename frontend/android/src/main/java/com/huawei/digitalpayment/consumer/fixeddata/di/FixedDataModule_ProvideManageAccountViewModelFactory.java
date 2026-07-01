package com.huawei.digitalpayment.consumer.fixeddata.di;

import com.huawei.digitalpayment.consumer.fixeddata.domain.repository.ManageAccountRepository;
import com.huawei.digitalpayment.consumer.fixeddata.viewmodel.ManageAccountViewModel;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class FixedDataModule_ProvideManageAccountViewModelFactory implements Factory<ManageAccountViewModel> {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private final Provider<ManageAccountRepository> component1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 21;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ManageAccountViewModel manageAccountViewModel = get();
        int i4 = ShareDataUIState + 3;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return manageAccountViewModel;
    }

    public FixedDataModule_ProvideManageAccountViewModelFactory(Provider<ManageAccountRepository> provider) {
        this.component1 = provider;
    }

    @Override
    public ManageAccountViewModel get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 63;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ManageAccountViewModel manageAccountViewModelProvideManageAccountViewModel = provideManageAccountViewModel(this.component1.get());
        int i4 = component2 + 47;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return manageAccountViewModelProvideManageAccountViewModel;
    }

    public static FixedDataModule_ProvideManageAccountViewModelFactory create(javax.inject.Provider<ManageAccountRepository> provider) {
        int i = 2 % 2;
        FixedDataModule_ProvideManageAccountViewModelFactory fixedDataModule_ProvideManageAccountViewModelFactory = new FixedDataModule_ProvideManageAccountViewModelFactory(Providers.asDaggerProvider(provider));
        int i2 = component2 + 79;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return fixedDataModule_ProvideManageAccountViewModelFactory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static FixedDataModule_ProvideManageAccountViewModelFactory create(Provider<ManageAccountRepository> provider) {
        int i = 2 % 2;
        FixedDataModule_ProvideManageAccountViewModelFactory fixedDataModule_ProvideManageAccountViewModelFactory = new FixedDataModule_ProvideManageAccountViewModelFactory(provider);
        int i2 = component2 + 123;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return fixedDataModule_ProvideManageAccountViewModelFactory;
    }

    public static ManageAccountViewModel provideManageAccountViewModel(ManageAccountRepository manageAccountRepository) {
        ManageAccountViewModel manageAccountViewModel;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 17;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            manageAccountViewModel = (ManageAccountViewModel) Preconditions.checkNotNullFromProvides(FixedDataModule.INSTANCE.provideManageAccountViewModel(manageAccountRepository));
            int i3 = 94 / 0;
        } else {
            manageAccountViewModel = (ManageAccountViewModel) Preconditions.checkNotNullFromProvides(FixedDataModule.INSTANCE.provideManageAccountViewModel(manageAccountRepository));
        }
        int i4 = ShareDataUIState + 95;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return manageAccountViewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
