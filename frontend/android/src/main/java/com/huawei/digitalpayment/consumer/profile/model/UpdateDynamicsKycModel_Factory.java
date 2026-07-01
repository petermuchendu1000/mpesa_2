package com.huawei.digitalpayment.consumer.profile.model;

import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class UpdateDynamicsKycModel_Factory implements Factory<UpdateDynamicsKycModel> {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    private final Provider<IProfileModel> modelProvider;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 103;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        UpdateDynamicsKycModel updateDynamicsKycModel = get();
        int i4 = component3 + 103;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return updateDynamicsKycModel;
    }

    public UpdateDynamicsKycModel_Factory(Provider<IProfileModel> provider) {
        this.modelProvider = provider;
    }

    @Override
    public UpdateDynamicsKycModel get() {
        int i = 2 % 2;
        int i2 = component3 + 13;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        IProfileModel iProfileModel = this.modelProvider.get();
        if (i3 == 0) {
            return newInstance(iProfileModel);
        }
        newInstance(iProfileModel);
        throw null;
    }

    public static UpdateDynamicsKycModel_Factory create(javax.inject.Provider<IProfileModel> provider) {
        int i = 2 % 2;
        UpdateDynamicsKycModel_Factory updateDynamicsKycModel_Factory = new UpdateDynamicsKycModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = component3 + 53;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return updateDynamicsKycModel_Factory;
    }

    public static UpdateDynamicsKycModel_Factory create(Provider<IProfileModel> provider) {
        int i = 2 % 2;
        UpdateDynamicsKycModel_Factory updateDynamicsKycModel_Factory = new UpdateDynamicsKycModel_Factory(provider);
        int i2 = component3 + 51;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return updateDynamicsKycModel_Factory;
    }

    public static UpdateDynamicsKycModel newInstance(IProfileModel iProfileModel) {
        int i = 2 % 2;
        UpdateDynamicsKycModel updateDynamicsKycModel = new UpdateDynamicsKycModel(iProfileModel);
        int i2 = component3 + 111;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return updateDynamicsKycModel;
        }
        throw null;
    }
}
