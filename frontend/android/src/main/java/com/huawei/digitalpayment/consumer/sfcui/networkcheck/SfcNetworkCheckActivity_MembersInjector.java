package com.huawei.digitalpayment.consumer.sfcui.networkcheck;

import com.huawei.digitalpayment.consumer.base.networkcheck.NetworkCheckManager;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class SfcNetworkCheckActivity_MembersInjector implements MembersInjector<SfcNetworkCheckActivity> {
    private static int component1 = 0;
    private static int component2 = 1;
    private final Provider<NetworkCheckManager> ShareDataUIState;

    @Override
    public void injectMembers(SfcNetworkCheckActivity sfcNetworkCheckActivity) {
        int i = 2 % 2;
        int i2 = component2 + 125;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        injectMembers2(sfcNetworkCheckActivity);
        if (i3 != 0) {
            int i4 = 59 / 0;
        }
    }

    public SfcNetworkCheckActivity_MembersInjector(Provider<NetworkCheckManager> provider) {
        this.ShareDataUIState = provider;
    }

    public static MembersInjector<SfcNetworkCheckActivity> create(Provider<NetworkCheckManager> provider) {
        int i = 2 % 2;
        SfcNetworkCheckActivity_MembersInjector sfcNetworkCheckActivity_MembersInjector = new SfcNetworkCheckActivity_MembersInjector(provider);
        int i2 = component1 + 9;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return sfcNetworkCheckActivity_MembersInjector;
    }

    public static MembersInjector<SfcNetworkCheckActivity> create(javax.inject.Provider<NetworkCheckManager> provider) {
        int i = 2 % 2;
        SfcNetworkCheckActivity_MembersInjector sfcNetworkCheckActivity_MembersInjector = new SfcNetworkCheckActivity_MembersInjector(Providers.asDaggerProvider(provider));
        int i2 = component2 + 95;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return sfcNetworkCheckActivity_MembersInjector;
    }

    public void injectMembers2(SfcNetworkCheckActivity sfcNetworkCheckActivity) {
        int i = 2 % 2;
        int i2 = component1 + 99;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        injectNetworkCheckManager(sfcNetworkCheckActivity, this.ShareDataUIState.get());
        int i4 = component1 + 29;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void injectNetworkCheckManager(SfcNetworkCheckActivity sfcNetworkCheckActivity, NetworkCheckManager networkCheckManager) {
        int i = 2 % 2;
        int i2 = component2 + 57;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        sfcNetworkCheckActivity.networkCheckManager = networkCheckManager;
        if (i3 != 0) {
            int i4 = 92 / 0;
        }
    }
}
