package com.huawei.digitalpayment.consumer.schedule.model;

import dagger.internal.Factory;

public final class SchedulePaymentModel_Factory implements Factory<SchedulePaymentModel> {
    private static int component2 = 1;
    private static int component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 55;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            get();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SchedulePaymentModel schedulePaymentModel = get();
        int i3 = component3 + 101;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return schedulePaymentModel;
    }

    @Override
    public SchedulePaymentModel get() {
        int i = 2 % 2;
        int i2 = component3 + 21;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        SchedulePaymentModel schedulePaymentModelNewInstance = newInstance();
        int i4 = component3 + 113;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return schedulePaymentModelNewInstance;
    }

    public static SchedulePaymentModel_Factory create() {
        int i = 2 % 2;
        int i2 = component2 + 49;
        component3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            SchedulePaymentModel_Factory schedulePaymentModel_Factory = ShareDataUIState.component1;
            obj.hashCode();
            throw null;
        }
        SchedulePaymentModel_Factory schedulePaymentModel_Factory2 = ShareDataUIState.component1;
        int i3 = component2 + 97;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            return schedulePaymentModel_Factory2;
        }
        obj.hashCode();
        throw null;
    }

    public static SchedulePaymentModel newInstance() {
        int i = 2 % 2;
        SchedulePaymentModel schedulePaymentModel = new SchedulePaymentModel();
        int i2 = component3 + 111;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return schedulePaymentModel;
    }

    static final class ShareDataUIState {
        static final SchedulePaymentModel_Factory component1 = new SchedulePaymentModel_Factory();
        private static int component2 = 0;
        private static int copydefault = 1;

        private ShareDataUIState() {
        }

        static {
            int i = component2 + 101;
            copydefault = i % 128;
            int i2 = i % 2;
        }
    }
}
