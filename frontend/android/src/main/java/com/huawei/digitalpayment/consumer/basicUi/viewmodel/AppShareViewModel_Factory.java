package com.huawei.digitalpayment.consumer.basicUi.viewmodel;

import com.huawei.digitalpayment.consumer.basicUi.model.IAppShareModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class AppShareViewModel_Factory implements Factory<AppShareViewModel> {
    private static int component2 = 0;
    private static int component3 = 1;
    private final Provider<IAppShareModel> ShareDataUIState;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 3;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            get();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        AppShareViewModel appShareViewModel = get();
        int i3 = component3 + 23;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return appShareViewModel;
    }

    public AppShareViewModel_Factory(Provider<IAppShareModel> provider) {
        this.ShareDataUIState = provider;
    }

    @Override
    public AppShareViewModel get() {
        int i = 2 % 2;
        int i2 = component3 + 93;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            newInstance(this.ShareDataUIState.get());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        AppShareViewModel appShareViewModelNewInstance = newInstance(this.ShareDataUIState.get());
        int i3 = component2 + 23;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 82 / 0;
        }
        return appShareViewModelNewInstance;
    }

    public static AppShareViewModel_Factory create(javax.inject.Provider<IAppShareModel> provider) {
        int i = 2 % 2;
        AppShareViewModel_Factory appShareViewModel_Factory = new AppShareViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = component3 + 111;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return appShareViewModel_Factory;
    }

    public static AppShareViewModel_Factory create(Provider<IAppShareModel> provider) {
        int i = 2 % 2;
        AppShareViewModel_Factory appShareViewModel_Factory = new AppShareViewModel_Factory(provider);
        int i2 = component3 + 73;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return appShareViewModel_Factory;
    }

    public static AppShareViewModel newInstance(IAppShareModel iAppShareModel) {
        int i = 2 % 2;
        AppShareViewModel appShareViewModel = new AppShareViewModel(iAppShareModel);
        int i2 = component3 + 63;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 86 / 0;
        }
        return appShareViewModel;
    }
}
