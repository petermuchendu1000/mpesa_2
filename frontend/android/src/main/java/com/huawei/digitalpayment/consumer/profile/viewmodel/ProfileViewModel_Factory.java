package com.huawei.digitalpayment.consumer.profile.viewmodel;

import com.huawei.digitalpayment.consumer.profile.model.IProfileModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class ProfileViewModel_Factory implements Factory<ProfileViewModel> {
    private static int component2 = 1;
    private static int copydefault;
    private final Provider<IProfileModel> ShareDataUIState;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = copydefault + 57;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ProfileViewModel profileViewModel = get();
        int i4 = component2 + 37;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return profileViewModel;
    }

    public ProfileViewModel_Factory(Provider<IProfileModel> provider) {
        this.ShareDataUIState = provider;
    }

    @Override
    public ProfileViewModel get() {
        int i = 2 % 2;
        int i2 = component2 + 5;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ProfileViewModel profileViewModelNewInstance = newInstance(this.ShareDataUIState.get());
        int i4 = copydefault + 43;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return profileViewModelNewInstance;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ProfileViewModel_Factory create(javax.inject.Provider<IProfileModel> provider) {
        int i = 2 % 2;
        ProfileViewModel_Factory profileViewModel_Factory = new ProfileViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = component2 + 55;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 57 / 0;
        }
        return profileViewModel_Factory;
    }

    public static ProfileViewModel_Factory create(Provider<IProfileModel> provider) {
        int i = 2 % 2;
        ProfileViewModel_Factory profileViewModel_Factory = new ProfileViewModel_Factory(provider);
        int i2 = copydefault + 35;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return profileViewModel_Factory;
        }
        throw null;
    }

    public static ProfileViewModel newInstance(IProfileModel iProfileModel) {
        int i = 2 % 2;
        ProfileViewModel profileViewModel = new ProfileViewModel(iProfileModel);
        int i2 = copydefault + 15;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return profileViewModel;
    }
}
