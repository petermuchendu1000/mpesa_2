package com.huawei.digitalpayment.consumer.sfcui.api;

import dagger.internal.Factory;

public final class EasyTalkService_Factory implements Factory<EasyTalkService> {
    private static int component1 = 1;
    private static int component2;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component1 + 67;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        EasyTalkService easyTalkService = get();
        int i4 = component2 + 25;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return easyTalkService;
    }

    @Override
    public EasyTalkService get() {
        int i = 2 % 2;
        int i2 = component2 + 47;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            newInstance();
            throw null;
        }
        EasyTalkService easyTalkServiceNewInstance = newInstance();
        int i3 = component1 + 67;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return easyTalkServiceNewInstance;
    }

    public static EasyTalkService_Factory create() {
        int i = 2 % 2;
        int i2 = component2 + 117;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        EasyTalkService_Factory easyTalkService_Factory = ShareDataUIState.component1;
        int i4 = component2 + 25;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return easyTalkService_Factory;
    }

    public static EasyTalkService newInstance() {
        int i = 2 % 2;
        EasyTalkService easyTalkService = new EasyTalkService();
        int i2 = component1 + 107;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 7 / 0;
        }
        return easyTalkService;
    }

    static final class ShareDataUIState {
        static final EasyTalkService_Factory component1 = new EasyTalkService_Factory();
        private static int component3 = 1;
        private static int copydefault;

        private ShareDataUIState() {
        }

        static {
            int i = component3 + 79;
            copydefault = i % 128;
            int i2 = i % 2;
        }
    }
}
