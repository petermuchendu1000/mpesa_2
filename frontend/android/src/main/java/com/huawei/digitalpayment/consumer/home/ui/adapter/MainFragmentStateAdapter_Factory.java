package com.huawei.digitalpayment.consumer.home.ui.adapter;

import androidx.fragment.app.FragmentActivity;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class MainFragmentStateAdapter_Factory implements Factory<MainFragmentStateAdapter> {
    private static int component1 = 0;
    private static int component2 = 1;
    private final Provider<FragmentActivity> ShareDataUIState;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component1 + 51;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        MainFragmentStateAdapter mainFragmentStateAdapter = get();
        int i4 = component1 + 61;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return mainFragmentStateAdapter;
    }

    public MainFragmentStateAdapter_Factory(Provider<FragmentActivity> provider) {
        this.ShareDataUIState = provider;
    }

    @Override
    public MainFragmentStateAdapter get() {
        MainFragmentStateAdapter mainFragmentStateAdapterNewInstance;
        int i = 2 % 2;
        int i2 = component1 + 15;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            mainFragmentStateAdapterNewInstance = newInstance(this.ShareDataUIState.get());
            int i3 = 69 / 0;
        } else {
            mainFragmentStateAdapterNewInstance = newInstance(this.ShareDataUIState.get());
        }
        int i4 = component2 + 115;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return mainFragmentStateAdapterNewInstance;
    }

    public static MainFragmentStateAdapter_Factory create(javax.inject.Provider<FragmentActivity> provider) {
        int i = 2 % 2;
        MainFragmentStateAdapter_Factory mainFragmentStateAdapter_Factory = new MainFragmentStateAdapter_Factory(Providers.asDaggerProvider(provider));
        int i2 = component2 + 87;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return mainFragmentStateAdapter_Factory;
    }

    public static MainFragmentStateAdapter_Factory create(Provider<FragmentActivity> provider) {
        int i = 2 % 2;
        MainFragmentStateAdapter_Factory mainFragmentStateAdapter_Factory = new MainFragmentStateAdapter_Factory(provider);
        int i2 = component2 + 55;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return mainFragmentStateAdapter_Factory;
    }

    public static MainFragmentStateAdapter newInstance(FragmentActivity fragmentActivity) {
        int i = 2 % 2;
        MainFragmentStateAdapter mainFragmentStateAdapter = new MainFragmentStateAdapter(fragmentActivity);
        int i2 = component2 + 55;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 78 / 0;
        }
        return mainFragmentStateAdapter;
    }
}
