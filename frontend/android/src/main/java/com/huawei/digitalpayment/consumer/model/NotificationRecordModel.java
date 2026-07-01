package com.huawei.digitalpayment.consumer.model;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.bean.AppNotificationResp;
import com.huawei.digitalpayment.consumer.request.QueryNotificationsRequest;
import com.huawei.digitalpayment.consumer.request.UpdateNotificationsRequest;
import com.huawei.http.BaseResp;

public interface NotificationRecordModel extends BaseModel {
    void queryAppNotificationList(QueryNotificationsRequest queryNotificationsRequest, ApiCallback<AppNotificationResp> apiCallback);

    void updateAppNotificationStatus(UpdateNotificationsRequest updateNotificationsRequest, ApiCallback<BaseResp> apiCallback);
}
