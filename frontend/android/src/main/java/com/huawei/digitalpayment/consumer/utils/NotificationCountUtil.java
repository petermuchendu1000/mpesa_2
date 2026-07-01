package com.huawei.digitalpayment.consumer.utils;

import com.huawei.digitalpayment.consumer.bean.NotificationNumResp;

@Deprecated
public class NotificationCountUtil {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;

    public static void refreshNotificationCount(NotificationNumResp notificationNumResp) {
        int i = 2 % 2;
        int i2 = copydefault + 15;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        NotificationRefreshUtil.setUnReadCount(NotificationRefreshUtil.SYSTEM_REFRESH_TIME, notificationNumResp.getSystemNotificationCount());
        NotificationRefreshUtil.setUnReadCount(NotificationRefreshUtil.PROMOTION_REFRESH_TIME, notificationNumResp.getPromotionNotificationCount());
        NotificationRefreshUtil.setUnReadCount(NotificationRefreshUtil.TRANSFER_REFRESH_TIME, notificationNumResp.getTransferNotificationCount());
        int i4 = copydefault + 31;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
