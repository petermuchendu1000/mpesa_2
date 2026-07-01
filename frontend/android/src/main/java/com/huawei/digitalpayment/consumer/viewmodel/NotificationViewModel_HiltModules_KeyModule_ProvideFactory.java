package com.huawei.digitalpayment.consumer.viewmodel;

import com.huawei.digitalpayment.consumer.viewmodel.NotificationViewModel_HiltModules;
import dagger.internal.Factory;

public final class NotificationViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int ShareDataUIState = 1;
    private static int component2;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 103;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        int i4 = ShareDataUIState + 87;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return bool;
        }
        throw null;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 49;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i4 = component2 + 119;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }

    public static NotificationViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 47;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        NotificationViewModel_HiltModules_KeyModule_ProvideFactory notificationViewModel_HiltModules_KeyModule_ProvideFactory = copydefault.component3;
        int i4 = component2 + 125;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return notificationViewModel_HiltModules_KeyModule_ProvideFactory;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = component2 + 65;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = NotificationViewModel_HiltModules.KeyModule.provide();
        int i4 = component2 + 117;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return zProvide;
    }

    static final class copydefault {
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        static final NotificationViewModel_HiltModules_KeyModule_ProvideFactory component3 = new NotificationViewModel_HiltModules_KeyModule_ProvideFactory();

        private copydefault() {
        }

        static {
            int i = ShareDataUIState + 57;
            component1 = i % 128;
            int i2 = i % 2;
        }
    }
}
