package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import com.alibaba.ariver.commonability.device.jsapi.system.field.group.DeviceInfoFieldGroup;
import com.google.gson.annotations.SerializedName;
import com.iap.ac.android.acs.operation.log.LogConstants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÇ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH×\u0003J\t\u0010\u001f\u001a\u00020\tH×\u0001J\t\u0010 \u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/PricesResp;", "Ljava/io/Serializable;", DeviceInfoFieldGroup.FIELD_MODEL, "", "priceDisplay", "finalPrice", "priceId", "operatorShortCode", "order", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getModel", "()Ljava/lang/String;", "getPriceDisplay", "getFinalPrice", "getPriceId", "getOperatorShortCode", "getOrder", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PricesResp implements Serializable {
    public static final int $stable = 0;
    private static int ShareDataUIState = 53 % 128;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int copydefault = 1;
    private final String finalPrice;

    @SerializedName(LogConstants.Oauth.MODE)
    private final String model;
    private final String operatorShortCode;
    private final int order;
    private final String priceDisplay;
    private final String priceId;

    public PricesResp(String str, String str2, String str3, String str4, String str5, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.model = str;
        this.priceDisplay = str2;
        this.finalPrice = str3;
        this.priceId = str4;
        this.operatorShortCode = str5;
        this.order = i;
    }

    public final String getModel() {
        int i = 2 % 2;
        int i2 = component2 + 69;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.model;
        int i5 = i3 + 91;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getPriceDisplay() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 15;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.priceDisplay;
        int i5 = i2 + 105;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 42 / 0;
        }
        return str;
    }

    public final String getFinalPrice() {
        int i = 2 % 2;
        int i2 = copydefault + 117;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.finalPrice;
        int i5 = i3 + 35;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getPriceId() {
        int i = 2 % 2;
        int i2 = component2 + 51;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.priceId;
        int i5 = i3 + 23;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getOperatorShortCode() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault + 69;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            str = this.operatorShortCode;
            int i4 = 25 / 0;
        } else {
            str = this.operatorShortCode;
        }
        int i5 = i3 + 49;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final int getOrder() {
        int i = 2 % 2;
        int i2 = copydefault + 105;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.order;
        if (i3 != 0) {
            int i5 = 5 / 0;
        }
        return i4;
    }

    static {
        if (53 % 2 == 0) {
            int i = 10 / 0;
        }
    }

    public static PricesResp copy$default(PricesResp pricesResp, String str, String str2, String str3, String str4, String str5, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            str = pricesResp.model;
        }
        String str6 = str;
        if ((i2 & 2) != 0) {
            str2 = pricesResp.priceDisplay;
        }
        String str7 = str2;
        if ((i2 & 4) != 0) {
            int i4 = copydefault + 75;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                String str8 = pricesResp.finalPrice;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str3 = pricesResp.finalPrice;
        }
        String str9 = str3;
        if ((i2 & 8) != 0) {
            str4 = pricesResp.priceId;
            int i5 = component2 + 5;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
        }
        String str10 = str4;
        if ((i2 & 16) != 0) {
            int i7 = component2 + 41;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
            str5 = pricesResp.operatorShortCode;
            if (i8 == 0) {
                int i9 = 48 / 0;
            }
        }
        String str11 = str5;
        if ((i2 & 32) != 0) {
            int i10 = component2 + 25;
            copydefault = i10 % 128;
            int i11 = i10 % 2;
            i = pricesResp.order;
        }
        return pricesResp.copy(str6, str7, str9, str10, str11, i);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 1;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.model;
        int i4 = i3 + 57;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 31 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2 + 73;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.priceDisplay;
        if (i3 == 0) {
            int i4 = 63 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 19;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.finalPrice;
        int i5 = i2 + 63;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = copydefault + 17;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.priceId;
        int i4 = i3 + 51;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 63 / 0;
        }
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component2 + 95;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.operatorShortCode;
        int i4 = i3 + 19;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final int component6() {
        int i = 2 % 2;
        int i2 = component2 + 81;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.order;
        }
        throw null;
    }

    public final PricesResp copy(String model, String priceDisplay, String finalPrice, String priceId, String operatorShortCode, int order) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(model, "");
        Intrinsics.checkNotNullParameter(priceDisplay, "");
        Intrinsics.checkNotNullParameter(finalPrice, "");
        Intrinsics.checkNotNullParameter(priceId, "");
        Intrinsics.checkNotNullParameter(operatorShortCode, "");
        PricesResp pricesResp = new PricesResp(model, priceDisplay, finalPrice, priceId, operatorShortCode, order);
        int i2 = component2 + 59;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return pricesResp;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof PricesResp)) {
            return false;
        }
        PricesResp pricesResp = (PricesResp) other;
        if (!Intrinsics.areEqual(this.model, pricesResp.model)) {
            int i2 = component2 + 77;
            copydefault = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.priceDisplay, pricesResp.priceDisplay)) {
            int i3 = copydefault + 119;
            int i4 = i3 % 128;
            component2 = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 105;
            copydefault = i6 % 128;
            if (i6 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.finalPrice, pricesResp.finalPrice)) {
            int i7 = copydefault + 101;
            component2 = i7 % 128;
            if (i7 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.priceId, pricesResp.priceId) || !Intrinsics.areEqual(this.operatorShortCode, pricesResp.operatorShortCode) || this.order != pricesResp.order) {
            return false;
        }
        int i8 = component2 + 111;
        copydefault = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 53 / 0;
        }
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 27;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((this.model.hashCode() * 31) + this.priceDisplay.hashCode()) * 31) + this.finalPrice.hashCode()) * 31) + this.priceId.hashCode()) * 31) + this.operatorShortCode.hashCode()) * 31) + Integer.hashCode(this.order);
        int i4 = component2 + 7;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PricesResp(model=" + this.model + ", priceDisplay=" + this.priceDisplay + ", finalPrice=" + this.finalPrice + ", priceId=" + this.priceId + ", operatorShortCode=" + this.operatorShortCode + ", order=" + this.order + ")";
        int i2 = copydefault + 121;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
