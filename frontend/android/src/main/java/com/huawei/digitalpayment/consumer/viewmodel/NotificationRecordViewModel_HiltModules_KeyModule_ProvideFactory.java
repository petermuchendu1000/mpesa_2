package com.huawei.digitalpayment.consumer.viewmodel;

import com.huawei.digitalpayment.consumer.viewmodel.NotificationRecordViewModel_HiltModules;
import dagger.internal.Factory;

public final class NotificationRecordViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int component2 = 1;
    private static int copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = copydefault + 119;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        int i4 = copydefault + 77;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 51 / 0;
        }
        return bool;
    }

    @Override
    public Boolean get() {
        Boolean boolValueOf;
        int i = 2 % 2;
        int i2 = copydefault + 95;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            boolValueOf = Boolean.valueOf(provide());
            int i3 = 66 / 0;
        } else {
            boolValueOf = Boolean.valueOf(provide());
        }
        int i4 = copydefault + 109;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }

    public static NotificationRecordViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = copydefault + 75;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        NotificationRecordViewModel_HiltModules_KeyModule_ProvideFactory notificationRecordViewModel_HiltModules_KeyModule_ProvideFactory = ShareDataUIState.component1;
        if (i3 != 0) {
            return notificationRecordViewModel_HiltModules_KeyModule_ProvideFactory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = copydefault + 35;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = NotificationRecordViewModel_HiltModules.KeyModule.provide();
        if (i3 == 0) {
            int i4 = 36 / 0;
        }
        return zProvide;
    }

    static final class ShareDataUIState {
        private static int ShareDataUIState = 0;
        static final NotificationRecordViewModel_HiltModules_KeyModule_ProvideFactory component1 = new NotificationRecordViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int component2 = 1;

        private ShareDataUIState() {
        }

        static {
            int i = ShareDataUIState + 61;
            component2 = i % 128;
            int i2 = i % 2;
        }
    }
}
