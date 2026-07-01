package com.huawei.digitalpayment.consumer.viewmodel;

import dagger.internal.Factory;

public final class NotificationViewModel_Factory implements Factory<NotificationViewModel> {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 25;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        NotificationViewModel notificationViewModel = get();
        int i4 = component1 + 115;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return notificationViewModel;
    }

    @Override
    public NotificationViewModel get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 25;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        NotificationViewModel notificationViewModelNewInstance = newInstance();
        if (i3 == 0) {
            int i4 = 26 / 0;
        }
        return notificationViewModelNewInstance;
    }

    public static NotificationViewModel_Factory create() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 15;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        NotificationViewModel_Factory notificationViewModel_Factory = ShareDataUIState.component3;
        if (i3 != 0) {
            return notificationViewModel_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static NotificationViewModel newInstance() {
        int i = 2 % 2;
        NotificationViewModel notificationViewModel = new NotificationViewModel();
        int i2 = ShareDataUIState + 75;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return notificationViewModel;
    }

    static final class ShareDataUIState {
        private static int ShareDataUIState = 1;
        private static int component2;
        static final NotificationViewModel_Factory component3 = new NotificationViewModel_Factory();

        private ShareDataUIState() {
        }

        static {
            int i = ShareDataUIState + 95;
            component2 = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
