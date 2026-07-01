package com.huawei.digitalpayment.pwa.viewmodel;

import com.huawei.digitalpayment.pwa.model.IPwaModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class PwaViewModel_Factory implements Factory<PwaViewModel> {
    private static int ShareDataUIState = 1;
    private static int component1;
    private final Provider<IPwaModel> component2;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component1 + 109;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return get();
        }
        get();
        throw null;
    }

    public PwaViewModel_Factory(Provider<IPwaModel> provider) {
        this.component2 = provider;
    }

    @Override
    public PwaViewModel get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 47;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        PwaViewModel pwaViewModelNewInstance = newInstance(this.component2.get());
        if (i3 != 0) {
            int i4 = 59 / 0;
        }
        return pwaViewModelNewInstance;
    }

    public static PwaViewModel_Factory create(javax.inject.Provider<IPwaModel> provider) {
        int i = 2 % 2;
        PwaViewModel_Factory pwaViewModel_Factory = new PwaViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = ShareDataUIState + 105;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return pwaViewModel_Factory;
    }

    public static PwaViewModel_Factory create(Provider<IPwaModel> provider) {
        int i = 2 % 2;
        PwaViewModel_Factory pwaViewModel_Factory = new PwaViewModel_Factory(provider);
        int i2 = component1 + 49;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return pwaViewModel_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static PwaViewModel newInstance(IPwaModel iPwaModel) {
        int i = 2 % 2;
        PwaViewModel pwaViewModel = new PwaViewModel(iPwaModel);
        int i2 = component1 + 99;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 82 / 0;
        }
        return pwaViewModel;
    }
}
