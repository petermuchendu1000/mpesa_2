package com.huawei.digitalpayment.consumer.sfcui.sendmany.data;

import com.huawei.digitalpayment.checkout.resp.OrderDetailsBean;
import com.huawei.http.BaseResp;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001BS\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sendmany/data/QueryPayOrderResp;", "Lcom/huawei/http/BaseResp;", "orderDetails", "", "Lcom/huawei/digitalpayment/checkout/resp/OrderDetailsBean;", "feeAmountDisplay", "", "originalAmountDisplay", "result", "unit", "actualAmountDisplay", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOrderDetails", "()Ljava/util/List;", "setOrderDetails", "(Ljava/util/List;)V", "getFeeAmountDisplay", "()Ljava/lang/String;", "setFeeAmountDisplay", "(Ljava/lang/String;)V", "getOriginalAmountDisplay", "setOriginalAmountDisplay", "getResult", "setResult", "getUnit", "setUnit", "getActualAmountDisplay", "setActualAmountDisplay", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class QueryPayOrderResp extends BaseResp {
    public static final int $stable = 8;
    private static int ShareDataUIState = 1;
    private static int component1 = 61 % 128;
    private static int component3;
    private static int copydefault;
    private String actualAmountDisplay;
    private String feeAmountDisplay;
    private List<OrderDetailsBean> orderDetails;
    private String originalAmountDisplay;
    private String result;
    private String unit;

    public QueryPayOrderResp(List list, String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        ArrayList arrayList;
        String str6;
        String str7;
        String str8;
        if ((i & 1) != 0) {
            arrayList = new ArrayList();
            int i2 = component3 + 85;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        } else {
            arrayList = list;
        }
        if ((i & 2) != 0) {
            int i5 = ShareDataUIState + 101;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            int i6 = 2 % 2;
            str6 = "0";
        } else {
            str6 = str;
        }
        String str9 = "";
        if ((i & 4) != 0) {
            int i7 = component3 + 73;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            str7 = "";
        } else {
            str7 = str2;
        }
        if ((i & 8) != 0) {
            int i10 = ShareDataUIState + 29;
            component3 = i10 % 128;
            int i11 = i10 % 2;
            str8 = "";
        } else {
            str8 = str3;
        }
        String str10 = (i & 16) != 0 ? "" : str4;
        if ((i & 32) != 0) {
            int i12 = component3 + 49;
            ShareDataUIState = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
        } else {
            str9 = str5;
        }
        this(arrayList, str6, str7, str8, str10, str9);
    }

    public final List<OrderDetailsBean> getOrderDetails() {
        int i = 2 % 2;
        int i2 = component3 + 67;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        List<OrderDetailsBean> list = this.orderDetails;
        int i5 = i3 + 9;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setOrderDetails(List<OrderDetailsBean> list) {
        int i = 2 % 2;
        int i2 = component3 + 33;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(list, "");
            this.orderDetails = list;
        } else {
            Intrinsics.checkNotNullParameter(list, "");
            this.orderDetails = list;
            throw null;
        }
    }

    public final String getFeeAmountDisplay() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 99;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.feeAmountDisplay;
        int i5 = i2 + 13;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setFeeAmountDisplay(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 7;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        this.feeAmountDisplay = str;
        if (i4 != 0) {
            int i5 = 8 / 0;
        }
        int i6 = i3 + 103;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
    }

    public final String getOriginalAmountDisplay() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 89;
        int i3 = i2 % 128;
        component3 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.originalAmountDisplay;
        int i4 = i3 + 91;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final void setOriginalAmountDisplay(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 29;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        this.originalAmountDisplay = str;
        if (i3 != 0) {
            throw null;
        }
    }

    public final String getResult() {
        int i = 2 % 2;
        int i2 = component3 + 37;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.result;
        if (i3 == 0) {
            int i4 = 98 / 0;
        }
        return str;
    }

    public final void setResult(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 41;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.result = str;
        int i5 = i2 + 101;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getUnit() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 73;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.unit;
        int i4 = i2 + 115;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final void setUnit(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 57;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        this.unit = str;
        if (i3 != 0) {
            int i4 = 25 / 0;
        }
    }

    public final String getActualAmountDisplay() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 101;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.actualAmountDisplay;
        int i5 = i2 + 33;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setActualAmountDisplay(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 41;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        this.actualAmountDisplay = str;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public QueryPayOrderResp(List<OrderDetailsBean> list, String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(list, "");
        this.orderDetails = list;
        this.feeAmountDisplay = str;
        this.originalAmountDisplay = str2;
        this.result = str3;
        this.unit = str4;
        this.actualAmountDisplay = str5;
    }

    static {
        if (61 % 2 == 0) {
            throw null;
        }
    }

    public QueryPayOrderResp() {
        this(null, null, null, null, null, null, 63, null);
    }
}
