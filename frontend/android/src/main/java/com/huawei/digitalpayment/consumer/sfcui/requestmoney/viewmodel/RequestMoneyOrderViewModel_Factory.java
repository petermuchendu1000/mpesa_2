package com.huawei.digitalpayment.consumer.sfcui.requestmoney.viewmodel;

import com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class RequestMoneyOrderViewModel_Factory implements Factory<RequestMoneyOrderViewModel> {
    private static int ShareDataUIState = 1;
    private static int component3;
    private final Provider<MpesaFavoritesRepository> copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 43;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        RequestMoneyOrderViewModel requestMoneyOrderViewModel = get();
        int i4 = component3 + 79;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return requestMoneyOrderViewModel;
    }

    public RequestMoneyOrderViewModel_Factory(Provider<MpesaFavoritesRepository> provider) {
        this.copydefault = provider;
    }

    @Override
    public RequestMoneyOrderViewModel get() {
        int i = 2 % 2;
        int i2 = component3 + 73;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        RequestMoneyOrderViewModel requestMoneyOrderViewModelNewInstance = newInstance(this.copydefault.get());
        int i4 = component3 + 115;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return requestMoneyOrderViewModelNewInstance;
    }

    public static RequestMoneyOrderViewModel_Factory create(javax.inject.Provider<MpesaFavoritesRepository> provider) {
        int i = 2 % 2;
        RequestMoneyOrderViewModel_Factory requestMoneyOrderViewModel_Factory = new RequestMoneyOrderViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = ShareDataUIState + 37;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return requestMoneyOrderViewModel_Factory;
    }

    public static RequestMoneyOrderViewModel_Factory create(Provider<MpesaFavoritesRepository> provider) {
        int i = 2 % 2;
        RequestMoneyOrderViewModel_Factory requestMoneyOrderViewModel_Factory = new RequestMoneyOrderViewModel_Factory(provider);
        int i2 = ShareDataUIState + 85;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return requestMoneyOrderViewModel_Factory;
    }

    public static RequestMoneyOrderViewModel newInstance(MpesaFavoritesRepository mpesaFavoritesRepository) {
        int i = 2 % 2;
        RequestMoneyOrderViewModel requestMoneyOrderViewModel = new RequestMoneyOrderViewModel(mpesaFavoritesRepository);
        int i2 = ShareDataUIState + 91;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 0 / 0;
        }
        return requestMoneyOrderViewModel;
    }
}
