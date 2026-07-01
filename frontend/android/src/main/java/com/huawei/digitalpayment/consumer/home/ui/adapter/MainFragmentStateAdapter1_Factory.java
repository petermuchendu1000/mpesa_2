package com.huawei.digitalpayment.consumer.home.ui.adapter;

import androidx.fragment.app.FragmentActivity;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class MainFragmentStateAdapter1_Factory implements Factory<MainFragmentStateAdapter1> {
    private static int ShareDataUIState = 1;
    private static int component3;
    private final Provider<FragmentActivity> component1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 53;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        MainFragmentStateAdapter1 mainFragmentStateAdapter1 = get();
        int i4 = component3 + 63;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return mainFragmentStateAdapter1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public MainFragmentStateAdapter1_Factory(Provider<FragmentActivity> provider) {
        this.component1 = provider;
    }

    @Override
    public MainFragmentStateAdapter1 get() {
        int i = 2 % 2;
        int i2 = component3 + 87;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        FragmentActivity fragmentActivity = this.component1.get();
        if (i3 != 0) {
            return newInstance(fragmentActivity);
        }
        newInstance(fragmentActivity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static MainFragmentStateAdapter1_Factory create(javax.inject.Provider<FragmentActivity> provider) {
        int i = 2 % 2;
        MainFragmentStateAdapter1_Factory mainFragmentStateAdapter1_Factory = new MainFragmentStateAdapter1_Factory(Providers.asDaggerProvider(provider));
        int i2 = ShareDataUIState + 91;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return mainFragmentStateAdapter1_Factory;
        }
        throw null;
    }

    public static MainFragmentStateAdapter1_Factory create(Provider<FragmentActivity> provider) {
        int i = 2 % 2;
        MainFragmentStateAdapter1_Factory mainFragmentStateAdapter1_Factory = new MainFragmentStateAdapter1_Factory(provider);
        int i2 = component3 + 119;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 50 / 0;
        }
        return mainFragmentStateAdapter1_Factory;
    }

    public static MainFragmentStateAdapter1 newInstance(FragmentActivity fragmentActivity) {
        int i = 2 % 2;
        MainFragmentStateAdapter1 mainFragmentStateAdapter1 = new MainFragmentStateAdapter1(fragmentActivity);
        int i2 = ShareDataUIState + 89;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return mainFragmentStateAdapter1;
        }
        throw null;
    }
}
