package com.huawei.digitalpayment.common.theme.viewmodel;

import dagger.internal.Factory;

public final class RecentMiniAppViewModel_Factory implements Factory<RecentMiniAppViewModel> {
    private static int ShareDataUIState = 1;
    private static int component1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component1 + 49;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        RecentMiniAppViewModel recentMiniAppViewModel = get();
        int i4 = ShareDataUIState + 23;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return recentMiniAppViewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public RecentMiniAppViewModel get() {
        int i = 2 % 2;
        int i2 = component1 + 73;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        RecentMiniAppViewModel recentMiniAppViewModelNewInstance = newInstance();
        int i4 = component1 + 117;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return recentMiniAppViewModelNewInstance;
    }

    public static RecentMiniAppViewModel_Factory create() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 15;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        RecentMiniAppViewModel_Factory recentMiniAppViewModel_Factory = component1.component2;
        int i4 = ShareDataUIState + 117;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return recentMiniAppViewModel_Factory;
        }
        throw null;
    }

    public static RecentMiniAppViewModel newInstance() {
        int i = 2 % 2;
        RecentMiniAppViewModel recentMiniAppViewModel = new RecentMiniAppViewModel();
        int i2 = ShareDataUIState + 3;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return recentMiniAppViewModel;
        }
        throw null;
    }

    static final class component1 {
        private static int ShareDataUIState = 1;
        private static int component1;
        static final RecentMiniAppViewModel_Factory component2 = new RecentMiniAppViewModel_Factory();

        private component1() {
        }

        static {
            int i = ShareDataUIState + 83;
            component1 = i % 128;
            if (i % 2 != 0) {
                int i2 = 2 / 0;
            }
        }
    }
}
