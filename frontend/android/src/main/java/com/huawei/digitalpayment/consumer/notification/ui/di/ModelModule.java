package com.huawei.digitalpayment.consumer.notification.ui.di;

import com.huawei.digitalpayment.consumer.model.DefaultNotificationRecordModel;
import com.huawei.digitalpayment.consumer.model.NotificationRecordModel;
import dagger.Binds;
import dagger.Module;

@Module
public abstract class ModelModule {
    @Binds
    public abstract NotificationRecordModel bindNotificationRecordModel(DefaultNotificationRecordModel defaultNotificationRecordModel);
}
