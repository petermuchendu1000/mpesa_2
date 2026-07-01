package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao;

import com.huawei.digitalpayment.consumer.base.util.PhoneDataSender;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.ConnectionLiveData;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class NetworkToolsActivity_MembersInjector implements MembersInjector<NetworkToolsActivity> {
    private static int component1 = 1;
    private static int copydefault;
    private final Provider<ConnectionLiveData> component2;
    private final Provider<PhoneDataSender> component3;

    @Override
    public void injectMembers(NetworkToolsActivity networkToolsActivity) {
        int i = 2 % 2;
        int i2 = copydefault + 83;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        injectMembers2(networkToolsActivity);
        if (i3 == 0) {
            int i4 = 12 / 0;
        }
        int i5 = copydefault + 39;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 58 / 0;
        }
    }

    public NetworkToolsActivity_MembersInjector(Provider<PhoneDataSender> provider, Provider<ConnectionLiveData> provider2) {
        this.component3 = provider;
        this.component2 = provider2;
    }

    public static MembersInjector<NetworkToolsActivity> create(Provider<PhoneDataSender> provider, Provider<ConnectionLiveData> provider2) {
        int i = 2 % 2;
        NetworkToolsActivity_MembersInjector networkToolsActivity_MembersInjector = new NetworkToolsActivity_MembersInjector(provider, provider2);
        int i2 = component1 + 37;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return networkToolsActivity_MembersInjector;
    }

    public static MembersInjector<NetworkToolsActivity> create(javax.inject.Provider<PhoneDataSender> provider, javax.inject.Provider<ConnectionLiveData> provider2) {
        int i = 2 % 2;
        NetworkToolsActivity_MembersInjector networkToolsActivity_MembersInjector = new NetworkToolsActivity_MembersInjector(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2));
        int i2 = component1 + 25;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return networkToolsActivity_MembersInjector;
        }
        throw null;
    }

    public void injectMembers2(NetworkToolsActivity networkToolsActivity) {
        int i = 2 % 2;
        int i2 = copydefault + 49;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            injectPhoneDataSender(networkToolsActivity, this.component3.get());
            injectConnectionLiveData(networkToolsActivity, this.component2.get());
        } else {
            injectPhoneDataSender(networkToolsActivity, this.component3.get());
            injectConnectionLiveData(networkToolsActivity, this.component2.get());
            throw null;
        }
    }

    public static void injectPhoneDataSender(NetworkToolsActivity networkToolsActivity, PhoneDataSender phoneDataSender) {
        int i = 2 % 2;
        int i2 = component1 + 7;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        networkToolsActivity.phoneDataSender = phoneDataSender;
        int i4 = copydefault + 11;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void injectConnectionLiveData(NetworkToolsActivity networkToolsActivity, ConnectionLiveData connectionLiveData) {
        int i = 2 % 2;
        int i2 = component1 + 51;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        networkToolsActivity.connectionLiveData = connectionLiveData;
        if (i3 != 0) {
            throw null;
        }
    }
}
