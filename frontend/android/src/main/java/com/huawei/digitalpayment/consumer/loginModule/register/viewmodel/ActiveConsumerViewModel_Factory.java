package com.huawei.digitalpayment.consumer.loginModule.register.viewmodel;

import com.huawei.digitalpayment.consumer.loginModule.register.data.ActiveConsumerModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class ActiveConsumerViewModel_Factory implements Factory<ActiveConsumerViewModel> {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private final Provider<ActiveConsumerModel> copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 1;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActiveConsumerViewModel activeConsumerViewModel = get();
        int i4 = ShareDataUIState + 123;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return activeConsumerViewModel;
        }
        throw null;
    }

    public ActiveConsumerViewModel_Factory(Provider<ActiveConsumerModel> provider) {
        this.copydefault = provider;
    }

    @Override
    public ActiveConsumerViewModel get() {
        int i = 2 % 2;
        int i2 = component2 + 11;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActiveConsumerModel activeConsumerModel = this.copydefault.get();
        if (i3 == 0) {
            return newInstance(activeConsumerModel);
        }
        newInstance(activeConsumerModel);
        throw null;
    }

    public static ActiveConsumerViewModel_Factory create(javax.inject.Provider<ActiveConsumerModel> provider) {
        int i = 2 % 2;
        ActiveConsumerViewModel_Factory activeConsumerViewModel_Factory = new ActiveConsumerViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = ShareDataUIState + 109;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return activeConsumerViewModel_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ActiveConsumerViewModel_Factory create(Provider<ActiveConsumerModel> provider) {
        int i = 2 % 2;
        ActiveConsumerViewModel_Factory activeConsumerViewModel_Factory = new ActiveConsumerViewModel_Factory(provider);
        int i2 = component2 + 73;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return activeConsumerViewModel_Factory;
    }

    public static ActiveConsumerViewModel newInstance(ActiveConsumerModel activeConsumerModel) {
        int i = 2 % 2;
        ActiveConsumerViewModel activeConsumerViewModel = new ActiveConsumerViewModel(activeConsumerModel);
        int i2 = ShareDataUIState + 125;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return activeConsumerViewModel;
        }
        throw null;
    }
}
