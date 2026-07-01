package com.huawei.digitalpayment.consumer.loginModule.login.viewmodel;

import com.huawei.digitalpayment.consumer.loginModule.login.data.NewDeviceModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class NewDeviceViewModel_Factory implements Factory<NewDeviceViewModel> {
    private static int ShareDataUIState = 1;
    private static int component3;
    private final Provider<NewDeviceModel> component2;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 45;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        NewDeviceViewModel newDeviceViewModel = get();
        if (i3 == 0) {
            int i4 = 78 / 0;
        }
        return newDeviceViewModel;
    }

    public NewDeviceViewModel_Factory(Provider<NewDeviceModel> provider) {
        this.component2 = provider;
    }

    @Override
    public NewDeviceViewModel get() {
        int i = 2 % 2;
        int i2 = component3 + 21;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        NewDeviceModel newDeviceModel = this.component2.get();
        if (i3 != 0) {
            return newInstance(newDeviceModel);
        }
        newInstance(newDeviceModel);
        throw null;
    }

    public static NewDeviceViewModel_Factory create(javax.inject.Provider<NewDeviceModel> provider) {
        int i = 2 % 2;
        NewDeviceViewModel_Factory newDeviceViewModel_Factory = new NewDeviceViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = component3 + 81;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return newDeviceViewModel_Factory;
    }

    public static NewDeviceViewModel_Factory create(Provider<NewDeviceModel> provider) {
        int i = 2 % 2;
        NewDeviceViewModel_Factory newDeviceViewModel_Factory = new NewDeviceViewModel_Factory(provider);
        int i2 = ShareDataUIState + 59;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return newDeviceViewModel_Factory;
    }

    public static NewDeviceViewModel newInstance(NewDeviceModel newDeviceModel) {
        int i = 2 % 2;
        NewDeviceViewModel newDeviceViewModel = new NewDeviceViewModel(newDeviceModel);
        int i2 = ShareDataUIState + 57;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return newDeviceViewModel;
        }
        throw null;
    }
}
