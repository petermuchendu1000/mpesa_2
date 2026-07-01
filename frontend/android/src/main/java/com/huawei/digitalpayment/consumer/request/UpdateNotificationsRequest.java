package com.huawei.digitalpayment.consumer.request;

import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.huawei.http.BaseRequestParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/request/UpdateNotificationsRequest;", "Lcom/huawei/http/BaseRequestParams;", TinyAppLogUtil.TINY_APP_STANDARD_CATEGORY, "", "readStatus", "msgId", "pushDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCategory", "()Ljava/lang/String;", "getReadStatus", "getMsgId", "getPushDate", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "CustomerPushMessageModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UpdateNotificationsRequest extends BaseRequestParams {
    private static int component1 = 0;
    private static int component2 = 1;
    private final String category;
    private final String msgId;
    private final String pushDate;
    private final String readStatus;

    public final String getCategory() {
        int i = 2 % 2;
        int i2 = component2 + 103;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.category;
        int i5 = i3 + 19;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getReadStatus() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 27;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.readStatus;
        int i5 = i2 + 7;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getMsgId() {
        int i = 2 % 2;
        int i2 = component2 + 97;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.msgId;
        int i5 = i3 + 93;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getPushDate() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 17;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.pushDate;
        int i5 = i2 + 97;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public UpdateNotificationsRequest(String str, String str2, String str3, String str4) {
        this.category = str;
        this.readStatus = str2;
        this.msgId = str3;
        this.pushDate = str4;
    }

    public static UpdateNotificationsRequest copy$default(UpdateNotificationsRequest updateNotificationsRequest, String str, String str2, String str3, String str4, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component2 + 103;
            component1 = i3 % 128;
            if (i3 % 2 != 0) {
                str = updateNotificationsRequest.category;
                int i4 = 75 / 0;
            } else {
                str = updateNotificationsRequest.category;
            }
        }
        if ((i & 2) != 0) {
            int i5 = component2 + 51;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            str2 = updateNotificationsRequest.readStatus;
        }
        if ((i & 4) != 0) {
            int i7 = component2 + 47;
            component1 = i7 % 128;
            if (i7 % 2 != 0) {
                str3 = updateNotificationsRequest.msgId;
                int i8 = 26 / 0;
            } else {
                str3 = updateNotificationsRequest.msgId;
            }
        }
        if ((i & 8) != 0) {
            str4 = updateNotificationsRequest.pushDate;
        }
        return updateNotificationsRequest.copy(str, str2, str3, str4);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 123;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.category;
        int i5 = i3 + 55;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2 + 111;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.readStatus;
        int i5 = i3 + 51;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 9 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component2 + 67;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.msgId;
        int i5 = i3 + 101;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component2 + 101;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.pushDate;
        int i5 = i3 + 55;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final UpdateNotificationsRequest copy(String category, String readStatus, String msgId, String pushDate) {
        int i = 2 % 2;
        UpdateNotificationsRequest updateNotificationsRequest = new UpdateNotificationsRequest(category, readStatus, msgId, pushDate);
        int i2 = component2 + 121;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return updateNotificationsRequest;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 59;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            int i5 = i2 + 67;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof UpdateNotificationsRequest)) {
            return false;
        }
        UpdateNotificationsRequest updateNotificationsRequest = (UpdateNotificationsRequest) other;
        if (!Intrinsics.areEqual(this.category, updateNotificationsRequest.category) || !Intrinsics.areEqual(this.readStatus, updateNotificationsRequest.readStatus)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.msgId, updateNotificationsRequest.msgId)) {
            int i7 = component1 + 31;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.pushDate, updateNotificationsRequest.pushDate)) {
            return true;
        }
        int i9 = component1 + 65;
        component2 = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.category;
        int iHashCode2 = 0;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.readStatus;
        int iHashCode4 = 1;
        if (str2 == null) {
            int i2 = component2 + 1;
            component1 = i2 % 128;
            iHashCode = i2 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = str2.hashCode();
        }
        String str3 = this.msgId;
        if (str3 == null) {
            int i3 = component2 + 97;
            component1 = i3 % 128;
            if (i3 % 2 == 0) {
                iHashCode4 = 0;
            }
        } else {
            iHashCode4 = str3.hashCode();
        }
        String str4 = this.pushDate;
        if (str4 != null) {
            iHashCode2 = str4.hashCode();
            int i4 = component1 + 17;
            component2 = i4 % 128;
            int i5 = i4 % 2;
        }
        return (((((iHashCode3 * 31) + iHashCode) * 31) + iHashCode4) * 31) + iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "UpdateNotificationsRequest(category=" + this.category + ", readStatus=" + this.readStatus + ", msgId=" + this.msgId + ", pushDate=" + this.pushDate + ")";
        int i2 = component1 + 71;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
