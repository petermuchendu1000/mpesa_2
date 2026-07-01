package com.huawei.digitalpayment.home.viewmodel;

import com.huawei.digitalpayment.home.data.ITipsModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class TipsViewModel_Factory implements Factory<TipsViewModel> {
    private static int component3 = 1;
    private static int copydefault;
    private final Provider<ITipsModel> component1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 59;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        TipsViewModel tipsViewModel = get();
        int i4 = copydefault + 87;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return tipsViewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public TipsViewModel_Factory(Provider<ITipsModel> provider) {
        this.component1 = provider;
    }

    @Override
    public TipsViewModel get() {
        int i = 2 % 2;
        int i2 = component3 + 87;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        TipsViewModel tipsViewModelNewInstance = newInstance(this.component1.get());
        if (i3 != 0) {
            int i4 = 19 / 0;
        }
        return tipsViewModelNewInstance;
    }

    public static TipsViewModel_Factory create(javax.inject.Provider<ITipsModel> provider) {
        int i = 2 % 2;
        TipsViewModel_Factory tipsViewModel_Factory = new TipsViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = component3 + 115;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 31 / 0;
        }
        return tipsViewModel_Factory;
    }

    public static TipsViewModel_Factory create(Provider<ITipsModel> provider) {
        int i = 2 % 2;
        TipsViewModel_Factory tipsViewModel_Factory = new TipsViewModel_Factory(provider);
        int i2 = copydefault + 81;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return tipsViewModel_Factory;
        }
        throw null;
    }

    public static TipsViewModel newInstance(ITipsModel iTipsModel) {
        int i = 2 % 2;
        TipsViewModel tipsViewModel = new TipsViewModel(iTipsModel);
        int i2 = copydefault + 73;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return tipsViewModel;
        }
        throw null;
    }
}
