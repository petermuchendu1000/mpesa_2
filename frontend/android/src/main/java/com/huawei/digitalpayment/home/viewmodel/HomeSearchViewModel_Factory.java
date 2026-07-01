package com.huawei.digitalpayment.home.viewmodel;

import dagger.internal.Factory;

public final class HomeSearchViewModel_Factory implements Factory<HomeSearchViewModel> {
    private static int ShareDataUIState = 1;
    private static int copydefault;

    @Override
    public Object get() {
        HomeSearchViewModel homeSearchViewModel;
        int i = 2 % 2;
        int i2 = copydefault + 1;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            homeSearchViewModel = get();
            int i3 = 47 / 0;
        } else {
            homeSearchViewModel = get();
        }
        int i4 = ShareDataUIState + 101;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return homeSearchViewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public HomeSearchViewModel get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 99;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        HomeSearchViewModel homeSearchViewModelNewInstance = newInstance();
        int i4 = ShareDataUIState + 31;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return homeSearchViewModelNewInstance;
    }

    public static HomeSearchViewModel_Factory create() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 7;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        HomeSearchViewModel_Factory homeSearchViewModel_Factory = component2.copydefault;
        int i4 = ShareDataUIState + 109;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return homeSearchViewModel_Factory;
    }

    public static HomeSearchViewModel newInstance() {
        int i = 2 % 2;
        HomeSearchViewModel homeSearchViewModel = new HomeSearchViewModel();
        int i2 = copydefault + 7;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 91 / 0;
        }
        return homeSearchViewModel;
    }

    static final class component2 {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;
        static final HomeSearchViewModel_Factory copydefault = new HomeSearchViewModel_Factory();

        private component2() {
        }

        static {
            int i = ShareDataUIState + 91;
            component2 = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
