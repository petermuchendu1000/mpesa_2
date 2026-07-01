package com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel;

import dagger.internal.Factory;

public final class OfferBundleViewModel_Factory implements Factory<OfferBundleViewModel> {
    private static int component1 = 0;
    private static int copydefault = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component1 + 113;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return get();
        }
        get();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public OfferBundleViewModel get() {
        int i = 2 % 2;
        int i2 = component1 + 119;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        OfferBundleViewModel offerBundleViewModelNewInstance = newInstance();
        int i4 = component1 + 45;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return offerBundleViewModelNewInstance;
        }
        throw null;
    }

    public static OfferBundleViewModel_Factory create() {
        int i = 2 % 2;
        int i2 = component1 + 117;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        OfferBundleViewModel_Factory offerBundleViewModel_Factory = copydefault.copydefault;
        int i4 = component1 + 101;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return offerBundleViewModel_Factory;
        }
        throw null;
    }

    public static OfferBundleViewModel newInstance() {
        int i = 2 % 2;
        OfferBundleViewModel offerBundleViewModel = new OfferBundleViewModel();
        int i2 = component1 + 75;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return offerBundleViewModel;
        }
        throw null;
    }

    static final class copydefault {
        private static int component1 = 0;
        private static int component3 = 1;
        static final OfferBundleViewModel_Factory copydefault = new OfferBundleViewModel_Factory();

        private copydefault() {
        }

        static {
            int i = component3 + 105;
            component1 = i % 128;
            int i2 = i % 2;
        }
    }
}
