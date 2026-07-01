package com.huawei.digitalpayment.consumer.sfcui.bonga.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\r\u001a\u00020\u0003H×\u0001J\t\u0010\u000e\u001a\u00020\u000fH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/model/BongaConversionType;", "", "displayNameRes", "", "<init>", "(I)V", "getDisplayNameRes", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BongaConversionType {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component1 = 85 % 128;
    private static int component3 = 1;
    private static int copydefault;
    private final int component2;

    public BongaConversionType(int i) {
        this.component2 = i;
    }

    public final int getDisplayNameRes() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 105;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        int i5 = this.component2;
        int i6 = i3 + 37;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = 85 % 2;
    }

    public static BongaConversionType copy$default(BongaConversionType bongaConversionType, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = ShareDataUIState;
        int i5 = i4 + 43;
        component3 = i5 % 128;
        int i6 = i2 & 1;
        if (i5 % 2 != 0 ? i6 != 0 : i6 != 0) {
            int i7 = i4 + 93;
            component3 = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = bongaConversionType.component2;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            i = bongaConversionType.component2;
        }
        return bongaConversionType.copy(i);
    }

    public final int component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 55;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = this.component2;
        int i5 = i3 + 53;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final BongaConversionType copy(int displayNameRes) {
        int i = 2 % 2;
        BongaConversionType bongaConversionType = new BongaConversionType(displayNameRes);
        int i2 = ShareDataUIState + 5;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return bongaConversionType;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = ShareDataUIState + 5;
            component3 = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(other instanceof BongaConversionType) || this.component2 != ((BongaConversionType) other).component2) {
            return false;
        }
        int i3 = component3 + 23;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 36 / 0;
        }
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 17;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(this.component2);
        if (i3 != 0) {
            int i4 = 21 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BongaConversionType(displayNameRes=" + this.component2 + ")";
        int i2 = ShareDataUIState + 63;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
