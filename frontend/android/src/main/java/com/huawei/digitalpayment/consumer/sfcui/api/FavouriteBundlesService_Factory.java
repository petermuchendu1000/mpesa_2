package com.huawei.digitalpayment.consumer.sfcui.api;

import dagger.internal.Factory;

public final class FavouriteBundlesService_Factory implements Factory<FavouriteBundlesService> {
    private static int component3 = 0;
    private static int copydefault = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 37;
        copydefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            get();
            obj.hashCode();
            throw null;
        }
        FavouriteBundlesService favouriteBundlesService = get();
        int i3 = copydefault + 1;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            return favouriteBundlesService;
        }
        throw null;
    }

    @Override
    public FavouriteBundlesService get() {
        int i = 2 % 2;
        int i2 = component3 + 93;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        FavouriteBundlesService favouriteBundlesServiceNewInstance = newInstance();
        int i4 = component3 + 67;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return favouriteBundlesServiceNewInstance;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static FavouriteBundlesService_Factory create() {
        int i = 2 % 2;
        int i2 = copydefault + 85;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FavouriteBundlesService_Factory favouriteBundlesService_Factory = component1.component2;
        int i4 = copydefault + 71;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return favouriteBundlesService_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static FavouriteBundlesService newInstance() {
        int i = 2 % 2;
        FavouriteBundlesService favouriteBundlesService = new FavouriteBundlesService();
        int i2 = component3 + 3;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return favouriteBundlesService;
    }

    static final class component1 {
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        static final FavouriteBundlesService_Factory component2 = new FavouriteBundlesService_Factory();

        private component1() {
        }

        static {
            int i = ShareDataUIState + 113;
            component1 = i % 128;
            if (i % 2 == 0) {
                int i2 = 46 / 0;
            }
        }
    }
}
