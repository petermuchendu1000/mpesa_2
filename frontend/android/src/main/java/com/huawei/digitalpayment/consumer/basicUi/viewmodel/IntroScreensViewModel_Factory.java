package com.huawei.digitalpayment.consumer.basicUi.viewmodel;

import dagger.internal.Factory;

public final class IntroScreensViewModel_Factory implements Factory<IntroScreensViewModel> {
    private static int component2 = 1;
    private static int copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 91;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return get();
        }
        get();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public IntroScreensViewModel get() {
        IntroScreensViewModel introScreensViewModelNewInstance;
        int i = 2 % 2;
        int i2 = component2 + 33;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            introScreensViewModelNewInstance = newInstance();
            int i3 = 14 / 0;
        } else {
            introScreensViewModelNewInstance = newInstance();
        }
        int i4 = component2 + 57;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return introScreensViewModelNewInstance;
    }

    public static IntroScreensViewModel_Factory create() {
        int i = 2 % 2;
        int i2 = copydefault + 59;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        IntroScreensViewModel_Factory introScreensViewModel_Factory = copydefault.copydefault;
        int i4 = component2 + 65;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return introScreensViewModel_Factory;
    }

    public static IntroScreensViewModel newInstance() {
        int i = 2 % 2;
        IntroScreensViewModel introScreensViewModel = new IntroScreensViewModel();
        int i2 = component2 + 91;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 8 / 0;
        }
        return introScreensViewModel;
    }

    static final class copydefault {
        private static int ShareDataUIState = 1;
        private static int component1;
        static final IntroScreensViewModel_Factory copydefault = new IntroScreensViewModel_Factory();

        private copydefault() {
        }

        static {
            int i = ShareDataUIState + 121;
            component1 = i % 128;
            int i2 = i % 2;
        }
    }
}
