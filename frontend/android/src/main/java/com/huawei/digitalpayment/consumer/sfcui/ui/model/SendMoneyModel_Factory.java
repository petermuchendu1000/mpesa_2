package com.huawei.digitalpayment.consumer.sfcui.ui.model;

import dagger.internal.Factory;

public final class SendMoneyModel_Factory implements Factory<SendMoneyModel> {
    private static int component3 = 1;
    private static int copydefault;

    @Override
    public Object get() {
        SendMoneyModel sendMoneyModel;
        int i = 2 % 2;
        int i2 = copydefault + 99;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            sendMoneyModel = get();
            int i3 = 68 / 0;
        } else {
            sendMoneyModel = get();
        }
        int i4 = copydefault + 45;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return sendMoneyModel;
        }
        throw null;
    }

    @Override
    public SendMoneyModel get() {
        int i = 2 % 2;
        int i2 = component3 + 83;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return newInstance();
        }
        newInstance();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static SendMoneyModel_Factory create() {
        int i = 2 % 2;
        int i2 = component3 + 117;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        SendMoneyModel_Factory sendMoneyModel_Factory = copydefault.ShareDataUIState;
        int i4 = component3 + 109;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return sendMoneyModel_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static SendMoneyModel newInstance() {
        int i = 2 % 2;
        SendMoneyModel sendMoneyModel = new SendMoneyModel();
        int i2 = component3 + 9;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 37 / 0;
        }
        return sendMoneyModel;
    }

    static final class copydefault {
        static final SendMoneyModel_Factory ShareDataUIState = new SendMoneyModel_Factory();
        private static int component2 = 0;
        private static int copydefault = 1;

        private copydefault() {
        }

        static {
            int i = component2 + 77;
            copydefault = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
