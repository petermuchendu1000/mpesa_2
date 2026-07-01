package com.huawei.digitalpayment.home.viewmodel;

import dagger.internal.Factory;

public final class LifeViewModel_Factory implements Factory<LifeViewModel> {
    private static int component2 = 0;
    private static int component3 = 1;

    public static void component3() {
    }

    @Override
    public Object get() {
        LifeViewModel lifeViewModel;
        int i = 2 % 2;
        int i2 = component2 + 15;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            lifeViewModel = get();
            int i3 = 49 / 0;
        } else {
            lifeViewModel = get();
        }
        int i4 = component3 + 125;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return lifeViewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public LifeViewModel get() {
        int i = 2 % 2;
        int i2 = component2 + 19;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        LifeViewModel lifeViewModelNewInstance = newInstance();
        int i4 = component2 + 123;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return lifeViewModelNewInstance;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static LifeViewModel_Factory create() {
        int i = 2 % 2;
        int i2 = component2 + 91;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        LifeViewModel_Factory lifeViewModel_Factory = component1.component2;
        int i4 = component2 + 25;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return lifeViewModel_Factory;
    }

    public static LifeViewModel newInstance() {
        int i = 2 % 2;
        LifeViewModel lifeViewModel = new LifeViewModel();
        int i2 = component3 + 119;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 3 / 0;
        }
        return lifeViewModel;
    }

    static final class component1 {
        static final LifeViewModel_Factory component2 = new LifeViewModel_Factory();
        private static int component3 = 0;
        private static int copydefault = 1;

        private component1() {
        }

        static {
            int i = copydefault + 95;
            component3 = i % 128;
            int i2 = i % 2;
        }
    }
}
