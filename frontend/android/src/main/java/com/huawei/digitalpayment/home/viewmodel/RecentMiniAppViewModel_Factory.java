package com.huawei.digitalpayment.home.viewmodel;

import dagger.internal.Factory;

public final class RecentMiniAppViewModel_Factory implements Factory<RecentMiniAppViewModel> {
    private static int component1 = 0;
    private static int component3 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 59;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            get();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        RecentMiniAppViewModel recentMiniAppViewModel = get();
        int i3 = component1 + 123;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return recentMiniAppViewModel;
    }

    @Override
    public RecentMiniAppViewModel get() {
        int i = 2 % 2;
        int i2 = component3 + 119;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return newInstance();
        }
        newInstance();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static RecentMiniAppViewModel_Factory create() {
        int i = 2 % 2;
        int i2 = component3 + 65;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        RecentMiniAppViewModel_Factory recentMiniAppViewModel_Factory = component1.component1;
        if (i3 == 0) {
            return recentMiniAppViewModel_Factory;
        }
        throw null;
    }

    public static RecentMiniAppViewModel newInstance() {
        int i = 2 % 2;
        RecentMiniAppViewModel recentMiniAppViewModel = new RecentMiniAppViewModel();
        int i2 = component3 + 43;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return recentMiniAppViewModel;
    }

    static final class component1 {
        static final RecentMiniAppViewModel_Factory component1 = new RecentMiniAppViewModel_Factory();
        private static int component3 = 1;
        private static int copydefault;

        private component1() {
        }

        static {
            int i = copydefault + 91;
            component3 = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
