package com.huawei.digitalpayment.consumer.sfcui.requestmoney.data;

import android.text.TextUtils;
import com.blankj.utilcode.util.CollectionUtils;
import com.huawei.http.BaseResp;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÇ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H×\u0003J\t\u0010\u001a\u001a\u00020\u001bH×\u0001J\t\u0010\u001c\u001a\u00020\u0012H×\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/requestmoney/data/CreateOrderResp;", "Lcom/huawei/http/BaseResp;", "requestMoneyOrderInfo", "Lcom/huawei/digitalpayment/consumer/sfcui/requestmoney/data/RequestMoneyOrderInfo;", "displayItems", "", "Lcom/huawei/digitalpayment/consumer/sfcui/requestmoney/data/ConfigDisplayItemResp;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/requestmoney/data/RequestMoneyOrderInfo;Ljava/util/List;)V", "getRequestMoneyOrderInfo", "()Lcom/huawei/digitalpayment/consumer/sfcui/requestmoney/data/RequestMoneyOrderInfo;", "setRequestMoneyOrderInfo", "(Lcom/huawei/digitalpayment/consumer/sfcui/requestmoney/data/RequestMoneyOrderInfo;)V", "getDisplayItems", "()Ljava/util/List;", "setDisplayItems", "(Ljava/util/List;)V", "getAmount", "", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CreateOrderResp extends BaseResp {
    public static final int $stable = 8;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 1;
    private static int copydefault;
    private List<ConfigDisplayItemResp> displayItems;
    private RequestMoneyOrderInfo requestMoneyOrderInfo;

    /* JADX WARN: Illegal instructions before constructor call */
    public CreateOrderResp(RequestMoneyOrderInfo requestMoneyOrderInfo, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = copydefault + 59;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            requestMoneyOrderInfo = null;
        }
        if ((i & 2) != 0) {
            int i5 = component2 + 83;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            list = null;
        }
        this(requestMoneyOrderInfo, list);
    }

    public final RequestMoneyOrderInfo getRequestMoneyOrderInfo() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 117;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        RequestMoneyOrderInfo requestMoneyOrderInfo = this.requestMoneyOrderInfo;
        int i5 = i2 + 5;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return requestMoneyOrderInfo;
    }

    public final void setRequestMoneyOrderInfo(RequestMoneyOrderInfo requestMoneyOrderInfo) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 77;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.requestMoneyOrderInfo = requestMoneyOrderInfo;
        int i5 = i2 + 21;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final List<ConfigDisplayItemResp> getDisplayItems() {
        int i = 2 % 2;
        int i2 = component2 + 41;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.displayItems;
        }
        throw null;
    }

    public final void setDisplayItems(List<ConfigDisplayItemResp> list) {
        int i = 2 % 2;
        int i2 = component2 + 81;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.displayItems = list;
        if (i3 != 0) {
            int i4 = 48 / 0;
        }
    }

    public CreateOrderResp(RequestMoneyOrderInfo requestMoneyOrderInfo, List<ConfigDisplayItemResp> list) {
        this.requestMoneyOrderInfo = requestMoneyOrderInfo;
        this.displayItems = list;
    }

    public final String getAmount() {
        int i = 2 % 2;
        if (CollectionUtils.isEmpty(this.displayItems)) {
            return "";
        }
        List<ConfigDisplayItemResp> list = this.displayItems;
        Intrinsics.checkNotNull(list);
        int i2 = copydefault + 93;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        for (ConfigDisplayItemResp configDisplayItemResp : list) {
            int i4 = copydefault + 5;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            if (TextUtils.equals(configDisplayItemResp.getKey(), "RequestAmount")) {
                return configDisplayItemResp.getValue();
            }
        }
        return "";
    }

    static {
        int i = 1 + 99;
        component1 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CreateOrderResp() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static CreateOrderResp copy$default(CreateOrderResp createOrderResp, RequestMoneyOrderInfo requestMoneyOrderInfo, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault + 7;
        int i4 = i3 % 128;
        component2 = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 35;
            copydefault = i6 % 128;
            if (i6 % 2 != 0) {
                RequestMoneyOrderInfo requestMoneyOrderInfo2 = createOrderResp.requestMoneyOrderInfo;
                throw null;
            }
            requestMoneyOrderInfo = createOrderResp.requestMoneyOrderInfo;
        }
        if ((i & 2) != 0) {
            list = createOrderResp.displayItems;
        }
        CreateOrderResp createOrderRespCopy = createOrderResp.copy(requestMoneyOrderInfo, list);
        int i7 = component2 + 111;
        copydefault = i7 % 128;
        if (i7 % 2 == 0) {
            return createOrderRespCopy;
        }
        throw null;
    }

    public final RequestMoneyOrderInfo component1() {
        RequestMoneyOrderInfo requestMoneyOrderInfo;
        int i = 2 % 2;
        int i2 = component2 + 97;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            requestMoneyOrderInfo = this.requestMoneyOrderInfo;
            int i4 = 6 / 0;
        } else {
            requestMoneyOrderInfo = this.requestMoneyOrderInfo;
        }
        int i5 = i3 + 97;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return requestMoneyOrderInfo;
    }

    public final List<ConfigDisplayItemResp> component2() {
        int i = 2 % 2;
        int i2 = component2 + 69;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.displayItems;
        }
        throw null;
    }

    public final CreateOrderResp copy(RequestMoneyOrderInfo requestMoneyOrderInfo, List<ConfigDisplayItemResp> displayItems) {
        int i = 2 % 2;
        CreateOrderResp createOrderResp = new CreateOrderResp(requestMoneyOrderInfo, displayItems);
        int i2 = component2 + 11;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return createOrderResp;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component2 + 13;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        if (this == other) {
            int i5 = i3 + 1;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof CreateOrderResp)) {
            return false;
        }
        CreateOrderResp createOrderResp = (CreateOrderResp) other;
        if (!Intrinsics.areEqual(this.requestMoneyOrderInfo, createOrderResp.requestMoneyOrderInfo)) {
            int i7 = copydefault + 67;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.displayItems, createOrderResp.displayItems)) {
            return true;
        }
        int i9 = copydefault + 25;
        component2 = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        RequestMoneyOrderInfo requestMoneyOrderInfo;
        int i = 2 % 2;
        int i2 = copydefault + 69;
        component2 = i2 % 128;
        int iHashCode = 0;
        int iHashCode2 = (i2 % 2 != 0 ? (requestMoneyOrderInfo = this.requestMoneyOrderInfo) != null : (requestMoneyOrderInfo = this.requestMoneyOrderInfo) != null) ? requestMoneyOrderInfo.hashCode() : 0;
        List<ConfigDisplayItemResp> list = this.displayItems;
        if (list != null) {
            iHashCode = list.hashCode();
            int i3 = component2 + 99;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CreateOrderResp(requestMoneyOrderInfo=" + this.requestMoneyOrderInfo + ", displayItems=" + this.displayItems + ")";
        int i2 = component2 + 37;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 25 / 0;
        }
        return str;
    }
}
