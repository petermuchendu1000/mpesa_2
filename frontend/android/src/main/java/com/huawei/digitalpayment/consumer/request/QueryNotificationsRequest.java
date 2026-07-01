package com.huawei.digitalpayment.consumer.request;

import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.huawei.http.BaseRequestParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/huawei/digitalpayment/consumer/request/QueryNotificationsRequest;", "Lcom/huawei/http/BaseRequestParams;", TinyAppLogUtil.TINY_APP_STANDARD_CATEGORY, "", "startNum", "", "count", "<init>", "(Ljava/lang/String;II)V", "getCategory", "()Ljava/lang/String;", "getStartNum", "()I", "getCount", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "CustomerPushMessageModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QueryNotificationsRequest extends BaseRequestParams {
    private static int ShareDataUIState = 1;
    private static int component3;
    private final String category;
    private final int count;
    private final int startNum;

    public final String getCategory() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 23;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.category;
        }
        throw null;
    }

    public final int getStartNum() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 81;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.startNum;
        }
        throw null;
    }

    public final int getCount() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 39;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        int i5 = this.count;
        int i6 = i3 + 95;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 66 / 0;
        }
        return i5;
    }

    public QueryNotificationsRequest(String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.category = str;
        this.startNum = i;
        this.count = i2;
    }

    public static QueryNotificationsRequest copy$default(QueryNotificationsRequest queryNotificationsRequest, String str, int i, int i2, int i3, Object obj) {
        int i4 = 2 % 2;
        if ((i3 & 1) != 0) {
            int i5 = component3 + 23;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                String str2 = queryNotificationsRequest.category;
                throw null;
            }
            str = queryNotificationsRequest.category;
        }
        if ((i3 & 2) != 0) {
            i = queryNotificationsRequest.startNum;
        }
        if ((i3 & 4) != 0) {
            i2 = queryNotificationsRequest.count;
            int i6 = component3 + 53;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
        }
        return queryNotificationsRequest.copy(str, i, i2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 125;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.category;
        int i5 = i2 + 53;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 55;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.startNum;
        int i6 = i2 + 69;
        component3 = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 79;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        int i5 = this.count;
        int i6 = i3 + 27;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public final QueryNotificationsRequest copy(String category, int startNum, int count) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(category, "");
        QueryNotificationsRequest queryNotificationsRequest = new QueryNotificationsRequest(category, startNum, count);
        int i2 = ShareDataUIState + 119;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return queryNotificationsRequest;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 71;
        int i4 = i3 % 128;
        ShareDataUIState = i4;
        int i5 = i3 % 2;
        if (this == other) {
            int i6 = i4 + 117;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (!(other instanceof QueryNotificationsRequest)) {
            int i8 = i2 + 33;
            ShareDataUIState = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        QueryNotificationsRequest queryNotificationsRequest = (QueryNotificationsRequest) other;
        if (!Intrinsics.areEqual(this.category, queryNotificationsRequest.category)) {
            int i10 = ShareDataUIState + 73;
            component3 = i10 % 128;
            return i10 % 2 != 0;
        }
        if (this.startNum != queryNotificationsRequest.startNum || this.count != queryNotificationsRequest.count) {
            return false;
        }
        int i11 = ShareDataUIState + 79;
        component3 = i11 % 128;
        if (i11 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 87;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.category.hashCode();
        return i3 == 0 ? (((iHashCode * 114) * Integer.hashCode(this.startNum)) / 12) % Integer.hashCode(this.count) : (((iHashCode * 31) + Integer.hashCode(this.startNum)) * 31) + Integer.hashCode(this.count);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "QueryNotificationsRequest(category=" + this.category + ", startNum=" + this.startNum + ", count=" + this.count + ")";
        int i2 = ShareDataUIState + 37;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
