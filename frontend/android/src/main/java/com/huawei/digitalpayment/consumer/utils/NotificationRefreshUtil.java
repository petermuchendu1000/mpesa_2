package com.huawei.digitalpayment.consumer.utils;

import android.text.TextUtils;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.baselib.util.TimeUtils;
import com.huawei.digitalpayment.consumer.bean.NotificationNumResp;

@Deprecated
public class NotificationRefreshUtil {
    public static final String COUNT = "COUNT";
    public static final String PROMOTION_REFRESH_TIME = "PROMOTION_REFRESH_TIME";
    public static final String SYSTEM_REFRESH_TIME = "SYSTEM_REFRESH_TIME";
    public static final String TRANSFER_REFRESH_TIME = "TRANSFER_REFRESH_TIME";
    private static int component2 = 0;
    private static int copydefault = 1;

    public static void setRefreshTime(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 43;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        SPUtils sPUtils = SPUtils.getInstance();
        if (i3 == 0) {
            sPUtils.put(str, String.valueOf(TimeUtils.getServerTimeFromUTC().getTime()));
            return;
        }
        sPUtils.put(str, String.valueOf(TimeUtils.getServerTimeFromUTC().getTime()));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static String getRefreshTime(String str) {
        String strValueOf;
        int i = 2 % 2;
        int i2 = copydefault + 59;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String string = SPUtils.getInstance().getString(str);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        int i4 = copydefault + 35;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            strValueOf = String.valueOf(TimeUtils.getServerTimeFromUTC().getTime());
            SPUtils.getInstance().put(str, strValueOf);
            int i5 = 83 / 0;
        } else {
            strValueOf = String.valueOf(TimeUtils.getServerTimeFromUTC().getTime());
            SPUtils.getInstance().put(str, strValueOf);
        }
        return strValueOf;
    }

    public static void setUnReadCount(String str, int i) {
        int i2 = 2 % 2;
        SPUtils.getInstance().put(str + COUNT, i);
        int i3 = component2 + 87;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
    }

    public static int getUnReadCount(String str) {
        int i = 2 % 2;
        int i2 = SPUtils.getInstance().getInt(str + COUNT, 0);
        int i3 = copydefault + 37;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return i2;
    }

    public static void clearUnReadCount(String str) {
        int i = 2 % 2;
        SPUtils.getInstance().remove(str + COUNT);
        int i2 = component2 + 51;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public static int getNewUnReadCount(NotificationNumResp notificationNumResp) {
        int i = 2 % 2;
        int i2 = copydefault + 105;
        component2 = i2 % 128;
        int systemNotificationCount = i2 % 2 != 0 ? (notificationNumResp.getSystemNotificationCount() << notificationNumResp.getPromotionNotificationCount()) - notificationNumResp.getTransferNotificationCount() : notificationNumResp.getSystemNotificationCount() + notificationNumResp.getPromotionNotificationCount() + notificationNumResp.getTransferNotificationCount();
        int i3 = component2 + 73;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return systemNotificationCount;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0042 A[PHI: r1 r5
  0x0042: PHI (r1v5 java.util.Calendar) = (r1v4 java.util.Calendar), (r1v7 java.util.Calendar) binds: [B:10:0x0040, B:6:0x0026] A[DONT_GENERATE, DONT_INLINE]
  0x0042: PHI (r5v3 java.util.Calendar) = (r5v2 java.util.Calendar), (r5v15 java.util.Calendar) binds: [B:10:0x0040, B:6:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String formatTimestamp(java.lang.String r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.utils.NotificationRefreshUtil.copydefault
            int r1 = r1 + 31
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.utils.NotificationRefreshUtil.component2 = r2
            int r1 = r1 % r0
            r2 = 1
            if (r1 == 0) goto L29
            long r3 = java.lang.Long.parseLong(r5)     // Catch: java.lang.Exception -> L7c
            java.util.Calendar r5 = java.util.Calendar.getInstance()
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            r1.setTimeInMillis(r3)
            int r3 = r5.get(r2)
            int r2 = r1.get(r2)
            if (r3 != r2) goto L70
            goto L42
        L29:
            long r3 = java.lang.Long.parseLong(r5)     // Catch: java.lang.Exception -> L7c
            java.util.Calendar r5 = java.util.Calendar.getInstance()
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            r1.setTimeInMillis(r3)
            int r3 = r5.get(r2)
            int r2 = r1.get(r2)
            if (r3 != r2) goto L70
        L42:
            r2 = 6
            int r5 = r5.get(r2)
            int r2 = r1.get(r2)
            if (r5 != r2) goto L70
            int r5 = com.huawei.digitalpayment.consumer.utils.NotificationRefreshUtil.component2
            int r5 = r5 + 69
            int r2 = r5 % 128
            com.huawei.digitalpayment.consumer.utils.NotificationRefreshUtil.copydefault = r2
            int r5 = r5 % r0
            java.lang.String r0 = "H:mm"
            if (r5 != 0) goto L67
            java.lang.CharSequence r5 = android.text.format.DateFormat.format(r0, r1)
            java.lang.String r5 = r5.toString()
            r0 = 30
            int r0 = r0 / 0
            return r5
        L67:
            java.lang.CharSequence r5 = android.text.format.DateFormat.format(r0, r1)
            java.lang.String r5 = r5.toString()
            return r5
        L70:
            java.lang.String r5 = "yyyy/M/d/H:mm"
            java.lang.CharSequence r5 = android.text.format.DateFormat.format(r5, r1)
            java.lang.String r5 = r5.toString()
            return r5
        L7c:
            java.lang.String r5 = ""
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.utils.NotificationRefreshUtil.formatTimestamp(java.lang.String):java.lang.String");
    }
}
