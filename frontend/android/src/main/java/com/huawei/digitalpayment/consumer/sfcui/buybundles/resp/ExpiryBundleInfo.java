package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH×\u0003J\t\u0010\u001c\u001a\u00020\u001dH×\u0001J\t\u0010\u001e\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/ExpiryBundleInfo;", "Ljava/io/Serializable;", "productId", "", "productType", "sponsorMsisdn", "beneficiaryMsisdn", "transactionType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getProductId", "()Ljava/lang/String;", "getProductType", "getSponsorMsisdn", "getBeneficiaryMsisdn", "getTransactionType", "setTransactionType", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ExpiryBundleInfo implements Serializable {
    public static final int $stable = 8;
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3;
    private final String beneficiaryMsisdn;
    private final String productId;
    private final String productType;
    private final String sponsorMsisdn;
    private String transactionType;

    public ExpiryBundleInfo(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.productId = str;
        this.productType = str2;
        this.sponsorMsisdn = str3;
        this.beneficiaryMsisdn = str4;
        this.transactionType = str5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExpiryBundleInfo(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 16) != 0) {
            int i2 = component2;
            int i3 = i2 + 15;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 63;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 / 2;
            } else {
                int i7 = 2 % 2;
            }
            str5 = BuyAirtimeTypes.SELF;
        }
        this(str, str2, str3, str4, str5);
    }

    public final String getProductId() {
        int i = 2 % 2;
        int i2 = component3 + 111;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.productId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getProductType() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 109;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.productType;
        int i5 = i2 + 93;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getSponsorMsisdn() {
        int i = 2 % 2;
        int i2 = component3 + 125;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.sponsorMsisdn;
        int i4 = i3 + 23;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getBeneficiaryMsisdn() {
        String str;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 27;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.beneficiaryMsisdn;
            int i4 = 21 / 0;
        } else {
            str = this.beneficiaryMsisdn;
        }
        int i5 = i2 + 93;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getTransactionType() {
        int i = 2 % 2;
        int i2 = component3 + 121;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.transactionType;
        }
        throw null;
    }

    public final void setTransactionType(String str) {
        int i = 2 % 2;
        int i2 = component2 + 105;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.transactionType = str;
            int i3 = 61 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.transactionType = str;
        }
        int i4 = component2 + 11;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        int i = 1 + 61;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public static ExpiryBundleInfo copy$default(ExpiryBundleInfo expiryBundleInfo, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component3 + 71;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            str = expiryBundleInfo.productId;
        }
        String str6 = str;
        if ((i & 2) != 0) {
            str2 = expiryBundleInfo.productType;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = expiryBundleInfo.sponsorMsisdn;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            int i5 = component2 + 43;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            str4 = expiryBundleInfo.beneficiaryMsisdn;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = expiryBundleInfo.transactionType;
        }
        return expiryBundleInfo.copy(str6, str7, str8, str9, str5);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 11;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.productId;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2 + 1;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.productType;
        int i5 = i3 + 97;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 83;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.sponsorMsisdn;
        int i5 = i2 + 59;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 65 / 0;
        }
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component3 + 81;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.beneficiaryMsisdn;
        int i5 = i3 + 39;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component2 + 59;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.transactionType;
        int i5 = i3 + 23;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final ExpiryBundleInfo copy(String productId, String productType, String sponsorMsisdn, String beneficiaryMsisdn, String transactionType) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(productId, "");
        Intrinsics.checkNotNullParameter(productType, "");
        Intrinsics.checkNotNullParameter(sponsorMsisdn, "");
        Intrinsics.checkNotNullParameter(beneficiaryMsisdn, "");
        Intrinsics.checkNotNullParameter(transactionType, "");
        ExpiryBundleInfo expiryBundleInfo = new ExpiryBundleInfo(productId, productType, sponsorMsisdn, beneficiaryMsisdn, transactionType);
        int i2 = component3 + 81;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return expiryBundleInfo;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 83;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            int i5 = i2 + 71;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof ExpiryBundleInfo)) {
            int i7 = i2 + 37;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        ExpiryBundleInfo expiryBundleInfo = (ExpiryBundleInfo) other;
        if (!Intrinsics.areEqual(this.productId, expiryBundleInfo.productId)) {
            int i9 = component3 + 35;
            component2 = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.productType, expiryBundleInfo.productType)) {
            int i11 = component3 + 93;
            component2 = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.sponsorMsisdn, expiryBundleInfo.sponsorMsisdn) || !Intrinsics.areEqual(this.beneficiaryMsisdn, expiryBundleInfo.beneficiaryMsisdn)) {
            return false;
        }
        if (Intrinsics.areEqual(this.transactionType, expiryBundleInfo.transactionType)) {
            return true;
        }
        int i13 = component2 + 99;
        component3 = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 62 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 71;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.productId.hashCode() * 31) + this.productType.hashCode()) * 31) + this.sponsorMsisdn.hashCode()) * 31) + this.beneficiaryMsisdn.hashCode()) * 31) + this.transactionType.hashCode();
        int i4 = component2 + 125;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 16 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ExpiryBundleInfo(productId=" + this.productId + ", productType=" + this.productType + ", sponsorMsisdn=" + this.sponsorMsisdn + ", beneficiaryMsisdn=" + this.beneficiaryMsisdn + ", transactionType=" + this.transactionType + ")";
        int i2 = component3 + 17;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
