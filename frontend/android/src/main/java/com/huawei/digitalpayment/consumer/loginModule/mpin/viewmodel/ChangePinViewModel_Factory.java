package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import com.huawei.digitalpayment.consumer.loginModule.mpin.data.ChangePinModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class ChangePinViewModel_Factory implements Factory<ChangePinViewModel> {
    private static int component1 = 0;
    private static int copydefault = 1;
    private final Provider<ChangePinModel> component3;

    @Override
    public Object get() {
        ChangePinViewModel changePinViewModel;
        int i = 2 % 2;
        int i2 = copydefault + 69;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            changePinViewModel = get();
            int i3 = 22 / 0;
        } else {
            changePinViewModel = get();
        }
        int i4 = component1 + 1;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return changePinViewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ChangePinViewModel_Factory(Provider<ChangePinModel> provider) {
        this.component3 = provider;
    }

    @Override
    public ChangePinViewModel get() {
        int i = 2 % 2;
        int i2 = component1 + 25;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ChangePinViewModel changePinViewModelNewInstance = newInstance(this.component3.get());
        int i4 = component1 + 125;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return changePinViewModelNewInstance;
    }

    public static ChangePinViewModel_Factory create(javax.inject.Provider<ChangePinModel> provider) {
        int i = 2 % 2;
        ChangePinViewModel_Factory changePinViewModel_Factory = new ChangePinViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = copydefault + 89;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return changePinViewModel_Factory;
    }

    public static ChangePinViewModel_Factory create(Provider<ChangePinModel> provider) {
        int i = 2 % 2;
        ChangePinViewModel_Factory changePinViewModel_Factory = new ChangePinViewModel_Factory(provider);
        int i2 = copydefault + 37;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return changePinViewModel_Factory;
    }

    public static ChangePinViewModel newInstance(ChangePinModel changePinModel) {
        int i = 2 % 2;
        ChangePinViewModel changePinViewModel = new ChangePinViewModel(changePinModel);
        int i2 = component1 + 79;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return changePinViewModel;
    }
}
