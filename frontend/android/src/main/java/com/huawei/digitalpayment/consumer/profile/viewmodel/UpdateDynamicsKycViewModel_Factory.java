package com.huawei.digitalpayment.consumer.profile.viewmodel;

import com.huawei.digitalpayment.consumer.profile.model.remote.IUpdateDynamicsKycModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class UpdateDynamicsKycViewModel_Factory implements Factory<UpdateDynamicsKycViewModel> {
    private static int component1 = 1;
    private static int component2;
    private final Provider<IUpdateDynamicsKycModel> component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 15;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            get();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        UpdateDynamicsKycViewModel updateDynamicsKycViewModel = get();
        int i3 = component2 + 111;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 94 / 0;
        }
        return updateDynamicsKycViewModel;
    }

    public UpdateDynamicsKycViewModel_Factory(Provider<IUpdateDynamicsKycModel> provider) {
        this.component3 = provider;
    }

    @Override
    public UpdateDynamicsKycViewModel get() {
        UpdateDynamicsKycViewModel updateDynamicsKycViewModelNewInstance;
        int i = 2 % 2;
        int i2 = component1 + 79;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            updateDynamicsKycViewModelNewInstance = newInstance(this.component3.get());
            int i3 = 33 / 0;
        } else {
            updateDynamicsKycViewModelNewInstance = newInstance(this.component3.get());
        }
        int i4 = component2 + 63;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return updateDynamicsKycViewModelNewInstance;
    }

    public static UpdateDynamicsKycViewModel_Factory create(javax.inject.Provider<IUpdateDynamicsKycModel> provider) {
        int i = 2 % 2;
        UpdateDynamicsKycViewModel_Factory updateDynamicsKycViewModel_Factory = new UpdateDynamicsKycViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = component2 + 57;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return updateDynamicsKycViewModel_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static UpdateDynamicsKycViewModel_Factory create(Provider<IUpdateDynamicsKycModel> provider) {
        int i = 2 % 2;
        UpdateDynamicsKycViewModel_Factory updateDynamicsKycViewModel_Factory = new UpdateDynamicsKycViewModel_Factory(provider);
        int i2 = component1 + 43;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return updateDynamicsKycViewModel_Factory;
    }

    public static UpdateDynamicsKycViewModel newInstance(IUpdateDynamicsKycModel iUpdateDynamicsKycModel) {
        int i = 2 % 2;
        UpdateDynamicsKycViewModel updateDynamicsKycViewModel = new UpdateDynamicsKycViewModel(iUpdateDynamicsKycModel);
        int i2 = component2 + 21;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return updateDynamicsKycViewModel;
        }
        throw null;
    }
}
