package com.huawei.digitalpayment.consumer.bean;

import com.huawei.http.BaseResp;
import java.util.List;

public class AppNotificationBean extends BaseResp {
    private static int component2 = 1;
    private static int copydefault;
    private String pushType;
    private List<NotificationMessageBean> records;

    public String getPushType() {
        int i = 2 % 2;
        int i2 = copydefault + 35;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.pushType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setPushType(String str) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 17;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.pushType = str;
        int i5 = i2 + 71;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    public List<NotificationMessageBean> getRecords() {
        int i = 2 % 2;
        int i2 = copydefault + 35;
        int i3 = i2 % 128;
        component2 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        List<NotificationMessageBean> list = this.records;
        int i4 = i3 + 41;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return list;
        }
        obj.hashCode();
        throw null;
    }

    public void setRecords(List<NotificationMessageBean> list) {
        int i = 2 % 2;
        int i2 = component2 + 29;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.records = list;
        int i5 = i3 + 19;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
