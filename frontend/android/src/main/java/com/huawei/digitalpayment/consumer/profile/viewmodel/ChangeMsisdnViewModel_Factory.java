package com.huawei.digitalpayment.consumer.profile.viewmodel;

import com.huawei.digitalpayment.consumer.profile.model.IChangeMsisdnModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class ChangeMsisdnViewModel_Factory implements Factory<ChangeMsisdnViewModel> {
    private static int component1 = 1;
    private static int copydefault;
    private final Provider<IChangeMsisdnModel> component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = copydefault + 13;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ChangeMsisdnViewModel changeMsisdnViewModel = get();
        int i4 = component1 + 15;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return changeMsisdnViewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ChangeMsisdnViewModel_Factory(Provider<IChangeMsisdnModel> provider) {
        this.component3 = provider;
    }

    @Override
    public ChangeMsisdnViewModel get() {
        int i = 2 % 2;
        int i2 = copydefault + 59;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ChangeMsisdnViewModel changeMsisdnViewModelNewInstance = newInstance(this.component3.get());
        if (i3 == 0) {
            int i4 = 99 / 0;
        }
        return changeMsisdnViewModelNewInstance;
    }

    public static ChangeMsisdnViewModel_Factory create(javax.inject.Provider<IChangeMsisdnModel> provider) {
        int i = 2 % 2;
        ChangeMsisdnViewModel_Factory changeMsisdnViewModel_Factory = new ChangeMsisdnViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = component1 + 59;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 98 / 0;
        }
        return changeMsisdnViewModel_Factory;
    }

    public static ChangeMsisdnViewModel_Factory create(Provider<IChangeMsisdnModel> provider) {
        int i = 2 % 2;
        ChangeMsisdnViewModel_Factory changeMsisdnViewModel_Factory = new ChangeMsisdnViewModel_Factory(provider);
        int i2 = copydefault + 109;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return changeMsisdnViewModel_Factory;
    }

    public static ChangeMsisdnViewModel newInstance(IChangeMsisdnModel iChangeMsisdnModel) {
        int i = 2 % 2;
        ChangeMsisdnViewModel changeMsisdnViewModel = new ChangeMsisdnViewModel(iChangeMsisdnModel);
        int i2 = component1 + 59;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return changeMsisdnViewModel;
    }
}
