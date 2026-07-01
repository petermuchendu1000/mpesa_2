package com.huawei.digitalpayment.common.theme.model;

import dagger.internal.Factory;

public final class BannerThemeModel_Factory implements Factory<BannerThemeModel> {
    private static int component3 = 1;
    private static int copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 107;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        BannerThemeModel bannerThemeModel = get();
        if (i3 != 0) {
            int i4 = 27 / 0;
        }
        return bannerThemeModel;
    }

    @Override
    public BannerThemeModel get() {
        int i = 2 % 2;
        int i2 = component3 + 125;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        BannerThemeModel bannerThemeModelNewInstance = newInstance();
        int i4 = copydefault + 77;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return bannerThemeModelNewInstance;
        }
        throw null;
    }

    public static BannerThemeModel_Factory create() {
        int i = 2 % 2;
        int i2 = copydefault + 43;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        BannerThemeModel_Factory bannerThemeModel_Factory = ShareDataUIState.component3;
        int i4 = component3 + 1;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return bannerThemeModel_Factory;
    }

    public static BannerThemeModel newInstance() {
        int i = 2 % 2;
        BannerThemeModel bannerThemeModel = new BannerThemeModel();
        int i2 = copydefault + 41;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return bannerThemeModel;
    }

    static final class ShareDataUIState {
        private static int component1 = 1;
        static final BannerThemeModel_Factory component3 = new BannerThemeModel_Factory();
        private static int copydefault;

        private ShareDataUIState() {
        }

        static {
            int i = component1 + 107;
            copydefault = i % 128;
            int i2 = i % 2;
        }
    }
}
