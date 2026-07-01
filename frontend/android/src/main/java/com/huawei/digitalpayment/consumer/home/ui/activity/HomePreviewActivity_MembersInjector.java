package com.huawei.digitalpayment.consumer.home.ui.activity;

import com.huawei.digitalpayment.consumer.home.ui.adapter.MainFragmentStateAdapter;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class HomePreviewActivity_MembersInjector implements MembersInjector<HomePreviewActivity> {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    private final Provider<MainFragmentStateAdapter> component1;

    @Override
    public void injectMembers(HomePreviewActivity homePreviewActivity) {
        int i = 2 % 2;
        int i2 = copydefault + 101;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        injectMembers2(homePreviewActivity);
        int i4 = ShareDataUIState + 25;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public HomePreviewActivity_MembersInjector(Provider<MainFragmentStateAdapter> provider) {
        this.component1 = provider;
    }

    public static MembersInjector<HomePreviewActivity> create(Provider<MainFragmentStateAdapter> provider) {
        int i = 2 % 2;
        HomePreviewActivity_MembersInjector homePreviewActivity_MembersInjector = new HomePreviewActivity_MembersInjector(provider);
        int i2 = copydefault + 113;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 53 / 0;
        }
        return homePreviewActivity_MembersInjector;
    }

    public static MembersInjector<HomePreviewActivity> create(javax.inject.Provider<MainFragmentStateAdapter> provider) {
        int i = 2 % 2;
        HomePreviewActivity_MembersInjector homePreviewActivity_MembersInjector = new HomePreviewActivity_MembersInjector(Providers.asDaggerProvider(provider));
        int i2 = ShareDataUIState + 85;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return homePreviewActivity_MembersInjector;
        }
        throw null;
    }

    public void injectMembers2(HomePreviewActivity homePreviewActivity) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 69;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        injectAdapter(homePreviewActivity, this.component1.get());
        if (i3 == 0) {
            throw null;
        }
    }

    public static void injectAdapter(HomePreviewActivity homePreviewActivity, MainFragmentStateAdapter mainFragmentStateAdapter) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 111;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        homePreviewActivity.adapter = mainFragmentStateAdapter;
        int i4 = ShareDataUIState + 25;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 0 / 0;
        }
    }
}
