package com.huawei.digitalpayment.consumer.viewmodel;

import com.huawei.digitalpayment.consumer.model.NotificationRecordModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class NotificationRecordViewModel_Factory implements Factory<NotificationRecordViewModel> {
    private static int ShareDataUIState = 1;
    private static int component2;
    private final Provider<NotificationRecordModel> component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 79;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            get();
            throw null;
        }
        NotificationRecordViewModel notificationRecordViewModel = get();
        int i3 = ShareDataUIState + 19;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return notificationRecordViewModel;
    }

    public NotificationRecordViewModel_Factory(Provider<NotificationRecordModel> provider) {
        this.component3 = provider;
    }

    @Override
    public NotificationRecordViewModel get() {
        int i = 2 % 2;
        int i2 = component2 + 53;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        NotificationRecordViewModel notificationRecordViewModelNewInstance = newInstance(this.component3.get());
        int i4 = component2 + 31;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return notificationRecordViewModelNewInstance;
    }

    public static NotificationRecordViewModel_Factory create(javax.inject.Provider<NotificationRecordModel> provider) {
        int i = 2 % 2;
        NotificationRecordViewModel_Factory notificationRecordViewModel_Factory = new NotificationRecordViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = ShareDataUIState + 117;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return notificationRecordViewModel_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static NotificationRecordViewModel_Factory create(Provider<NotificationRecordModel> provider) {
        int i = 2 % 2;
        NotificationRecordViewModel_Factory notificationRecordViewModel_Factory = new NotificationRecordViewModel_Factory(provider);
        int i2 = ShareDataUIState + 117;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 62 / 0;
        }
        return notificationRecordViewModel_Factory;
    }

    public static NotificationRecordViewModel newInstance(NotificationRecordModel notificationRecordModel) {
        int i = 2 % 2;
        NotificationRecordViewModel notificationRecordViewModel = new NotificationRecordViewModel(notificationRecordModel);
        int i2 = component2 + 3;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return notificationRecordViewModel;
    }
}
