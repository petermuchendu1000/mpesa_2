package com.huawei.digitalpayment.consumer.profile.viewmodel;

import com.huawei.digitalpayment.consumer.profile.model.IPhotoProfileModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class PhotoProfileViewModel_Factory implements Factory<PhotoProfileViewModel> {
    private static int ShareDataUIState = 1;
    private static int component2;
    private final Provider<IPhotoProfileModel> component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 117;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        PhotoProfileViewModel photoProfileViewModel = get();
        int i4 = ShareDataUIState + 117;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 13 / 0;
        }
        return photoProfileViewModel;
    }

    public PhotoProfileViewModel_Factory(Provider<IPhotoProfileModel> provider) {
        this.component3 = provider;
    }

    @Override
    public PhotoProfileViewModel get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 55;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        IPhotoProfileModel iPhotoProfileModel = this.component3.get();
        if (i3 == 0) {
            return newInstance(iPhotoProfileModel);
        }
        int i4 = 87 / 0;
        return newInstance(iPhotoProfileModel);
    }

    public static PhotoProfileViewModel_Factory create(javax.inject.Provider<IPhotoProfileModel> provider) {
        int i = 2 % 2;
        PhotoProfileViewModel_Factory photoProfileViewModel_Factory = new PhotoProfileViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = component2 + 33;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return photoProfileViewModel_Factory;
    }

    public static PhotoProfileViewModel_Factory create(Provider<IPhotoProfileModel> provider) {
        int i = 2 % 2;
        PhotoProfileViewModel_Factory photoProfileViewModel_Factory = new PhotoProfileViewModel_Factory(provider);
        int i2 = ShareDataUIState + 49;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return photoProfileViewModel_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static PhotoProfileViewModel newInstance(IPhotoProfileModel iPhotoProfileModel) {
        int i = 2 % 2;
        PhotoProfileViewModel photoProfileViewModel = new PhotoProfileViewModel(iPhotoProfileModel);
        int i2 = ShareDataUIState + 43;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return photoProfileViewModel;
    }
}
