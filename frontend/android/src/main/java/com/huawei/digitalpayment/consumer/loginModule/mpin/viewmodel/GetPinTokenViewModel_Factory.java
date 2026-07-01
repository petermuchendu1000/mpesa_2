package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import com.huawei.digitalpayment.consumer.loginModule.mpin.data.IGetTokenModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class GetPinTokenViewModel_Factory implements Factory<GetPinTokenViewModel> {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    private final Provider<IGetTokenModel> copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 9;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        GetPinTokenViewModel getPinTokenViewModel = get();
        int i4 = component3 + 115;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return getPinTokenViewModel;
    }

    public GetPinTokenViewModel_Factory(Provider<IGetTokenModel> provider) {
        this.copydefault = provider;
    }

    @Override
    public GetPinTokenViewModel get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 117;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        GetPinTokenViewModel getPinTokenViewModelNewInstance = newInstance(this.copydefault.get());
        int i4 = ShareDataUIState + 23;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return getPinTokenViewModelNewInstance;
        }
        throw null;
    }

    public static GetPinTokenViewModel_Factory create(javax.inject.Provider<IGetTokenModel> provider) {
        int i = 2 % 2;
        GetPinTokenViewModel_Factory getPinTokenViewModel_Factory = new GetPinTokenViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = component3 + 19;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return getPinTokenViewModel_Factory;
    }

    public static GetPinTokenViewModel_Factory create(Provider<IGetTokenModel> provider) {
        int i = 2 % 2;
        GetPinTokenViewModel_Factory getPinTokenViewModel_Factory = new GetPinTokenViewModel_Factory(provider);
        int i2 = component3 + 21;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return getPinTokenViewModel_Factory;
    }

    public static GetPinTokenViewModel newInstance(IGetTokenModel iGetTokenModel) {
        int i = 2 % 2;
        GetPinTokenViewModel getPinTokenViewModel = new GetPinTokenViewModel(iGetTokenModel);
        int i2 = ShareDataUIState + 69;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return getPinTokenViewModel;
    }
}
