package com.huawei.digitalpayment.consumer.basicUi.pinfree.viewmodel;

import com.huawei.digitalpayment.consumer.basicUi.pinfree.model.ManagePinFreeModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class ManagePinFreeViewModel_Factory implements Factory<ManagePinFreeViewModel> {
    private static int component3 = 0;
    private static int copydefault = 1;
    private final Provider<ManagePinFreeModel> component1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 79;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ManagePinFreeViewModel managePinFreeViewModel = get();
        int i4 = copydefault + 7;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 24 / 0;
        }
        return managePinFreeViewModel;
    }

    public ManagePinFreeViewModel_Factory(Provider<ManagePinFreeModel> provider) {
        this.component1 = provider;
    }

    @Override
    public ManagePinFreeViewModel get() {
        int i = 2 % 2;
        int i2 = component3 + 83;
        copydefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            newInstance(this.component1.get());
            obj.hashCode();
            throw null;
        }
        ManagePinFreeViewModel managePinFreeViewModelNewInstance = newInstance(this.component1.get());
        int i3 = component3 + 51;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            return managePinFreeViewModelNewInstance;
        }
        obj.hashCode();
        throw null;
    }

    public static ManagePinFreeViewModel_Factory create(javax.inject.Provider<ManagePinFreeModel> provider) {
        int i = 2 % 2;
        ManagePinFreeViewModel_Factory managePinFreeViewModel_Factory = new ManagePinFreeViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = copydefault + 77;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return managePinFreeViewModel_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ManagePinFreeViewModel_Factory create(Provider<ManagePinFreeModel> provider) {
        int i = 2 % 2;
        ManagePinFreeViewModel_Factory managePinFreeViewModel_Factory = new ManagePinFreeViewModel_Factory(provider);
        int i2 = copydefault + 21;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return managePinFreeViewModel_Factory;
    }

    public static ManagePinFreeViewModel newInstance(ManagePinFreeModel managePinFreeModel) {
        int i = 2 % 2;
        ManagePinFreeViewModel managePinFreeViewModel = new ManagePinFreeViewModel(managePinFreeModel);
        int i2 = copydefault + 109;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 11 / 0;
        }
        return managePinFreeViewModel;
    }
}
