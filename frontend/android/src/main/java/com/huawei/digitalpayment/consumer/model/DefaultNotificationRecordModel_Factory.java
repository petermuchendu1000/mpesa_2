package com.huawei.digitalpayment.consumer.model;

import dagger.internal.Factory;

public final class DefaultNotificationRecordModel_Factory implements Factory<DefaultNotificationRecordModel> {
    private static int component3 = 0;
    private static int copydefault = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = copydefault + 109;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DefaultNotificationRecordModel defaultNotificationRecordModel = get();
        if (i3 != 0) {
            int i4 = 81 / 0;
        }
        return defaultNotificationRecordModel;
    }

    @Override
    public DefaultNotificationRecordModel get() {
        int i = 2 % 2;
        int i2 = component3 + 47;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DefaultNotificationRecordModel defaultNotificationRecordModelNewInstance = newInstance();
        int i4 = component3 + 79;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return defaultNotificationRecordModelNewInstance;
    }

    public static DefaultNotificationRecordModel_Factory create() {
        int i = 2 % 2;
        int i2 = component3 + 27;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DefaultNotificationRecordModel_Factory defaultNotificationRecordModel_Factory = component2.component1;
        if (i3 != 0) {
            return defaultNotificationRecordModel_Factory;
        }
        throw null;
    }

    public static DefaultNotificationRecordModel newInstance() {
        int i = 2 % 2;
        DefaultNotificationRecordModel defaultNotificationRecordModel = new DefaultNotificationRecordModel();
        int i2 = component3 + 111;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return defaultNotificationRecordModel;
        }
        throw null;
    }

    static final class component2 {
        private static int ShareDataUIState = 0;
        static final DefaultNotificationRecordModel_Factory component1 = new DefaultNotificationRecordModel_Factory();
        private static int component3 = 1;

        private component2() {
        }

        static {
            int i = ShareDataUIState + 53;
            component3 = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }
    }
}
