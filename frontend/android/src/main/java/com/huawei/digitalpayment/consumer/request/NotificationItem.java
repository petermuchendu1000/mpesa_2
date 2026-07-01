package com.huawei.digitalpayment.consumer.request;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/consumer/request/NotificationItem;", "", "msgId", "", "readStatus", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getMsgId", "()Ljava/lang/String;", "getReadStatus", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "CustomerPushMessageModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NotificationItem {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private final String component3;
    private final String copydefault;

    public NotificationItem(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.component3 = str;
        this.copydefault = str2;
    }

    public final String getMsgId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 27;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        int i5 = i3 + 51;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getReadStatus() {
        int i = 2 % 2;
        int i2 = component1 + 67;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.copydefault;
        int i4 = i3 + 51;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public static NotificationItem copy$default(NotificationItem notificationItem, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = ShareDataUIState + 15;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            str = notificationItem.component3;
        }
        if ((i & 2) != 0) {
            int i5 = component1 + 19;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                str2 = notificationItem.copydefault;
                int i6 = 33 / 0;
            } else {
                str2 = notificationItem.copydefault;
            }
        }
        NotificationItem notificationItemCopy = notificationItem.copy(str, str2);
        int i7 = ShareDataUIState + 67;
        component1 = i7 % 128;
        int i8 = i7 % 2;
        return notificationItemCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 87;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component3;
        int i5 = i2 + 27;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 65;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.copydefault;
        }
        throw null;
    }

    public final NotificationItem copy(String msgId, String readStatus) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(msgId, "");
        Intrinsics.checkNotNullParameter(readStatus, "");
        NotificationItem notificationItem = new NotificationItem(msgId, readStatus);
        int i2 = component1 + 119;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return notificationItem;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = ShareDataUIState + 55;
            component1 = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(other instanceof NotificationItem)) {
            return false;
        }
        NotificationItem notificationItem = (NotificationItem) other;
        if (Intrinsics.areEqual(this.component3, notificationItem.component3)) {
            return Intrinsics.areEqual(this.copydefault, notificationItem.copydefault);
        }
        int i3 = ShareDataUIState + 47;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 89;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.component3.hashCode() * 31) + this.copydefault.hashCode();
        int i4 = ShareDataUIState + 77;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "NotificationItem(msgId=" + this.component3 + ", readStatus=" + this.copydefault + ")";
        int i2 = component1 + 1;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
