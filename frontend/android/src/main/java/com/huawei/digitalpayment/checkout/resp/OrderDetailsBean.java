package com.huawei.digitalpayment.checkout.resp;

import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H×\u0003J\t\u0010$\u001a\u00020%H×\u0001J\t\u0010&\u001a\u00020\u0003H×\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000e¨\u0006'"}, d2 = {"Lcom/huawei/digitalpayment/checkout/resp/OrderDetailsBean;", "Lcom/huawei/http/BaseResp;", KeysConstants.PREPAY_ID, "", "msisdn", "nameDisplay", "amountDisplay", "orderStatus", "transId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPrepayId", "()Ljava/lang/String;", "setPrepayId", "(Ljava/lang/String;)V", "getMsisdn", "setMsisdn", "getNameDisplay", "setNameDisplay", "getAmountDisplay", "setAmountDisplay", "getOrderStatus", "setOrderStatus", "getTransId", "setTransId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerCheckOutUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OrderDetailsBean extends BaseResp {
    public static final int $stable = 8;
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 123 % 128;
    private static int component3;
    private String amountDisplay;
    private String msisdn;
    private String nameDisplay;
    private String orderStatus;
    private String prepayId;
    private String transId;

    /* JADX WARN: Illegal instructions before constructor call */
    public OrderDetailsBean(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str7;
        String str8;
        String str9;
        String str10;
        String str11 = (i & 1) != 0 ? "" : str;
        if ((i & 2) != 0) {
            int i2 = 2 % 2;
            str7 = "";
        } else {
            str7 = str2;
        }
        if ((i & 4) != 0) {
            int i3 = ShareDataUIState + 77;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            str8 = "";
        } else {
            str8 = str3;
        }
        Object obj = null;
        if ((i & 8) != 0) {
            int i6 = ShareDataUIState + 81;
            component3 = i6 % 128;
            if (i6 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            str9 = "";
        } else {
            str9 = str4;
        }
        String str12 = (i & 16) != 0 ? "" : str5;
        if ((i & 32) != 0) {
            int i7 = ShareDataUIState + 47;
            component3 = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
            int i8 = 2 % 2;
            str10 = "";
        } else {
            str10 = str6;
        }
        this(str11, str7, str8, str9, str12, str10);
    }

    public final String getPrepayId() {
        String str;
        int i = 2 % 2;
        int i2 = component3 + 45;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            str = this.prepayId;
            int i4 = 0 / 0;
        } else {
            str = this.prepayId;
        }
        int i5 = i3 + 119;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setPrepayId(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 93;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        this.prepayId = str;
        int i5 = i3 + 69;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 85;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.msisdn;
        int i5 = i2 + 125;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 29 / 0;
        }
        return str;
    }

    public final void setMsisdn(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 55;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.msisdn = str;
        int i5 = i2 + 99;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 88 / 0;
        }
    }

    public final String getNameDisplay() {
        int i = 2 % 2;
        int i2 = component3 + 101;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.nameDisplay;
        int i4 = i3 + 123;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final void setNameDisplay(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 9;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        this.nameDisplay = str;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getAmountDisplay() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 1;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.amountDisplay;
        int i5 = i3 + 49;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setAmountDisplay(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 87;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.amountDisplay = str;
        int i5 = i2 + 123;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final String getOrderStatus() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 111;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.orderStatus;
        if (i3 != 0) {
            int i4 = 69 / 0;
        }
        return str;
    }

    public final void setOrderStatus(String str) {
        int i = 2 % 2;
        int i2 = component3 + 47;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        this.orderStatus = str;
        if (i3 == 0) {
            throw null;
        }
    }

    public final String getTransId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 83;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.transId;
        int i5 = i2 + 21;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setTransId(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 123;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        this.transId = str;
        if (i3 != 0) {
            throw null;
        }
    }

    public OrderDetailsBean(String str, String str2, String str3, String str4, String str5, String str6) {
        this.prepayId = str;
        this.msisdn = str2;
        this.nameDisplay = str3;
        this.amountDisplay = str4;
        this.orderStatus = str5;
        this.transId = str6;
    }

    static {
        int i = 123 % 2;
    }

    public OrderDetailsBean() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static OrderDetailsBean copy$default(OrderDetailsBean orderDetailsBean, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        String str7;
        String str8;
        int i2 = 2 % 2;
        int i3 = component3;
        int i4 = i3 + 71;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        String str9 = (i & 1) != 0 ? orderDetailsBean.prepayId : str;
        if ((i & 2) != 0) {
            str7 = orderDetailsBean.msisdn;
            int i6 = i3 + 105;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
        } else {
            str7 = str2;
        }
        if ((i & 4) != 0) {
            str8 = orderDetailsBean.nameDisplay;
            int i8 = i3 + 3;
            ShareDataUIState = i8 % 128;
            int i9 = i8 % 2;
        } else {
            str8 = str3;
        }
        return orderDetailsBean.copy(str9, str7, str8, (i & 8) != 0 ? orderDetailsBean.amountDisplay : str4, (i & 16) != 0 ? orderDetailsBean.orderStatus : str5, (i & 32) != 0 ? orderDetailsBean.transId : str6);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3 + 61;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.prepayId;
        int i5 = i3 + 97;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 53;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.msisdn;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 41;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            str = this.nameDisplay;
            int i4 = 39 / 0;
        } else {
            str = this.nameDisplay;
        }
        int i5 = i3 + 71;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component3 + 87;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.amountDisplay;
        int i5 = i3 + 31;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 91;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.orderStatus;
        int i5 = i3 + 41;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 93;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.transId;
        int i4 = i2 + 83;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 10 / 0;
        }
        return str;
    }

    public final OrderDetailsBean copy(String prepayId, String msisdn, String nameDisplay, String amountDisplay, String orderStatus, String transId) {
        int i = 2 % 2;
        OrderDetailsBean orderDetailsBean = new OrderDetailsBean(prepayId, msisdn, nameDisplay, amountDisplay, orderStatus, transId);
        int i2 = ShareDataUIState + 47;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 33 / 0;
        }
        return orderDetailsBean;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 53;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            int i5 = i2 + 91;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 17 / 0;
            }
            return true;
        }
        if (!(other instanceof OrderDetailsBean)) {
            return false;
        }
        OrderDetailsBean orderDetailsBean = (OrderDetailsBean) other;
        if (!Intrinsics.areEqual(this.prepayId, orderDetailsBean.prepayId) || !Intrinsics.areEqual(this.msisdn, orderDetailsBean.msisdn) || !Intrinsics.areEqual(this.nameDisplay, orderDetailsBean.nameDisplay)) {
            return false;
        }
        if (Intrinsics.areEqual(this.amountDisplay, orderDetailsBean.amountDisplay)) {
            return Intrinsics.areEqual(this.orderStatus, orderDetailsBean.orderStatus) && Intrinsics.areEqual(this.transId, orderDetailsBean.transId);
        }
        int i7 = ShareDataUIState + 89;
        component3 = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.prepayId;
        if (str == null) {
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i2 = component3 + 99;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
        }
        String str2 = this.msisdn;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.nameDisplay;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.amountDisplay;
        if (str4 == null) {
            int i4 = component3 + 19;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str4.hashCode();
            int i6 = component3 + 87;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
        }
        String str5 = this.orderStatus;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.transId;
        return (((((((((iHashCode * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode2) * 31) + iHashCode5) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "OrderDetailsBean(prepayId=" + this.prepayId + ", msisdn=" + this.msisdn + ", nameDisplay=" + this.nameDisplay + ", amountDisplay=" + this.amountDisplay + ", orderStatus=" + this.orderStatus + ", transId=" + this.transId + ")";
        int i2 = component3 + 67;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
