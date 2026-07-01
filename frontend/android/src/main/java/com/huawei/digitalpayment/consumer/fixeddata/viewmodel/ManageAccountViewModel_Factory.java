package com.huawei.digitalpayment.consumer.fixeddata.viewmodel;

import com.huawei.digitalpayment.consumer.fixeddata.domain.repository.ManageAccountRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class ManageAccountViewModel_Factory implements Factory<ManageAccountViewModel> {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private final Provider<ManageAccountRepository> component2;

    @Override
    public Object get() {
        ManageAccountViewModel manageAccountViewModel;
        int i = 2 % 2;
        int i2 = component1 + 17;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            manageAccountViewModel = get();
            int i3 = 51 / 0;
        } else {
            manageAccountViewModel = get();
        }
        int i4 = component1 + 69;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return manageAccountViewModel;
    }

    public ManageAccountViewModel_Factory(Provider<ManageAccountRepository> provider) {
        this.component2 = provider;
    }

    @Override
    public ManageAccountViewModel get() {
        int i = 2 % 2;
        int i2 = component1 + 37;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ManageAccountViewModel manageAccountViewModelNewInstance = newInstance(this.component2.get());
        int i4 = component1 + 53;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return manageAccountViewModelNewInstance;
    }

    public static ManageAccountViewModel_Factory create(javax.inject.Provider<ManageAccountRepository> provider) {
        int i = 2 % 2;
        ManageAccountViewModel_Factory manageAccountViewModel_Factory = new ManageAccountViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = ShareDataUIState + 115;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return manageAccountViewModel_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ManageAccountViewModel_Factory create(Provider<ManageAccountRepository> provider) {
        int i = 2 % 2;
        ManageAccountViewModel_Factory manageAccountViewModel_Factory = new ManageAccountViewModel_Factory(provider);
        int i2 = ShareDataUIState + 105;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return manageAccountViewModel_Factory;
        }
        throw null;
    }

    public static ManageAccountViewModel newInstance(ManageAccountRepository manageAccountRepository) {
        int i = 2 % 2;
        ManageAccountViewModel manageAccountViewModel = new ManageAccountViewModel(manageAccountRepository);
        int i2 = component1 + 27;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return manageAccountViewModel;
    }
}
