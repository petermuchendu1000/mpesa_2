package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels;

import dagger.internal.Factory;

public final class SpeedTestViewModel_Factory implements Factory<SpeedTestViewModel> {
    private static int component2 = 0;
    private static int component3 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 115;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        SpeedTestViewModel speedTestViewModel = get();
        int i4 = component2 + 33;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return speedTestViewModel;
        }
        throw null;
    }

    @Override
    public SpeedTestViewModel get() {
        int i = 2 % 2;
        int i2 = component2 + 5;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        SpeedTestViewModel speedTestViewModelNewInstance = newInstance();
        int i4 = component2 + 51;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 94 / 0;
        }
        return speedTestViewModelNewInstance;
    }

    public static SpeedTestViewModel_Factory create() {
        int i = 2 % 2;
        int i2 = component3 + 7;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        SpeedTestViewModel_Factory speedTestViewModel_Factory = ShareDataUIState.copydefault;
        int i4 = component2 + 1;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return speedTestViewModel_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static SpeedTestViewModel newInstance() {
        int i = 2 % 2;
        SpeedTestViewModel speedTestViewModel = new SpeedTestViewModel();
        int i2 = component3 + 109;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 72 / 0;
        }
        return speedTestViewModel;
    }

    static final class ShareDataUIState {
        private static int component1 = 1;
        private static int component2;
        static final SpeedTestViewModel_Factory copydefault = new SpeedTestViewModel_Factory();

        private ShareDataUIState() {
        }

        static {
            int i = component2 + 63;
            component1 = i % 128;
            int i2 = i % 2;
        }
    }
}
