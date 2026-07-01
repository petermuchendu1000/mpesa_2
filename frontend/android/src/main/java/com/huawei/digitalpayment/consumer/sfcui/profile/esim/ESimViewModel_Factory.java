package com.huawei.digitalpayment.consumer.sfcui.profile.esim;

import androidx.lifecycle.SavedStateHandle;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class ESimViewModel_Factory implements Factory<ESimViewModel> {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    private final Provider<SavedStateHandle> component1;

    @Override
    public Object get() {
        ESimViewModel eSimViewModel;
        int i = 2 % 2;
        int i2 = copydefault + 123;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            eSimViewModel = get();
            int i3 = 19 / 0;
        } else {
            eSimViewModel = get();
        }
        int i4 = copydefault + 47;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return eSimViewModel;
    }

    public ESimViewModel_Factory(Provider<SavedStateHandle> provider) {
        this.component1 = provider;
    }

    @Override
    public ESimViewModel get() {
        int i = 2 % 2;
        int i2 = copydefault + 111;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        SavedStateHandle savedStateHandle = this.component1.get();
        if (i3 != 0) {
            return newInstance(savedStateHandle);
        }
        newInstance(savedStateHandle);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ESimViewModel_Factory create(javax.inject.Provider<SavedStateHandle> provider) {
        int i = 2 % 2;
        ESimViewModel_Factory eSimViewModel_Factory = new ESimViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = copydefault + 47;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return eSimViewModel_Factory;
    }

    public static ESimViewModel_Factory create(Provider<SavedStateHandle> provider) {
        int i = 2 % 2;
        ESimViewModel_Factory eSimViewModel_Factory = new ESimViewModel_Factory(provider);
        int i2 = ShareDataUIState + 33;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return eSimViewModel_Factory;
    }

    public static ESimViewModel newInstance(SavedStateHandle savedStateHandle) {
        int i = 2 % 2;
        ESimViewModel eSimViewModel = new ESimViewModel(savedStateHandle);
        int i2 = ShareDataUIState + 27;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 95 / 0;
        }
        return eSimViewModel;
    }
}
