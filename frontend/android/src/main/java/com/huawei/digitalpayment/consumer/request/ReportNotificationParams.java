package com.huawei.digitalpayment.consumer.request;

import com.huawei.http.BaseRequestParams;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/request/ReportNotificationParams;", "Lcom/huawei/http/BaseRequestParams;", "initiatorMsisdn", "", "msgList", "", "Lcom/huawei/digitalpayment/consumer/request/NotificationItem;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getInitiatorMsisdn", "()Ljava/lang/String;", "getMsgList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "CustomerPushMessageModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReportNotificationParams extends BaseRequestParams {
    private static int ShareDataUIState = 1;
    private static int component1;
    private final String initiatorMsisdn;
    private final List<NotificationItem> msgList;

    public final String getInitiatorMsisdn() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 61;
        int i3 = i2 % 128;
        component1 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.initiatorMsisdn;
        int i4 = i3 + 3;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final List<NotificationItem> getMsgList() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 49;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        List<NotificationItem> list = this.msgList;
        int i5 = i2 + 9;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public ReportNotificationParams(String str, List<NotificationItem> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.initiatorMsisdn = str;
        this.msgList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ReportNotificationParams copy$default(ReportNotificationParams reportNotificationParams, String str, List list, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = reportNotificationParams.initiatorMsisdn;
            int i3 = ShareDataUIState + 123;
            component1 = i3 % 128;
            int i4 = i3 % 2;
        }
        if ((i & 2) != 0) {
            int i5 = ShareDataUIState + 37;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                list = reportNotificationParams.msgList;
                int i6 = 50 / 0;
            } else {
                list = reportNotificationParams.msgList;
            }
        }
        return reportNotificationParams.copy(str, list);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 61;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.initiatorMsisdn;
        int i4 = i2 + 17;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final List<NotificationItem> component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 29;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        List<NotificationItem> list = this.msgList;
        int i5 = i3 + 67;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ReportNotificationParams copy(String initiatorMsisdn, List<NotificationItem> msgList) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(initiatorMsisdn, "");
        Intrinsics.checkNotNullParameter(msgList, "");
        ReportNotificationParams reportNotificationParams = new ReportNotificationParams(initiatorMsisdn, msgList);
        int i2 = component1 + 61;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return reportNotificationParams;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 65;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReportNotificationParams)) {
            int i4 = i2 + 85;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i2 + 27;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        ReportNotificationParams reportNotificationParams = (ReportNotificationParams) other;
        if (!Intrinsics.areEqual(this.initiatorMsisdn, reportNotificationParams.initiatorMsisdn)) {
            int i8 = ShareDataUIState + 87;
            component1 = i8 % 128;
            return i8 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.msgList, reportNotificationParams.msgList)) {
            return false;
        }
        int i9 = component1 + 29;
        ShareDataUIState = i9 % 128;
        int i10 = i9 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 71;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.initiatorMsisdn.hashCode() * 31) + this.msgList.hashCode();
        int i4 = component1 + 23;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ReportNotificationParams(initiatorMsisdn=" + this.initiatorMsisdn + ", msgList=" + this.msgList + ")";
        int i2 = component1 + 45;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
