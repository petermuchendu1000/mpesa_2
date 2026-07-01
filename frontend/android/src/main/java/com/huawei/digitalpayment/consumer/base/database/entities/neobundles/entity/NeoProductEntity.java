package com.huawei.digitalpayment.consumer.base.database.entities.neobundles.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/database/entities/neobundles/entity/NeoProductEntity;", "", "productCategory", "", "productId", "rentalFee", "productDescription", "productUnits", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getProductCategory", "()Ljava/lang/String;", "getProductId", "getRentalFee", "getProductDescription", "getProductUnits", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NeoProductEntity {
    private static int copy = 0;
    private static int getRequestBeneficiariesState = 1;
    private final String ShareDataUIState;
    private final String component1;
    private final String component2;
    private final String component3;
    private final String copydefault;

    public NeoProductEntity(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.component1 = str;
        this.copydefault = str2;
        this.component2 = str3;
        this.component3 = str4;
        this.ShareDataUIState = str5;
    }

    public final String getProductCategory() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 109;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        String str = this.component1;
        int i5 = i3 + 15;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getProductId() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 123;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        String str = this.copydefault;
        int i5 = i3 + 77;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getRentalFee() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 5;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component2;
        int i5 = i2 + 59;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 50 / 0;
        }
        return str;
    }

    public final String getProductDescription() {
        int i = 2 % 2;
        int i2 = copy + 17;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        int i5 = i3 + 3;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getProductUnits() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 1;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.ShareDataUIState;
        int i5 = i2 + 39;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static NeoProductEntity copy$default(NeoProductEntity neoProductEntity, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = neoProductEntity.component1;
        }
        String str6 = str;
        if ((i & 2) != 0) {
            str2 = neoProductEntity.copydefault;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = neoProductEntity.component2;
        }
        String str8 = str3;
        Object obj2 = null;
        if ((i & 8) != 0) {
            int i3 = getRequestBeneficiariesState + 43;
            copy = i3 % 128;
            if (i3 % 2 != 0) {
                String str9 = neoProductEntity.component3;
                throw null;
            }
            str4 = neoProductEntity.component3;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            int i4 = getRequestBeneficiariesState + 111;
            copy = i4 % 128;
            if (i4 % 2 != 0) {
                String str11 = neoProductEntity.ShareDataUIState;
                obj2.hashCode();
                throw null;
            }
            str5 = neoProductEntity.ShareDataUIState;
        }
        NeoProductEntity neoProductEntityCopy = neoProductEntity.copy(str6, str7, str8, str10, str5);
        int i5 = getRequestBeneficiariesState + 61;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            return neoProductEntityCopy;
        }
        throw null;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copy + 29;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 85;
        copy = i2 % 128;
        int i3 = i2 % 2;
        String str = this.copydefault;
        if (i3 != 0) {
            int i4 = 21 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 9;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 51;
        copy = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component3;
        int i5 = i2 + 73;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 69;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        String str = this.ShareDataUIState;
        int i5 = i3 + 113;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final NeoProductEntity copy(String productCategory, String productId, String rentalFee, String productDescription, String productUnits) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(productCategory, "");
        Intrinsics.checkNotNullParameter(productId, "");
        Intrinsics.checkNotNullParameter(rentalFee, "");
        Intrinsics.checkNotNullParameter(productDescription, "");
        Intrinsics.checkNotNullParameter(productUnits, "");
        NeoProductEntity neoProductEntity = new NeoProductEntity(productCategory, productId, rentalFee, productDescription, productUnits);
        int i2 = getRequestBeneficiariesState + 77;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            return neoProductEntity;
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
        if (!(other instanceof NeoProductEntity)) {
            int i2 = getRequestBeneficiariesState + 79;
            copy = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        NeoProductEntity neoProductEntity = (NeoProductEntity) other;
        if (!Intrinsics.areEqual(this.component1, neoProductEntity.component1)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.copydefault, neoProductEntity.copydefault)) {
            int i4 = copy + 87;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.component2, neoProductEntity.component2) || !Intrinsics.areEqual(this.component3, neoProductEntity.component3) || !Intrinsics.areEqual(this.ShareDataUIState, neoProductEntity.ShareDataUIState)) {
            return false;
        }
        int i6 = copy + 103;
        getRequestBeneficiariesState = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copy + 91;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.component1.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.component2.hashCode()) * 31) + this.component3.hashCode()) * 31) + this.ShareDataUIState.hashCode();
        int i4 = getRequestBeneficiariesState + 77;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "NeoProductEntity(productCategory=" + this.component1 + ", productId=" + this.copydefault + ", rentalFee=" + this.component2 + ", productDescription=" + this.component3 + ", productUnits=" + this.ShareDataUIState + ")";
        int i2 = getRequestBeneficiariesState + 9;
        copy = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
