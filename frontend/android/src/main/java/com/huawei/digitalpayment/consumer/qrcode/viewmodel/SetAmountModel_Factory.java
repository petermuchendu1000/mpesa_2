package com.huawei.digitalpayment.consumer.qrcode.viewmodel;

import dagger.internal.Factory;

public final class SetAmountModel_Factory implements Factory<SetAmountModel> {
    private static int component2 = 1;
    private static int copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 33;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        SetAmountModel setAmountModel = get();
        int i4 = component2 + 103;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return setAmountModel;
    }

    @Override
    public SetAmountModel get() {
        int i = 2 % 2;
        int i2 = component2 + 91;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            newInstance();
            throw null;
        }
        SetAmountModel setAmountModelNewInstance = newInstance();
        int i3 = copydefault + 45;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return setAmountModelNewInstance;
    }

    public static SetAmountModel_Factory create() {
        int i = 2 % 2;
        int i2 = copydefault + 67;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        SetAmountModel_Factory setAmountModel_Factory = component3.ShareDataUIState;
        int i4 = copydefault + 121;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return setAmountModel_Factory;
    }

    public static SetAmountModel newInstance() {
        int i = 2 % 2;
        SetAmountModel setAmountModel = new SetAmountModel();
        int i2 = component2 + 1;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return setAmountModel;
    }

    static final class component3 {
        static final SetAmountModel_Factory ShareDataUIState = new SetAmountModel_Factory();
        private static int component2 = 0;
        private static int component3 = 1;

        private component3() {
        }

        static {
            int i = component2 + 89;
            component3 = i % 128;
            if (i % 2 == 0) {
                int i2 = 29 / 0;
            }
        }
    }
}
