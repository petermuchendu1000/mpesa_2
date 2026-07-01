package com.huawei.digitalpayment.consumer.bean;

import com.huawei.http.BaseResp;
import java.util.List;

public class AppNotificationResp extends BaseResp {
    private static int component1 = 0;
    private static int component2 = 1;
    private List<RecordsBean> records;

    public List<RecordsBean> getRecords() {
        int i = 2 % 2;
        int i2 = component1 + 27;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        List<RecordsBean> list = this.records;
        int i5 = i3 + 9;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public void setRecords(List<RecordsBean> list) {
        int i = 2 % 2;
        int i2 = component1 + 15;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.records = list;
        int i5 = i3 + 21;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public static class RecordsBean extends BaseResp {
        private static int component1 = 0;
        private static int copydefault = 1;
        private NotificationMessageBean data;
        private String readStatus;

        public NotificationMessageBean getData() {
            NotificationMessageBean notificationMessageBean;
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 113;
            component1 = i3 % 128;
            if (i3 % 2 != 0) {
                notificationMessageBean = this.data;
                int i4 = 24 / 0;
            } else {
                notificationMessageBean = this.data;
            }
            int i5 = i2 + 95;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return notificationMessageBean;
        }

        public void setData(NotificationMessageBean notificationMessageBean) {
            int i = 2 % 2;
            int i2 = component1 + 29;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            this.data = notificationMessageBean;
            int i5 = i3 + 107;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String getReadStatus() {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 57;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            String str = this.readStatus;
            int i5 = i2 + 63;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public void setReadStatus(String str) {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 77;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            this.readStatus = str;
            if (i4 == 0) {
                throw null;
            }
            int i5 = i2 + 1;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
        }
    }
}
