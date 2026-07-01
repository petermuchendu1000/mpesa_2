package com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.diybundles;

import com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.EasyTalkRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class DiyBundlesViewModel_Factory implements Factory<DiyBundlesViewModel> {
    private static int component2 = 1;
    private static int component3;
    private final Provider<EasyTalkRepository> component1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 43;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        DiyBundlesViewModel diyBundlesViewModel = get();
        int i4 = component2 + 87;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return diyBundlesViewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public DiyBundlesViewModel_Factory(Provider<EasyTalkRepository> provider) {
        this.component1 = provider;
    }

    @Override
    public DiyBundlesViewModel get() {
        int i = 2 % 2;
        int i2 = component2 + 59;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DiyBundlesViewModel diyBundlesViewModelNewInstance = newInstance(this.component1.get());
        if (i3 != 0) {
            int i4 = 85 / 0;
        }
        return diyBundlesViewModelNewInstance;
    }

    public static DiyBundlesViewModel_Factory create(javax.inject.Provider<EasyTalkRepository> provider) {
        int i = 2 % 2;
        DiyBundlesViewModel_Factory diyBundlesViewModel_Factory = new DiyBundlesViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = component3 + 87;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return diyBundlesViewModel_Factory;
    }

    public static DiyBundlesViewModel_Factory create(Provider<EasyTalkRepository> provider) {
        int i = 2 % 2;
        DiyBundlesViewModel_Factory diyBundlesViewModel_Factory = new DiyBundlesViewModel_Factory(provider);
        int i2 = component2 + 41;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return diyBundlesViewModel_Factory;
    }

    public static DiyBundlesViewModel newInstance(EasyTalkRepository easyTalkRepository) {
        int i = 2 % 2;
        DiyBundlesViewModel diyBundlesViewModel = new DiyBundlesViewModel(easyTalkRepository);
        int i2 = component3 + 123;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return diyBundlesViewModel;
    }
}
