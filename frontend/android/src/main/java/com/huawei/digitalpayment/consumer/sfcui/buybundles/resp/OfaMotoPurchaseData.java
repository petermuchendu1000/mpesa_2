package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\r\u001a\u00020\u0003H×\u0001J\t\u0010\u000e\u001a\u00020\u000fH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/OfaMotoPurchaseData;", "", "tunukiwaPurchaseCurrency", "", "<init>", "(I)V", "getTunukiwaPurchaseCurrency", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OfaMotoPurchaseData {
    public static final int $stable = 0;
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3;
    private final int copydefault;

    public OfaMotoPurchaseData(int i) {
        this.copydefault = i;
    }

    public final int getTunukiwaPurchaseCurrency() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 67;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = this.copydefault;
        int i5 = i2 + 41;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 25 / 0;
        }
        return i4;
    }

    static {
        int i = 1 + 63;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public static OfaMotoPurchaseData copy$default(OfaMotoPurchaseData ofaMotoPurchaseData, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = ShareDataUIState;
        int i5 = i4 + 81;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        if ((i2 & 1) != 0) {
            int i7 = i4 + 119;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            i = ofaMotoPurchaseData.copydefault;
        }
        return ofaMotoPurchaseData.copy(i);
    }

    public final int component1() {
        int i = 2 % 2;
        int i2 = component3 + 51;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.copydefault;
        }
        throw null;
    }

    public final OfaMotoPurchaseData copy(int tunukiwaPurchaseCurrency) {
        int i = 2 % 2;
        OfaMotoPurchaseData ofaMotoPurchaseData = new OfaMotoPurchaseData(tunukiwaPurchaseCurrency);
        int i2 = component3 + 81;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return ofaMotoPurchaseData;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = ShareDataUIState + 117;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(!(other instanceof OfaMotoPurchaseData))) {
            return this.copydefault == ((OfaMotoPurchaseData) other).copydefault;
        }
        int i4 = component3 + 49;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 27;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(this.copydefault);
        int i4 = component3 + 75;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 81 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "OfaMotoPurchaseData(tunukiwaPurchaseCurrency=" + this.copydefault + ")";
        int i2 = ShareDataUIState + 5;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 51 / 0;
        }
        return str;
    }
}
