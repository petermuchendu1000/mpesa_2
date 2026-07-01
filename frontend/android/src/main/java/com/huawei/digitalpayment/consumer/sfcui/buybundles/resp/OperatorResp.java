package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0\nHÆ\u0003J[\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nHÇ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H×\u0003J\t\u0010&\u001a\u00020\bH×\u0001J\t\u0010'\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018¨\u0006("}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/OperatorResp;", "Ljava/io/Serializable;", "brandLogoUrl", "", "titleLogoUrl", "operatorName", KeysConstants.SHORT_CODE, "order", "", "packageTabs", "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/PackageTabResp;", "prices", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/PricesResp;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;)V", "getBrandLogoUrl", "()Ljava/lang/String;", "getTitleLogoUrl", "getOperatorName", "getShortCode", "getOrder", "()I", "getPackageTabs", "()Ljava/util/List;", "getPrices", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OperatorResp implements Serializable {
    public static final int $stable = 8;
    private static int ShareDataUIState = 77 % 128;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copydefault;
    private final String brandLogoUrl;
    private final String operatorName;
    private final int order;
    private final List<PackageTabResp> packageTabs;
    private final List<PricesResp> prices;
    private final String shortCode;
    private final String titleLogoUrl;

    public OperatorResp(String str, String str2, String str3, String str4, int i, List<PackageTabResp> list, List<PricesResp> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.brandLogoUrl = str;
        this.titleLogoUrl = str2;
        this.operatorName = str3;
        this.shortCode = str4;
        this.order = i;
        this.packageTabs = list;
        this.prices = list2;
    }

    public final String getBrandLogoUrl() {
        int i = 2 % 2;
        int i2 = component3 + 51;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.brandLogoUrl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getTitleLogoUrl() {
        String str;
        int i = 2 % 2;
        int i2 = component1 + 107;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            str = this.titleLogoUrl;
            int i4 = 35 / 0;
        } else {
            str = this.titleLogoUrl;
        }
        int i5 = i3 + 101;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getOperatorName() {
        int i = 2 % 2;
        int i2 = component1 + 7;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.operatorName;
        int i5 = i3 + 33;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 3 / 0;
        }
        return str;
    }

    public final String getShortCode() {
        String str;
        int i = 2 % 2;
        int i2 = component1 + 79;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            str = this.shortCode;
            int i4 = 76 / 0;
        } else {
            str = this.shortCode;
        }
        int i5 = i3 + 3;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final int getOrder() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 117;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.order;
        int i6 = i2 + 23;
        component3 = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<PackageTabResp> getPackageTabs() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 71;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        List<PackageTabResp> list = this.packageTabs;
        int i5 = i2 + 87;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<PricesResp> getPrices() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 39;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        List<PricesResp> list = this.prices;
        int i4 = i2 + 61;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    static {
        if (77 % 2 == 0) {
            int i = 40 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static OperatorResp copy$default(OperatorResp operatorResp, String str, String str2, String str3, String str4, int i, List list, List list2, int i2, Object obj) {
        String str5;
        List list3;
        int i3 = 2 % 2;
        int i4 = component1;
        int i5 = i4 + 57;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        String str6 = (i2 & 1) != 0 ? operatorResp.brandLogoUrl : str;
        String str7 = (i2 & 2) != 0 ? operatorResp.titleLogoUrl : str2;
        if ((i2 & 4) != 0) {
            int i7 = i4 + 57;
            component3 = i7 % 128;
            if (i7 % 2 == 0) {
                str5 = operatorResp.operatorName;
                int i8 = 72 / 0;
            } else {
                str5 = operatorResp.operatorName;
            }
        } else {
            str5 = str3;
        }
        String str8 = (i2 & 8) != 0 ? operatorResp.shortCode : str4;
        int i9 = (i2 & 16) != 0 ? operatorResp.order : i;
        List list4 = (i2 & 32) != 0 ? operatorResp.packageTabs : list;
        if ((i2 & 64) != 0) {
            int i10 = i4 + 79;
            component3 = i10 % 128;
            int i11 = i10 % 2;
            list3 = operatorResp.prices;
        } else {
            list3 = list2;
        }
        return operatorResp.copy(str6, str7, str5, str8, i9, list4, list3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3 + 109;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.brandLogoUrl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 105;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.titleLogoUrl;
        int i5 = i2 + 93;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component3 + 5;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.operatorName;
        int i4 = i3 + 43;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 43 / 0;
        }
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 49;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.shortCode;
        int i5 = i2 + 117;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final int component5() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 85;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.order;
        int i6 = i2 + 85;
        component1 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final List<PackageTabResp> component6() {
        int i = 2 % 2;
        int i2 = component1 + 55;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.packageTabs;
        }
        throw null;
    }

    public final List<PricesResp> component7() {
        int i = 2 % 2;
        int i2 = component3 + 45;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.prices;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final OperatorResp copy(String brandLogoUrl, String titleLogoUrl, String operatorName, String shortCode, int order, List<PackageTabResp> packageTabs, List<PricesResp> prices) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(brandLogoUrl, "");
        Intrinsics.checkNotNullParameter(titleLogoUrl, "");
        Intrinsics.checkNotNullParameter(operatorName, "");
        Intrinsics.checkNotNullParameter(shortCode, "");
        Intrinsics.checkNotNullParameter(packageTabs, "");
        Intrinsics.checkNotNullParameter(prices, "");
        OperatorResp operatorResp = new OperatorResp(brandLogoUrl, titleLogoUrl, operatorName, shortCode, order, packageTabs, prices);
        int i2 = component1 + 85;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return operatorResp;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof OperatorResp)) {
            return false;
        }
        OperatorResp operatorResp = (OperatorResp) other;
        if (!Intrinsics.areEqual(this.brandLogoUrl, operatorResp.brandLogoUrl) || (!Intrinsics.areEqual(this.titleLogoUrl, operatorResp.titleLogoUrl))) {
            return false;
        }
        if (!Intrinsics.areEqual(this.operatorName, operatorResp.operatorName)) {
            int i2 = component3 + 77;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.shortCode, operatorResp.shortCode) || this.order != operatorResp.order) {
            return false;
        }
        if (Intrinsics.areEqual(this.packageTabs, operatorResp.packageTabs)) {
            return Intrinsics.areEqual(this.prices, operatorResp.prices);
        }
        int i4 = component3 + 67;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 89;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((this.brandLogoUrl.hashCode() * 31) + this.titleLogoUrl.hashCode()) * 31) + this.operatorName.hashCode()) * 31) + this.shortCode.hashCode()) * 31) + Integer.hashCode(this.order)) * 31) + this.packageTabs.hashCode()) * 31) + this.prices.hashCode();
        int i4 = component1 + 115;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "OperatorResp(brandLogoUrl=" + this.brandLogoUrl + ", titleLogoUrl=" + this.titleLogoUrl + ", operatorName=" + this.operatorName + ", shortCode=" + this.shortCode + ", order=" + this.order + ", packageTabs=" + this.packageTabs + ", prices=" + this.prices + ")";
        int i2 = component3 + 47;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
