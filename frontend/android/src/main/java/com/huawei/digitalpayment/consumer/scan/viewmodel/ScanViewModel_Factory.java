package com.huawei.digitalpayment.consumer.scan.viewmodel;

import com.huawei.digitalpayment.consumer.scan.model.ScanModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class ScanViewModel_Factory implements Factory<ScanViewModel> {
    private static int component1 = 1;
    private static int copydefault;
    private final Provider<ScanModel> ShareDataUIState;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = copydefault + 53;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ScanViewModel scanViewModel = get();
        int i4 = copydefault + 27;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return scanViewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ScanViewModel_Factory(Provider<ScanModel> provider) {
        this.ShareDataUIState = provider;
    }

    @Override
    public ScanViewModel get() {
        int i = 2 % 2;
        int i2 = copydefault + 81;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ScanViewModel scanViewModelNewInstance = newInstance(this.ShareDataUIState.get());
        int i4 = component1 + 31;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return scanViewModelNewInstance;
        }
        throw null;
    }

    public static ScanViewModel_Factory create(javax.inject.Provider<ScanModel> provider) {
        int i = 2 % 2;
        ScanViewModel_Factory scanViewModel_Factory = new ScanViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = component1 + 31;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return scanViewModel_Factory;
    }

    public static ScanViewModel_Factory create(Provider<ScanModel> provider) {
        int i = 2 % 2;
        ScanViewModel_Factory scanViewModel_Factory = new ScanViewModel_Factory(provider);
        int i2 = copydefault + 63;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return scanViewModel_Factory;
    }

    public static ScanViewModel newInstance(ScanModel scanModel) {
        int i = 2 % 2;
        ScanViewModel scanViewModel = new ScanViewModel(scanModel);
        int i2 = copydefault + 93;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return scanViewModel;
    }
}
