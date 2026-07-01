package com.huawei.digitalpayment.home.data;

import dagger.internal.Factory;

public final class TipsModel_Factory implements Factory<TipsModel> {
    private static int ShareDataUIState = 1;
    private static int component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 35;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        TipsModel tipsModel = get();
        int i4 = component3 + 33;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 64 / 0;
        }
        return tipsModel;
    }

    @Override
    public TipsModel get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 17;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return newInstance();
        }
        int i3 = 2 / 0;
        return newInstance();
    }

    public static TipsModel_Factory create() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 53;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        TipsModel_Factory tipsModel_Factory = copydefault.component2;
        int i4 = ShareDataUIState + 109;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return tipsModel_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static TipsModel newInstance() {
        int i = 2 % 2;
        TipsModel tipsModel = new TipsModel();
        int i2 = ShareDataUIState + 23;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return tipsModel;
    }

    static final class copydefault {
        private static int ShareDataUIState = 1;
        private static int component1;
        static final TipsModel_Factory component2 = new TipsModel_Factory();

        private copydefault() {
        }

        static {
            int i = ShareDataUIState + 115;
            component1 = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
