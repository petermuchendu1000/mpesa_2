package com.huawei.digitalpayment.consumer.model;

import android.text.TextUtils;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.bean.AppNotificationResp;
import com.huawei.digitalpayment.consumer.request.QueryNotificationsRequest;
import com.huawei.digitalpayment.consumer.request.UpdateNotificationsRequest;
import com.huawei.http.BaseResp;
import javax.inject.Inject;

public class DefaultNotificationRecordModel implements NotificationRecordModel {
    private static int component3 = 0;
    private static int copydefault = 1;

    @Inject
    public DefaultNotificationRecordModel() {
    }

    @Override
    public void queryAppNotificationList(QueryNotificationsRequest queryNotificationsRequest, ApiCallback<AppNotificationResp> apiCallback) {
        int i = 2 % 2;
        PaymentRequest<AppNotificationResp> paymentRequest = new PaymentRequest<AppNotificationResp>(this) {
            private static int component1 = 0;
            private static int copydefault = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component1 + 61;
                int i4 = i3 % 128;
                copydefault = i4;
                if (i3 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i5 = i4 + 117;
                component1 = i5 % 128;
                int i6 = i5 % 2;
                return "queryAppNotificationList";
            }
        };
        paymentRequest.addParams(queryNotificationsRequest);
        sendRequest(paymentRequest, apiCallback);
        int i2 = component3 + 73;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 96 / 0;
        }
    }

    @Override
    public void updateAppNotificationStatus(final UpdateNotificationsRequest updateNotificationsRequest, ApiCallback<BaseResp> apiCallback) {
        int i = 2 % 2;
        PaymentRequest<BaseResp> paymentRequest = new PaymentRequest<BaseResp>(this) {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                if (TextUtils.isEmpty(updateNotificationsRequest.getMsgId())) {
                    return "updateAllAppNotificationReadStatus";
                }
                int i3 = copydefault + 75;
                int i4 = i3 % 128;
                ShareDataUIState = i4;
                if (i3 % 2 != 0) {
                    int i5 = 59 / 0;
                }
                int i6 = i4 + 65;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                return "updateAppNotificationStatus";
            }
        };
        paymentRequest.addParams(updateNotificationsRequest);
        sendRequest(paymentRequest, apiCallback);
        int i2 = component3 + 111;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
