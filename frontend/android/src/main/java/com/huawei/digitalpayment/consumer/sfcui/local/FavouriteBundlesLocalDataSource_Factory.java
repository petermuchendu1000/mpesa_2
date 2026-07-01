package com.huawei.digitalpayment.consumer.sfcui.local;

import dagger.internal.Factory;

public final class FavouriteBundlesLocalDataSource_Factory implements Factory<FavouriteBundlesLocalDataSource> {
    private static int component1 = 1;
    private static int component2;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 89;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            get();
            throw null;
        }
        FavouriteBundlesLocalDataSource favouriteBundlesLocalDataSource = get();
        int i3 = component1 + 95;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return favouriteBundlesLocalDataSource;
    }

    @Override
    public FavouriteBundlesLocalDataSource get() {
        int i = 2 % 2;
        int i2 = component2 + 21;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FavouriteBundlesLocalDataSource favouriteBundlesLocalDataSourceNewInstance = newInstance();
        int i4 = component2 + 95;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return favouriteBundlesLocalDataSourceNewInstance;
    }

    public static FavouriteBundlesLocalDataSource_Factory create() {
        int i = 2 % 2;
        int i2 = component1 + 81;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FavouriteBundlesLocalDataSource_Factory favouriteBundlesLocalDataSource_Factory = ShareDataUIState.copydefault;
        if (i3 == 0) {
            return favouriteBundlesLocalDataSource_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static FavouriteBundlesLocalDataSource newInstance() {
        int i = 2 % 2;
        FavouriteBundlesLocalDataSource favouriteBundlesLocalDataSource = new FavouriteBundlesLocalDataSource();
        int i2 = component1 + 63;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return favouriteBundlesLocalDataSource;
    }

    static final class ShareDataUIState {
        private static int component2 = 1;
        private static int component3;
        static final FavouriteBundlesLocalDataSource_Factory copydefault = new FavouriteBundlesLocalDataSource_Factory();

        private ShareDataUIState() {
        }

        static {
            int i = component2 + 105;
            component3 = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
