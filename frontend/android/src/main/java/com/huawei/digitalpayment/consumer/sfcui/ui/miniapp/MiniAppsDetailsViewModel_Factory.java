package com.huawei.digitalpayment.consumer.sfcui.ui.miniapp;

import dagger.internal.Factory;

public final class MiniAppsDetailsViewModel_Factory implements Factory<MiniAppsDetailsViewModel> {
    private static int ShareDataUIState = 1;
    private static int copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 17;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        MiniAppsDetailsViewModel miniAppsDetailsViewModel = get();
        int i4 = ShareDataUIState + 3;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return miniAppsDetailsViewModel;
    }

    @Override
    public MiniAppsDetailsViewModel get() {
        MiniAppsDetailsViewModel miniAppsDetailsViewModelNewInstance;
        int i = 2 % 2;
        int i2 = copydefault + 111;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            miniAppsDetailsViewModelNewInstance = newInstance();
            int i3 = 97 / 0;
        } else {
            miniAppsDetailsViewModelNewInstance = newInstance();
        }
        int i4 = ShareDataUIState + 29;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return miniAppsDetailsViewModelNewInstance;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static MiniAppsDetailsViewModel_Factory create() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 87;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        MiniAppsDetailsViewModel_Factory miniAppsDetailsViewModel_Factory = copydefault.component1;
        if (i3 != 0) {
            int i4 = 20 / 0;
        }
        return miniAppsDetailsViewModel_Factory;
    }

    public static MiniAppsDetailsViewModel newInstance() {
        int i = 2 % 2;
        MiniAppsDetailsViewModel miniAppsDetailsViewModel = new MiniAppsDetailsViewModel();
        int i2 = ShareDataUIState + 41;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return miniAppsDetailsViewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class copydefault {
        private static int ShareDataUIState = 0;
        static final MiniAppsDetailsViewModel_Factory component1 = new MiniAppsDetailsViewModel_Factory();
        private static int component2 = 1;

        private copydefault() {
        }

        static {
            int i = component2 + 99;
            ShareDataUIState = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
