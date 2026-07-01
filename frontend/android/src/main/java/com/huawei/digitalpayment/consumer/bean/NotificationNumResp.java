package com.huawei.digitalpayment.consumer.bean;

import com.huawei.http.BaseResp;

public class NotificationNumResp extends BaseResp {
    private static int component1 = 0;
    private static int component2 = 1;
    private int promotionNotificationCount;
    private int systemNotificationCount;
    private int transferNotificationCount;

    public int getSystemNotificationCount() {
        int i = 2 % 2;
        int i2 = component2 + 29;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.systemNotificationCount;
        if (i3 != 0) {
            int i5 = 31 / 0;
        }
        return i4;
    }

    public void setSystemNotificationCount(int i) {
        int i2 = 2 % 2;
        int i3 = component1 + 113;
        int i4 = i3 % 128;
        component2 = i4;
        int i5 = i3 % 2;
        this.systemNotificationCount = i;
        if (i5 == 0) {
            throw null;
        }
        int i6 = i4 + 19;
        component1 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 84 / 0;
        }
    }

    public int getTransferNotificationCount() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 3;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.transferNotificationCount;
        int i6 = i2 + 61;
        component2 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public void setTransferNotificationCount(int i) {
        int i2 = 2 % 2;
        int i3 = component2 + 51;
        int i4 = i3 % 128;
        component1 = i4;
        int i5 = i3 % 2;
        this.transferNotificationCount = i;
        int i6 = i4 + 79;
        component2 = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getPromotionNotificationCount() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 101;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.promotionNotificationCount;
        int i6 = i2 + 111;
        component2 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public void setPromotionNotificationCount(int i) {
        int i2 = 2 % 2;
        int i3 = component2;
        int i4 = i3 + 97;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        this.promotionNotificationCount = i;
        int i6 = i3 + 17;
        component1 = i6 % 128;
        int i7 = i6 % 2;
    }
}
