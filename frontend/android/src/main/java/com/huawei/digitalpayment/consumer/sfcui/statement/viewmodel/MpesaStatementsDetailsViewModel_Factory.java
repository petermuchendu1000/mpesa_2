package com.huawei.digitalpayment.consumer.sfcui.statement.viewmodel;

import com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class MpesaStatementsDetailsViewModel_Factory implements Factory<MpesaStatementsDetailsViewModel> {
    private static int component1 = 1;
    private static int component2;
    private final Provider<MpesaFavoritesRepository> ShareDataUIState;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component1 + 117;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        MpesaStatementsDetailsViewModel mpesaStatementsDetailsViewModel = get();
        int i4 = component1 + 105;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return mpesaStatementsDetailsViewModel;
    }

    public MpesaStatementsDetailsViewModel_Factory(Provider<MpesaFavoritesRepository> provider) {
        this.ShareDataUIState = provider;
    }

    @Override
    public MpesaStatementsDetailsViewModel get() {
        int i = 2 % 2;
        int i2 = component2 + 99;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        MpesaStatementsDetailsViewModel mpesaStatementsDetailsViewModelNewInstance = newInstance(this.ShareDataUIState.get());
        int i4 = component2 + 57;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return mpesaStatementsDetailsViewModelNewInstance;
    }

    public static MpesaStatementsDetailsViewModel_Factory create(javax.inject.Provider<MpesaFavoritesRepository> provider) {
        int i = 2 % 2;
        MpesaStatementsDetailsViewModel_Factory mpesaStatementsDetailsViewModel_Factory = new MpesaStatementsDetailsViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = component2 + 87;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 3 / 0;
        }
        return mpesaStatementsDetailsViewModel_Factory;
    }

    public static MpesaStatementsDetailsViewModel_Factory create(Provider<MpesaFavoritesRepository> provider) {
        int i = 2 % 2;
        MpesaStatementsDetailsViewModel_Factory mpesaStatementsDetailsViewModel_Factory = new MpesaStatementsDetailsViewModel_Factory(provider);
        int i2 = component1 + 45;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 35 / 0;
        }
        return mpesaStatementsDetailsViewModel_Factory;
    }

    public static MpesaStatementsDetailsViewModel newInstance(MpesaFavoritesRepository mpesaFavoritesRepository) {
        int i = 2 % 2;
        MpesaStatementsDetailsViewModel mpesaStatementsDetailsViewModel = new MpesaStatementsDetailsViewModel(mpesaFavoritesRepository);
        int i2 = component2 + 123;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 9 / 0;
        }
        return mpesaStatementsDetailsViewModel;
    }
}
