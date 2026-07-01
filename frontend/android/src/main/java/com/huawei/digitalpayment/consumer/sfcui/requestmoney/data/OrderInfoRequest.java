package com.huawei.digitalpayment.consumer.sfcui.requestmoney.data;

import com.alibaba.ariver.kernel.RVStartParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001f\u001a\u00020 H×\u0001J\t\u0010!\u001a\u00020\u0003H×\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\r¨\u0006\""}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/requestmoney/data/OrderInfoRequest;", "", "requestType", "", "requestMoneyOrderId", "orderStatus", RVStartParams.START_SCENE_START_PAGE, "pageLimit", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRequestType", "()Ljava/lang/String;", "setRequestType", "(Ljava/lang/String;)V", "getRequestMoneyOrderId", "setRequestMoneyOrderId", "getOrderStatus", "setOrderStatus", "getStartPage", "setStartPage", "getPageLimit", "setPageLimit", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OrderInfoRequest {
    public static final int $stable = 8;
    private static int component4 = 1;
    private static int copy = 0;
    private static int equals = 1;
    private static int getAsAtTimestamp;
    private String ShareDataUIState;
    private String component1;
    private String component2;
    private String component3;
    private String copydefault;

    public OrderInfoRequest(String str, String str2, String str3, String str4, String str5) {
        this.component2 = str;
        this.copydefault = str2;
        this.component1 = str3;
        this.component3 = str4;
        this.ShareDataUIState = str5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OrderInfoRequest(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str6;
        String str7;
        String str8 = "";
        if ((i & 1) != 0) {
            int i2 = copy + 25;
            component4 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            int i3 = 2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            int i4 = component4;
            int i5 = i4 + 45;
            copy = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 23 / 0;
            }
            int i7 = i4 + 47;
            copy = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            str6 = "";
        } else {
            str6 = str2;
        }
        if ((i & 4) != 0) {
            int i10 = copy + 77;
            component4 = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 2 % 2;
            str7 = "";
        } else {
            str7 = str3;
        }
        String str9 = (i & 8) != 0 ? "" : str4;
        if ((i & 16) != 0) {
            int i13 = 2 % 2;
        } else {
            str8 = str5;
        }
        this(str, str6, str7, str9, str8);
    }

    public final String getRequestType() {
        int i = 2 % 2;
        int i2 = component4 + 15;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        String str = this.component2;
        int i5 = i3 + 51;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setRequestType(String str) {
        int i = 2 % 2;
        int i2 = copy + 61;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        this.component2 = str;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getRequestMoneyOrderId() {
        int i = 2 % 2;
        int i2 = component4 + 19;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        String str = this.copydefault;
        int i5 = i3 + 95;
        component4 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final void setRequestMoneyOrderId(String str) {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 91;
        copy = i3 % 128;
        int i4 = i3 % 2;
        this.copydefault = str;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 9;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 18 / 0;
        }
    }

    public final String getOrderStatus() {
        int i = 2 % 2;
        int i2 = copy + 11;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.component1;
        if (i3 == 0) {
            int i4 = 33 / 0;
        }
        return str;
    }

    public final void setOrderStatus(String str) {
        int i = 2 % 2;
        int i2 = copy + 39;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        this.component1 = str;
        int i5 = i3 + 103;
        copy = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getStartPage() {
        int i = 2 % 2;
        int i2 = component4 + 5;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component3;
        }
        throw null;
    }

    public final void setStartPage(String str) {
        int i = 2 % 2;
        int i2 = component4 + 43;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        this.component3 = str;
        int i5 = i3 + 11;
        component4 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getPageLimit() {
        int i = 2 % 2;
        int i2 = component4 + 37;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        String str = this.ShareDataUIState;
        int i5 = i3 + 115;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setPageLimit(String str) {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 83;
        copy = i3 % 128;
        int i4 = i3 % 2;
        this.ShareDataUIState = str;
        if (i4 != 0) {
            int i5 = 67 / 0;
        }
        int i6 = i2 + 5;
        copy = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = 1 + 81;
        getAsAtTimestamp = i % 128;
        int i2 = i % 2;
    }

    public OrderInfoRequest() {
        this(null, null, null, null, null, 31, null);
    }

    public static OrderInfoRequest copy$default(OrderInfoRequest orderInfoRequest, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copy + 109;
        component4 = i3 % 128;
        if (i3 % 2 != 0 && (i & 1) != 0) {
            str = orderInfoRequest.component2;
        }
        String str6 = str;
        if ((i & 2) != 0) {
            str2 = orderInfoRequest.copydefault;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = orderInfoRequest.component1;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = orderInfoRequest.component3;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = orderInfoRequest.ShareDataUIState;
        }
        OrderInfoRequest orderInfoRequestCopy = orderInfoRequest.copy(str6, str7, str8, str9, str5);
        int i4 = copy + 41;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return orderInfoRequestCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 55;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component2;
        int i5 = i2 + 11;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 69;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copydefault;
        int i5 = i2 + 73;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component4 + 95;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        String str = this.component1;
        int i5 = i3 + 9;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 39;
        copy = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.component3;
        int i4 = i2 + 49;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = copy + 119;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        String str = this.ShareDataUIState;
        int i5 = i3 + 115;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final OrderInfoRequest copy(String requestType, String requestMoneyOrderId, String orderStatus, String startPage, String pageLimit) {
        int i = 2 % 2;
        OrderInfoRequest orderInfoRequest = new OrderInfoRequest(requestType, requestMoneyOrderId, orderStatus, startPage, pageLimit);
        int i2 = copy + 109;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        return orderInfoRequest;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderInfoRequest)) {
            int i2 = copy + 115;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        OrderInfoRequest orderInfoRequest = (OrderInfoRequest) other;
        if (!Intrinsics.areEqual(this.component2, orderInfoRequest.component2) || !Intrinsics.areEqual(this.copydefault, orderInfoRequest.copydefault)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.component1, orderInfoRequest.component1)) {
            int i4 = copy + 11;
            component4 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.component3, orderInfoRequest.component3)) {
            int i6 = component4 + 29;
            copy = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.ShareDataUIState, orderInfoRequest.ShareDataUIState)) {
            return true;
        }
        int i8 = copy + 23;
        component4 = i8 % 128;
        return i8 % 2 == 0;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.component2;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.copydefault;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.component1;
        if (str3 == null) {
            int i2 = copy + 125;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str3.hashCode();
            int i4 = component4 + 49;
            copy = i4 % 128;
            int i5 = i4 % 2;
        }
        String str4 = this.component3;
        if (str4 == null) {
            int i6 = copy + 41;
            component4 = i6 % 128;
            int i7 = i6 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str4.hashCode();
        }
        String str5 = this.ShareDataUIState;
        return (((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode2) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "OrderInfoRequest(requestType=" + this.component2 + ", requestMoneyOrderId=" + this.copydefault + ", orderStatus=" + this.component1 + ", startPage=" + this.component3 + ", pageLimit=" + this.ShareDataUIState + ")";
        int i2 = component4 + 109;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
