package com.huawei.digitalpayment.customer.dynamics.vm;

import com.huawei.digitalpayment.customer.dynamics.model.DefaultPhotoModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class PhotoUploadViewModel_Factory implements Factory<PhotoUploadViewModel> {
    private static int component2 = 1;
    private static int component3;
    private final Provider<DefaultPhotoModel> ShareDataUIState;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 7;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return get();
        }
        get();
        throw null;
    }

    public PhotoUploadViewModel_Factory(Provider<DefaultPhotoModel> provider) {
        this.ShareDataUIState = provider;
    }

    @Override
    public PhotoUploadViewModel get() {
        int i = 2 % 2;
        int i2 = component2 + 13;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        PhotoUploadViewModel photoUploadViewModelNewInstance = newInstance(this.ShareDataUIState.get());
        int i4 = component2 + 47;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return photoUploadViewModelNewInstance;
    }

    public static PhotoUploadViewModel_Factory create(javax.inject.Provider<DefaultPhotoModel> provider) {
        int i = 2 % 2;
        PhotoUploadViewModel_Factory photoUploadViewModel_Factory = new PhotoUploadViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = component3 + 17;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 37 / 0;
        }
        return photoUploadViewModel_Factory;
    }

    public static PhotoUploadViewModel_Factory create(Provider<DefaultPhotoModel> provider) {
        int i = 2 % 2;
        PhotoUploadViewModel_Factory photoUploadViewModel_Factory = new PhotoUploadViewModel_Factory(provider);
        int i2 = component3 + 103;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return photoUploadViewModel_Factory;
    }

    public static PhotoUploadViewModel newInstance(DefaultPhotoModel defaultPhotoModel) {
        int i = 2 % 2;
        PhotoUploadViewModel photoUploadViewModel = new PhotoUploadViewModel(defaultPhotoModel);
        int i2 = component3 + 81;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return photoUploadViewModel;
    }
}
