package com.huawei.digitalpayment.consumer.home.viewmodel;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class QuickActionsViewModel_Factory implements Factory<QuickActionsViewModel> {
    private static int component1 = 0;
    private static int component2 = 1;
    private final Provider<Context> component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 119;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return get();
        }
        get();
        throw null;
    }

    public QuickActionsViewModel_Factory(Provider<Context> provider) {
        this.component3 = provider;
    }

    @Override
    public QuickActionsViewModel get() {
        int i = 2 % 2;
        int i2 = component1 + 119;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        QuickActionsViewModel quickActionsViewModelNewInstance = newInstance(this.component3.get());
        int i4 = component2 + 7;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return quickActionsViewModelNewInstance;
    }

    public static QuickActionsViewModel_Factory create(javax.inject.Provider<Context> provider) {
        int i = 2 % 2;
        QuickActionsViewModel_Factory quickActionsViewModel_Factory = new QuickActionsViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = component2 + 67;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return quickActionsViewModel_Factory;
    }

    public static QuickActionsViewModel_Factory create(Provider<Context> provider) {
        int i = 2 % 2;
        QuickActionsViewModel_Factory quickActionsViewModel_Factory = new QuickActionsViewModel_Factory(provider);
        int i2 = component2 + 85;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 86 / 0;
        }
        return quickActionsViewModel_Factory;
    }

    public static QuickActionsViewModel newInstance(Context context) {
        int i = 2 % 2;
        QuickActionsViewModel quickActionsViewModel = new QuickActionsViewModel(context);
        int i2 = component1 + 55;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return quickActionsViewModel;
    }
}
