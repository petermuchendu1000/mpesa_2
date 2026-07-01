package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import com.huawei.digitalpayment.consumer.loginModule.mpin.data.ChangePinModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class IdentifyPinViewModel_Factory implements Factory<IdentifyPinViewModel> {
    private static int component3 = 0;
    private static int copydefault = 1;
    private final Provider<ChangePinModel> component1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = copydefault + 87;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        IdentifyPinViewModel identifyPinViewModel = get();
        int i4 = copydefault + 55;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return identifyPinViewModel;
    }

    public IdentifyPinViewModel_Factory(Provider<ChangePinModel> provider) {
        this.component1 = provider;
    }

    @Override
    public IdentifyPinViewModel get() {
        int i = 2 % 2;
        int i2 = copydefault + 17;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        IdentifyPinViewModel identifyPinViewModelNewInstance = newInstance(this.component1.get());
        int i4 = component3 + 47;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return identifyPinViewModelNewInstance;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static IdentifyPinViewModel_Factory create(javax.inject.Provider<ChangePinModel> provider) {
        int i = 2 % 2;
        IdentifyPinViewModel_Factory identifyPinViewModel_Factory = new IdentifyPinViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = copydefault + 5;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return identifyPinViewModel_Factory;
        }
        throw null;
    }

    public static IdentifyPinViewModel_Factory create(Provider<ChangePinModel> provider) {
        int i = 2 % 2;
        IdentifyPinViewModel_Factory identifyPinViewModel_Factory = new IdentifyPinViewModel_Factory(provider);
        int i2 = copydefault + 31;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return identifyPinViewModel_Factory;
    }

    public static IdentifyPinViewModel newInstance(ChangePinModel changePinModel) {
        int i = 2 % 2;
        IdentifyPinViewModel identifyPinViewModel = new IdentifyPinViewModel(changePinModel);
        int i2 = copydefault + 25;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 81 / 0;
        }
        return identifyPinViewModel;
    }
}
