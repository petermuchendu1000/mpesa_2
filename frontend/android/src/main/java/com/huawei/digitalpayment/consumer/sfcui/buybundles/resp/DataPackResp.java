package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003JY\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÇ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H×\u0003J\t\u0010'\u001a\u00020\nH×\u0001J\t\u0010(\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006)"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/DataPackResp;", "Ljava/io/Serializable;", "itemId", "", "priceDisplay", "groupId", "finalPrice", "itemDesc", "itemDetailTitle", "order", "", "extPropertiesLang", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/ExtPropertiesLangResp;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/ExtPropertiesLangResp;)V", "getItemId", "()Ljava/lang/String;", "getPriceDisplay", "getGroupId", "getFinalPrice", "getItemDesc", "getItemDetailTitle", "getOrder", "()I", "getExtPropertiesLang", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/ExtPropertiesLangResp;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DataPackResp implements Serializable {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;
    private final ExtPropertiesLangResp extPropertiesLang;
    private final String finalPrice;
    private final String groupId;
    private final String itemDesc;
    private final String itemDetailTitle;
    private final String itemId;
    private final int order;
    private final String priceDisplay;

    public DataPackResp(String str, String str2, String str3, String str4, String str5, String str6, int i, ExtPropertiesLangResp extPropertiesLangResp) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(extPropertiesLangResp, "");
        this.itemId = str;
        this.priceDisplay = str2;
        this.groupId = str3;
        this.finalPrice = str4;
        this.itemDesc = str5;
        this.itemDetailTitle = str6;
        this.order = i;
        this.extPropertiesLang = extPropertiesLangResp;
    }

    public final String getItemId() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 55;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.itemId;
        int i5 = i2 + 95;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getPriceDisplay() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 29;
        int i3 = i2 % 128;
        copydefault = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.priceDisplay;
        int i4 = i3 + 21;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getGroupId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 121;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.groupId;
        }
        throw null;
    }

    public final String getFinalPrice() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 81;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.finalPrice;
        int i5 = i3 + 17;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getItemDesc() {
        int i = 2 % 2;
        int i2 = copydefault + 45;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.itemDesc;
        int i5 = i3 + 21;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getItemDetailTitle() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 87;
        int i3 = i2 % 128;
        copydefault = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.itemDetailTitle;
        int i4 = i3 + 87;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final int getOrder() {
        int i;
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 83;
        int i4 = i3 % 128;
        copydefault = i4;
        if (i3 % 2 == 0) {
            i = this.order;
            int i5 = 1 / 0;
        } else {
            i = this.order;
        }
        int i6 = i4 + 11;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 == 0) {
            return i;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ExtPropertiesLangResp getExtPropertiesLang() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 97;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ExtPropertiesLangResp extPropertiesLangResp = this.extPropertiesLang;
        if (i3 == 0) {
            int i4 = 77 / 0;
        }
        return extPropertiesLangResp;
    }

    static {
        int i = 1 + 91;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public static DataPackResp copy$default(DataPackResp dataPackResp, String str, String str2, String str3, String str4, String str5, String str6, int i, ExtPropertiesLangResp extPropertiesLangResp, int i2, Object obj) {
        String str7;
        String str8;
        String str9;
        ExtPropertiesLangResp extPropertiesLangResp2;
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            int i4 = ShareDataUIState + 121;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            str7 = dataPackResp.itemId;
        } else {
            str7 = str;
        }
        if ((i2 & 2) != 0) {
            int i6 = copydefault + 101;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            str8 = dataPackResp.priceDisplay;
        } else {
            str8 = str2;
        }
        String str10 = (i2 & 4) != 0 ? dataPackResp.groupId : str3;
        String str11 = (i2 & 8) != 0 ? dataPackResp.finalPrice : str4;
        if ((i2 & 16) != 0) {
            int i8 = ShareDataUIState + 23;
            copydefault = i8 % 128;
            if (i8 % 2 == 0) {
                String str12 = dataPackResp.itemDesc;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str9 = dataPackResp.itemDesc;
        } else {
            str9 = str5;
        }
        String str13 = (i2 & 32) != 0 ? dataPackResp.itemDetailTitle : str6;
        int i9 = (i2 & 64) != 0 ? dataPackResp.order : i;
        if ((i2 & 128) != 0) {
            int i10 = ShareDataUIState;
            int i11 = i10 + 43;
            copydefault = i11 % 128;
            int i12 = i11 % 2;
            extPropertiesLangResp2 = dataPackResp.extPropertiesLang;
            int i13 = i10 + 15;
            copydefault = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 3 / 2;
            }
        } else {
            extPropertiesLangResp2 = extPropertiesLangResp;
        }
        return dataPackResp.copy(str7, str8, str10, str11, str9, str13, i9, extPropertiesLangResp2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 53;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.itemId;
        int i5 = i3 + 113;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault + 83;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.priceDisplay;
        int i5 = i3 + 83;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 1;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.groupId;
        int i5 = i2 + 1;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 41 / 0;
        }
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = copydefault + 67;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.finalPrice;
        }
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 121;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.itemDesc;
        if (i3 == 0) {
            int i4 = 5 / 0;
        }
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 11;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.itemDetailTitle;
        int i4 = i3 + 107;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final int component7() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 61;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.order;
        int i6 = i2 + 97;
        copydefault = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 96 / 0;
        }
        return i5;
    }

    public final ExtPropertiesLangResp component8() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 103;
        int i3 = i2 % 128;
        copydefault = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        ExtPropertiesLangResp extPropertiesLangResp = this.extPropertiesLang;
        int i4 = i3 + 33;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return extPropertiesLangResp;
        }
        obj.hashCode();
        throw null;
    }

    public final DataPackResp copy(String itemId, String priceDisplay, String groupId, String finalPrice, String itemDesc, String itemDetailTitle, int order, ExtPropertiesLangResp extPropertiesLang) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(itemId, "");
        Intrinsics.checkNotNullParameter(priceDisplay, "");
        Intrinsics.checkNotNullParameter(groupId, "");
        Intrinsics.checkNotNullParameter(finalPrice, "");
        Intrinsics.checkNotNullParameter(itemDesc, "");
        Intrinsics.checkNotNullParameter(itemDetailTitle, "");
        Intrinsics.checkNotNullParameter(extPropertiesLang, "");
        DataPackResp dataPackResp = new DataPackResp(itemId, priceDisplay, groupId, finalPrice, itemDesc, itemDetailTitle, order, extPropertiesLang);
        int i2 = copydefault + 101;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return dataPackResp;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = ShareDataUIState + 121;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 43 / 0;
            }
            return true;
        }
        if (other instanceof DataPackResp) {
            DataPackResp dataPackResp = (DataPackResp) other;
            if (!Intrinsics.areEqual(this.itemId, dataPackResp.itemId)) {
                int i4 = copydefault + 9;
                int i5 = i4 % 128;
                ShareDataUIState = i5;
                int i6 = i4 % 2;
                int i7 = i5 + 3;
                copydefault = i7 % 128;
                if (i7 % 2 != 0) {
                    return false;
                }
                throw null;
            }
            if (!Intrinsics.areEqual(this.priceDisplay, dataPackResp.priceDisplay) || !Intrinsics.areEqual(this.groupId, dataPackResp.groupId) || !Intrinsics.areEqual(this.finalPrice, dataPackResp.finalPrice) || (!Intrinsics.areEqual(this.itemDesc, dataPackResp.itemDesc)) || !Intrinsics.areEqual(this.itemDetailTitle, dataPackResp.itemDetailTitle)) {
                return false;
            }
            if (this.order != dataPackResp.order) {
                int i8 = ShareDataUIState + 79;
                copydefault = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.extPropertiesLang, dataPackResp.extPropertiesLang)) {
                return true;
            }
            int i10 = copydefault + 85;
            ShareDataUIState = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 31;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((this.itemId.hashCode() * 31) + this.priceDisplay.hashCode()) * 31) + this.groupId.hashCode()) * 31) + this.finalPrice.hashCode()) * 31) + this.itemDesc.hashCode()) * 31) + this.itemDetailTitle.hashCode()) * 31) + Integer.hashCode(this.order)) * 31) + this.extPropertiesLang.hashCode();
        int i4 = copydefault + 45;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DataPackResp(itemId=" + this.itemId + ", priceDisplay=" + this.priceDisplay + ", groupId=" + this.groupId + ", finalPrice=" + this.finalPrice + ", itemDesc=" + this.itemDesc + ", itemDetailTitle=" + this.itemDetailTitle + ", order=" + this.order + ", extPropertiesLang=" + this.extPropertiesLang + ")";
        int i2 = copydefault + 125;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 69 / 0;
        }
        return str;
    }
}
