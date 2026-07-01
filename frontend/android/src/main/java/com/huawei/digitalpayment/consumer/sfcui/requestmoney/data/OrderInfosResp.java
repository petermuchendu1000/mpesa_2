package com.huawei.digitalpayment.consumer.sfcui.requestmoney.data;

import com.huawei.http.BaseResp;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0003HÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H×\u0003J\t\u0010#\u001a\u00020$H×\u0001J\t\u0010%\u001a\u00020\u0006H×\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000f¨\u0006&"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/requestmoney/data/OrderInfosResp;", "Lcom/huawei/http/BaseResp;", "requestMoneyOrderInfos", "", "Lcom/huawei/digitalpayment/consumer/sfcui/requestmoney/data/RequestMoneyOrderInfo;", "totalCount", "", "requestMoneyOrderInfo", "displayItems", "Lcom/huawei/digitalpayment/consumer/sfcui/requestmoney/data/ConfigDisplayItemResp;", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/sfcui/requestmoney/data/RequestMoneyOrderInfo;Ljava/util/List;)V", "getRequestMoneyOrderInfos", "()Ljava/util/List;", "setRequestMoneyOrderInfos", "(Ljava/util/List;)V", "getTotalCount", "()Ljava/lang/String;", "setTotalCount", "(Ljava/lang/String;)V", "getRequestMoneyOrderInfo", "()Lcom/huawei/digitalpayment/consumer/sfcui/requestmoney/data/RequestMoneyOrderInfo;", "setRequestMoneyOrderInfo", "(Lcom/huawei/digitalpayment/consumer/sfcui/requestmoney/data/RequestMoneyOrderInfo;)V", "getDisplayItems", "setDisplayItems", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OrderInfosResp extends BaseResp {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component3 = 1;
    private static int copydefault;
    private List<ConfigDisplayItemResp> displayItems;
    private RequestMoneyOrderInfo requestMoneyOrderInfo;
    private List<RequestMoneyOrderInfo> requestMoneyOrderInfos;
    private String totalCount;

    /* JADX WARN: Illegal instructions before constructor call */
    public OrderInfosResp(List list, String str, RequestMoneyOrderInfo requestMoneyOrderInfo, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Object obj = null;
        list = (i & 1) != 0 ? null : list;
        if ((i & 2) != 0) {
            int i2 = component3 + 51;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i3 = 2 % 2;
            str = "0";
        }
        if ((i & 4) != 0) {
            int i4 = ShareDataUIState + 119;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
            requestMoneyOrderInfo = null;
        }
        if ((i & 8) != 0) {
            int i6 = component3 + 57;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            list2 = null;
        }
        this(list, str, requestMoneyOrderInfo, list2);
    }

    public final List<RequestMoneyOrderInfo> getRequestMoneyOrderInfos() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 35;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        List<RequestMoneyOrderInfo> list = this.requestMoneyOrderInfos;
        int i5 = i3 + 35;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setRequestMoneyOrderInfos(List<RequestMoneyOrderInfo> list) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 7;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.requestMoneyOrderInfos = list;
        int i5 = i2 + 85;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 54 / 0;
        }
    }

    public final String getTotalCount() {
        int i = 2 % 2;
        int i2 = component3 + 1;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.totalCount;
        int i5 = i3 + 57;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setTotalCount(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 27;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.totalCount = str;
        int i5 = i2 + 51;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final RequestMoneyOrderInfo getRequestMoneyOrderInfo() {
        RequestMoneyOrderInfo requestMoneyOrderInfo;
        int i = 2 % 2;
        int i2 = component3 + 39;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            requestMoneyOrderInfo = this.requestMoneyOrderInfo;
            int i4 = 30 / 0;
        } else {
            requestMoneyOrderInfo = this.requestMoneyOrderInfo;
        }
        int i5 = i3 + 19;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return requestMoneyOrderInfo;
    }

    public final void setRequestMoneyOrderInfo(RequestMoneyOrderInfo requestMoneyOrderInfo) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 33;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.requestMoneyOrderInfo = requestMoneyOrderInfo;
        int i5 = i2 + 119;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final List<ConfigDisplayItemResp> getDisplayItems() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 89;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        List<ConfigDisplayItemResp> list = this.displayItems;
        int i5 = i2 + 43;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public final void setDisplayItems(List<ConfigDisplayItemResp> list) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 63;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.displayItems = list;
        int i5 = i2 + 67;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public OrderInfosResp(List<RequestMoneyOrderInfo> list, String str, RequestMoneyOrderInfo requestMoneyOrderInfo, List<ConfigDisplayItemResp> list2) {
        this.requestMoneyOrderInfos = list;
        this.totalCount = str;
        this.requestMoneyOrderInfo = requestMoneyOrderInfo;
        this.displayItems = list2;
    }

    static {
        int i = 1 + 105;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public OrderInfosResp() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static OrderInfosResp copy$default(OrderInfosResp orderInfosResp, List list, String str, RequestMoneyOrderInfo requestMoneyOrderInfo, List list2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component3 + 65;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                List<RequestMoneyOrderInfo> list3 = orderInfosResp.requestMoneyOrderInfos;
                throw null;
            }
            list = orderInfosResp.requestMoneyOrderInfos;
        }
        if ((i & 2) != 0) {
            int i4 = component3 + 55;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            str = orderInfosResp.totalCount;
        }
        if ((i & 4) != 0) {
            requestMoneyOrderInfo = orderInfosResp.requestMoneyOrderInfo;
        }
        if ((i & 8) != 0) {
            list2 = orderInfosResp.displayItems;
        }
        return orderInfosResp.copy(list, str, requestMoneyOrderInfo, list2);
    }

    public final List<RequestMoneyOrderInfo> component1() {
        int i = 2 % 2;
        int i2 = component3 + 49;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<RequestMoneyOrderInfo> list = this.requestMoneyOrderInfos;
        int i4 = i3 + 35;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 43;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.totalCount;
        if (i3 == 0) {
            int i4 = 45 / 0;
        }
        return str;
    }

    public final RequestMoneyOrderInfo component3() {
        int i = 2 % 2;
        int i2 = component3 + 107;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        RequestMoneyOrderInfo requestMoneyOrderInfo = this.requestMoneyOrderInfo;
        int i5 = i3 + 123;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return requestMoneyOrderInfo;
    }

    public final List<ConfigDisplayItemResp> component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 89;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.displayItems;
        }
        throw null;
    }

    public final OrderInfosResp copy(List<RequestMoneyOrderInfo> requestMoneyOrderInfos, String totalCount, RequestMoneyOrderInfo requestMoneyOrderInfo, List<ConfigDisplayItemResp> displayItems) {
        int i = 2 % 2;
        OrderInfosResp orderInfosResp = new OrderInfosResp(requestMoneyOrderInfos, totalCount, requestMoneyOrderInfo, displayItems);
        int i2 = ShareDataUIState + 19;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return orderInfosResp;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component3 + 31;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof OrderInfosResp)) {
            return false;
        }
        OrderInfosResp orderInfosResp = (OrderInfosResp) other;
        if (!Intrinsics.areEqual(this.requestMoneyOrderInfos, orderInfosResp.requestMoneyOrderInfos) || !Intrinsics.areEqual(this.totalCount, orderInfosResp.totalCount)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.requestMoneyOrderInfo, orderInfosResp.requestMoneyOrderInfo)) {
            int i4 = ShareDataUIState + 73;
            component3 = i4 % 128;
            return i4 % 2 == 0;
        }
        if (!(!Intrinsics.areEqual(this.displayItems, orderInfosResp.displayItems))) {
            return true;
        }
        int i5 = component3 + 115;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        List<RequestMoneyOrderInfo> list;
        int iHashCode;
        int i;
        int iHashCode2;
        int iHashCode3;
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 117;
        component3 = i3 % 128;
        int iHashCode4 = 1;
        if (i3 % 2 == 0) {
            list = this.requestMoneyOrderInfos;
            if (list == null) {
                i = 1;
                iHashCode = i;
                iHashCode2 = 0;
            } else {
                iHashCode = 1;
                iHashCode2 = list.hashCode();
            }
        } else {
            list = this.requestMoneyOrderInfos;
            if (list == null) {
                i = 0;
                iHashCode = i;
                iHashCode2 = 0;
            } else {
                iHashCode = 0;
                iHashCode2 = list.hashCode();
            }
        }
        String str = this.totalCount;
        if (str == null) {
            int i4 = ShareDataUIState + 111;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str.hashCode();
        }
        RequestMoneyOrderInfo requestMoneyOrderInfo = this.requestMoneyOrderInfo;
        if (requestMoneyOrderInfo == null) {
            int i6 = ShareDataUIState + 115;
            component3 = i6 % 128;
            if (i6 % 2 != 0) {
                iHashCode4 = 0;
            }
        } else {
            iHashCode4 = requestMoneyOrderInfo.hashCode();
        }
        List<ConfigDisplayItemResp> list2 = this.displayItems;
        if (list2 == null) {
            int i7 = component3 + 87;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
        } else {
            iHashCode = list2.hashCode();
        }
        return (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "OrderInfosResp(requestMoneyOrderInfos=" + this.requestMoneyOrderInfos + ", totalCount=" + this.totalCount + ", requestMoneyOrderInfo=" + this.requestMoneyOrderInfo + ", displayItems=" + this.displayItems + ")";
        int i2 = ShareDataUIState + 117;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
