package com.huawei.digitalpayment.consumer.viewmodel;

import com.huawei.digitalpayment.consumer.model.NotificationRecordModel;
import javax.inject.Inject;

public class NotificationRecordViewModel extends BaseNotificationRecordViewModel<NotificationRecordModel> {
    @Inject
    public NotificationRecordViewModel(NotificationRecordModel notificationRecordModel) {
        super(notificationRecordModel);
    }
}
